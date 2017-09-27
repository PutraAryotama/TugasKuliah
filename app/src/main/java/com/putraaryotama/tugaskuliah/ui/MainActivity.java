package com.putraaryotama.tugaskuliah.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.putraaryotama.tugaskuliah.R;

public class MainActivity extends AppCompatActivity {
    private Button mTambahTugasButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTambahTugasButton = (Button) findViewById(R.id.tambahTugas);

        mTambahTugasButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tambahTugas();
            }
        });
    }

    private void tambahTugas() {
        Intent intent = new Intent(this, TambahTugas.class);
        startActivity(intent);
    }
}
