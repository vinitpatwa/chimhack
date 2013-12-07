package com.vinit.listviewtemplate;


import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


import com.vinit.listviewtemplate.fragment.LeaderProfileFragment;
import com.vinit.listviewtemplate.fragment.ProfileFragment;
import com.vinit.listviewtemplate.fragment.VoicesFragment;
import com.vinit.listviewtemplate.model.Event;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class EventsActivity extends FragmentActivity implements ActionBar.TabListener {

	ActionBar.Tab tabSurprise, tabVoices, tabProfile;
	int REQUEST_CODE = 1;
	int REQUEST_CODE_ONE = 2;
	String user = null;

	public static VoicesFragment rfragment;
	LeaderProfileFragment pfragment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_events);


//		if(user == null){

//		}


		setUpActionBar();
	}

	public void setUpActionBar(){
		ActionBar actionBar = getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		actionBar.setDisplayShowTitleEnabled(true);

		actionBar.setTitle("Dana Events");
		//        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#880000")));

		tabVoices = actionBar.newTab().setText("Voices").setTag("voices").setTabListener(this);
		tabProfile = actionBar.newTab().setText("Profile").setTag("profile").setTabListener(this);
//		tabSurprise = actionBar.newTab().setText("InpireMe").setTag("inspireme").setTabListener(this);

		actionBar.addTab(tabVoices);
		actionBar.addTab(tabProfile);
//		actionBar.addTab(tabSurprise);
		actionBar.selectTab(tabVoices);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.create_event, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()){
		case R.id.compose:
			Toast.makeText(this, "In CreateEvent", Toast.LENGTH_SHORT).show();
			startActivityForResult(new Intent(this, CreateEventActivity.class), REQUEST_CODE);
			return true;

		case R.id.profile:
			Toast.makeText(this, "In Profile", Toast.LENGTH_SHORT).show();
//			startActivityForResult(new Intent(this, ProfileActivity.class),REQUEST_CODE);
			return true;

		default:
			Toast.makeText(this, "Not in CreateEvent", Toast.LENGTH_SHORT).show();
			return true;
		}
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data){
		if(requestCode == REQUEST_CODE){
			if(resultCode == RESULT_OK){
				Toast.makeText(this, "composed", Toast.LENGTH_SHORT).show();
				String tweet = data.getExtras().getString("tweet");
				rfragment.addTweet(tweet);
			}
		}

		if(requestCode == REQUEST_CODE_ONE){
			Log.d("DEBUG4","Attending...");
			if(resultCode == RESULT_OK){
				Log.d("DEBUG4","calling fragment");
				String attending = data.getExtras().getString("attend");
				Log.d("DEBUG4","Attending - "+attending);
			}
		} 

	}


	@Override
	public void onTabReselected(Tab tab, android.app.FragmentTransaction ft) {
		// TODO Auto-generated method stub

	}


	@Override
	public void onTabSelected(ActionBar.Tab tab, android.app.FragmentTransaction ft) {
		FragmentManager manager = getSupportFragmentManager();
		android.support.v4.app.FragmentTransaction fts = manager.beginTransaction();

		if(tab.getTag() == "voices"){
			//Set to fragment to Timeline
			fts.replace(R.id.fragment_container, getvoicesFragment(),"voices");
		}else if(tab.getTag() == "profile"){
			//Set to fragment to Mentions Fragment
			fts.replace(R.id.fragment_container,getprofileFragment(), "profile");
//		} else if(tab.getTag() == "inspireme"){
//			fts.replace(R.id.fragment_container,getprofileFragment(), "profile");
//			//        	fts.replace(R.id.fragment_container,new OrgListFragment(),"donor");
		}

		fts.commit();
	}

	public VoicesFragment getvoicesFragment(){
		if(EventsActivity.rfragment == null){
			EventsActivity.rfragment = new VoicesFragment();
			Log.d("DEBUG4", "creating voices Fragment");
		}else{
			Log.d("DEBUG4", "NOT NOT creating voices Fragment");
		}
		return rfragment;
	}

	public LeaderProfileFragment getprofileFragment(){
		if(pfragment == null){
			pfragment = new LeaderProfileFragment();
			Log.d("DEBUG4", "creating profile Fragment");
		}
		return pfragment;
	}


	@Override
	public void onTabUnselected(Tab tab, android.app.FragmentTransaction ft) {
		// TODO Auto-generated method stub

	}


}