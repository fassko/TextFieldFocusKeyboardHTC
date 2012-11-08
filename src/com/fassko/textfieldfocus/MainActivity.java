package com.fassko.textfieldfocus;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    @Override
	public boolean onKeyDown(int key, KeyEvent event) {

		if (key == KeyEvent.KEYCODE_SEARCH) {
			showHideSearchBar();
		}
		
		return super.onKeyDown(key, event);
    }
    
    public void showHideSearchBar () {
		// clear search input
		EditText input = (EditText) findViewById(R.id.list_search_input);
		input.setText(null);
		
		input.requestFocus();
		
	
		// show keyboard
		InputMethodManager inputManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
		inputManager.showSoftInput(input, InputMethodManager.SHOW_IMPLICIT);
    }
}
