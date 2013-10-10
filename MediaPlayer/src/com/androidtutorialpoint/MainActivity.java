package com.androidtutorialpoint;
 


import android.app.Activity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
 
public class MainActivity extends Activity {
  
 String SrcPath = "/sdcard/sample.mp4";//location of ur file
  
   /** Called when the activity is first created. */
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       VideoView myVideoView = (VideoView)findViewById(R.id.myvideoview);
       myVideoView.setVideoPath(SrcPath);
       myVideoView.setMediaController(new MediaController(this));
       myVideoView.requestFocus();
       myVideoView.start();
   }
}