package com.example.project_task_joona_manninen;

public class Grocerylist {

    private String name;
    private String notes;
    private String number;

    public Grocerylist(){

    }

    public Grocerylist(String name1, String notes1, String number1) {
        this.name = name1;
        this.notes = notes1;
        this.number = number1;
    }

    public String getName() {
        return name;
    }

    public String getNotes() {
        return notes;
    }

    public String getNumber() {
        return number;
    }
}


