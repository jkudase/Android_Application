package com.example.mc_assignment1;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;
import android.view.View;

public class Main2Activity extends AppCompatActivity {


    private VideoView vidView;
    private MediaController mdController;
    private String video_url,gesture;
    Button practice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            video_url = extras.getString("VIDEO_URL");
            gesture= extras.getString("gesture");
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        vidView = (VideoView)findViewById(R.id.video_view);
        vidView.setVideoPath(video_url);
        mdController = new MediaController(Main2Activity.this);
        mdController.setAnchorView(vidView);
//        mediaController.setPadding(0,0,0,1030);
        vidView.setMediaController(mdController);
        vidView.start();

        practice = (Button) findViewById(R.id.pratciceButton);
        practice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Main3Activity.class);
                intent.putExtra("gesture",gesture);
                startActivity(intent);
            }
        });

    }

}
