package kuba.ideafactory.persongenerator;

public class Person {
    private final String name;
    private String surname;
    private String email;

    public String getSurname() {
        return this.surname;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public Person(String Name, String Surname, String Email) {
        this.surname = Surname;
        if(!this.surname.matches("[a-zA-Z ]+")){
            throw new IllegalArgumentException("Wrong Surame "+ Surname);
        }
        this.name = Name;
        if(!this.name.matches("[a-zA-Z ]+")){
            throw new IllegalArgumentException("Wrong Name "+ Name);
        }
        this.email = Email;
        if(!this.email.matches("[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
            throw new IllegalArgumentException("Wrong mail "+ email);
        }
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + email;
    }
}
