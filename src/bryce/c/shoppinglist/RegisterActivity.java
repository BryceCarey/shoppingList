package bryce.c.shoppinglist;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.text.method.PasswordTransformationMethod;
import android.view.Menu;
import android.widget.EditText;

public class RegisterActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		
		// Fixes the odd spacing in text from using android:inputType="textPassword" in layout
		EditText password = (EditText) findViewById(R.id.passwordText);
		password.setTypeface(Typeface.DEFAULT);
		password.setTransformationMethod(new PasswordTransformationMethod());	
		
		// Fixes the odd spacing in text from using android:inputType="textPassword" in layout
		EditText passwordConfirm = (EditText) findViewById(R.id.passwordConfirmText);
		password.setTypeface(Typeface.DEFAULT);
		password.setTransformationMethod(new PasswordTransformationMethod());	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_register, menu);
		return true;
	}

}
