package com.example.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class ThridActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
	requestWindowFeature(Window.FEATURE_NO_TITLE);
	setContentView(R.layout.thrid_layout);
//	Button button3=(Button) findViewById(R.id.button3);
//	button3.setOnClickListener(new OnClickListener() {
//		
//		@Override
//		public void onClick(View arg0) {
//			Toast.makeText(ThridActivity.this, "正在打开浏览器",Toast.LENGTH_LONG).show();
//			Intent intent=new Intent(Intent.ACTION_VIEW);
//			intent.setData(Uri.parse("http://www.baidu.com"));
//			startActivity(intent);
//			finish();
//			
//		}
//	});
	}

}
