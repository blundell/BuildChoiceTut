package com.blundell.tut.ui;

import com.blundell.tut.Config;
import com.blundell.tut.R;
import com.blundell.tut.util.AndroidUtils;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView versionText = (TextView) findViewById(R.id.textview_version);
        TextView buildText = (TextView) findViewById(R.id.textview_build);

        if(Config.LIVE){
        	buildText.setText("Application is running the live build");
        	versionText.setVisibility(View.GONE);
        } else {
        	buildText.setText("Application is running the development build");
        	versionText.setText(AndroidUtils.getVersion(this));
        }
    }
}