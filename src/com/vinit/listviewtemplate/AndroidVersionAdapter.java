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
	private static final String[] names = {
		"MU SOCHUA",
		"MARIA CLAUDIA MENDEZ",
		"ADIMAIMALAGA TAFUNA'l",
		"BRIGITTE DZOGBENUKU" };

	public AndroidVersionAdapter(Context context) {
		mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		map.put("create_event_help", R.drawable.leader0);
		map.put("engage_volunteers", R.drawable.leader1);
		map.put("attend_event", R.drawable.leader2);
		map.put("help_society", R.drawable.leader3);
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

