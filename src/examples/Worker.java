package examples;

public class Worker {

    String name;
    String function;
    int salary;

    Worker (String name, String function, int salary) {
        this.name = name;
        this.function = function;
        this.salary = salary;
    }

    void showInfo() {
        System.out.println("name: " + name + "\nfunction: " + function + "\nsalary: " + salary);
    }

}
