package com.android.pjott.multiacttestappandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends Activity {

    public static final String PASSED_MESSAGE = "init";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        Intent intent = getIntent();
        String messageFromIntent = intent.getStringExtra(PASSED_MESSAGE);
        TextView messageView = (TextView) findViewById(R.id.message);
        messageView.setText(messageFromIntent);
    }
}
