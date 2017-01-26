package com.example.andrea.progectsinglescreenapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Cliccable address
        TextView address = (TextView) findViewById(R.id.address);
        address.setMovementMethod(LinkMovementMethod.getInstance());

        final ImageView gallery = (ImageView)findViewById(R.id.gallery);
        final int[] imgIds = {R.drawable.m_1,R.drawable.p_1,R.drawable.p_2,R.drawable.p_3,R.drawable.p_4,R.drawable.p_5,R.drawable.p_6,R.drawable.s_1,R.drawable.s_2,R.drawable.t_1,R.drawable.t_2,R.drawable.t_3};
        gallery.setImageResource(imgIds[0]);


        ImageButton previous = (ImageButton)findViewById(R.id.skip_previous);
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (i==0){
                    gallery.setImageResource(imgIds[(imgIds.length)-1]);
                    i=(imgIds.length)-1;
                }else {
                    gallery.setImageResource(imgIds[i-1]);
                    i=i-1;
                }
            }
        });

        ImageButton next =(ImageButton)findViewById(R.id.skip_next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==imgIds.length-1){
                    gallery.setImageResource(imgIds[0]);
                    i=0;
                }else{
                    gallery.setImageResource(imgIds[i+1]);
                    i=i+1;
                }
            }
        });
    }

}
