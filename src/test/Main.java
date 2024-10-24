package test;

import examples.Person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Steven");
        names.add("Helen");
        names.add("Edvard");
        names.add("Andrei");
        names.add("Donald");

        ArrayList<Integer> digits = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            digits.add(i);
        }

        ArrayList<String> namesDigit = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            namesDigit.add(digits.get(i) + " - " + names.get(i));
            System.out.println(namesDigit.get(i));
        }

    }
}
