package com.sritech.www.nituiappjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   public void getText(View view)
   {
      EditText e=findViewById(R.id.edt1);
     TextView t= findViewById(R.id.txt1);
     String s=e.getText().toString();
     t.setText(s);
     e.setText("");


   }
}
