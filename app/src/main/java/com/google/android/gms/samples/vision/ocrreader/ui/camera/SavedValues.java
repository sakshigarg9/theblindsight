package com.google.android.gms.samples.vision.ocrreader.ui.camera;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Shiavngi Pandey on 18-03-2018.
 */

public class SavedValues {


    Context context;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    public SavedValues(Context context){
        this.context = context;
        sharedPreferences = context.getSharedPreferences("shivangi_pandey9798_sharedprefs",Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void saveText(String text){
        editor.putString("text_value",text);
        editor.apply();
    }
    public String getText(){
        return sharedPreferences.getString("text_string",null);
    }
}
