package com.example.android.tourrapidcity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * A simple {@link Fragment} subclass which implements View.OnClickListener.
 */
public class MainStreetSquareFragment extends Fragment implements View.OnClickListener {

    public MainStreetSquareFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mssRootView = inflater.inflate(R.layout.fragment_main_street_square, container, false);
        // Find the LinearLayout with the ID mss_events. Create a new OnClickListener and set it on
        // the LinearLayout.
        LinearLayout eventLinearLayout = (LinearLayout) mssRootView.findViewById(R.id.mss_events);
        eventLinearLayout.setOnClickListener(this);
        // Find the ImageView with the ID mss_bcycle_image_view. Create a new OnClickListener and
        // set it on the ImageView.
        ImageView bcycleImageView = (ImageView) mssRootView.findViewById(R.id.mss_bcycle_image_view);
        bcycleImageView.setOnClickListener(this);
        return mssRootView;
    }

    @Override
    public void onClick(View v) {
        // Call a different intent depending on the view clicked.
        switch (v.getId()) {
            // If the mss_events view is clicked
            case R.id.mss_events:
                // Create a new intent to open a webpage with a given URL, start intent.
                String urlEvent = "http://mainstreetsquarerc.com/concerts-and-festivals.html";
                Intent eventsIntent = new Intent(Intent.ACTION_VIEW);
                eventsIntent.setData(Uri.parse(urlEvent));
                startActivity(eventsIntent);
                break;
            // If the mss_bcycle_image_view is clicked
            case R.id.mss_bcycle_image_view:
                // Create a new intent to open a webpage with a given URL, start intent.
                String urlBcycle = "http://mainstreetsquarerc.com/about-the-square/rapid-city-bcycle.html";
                Intent bcycleIntent = new Intent(Intent.ACTION_VIEW);
                bcycleIntent.setData(Uri.parse(urlBcycle));
                startActivity(bcycleIntent);
                break;

            default:
                break;
        }
    }
}
