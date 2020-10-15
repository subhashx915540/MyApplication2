package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    ListView listView;

	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                listView = findViewById(R.id.list);

                final ArrayList<String> fruits = new ArrayList <>();

               fruits.add("Apples");
                fruits.add("Apricots");
                fruits.add("Bananas");
                fruits.add("Blackberry");
                fruits.add("Blueberry");
                fruits.add("Cherries");
                fruits.add("Cranberry");
                fruits.add("Sugar-apple");
                fruits.add("Pitaya");
                fruits.add("Common fig");
                fruits.add("Cranberry");
                fruits.add("Jackfruit");
                fruits.add("Mangos");
                fruits.add("Papayas");
                fruits.add("Guava");
                fruits.add("Jackfruit");
                fruits.add("Orange");
                fruits.add("Papaya");
                fruits.add("Pear");
                fruits.add("Pineapple");

        	        ArrayAdapter<String> adapter = new ArrayAdapter <String>(this,
                	                R.layout.support_simple_spinner_dropdown_item,fruits);
        	        listView.setAdapter(adapter);

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
	            @Override
	            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {
                               Toast.makeText(getApplicationContext(),"you selected "+
                                                fruits.get(position),Toast.LENGTH_SHORT).show();
                	            }
	        });
        	    }
	}
