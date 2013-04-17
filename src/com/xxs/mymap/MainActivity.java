package com.xxs.mymap;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		myMap();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	public void myMap() {
		GooglePlayServicesUtil.isGooglePlayServicesAvailable(getApplicationContext());
		GoogleMap aMap = ((SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
		aMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
		aMap.addMarker(new MarkerOptions().position(new LatLng(0, 0)).title("Marker"));
		aMap.setMyLocationEnabled(true);
		
	}

}