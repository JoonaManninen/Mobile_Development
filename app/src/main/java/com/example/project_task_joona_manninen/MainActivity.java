package com.example.project_task_joona_manninen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Grocery manager object so we can interact with that class
        GroceryManager gm = new GroceryManager();

        // Declaring all the components so we can use them in our code.
        EditText groceryEditText = (EditText) findViewById(R.id.groceryEditText);
        EditText noteEditText = (EditText) findViewById(R.id.noteEditText);
        EditText numberEditText = (EditText) findViewById(R.id.numberEditText);
        Button addBtn = (Button) findViewById(R.id.addBtn);
        Button seeBtn = (Button) findViewById(R.id.seeBtn);
        Button emptyBtn = (Button) findViewById(R.id.emptyBtn);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = groceryEditText.getText().toString();
                String notes = noteEditText.getText().toString();
                String number = numberEditText.getText().toString();
                groceryEditText.setText("");
                noteEditText.setText("");
                numberEditText.setText("");
                if (name.isEmpty()){}
                else {
                    gm.addGrocery(name,notes,number);
                }
            }
        });

        seeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent showListViewActivity = new Intent(getApplicationContext(), ListViewActivity.class);

                // Getting list where all grocery names and amount to make listview
                ArrayList<String> grocerylist = gm.nameList();
                ArrayList<String> amountlist = gm.numberList();

                showListViewActivity.putExtra("com.example.ARRAY_LIST", grocerylist);
                showListViewActivity.putExtra("com.example.ARRAY_LIST2", amountlist);

                startActivity(showListViewActivity);
            }
        });

        emptyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gm.emptyList();
            }
        });


    }
}