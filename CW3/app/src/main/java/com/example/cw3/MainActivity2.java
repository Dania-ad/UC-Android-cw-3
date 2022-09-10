package com.example.cw3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle = getIntent().getExtras(); //all data coming is now stored in bundle
        //storing the data
        String name = bundle.getString("name");
        String age = bundle.getString("age");


        TextView textname = findViewById(R.id.editTextName2);
        TextView textage = findViewById(R.id.editTextAge2);

        textname.setText(name);
        textage.setText(age);
        //Bonus
        ImageView mail = findViewById(R.id.imageMail);
        ImageView number = findViewById(R.id.imageNumber);

        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL,"Dania@Android.kw");
                startActivity(Intent.createChooser(intent,"Chooser Title"));
            }
        });

        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL,
                        Uri.fromParts("tel","234234312",null));
                startActivity(intent);
            }
        });


    }
}