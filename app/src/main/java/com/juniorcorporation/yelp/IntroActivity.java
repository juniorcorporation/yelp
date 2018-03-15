package com.juniorcorporation.yelp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        Button btnnew = findViewById(R.id.btnnew);
        btnnew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IntroActivity.this, RegisterActivity.class);
                startActivity(i);

            }
        });
    }
    public void onLogin(View view){
        Intent intent= new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(intent);
    }
}
