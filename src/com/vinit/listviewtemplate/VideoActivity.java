package com.vinit.listviewtemplate;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class VideoActivity extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState) 
    {
     super.onCreate(savedInstanceState);
      setContentView(R.layout.videoplaying);
      VideoView video=(VideoView)findViewById(R.id.vvStory);
      video.setVideoURI(Uri.parse("http://video.ted.com/talk/podcast/2010/Disrupt/StaceyKramer_2010.mp4"));
      video.start();
    }

}
