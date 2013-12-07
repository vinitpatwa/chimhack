package com.vinit.listviewtemplate;



import java.util.ArrayList;
import java.util.Calendar;


import android.annotation.TargetApi;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.vinit.listviewtemplate.fragment.DateDialogFragment;
import com.vinit.listviewtemplate.fragment.TimePickerFragment;
import com.vinit.listviewtemplate.model.Event;
import com.vinit.listviewtemplate.model.User;

//import com.vinit.daana.fragment.DateDialogFragment;
//import com.vinit.daana.fragment.TimePickerFragment;
////import android.support.v4.app.FragmentTransaction;
//import com.vinit.daana.model.Event;
//import com.vinit.daana.model.User;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class CreateEventActivity extends Activity implements com.vinit.listviewtemplate.fragment.TimePickerFragment.TimePickedListener {

	EditText et_create_event_name;
	TextView tv_create_event_date;
	TextView tv_create_event_time;
	Button  bt_create_event_date;
	Button	bt_create_event_time;
	Spinner sp_create_event_category;
	EditText et_create_event_description;
	EditText et_create_event_address;
	EditText et_create_event_city;
	EditText et_create_event_zipcode;

	DateDialogFragment frag;
	Button button;
	Calendar now;
	String[] category;

	//        Event two = new Event("Sumit","3/2/2014","Food","Zynga EVent","650 Townsend ST","San Francisco","94107","http://www.unleashthefanboy.com/wp-content/uploads/2013/06/zynga-banner.jpeg");
	//        Event one = new Event("SF FoodBank Help Homeless","2/2/2014","Food","My First EVent happening in SF for helping 20 homeless people","574 3rd ST","San Francisco","94107","http://blog.goodapril.com/assets/Food-Banks.jpg", users,"10:00");
	//        events.add(one);

	public void onCreateEvent(View v){

		//Implenent sending event back to activity

		ArrayList<User> users=new ArrayList<User>();
		String one = et_create_event_name.getText().toString();

		String two =  bt_create_event_date.getText().toString();
		String three = sp_create_event_category.getSelectedItem().toString();

		String four = et_create_event_description.getText().toString();
		String five= et_create_event_address.getText().toString();
		String six = et_create_event_city.getText().toString();
		String seven = et_create_event_zipcode.getText().toString();
		//"http://www.habitatgsf.org/image/email-images/e-news/volunteerchoice.jpg",users,
		String eight = bt_create_event_time.getText().toString();

		Event e = new Event(et_create_event_name.getText().toString(), bt_create_event_date.getText().toString(), sp_create_event_category.getSelectedItem().toString(), et_create_event_description.getText().toString(),et_create_event_address.getText().toString(),et_create_event_city.getText().toString(),et_create_event_zipcode.getText().toString(),"http://www.habitatgsf.org/image/email-images/e-news/volunteerchoice.jpg",users,bt_create_event_time.getText().toString());
		Intent i = new Intent();
		i.putExtra("event",e);
		setResult(RESULT_OK, i);
		finish();
		Toast.makeText(this,"Created new event", Toast.LENGTH_SHORT).show();

	}


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_create_event);


		bt_create_event_date = (Button) findViewById(R.id.bt_create_event_date);
		bt_create_event_time = (Button) findViewById(R.id.bt_create_event_time);



		
		now = Calendar.getInstance();
		bt_create_event_date.setText(String.valueOf(now.get(Calendar.MONTH)+1)+"-"+String.valueOf(now.get(Calendar.DAY_OF_MONTH))+"-"+String.valueOf(now.get(Calendar.YEAR)));
		bt_create_event_date.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				showDialog();        
			}
		});

		bt_create_event_time.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				showTimeDialog();
			}
		});

	}


	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	public void showTimeDialog() {
		// show the time picker dialog
		TimePickerFragment newFragment = new TimePickerFragment();
		newFragment.show(getFragmentManager(), "timePicker");

	}


	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	public void showDialog() {
		FragmentTransaction ft = getFragmentManager().beginTransaction(); //get the fragment
		frag = DateDialogFragment.newInstance(this, new DateDialogFragmentListener(){
			public void updateChangedDate(int year, int month, int day){
				bt_create_event_date.setText(String.valueOf(month+1)+"-"+String.valueOf(day)+"-"+String.valueOf(year));
				now.set(year, month, day);
			}
		}, now);

		frag.show(ft, "DateDialogFragment");

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.event_details, menu);
		return true;
	}

	public interface DateDialogFragmentListener{
		//this interface is a listener between the Date Dialog fragment and the activity to update the buttons date
		public void updateChangedDate(int year, int month, int day);
	}



	@Override
	public void onTimePicked(Calendar time) {
		// TODO Auto-generated method stub
		int hour = time.get(Calendar.HOUR_OF_DAY);
		int minute = time.get(Calendar.MINUTE);
		Log.d("DEBUG4",Integer.toString(hour));
		Log.d("DEBUG4",String.format("%02d",minute));
		bt_create_event_time.setText(Integer.toString(hour).concat(":").concat(String.format("%02d",minute)));
	}




}