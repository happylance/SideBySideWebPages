package com.nlprliu.tysons28a;

import com.nlprliu.tysons28a.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 WebView webview1 = (WebView) findViewById(R.id.webView1);     
         
         // Enable Javascript
            //WebSettings webSettings = webview.getSettings();
            //webSettings.setJavaScriptEnabled(true);
            
         // Force links and redirects to open in the WebView instead of in a browser
            webview1.setWebViewClient(new WebViewClient());
            webview1.loadUrl("http://www.nextbus.com/webkit/predsForStop.jsp?a=wmata&r=28A&d=28A_28A_0&s=6261&standalone#_predictions");
       
            
            WebView webview2 = (WebView) findViewById(R.id.webView2);     
            webview2.setWebViewClient(new WebViewClient());
            webview2.loadUrl("http://www.nextbus.com/webkit/predsForStop.jsp?a=wmata&r=28T&d=28T_28T_0&s=6261&standalone#_predictions");
	}
	
	@Override
	protected void onResume() {
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
