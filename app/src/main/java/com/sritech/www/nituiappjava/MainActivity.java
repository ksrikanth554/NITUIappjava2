package com.sritech.www.nituiappjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button b1;
    private EditText e;
    private TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e=findViewById(R.id.edt1);
        t=findViewById(R.id.txt1);
        b1=findViewById(R.id.b1);

        //Anonymous InnerClass
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=e.getText().toString();
                t.setText(s);
                e.setText("");

            }
        });

       //Lamda Expression
       /* b1.setOnClickListener(v -> {
            String s=e.getText().toString();
            t.setText(s);
            e.setText("");

        });*/

      // b1.setOnClickListener(this);
    }
   public void getText(View view)
   {
      EditText e=findViewById(R.id.edt1);
     TextView t= findViewById(R.id.txt1);
     String s=e.getText().toString();
     t.setText(s);
     e.setText("");


   }

   /* @Override
    public void onClick(View v) {
       String s=e.getText().toString();
       t.setText(s);
       e.setText("");
    }*/
}
