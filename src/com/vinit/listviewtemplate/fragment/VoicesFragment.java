package com.vinit.listviewtemplate.fragment;

import java.util.ArrayList;

import android.os.Bundle;

import com.vinit.listviewtemplate.model.Event;
import com.vinit.listviewtemplate.model.User;


public class VoicesFragment extends TweetsListFragment {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        
        ArrayList<Event> events = new ArrayList<Event>();
		ArrayList<User> users=new ArrayList<User>();

		Event three = new Event(
				"Asha Holi for education",
				"2/2/2014","Education",
				"Celebrate Holi with Stanford Asha. Festival of colors to raise money for child education "," 450 Serra Mall","Stanford","94305","https://lh4.googleusercontent.com/-ylFo1Ubqxbw/UVTb1Kvpr4I/AAAAAAAAAGo/qDyCuNzulZk/w797-h800-no/HOLI-2013-FLYER-FINAL.jpg", users, "15:00");
		events.add(three);

        
		Event two = new Event(
				"Vital Voice",
				"3/2/2014",
				"Women",
				"Maya Penn, a 13-year-old CEO, technologist, animator, philanthropist...",
				"650 Townsend ST","San Francisco",
				"94107",
				"http://a2.twimg.com/profile_images/1127839058/VV_Logo_GlobeOnly_chocolateMint_50px_reasonably_small.png", 
				users, "09:00");
		two.description = "Maya Penn, a 13-year-old CEO, technologist, animator, philanthropist...";
		two.fbLikes = 212;
		two.tweetImageUrl = "http://tedconfblog.files.wordpress.com/2013/12/20131205_mca_7756.jpg?w=1128&h=752";
		events.add(two);
        
        getAdapter().addAll(events);

            }

}
