package com.example.michealadenibuyan.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //declaring the radiobuttons, checkboxes, edittext and button used
    private RadioGroup radioGroupQuestion1;
    private RadioButton radioButtonQuestion1;
    private RadioGroup radioGroupQuestion2;
    private RadioButton radioButtonQuestion2;
    private RadioGroup radioGroupQuestion3;
    private RadioButton radioButtonQuestion3;
    private RadioGroup radioGroupQuestion4;
    private RadioButton radioButtonQuestion4;
    private RadioGroup radioGroupQuestion5;
    private RadioButton radioButtonQuestion5;
    private RadioGroup radioGroupQuestion6;
    private RadioButton radioButtonQuestion6;
    private RadioGroup radioGroupQuestion7;
    private RadioButton radioButtonQuestion7;
    private EditText editTextQuestion8;
    private CheckBox checkBoxQuestion9Option1;
    private CheckBox checkBoxQuestion9Option2;
    private CheckBox checkBoxQuestion9Option3;
    private CheckBox checkBoxQuestion9Option4;
    private RadioGroup radioGroupQuestion10;
    private RadioButton radioButtonQuestion10;
    private Button submitButton;

    //This is used to display a toast message
    private CharSequence message;

    //The overall score
    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();
    }

    public void addListenerOnButton(){

        radioGroupQuestion1 = findViewById(R.id.question_one);
        radioGroupQuestion2 = findViewById(R.id.question_two);
        radioGroupQuestion3 = findViewById(R.id.question_three);
        radioGroupQuestion4 = findViewById(R.id.question_four);
        radioGroupQuestion5 = findViewById(R.id.question_five);
        radioGroupQuestion6 = findViewById(R.id.question_six);
        radioGroupQuestion7 = findViewById(R.id.question_seven);
        editTextQuestion8 = findViewById(R.id.question_eight_answer);
        checkBoxQuestion9Option1 = findViewById(R.id.question_nine_option_one);
        checkBoxQuestion9Option2 = findViewById(R.id.question_nine_option_two);
        checkBoxQuestion9Option3 = findViewById(R.id.question_nine_option_three);
        checkBoxQuestion9Option4 = findViewById(R.id.question_nine_option_four);
        radioGroupQuestion10 = findViewById(R.id.question_ten);
        submitButton = findViewById(R.id.submit_quiz);



        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Get the selected radio button for question number one
                int selectedForQuestion1 = radioGroupQuestion1.getCheckedRadioButtonId();

                //Get the selected radio button for question number two
                int selectedForQuestion2 = radioGroupQuestion2.getCheckedRadioButtonId();

                //Get the selected radio button for question number three
                int selectedForQuestion3 = radioGroupQuestion3.getCheckedRadioButtonId();

                //Get the selected radio button for question number four
                int selectedForQuestion4 = radioGroupQuestion4.getCheckedRadioButtonId();

                //Get the selected radio button for question number five
                int selectedForQuestion5 = radioGroupQuestion5.getCheckedRadioButtonId();

                //Get the selected radio button for question number six
                int selectedForQuestion6 = radioGroupQuestion6.getCheckedRadioButtonId();

                //Get the selected radio button for question number seven
                int selectedForQuestion7 = radioGroupQuestion7.getCheckedRadioButtonId();

                //Get the selected radio button for question number ten
                int selectedForQuestion10 = radioGroupQuestion10.getCheckedRadioButtonId();

                editTextQuestion8 = (EditText) findViewById(R.id.question_eight_answer);



                if(selectedForQuestion1 == -1 || selectedForQuestion2 == -1 || selectedForQuestion3 == -1
                        || selectedForQuestion4 == -1 || selectedForQuestion5 == -1 || selectedForQuestion6 == -1
                        || selectedForQuestion7 == -1 || selectedForQuestion10 == -1 || editTextQuestion8.getText().equals(null)){
                    message = "Kindly ensure you answer all questions";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                    return;
                }

                if(!checkBoxQuestion9Option1.isChecked() && !checkBoxQuestion9Option2.isChecked() && !checkBoxQuestion9Option3.isChecked()
                        && !checkBoxQuestion9Option4.isChecked()){
                    message = "Kindly ensure you answer all questions";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                    return;
                }

                if(findViewById(selectedForQuestion1) == findViewById(R.id.question_one_option_one) ){
                    score++;

                }

                if(findViewById(selectedForQuestion2) == findViewById(R.id.question_two_option_two) ){
                    score++;

                }

                if(findViewById(selectedForQuestion3) == findViewById(R.id.question_three_option_one) ){
                    score++;

                }

                if(findViewById(selectedForQuestion4) == findViewById(R.id.question_four_option_three) ){
                    score++;

                }

                if(findViewById(selectedForQuestion5) == findViewById(R.id.question_five_option_four) ){
                    score++;

                }

                if(findViewById(selectedForQuestion6) == findViewById(R.id.question_six_option_four) ){
                    score++;

                }

                if(findViewById(selectedForQuestion7) == findViewById(R.id.question_seven_option_two) ){
                    score++;

                }

                if(findViewById(selectedForQuestion10) == findViewById(R.id.question_ten_option_two) ){
                    score++;

                }

                if(editTextQuestion8.getText().toString().equalsIgnoreCase("android run time")){
                    score++;
                }

                if(checkBoxQuestion9Option1.isChecked() && checkBoxQuestion9Option2.isChecked() && !checkBoxQuestion9Option3.isChecked()
                        && checkBoxQuestion9Option4.isChecked()){
                    score++;
                }


                message = "You scored: "+score+ " of " +"10";
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

                //return score back to 0
                score = 0;

                //clear all
                radioGroupQuestion1.clearCheck();
                radioGroupQuestion2.clearCheck();
                radioGroupQuestion3.clearCheck();
                radioGroupQuestion4.clearCheck();
                radioGroupQuestion5.clearCheck();
                radioGroupQuestion6.clearCheck();
                radioGroupQuestion7.clearCheck();
                radioGroupQuestion10.clearCheck();
                editTextQuestion8.setText("");
                checkBoxQuestion9Option1.setChecked(false);
                checkBoxQuestion9Option2.setChecked(false);
                checkBoxQuestion9Option3.setChecked(false);
                checkBoxQuestion9Option4.setChecked(false);

            }
        });



    }
}
