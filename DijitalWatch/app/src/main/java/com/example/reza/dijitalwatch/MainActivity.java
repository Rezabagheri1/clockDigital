package com.example.reza.dijitalwatch;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;


public class MainActivity extends AppCompatActivity implements MediaPlayer.OnCompletionListener{
    int Minute=0;

    private TextView hours,minute,colon,seconds,days,months,years,weeks;
    private Button click;
    private RadioGroup rg;

    private int[] sounds ={
            R.raw.yazda11,R.raw.dah10,R.raw.se3,R.raw.shanzda16,0
    };
    int[] sounds1={
            0,
            R.raw.yek,R.raw.doo,R.raw.se3,R.raw.char4,R.raw.panj5,R.raw.shesh,
            R.raw.haft7,R.raw.hasht8,R.raw.noh9,
            R.raw.dah10,R.raw.yazda11,R.raw.davazda12, R.raw.sizda13,
            R.raw.charda14,R.raw.panzda15,R.raw.shanzda16,R.raw.hefda17,
            R.raw.hejda18,R.raw.nozda19,R.raw.bist20
    };
    int[] sounds1o={
            0,
            R.raw.yeko1,R.raw.doo2,R.raw.seo3,R.raw.charo4,
            R.raw.panjo5,R.raw.shesho6,R.raw.hafto7,
            R.raw.hashto8,R.raw.noho9,R.raw.daho10,
            R.raw.yazdao11,R.raw.davazdao12,R.raw.sizdao13,
            R.raw.chardao14,R.raw.panzdao15, R.raw.shanzdao16,
            R.raw.hefdao17,R.raw.hejdao18,R.raw.nozdaho19,R.raw.bisto20
    };
    int[] sounds10o={
            0, R.raw.daho10,R.raw.bisto20,R.raw.si_o,R.raw.chel_o40, R.raw.panja_o
    };
    int[] sounds10={
            0, R.raw.dah10,R.raw.bist20,R.raw.si,R.raw.chel40, R.raw.panja
    };
    private int loc=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rg = (RadioGroup) findViewById(R.id.select);

       /* rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.hours12:
                        // do operations specific to this selection
                        break;
                    case R.id.hours24:
                        // do operations specific to this selection
                        break;
                }
            }
        });
*/
        hours = (TextView) findViewById(R.id.hours);
        minute = (TextView) findViewById(R.id.minute);
        seconds = (TextView) findViewById(R.id.seconds);
        days =(TextView)findViewById(R.id.day);
        months =(TextView)findViewById(R.id.month);
        years =(TextView)findViewById(R.id.year);
        weeks =(TextView)findViewById(R.id.week);
        colon = (TextView) findViewById(R.id.colon);
        click =(Button)findViewById(R.id.click);

        Typeface type = Typeface.createFromAsset(getAssets(), "fonts/digital7.ttf");
        hours.setTypeface(type);
        minute.setTypeface(type);
        seconds.setTypeface(type);
        days.setTypeface(type);
        weeks.setTypeface(type);
        months.setTypeface(type);
        years.setTypeface(type);
        colon.setTypeface(type);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


        Date d = new Date();
        int h = d.getHours();
        int m = d.getMinutes();
        int s = d.getSeconds();

        String hs = String.format("%02d", h);
        String ms = String.format("%02d", m);
        String ss = String.format("%02d", s);

        minute.setText(ms);
        seconds.setText(ss);
        loc=0;

        int selectp;
                selectp = rg.getCheckedRadioButtonId();

                    if (selectp==R.id.hours12){
                        int h12 =h-12;

                        hours.setText(String.valueOf(h12));

                    }
                    else if (selectp==R.id.hours24){

                        hours.setText(hs);
                    }

                    /*
                    rg = (RadioGroup)rootView.findViewById(R.id.select);
                rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        // find which radio button is selected
                        if(checkedId == R.id.hours12) {
                            Toast.makeText(getActivity().getApplicationContext(), "choice: A",
                                    Toast.LENGTH_SHORT).show();
                        } else if(checkedId == R.id.hours24) {
                            Toast.makeText(MainActivity,getApplicationContext(), "choice: B",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }

                });*/

        int i=0;
        sounds[i++] = m==0 ?sounds1[h]:sounds1o[h];

        if (m<20)
            sounds[i++]=sounds1[m];
        else {

            int m10 = m/10;
            int m1 =m%10;
            sounds[i++]= m1==0 ? sounds10[m10] : sounds10o[m10];
            if (m1 != 0)
                sounds[i++]=sounds1[m1];

        }

        if (m!=0)

            sounds[i++]=R.raw.daghi;

        sounds[i++]=0;

        MediaPlayer mp =MediaPlayer.create(MainActivity .this,R.raw.saat1 );
        mp.setOnCompletionListener(MainActivity.this);
        mp.start();
    }

    });}

        @Override
        public void onCompletion(MediaPlayer mp) {
                if (sounds[loc] != 0) {
        MediaPlayer m = MediaPlayer.create(this, sounds[loc]);
        loc++;
        m.setOnCompletionListener(this);
        m.start();
        }
        }
}


