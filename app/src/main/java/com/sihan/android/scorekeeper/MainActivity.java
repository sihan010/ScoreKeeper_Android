package com.sihan.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private int score_aus = 0;
    private int wicket_aus = 0;
    private int over_aus = 0;

    private int score_ind = 0;
    private int wicket_ind = 0;
    private int over_ind = 0;

    public void scoreKeeperAus(View view) {
        String param = view.getTag().toString();
        //System.out.println(param);
        TextView text_view_score_aus = findViewById(R.id.text_view_score_aus);
        TextView text_view_wicket_aus = findViewById(R.id.text_view_wicket_aus);
        TextView text_view_over_aus = findViewById(R.id.text_view_over_aus);
        switch (param){
            case "1" :
                score_aus+=1;
                text_view_score_aus.setText(""+score_aus);
                break;
            case "2" :
                score_aus+=2;
                text_view_score_aus.setText(""+score_aus);
                break;
            case "3" :
                score_aus+=3;
                text_view_score_aus.setText(""+score_aus);
                break;
            case "4" :
                score_aus+=4;
                text_view_score_aus.setText(""+score_aus);
                break;
            case "6" :
                score_aus+=6;
                text_view_score_aus.setText(""+score_aus);
                break;
            case "0" :
                score_aus+=0;
                text_view_score_aus.setText(""+score_aus);
                break;
            case "NB" :
                score_aus+=1;
                text_view_score_aus.setText(""+score_aus);
                break;
            case "W" :
                score_aus+=1;
                text_view_score_aus.setText(""+score_aus);
                break;
            case "Ov" :
                over_aus+=1;
                text_view_over_aus.setText(""+over_aus);
                break;
            case "Wic" :
                wicket_aus+=1;
                text_view_wicket_aus.setText(""+wicket_aus);
                break;
            default:
                score_aus+=0;
                text_view_score_aus.setText(""+score_aus);
                break;
        }
    }

    public void scoreKeeperInd(View view) {
        String param = view.getTag().toString();
        //System.out.println(param);
        TextView text_view_score_ind = findViewById(R.id.text_view_score_ind);
        TextView text_view_wicket_ind = findViewById(R.id.text_view_wicket_ind);
        TextView text_view_over_ind = findViewById(R.id.text_view_over_ind);
        switch (param){
            case "1" :
                score_ind+=1;
                text_view_score_ind.setText(""+score_ind);
                break;
            case "2" :
                score_ind+=2;
                text_view_score_ind.setText(""+score_ind);
                break;
            case "3" :
                score_ind+=3;
                text_view_score_ind.setText(""+score_ind);
                break;
            case "4" :
                score_ind+=4;
                text_view_score_ind.setText(""+score_ind);
                break;
            case "6" :
                score_ind+=6;
                text_view_score_ind.setText(""+score_ind);
                break;
            case "0" :
                score_ind+=0;
                text_view_score_ind.setText(""+score_ind);
                break;
            case "NB" :
                score_ind+=1;
                text_view_score_ind.setText(""+score_ind);
                break;
            case "W" :
                score_ind+=1;
                text_view_score_ind.setText(""+score_ind);
                break;
            case "Ov" :
                over_ind+=1;
                text_view_over_ind.setText(""+over_ind);
                break;
            case "Wic" :
                wicket_ind+=1;
                text_view_wicket_ind.setText(""+wicket_ind);
                break;
            default:
                score_ind+=0;
                text_view_score_ind.setText(""+score_ind);
                break;
        }
    }

    public void resetButtonClick(View view) {
        TextView text_view_score_ind = findViewById(R.id.text_view_score_ind);
        TextView text_view_wicket_ind = findViewById(R.id.text_view_wicket_ind);
        TextView text_view_over_ind = findViewById(R.id.text_view_over_ind);

        TextView text_view_score_aus = findViewById(R.id.text_view_score_aus);
        TextView text_view_wicket_aus = findViewById(R.id.text_view_wicket_aus);
        TextView text_view_over_aus = findViewById(R.id.text_view_over_aus);

        score_aus = 0;
        wicket_aus = 0;
        over_aus = 0;

        score_ind = 0;
        wicket_ind = 0;
        over_ind = 0;

        text_view_score_aus.setText(""+score_aus);
        text_view_over_aus.setText(""+over_aus);
        text_view_wicket_aus.setText(""+wicket_aus);

        text_view_score_ind.setText(""+score_ind);
        text_view_over_ind.setText(""+over_ind);
        text_view_wicket_ind.setText(""+wicket_ind);
    }
}
