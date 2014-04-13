package com.nlprliu.tysons28a;

import com.nlprliu.tysons28a.R;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.view.View.OnLongClickListener;

public class MainActivity extends Activity {
	private WebView webview1;
	private WebView webview2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		webview1 = (WebView) findViewById(R.id.webView1);     
		
         // Force links and redirects to open in the WebView instead of in a browser
		webview1.setWebViewClient(new WebViewClient());
		webview1.loadUrl("http://www.nextbus.com/webkit/predsForStop.jsp?a=wmata&r=28A&d=28A_28A_0&s=6261&standalone#_predictions");

		webview2 = (WebView) findViewById(R.id.webView2);
		webview2.setWebViewClient(new WebViewClient());
		webview2.loadUrl("http://www.nextbus.com/webkit/predsForStop.jsp?a=wmata&r=28T&d=28T_28T_0&s=6261&standalone#_predictions");

		// gestureDetector = new GestureDetector(this, new GestureListener());

		webview1.setOnLongClickListener(new OnLongClickListener() {
			@Override
			public boolean onLongClick(View v) {
				final Handler handler = new Handler();
				handler.postDelayed(new Runnable() {
					@Override
					public void run() {
						// Do something after 100ms
						webview1.reload();
						webview2.reload();
					}
				}, 100);
				return true;
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
