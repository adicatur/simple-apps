package com.example.carles.simpleapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editTextEmail, editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         button = (Button) findViewById(R.id.btn_login);
         editTextEmail = (EditText) findViewById(R.id.email);
         editTextPassword = (EditText) findViewById(R.id.password);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = editTextEmail.getText().toString();
                Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                intent.putExtra("nama",nama);
                startActivity(intent);

            }
        });
    }
}
