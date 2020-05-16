package org.launchcode.techjobs_oo;

public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    public JobField (int aId, int aNextId, String aValue) {
        id = aId;
        nextId = aNextId;
        value = aValue;
    }

    @Override
    public String toString() {
        return value;
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
