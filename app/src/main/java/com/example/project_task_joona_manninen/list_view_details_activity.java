package com.example.project_task_joona_manninen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class list_view_details_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_details);
        GroceryManager gm = new GroceryManager();

        TextView groceryTextView = (TextView) findViewById(R.id.groceryTextView2);
        TextView notesTextView3 = (TextView) findViewById(R.id.notesTextView3);

        Intent in = getIntent();
        int index = in.getIntExtra("com.example.INDEX", -1);

        String note = gm.getNote(index);
        notesTextView3.setText(note);

        String name = gm.getName(index);
        groceryTextView.setText(name);


    }
}