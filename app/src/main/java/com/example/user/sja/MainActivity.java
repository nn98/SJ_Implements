package com.example.user.sja;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.text.Layout;
        import android.view.View;
        import android.widget.Button;
        import android.widget.LinearLayout;
        import android.widget.RelativeLayout;
        import android.widget.TextView;

        import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int i=42;
    Button btn_6202;
    Button popup;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_6202=(Button)findViewById(R.id.btn_6202);
        btn_6202.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent=new Intent(MainActivity.this, secondActivity.class);
                intent.putExtra("Testing", String.valueOf(btn_6202.getText()));
                startActivity(intent);
            }
        });
        popup=(Button)findViewById(R.id.btn_popup);
        popup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                //전송할 값들 인텐트에 삽입. 일단 없이
                //실행메소드
                startActivityForResult(intent, 1);
            }
        });

        LinearLayout parent_layout = (LinearLayout)findViewById(R.id.parent_layout);
        LinearLayout layout = (LinearLayout)findViewById(R.id.createlayout);
        layout.setOrientation(LinearLayout.VERTICAL);
        //layout.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL);

        LinearLayout layout2 = new LinearLayout(this);
        layout2.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout layout3 = new LinearLayout(this);
        layout3.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout layout4 = new LinearLayout(this);
        layout4.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout layout5 = new LinearLayout(this);
        layout5.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout layout6 = new LinearLayout(this);
        layout6.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout layout7 = new LinearLayout(this);
        layout7.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout layout8 = new LinearLayout(this);
        layout8.setOrientation(LinearLayout.HORIZONTAL);

        for (; i > 36; i--) {
            Button b = new Button(this);
            b.setText("" + i);
            b.setId(i);
            b.setTextSize(10);
            b.setLayoutParams(new LinearLayout.LayoutParams(80, 80));
            layout8.addView(b);
            if(i%2==1) {
                TextView t=new TextView((this));
                t.setText("   ");
                layout8.addView(t);
            }
        }
        for (; i > 30; i--) {
            Button b = new Button(this);
            b.setText("" + i);
            b.setId(i);
            b.setTextSize(10);
            b.setLayoutParams(new LinearLayout.LayoutParams(80, 80));
            layout7.addView(b);
            if(i%2==1) {
                TextView t=new TextView((this));
                t.setText("   ");
                layout7.addView(t);
            }
        }
        for (; i > 24; i--) {
            Button b = new Button(this);
            b.setText("" + i);
            b.setId(i);
            b.setTextSize(10);
            b.setLayoutParams(new LinearLayout.LayoutParams(80, 80));
            layout6.addView(b);
            if(i%2==1) {
                TextView t=new TextView((this));
                t.setText("   ");
                layout6.addView(t);
            }
        }
        for (; i > 18; i--) {
            Button b = new Button(this);
            b.setText("" + i);
            b.setId(i);
            b.setTextSize(10);
            b.setLayoutParams(new LinearLayout.LayoutParams(80, 80));
            layout5.addView(b);
            if(i%2==1) {
                TextView t=new TextView((this));
                t.setText("   ");
                layout5.addView(t);
            }
        }
        for (; i > 12; i--) {
            Button b = new Button(this);
            b.setText("" + i);
            b.setId(i);
            b.setTextSize(10);
            b.setLayoutParams(new LinearLayout.LayoutParams(80, 80));
            layout4.addView(b);
            if(i%2==1) {
                TextView t=new TextView((this));
                t.setText("   ");
                layout4.addView(t);
            }
        }
        for (; i > 6; i--) {
            Button b = new Button(this);
            b.setText("" + i);
            b.setId(i);
            b.setTextSize(10);
            b.setLayoutParams(new LinearLayout.LayoutParams(80, 80));
            layout3.addView(b);
            if(i%2==1) {
                TextView t=new TextView((this));
                t.setText("   ");
                layout3.addView(t);
            }
        }
        for (; i > 0; i--) {
            Button b = new Button(this);
            b.setText("" + i);
            b.setId(i);
            b.setTextSize(10);
            b.setLayoutParams(new LinearLayout.LayoutParams(80, 80));
            layout2.addView(b);
            if(i%2==1) {
                TextView t=new TextView((this));
                t.setText("   ");
                layout2.addView(t);
            }
        }

        layout.addView(layout2);
        layout.addView(layout3);
        layout.addView(layout4);
        layout.addView(layout5);
        layout.addView(layout6);
        layout.addView(layout7);
        layout.addView(layout8);
        setContentView(parent_layout);
    }

}

