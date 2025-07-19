package org.example;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Builder
@ToString
public final class PragraUser {
    private final String firstName;
    private final String lastName;
    private final List<String> phoneNumbers;

    public PragraUser(String firstName, String lastName, List<String> phoneNumbers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PragraUser that = (PragraUser) o;
        return Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(phoneNumbers, that.phoneNumbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, phoneNumbers);
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<String> getPhoneNumbers() {
        return new ArrayList<>(phoneNumbers);
    }
}
