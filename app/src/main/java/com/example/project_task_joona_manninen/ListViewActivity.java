package com.example.project_task_joona_manninen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

// Joona Manninen 19.7.2022 courseproject for course Software Development Skills: Mobile 2021-22

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        GroceryManager gm = new GroceryManager();



        Intent in = getIntent();
        ArrayList<String> namelist = in.getStringArrayListExtra("com.example.ARRAY_LIST");
        ArrayList<String> amountlist = in.getStringArrayListExtra("com.example.ARRAY_LIST2");
        ListView listView = (ListView) findViewById(R.id.listView);

        // Changing arraylists to arrays so we can use BaseAdapter
        ItemAdapter itemAdapter = new ItemAdapter(this, namelist.toArray(new String[0]), amountlist.toArray(new String[0]));
        listView.setAdapter(itemAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent showDetailsActivity = new Intent(getApplicationContext(),list_view_details_activity.class);
                // Check if there is notes in that entry before opening notes.
                boolean bool = gm.checkNotes(i);
                if(bool){
                    showDetailsActivity.putExtra("com.example.INDEX",i);
                    startActivity(showDetailsActivity);
                } else{
                    Toast.makeText(ListViewActivity.this, "No notes to show", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}