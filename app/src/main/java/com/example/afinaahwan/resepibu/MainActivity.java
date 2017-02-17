package com.example.afinaahwan.resepibu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView judul, bahan, cara;
    Button share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        judul = (TextView) findViewById(R.id.judul);
        bahan = (TextView) findViewById(R.id.bahan);
        cara = (TextView) findViewById(R.id.cara);
        share = (Button) findViewById(R.id.btnshare);


        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_TEXT,
                        judul.getText().toString()
                                + "\n"
                                + "BAHAN :" + bahan.getText().toString()
                                + "\n"
                                + "CARA MEMBUAT :" + cara.getText().toString()
                );
                i.setType("text/plain");
                startActivity(i);
            }
        });
    }
}
