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
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.vinit.listviewtemplate.model.Event;

public class EventAdapter extends ArrayAdapter<Event> {

	ImageView iv_event_item_image;
	TextView tv_event_item_name;
	TextView tv_event_item_description;
	TextView tv_event_item_city;
	TextView tv_event_item_datentime;
	
	
	Event event;
	ImageLoader imageLoader;

	public EventAdapter(Context context, ArrayList<Event> tweets) {
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
		iv_event_item_image.setTag(event.getName());
		
		
		 tv_event_item_name = (TextView) view.findViewById(R.id.tv_event_item_name);
		 tv_event_item_name.setText(event.getName());
		 
		 tv_event_item_description = (TextView) view.findViewById(R.id.tv_event_item_description);
		 tv_event_item_description.setText(event.getDescription());
		 
		 tv_event_item_city = (TextView) view.findViewById(R.id.tv_event_item_city);
		 tv_event_item_city.setText(event.getCity());
		 
		 tv_event_item_datentime = (TextView) view.findViewById(R.id.tv_event_item_datentime);
		 tv_event_item_datentime.setText(event.getDate()+" "+event.getTime());
		 

		return view;
	}

}