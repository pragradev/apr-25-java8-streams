package org.example;

import java.util.Objects;

public class RBCEmployee {
    private String firstName;

    public RBCEmployee(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "RBCEmployee{" +
                "firstName='" + firstName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RBCEmployee that = (RBCEmployee) o;
        return Objects.equals(firstName, that.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
