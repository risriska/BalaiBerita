package com.Balaiberita;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class BalaiBerita extends Activity implements OnClickListener{
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		View enter = findViewById(R.id.open);
		enter.setOnClickListener(this);
		View about = findViewById(R.id.about);
		about.setOnClickListener(this);
		View close = findViewById(R.id.exit);
		close.setOnClickListener(this);
	}
	
	public void onClick(View v) {
		switch (v.getId()) {
		
		case R.id.open:
			Intent masuk = new Intent(this, OpenWeb.class);
			startActivity(masuk);
			break;
		
		case R.id.about:
			AlertDialog.Builder builder = new AlertDialog.Builder(this);
			builder.setMessage("Balai Berita \nversion 1.1 \n© by PT Borneo Teknologi I."
					+ "\nJakarta, 2013.").setCancelable(false)
			.setPositiveButton("OK",new DialogInterface.OnClickListener() { 
				public void onClick(DialogInterface dialog,int id) {
					dialog.cancel();}
				}).show();	
			break;
			
		case R.id.exit:
			Intent exit = new Intent(Intent.ACTION_MAIN);
			exit.addCategory(Intent.CATEGORY_HOME);
			exit.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
			startActivity(exit);
		}
		
	}
}