package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.webkit.*;
import android.view.*;
import android.widget.*;
import android.widget.SeekBar.*;

public class MainActivity extends Activity 
{ 
	WebView wv;
	SeekBar seekB;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		initializeVariables ();
		
		wv = (WebView)
			findViewById(R.id.webV_id);
		WebSettings webSettings = wv.getSettings();
		webSettings.setJavaScriptEnabled(true);
			
		String frameVideo = ("<iframe width=100% height='300' src='https://www.youtube.com/embed/YR5ApYxkU-U' frameborder='0' allow='accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture' allowfullscreen></iframe>");
		wv.loadData(frameVideo, "text/html", "utf-8");
		
		seekB = (SeekBar) findViewById(R.id.seekB_id);
		seekB.setProgress(1);
		
		
	    seekB.setOnSeekBarChangeListener(new OnSeekBarChangeListener(){
			
			int progress = 0;
			
			public void onProgressChanged(
					SeekBar sb,int progressValue, 
					boolean fromUser)
				{
				Toast.makeText(
					getApplicationContext(), 
					"Started tracking seekbar"+progressValue, 
					Toast.LENGTH_SHORT).show();
				}
			public void  onStartTrackingTouch(SeekBar sb){
				
			}
			public  void onStopTrackingTouch(SeekBar sb){
				
			}
			
			
		});
	
			}

	public void initializeVariables () {

		
	}
		
	
}

