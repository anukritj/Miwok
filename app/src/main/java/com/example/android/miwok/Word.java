package com.example.android.miwok;

import android.widget.ImageView;

/**
 * Created by anukritjain on 14/10/17.
 */

public class Word {
    //Default translation for the word
    private String mDefaultTranslation;
    //Miwok translation for the word
    private  String mMiwokTranslation;
    private static final int NO_IMAGE_PROVIDED=-1;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private int mAudioResourceId;

    public Word(String defaultTranslation,String miwokTranslation,int audioResourceId){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mAudioResourceId=audioResourceId;
    }

    public Word(String defaultTranslation,String miwokTranslation,int audioResourceId,int ImageResourceId){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResourceId=ImageResourceId;
        mAudioResourceId=audioResourceId;
    }


    //get the default translation of the word

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    //Get Miwok Transation of the word

    public String getMiwokTranslation(){

        return  mMiwokTranslation;
    }

    //Return the image resource ID of the word.
    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId() {return mAudioResourceId;}
}
