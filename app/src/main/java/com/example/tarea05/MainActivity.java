package com.example.tarea05;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        String colorhex = "#000000";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View colorSample = findViewById(R.id.colorSample);
        colorSample.setBackgroundColor(Color.parseColor(colorhex));
        final SeekBar Red = findViewById(R.id.RedColor);
        final SeekBar Green = findViewById(R.id.GreenColor);
        final SeekBar Blue = findViewById(R.id.BlueColor);
        final TextView RedText = findViewById(R.id.R);
        final TextView GreenText = findViewById(R.id.G);
        final TextView BlueText = findViewById(R.id.B);
        final View CuadroColor = findViewById(R.id.colorSample);
        final TextView hexTextView = findViewById(R.id.hexTextView);

        Red.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
               String hex = "#"+ ColorUtils.decimalToHex(Red.getProgress())+
               ColorUtils.decimalToHex(Green.getProgress())+
               ColorUtils.decimalToHex(Blue.getProgress());

                RedText.setText("R:"+ i);

                hexTextView.setText(hex);
                CuadroColor.setBackgroundColor(Color.parseColor(hex));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        Green.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                String hex = "#"+ ColorUtils.decimalToHex(Red.getProgress())+
                        ColorUtils.decimalToHex(Green.getProgress())+
                        ColorUtils.decimalToHex(Blue.getProgress());

                GreenText.setText("G: "+ i);
                hexTextView.setText(hex);
                CuadroColor.setBackgroundColor(Color.parseColor(hex));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        Blue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                String hex = "#"+ ColorUtils.decimalToHex(Red.getProgress())+
                        ColorUtils.decimalToHex(Green.getProgress())+
                        ColorUtils.decimalToHex(Blue.getProgress());


                BlueText.setText("B: "+i);
                hexTextView.setText(hex);
                CuadroColor.setBackgroundColor(Color.parseColor(hex));


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });




    }




}
