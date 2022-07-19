package com.example.project_task_joona_manninen;


import java.util.ArrayList;

// Joona Manninen 19.7.2022 courseproject for course Software Development Skills: Mobile 2021-22

public class GroceryManager {

    // list where grocerylist objects are stored
    private static ArrayList<Grocerylist> gList = new ArrayList<>();
    // Object so we can access GroceryList class methods
    private Grocerylist grocerylist = (Grocerylist) new Grocerylist();


    public GroceryManager() {}

    public void addGrocery(String name, String notes, String number){
        Grocerylist gl = new Grocerylist(name, notes, number);
        gList.add(gl);
        return;
    }


    public ArrayList<String> nameList(){
        // namelist where all added grocery names are added.
        ArrayList<String> namelist = new ArrayList<>();
        for (int i = 0; i < gList.size(); i++){
            grocerylist = gList.get(i);
            namelist.add(grocerylist.getName());
        }
        System.out.println(gList.size());

        return namelist;
    }


    public ArrayList<String> numberList(){
        // number where all added grocery names are added.
        ArrayList<String> numberlist = new ArrayList<>();
        for (int i = 0; i < gList.size(); i++){
            grocerylist = gList.get(i);
            numberlist.add(grocerylist.getNumber());
        }
        System.out.println(gList.size());

        return numberlist;
    }

    public boolean checkNotes(int i){
        // Checking if there is notes in that entry
        grocerylist = gList.get(i);
        String notes = grocerylist.getNotes();
        if (notes.isEmpty()){
            return false;
        } else {
            return true;
        }
    }

    public String getNote(int index){
        grocerylist = gList.get(index);
        String notes = grocerylist.getNotes();
        return notes;
    }

    public String getName(int index){
        grocerylist = gList.get(index);
        String notes = grocerylist.getName();
        return notes;
    }

    public void emptyList(){
        gList.clear();
        return;
    }

}
