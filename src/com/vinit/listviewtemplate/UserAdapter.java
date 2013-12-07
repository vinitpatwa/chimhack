package com.vinit.listviewtemplate;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.vinit.listviewtemplate.model.User;

public class UserAdapter  extends ArrayAdapter<User> {
	
	User user;
	ImageView iv_user_item_image;
	TextView tv_user_item_name;
	TextView tv_user_item_location;
	
	public UserAdapter(Context context, ArrayList<User> users) {
		super(context, 0, users);
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		View view = convertView;

		if (view == null) {
			LayoutInflater inflator = (LayoutInflater) getContext()
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			view = inflator.inflate(R.layout.user_item, null);

		}

		user = getItem(position);

//		iv_event_item_image = (ImageView) view
//				.findViewById(R.id.iv_event_item_image);
//		ImageLoader.getInstance().displayImage(event.getImage(),
//				iv_event_item_image);
		
		
		tv_user_item_name = (TextView) view.findViewById(R.id.tv_user_item_name);
		tv_user_item_name.setText(user.getFirstName()+" "+user.getLastName());
		 
		tv_user_item_location = (TextView) view.findViewById(R.id.tv_user_item_location);
		tv_user_item_location.setText(user.getCity());
		 

		return view;
	}
	
	
}
