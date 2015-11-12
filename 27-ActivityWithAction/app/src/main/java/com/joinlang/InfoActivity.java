package com.joinlang;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

import com.joinlang.R;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InfoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        // Получаем Intent, который вызывал это активити
        Intent intent = getIntent();
        // читаем из него action
        String action = intent.getAction();

        String format = "";
        String textInfo = "";

        // В зависимости от action заполняем переменные
        if(action.equals("com.joinlang.intent.action.showTime")) {
            format = "HH:mm:ss";
            textInfo = "Time: ";
        } else  if(action.equals("com.joinlang.intent.action.showDate")) {
            format = "dd.MM.yyyy";
            textInfo = "Date: ";
        }

        // в зависимости от содержимого переменной format
        // получаем дату или время в переменную datetime
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        String dateTime = simpleDateFormat.format(new Date(System.currentTimeMillis()));

        TextView textView = (TextView) findViewById(R.id.tvInfo);
        textView.setText(textInfo + dateTime);
    }

}