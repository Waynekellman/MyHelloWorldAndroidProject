package nyc.c4q.myhelloworldandroidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private TextView textWidget;

    private static final String KEY_MY_STRING = "MY_STRING";

    private String myString;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(KEY_MY_STRING, myString);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textWidget = (TextView) findViewById(R.id.class_example_textview);
        textWidget.setText("Hello, Android");
        logCheck("onCreate");
    }
    public void logCheck(String TAG){

        Log.d(this.TAG, TAG + " Method has Run!");
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        logCheck("onStart");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        logCheck("onResume");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        logCheck("onPause");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        logCheck("onStop");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        logCheck("onRestart");

    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        logCheck("onDestroy");
    }
}
