package com.xgn.opencvdemo;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.xgn.opencvdemo.cameracalibration.CameraCalibrationActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Used to load the 'native-lib' library on application startup.

    private TextView mPuzzleView;
    private TextView mCalibrationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPuzzleView = (TextView) findViewById(R.id.Puzzle);
        mCalibrationView = (TextView)findViewById(R.id.Calibration);

        mPuzzleView.setOnClickListener(this);
        mCalibrationView.setOnClickListener(this);

        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, 200);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.Puzzle) {
            startActivity(new Intent(this, Puzzle15Activity.class));
        } else if (id == R.id.Calibration) {
            startActivity(new Intent(this, CameraCalibrationActivity.class));
        }
    }

}
