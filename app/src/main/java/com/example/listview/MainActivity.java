package com.example.listview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    SearchView se;
   // Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listviewId);
        Bundle bundle = getIntent().getExtras();

            final String[] subjects = getResources().getStringArray(R.array.Subject_Title);

            ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, R.layout.sample_view, R.id.txtId, subjects);
            listView.setAdapter(adapter);

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);


            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                   Intent intent = new Intent(MainActivity.this, Main2Activity.class);

                    if (position == 0) {
                        intent.putExtra("ss", "Android APP");
                    } else if (position == 1) {
                        intent.putExtra("ss", "Computer Graphics");
                    }else if (position == 2) {
                        intent.putExtra("ss", "Compiler Design");
                    }
                    else if (position == 3) {
                        intent.putExtra("ss", "Computer Peripherals and Interfacing");
                    }else if (position == 4) {
                        intent.putExtra("ss", "Digital Signal Processing");
                    }
                    else if (position == 5) {
                        intent.putExtra("ss", "Software Engneering");
                    }


                    startActivity(intent);
                    //String value = subjects[position];
                   // Toast.makeText(MainActivity.this, value, Toast.LENGTH_SHORT).show();

                }
            });


        }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}


