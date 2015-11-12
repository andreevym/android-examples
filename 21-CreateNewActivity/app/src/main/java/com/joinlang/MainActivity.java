package com.joinlang;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    Button btnOtherActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOtherActivity = (Button) findViewById(R.id.btnOtherActivity);
        btnOtherActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnOtherActivity:
                Intent intent = new Intent(this, OtherActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}