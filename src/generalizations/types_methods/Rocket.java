package generalizations.types_methods;

public class Rocket implements Comparable<Rocket> {

    public static void main(String[] args) {
        Rocket rocket1 = new Rocket(10, 2000, 15);
        Rocket rocket2 = new Rocket(12, 3000, 23);
        int result = rocket1.compareTo(rocket2);
        System.out.println(result);
    }

    int length;
    int maxHeight;
    int weight;

    public Rocket(int length, int maxHeight, int weight) {
        this.length = length;
        this.maxHeight = maxHeight;
        this.weight = weight;
    }

    @Override
    public int compareTo(Rocket rocket) {
        if (maxHeight == rocket.maxHeight) {
            return 0;
        } else if (maxHeight > rocket.maxHeight) {
            return 1;
        } else {
            return -1;
        }
    }
}
