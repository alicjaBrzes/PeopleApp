package main.java.app.persistence.model;

import main.java.app.persistence.model.type.UserType;

public class Person {

    String userName;
    String userSurname;
    int userAge;
    UserType userType;

    public Person(String userName, String userSurname, int userAge, UserType userType) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.userAge = userAge;
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public int getUserAge() {
        return userAge;
    }

    public UserType getUserType() {
        return userType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (userAge != person.userAge) return false;
        if (userName != null ? !userName.equals(person.userName) : person.userName != null) return false;
        if (userSurname != null ? !userSurname.equals(person.userSurname) : person.userSurname != null) return false;
        return userType == person.userType;
    }

    @Override
    public int hashCode() {
        int result = userName != null ? userName.hashCode() : 0;
        result = 31 * result + (userSurname != null ? userSurname.hashCode() : 0);
        result = 31 * result + userAge;
        result = 31 * result + (userType != null ? userType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "NAME: %s, SURNAME: %s, AGE: %d, USER TYPE: %s".formatted(
                userName,
                userSurname,
                userAge,
                userType
        );
    }
}
