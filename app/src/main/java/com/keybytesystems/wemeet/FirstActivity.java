package com.keybytesystems.wemeet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;

public class FirstActivity extends ActionBarActivity implements View.OnClickListener{

  Button go;
 /* static Firebase myFirebaseRef;
  EditText nameEditText;
  EditText messageEditText;
  ProgressBar progressBar;
  static final String TAG = "Main Acvity";
  ArrayAdapter<String> valuesAdapter;
  ArrayList<String> displayArray;
  ArrayList<String> keysArray;
  ListView listView;*/
  CalendarView  calendar;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.wsandroid1);
    initializeCalendar();
    go = (Button) findViewById(R.id.go)  ;
    go.setOnClickListener(this);

  }
  //
  public void initializeCalendar() {
    calendar = (CalendarView) findViewById(R.id.calendar);

    // sets whether to show the week number.
    calendar.setShowWeekNumber(false);

    // sets the first day of week according to Calendar.
    // here we set Monday as the first day of the Calendar
    calendar.setFirstDayOfWeek(2);


    //The background color for the selected week.
    calendar.setSelectedWeekBackgroundColor(getResources().getColor(R.color.green));

    //sets the color for the dates of an unfocused month.
    calendar.setUnfocusedMonthDateColor(getResources().getColor(R.color.transparent));

    //sets the color for the separator line between weeks.
    calendar.setWeekSeparatorLineColor(getResources().getColor(R.color.transparent));

    //sets the color for the vertical bar shown at the beginning and at the end of the selected date.
    calendar.setSelectedDateVerticalBar(R.color.darkgreen);

    //sets the listener to be notified upon selected date change.
    calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

      //show the selected date as a toast
      @Override
      public void onSelectedDayChange(CalendarView view, int year, int month, int day) {
        Toast.makeText(getApplicationContext(), day + "/" + month + "/" + year, Toast.LENGTH_LONG).show();
      }
    });
  }
  @Override
  public void onClick(View view) {

    Intent inent = new Intent(this, DevListActivity.class);

    // calling an activity using <intent-filter> action name
    //  Intent inent = new Intent("com.hmkcode.android.ANOTHER_ACTIVITY");

    startActivity(inent);
  }
  //

}
