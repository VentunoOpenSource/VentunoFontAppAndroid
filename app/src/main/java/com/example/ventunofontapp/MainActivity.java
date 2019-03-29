package com.example.ventunofontapp;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    String[] letters = new String[] {
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
            "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridview);

        List<DataAdapter> allLetters = getAllItemObject();

        gridView.setAdapter(new GridDataAdapter(this, allLetters));

    }

    private List<DataAdapter> getAllItemObject()
    {

       // GridDataAdapter.ItemObject itemObject = null;

        List<DataAdapter> items = new ArrayList<>();


        generateLowerCaseLetters(items);
        generateUpperCaseLetters(items);

        return items;
    }

    private  void generateLowerCaseLetters(List<DataAdapter> items) {

        for (char c = 'a'; c <= 'z'; c++) {
            //alpha.add(c);
            items.add(new DataAdapter( String.valueOf(c)));
        }
        Log.d("Alphabets", String.valueOf(items));
    }

    private  void generateUpperCaseLetters(List<DataAdapter> items) {

        for (char c = 'A'; c <= 'Z'; c++) {
            //alpha.add(c);
            items.add(new DataAdapter( String.valueOf(c)));
        }
        Log.d("Alphabets", String.valueOf(items));
    }


}
