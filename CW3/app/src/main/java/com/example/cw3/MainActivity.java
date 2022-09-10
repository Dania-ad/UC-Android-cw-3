package com.example.cw3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText textname = findViewById(R.id.editTextName);
        EditText textAge = findViewById(R.id.editTextAge);

        Button next = findViewById(R.id.buttonNext);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = textname.getText().toString();
                String b = textAge.getText().toString();

                //inside (form.this+to.class)
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("name",a); //(key, thing i want to send)
                intent.putExtra("age",b); //(key, thing i want to send)

                //If both editTexts are empty, the program will not go to the next page
                if(a.isEmpty()!=true || b.isEmpty()!=true)
                    startActivity(intent); //to go to the dest



            }
        });

    }
}