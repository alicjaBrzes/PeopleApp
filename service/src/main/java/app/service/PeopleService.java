package main.java.app.service;
import main.java.app.persistence.model.Person;
import main.java.app.persistence.model.type.UserType;

import java.util.Comparator;
import java.util.List;

public class PeopleService {
    List<Person> peopleList;

    public PeopleService() {
        this.peopleList = List.of(new Person("A", "A", 22, UserType.REGULAR),
                new Person("B", "B", 28, UserType.NEW),
                new Person("C", "C", 35, UserType.PRO),
                new Person("D", "D", 41, UserType.PRO),
                new Person("E", "E", 52, UserType.REGULAR),
                new Person("F", "F", 19, UserType.NEW));
    }

    @Override
    public String toString() {
        return "USERS LIST: "+ peopleList;
    }

    public void addUser(Person person) {
        if (person == null) {
            throw new IllegalArgumentException("Person object is null");
        };
        peopleList.add(person);
    }

    public void deleteUser(Person person) {
        if (person == null) {
            throw new IllegalArgumentException("Person object is null");
        };
        peopleList.remove(person);
    }

    public List<Person> sortUsersByAge() {
        return peopleList
                .stream()
                .sorted(Comparator.comparing(Person::getUserAge))
                .toList();
    }

    public List<Person> getUsersByType(UserType userType) {
        if (userType == null) {
            throw new IllegalArgumentException("User type is null");
        }

        return switch (userType) {
            case NEW -> peopleList
                    .stream()
                    .filter(UserType.NEW)
                    .toList();

            case REGULAR -> peopleList
                    .stream()
                    .filter(UserType.REGULAR)
                    .toList();

            case PRO -> peopleList
                    .stream()
                    .filter(UserType.PRO)
                    .toList();
        };

    }

}
