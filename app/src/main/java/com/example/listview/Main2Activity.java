package com.example.listview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    ImageView imageView;

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageView = findViewById(R.id.img);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Bundle bundle = getIntent().getExtras();

        if(bundle!=null){

            String s = bundle.getString("ss");



            if(s.equals("Android App")){
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.bb);
                imageView.setImageBitmap(bitmap);

            }
            else if(s.equals("Computer Graphics")){
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.download);
                imageView.setImageBitmap(bitmap);
            }
            else if(s.equals("Compiler Design")){
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.download);
                imageView.setImageBitmap(bitmap);
            }
            else if(s.equals("Computer Peripherals and Interfacing")){
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.download);
                imageView.setImageBitmap(bitmap);
            }
            else if(s.equals("Digital Signal Processing")){
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.download);
                imageView.setImageBitmap(bitmap);
            }
            else if(s.equals("Software Engneering")){
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.download);
                imageView.setImageBitmap(bitmap);
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()== R.id.shareid)
        {
            Intent intent=new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String subject="Quesstion App";
            String body="tension free exam app";
            intent.putExtra(Intent.EXTRA_SUBJECT,subject);
            intent.putExtra(Intent.EXTRA_TEXT,body);
            startActivity(Intent.createChooser(intent,"Share with"));

        }
        if(item.getItemId()==android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }




}
