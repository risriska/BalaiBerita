package com.Balaiberita;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;

public class OpenWeb extends Activity implements OnClickListener {
    WebView browser;

    public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
        setContentView(R.layout.openweb);
        browser=(WebView) findViewById(R.id.webview1);
        browser.loadUrl("http://www.balaiberita.com/");
        // alamat url yang akan dibuka
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}
 
