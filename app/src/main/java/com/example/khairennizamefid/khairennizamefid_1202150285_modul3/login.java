package com.example.khairennizamefid.khairennizamefid_1202150285_modul3;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText username, password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //DEKLARASI
        username = (EditText) findViewById(R.id.Username);
        password = (EditText) findViewById(R.id.Password);
        btnLogin = (Button) findViewById(R.id.button_Login);

        //INI UNTUK BUTTON LOGINNYA
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameKey = username.getText().toString();
                String passwordKey = password.getText().toString();

                if(usernameKey.equals("EAD") && passwordKey.equals("MOBILE")){
                    //jika login berhasil
                    Toast.makeText(getApplicationContext(),"Login Sukses...!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent( login.this, MainActivity.class);
                    intent.putExtra("a", usernameKey);
                    login.this.startActivity(intent);

                } else {
                    //jika login gagal
                    AlertDialog.Builder builder = new AlertDialog.Builder(login.this);
                    builder.setMessage("Username atau Password anda salah...!")
                            .setNegativeButton("Retry...", null).create().show();
                }
            }
        });
    }
}
