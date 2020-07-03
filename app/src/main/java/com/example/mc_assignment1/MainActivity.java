package com.example.mc_assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    String videoPath;
    Spinner mysignSpinner;
    Button watchButton;
    String signInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mysignSpinner = (Spinner) findViewById(R.id.signSpinner);
        watchButton = (Button) findViewById(R.id.watchButton);

        ArrayAdapter<String> signDDAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.signDropDown));
        signDDAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mysignSpinner.setAdapter(signDDAdapter);
        mysignSpinner.setOnItemSelectedListener(this);

        watchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Main2Activity.class);
                intent.putExtra("VIDEO_URL", videoPath);
                intent.putExtra("gesture",signInput);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        signInput= parent.getItemAtPosition(position).toString();
//        Toast.makeText(parent.getContext(), signInput, Toast.LENGTH_SHORT).show();
//        videoPath = createVideoURL(signInput);
        if (!mysignSpinner.equals(signInput)) {
            videoPath=createVideoURL(signInput);
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


    public String createVideoURL(String signInput) {

        String url = null;
        if (signInput.equals("Buy")) {
            url="https://www.signingsavvy.com/media/mp4-ld/6/6442.mp4";
        }else if (signInput.equals("House")) {
            url="https://www.signingsavvy.com/media/mp4-ld/23/23234.mp4";
        } else if (signInput.equals("Fun")) {
            url = "https://www.signingsavvy.com/media/mp4-ld/22/22976.mp4";
        } else if (signInput.equals("Hope")) {
            url = "https://www.signingsavvy.com/media/mp4-ld/22/22197.mp4";
        } else if (signInput.equals("Arrive")) {
            url = "https://www.signingsavvy.com/media/mp4-ld/26/26971.mp4";
        } else if (signInput.equals("Really")) {
            url = "https://www.signingsavvy.com/media/mp4-ld/24/24977.mp4";
        } else if (signInput.equals("Read")) {
            url = "https://www.signingsavvy.com/media/mp4-ld/7/7042.mp4";
        } else if (signInput.equals("Lip")) {
            url= "https://www.signingsavvy.com/media/mp4-ld/26/26085.mp4";
        } else if (signInput.equals("Mouth")) {
            url = "https://www.signingsavvy.com/media/mp4-ld/22/22188.mp4";
        } else if (signInput.equals("Some")) {
            url = "https://www.signingsavvy.com/media/mp4-ld/23/23931.mp4";
        } else if (signInput.equals("Communicate")) {
            url = "https://www.signingsavvy.com/media/mp4-ld/22/22897.mp4";
        } else if (signInput.equals("Write")) {
            url = "https://www.signingsavvy.com/media/mp4-ld/27/27923.mp4";
        } else if (signInput.equals("Create")) {
            url = "https://www.signingsavvy.com/media/mp4-ld/22/22337.mp4";
        } else if (signInput.equals("Pretend")) {
            url = "https://www.signingsavvy.com/media/mp4-ld/25/25901.mp4";
        } else if (signInput.equals("Sister")) {
            url = "https://www.signingsavvy.com/media/mp4-ld/21/21587.mp4";
        } else if (signInput.equals("Man")) {
            url = "https://www.signingsavvy.com/media/mp4-ld/21/21568.mp4";
        } else if (signInput.equals("One")) {
            url = "https://www.signingsavvy.com/media/mp4-ld/26/26492.mp4";
        } else if (signInput.equals("Drive")) {
            url = "https://www.signingsavvy.com/media/mp4-ld/23/23918.mp4";
        } else if (signInput.equals("Perfect")) {
            url = "https://www.signingsavvy.com/media/mp4-ld/24/24791.mp4";
        } else if (signInput.equals("Mother")) {
            url = "https://www.signingsavvy.com/media/mp4-ld/21/21571.mp4";
        }
        return url;
    }
}
