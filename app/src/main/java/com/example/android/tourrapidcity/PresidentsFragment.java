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
public class PresidentsFragment extends Fragment implements View.OnClickListener {

    public PresidentsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View presRootView = inflater.inflate(R.layout.fragment_presidents, container, false);
        // Find the LinearLayout with the ID pres_linear_layout. Create a new OnClickListener and
        // set it on the LinearLayout.
        LinearLayout presLinearLayout = (LinearLayout)
                presRootView.findViewById(R.id.pres_linear_layout);
        presLinearLayout.setOnClickListener(this);
        // Find the ImageView with the ID pres_walking_guide_image. Create a new OnClickListener
        // and set it on the ImageView.
        ImageView walkingTourImageView = (ImageView)
                presRootView.findViewById(R.id.pres_walking_guide_image);
        walkingTourImageView.setOnClickListener(this);

        return presRootView;
    }

    @Override
    public void onClick(View v) {
        // Call a different intent depending on the view clicked.
        switch (v.getId()) {
            // If the LinearLayout with the ID of pres_linear_layout is clicked
            case R.id.pres_linear_layout:
                // Create a new intent to start the {@link PresidentActivity}, start activity.
                Intent presListIntent = new Intent(this.getActivity(), PresidentActivity.class);
                startActivity(presListIntent);
                break;
            // If the walking tour image is clicked
            case R.id.pres_walking_guide_image:
                // Create a new intent to open a webpage with a given URL, start intent.
                String urlWalkingTour = "http://presidentsrc.com/";
                Intent walkingTourIntent = new Intent(Intent.ACTION_VIEW);
                walkingTourIntent.setData(Uri.parse(urlWalkingTour));
                startActivity(walkingTourIntent);
                break;

            default:
                break;
        }
    }
}