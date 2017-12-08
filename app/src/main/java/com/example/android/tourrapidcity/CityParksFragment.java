package com.example.android.tourrapidcity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass which implements View.OnClickListener.
 */
public class CityParksFragment extends Fragment implements View.OnClickListener {

    public CityParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View parksRootView = inflater.inflate(R.layout.fragment_city_parks, container, false);
        // Find the TextView with the ID parks_visit_text_view. Create a new OnClickListener and
        // set it on the TextView.
        TextView parkVisitTextView = (TextView)
                parksRootView.findViewById(R.id.parks_visit_text_view);
        parkVisitTextView.setOnClickListener(this);
        // Find the ImageView with the ID bh_know_image_view. Create a new OnClickListener and set
        // it on the ImageView.
        ImageView knowledgeImageView = (ImageView)
                parksRootView.findViewById(R.id.bh_know_image_view);
        knowledgeImageView.setOnClickListener(this);
        return parksRootView;
    }

    @Override
    public void onClick(View v) {
        // Call a different intent depending on the view clicked.
        switch (v.getId()) {
            // If the parks_visit_text_view is clicked
            case R.id.parks_visit_text_view:
                // Create a new intent to open a webpage with a given URL, start intent.
                String urlVisit =
                        "http://www.visitrapidcity.com/things-to-do/outdoor-recreation/parks";
                Intent visitParksIntent = new Intent(Intent.ACTION_VIEW);
                visitParksIntent.setData(Uri.parse(urlVisit));
                startActivity(visitParksIntent);
                break;
            // If the bh_know_image_view is clicked
            case R.id.bh_know_image_view:
                // Create a new intent to open a webpage with a given URL, start intent.
                String urlKnowledge =
                        "http://www.blackhillsknowledgenetwork.org/news/5971-black-hills-flood-1972#.WAPOCOArJeV";
                Intent floodKnowledgeIntent = new Intent(Intent.ACTION_VIEW);
                floodKnowledgeIntent.setData(Uri.parse(urlKnowledge));
                startActivity(floodKnowledgeIntent);
                break;

            default:
                break;
        }
    }
}
