package com.example.playground;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Intents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents);
    }



    //    when the button is clicked
    public void onSendMessage(View view){

//        gets text from input
        EditText messageView = (EditText) findViewById(R.id.message);
        String messageText = messageView.getText().toString();

        /*Intent intent = new Intent(this, ReceiveMessage.class);
        intent.putExtra("message", messageText);*/

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/palin");
        intent.putExtra(Intent.EXTRA_TEXT, messageText);
        String chooserTitle = getString(R.string.chooser);
        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);

        startActivity(chosenIntent);
    }


}