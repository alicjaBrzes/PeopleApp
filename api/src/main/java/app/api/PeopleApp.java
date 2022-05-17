package main.java.app.api;

import main.java.app.persistence.model.Person;
import main.java.app.persistence.model.type.UserType;
import main.java.app.service.PeopleService;

public class PeopleApp {
    public static void main(String[] args) {
        try {
            PeopleService peopleService = new PeopleService();
            System.out.println(peopleService);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
