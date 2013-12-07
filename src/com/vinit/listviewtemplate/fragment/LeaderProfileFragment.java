package com.vinit.listviewtemplate.fragment;


import java.util.ArrayList;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


import com.vinit.listviewtemplate.EventAdapter;

import com.vinit.listviewtemplate.R;
import com.vinit.listviewtemplate.model.Event;
import com.haarman.listviewanimations.itemmanipulation.OnDismissCallback;
import com.haarman.listviewanimations.itemmanipulation.SwipeDismissAdapter;
import com.haarman.listviewanimations.swinginadapters.prepared.SwingBottomInAnimationAdapter;

import com.vinit.listviewtemplate.fragment.ImageFragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by vpatwa on 10/28/13.
 */
public class LeaderProfileFragment extends Fragment {
	
//	final int requestCode = 1;

//	EventAdapter adapter;
//	ListView lv_timeline;
//	SwingBottomInAnimationAdapter swingBottomInAnimationAdapter;

//	@Override
//	public View onCreateView(LayoutInflater inf, ViewGroup parent,
//			Bundle savedInstanceState) {
//		// return inf.inflate(R.layout.fragment_tweets_list,parent, false);
//		View v = inf.inflate(R.layout.fragment_tweets_list, parent, false);
//
//		return v;
//	}

	private MyAdapter mAdapter;
    private ViewPager mPager;
    
    
    @Override
    public View onCreateView(LayoutInflater inf, ViewGroup parent,
                    Bundle savedInstanceState) {
            // return inf.inflate(R.layout.fragment_tweets_list,parent, false);
            View v = inf.inflate(R.layout.activity_leader_profile, parent, false);
            
            mPager = (ViewPager) v.findViewById(R.id.pager);
          if(mPager == null){
          	Log.d("DEBUG4", "mpager is null");
          	
          }
          if(mAdapter == null){
          	Log.d("DEBUG4", "mAdapter is null");
          	
          }
          mPager.setAdapter(mAdapter);
            
            
            return v;
    }

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            mAdapter = new MyAdapter(getFragmentManager());

//            setContentView(R.layout.activity_leader_profile);
           

    }

    public static class MyAdapter extends FragmentPagerAdapter {
            public MyAdapter(FragmentManager fm) {
                    super(fm);
            }

            @Override
            public int getCount() {
                    return 3;
            }

            @Override
            public Fragment getItem(int position) {
                    switch (position) {
                    case 0:
                            return new ImageFragment(R.drawable.ic_engage_volunteers);
                    case 1:
                            return new ImageFragment(R.drawable.ic_launcher);
                    case 2:
                            return new ImageFragment(R.drawable.profileimage);

                    default:
                            return null;
                    }
            }
    }
	
	
//	@Override
//	public void onCreate(Bundle savedInstanceState) {
//		// TODO Auto-generated method stub
//		super.onCreate(savedInstanceState);
//
//
//	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
        


	}

//	public EventAdapter getAdapter() {
//		return adapter;
//	}
}