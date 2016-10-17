package com.example.activitytest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends Activity{
	//����oncreate����
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO �Զ����ɵķ������
		super.onCreate(savedInstanceState);
		//�ڻ�м��ز���,ʹ��setContentView������Ȼ����AndroidManifest�ļ���ע��
		requestWindowFeature(Window.FEATURE_NO_TITLE);//���ر�����
		setContentView(R.layout.first_layout);
		Button button1= (Button) findViewById(R.id.button1);
		
	
		button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Toast.makeText(FirstActivity.this, "you clicked Button 1", Toast.LENGTH_LONG).show();
				
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
