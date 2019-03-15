package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.webkit.*;
import android.view.*;

public class MainActivity extends Activity 
{ 
	WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		wv = (WebView)
			findViewById(R.id.wv_id);
		WebSettings webSettings = wv.getSettings();
		webSettings.setJavaScriptEnabled(true);
			
		String frameVideo = ("<iframe width=100% height='200' src='https://www.youtube.com/embed/YR5ApYxkU-U' frameborder='0' allow='accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture' allowfullscreen></iframe>");
		wv.loadData(frameVideo, "text/html", "utf-8");
			
		
		/*
		wv.loadUrl("https://m.youtube.com");
		WebSettings webSettings = wv.getSettings();
		//Habilitando o JavaScript
		webSettings.setJavaScriptEnabled(true);*/
    }
	
	public void onClickSetLinkWebMap(View view){

		//finish();
		wv.loadUrl("https://www.google.com.br/search?q=significado+de+saneamento&sourceid=chrome-mobile&ie=UTF-8&inm=vs#tts=0");
		
	}
}

