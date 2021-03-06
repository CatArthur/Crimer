package com.example.snark_55.crimer;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CheckBox cb=(CheckBox)findViewById(R.id.cb1);
        final Crime cr=new Crime(cb.isChecked(),"Fragment");
        Button bt=(Button)findViewById(R.id.bt1);
        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cr.setB(cb.isChecked());
            }
        });
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,cr.getTitle()+" "+cr.getB(),Toast.LENGTH_SHORT).show();
            }
        });
        final Button btn=(Button)findViewById(R.id.bt2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cr.setDate(new Date());
                btn.setText(cr.getDate().toString());
                Toast.makeText(MainActivity.this,cr.getDate().toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
