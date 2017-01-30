package com.example.android.csit551_w2_demo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.tv_1_act1);
        button=(Button)findViewById(R.id.btn_act1);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                textView.setText("Some other text");
            }
        });
    }


}
