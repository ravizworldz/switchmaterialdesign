package com.android.switchmaterial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.google.android.material.switchmaterial.SwitchMaterial;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SwitchMaterial switchMaterial = findViewById(R.id.switchMaterial);

        switchMaterial.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    Toast.makeText(MainActivity.this, "Middle Switch if turned ON", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Middle Switch if turned OFF", Toast.LENGTH_SHORT).show();
            }
        });

        SwitchMaterial topswitchMaterial = findViewById(R.id.topSwitchMaterial);

        topswitchMaterial.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    Toast.makeText(MainActivity.this, "topswitchMaterial if turned ON", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "topswitchMaterial if turned OFF", Toast.LENGTH_SHORT).show();
            }
        });

        SwitchMaterial bottomSwitchMaterial = findViewById(R.id.bottomSwitchMaterial);

        bottomSwitchMaterial.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    Toast.makeText(MainActivity.this, "bottomSwitchMaterial if turned ON", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "bottomSwitchMaterial if turned OFF", Toast.LENGTH_SHORT).show();
            }
        });


    }
}