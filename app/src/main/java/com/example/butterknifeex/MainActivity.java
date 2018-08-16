package com.example.butterknifeex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.BindString;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.textView1) TextView textView1;
    @BindView(R.id.button1) Button button1;
    @BindView(R.id.button2) Button button2;
    @BindString(R.string.message) String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        textView1.setText(message);
    }

    @OnClick({R.id.button1, R.id.button2})
    public void onButtonClick(View v) {
        String strMessage = (v.getId() == R.id.button1) ? "Button-1" : "Button-2";
        Toast.makeText(this, strMessage + " clicked", Toast.LENGTH_SHORT).show();
    }

}
