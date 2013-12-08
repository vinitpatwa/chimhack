package com.vinit.listviewtemplate.fragment;



import java.util.ArrayList;

import android.os.Bundle;

import com.vinit.listviewtemplate.model.Event;
import com.vinit.listviewtemplate.model.Home;
import com.vinit.listviewtemplate.model.User;

public class ProfileFragment extends HomelineFragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);


		ArrayList<Home> events = new ArrayList<Home>();

//		String name, String date, String categories,
//		String description, String address, String city, String zipcode,
//		String image
//		
		ArrayList<User> users=new ArrayList<User>();
		
	

		Home two = new Home("http://www.clintonfoundation.org/files/styles/content_area_center_column/public/wysiwyg/malala.png?itok=swd5uQFM", "Ambassador of Conscience Award 2013", "2013-10-11", "The Ambassador of Conscience Award is Amnesty International's most prestigious human rights award. It is given annually to individuals who show exceptional leadership in the fight to protect and promote human rights and humanconscience. The Award aims to promote the work of Amnesty International by association with the life, work and example of its ‘Ambassador’." );//("Zynga Brest Cancer awareness","3/2/2014","Women","Zynga Event for Brest Cancer awareness need 10 people to help out","650 Townsend ST","San Francisco","94107","http://www.unleashthefanboy.com/wp-content/uploads/2013/06/zynga-banner.jpeg", users, "09:00");
		events.add(two);

		Home three = new Home("http://feminspire.com/wp-content/uploads/2013/04/malala-final.jpg", "Malala in Time Cover", "2011-10-11", "100 most influential people in the world" );;//("Asha Holi for education","2/2/2014","Education","Celebrate Holi with Stanford Asha. Festival of colors to raise money for child education "," 450 Serra Mall","Stanford","94305","https://lh4.googleusercontent.com/-ylFo1Ubqxbw/UVTb1Kvpr4I/AAAAAAAAAGo/qDyCuNzulZk/w797-h800-no/HOLI-2013-FLYER-FINAL.jpg", users, "15:00");
		events.add(three);

		Home four = new Home("http://gdb.voanews.com/BE528341-5D97-43A7-A340-1FD7D7EA8733_mw1024_n_s.jpg", "Pakistani private schools ban Malala’s book", "2011-11-11", "Pakistan's Malala Yousafzai with her RAW (Reach All Women) in War Anna Politkovskaya Award");//("Bay Area Legal Aid","3/2/2014","Education","BayLegal seeks volunteers who are fluent in a language other than English, particularly Spanish, Cantonese, Vietnamese, Russian,","1735 Telegraph Avenue","Oakland","94612","http://baylegal.org/wp-content/uploads/Banner2---962x339px.png", users, "13:00");
		events.add(four);
		
		Home one = new Home("http://jto.s3.amazonaws.com/wp-content/uploads/2013/10/an20131008a5a.jpg", "Courage Award ", "2012-11-11", "Standing out: Retired English soccer star David Beckham presents a Mirror Pride of Britain Teenager of Courage Award to Malala Yousafzai, the Pakistani schoolgirl who was shot by the Taliban for advocating education for girls." );//("SF FoodBank Help Homeless","2/2/2014","Food","My First EVent happening in SF for helping 20 homeless people","574 3rd ST","San Francisco","94107","http://blog.goodapril.com/assets/Food-Banks.jpg", users,"10:00");
		events.add(one);
		
		getAdapter().addAll(events);

	}

}
