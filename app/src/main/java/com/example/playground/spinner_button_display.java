package com.example.playground;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class spinner_button_display extends AppCompatActivity {

    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_button_display);
    }


    //    called when the user clicks a button
    public void onClickFindBeer(View view){
//        Get a reference to the Textview
        TextView brands = (TextView) findViewById(R.id.brands);
//        Get a reference to the spinner
        Spinner color = (Spinner) findViewById(R.id.color);
//        Get the selected item in the spinner
        String beerType = String.valueOf(color.getSelectedItem());
//      Get recommendation from the BeerExpert class
        List<String> brandsList = expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();

        for (String brand: brandsList){
            brandsFormatted.append(brand).append('\n');
        }

//        Display the beers
        brands.setText(brandsFormatted);
    }
}