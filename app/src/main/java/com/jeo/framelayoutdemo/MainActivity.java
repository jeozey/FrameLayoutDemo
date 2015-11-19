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
