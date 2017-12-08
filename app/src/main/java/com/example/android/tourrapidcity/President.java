package com.example.android.tourrapidcity;

/**
 * Created by ndoor on 10/12/2016.
 *{@link President} Is the president being shown on the card. It contains an image, the president's
 * name, which president they were, and the president's webpage address on the Visit Rapid City site
 */

public class President {
    private int mImageResourceID;
    private String mPresName;
    private int mPresNumber;
    private String mElection;
    private String mTerm;
    private String mWebpageAddress;

    /**
     * Create a new Presidents Object, taking in 1 int resource ID input, 1 int number and 4 String
     * inputs.
     * @param imageResourceID is the image resource ID for the president
     * @param presName is the name of the president
     * @param presNumber is the number which the president served as president
     * @param election is the election number(s) and year the president won
     * @param term is the year span which the president served.
     * @param webpageAddress is the webpage address from the Visit Rapid City website in String form
     */
    public President (int imageResourceID, String presName, int presNumber, String election,
                      String term, String webpageAddress) {
        mImageResourceID = imageResourceID;
        mPresName = presName;
        mPresNumber = presNumber;
        mElection = election;
        mTerm = term;
        mWebpageAddress = webpageAddress;
    }

    // This method gets the image Resource ID from the President Object.
    public int getPresidentImageSourceID() {
        return mImageResourceID;
    }

    // This method gets the President's name from the President Object.
    public String getPresidentName() {
        return mPresName;
    }

    // This method gets the number which the President served from the President Object.
    public int getNumberPresident() {
        return mPresNumber;
    }

    // This method gets the election number(s) and year the president won from the President Object.
    public String getElection() {
        return mElection;
    }

    // This method gets the term which the president served from the President Object.
    public String getTerm() {
        return mTerm;
    }

    // This method gets the webpage address for this President on Visit Rapid City website from the
    // President Object.
    public String getPresidentWebpageAddress() {
        return mWebpageAddress;
    }
}