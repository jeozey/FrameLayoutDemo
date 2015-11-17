package com.jeo.framelayoutdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //加此代码,可阻止系统往下传递点击事件
        findViewById(R.id.layout2).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });
    }

    @Override
    public void onClick(View v) {
        Button btn = (Button)v;
        Toast.makeText(getBaseContext(),""+((Button) v).getText(),1).show();

        switch (v.getId()){
            case R.id.btn1:
                findViewById(R.id.layout2).setVisibility(View.VISIBLE);
                break;
            case R.id.btn2:
                findViewById(R.id.layout2).setVisibility(View.GONE);
                break;
            default:
                break;
        }
    }
}
