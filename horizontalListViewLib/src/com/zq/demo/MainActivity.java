package com.zq.demo;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

import com.zq.tv.HListView;
import com.zq.tv.R;

public class MainActivity extends Activity {


	public MainActivity instance;
	
	private HListView group;

	private CustomData[] mCustomData = new CustomData[] {
			new CustomData(Color.RED, "1Red"),
			new CustomData(Color.DKGRAY, "2Red"),
			new CustomData(Color.GREEN, "3Red"),
			new CustomData(Color.LTGRAY, "4Red"),
			new CustomData(Color.WHITE, "5Red"),
			new CustomData(Color.MAGENTA, "6Red"),
			new CustomData(Color.YELLOW, "7Red"),
			new CustomData(Color.MAGENTA, "8Red"),
			new CustomData(Color.MAGENTA, "9Red"),
			new CustomData(Color.MAGENTA, "10ed"),
			new CustomData(Color.MAGENTA, "11ed"),
			new CustomData(Color.MAGENTA, "12ed"),
			new CustomData(Color.MAGENTA, "13ed")};

	private String[] mCustomData2 = new String[]{
		"t1.jpg","t2.jpg","t3.jpg","t4.jpg","t5.jpg","t6.jpg","t7.jpg","t8.jpg",
		"t9.jpg","t10.jpg","t11.jpg","t12.jpg","t13.jpg"
	};

	private int index=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		instance = this;
		
		setContentView(R.layout.activity_main);
		group = (HListView) this.findViewById(R.id.group);

		CustomArrayAdapter2 adapter2 = new CustomArrayAdapter2(this, mCustomData2);

	
		group.setAdapter(adapter2);
		
		group.setFocusable(true);
		

		
	
	}

}
