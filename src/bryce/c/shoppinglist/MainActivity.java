package bryce.c.shoppinglist;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Fixes the odd spacing in text from using android:inputType="textPassword" in layout
		EditText password = (EditText) findViewById(R.id.passwordText);
		password.setTypeface(Typeface.DEFAULT);
		password.setTransformationMethod(new PasswordTransformationMethod());		
		
		final Button btnLogin = (Button) findViewById(R.id.loginButton);
		final Button btnRegister = (Button) findViewById(R.id.registerButton);		  
	
		  View.OnClickListener handler = new View.OnClickListener(){
	
		  public void onClick(View v) {
	
		    if(v == btnLogin)
		    { 
		            // Switch to "Log In" activity
		            Intent intentMain = new Intent(MainActivity.this, RegisterActivity.class);
		            MainActivity.this.startActivity(intentMain);
		            Log.i("Content "," Main layout ");
		    }
	
		    if(v == btnRegister)
		    { 
		            // Switch to "Register" activity
		            Intent intentApp = new Intent(MainActivity.this, RegisterActivity.class);
	
		            MainActivity.this.startActivity(intentApp);
	
		            Log.i("Content "," App layout ");
	
		    }
		   }
		  };
		  
		  // Set buttons to be handled by onClick
		  btnLogin.setOnClickListener(handler);
		  btnRegister.setOnClickListener(handler);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
