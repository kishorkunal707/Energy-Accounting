package com.example.android.energyaccounting;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.text.Editable;
        import android.text.TextWatcher;
        import android.widget.ArrayAdapter;
        import android.widget.AutoCompleteTextView;

        import com.google.android.material.textfield.TextInputLayout;

public class MeterActivity extends AppCompatActivity {

    ArrayAdapter<String> adapter;
    private AutoCompleteTextView atv;
    private String [] meter_type = {"Zenus", "Secure", "Others"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meter);


        adapter = new ArrayAdapter<String>(this,R.layout.auto_complete,meter_type);
        atv = findViewById(R.id.meter_type_autocomplete_tv);
        atv.setAdapter(adapter);



    }

}

