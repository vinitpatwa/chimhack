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
		e.name = "Vital Voices";
		e.description = "Stacy Kramer: The best gift I ever survived";
		e.image = "http://a2.twimg.com/profile_images/1127839058/VV_Logo_GlobeOnly_chocolateMint_50px_reasonably_small.png";
		e.tweetImageUrl = "http://images.ted.com/images/ted/203377_254x191.jpg";
		e.videoUrl= "http://www.ted.com/talks/stacey_kramer_the_best_gift_i_ever_survived.html";
		e.fbLikes = 23943;
		e.retweets = 10033;
		events.add(e);

		e = new Event();
		e.name = "Adelaide Foute Tega";
		e.image = "http://www.vitalvoices.org/sites/default/files/imagecache/voice_detail_image/voice_image/Adealaide%20Profile%20Pic%20(2).jpg.crop_display.jpg";
		e.title = "President of the Union des Commercantes du Marche Sandaga (UCOMAS)";
		e.description =" We are building a support system for women traders in Sandaga";
		e.fbLikes = 3211;
		e.retweets = 892;
		events.add(e);
		
        
		e = new Event();
		e.name = "Vital Voices";
		e.description = "Maya Penn, a 13-year-old CEO, technologist, animator, philanthropist...";
		e.image = "http://a2.twimg.com/profile_images/1127839058/VV_Logo_GlobeOnly_chocolateMint_50px_reasonably_small.png";
		e.fbLikes = 212;
		e.retweets = 323;
		e.tweetImageUrl = "http://tedconfblog.files.wordpress.com/2013/12/20131205_mca_7756.jpg?w=1128&h=752";
		events.add(e);
        
		e = new Event();
		e.name = "Xie Lihua";
		e.description = "Founder of Rural Women Knowing All magazine and Secretary General of the Development Center for Rural Women";
		e.image = "http://www.vitalvoices.org/sites/default/files/imagecache/voice_detail_image/voice_image/Lihua_Xie.JPG.crop_display.jpg";
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
