package com.example.thanayut.myadroidproject2nd;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login_click = (Button)findViewById(R.id.login_but);
        final EditText user = (EditText)findViewById(R.id.user);
        final EditText pass = (EditText)findViewById(R.id.pass);

        login_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             String user_value = user.getText().toString();
             String pass_value = pass.getText().toString();
                Log.v("Input 1 = : "+user_value,"Input 2 = : "+pass_value);
                if(user_value.equals(pass_value)){
                    Log.v("Result : ","same value");
                }
                else {
                    Log.v("Result : ","difference value");
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
