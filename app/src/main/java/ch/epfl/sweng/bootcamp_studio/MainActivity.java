package ch.epfl.sweng.bootcamp_studio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "ch.epfl.sweng.bootcamp_studio.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Will be called when button pressed */
    public void sendMessage(View view){
        Intent intent = new Intent(this, activity_greeting.class);
        startActivity(intent);
    }
}
