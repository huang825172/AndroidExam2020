package com.gdufs.hy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.gdufs.hy.databinding.Activity186Binding;

public class Activity186 extends AppCompatActivity {

    Activity186Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = Activity186Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.MainSubmitBtn.setOnClickListener(v -> {
            if (binding.MainInputHy.getText().toString().equals(getResources().getString(R.string.answer))) {
                binding.MainResult.setText(getResources().getString(R.string.correct));
            } else {
                binding.MainResult.setText(getResources().getString(R.string.incorrect));
            }
        });
    }
}