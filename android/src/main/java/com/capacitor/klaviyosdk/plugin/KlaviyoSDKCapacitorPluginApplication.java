package com.capacitor.klaviyosdk.plugin;
import android.app.Application;
import com.klaviyo.analytics.Klaviyo;


public class KlaviyoSDKCapacitorPluginApplication extends Application {
    public void onCreate() {
        super.onCreate();

        Klaviyo.INSTANCE.initialize("KLAVIYO_PUBLIC_API_KEY", getApplicationContext());

        registerActivityLifecycleCallbacks(Klaviyo.INSTANCE.getLifecycleCallbacks());
    }
}
