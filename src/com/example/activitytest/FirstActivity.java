package com.example.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends Activity{
	//重新oncreate方法
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		//在活动中加载布局,使用setContentView方法，然后在AndroidManifest文件中注册活动
		requestWindowFeature(Window.FEATURE_NO_TITLE);//隐藏标题栏
		setContentView(R.layout.first_layout);
		Button button1= (Button) findViewById(R.id.button1);
		
	
		button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Toast.makeText(FirstActivity.this, "you clicked Button 1", Toast.LENGTH_LONG).show();
				//在活动内销毁活动
				//finish();
				//1、显示Intent
//				Intent intent =new Intent(FirstActivity.this,SecondActivity.class);
//				startActivity(intent);
				
				//2、隐式Intent
//				Intent intent =new Intent("com.example.activity.activitytest.ACTION_START");
//				intent.addCategory("com.example.activity.activitytest.MY_CATEGORY");
//				startActivity(intent);
				
				//3、更多隐式Intent的用法
				Intent intent=new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("http://www.baidu.com"));
				startActivity(intent);
			}
		});
	}
@Override
public boolean onCreateOptionsMenu(Menu menu) {
	getMenuInflater().inflate(R.menu.main, menu);
	
	return true;
}
@Override
public boolean onOptionsItemSelected(MenuItem item) {
	
switch (item.getItemId()) {
case R.id.add_tem:
	Toast.makeText(this, "you clicked Add", Toast.LENGTH_LONG).show();;
	break;

case R.id.remove_item:
	Toast.makeText(this, "you clicked Remove", Toast.LENGTH_LONG).show();;
	
	break;
}
return true;
}

}
