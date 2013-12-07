package com.vinit.listviewtemplate;

import java.util.ArrayList;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.vinit.listviewtemplate.model.Event;
import com.vinit.listviewtemplate.model.Home;

public class HomeAdapter extends ArrayAdapter<Home> {

	ImageView iv_event_item_image;
	TextView tv_event_item_name;
	TextView tv_event_item_description;
	TextView tv_event_item_city;
	TextView tv_event_item_datentime;
	Home event;
	ImageLoader imageLoader;

	public HomeAdapter(Context context, ArrayList<Home> tweets) {
		super(context, 0, tweets);
//		imageLoader.init(ImageLoaderConfiguration.createDefault(context));
//		imageLoader = ImageLoader.getInstance();
//		imageLoader.init(ImageLoaderConfiguration.createDefault(this));
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		View view = convertView;

		if (view == null) {
			LayoutInflater inflator = (LayoutInflater) getContext()
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			view = inflator.inflate(R.layout.event_item, null);
		}

		event = getItem(position);

		iv_event_item_image = (ImageView) view
				.findViewById(R.id.iv_event_item_image);
//		ImageLoader.getInstance().displayImage(event.getImage(), iv_event_item_image);
//		iv_event_item_image.setTag(event.getName());
		ImageLoader.getInstance().displayImage(event.image, iv_event_item_image);
		 return view;
	}
}
