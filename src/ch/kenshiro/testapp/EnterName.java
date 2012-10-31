package ch.kenshiro.testapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EnterName extends Fragment {
	public EnterName() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		View view = (View) inflater.inflate(R.layout.testlayout, container, false);
		
		Button button = (Button)view.findViewById(R.id.button1);
	    button.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
//				 EditText name = (EditText) v.findViewById(R.id.editText1);
				EditText name = (EditText) ((View) v.getParent()).findViewById(R.id.editText1);
				name.getText();
				 TextView textView = (TextView) ((View) v.getParent()).findViewById(R.id.textView1);
				 textView.setText(name.getText().toString());				
			}
		});
		return view;
//		return super.onCreateView(inflater, container, savedInstanceState);
	}
	
	public void onButtonClick(View view){

	 
	}
	

}
