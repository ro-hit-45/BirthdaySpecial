package com.example.birthdayspecial;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
 TextView textView;
    Button btn;
    MediaPlayer music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
     textView= findViewById(R.id.textview2);
        btn = findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String m = getIntent().getStringExtra("name");
                textView.setText(m);

                if (TextUtils.isEmpty(m)) {
                    Toast.makeText(MainActivity2.this, "Please enter your name", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                    startActivity(intent);

                }

            }
        });
    }
}