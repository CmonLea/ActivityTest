package com.example.activitytest;

import android.app.Activity;
import android.os.Bundle;

public class FirstActivity extends Activity{
	//����oncreate����
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO �Զ����ɵķ������
		super.onCreate(savedInstanceState);
		//�ڻ�м��ز���,ʹ��setContentView������Ȼ����AndroidManifest�ļ���ע��
		setContentView(R.layout.first_layout);
	}

}
