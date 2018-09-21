package com.example.er_ja.miprimeraaplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtName;
    private TextView txtSurname;
    private TextView txtGreet;
    private CheckBox cbPolite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName = (TextView) findViewById(R.id.txtName);
        txtSurname = (TextView) findViewById(R.id.txtSurname);
        Button btnGreet = (Button) findViewById(R.id.btnGreet);
        Button btnReset = (Button) findViewById(R.id.btnReset);
        txtGreet = (TextView) findViewById(R.id.txtGreet);
        cbPolite = (CheckBox) findViewById(R.id.cbPolite);

        btnGreet.setOnClickListener(this);
        btnReset.setOnClickListener(this);
        
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnGreet:
                if(cbPolite.isChecked()){
                    txtGreet.setText(getString(R.string.politeGreet)+" "+txtName.getText()+" "+txtSurname.getText());
                }else{
                    txtGreet.setText(getString(R.string.unpoliteGreet)+" "+txtName.getText()+" "+txtSurname.getText()+"!");
                }
                break;

            case R.id.btnReset:
                txtGreet.setText("");
                break;
        }
    }
}
