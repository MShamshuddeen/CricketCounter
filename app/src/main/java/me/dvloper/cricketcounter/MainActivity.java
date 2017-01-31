package me.dvloper.cricketcounter;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int wicketTeamA = 0;
    int oversTeamA = 0;
    int ballTeamA = 0;
    int scoreTeamB = 0;
    int wicketTeamB = 0;
    int oversTeamB = 0;
    int ballTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    /*Team A section Start*/
    public void addOneforTeamA(View view){
        scoreTeamA = scoreTeamA + 1;
        ballTeamA = ballTeamA + 1;
        displayRunForTeamA(scoreTeamA);
        displayBallsforTeamA(oversTeamA,ballTeamA);
    }
    public void wideNoBallTeamA(View view){
        scoreTeamA = scoreTeamA + 1;
        displayRunForTeamA(scoreTeamA);
        displayBallsforTeamA(oversTeamA,ballTeamA);

    }
    public void addTwoforTeamA(View view){
        scoreTeamA = scoreTeamA + 2;
        ballTeamA = ballTeamA + 1;
        displayRunForTeamA(scoreTeamA);
        displayBallsforTeamA(oversTeamA,ballTeamA);
    }
    public void addThreeforTeamA(View view){
        scoreTeamA = scoreTeamA + 3;
        ballTeamA = ballTeamA + 1;
        displayRunForTeamA(scoreTeamA);
        displayBallsforTeamA(oversTeamA,ballTeamA);
    }
    public void addFourforTeamA(View view){
        scoreTeamA = scoreTeamA + 4;
        ballTeamA = ballTeamA + 1;
        displayRunForTeamA(scoreTeamA);
        displayBallsforTeamA(oversTeamA,ballTeamA);
    }
    public void addSixforTeamA(View view){
        scoreTeamA = scoreTeamA + 6;
        ballTeamA = ballTeamA + 1;
        displayRunForTeamA(scoreTeamA);
        displayBallsforTeamA(oversTeamA,ballTeamA);
    }
    public void wicketForTeamA(View view){
        wicketTeamA = wicketTeamA + 1;
        ballTeamA = ballTeamA + 1;
        displayWicketForTeamA(wicketTeamA);
        displayBallsforTeamA(oversTeamA,ballTeamA);
    }
    public void dotBallTeamA(View view){
        ballTeamA = ballTeamA + 1;
        displayRunForTeamA(scoreTeamA);
        displayBallsforTeamA(oversTeamA,ballTeamA);

    }

    public void displayRunForTeamA(int run){
        TextView scoreText = (TextView) findViewById(R.id.team_a_score);
        scoreText.setText(String.valueOf(run));

    }

    public void displayWicketForTeamA(int wicket){
        TextView wicketText = (TextView) findViewById(R.id.team_a_wicket);
        wicketText.setText(String.valueOf(wicket));


    }
    public void displayBallsforTeamA(int overs,int balls){
        TextView ballText = (TextView) findViewById(R.id.team_a_balls);
        TextView overText = (TextView) findViewById(R.id.team_a_overs);
        if(ballTeamA == 6){
            oversTeamA = oversTeamA + 1;
            ballTeamA = 0;
            ballText.setText(String.valueOf(balls));
            overText.setText(String.valueOf(overs));
        }
        else{
            ballText.setText(String.valueOf(balls));
            overText.setText(String.valueOf(overs));

        }



    }
    /*Team A section End*/


     /*Team B section Start*/

    public void addOneforTeamB(View view){
        scoreTeamB = scoreTeamB + 1;
        ballTeamB = ballTeamB + 1;
        displayRunForTeamB(scoreTeamB);
        displayBallsforTeamB(oversTeamB,ballTeamB);
    }
    public void wideNoBallTeamB(View view){
        scoreTeamB = scoreTeamB + 1;
        displayRunForTeamB(scoreTeamB);
        displayBallsforTeamB(oversTeamB,ballTeamB);

    }
    public void addTwoforTeamB(View view){
        scoreTeamB = scoreTeamB + 2;
        ballTeamB = ballTeamB + 1;
        displayRunForTeamB(scoreTeamB);
        displayBallsforTeamB(oversTeamB,ballTeamB);
    }
    public void addThreeforTeamB(View view){
        scoreTeamB = scoreTeamB + 3;
        ballTeamB = ballTeamB + 1;
        displayRunForTeamB(scoreTeamB);
        displayBallsforTeamB(oversTeamB,ballTeamB);
    }
    public void addFourforTeamB(View view){
        scoreTeamB = scoreTeamB + 4;
        ballTeamB = ballTeamB + 1;
        displayRunForTeamB(scoreTeamB);
        displayBallsforTeamB(oversTeamB,ballTeamB);
    }
    public void addSixforTeamB(View view){
        scoreTeamB = scoreTeamB + 6;
        ballTeamB = ballTeamB + 1;
        displayRunForTeamB(scoreTeamB);
        displayBallsforTeamB(oversTeamB,ballTeamB);
    }
    public void wicketForTeamB(View view){
        wicketTeamB = wicketTeamB + 1;
        ballTeamB = ballTeamB + 1;
        displayWicketForTeamB(wicketTeamB);
        displayBallsforTeamB(oversTeamB,ballTeamB);
    }
    public void dotBallTeamB(View view){
        ballTeamB = ballTeamB + 1;
        displayRunForTeamB(scoreTeamB);
        displayBallsforTeamB(oversTeamB,ballTeamB);

    }

    public void displayRunForTeamB(int run){
        TextView scoreText = (TextView) findViewById(R.id.team_b_score);
        scoreText.setText(String.valueOf(run));

    }

    public void displayWicketForTeamB(int wicket){
        TextView wicketText = (TextView) findViewById(R.id.team_b_wicket);
        wicketText.setText(String.valueOf(wicket));


    }
    public void displayBallsforTeamB(int overs,int balls){
        TextView ballText = (TextView) findViewById(R.id.team_b_balls);
        TextView overText = (TextView) findViewById(R.id.team_b_overs);
        if(ballTeamB == 6){
            oversTeamB = oversTeamB + 1;
            ballTeamB = 0;
            ballText.setText(String.valueOf(balls));
            overText.setText(String.valueOf(overs));
        }
        else{
            ballText.setText(String.valueOf(balls));
            overText.setText(String.valueOf(overs));

        }

    }
    public void resetAll(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        wicketTeamA = 0;
        wicketTeamB = 0;
        oversTeamA = 0;
        oversTeamB = 0;
        ballTeamA = 0;
        ballTeamB = 0;
        displayRunForTeamA(scoreTeamA);
        displayRunForTeamB(scoreTeamB);
        displayWicketForTeamA(wicketTeamA);
        displayWicketForTeamB(wicketTeamB);
        displayBallsforTeamA(oversTeamA,ballTeamA);
        displayBallsforTeamB(oversTeamB,ballTeamB);

    }
     /*Team B section End*/

}
