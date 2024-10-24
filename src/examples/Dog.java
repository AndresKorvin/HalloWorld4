package examples;

public class Dog {
    String name;
    String breed;
    double weight;
    int speed;

    public String getInfo() {
        return "name: " + name + ", breed: " + breed + ", weight: " + weight;
    }

    void run() {

        for (int j = 0; j < speed; j++) {
            System.out.println("Бегу!");
        }
    }
}
