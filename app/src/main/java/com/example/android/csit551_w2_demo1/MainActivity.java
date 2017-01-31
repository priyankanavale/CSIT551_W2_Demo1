package com.example.android.csit551_w2_demo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.android.csit551_w2_demo1.R.id.textView;

public class MainActivity extends AppCompatActivity {

    private TextView textView1;
    private TextView textView2;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView) findViewById(R.id.tv_1_act1);
        textView2 = (TextView) findViewById(R.id.tv_2_act2);
        findViewById(R.id.btn1_act1).setOnClickListener(new MyLsnr());
        findViewById(R.id.btn2_act2).setOnClickListener(new MyLsnr());
        /*button=(Button)findViewById(R.id.btn_act1);
        button.setOnClickListener(new MyLsnr());*/
       /* button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                textView.setText("Some other text");
            }
        });*/
    }

    public void mOnClick(View view) {
        textView2.setText("Second Text");
    }

    class MyLsnr implements View.OnClickListener{

        @Override
        public  void onClick(View view){
            if(view.getId()==R.id.btn1_act1)
                textView1.setText("New Text 1");
            else if(view.getId()==R.id.btn2_act2)
                textView2.setText("New Text 2");
        }
    }


}
