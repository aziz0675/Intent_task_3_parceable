package com.example.intent_task_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            initView();
    }
    private void initView(){

        Button b_main = findViewById(R.id.b_main);
        b_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User user = new User(22, "Aziz");
                openDetail(user);
            }
        });
    }

    private void openDetail(User user){
        Intent intent = new Intent(this,DetailActivity.class);
        intent.putExtra("Object",user);
        startActivity(intent);
    }
}