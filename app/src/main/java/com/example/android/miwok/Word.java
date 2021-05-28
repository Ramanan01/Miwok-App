package com.example.android.miwok;

public class Word {
    private String myDefaultTranslation;
    private String myMiwokTranslation;
    private int myImageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
    public Word(String defaultTranslation, String miwokTranslation) {
        myDefaultTranslation = defaultTranslation;
        myMiwokTranslation = miwokTranslation;
    }
    public Word(String defaultTranslation, String miwokTranslation,int imageResourceId){
        myDefaultTranslation = defaultTranslation;
        myMiwokTranslation = miwokTranslation;
        myImageResourceId=imageResourceId;
    }
    public String getDefaultTranslation() {
        return myDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return myMiwokTranslation;}
    public int getMyImageResourceId(){
        return myImageResourceId;
    }

    public boolean hasImage(){
        return myImageResourceId!=NO_IMAGE_PROVIDED;
    }
}
