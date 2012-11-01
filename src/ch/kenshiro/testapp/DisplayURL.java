package ch.kenshiro.testapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class DisplayURL extends Fragment {
	
	public DisplayURL() {

	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = (View) inflater.inflate(R.layout.layout_display_url, container, false);
		
		Button button = (Button)view.findViewById(R.id.loadURL);
	    button.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

				EditText inputURL = (EditText) ((View) v.getRootView()).findViewById(R.id.inputURL);

				WebView webView = (WebView) ((View) v.getRootView()).findViewById(R.id.webView);
				webView.setWebViewClient(new WebViewClient() {  
					   @Override  
					   public boolean shouldOverrideUrlLoading(WebView view, String url)  
					   {  
					       view.loadUrl(url);
					       return false;

					    }  
					 });
					webView.loadUrl(inputURL.getText().toString());

			}
		});
		return view;
	}

	
	
	
}
