package com.example.android.tourrapidcity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/** A simple {@link Fragment} subclass which implements View.OnClickListener */
public class ThingsToDoFragment extends Fragment implements View.OnClickListener {

    public ThingsToDoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View ttdRootView = inflater.inflate(R.layout.fragment_things_to_do, container, false);
        // Find the ImageView with the ID ttd_art_image_view. Create a new OnClickListener and set
        // it on the ImageView.
        ImageView artImageView = (ImageView) ttdRootView.findViewById(R.id.ttd_art_image_view);
        artImageView.setOnClickListener(this);

        // Find the ImageView with the ID ttd_attraction_image_view. Create a new OnClickListener
        // and set it on the ImageView.
        ImageView attractionImageView = (ImageView)
                ttdRootView.findViewById(R.id.ttd_attraction_image_view);
        attractionImageView.setOnClickListener(this);

        // Find the ImageView with the ID ttd_bh_scenic_image_view. Create a new OnClickListener
        // and set it on the ImageView.
        ImageView bhScenicImageView = (ImageView)
                ttdRootView.findViewById(R.id.ttd_bh_scenic_image_view);
        bhScenicImageView.setOnClickListener(this);

        // Find the ImageView with the ID ttd_city_tour_image_view. Create a new OnClickListener
        // and set it on the ImageView.
        ImageView cityTourImageView = (ImageView)
                ttdRootView.findViewById(R.id.ttd_city_tour_image_view);
        cityTourImageView.setOnClickListener(this);

        // Find the ImageView with the ID ttd_downtown_image_view. Create a new OnClickListener and
        // set it on the ImageView.
        ImageView downtownImageView = (ImageView)
                ttdRootView.findViewById(R.id.ttd_downtown_image_view);
        downtownImageView.setOnClickListener(this);

        // Find the ImageView with the ID ttd_outdoor_image_view. Create a new OnClickListener and
        // set it on the ImageView.
        ImageView outdoorImageView = (ImageView)
                ttdRootView.findViewById(R.id.ttd_outdoor_image_view);
        outdoorImageView.setOnClickListener(this);

        // Find the ImageView with the ID ttd_parks_image_view. Create a new OnClickListener and
        // set it on the ImageView.
        ImageView parksImageView = (ImageView) ttdRootView.findViewById(R.id.ttd_parks_image_view);
        parksImageView.setOnClickListener(this);

        // Find the ImageView with the ID ttd_pres_image_view. Create a new OnClickListener and set
        // it on the ImageView.
        ImageView presImageView = (ImageView) ttdRootView.findViewById(R.id.ttd_pres_image_view);
        presImageView.setOnClickListener(this);

        // Find the ImageView with the ID ttd_shopping_image_view. Create a new OnClickListener and
        // set it on the ImageView.
        ImageView shoppingImageView = (ImageView)
                ttdRootView.findViewById(R.id.ttd_shopping_image_view);
        shoppingImageView.setOnClickListener(this);

        // Find the ImageView with the ID ttd_sports_image_view. Create a new OnClickListener and
        // set it on the ImageView.
        ImageView sportsImageView = (ImageView)
                ttdRootView.findViewById(R.id.ttd_sports_image_view);
        sportsImageView.setOnClickListener(this);

        return ttdRootView;
    }

    @Override
    public void onClick(View v) {
        String urlChoice = null;

        // Set the URL, dependant on which ImageView is clicked
        switch (v.getId()) {
            case R.id.ttd_art_image_view:
                urlChoice = "http://www.visitrapidcity.com/things-to-do/arts-culture";
                break;
            case R.id.ttd_attraction_image_view:
                urlChoice = "http://www.visitrapidcity.com/things-to-do/attractions";
                break;
            case R.id.ttd_bh_scenic_image_view:
                urlChoice = "http://www.visitrapidcity.com/things-to-do/black-hills-cruising";
                break;
            case R.id.ttd_city_tour_image_view:
                urlChoice = "http://www.visitrapidcity.com/things-to-do/historic-district";
                break;
            case R.id.ttd_downtown_image_view:
                urlChoice = "http://www.visitrapidcity.com/things-to-do/downtown";
                break;
            case R.id.ttd_outdoor_image_view:
                urlChoice = "http://www.visitrapidcity.com/things-to-do/outdoor-recreation";
                break;
            case R.id.ttd_parks_image_view:
                urlChoice = "http://www.visitrapidcity.com/things-to-do/parks-monuments";
                break;
            case R.id.ttd_pres_image_view:
                urlChoice = "http://www.visitrapidcity.com/things-to-do/city-presidents";
                break;
            case R.id.ttd_shopping_image_view:
                urlChoice = "http://www.visitrapidcity.com/things-to-do/shopping";
                break;
            case R.id.ttd_sports_image_view:
                urlChoice = "http://www.visitrapidcity.com/things-to-do/sports";
                break;
            default:
                break;
        }

        // Check if the urlChoice variable is still equal to null. If it is not, create a new
        // intent to open the selected webpage.
        if (urlChoice != null) {
            Intent webpageIntent = new Intent(Intent.ACTION_VIEW);
            webpageIntent.setData(Uri.parse(urlChoice));
            startActivity(webpageIntent);
        }
    }
}