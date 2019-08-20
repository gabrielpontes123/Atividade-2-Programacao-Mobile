/*package com.example.gmaps15;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class maps extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        Log.i("####MapsActivity","####protected void onCreate(Bundle savedInstanceState) {...");
        //SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }
    @Override

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        Log.i("####MapsActivity","####public void onMapReady(GoogleMap googleMap) {...");
        Log.i("####MapsActivity","####public void onMapReady(GoogleMap googleMap) {...");
        Log.i("####MapsActivity","####public void onMapReady(GoogleMap googleMap) {...");
    }
}
*/