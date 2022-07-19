package com.example.project_task_joona_manninen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class ItemAdapter extends BaseAdapter {

    LayoutInflater mInflater;
    String[] names;
    String[] numbers;

    public ItemAdapter (Context c, String[] grocery, String[] amount) {
        names = grocery;
        numbers = amount;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int i) {
        return names[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = mInflater.inflate(R.layout.my_listview_detail, null);
        TextView nameTextView = (TextView) v.findViewById(R.id.nameTextView4);
        TextView numberTextView = (TextView) v.findViewById(R.id.numTextView);

        String name = names[i];
        String number = numbers[i];

        nameTextView.setText(name);
        numberTextView.setText(number);

        return v;
    }
}
