package com.tuogol.onlyfives;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tuogol.library.RatingDialog;

public class SampleActivity extends AppCompatActivity implements RatingDialog.RatingDialogCallback{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        //Show the dialog
        RatingDialog.show(getSupportFragmentManager());
    }

    @Override
    public void ratingResults(int stars, @NonNull String feedback) {
        //Where feedback is reported
    }

    @Override
    public void ratingClicked(int stars, @Nullable RatingDialog dialog) {
        //Where click events are reported

        //Maybe look for a 5 Star rating and take the user to the Play Store..
        if(stars == 5) {
            //Go to Play Store

            if(dialog != null) {
                dialog.dismiss();
            }
        }
    }
}
