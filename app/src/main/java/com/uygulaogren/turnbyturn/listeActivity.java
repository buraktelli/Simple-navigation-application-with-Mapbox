package com.uygulaogren.turnbyturn;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class listeActivity extends AppCompatActivity {
    ImageButton btnTeras,btnsafran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste);
        btnTeras=findViewById(R.id.btn_teras);
        btnsafran=findViewById(R.id.btn_safran);


    }
    public void onClick(View view){
        int id=view.getId();
        switch(id){
            case R.id.btn_teras:
                String lng="32.682430";
                String lat="41.279982";
                Intent terasIntent=new Intent();
                terasIntent.putExtra("lng",lng);
                terasIntent.putExtra("lat",lat);
                setResult(Activity.RESULT_OK,terasIntent);
                finish();
                break;
            case R.id.btn_safran:
                //String name=etName.getText().toString();
                String lngsafran="32.694614";
                String latsafran="41.243000";
                Intent safranIntent=new Intent();
                safranIntent.putExtra("lng",lngsafran);
                safranIntent.putExtra("lat",latsafran);
                setResult(Activity.RESULT_OK,safranIntent);
                finish();
                break;
        }

    }
}

