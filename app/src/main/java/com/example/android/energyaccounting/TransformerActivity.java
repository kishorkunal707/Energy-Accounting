package com.example.android.energyaccounting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class TransformerActivity extends AppCompatActivity {

    private String[] trans_make = {"Alstom", "L&T", "PowerGrid"};
    private Spinner t_Spin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transformer);
        /**/
        t_Spin = findViewById(R.id.sppiner_make_ID);

        ArrayAdapter<String> t_adapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_spinner_item,
                trans_make);
        t_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        t_Spin.setAdapter(t_adapter);

t_Spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(TransformerActivity.this, trans_make[position], Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
});
    }


}

