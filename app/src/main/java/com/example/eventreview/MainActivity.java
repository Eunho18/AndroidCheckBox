package com.example.eventreview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text1, text2;
    CheckBox chkAgree;
    RadioButton rdoDog, rdoCat, rdoRabbit;
    Button btnOK;
    ImageView imgPet;
    RadioGroup rgroup1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        chkAgree = findViewById(R.id.chkAgree);
        rgroup1 = findViewById(R.id.rgroup1);
        rdoDog = findViewById(R.id.rdoDog);
        rdoCat = findViewById(R.id.rdoCat);
        rdoRabbit = findViewById(R.id.rdoRabbit);
        btnOK = findViewById(R.id.btnOK);
        imgPet = findViewById(R.id.imgPet);


        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(chkAgree.isChecked() == true){
                    text2.setVisibility(View.VISIBLE);
                    rgroup1.setVisibility(View.VISIBLE);
                    btnOK.setVisibility(View.VISIBLE);
                    imgPet.setVisibility(View.VISIBLE);


                }
                else{
                    text2.setVisibility(View.INVISIBLE);
                    rgroup1.setVisibility(View.INVISIBLE);
                    btnOK.setVisibility(View.INVISIBLE);
                    imgPet.setVisibility(View.INVISIBLE);
                }
            }
        });
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (rgroup1.getCheckedRadioButtonId()){
                    case R.id.rdoDog:
                        imgPet.setImageResource(R.drawable.dog);
                        break;
                    case R.id.rdoCat:
                        imgPet.setImageResource(R.drawable.cat);
                        break;
                    case R.id.rdoRabbit:
                        imgPet.setImageResource(R.drawable.rabbit);
                        break;

                }
            }
        });



    }


}