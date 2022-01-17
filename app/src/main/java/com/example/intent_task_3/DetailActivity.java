package com.example.intent_task_3;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        initView();
    }

    private void initView(){
        TextView tv_detail = findViewById(R.id.tV_detail);
        User user = (User) getIntent().getParcelableExtra("Object");
        tv_detail.setText(user.toString());
    }
}
