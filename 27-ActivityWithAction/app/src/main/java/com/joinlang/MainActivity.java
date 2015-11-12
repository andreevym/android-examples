package com.joinlang;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnShowTime = (Button) findViewById(R.id.btnShowTime);
        Button btnShowDate = (Button) findViewById(R.id.btnShowDate);

        btnShowTime.setOnClickListener(this);
        btnShowDate.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btnShowTime:
                intent = new Intent("com.joinlang.intent.action.showTime");
                startActivity(intent);
                break;
            case R.id.btnShowDate:
                intent = new Intent("com.joinlang.intent.action.showDate");
                startActivity(intent);
                break;
        }
    }
}