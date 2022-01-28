package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edt_Email;
    private Button btn_Enter;
    private String mEmail = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edt_Email = (EditText) findViewById(R.id.edtEmail);
        btn_Enter = (Button) findViewById(R.id.btnEnter);


        btn_Enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendDatatoFragment();
            }
        });



    }

    private void sendDatatoFragment() {

        String strEmail = edt_Email.getText().toString().trim();

        mEmail = strEmail;


        //Truyền Fragment vào Layout mong muốn

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.layoutFame, new HomeFragment());
        fragmentTransaction.commit();
    }

    public String getEmail() {
        return mEmail;
    }

    public EditText getEdt_Email() {
        return edt_Email;
    }
}