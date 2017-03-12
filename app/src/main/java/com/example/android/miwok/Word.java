package com.example.android.miwok;

/**
 * represent a vocabulary word the the user want to learn.
 * it contain default translation and miwok translation for that word
 * Created by ThinkPad on 3/5/2017.
 */

public class Word {

        // Default translation for the word, dat private boi vi chi can su dung trong class nay thoi
       private String mDefaultTransation;

        //Miwor translation for the word
        private String mMiwokTranslation;

        private int mImageResouceId = NO_IMAGE_PROVIDED;

        private static final  int NO_IMAGE_PROVIDED = -1; // -1 La trang thai mac dinh khong co hinh anh

        // Sau do ta khoi tao ham tao voi 2 tham so defaultTranslation va miwokTranslation

    /**
     * nen khai bao la public de cac lop ngoai lop Word nay co the truy cap
     * @param defaultTranslation
     * @param miwokTranslation
     */
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTransation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
    //Ham tao thu 2
    /**
     * nen khai bao la public de cac lop ngoai lop Word nay co the truy cap
     * @param defaultTranslation
     * @param miwokTranslation
     * @param imageResourceId là hinh anh cho cac doi tuong Word được gắn với chữ
     */
    public Word(String defaultTransation, String miwokTranslation, int imageResourceId){
        mDefaultTransation = defaultTransation;
        mMiwokTranslation = miwokTranslation;
        mImageResouceId =  imageResourceId;
    }

    /**
     * get default translation of the word
     */
    public String getDefaultTranslation(){
        return mDefaultTransation;
    }
    /**
     * get miwok translation of the word
     */
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public int getmImageResouceId(){
        return mImageResouceId;
    }

    /**
     * Return whether or not there is an image for this word
    */
    public boolean hasImage(){
    return mImageResouceId != NO_IMAGE_PROVIDED;   // Ket qua cua bieu thuc nay la se dung hoac sai
    }
}
