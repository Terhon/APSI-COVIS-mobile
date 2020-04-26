package com.main.covis.covid_map;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.main.covis.R;

public class CovidMapActivity extends AppCompatActivity implements CovidMapContract.View {

    private CovidMapPresenter presenter;
    TextView messageTV;
    Button messageBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messageTV = findViewById(R.id.helloTextView);
        messageBT = findViewById(R.id.helloButton);
        presenter = new CovidMapPresenter();
        messageBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMessage(presenter.getResult());
            }
        });

    }

    @Override
    public void showMessage(String message){
        messageTV.setText(message);
    }
}