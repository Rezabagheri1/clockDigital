package com.example.reza.dijitalwatch;
import android.os.Handler;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;


public class MainActivity extends AppCompatActivity {
    int Minute=0;
    Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface fn =Typeface.createFromAsset(getAssets(),"fonts/digital-7.ttf");
        TextView tm =(TextView) findViewById(R.id.saat);
        tm.setTypeface(fn);
        TextView tm0 =(TextView) findViewById(R.id.time0);
        tm0.setTypeface(fn);
        TextView tm1 =(TextView) findViewById(R.id.daghighe);
        tm1.setTypeface(fn);
        TextView tm2 =(TextView) findViewById(R.id.saniye);
        tm2.setTypeface(fn);

        TextView tm3 =(TextView) findViewById(R.id.time4);
        tm3.setTypeface(fn);
        TextView tm4 =(TextView) findViewById(R.id.time5);
        tm4.setTypeface(fn);
        TextView tm5 =(TextView) findViewById(R.id.time6);
        tm5.setTypeface(fn);
        TextView tm6 =(TextView) findViewById(R.id.time7);
        tm6.setTypeface(fn);

        Date d =new Date();
        final int h = d.getHours();
        final int m  =d.getMinutes();
        final int s = d.getSeconds();
        final TextView Hours =(TextView)findViewById(R.id.saat);
        final TextView minute =(TextView)findViewById(R.id.daghighe);
        final TextView second =(TextView)findViewById(R.id.saniye);

        final MediaPlayer mp = MediaPlayer.create(this , R.raw.saat1);
        final MediaPlayer mp1 =MediaPlayer.create(this,R.raw.yek);
        final MediaPlayer mp2 =MediaPlayer.create(this,R.raw.doo);
        final MediaPlayer mp3 =MediaPlayer.create(this,R.raw.se3);
        final MediaPlayer mp4 =MediaPlayer.create(this,R.raw.char4);
        final MediaPlayer mp5 =MediaPlayer.create(this,R.raw.panj5);
        final MediaPlayer mp6 =MediaPlayer.create(this,R.raw.shesh);
        final MediaPlayer mp7 =MediaPlayer.create(this,R.raw.haft7);
        final MediaPlayer mp8 =MediaPlayer.create(this,R.raw.hasht8);
        final MediaPlayer mp9 =MediaPlayer.create(this,R.raw.noh9);
        final MediaPlayer mp10 =MediaPlayer.create(this,R.raw.dah10);
        final MediaPlayer mp11 =MediaPlayer.create(this,R.raw.yazda11);
        final MediaPlayer mp12 =MediaPlayer.create(this,R.raw.davazda12);
        final MediaPlayer mp13 =MediaPlayer.create(this,R.raw.sizda13);
        final MediaPlayer mp14 =MediaPlayer.create(this,R.raw.charda14);
        final MediaPlayer mp15 =MediaPlayer.create(this,R.raw.panzda15);
        final MediaPlayer mp16 =MediaPlayer.create(this,R.raw.shanzda16);
        final MediaPlayer mp17 =MediaPlayer.create(this,R.raw.hefda17);
        final MediaPlayer mp18 =MediaPlayer.create(this,R.raw.hejda18);
        final MediaPlayer mp19 =MediaPlayer.create(this,R.raw.nozda19);
        final MediaPlayer mp20 =MediaPlayer.create(this,R.raw.bist20);
        final MediaPlayer mp30 =MediaPlayer.create(this,R.raw.si);
        final MediaPlayer mp40 =MediaPlayer.create(this,R.raw.chel40);
        final MediaPlayer mp50 =MediaPlayer.create(this,R.raw.panja);
        final MediaPlayer mp21 =MediaPlayer.create(this,R.raw.bistoyek21);
        final MediaPlayer mp22 =MediaPlayer.create(this,R.raw.bistodo22);
        final MediaPlayer mp23 =MediaPlayer.create(this,R.raw.bist0se23);

        final MediaPlayer mc24 =MediaPlayer.create(this,R.raw.va);
        final MediaPlayer mc26 =MediaPlayer.create(this,R.raw.va2);
        final MediaPlayer mc25 =MediaPlayer.create(this,R.raw.daghi);



        Button bt =(Button)findViewById(R.id.click);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Hours.setText(String.valueOf(h));
                minute.setText(String.valueOf(m));
                second.setText(String.valueOf(s));

                mp.start();



                if (h != 0 && m == 0) {
                    switch (h) {
                        case 1:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp1.start();

                                }
                            });
                            break;
                        case 2:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {

                                    mp2.start();
                                }
                            });
                            break;
                        case 3:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {

                                    mp3.start();
                                }
                            });
                            break;
                        case 4:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp4.start();
                                }
                            });
                            break;
                        case 5:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp5.start();
                                }
                            });
                            break;

                        case 6:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp6.start();
                                }
                            });
                            break;
                        case 7:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp7.start();
                                }
                            });
                            break;

                        case 8:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp8.start();
                                }
                            });
                            break;
                        case 9:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp9.start();
                                }
                            });
                            break;
                        case 10:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp10.start();
                                }
                            });
                            break;
                        case 11:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp11.start();
                                }
                            });
                            break;
                        case 12:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp12.start();
                                }
                            });
                            break;
                        case 13:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp13.start();
                                }
                            });
                            break;
                        case 14:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp14.start();
                                }
                            });
                            break;
                        case 15:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp15.start();
                                }
                            });
                            break;
                        case 16:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp16.start();
                                }
                            });
                            break;
                        case 17:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp17.start();
                                }
                            });
                            break;
                        case 18:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp18.start();
                                }
                            });
                            break;
                        case 19:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp19.start();
                                }
                            });
                            break;
                        case 20:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp20.start();
                                }
                            });
                            break;
                        case 21:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp21.start();
                                }
                            });
                            break;
                        case 22:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp22.start();
                                }
                            });
                            break;
                        case 23:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp23.start();
                                }
                            });
                            break;
                    }
                }

                if (h != 0 && m != 0) {

                    switch (h) {
                        case 1:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp1.start();
                                    mp1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc24.start();
                                        }
                                    });

                                }
                            });
                            break;
                        case 2:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {

                                    mp2.start();
                                    mp2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc24.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 3:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {

                                    mp3.start();
                                    mp3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc24.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 4:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp4.start();
                                    mp4.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc24.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 5:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp5.start();
                                    mp5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc24.start();
                                        }
                                    });
                                }
                            });
                            break;

                        case 6:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp6.start();
                                    mp6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc24.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 7:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp7.start();
                                    mp7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc24.start();
                                        }
                                    });
                                }
                            });
                            break;

                        case 8:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp8.start();
                                    mp8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc24.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 9:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp9.start();
                                    mp9.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc24.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 10:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp10.start();
                                    mp10.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc24.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 11:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp11.start();
                                    mp11.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc24.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 12:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp12.start();
                                    mp12.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc24.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 13:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp13.start();
                                    mp13.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc24.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 14:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp14.start();
                                    mp14.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc24.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 15:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp15.start();
                                    mp15.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc24.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 16:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp16.start();
                                    mp16.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc24.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 17:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp17.start();
                                    mp17.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc24.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 18:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp18.start();
                                    mp18.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc24.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 19:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp19.start();
                                    mp19.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc24.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 20:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp20.start();
                                    mp20.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc24.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 21:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp21.start();
                                    mp21.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc24.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 22:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp22.start();
                                    mp22.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc24.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 23:
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp23.start();
                                    mp23.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc24.start();
                                        }
                                    });
                                }
                            });
                            break;
                    }
                }


                if (m != 0) {
                    switch (m) {
                        case 1:
                            mc24.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp1.start();
                                    mp1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc25.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 2:
                            mc24.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp2.start();
                                    mp2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc25.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 3:
                            mc24.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp3.start();
                                    mp3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc25.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 4:
                            mc24.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp4.start();
                                    mp4.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc25.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 5:
                            mc24.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp5.start();
                                    mp5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc25.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 6:
                            mc24.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp6.start();
                                    mp6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc25.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 7:
                            mc24.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp7.start();
                                    mp7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc25.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 8:
                            mc24.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp8.start();
                                    mp8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc25.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 9:
                            mc24.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp9.start();
                                    mp9.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc25.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 10:
                            mc24.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp10.start();
                                    mp10.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc25.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 11:
                            mc24.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp11.start();
                                    mp11.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc25.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 12:
                            mc24.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp12.start();
                                    mp12.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc25.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 13:
                            mc24.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp13.start();
                                    mp13.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc25.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 14:
                            mc24.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp14.start();
                                    mp14.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc25.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 15:
                            mc24.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp15.start();
                                    mp15.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc25.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 16:
                            mc24.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp16.start();
                                    mp16.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc25.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 17:
                            mc24.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp17.start();
                                    mp17.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc25.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 18:
                            mc24.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp18.start();
                                    mp18.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc25.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 19:
                            mc24.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp19.start();
                                    mp19.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc25.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 20:
                            mc24.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp20.start();
                                    mp20.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc25.start();
                                        }
                                    });
                                }
                            });
                            break;
                            case 30:
                            mc24.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp30.start();
                                    mp30.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc25.start();
                                        }
                                    });
                                }
                            });
                            break;
                            case 40:
                            mc24.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp40.start();
                                    mp40.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc25.start();
                                        }
                                    });
                                }
                            });
                            break;
                        case 50:
                            mc24.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp50.start();
                                    mp50.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc25.start();
                                        }
                                    });
                                }
                            });
                            break;

                    }
                    if (h==0){
                    if (m>20&&m<30){
                        Minute=m-20;
                        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                mp20.start();
                                mp20.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mc24.start();
                                    }
                                });
                            }
                        });
                    }
                        if (m>30&&m<40){
                            Minute=m-30;
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp30.start();
                                    mp30.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc24.start();
                                        }
                                    });
                                }
                            });
                        }
                        if (m>40&&m<50){
                            Minute=m-40;
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp40.start();
                                    mp40.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc24.start();
                                        }
                                    });
                                }
                            });
                        }if (m>50&&m<=59){
                            Minute=m-50;
                            mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp50.start();
                                    mp50.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc24.start();
                                        }
                                    });
                                }
                            });
                        }

                    }

                    else if(h!=0){
                        if (m>20&&m<30){
                            Minute=m-20;
                            mc24.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp20.start();
                                    mp20.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc26.start();
                                        }
                                    });
                                }
                            });
                        }
                        else if (m>30&&m<40){
                                Minute=m-30;
                            mc24.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {

                                    mp30.start();
                                    mp30.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc26.start();

                                        }
                                    });

                                }
                            });

                        }
                        else if (m>40&&m<50){
                            Minute=m-40;
                            mc24.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp40.start();
                                    mp40.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc26.start();
                                        }
                                    });
                                }
                            });
                        }
                        else  if (m>50&&m<=59){
                            Minute=m-50;
                            mc24.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                @Override
                                public void onCompletion(MediaPlayer mp) {
                                    mp50.start();
                                    mp50.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                        @Override
                                        public void onCompletion(MediaPlayer mp) {
                                            mc26.start();
                                        }
                                    });
                                }
                            });
                        }
                    }
                    if (Minute!=0){
                        switch (Minute){
                            case 1:
                                mc26.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp1.start();
                                        mp1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                mc25.start();
                                            }
                                        });
                                    }
                                });break;
                            case 2:
                                mc26.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp2.start();
                                        mp2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                mc25.start();
                                            }
                                        });
                                    }
                                });break;
                             case 3:
                                mc26.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp3.start();
                                        mp3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                mc25.start();
                                            }
                                        });
                                    }
                                });break;
                             case 4:
                                mc26.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp4.start();
                                        mp4.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                mc25.start();
                                            }
                                        });
                                    }
                                });break;
                              case 5:
                                mc26.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp5.start();
                                        mp5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                mc25.start();
                                            }
                                        });
                                    }
                                });break;
                               case 6:
                                mc26.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp6.start();
                                        mp6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                mc25.start();
                                            }
                                        });
                                    }
                                });break;
                               case 7:
                                mc26.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp7.start();
                                        mp7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                mc25.start();
                                            }
                                        });
                                    }
                                });break;
                               case 8:
                                mc26.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp8.start();
                                        mp8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                mc25.start();
                                            }
                                        });
                                    }
                                });break;
                                case 9:
                                mc26.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                    @Override
                                    public void onCompletion(MediaPlayer mp) {
                                        mp9.start();
                                        mp9.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                                            @Override
                                            public void onCompletion(MediaPlayer mp) {
                                                mc25.start();
                                            }
                                        });
                                    }
                                });break;
                        }

                    }
                    }


            }
        });}
}


