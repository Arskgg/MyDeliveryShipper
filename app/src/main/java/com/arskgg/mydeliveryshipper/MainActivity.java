package com.arskgg.mydeliveryshipper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText phoneEdt, passwordEdt;
    Button signInBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phoneEdt = findViewById(R.id.edtPhone);
        passwordEdt = findViewById(R.id);
    }
}
