package com.example.activitytest;

import android.app.Activity;
import android.os.Bundle;

public class FirstActivity extends Activity{
	//重新oncreate方法
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自动生成的方法存根
		super.onCreate(savedInstanceState);
		//在活动中加载布局,使用setContentView方法，然后在AndroidManifest文件中注册活动
		setContentView(R.layout.first_layout);
	}

}
