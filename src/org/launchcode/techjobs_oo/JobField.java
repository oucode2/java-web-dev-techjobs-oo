package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    public JobField (String aValue) {

        value = aValue;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }

    public String getValue() {
        return value;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void setNextId(int nextId) {
        JobField.nextId = nextId;
    }

    public void setValue(String value) {
        this.value = value;
    }
    //void
    //void
    //void
}
