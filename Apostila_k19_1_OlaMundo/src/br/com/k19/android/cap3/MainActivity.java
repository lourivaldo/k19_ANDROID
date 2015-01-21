package br.com.k19.android.cap3;

import br.com.k19.android.cap2.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.linear);
		
		final EditText nameEditText = (EditText) findViewById(R.id.name_edit_text);
		final Button seeMessageButton = (Button) findViewById(R.id.see_message_button);
		final TextView showMessageText = (TextView) findViewById(R.id.show_message_text);
		
		seeMessageButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String name = nameEditText.getEditableText().toString();
				showMessageText.setText(getString(R.string.hello_message, name));
				showMessageText.setVisibility(View.VISIBLE);
			}
		});
	}	
}
