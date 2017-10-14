package bonetasticbooleans.gigme.Control;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import bonetasticbooleans.gigme.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("asd","ASDSA");
    }

    public static class StartScreen extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_start_screen);
        }
    }
}
