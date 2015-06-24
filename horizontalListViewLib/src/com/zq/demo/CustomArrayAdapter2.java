package com.zq.demo;

import com.example.customer.R;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * An array adapter that knows how to render views when given CustomData classes
 */
public class CustomArrayAdapter2 extends ArrayAdapter {
	private LayoutInflater mInflater;

	public CustomArrayAdapter2(Context context, String []values) {
		super(context, R.layout.custom_data_view, values);
		mInflater = (LayoutInflater) getContext().getSystemService(
				Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		return 12;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Holder holder;
		
		if (convertView == null) {
			// Inflate the view since it does not exist
			convertView = mInflater.inflate(R.layout.custom_data_view2, parent,
					false);

			// Create and save off the holder in the tag so we get quick access
			// to inner fields
			// This must be done for performance reasons
			holder = new Holder();
			holder.textView = (ImageView) convertView
					.findViewById(R.id.textView);
		
			convertView.setTag(holder);
		} else {
			holder = (Holder) convertView.getTag();
		}

		

		// Populate the text
		switch (position % 11) {
		case 0:
			holder.textView.setImageResource(R.drawable.t0);
			break;
		case 1:
			holder.textView.setImageResource(R.drawable.t1);
			break;
		case 2:
			holder.textView.setImageResource(R.drawable.t2);
			break;
		case 3:
			holder.textView.setImageResource(R.drawable.t3);
			break;
		case 4:
			holder.textView.setImageResource(R.drawable.t4);
			break;
		case 5:
			holder.textView.setImageResource(R.drawable.t5);
			break;
		case 6:
			holder.textView.setImageResource(R.drawable.t6);
			break;
		case 7:
			holder.textView.setImageResource(R.drawable.t7);
			break;
		case 8:
			holder.textView.setImageResource(R.drawable.t9);
			break;
		case 9:
			holder.textView.setImageResource(R.drawable.t10);
			break;
		case 10:
			holder.textView.setImageResource(R.drawable.t11);
			break;
		case 11:
			holder.textView.setImageResource(R.drawable.t12);
			break;
		case 12:
			holder.textView.setImageResource(R.drawable.t13);
			break;
		
		default:
			break;
		}
		
		
	
		return convertView;
	}

	/** View holder for the views we need access to */
	private static class Holder {
		public ImageView textView;
		
	}
}
