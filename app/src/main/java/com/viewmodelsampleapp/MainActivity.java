package com.viewmodelsampleapp;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private MyViewModel viewModel;
    private TextView clickCountText;
    Button increment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickCountText = findViewById(R.id.textView);
        increment = findViewById(R.id.button);

        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incrementClickCount();
            }
        });
        viewModel = ViewModelProviders.of(this).get(MyViewModel.class);
        /*Uncomment this line and change the orientation it will reset the counter
        * That is the reason Viewmodel comes in to picture to hold the counter value and update.*/
        displayClickCount(viewModel.getCount());

    }

    public void incrementClickCount() {
        viewModel.setCount(viewModel.getCount() + 1);
        displayClickCount(viewModel.getCount());
    }

    private void displayClickCount(int clickCount) {
        clickCountText.setText(String.valueOf(clickCount));
    }
}
