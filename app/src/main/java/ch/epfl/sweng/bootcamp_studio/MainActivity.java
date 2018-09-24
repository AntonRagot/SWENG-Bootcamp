package ch.epfl.sweng.bootcamp_studio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

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
