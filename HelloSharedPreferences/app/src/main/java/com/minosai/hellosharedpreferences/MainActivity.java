package com.minosai.hellosharedpreferences;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView textView;

    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String prefFileName = "PrefFile";
        preferences = getSharedPreferences(prefFileName, MODE_PRIVATE);

        editText = findViewById(R.id.input_message);
        button = findViewById(R.id.button_save);
        textView = findViewById(R.id.text_stored_value);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getInput();
            }
        });

        fetchValue();

    }

    private void fetchValue() {
        String storedValue = preferences.getString("USER_INPUT_KEY", "Nothing yet");
        textView.setText(storedValue);
    }

    private void getInput() {

        //get the input
        String input = editText.getText().toString();
        Toast.makeText(this, input, Toast.LENGTH_SHORT).show();

        //store the input
        preferences
                .edit()
                .putString("USER_INPUT_KEY", input)
                .apply();
    }
}
