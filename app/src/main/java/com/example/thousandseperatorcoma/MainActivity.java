package com.example.thousandseperatorcoma;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public String thousand_separator(String yh1 )
    {

        String yh2 = yh1;

        try {
            yh2 =yh2.substring(0,yh2.indexOf("."));

        }catch (Exception e)
        {

        }

        String yh3 = "";

        try {

         yh3 =  yh1.substring(yh1.indexOf("."));
        }catch (Exception e)
        {

        }



        String yh4 = "";

        int k=0;

        for(int i=yh2.length()-1;i>=0;i--)

        {
            k++;
        yh4 =yh2.charAt(i) + yh4;

       if((k)%3==0 && i!=0) yh4 =','+yh4;
        }


         return yh4+yh3;


    }


    public void msg_box(String msg)
    {


        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("Alert");
        alertDialog.setMessage(msg);
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

        alertDialog.show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //msg_box(thousand_separator("121332455635245.4455677"));
        msg_box(thousand_separator("3334255.446"));
        //msg_box(100/1000+"");

    }
}