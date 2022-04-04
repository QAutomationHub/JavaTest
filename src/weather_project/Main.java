package weather_project;

import weather_project.view.IUserInterface;
import weather_project.view.UserInterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    static {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + GlobalState.getInstance().DB_NAME);
        GlobalState.getInstance().setConnection(connection);
        IUserInterface userInterface = new UserInterface();
        userInterface.showUI();

    }

}
