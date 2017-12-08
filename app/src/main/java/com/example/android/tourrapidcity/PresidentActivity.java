package com.example.android.tourrapidcity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PresidentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        // Create an ArrayList of President objects.
        final ArrayList<President> president = new ArrayList<President>();

        // Add President objects to the Array (int imageResourceID, String presName, int presNumber,
        // String election, String term, String webpageAddress)
        president.add(new President(R.drawable.face_georgewashington, "George Washington",
                R.string.first, getString(R.string.election) + "  1 (1788), 2 (1792)",
                getString(R.string.term) + "  1789 - 1797",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/george-washington"));
        president.add(new President(R.drawable.face_johnadams, "John Adams", R.string.second,
                getString(R.string.election) + "  3 (1796)",
                getString(R.string.term) + "  1797 - 1801",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/john-adams"));
        president.add(new President(R.drawable.face_thomasjefferson, "Thomas Jefferson",
                R.string.third, getString(R.string.election) + "  4 (1800), 5 (1804)",
                getString(R.string.term) + "  1801 - 1809",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/thomas-jefferson"));
        president.add(new President(R.drawable.face_jamesmadison, "James Madison",
                R.string.fourth, getString(R.string.election) + "  6 (1808), 7 (1812)",
                getString(R.string.term) + "  1809 - 1817",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/james-madison"));
        president.add(new President(R.drawable.face_jamesmonroe, "James Monroe", R.string.fifth,
                getString(R.string.election) + "  8 (1816), 9 (1820)",
                getString(R.string.term) + "  1817 - 1825",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/james-monroe"));
        president.add(new President(R.drawable.face_johnquinceyadams, "John Quincy Adams",
                R.string.sixth, getString(R.string.election) + "  10 (1824)",
                getString(R.string.term) + "  1825 - 1829",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/john-quincy-adams"));
        president.add(new President(R.drawable.face_andrewjackson, "Andrew Jackson",
                R.string.seventh, getString(R.string.election) + "  11 (1828), 12 (1832)",
                getString(R.string.term) + "  1829 - 1837",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/andrew-jackson"));
        president.add(new President(R.drawable.face_martinvanburen, "Martin Van Buren",
                R.string.eighth, getString(R.string.election) + "  13 (1836)",
                getString(R.string.term) + "  1837 - 1841",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/martin-vanburen"));
        president.add(new President(R.drawable.face_williamhenryharrison,
                "William Henry Harrison", R.string.ninth, getString(R.string.election)
                + "  14 (1840)", getString(R.string.term) + "  1841 - 1841*\n* " +
                getString(R.string.died),
                "http://www.visitrapidcity.com/things-to-do/city-presidents/william-henry-harrison"));
        president.add(new President(R.drawable.face_johntyler, "John Tyler", R.string.tenth,
                getString(R.string.election) + "  14 (1840)*\n* " + getString(R.string.vice),
                getString(R.string.term) + "  1841 - 1845",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/john-tyler"));
        president.add(new President(R.drawable.face_jameskpolk, "James K. Polk",
                R.string.eleventh, getString(R.string.election) + "  15 (1844)",
                getString(R.string.term) + "  1845 - 1849",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/james-polk"));
        president.add(new President(R.drawable.face_zacharytaylor, "Zachary Taylor",
                R.string.twelfth, getString(R.string.election) + "  16 (1848)",
                getString(R.string.term) + "  1849 - 1850*\n* " + getString(R.string.died),
                "http://www.visitrapidcity.com/things-to-do/city-presidents/zachary-taylor"));
        president.add(new President(R.drawable.face_millardfillmore, "Millard Fillmore",
                R.string.thirteenth, getString(R.string.election) + "  16 (1848)*\n* " +
                getString(R.string.vice), getString(R.string.term) + "  1850 - 1853",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/millard-fillmore"));
        president.add(new President(R.drawable.face_franklinpierce, "Franklin Pierce",
                R.string.fourteenth, getString(R.string.election) + "  17 (1852)",
                getString(R.string.term) + "  1853 - 1857",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/franklin-pierce"));
        president.add(new President(R.drawable.face_jamesbuchanan, "James Buchanan",
                R.string.fifteenth, getString(R.string.election) + "  18 (1852)",
                getString(R.string.term) + "  1857 - 1861",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/james-buchanan"));
        president.add(new President(R.drawable.face_abrahamlincoln, "Abraham Lincoln",
                R.string.sixteenth, getString(R.string.election) + "  19 (1860), 20 (1864)",
                getString(R.string.term) + "  1861 - 1865*\n* " + getString(R.string.died),
                "http://www.visitrapidcity.com/things-to-do/city-presidents/abraham-lincoln"));
        president.add(new President(R.drawable.face_andrewjohnson, "Andrew Johnson",
                R.string.seventeenth, getString(R.string.election) + "  20 (1864)*\n* " +
                getString(R.string.vice), getString(R.string.term) + "  1865 - 1869",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/andrew-johnson"));
        president.add(new President(R.drawable.face_ulyssessgrant, "Ulysses S. Grant",
                R.string.eighteenth, getString(R.string.election) + "  21 (1868), 22 (1872)",
                getString(R.string.term) + "  1869 - 1877",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/ulysses-s-grant"));
        president.add(new President(R.drawable.face_rutherfordbhayes, "Rutherford B. Hayes",
                R.string.ninteenth, getString(R.string.election) + "  23 (1876)",
                getString(R.string.term) + "  1877 - 1881",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/rutherford-hayes"));
        president.add(new President(R.drawable.face_jamesagarfield, "James A. Garfield",
                R.string.twentieth, getString(R.string.election) + "  24 (1880)",
                getString(R.string.term) + "  1881 - 1881*\n* " + getString(R.string.died),
                "http://www.visitrapidcity.com/things-to-do/city-presidents/james-garfield"));
        president.add((new President(R.drawable.face_chesterarthur, "Chester A. Arthur",
                R.string.twentifirst, getString(R.string.election) + "  24 (1880)*\n* " +
                getString(R.string.vice), getString(R.string.term) + "  1881 - 1885",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/chester-arthur")));
        president.add((new President(R.drawable.face_grovercleveland, "Grover Cleveland",
                R.string.twentisecond, getString(R.string.election) + "  25 (1884)",
                getString(R.string.term) + "  1885 - 1889",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/grover-cleveland")));
        president.add(new President(R.drawable.face_benjaminharrison, "Benjamin Harrison",
                R.string.twentithird, getString(R.string.election) + "  26 (1888)",
                getString(R.string.term) + "  1889 - 1893",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/benjamin-harrison"));
        president.add(new President(R.drawable.face_grovercleveland, "Grover Cleveland",
                R.string.twentifourth, getString(R.string.election) + "  27 (1892)",
                getString(R.string.term) + "  1893 - 1897",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/grover-cleveland"));
        president.add(new President(R.drawable.face_williammckinley, "William McKinley",
                R.string.twentififth, getString(R.string.election) + "  28 (1896), 29 (1900)",
                getString(R.string.term) + "  1897 - 1901*\n* " + getString(R.string.died),
                "http://www.visitrapidcity.com/things-to-do/city-presidents/william-mckinley"));
        president.add(new President(R.drawable.face_theodoreroosevelt, "Theodore Roosevelt",
                R.string.twentisixth, getString(R.string.election) + "  29 (1900)*, 30 (1904)\n* "
                + getString(R.string.vice), getString(R.string.term) + "  1901 - 1909",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/theodore-roosevelt"));
        president.add(new President(R.drawable.face_williamhowardtaft, "William Howard Taft",
                R.string.twentiseventh, getString(R.string.election) + "  31 (1908)",
                getString(R.string.term) + "  1909 - 1913",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/william-howard-taft"));
        president.add(new President(R.drawable.face_woodrowwilson, "Woodrow Wilson",
                R.string.twentieigth, getString(R.string.election) + "  32 (1912), 33 (1916)",
                getString(R.string.term) + "  1913 - 1921",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/woodrow-wilson"));
        president.add(new President(R.drawable.face_warrengharding, "Warren G. Harding",
                R.string.twentininth, getString(R.string.election) + "  34 (1920)",
                getString(R.string.term) + "  1921 - 1923*\n* " + getString(R.string.died),
                "http://www.visitrapidcity.com/things-to-do/city-presidents/warren-g-harding"));
        president.add(new President(R.drawable.face_calvincoolidge, "Calvin Coolidge",
                R.string.thirtieth, getString(R.string.election) + "  34 (1920)*, 35 (1924)\n* "
                + getString(R.string.vice), getString(R.string.term) + "  1923 - 1929",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/calvin-coolidge"));
        president.add(new President(R.drawable.face_herberthoover, "Herbert Hoover",
                R.string.thirtifirst, getString(R.string.election) + "  36 (1928)",
                getString(R.string.term) + "  1929 - 1933",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/herbert-hoover"));
        president.add(new President(R.drawable.face_franklindroosevelt, "Franklin D. Roosevelt",
                R.string.thirtisecond, getString(R.string.election)
                + "  37 (1932), 38 (1936), 39 (1940), 40 (1944)", getString(R.string.term)
                + "  1933 - 1945*\n* " + getString(R.string.died),
                "http://www.visitrapidcity.com/things-to-do/city-presidents/franklin-d-roosevelt"));
        president.add(new President(R.drawable.face_harrystruman, "Harry S. Truman",
                R.string.thirtithird, getString(R.string.election) + "  40 (1944)*, 41 (1948)\n* "
                + getString(R.string.vice), getString(R.string.term) + "  1945 - 1953",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/harry-s-truman"));
        president.add(new President(R.drawable.face_dwightdeisenhower, "Dwight D. Eisenhower",
                R.string.thirtifourth, getString(R.string.election) + "  42 (1952), 43 (1956)",
                getString(R.string.term) + "  1953 - 1961",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/dwight-d-eisenhower"));
        president.add(new President(R.drawable.face_johnfkennedy, "John F. Kennedy",
                R.string.thirtififth, getString(R.string.election) + "  44 (1960)",
                getString(R.string.term) + "  1961 - 1963*\n* " + getString(R.string.died),
                "http://www.visitrapidcity.com/things-to-do/city-presidents/john-f-kennedy"));
        president.add(new President(R.drawable.face_lyndonbjohnson, "Lyndon B. Johnson",
                R.string.thirtisixth, getString(R.string.election) + "  44 (1960)*, 45 (1964)\n* "
                + getString(R.string.vice), getString(R.string.term) + "  1963 - 1969",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/lyndon-b-johnson"));
        president.add(new President(R.drawable.face_richardnixon, "Richard Nixon",
                R.string.thirtiseventh, getString(R.string.election) + "  46 (1968), 47 (1972)",
                getString(R.string.term) + "  1969 - 1974*\n* " + getString(R.string.resigned),
                "http://www.visitrapidcity.com/things-to-do/city-presidents/richard-nixon"));
        president.add(new President(R.drawable.face_geraldford, "Gerald Ford",
                R.string.thirtieigth, getString(R.string.election) + "  47 (1972)*\n* " +
                getString(R.string.vice), getString(R.string.term) + "  1974 - 1977",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/gerald-ford"));
        president.add(new President(R.drawable.face_jimmycarter, "Jimmy Carter",
                R.string.thirtininth, getString(R.string.election) + "  48 (1976)",
                getString(R.string.term) + "  1977 - 1981",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/jimmy-carter"));
        president.add(new President(R.drawable.face_ronaldreagan, "Ronald Reagan",
                R.string.fourtieth, getString(R.string.election) + "  49 (1980), 50 (1984)",
                getString(R.string.term) + "  1981 - 1989",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/ronald-reagan"));
        president.add(new President(R.drawable.face_georgehwbush, "George H. W. Bush",
                R.string.fourtifirst, getString(R.string.election) + "  51 (1988)",
                getString(R.string.term) + "  1989 - 1993",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/george-bush-sr"));
        president.add(new President(R.drawable.face_billclinton, "Bill Clinton",
                R.string.fourtisecond, getString(R.string.election) + "  52 (1992), 53 (1996)",
                getString(R.string.term) + "  1993 - 2001",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/bill-clinton"));
        president.add(new President(R.drawable.face_georgewbush, "George W. Bush",
                R.string.fourtithird, getString(R.string.election) + "  54 (2000), 55 (2004)",
                getString(R.string.term) + "  2001 - 2009",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/george-w-bush"));
        president.add(new President(R.drawable.face_coming_soon, "Barack Obama",
                R.string.fourtifourth, getString(R.string.election) + "  56 (2008), 57 (2012)",
                getString(R.string.term) + "  2009 - 2016",
                "http://www.visitrapidcity.com/things-to-do/city-presidents/barack-obama"));

        // Create an {@link PresidentAdapter}, whose data source is a list of {@link President}
        // objects. The adapter knows how to create list item layouts for each word in the list. We
        // will also pass it the background color based on the category
        final PresidentAdapter adapter = new PresidentAdapter(PresidentActivity.this, president);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list_view.xml layout file.
        final ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PresidentAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link President} in the list.
        listView.setAdapter(adapter);

        // Create an OnItemClickListener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get the web address from the current President object
                President presData = president.get(position);
                String url = presData.getPresidentWebpageAddress();

                // Create a new intent to open a web browser with a given URL
                Intent presWebIntent = new Intent(Intent.ACTION_VIEW);
                presWebIntent.setData(Uri.parse(url));
                startActivity(presWebIntent);
            }
        });
    }
}