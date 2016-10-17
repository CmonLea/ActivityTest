package com.example.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class SecondActivity extends Activity{
@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	requestWindowFeature(Window.FEATURE_NO_TITLE);
	setContentView(R.layout.second_layout);
	Button button2=(Button) findViewById(R.id.button2);
	button2.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO �Զ����ɵķ������
			//���button2���ٵ�ǰ�ҳ��
			Intent intent=new Intent(Intent.ACTION_VIEW);
			intent.setData(Uri.parse("http://www.baidu.com"));
			startActivity(intent);
			finish();
		}
	});
}
}