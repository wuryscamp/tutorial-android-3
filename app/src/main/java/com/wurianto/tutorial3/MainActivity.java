package com.wurianto.tutorial3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUsername, editTextPassword;
    private TextView textViewResult;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsername = (EditText) findViewById(R.id.et_username);
        editTextPassword = (EditText) findViewById(R.id.et_password);

        textViewResult = (TextView) findViewById(R.id.tv_result);

        buttonLogin = (Button) findViewById(R.id.btn_login);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String result = login(editTextUsername.getText().toString(), editTextPassword.getText().toString());

                textViewResult.setText(result);
            }
        });
    }

    private String login(String username, String password){
        String result = "";

        if(username.equals("Wuriyanto") && password.equals("123456")){
            result = "Login Success";
        } else {
            result = "Login Fail";
        }
        return result;
    }
}
