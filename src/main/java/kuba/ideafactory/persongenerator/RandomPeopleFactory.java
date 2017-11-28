package kuba.ideafactory.persongenerator;

import java.util.List;
import java.util.Random;

public class RandomPeopleFactory {
    private final Random generator = new Random();
    private final List<String> surnames;
    private final List<String> names;
    private final List<String> domains;

    public RandomPeopleFactory(List<String> surnames, List<String> names, List<String> domains) {
        this.surnames = surnames;
        this.names = names;
        this.domains = domains;
    }

    public Person randomPerson() {
        String surname = surnames.get(generator.nextInt(surnames.size()));
        String name = names.get(generator.nextInt(names.size()));
        String domain = domains.get(generator.nextInt(domains.size()));
        String email = surname.toLowerCase() + "." + name.toLowerCase() + generator.nextInt(99) + "@" + domain;

        return new Person(name, surname, email);
    }
}
