package jdbc;

import java.sql.*;

public class SandBox {

   static {
       try{Class.forName("org.sqlite.JDBC");
       } catch (ClassNotFoundException e){
           e.printStackTrace();
           System.exit(1);
       }
   }

    private static Connection connection;
    private static Statement statement;
    private static PreparedStatement preparedStatement;

    public static void main(String[] args) {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:database.db");
            statement = connection.createStatement();
            performDeleteTable("cat");
            performCreateTable();
            populateDatabaseWithPrepareStatment();
            readCatsFromDatabase();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }

    public static void performDeleteTable(String tableName) throws SQLException {
        statement.executeUpdate("DROP TABLE IF EXISTS " + tableName);
    }

    public static void performCreateTable() throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS cat (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, weight DOUBLE)");
    }


    /*
    public static void populateDatabase() throws SQLException {
        // с вкл. автокоммитом
        long start = System.currentTimeMillis();
        for (int i = 1; i < 10_001; i++) {
            double  avg = Math.random();
            String query = String.format("INSERT INTO cat (name, weight) VALUES ('kitty #%d', '%2.2f')", i, Double.valueOf(5 - avg));
            statement.executeUpdate(query);
        }
        System.out.println(System.currentTimeMillis() - start);
    }
*/

    public static void populateDatabaseWithPrepareStatment() throws SQLException {
        long start = System.currentTimeMillis();
        preparedStatement = connection.prepareStatement("INSERT INTO cat (name, weight) VALUES (?, ?)");
        for (int i = 1; i < 15; i++) {
            double  weight = 5 - Math.random();
            preparedStatement.setString(1, "kitty#" + i);
            preparedStatement.setDouble(2, weight);
            preparedStatement.addBatch();
        }
        preparedStatement.executeBatch();
        System.out.println(System.currentTimeMillis() - start);
    }

    public static void readCatsFromDatabase() throws SQLException {
        ResultSet resultSet = statement.executeQuery("SELECT * FROM cat WHERE weight < 4.1");
        while (resultSet.next()) {
            String name = resultSet.getString(1);
            Double weight = resultSet.getDouble(2);
            System.out.println(name + " has weight = " + weight);
        }
    }


}
