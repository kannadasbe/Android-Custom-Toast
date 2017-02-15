package com.crazygeeksblog.androidtoastexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // OnClick listener for button btnDefaultToast
    public void defaultToastClick(View view) {
        String toastMessage = "This is default toast message";
        int toastLength = Toast.LENGTH_LONG;
        Toast.makeText(getApplicationContext(), toastMessage, toastLength).show();
    }

    // OnClick listener for button btnCustomToast
    public void customToastClick(View view) {
        // Inflate the custom view created for toast
        LayoutInflater myInflator=getLayoutInflater();
        View myLayout=myInflator.inflate(R.layout.customtoast,(ViewGroup)findViewById(R.id.rlRoot) );
        // Set the toast message
        TextView tvMessage=(TextView)myLayout.findViewById(R.id.txtvdisplay);
        tvMessage.setText("This is custom toast message");

        // Show the custom toast
        Toast myToast=new Toast(getApplicationContext());
        myToast.setDuration(Toast.LENGTH_LONG);
        myToast.setView(myLayout);
        myToast.show();
    }
}
