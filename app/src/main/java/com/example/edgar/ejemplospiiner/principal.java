package com.example.edgar.ejemplospiiner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;
;


public class principal extends AppCompatActivity {


    EditText n1,n2;
    Button btn;
    Spinner combo;
    Switch s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        n1=(EditText)findViewById(R.id.editText);
        n2=(EditText)findViewById(R.id.editText2);
        btn=(Button)findViewById(R.id.button);
        combo=(Spinner)findViewById(R.id.Spinner);
        s=(Switch)findViewById(R.id.switch1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a,b;
                a=Integer.parseInt(n1.getText().toString());
                b=Integer.parseInt(n2.getText().toString());

                switch (combo.getSelectedItemPosition())
                {
                    case 0:

                        Toast.makeText(principal.this,(a+b)+"",Toast.LENGTH_LONG).show();
                        break;

                    case 1:

                        Toast.makeText(principal.this,(a-b)+"",Toast.LENGTH_LONG).show();
                        break;//teaaamo34567890fghnm,

                }
            }
        });



    }
}
