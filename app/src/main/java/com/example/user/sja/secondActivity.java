package com.example.user.sja;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {
    Button re;
    TextView ct;
    Button[] btns;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.class_6202);
        Intent intent=new Intent(this.getIntent());
        String s=intent.getStringExtra("Testing");
        final TextView textView=(TextView)findViewById(R.id.Test);
        textView.setText(s);
        Button re=(Button)findViewById(R.id.re);
        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent=new Intent(secondActivity.this, MainActivity.class);
                intent.putExtra("Testing", String.valueOf(textView.getText()));
                startActivity(intent);
            }
        });
        ct=(TextView)findViewById(R.id.ClickTest);
        btns=new Button[6];
        btns[0]=(Button)findViewById(R.id.btn1);
        btns[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ct.setText("Button "+(++i)+"Clicked.");
            }
        });
        btns[1]=(Button)findViewById(R.id.btn2);
        btns[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ct.setText("Button "+(++i)+"Clicked.");
            }
        });
        btns[2]=(Button)findViewById(R.id.btn3);
        btns[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ct.setText("Button "+(++i)+"Clicked.");
            }
        });
        btns[3]=(Button)findViewById(R.id.btn4);
        btns[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ct.setText("Button "+(++i)+"Clicked.");
            }
        });
        btns[4]=(Button)findViewById(R.id.btn5);
        btns[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ct.setText("Button "+(++i)+"Clicked.");
            }
        });
        btns[5]=(Button)findViewById(R.id.btn6);
        btns[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ct.setText("Button "+(++i)+"Clicked.");
            }
        });
        /*
        //for문 사용한 온클릭리스너 선언은 불가?
        for(i=0;i<btns.length;i++) {    //i를 for문 내부에서 선언하면 에러 발생.
            btns[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ct.setText("Button "+(i+1)+"Clicked.");
                }
            });
        }
         */
    }
}
