package com.vinit.listviewtemplate.fragment;

import java.util.ArrayList;

import android.os.Bundle;

import com.vinit.listviewtemplate.model.Event;
import com.vinit.listviewtemplate.model.User;


public class VoicesFragment extends TweetsListFragment {
	public ArrayList<Event> events;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        events = new ArrayList<Event>();

		Event e = new Event();
		e.name = "Vital Voice";
		e.description = "Stacy Kramer: The best gift I ever survived";
		e.image = "http://a2.twimg.com/profile_images/1127839058/VV_Logo_GlobeOnly_chocolateMint_50px_reasonably_small.png";
		e.tweetImageUrl = "http://images.ted.com/images/ted/203377_254x191.jpg";
		e.videoUrl= "http://www.ted.com/talks/stacey_kramer_the_best_gift_i_ever_survived.html";
		e.fbLikes = 23943;
		e.retweets = 10933;
		events.add(e);
        
		e = new Event();
		e.name = "Vital Voice";
		e.description = "Maya Penn, a 13-year-old CEO, technologist, animator, philanthropist...";
		e.image = "http://a2.twimg.com/profile_images/1127839058/VV_Logo_GlobeOnly_chocolateMint_50px_reasonably_small.png";
		e.fbLikes = 212;
		e.retweets = 323;
		e.tweetImageUrl = "http://tedconfblog.files.wordpress.com/2013/12/20131205_mca_7756.jpg?w=1128&h=752";
		events.add(e);
        
        getAdapter().addAll(events);

    }
    
    public void addTweet(String tweet) {
    	Event e = new Event();
    	e.name = "Malala Yousafzai";
    	e.description = "Pakistanis are resilient people";
    	getAdapter().insert(e, 0);
    }

}
