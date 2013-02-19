package olga.koteoglou.apptemplate;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		boolean titled = requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		setContentView(R.layout.activity_main);
		if(titled){
			getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.custom_title_bar);
		}
		
		((Button) findViewById(R.id.title_bar_button1))
		.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				TextView tx = (TextView)findViewById(R.id.text_view);
				tx.setText(R.string.title_bar_button1);
			}
		});
		((Button) findViewById(R.id.title_bar_button2))
		.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				TextView tx = (TextView)findViewById(R.id.text_view);
				tx.setText(R.string.title_bar_button2);
			}
		});
		((Button) findViewById(R.id.title_bar_button3))
		.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				TextView tx = (TextView)findViewById(R.id.text_view);
				tx.setText(R.string.title_bar_button3);
			}
		});
		((ImageButton) findViewById(R.id.Button1))
		.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				TextView tx = (TextView)findViewById(R.id.text_view);
				tx.setText(R.string.menu_button1);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
