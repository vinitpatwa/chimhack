package com.vinit.listviewtemplate.fragment;

	import java.util.ArrayList;

	import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


	import com.vinit.listviewtemplate.EventAdapter;

	import com.vinit.listviewtemplate.R;
import com.vinit.listviewtemplate.model.Event;
import com.vinit.listviewtemplate.model.Home;
import com.haarman.listviewanimations.itemmanipulation.OnDismissCallback;
import com.haarman.listviewanimations.itemmanipulation.SwipeDismissAdapter;
import com.haarman.listviewanimations.swinginadapters.prepared.SwingBottomInAnimationAdapter;

	/**
	 * Created by vpatwa on 10/28/13.
	 */
	public class HomelineFragment extends Fragment {
		
		final int requestCode = 1;

		EventAdapter adapter;
		ListView lv_timeline;
		SwingBottomInAnimationAdapter swingBottomInAnimationAdapter;

		@Override
		public View onCreateView(LayoutInflater inf, ViewGroup parent,
				Bundle savedInstanceState) {
			// return inf.inflate(R.layout.fragment_tweets_list,parent, false);
			View v = inf.inflate(R.layout.fragment_tweets_list, parent, false);
			lv_timeline = (ListView) v.findViewById(R.id.lv_timeline);
			
			swingBottomInAnimationAdapter= new SwingBottomInAnimationAdapter(adapter);
			swingBottomInAnimationAdapter.setInitialDelayMillis(300);
			swingBottomInAnimationAdapter.setAbsListView(lv_timeline);
			
//			lv_timeline.setAdapter(adapter);
			lv_timeline.setAdapter(swingBottomInAnimationAdapter);
			
			lv_timeline.setOnItemClickListener(new AdapterView.OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> adapterView, View view, int position,
						long l) {
				
					Event event = (Event) lv_timeline.getItemAtPosition(position);
					
//					Intent i = new Intent(getActivity(), DetailEventActivity.class);
//					i.putExtra("event", event);
//					startActivityForResult(i, requestCode);
					}
			});

			return v;
		}

		
		
		
		@Override
		public void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);

			ArrayList<Home> tweets = new ArrayList<Home>();
//			adapter = new EventAdapter(getActivity(), tweets);

		}

		@Override
		public void onActivityCreated(Bundle savedInstanceState) {
			super.onActivityCreated(savedInstanceState);

		}

		public EventAdapter getAdapter() {
			return adapter;
		}
	
}
