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
	TextView tv_resultado;
	SeekBar seekB;
	
	String linkVideo;
	int intStart;
	String startVideo;
	String frameVideo;
	String frameTeste;
	
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
		
		linkVideo = "https://www.youtube.com/embed/YR5ApYxkU-U";
		intStart = 0;
		startVideo = "?start=" + intStart;
		
		frameTeste = "src=' link "+startVideo+"' frameborder";
		frameVideo = ("<iframe width=100% height='300' src='"+linkVideo+startVideo+"' frameborder='0' allow='accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture' allowfullscreen></iframe>");
		wv.loadData(frameVideo, "text/html", "utf-8");
		
		
	    seekB.setOnSeekBarChangeListener(new OnSeekBarChangeListener(){
			
			public void onProgressChanged(
					SeekBar sb,int progressValue, 
					boolean fromUser)
				{
				
				//intStart = progressValue;
				//startVideo = "?start=" + progressValue;
				 
			tv_resultado.setText(embedVideo(progressValue));
				}
			public void  onStartTrackingTouch(SeekBar sb){
				//tv_resultado.setText("ON Start");
			}
			public  void onStopTrackingTouch(SeekBar sb){
				//tv_resultado.setText("on stop");
				wv.loadData(frameVideo, "text/html", "utf-8");
				
			}
			
			
		});
	
			}

	public void initializeVariables () {
		
		// SeekBar
		seekB = (SeekBar) findViewById(R.id.seekB_id);
		seekB.setProgress(1);
		// TextView
		tv_resultado = (TextView)
			findViewById(R.id.tv_resultSeekBar_id);
	}
	
	public String embedVideo(int intStart){
		
		linkVideo = "https://www.youtube.com/embed/YR5ApYxkU-U";
		
		startVideo = "?start=" + intStart;

		frameTeste = "src=' link "+startVideo+"' frameborder";
		
		return frameTeste;
	}
		
	
}

