package com.example.android.tourrapidcity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * A simple {@link Fragment} subclass which implements View.OnClickListener.
 */
public class RapidCityFragment extends Fragment implements View.OnClickListener {

    public RapidCityFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rcRootView = inflater.inflate(R.layout.fragment_rapid_city, container, false);
        // Find the LinearLayout with the ID rc_logo_linear_layout. Create a new OnClickListener
        // and set it on the LinearLayout.
        LinearLayout rcLogoLinearLayout = (LinearLayout)
                rcRootView.findViewById(R.id.rc_logo_linear_layout);
        rcLogoLinearLayout.setOnClickListener(this);
        return rcRootView;
    }

    @Override
    public void onClick(View v) {
        // Call a different intent depending on the view clicked.
        switch (v.getId()) {
            // If the rc_logo_linear_layout is clicked
            case R.id.rc_logo_linear_layout:
                // Create a new intent to open a webpage with a given URL, start intent.
                String urlRCLogo = "https://www.downtownrapidcity.com/";
                Intent rcLogoIntent = new Intent(Intent.ACTION_VIEW);
                rcLogoIntent.setData(Uri.parse(urlRCLogo));
                startActivity(rcLogoIntent);
                break;
            default:
                break;
        }
    }
}