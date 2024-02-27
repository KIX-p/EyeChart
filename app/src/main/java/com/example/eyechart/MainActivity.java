package com.example.eyechart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button plus = findViewById(R.id.plus);
        List<TextView> textViewsList = new ArrayList<>();
        textViewsList.add(findViewById(R.id.one));
        textViewsList.add(findViewById(R.id.two));
        textViewsList.add(findViewById(R.id.three));
        textViewsList.add(findViewById(R.id.four));
        textViewsList.add(findViewById(R.id.five));

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(TextView textView: textViewsList){
                        float size = textView.getTextSize();
                        textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, size+5);
                }
            }
        });

        Button minus = findViewById(R.id.minus);

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(TextView textView: textViewsList){
                    float size = textView.getTextSize();
                    textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, size-5);
                }
            }
        });
    }
}