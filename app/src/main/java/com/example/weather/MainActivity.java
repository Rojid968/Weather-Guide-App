package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioButton summer,winter,hot,cold,sunnotvisible,yrain,morning,evening;
    Button click;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        summer=findViewById(R.id.summer);
        winter=findViewById(R.id.winter);
        hot=findViewById(R.id.hot);
        cold=findViewById(R.id.cold);

        sunnotvisible=findViewById(R.id.novisible);
        yrain=findViewById(R.id.yrain);
        morning=findViewById(R.id.morning);
        evening=findViewById(R.id.evening);
        click=findViewById(R.id.click);
        result=findViewById(R.id.result);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( (yrain.isChecked()) )
                {
                    result.setText(" Take Umbrella");
                }
                else if (  (cold.isChecked() && summer.isChecked() && sunnotvisible.isChecked()))
                {
                    result.setText(" Take Umbrella");
                }
                else if ((morning.isChecked() && winter.isChecked() && cold.isChecked()))
                {
                    result.setText(" Take Umbrella");
                }

                else
                {
                    result.setText("Not Take Umbrella");
                }
            }
        });



    }
}
