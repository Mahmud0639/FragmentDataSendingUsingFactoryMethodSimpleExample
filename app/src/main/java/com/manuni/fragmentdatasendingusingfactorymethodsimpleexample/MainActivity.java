package com.manuni.fragmentdatasendingusingfactorymethodsimpleexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button sendBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendBtn = findViewById(R.id.sendBtn);

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DataReceiverFragment dataReceiverFragment = DataReceiverFragment.newInstance("This message is sent from Activity");



                getSupportFragmentManager().beginTransaction().add(R.id.fragContainer,dataReceiverFragment).commit();

            }
        });


    }
}