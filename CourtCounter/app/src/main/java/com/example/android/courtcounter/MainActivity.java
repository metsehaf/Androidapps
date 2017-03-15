package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int getScoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        displayForTeamA(8);


    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);

//        Button View = (TextView) findViewById(R.id.3points);
//        View.setText(String.valueOf(view));
    }
    public void addTwoForTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
//        Button View = (TextView) findViewById(R.id.2points);
//        View.setText(String.valueOf(view));
    }
    public void addOneForTeamA(View view) {

        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreeForTeamB(View view) {
        getScoreTeamB = getScoreTeamB + 3;
        displayForTeamB(getScoreTeamB);

//        Button View = (TextView) findViewById(R.id.3points);
//        View.setText(String.valueOf(view));
    }
    public void addTwoForTeamB(View view) {
        getScoreTeamB = getScoreTeamB + 2;
        displayForTeamB(getScoreTeamB);
//        Button View = (TextView) findViewById(R.id.2points);
//        View.setText(String.valueOf(view));
    }
    public void addOneForTeamB(View view) {

        getScoreTeamB = getScoreTeamB + 1;
        displayForTeamB(getScoreTeamB);
    }

    /**
     * Reset score for both teams to 0.
     */
    public void resetScore(View view){
        scoreTeamA = 0;
        getScoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(getScoreTeamB);
    }


}
