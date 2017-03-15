package com.example.android.africanhistoryquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showScores(View view){
        int scoreForAnswer = 0;

        /**
         * check answer for question: 1) What is the African Union headquarter found?
         */
        EditText capitalCity = (EditText) findViewById(R.id.city_field);
        String capitalCityHead = capitalCity.getText().toString();
        if (capitalCityHead.equals("Addis Ababa, Ethiopia")) {
            scoreForAnswer += 1;
        }

        /**
         * check answer for question: 2) The two African countries considered never to have been colonized?
         */
        CheckBox ColonizedEthiopia = (CheckBox) findViewById(R.id.Ethiopia_colonized_Checkbox);
        boolean isEthiopia = ColonizedEthiopia.isChecked();
        CheckBox ColonizedNigeria = (CheckBox) findViewById(R.id.Nigeria_Colonized_Checkbox);
        boolean isNigeria = ColonizedNigeria.isChecked();
        CheckBox ColonizedLiberia = (CheckBox) findViewById(R.id.Liberia_colonized_Checkbox);
        boolean isLiberia = ColonizedLiberia.isChecked();
        CheckBox ColonizedKenya = (CheckBox) findViewById(R.id.Kenya_colonized_Checkbox);
        boolean isKenya = ColonizedKenya.isChecked();
        if ((isEthiopia) && (isLiberia) && !(isNigeria) && !(isKenya)) {
            scoreForAnswer += 1;
        }

        /**
         * check answer for question: 3) Where is the pyramid found?
         */
        RadioButton pyramidEgypt = (RadioButton) findViewById(R.id.radio_Egypt);
        boolean hasEgyptPyramid = pyramidEgypt.isChecked();
        if (hasEgyptPyramid) {
            scoreForAnswer += 1;
        }

        /**
         * check answer for question: 4) How long is the Sahara?
         */
        EditText saharaSize = (EditText) findViewById(R.id.Three_Million);
        String guessSaharaSize = saharaSize.getText().toString();
        if (guessSaharaSize.equals("3500000")) {
            scoreForAnswer += 1;
        }

        /**
         * create final message with scores to display
         */
        String message = "Your scores is: ";
        message += scoreForAnswer;
        message += " out of 4";

        /**
         * display Toast with final message
         */
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
