package main.java.app.persistence.model.type;

import main.java.app.persistence.model.Person;

import java.util.function.Predicate;

public enum UserType implements Predicate<Person> {
    NEW, REGULAR, PRO;

    @Override
    public boolean test(Person person) {
        return false;
    }
}
