package com.ssaeed383.instaparse;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("B3320zYSA7R3On9ejovz7OaRmy7mJJZG3wcxvHd9")
                .clientKey("5Ysth3u7g2ijsWDVEastzFHkwa4SSIxSNUkseKsw")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
