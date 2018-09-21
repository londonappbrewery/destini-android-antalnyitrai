package com.londonappbrewery.destini;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity { //!!! Why was AppCompatActivity??

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStory;
    Button mOpt01Button;
    Button mOpt02Button;
    int mChapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStory = findViewById(R.id.storyTextView);
        mOpt01Button = findViewById(R.id.buttonTop);
        mOpt02Button = findViewById(R.id.buttonBottom);
        mChapter = 1; //!!!update to lifecycle


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mOpt01Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mChapter == 1) { mChapter = 3;}
                else if (mChapter == 2) { mChapter = 3;}
                else if (mChapter == 3) { mChapter = 6;}
                UpdateScreen();
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mOpt02Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mChapter == 1) { mChapter = 2;}
                else if (mChapter == 2) { mChapter = 4;}
                else if (mChapter == 3) { mChapter = 5;}
                UpdateScreen();
            }
        });

    }

    protected void UpdateScreen(){
        Toast.makeText(getApplicationContext(), Integer.toString(mChapter), Toast.LENGTH_SHORT).show();
        if (mChapter == 1) {
            mStory.setText(R.string.T1_Story);
            mOpt01Button.setVisibility(View.VISIBLE);
            mOpt02Button.setVisibility(View.VISIBLE);
            mOpt01Button.setText(R.string.T1_Ans1);
            mOpt02Button.setText(R.string.T1_Ans2);
        }
        if (mChapter == 2) {
            mStory.setText(R.string.T2_Story);
            mOpt01Button.setVisibility(View.VISIBLE);
            mOpt02Button.setVisibility(View.VISIBLE);
            mOpt01Button.setText(R.string.T2_Ans1);
            mOpt02Button.setText(R.string.T2_Ans2);
        }
        if (mChapter == 3) {
            mStory.setText(R.string.T3_Story);
            mOpt01Button.setVisibility(View.VISIBLE);
            mOpt02Button.setVisibility(View.VISIBLE);
            mOpt01Button.setText(R.string.T3_Ans1);
            mOpt02Button.setText(R.string.T3_Ans2);
        }
        if (mChapter == 4) {
            mStory.setText(R.string.T4_End);
            mOpt01Button.setVisibility(View.GONE);
            mOpt02Button.setVisibility(View.GONE);
        }
        if (mChapter == 5) {
            mStory.setText(R.string.T5_End);
            mOpt01Button.setVisibility(View.GONE);
            mOpt02Button.setVisibility(View.GONE);
        }
        if (mChapter == 6) {
            mStory.setText(R.string.T6_End);
            mOpt01Button.setVisibility(View.GONE);
            mOpt02Button.setVisibility(View.GONE);
        }
    }
}
