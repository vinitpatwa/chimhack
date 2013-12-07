package com.vinit.listviewtemplate;


import java.util.HashMap;
import java.util.Map;

import org.taptwo.android.widget.TitleProvider;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class AndroidVersionAdapter extends BaseAdapter implements TitleProvider {

	private LayoutInflater mInflater;
	ImageView iv_login_sign_up_info;
	private static final String[] versions = {"create_event_help","engage_volunteers","attend_event","help_society" };
	Map<String, Integer> map = new HashMap<String, Integer>();

	//	private static final Drawable[] images = {
	private static final String[] names = {"Communities will create Events","Engage Volunteers","Volunteers will Help by Attending","Giving back to Society" };

	public AndroidVersionAdapter(Context context) {
		mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		map.put("create_event_help", R.drawable.ic_create_event_help);
		map.put("engage_volunteers", R.drawable.ic_engage_volunteers);
		map.put("attend_event", R.drawable.ic_attend_event);
		map.put("help_society", R.drawable.ic_help_society);
	}

	@Override
	public int getCount() {
		return names.length;
	}

	@Override
	public Object getItem(int position) {
		return position;
	}

	@Override
	public long getItemId(int position) {
		return position; 
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if(convertView == null) {
			convertView = mInflater.inflate(R.layout.flow_item, null);
		}
		iv_login_sign_up_info = (ImageView) convertView.findViewById(R.id.iv_login_sign_up_info);
		iv_login_sign_up_info.setImageResource(map.get(versions[position]));
		return convertView;
	}

	/* (non-Javadoc)
	 * @see org.taptwo.android.widget.TitleProvider#getTitle(int)
	 */
	@Override
	public String getTitle(int position) {
		return names[position];
	}

}

