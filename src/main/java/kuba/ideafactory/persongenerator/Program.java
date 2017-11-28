package kuba.ideafactory.persongenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String args[]) {
        List<String> names = new ArrayList<>();
        List<String> surnames = new ArrayList<>();
        List<String> domain = new ArrayList<>();

        names.addAll(Arrays.asList("Jakub", "Pawel", "Damian", "Karol", "Donald", "Kalafior", "Maurycy", "Kamil", "Anastazy", "Adam", "Jaroslaw"));
        surnames.addAll(Arrays.asList("Ziarko", "Zeller", "Kowalski", "Jarosz", "Zygmunt", "Gajecki", "Sledz", "Pietruszka", "Gostynski", "Burak", "Wrobel"));
        domain.addAll(Arrays.asList("gmail.com", "wp.pl", "o2.pl", "onet.pl", "gazeta.pl"));

        RandomPeopleFactory factory = new RandomPeopleFactory(names, surnames, domain);
        try {
            for (int i = 0; i < 10000; i++) {
                System.out.println(factory.randomPerson());
            }
        }
        catch(IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            System.exit(0);
        }
    }
}
