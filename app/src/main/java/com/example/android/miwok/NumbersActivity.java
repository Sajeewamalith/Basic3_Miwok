package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create an array of words
        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("Two");
        words.add("Three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");



        Log.v("NumbersActivity","Word at index 0: "+ words.get(0));
        Log.v("NumbersActivity","Word at index 1: "+ words.get(1));
    }
}