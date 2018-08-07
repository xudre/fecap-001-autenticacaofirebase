package com.xudre.autenticaoviafirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button _gmail;
    private Button _facebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Setup();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_gmail:
                AuthGmail();
                break;
            case R.id.button_facebook:
                AuthFacebook();
                break;
        }
    }

    private void Setup() {
        _gmail = findViewById(R.id.button_gmail);
        _facebook = findViewById(R.id.button_facebook);

        _gmail.setOnClickListener(this);
        _facebook.setOnClickListener(this);
    }

    private void AuthGmail() {

    }

    private void AuthFacebook() {

    }
}
