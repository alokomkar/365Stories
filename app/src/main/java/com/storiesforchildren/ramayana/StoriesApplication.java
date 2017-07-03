package com.storiesforchildren.ramayana;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by Alok on 03/07/17.
 */

public class StoriesApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/VarelaRound-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }

}
