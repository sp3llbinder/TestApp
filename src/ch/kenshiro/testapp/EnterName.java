package ch.kenshiro.testapp;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
				EditText name = (EditText) ((View) v.getRootView()).findViewById(R.id.editText1);
				
//				 TextView textView = (TextView) ((View) v.getRootView()).findViewById(R.id.textView1);
//				 textView.setText(name.getText().toString());
				
				
				LayoutInflater inflater2 = (LayoutInflater) v.getRootView().getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				View layout = inflater2.inflate(R.layout.test_toast,
				                               (ViewGroup) ((View) v.getRootView()).findViewById(R.id.toast_layout_root));

				TextView text = (TextView) layout.findViewById(R.id.showName);
				text.setText(name.getText());

				Toast toast = new Toast(v.getRootView().getContext());
				toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
				toast.setDuration(Toast.LENGTH_LONG);
				toast.setView(layout);
				toast.show();
				
				//Toast.makeText(v.getRootView().getContext(), name.getText(), Toast.LENGTH_LONG).show();
				
			}
		});
		return view;

	}
	
	public void onButtonClick(View view){

	 
	}
	

}
