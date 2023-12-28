package com.capacitor.klaviyosdk.plugin;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.klaviyo.analytics.Klaviyo;
import com.klaviyo.analytics.model.ProfileKey;

@CapacitorPlugin(name = "KlaviyoSDKCapacitor")
public class KlaviyoSDKCapacitorPlugin extends Plugin {

    private KlaviyoSDKCapacitor implementation = new KlaviyoSDKCapacitor();

    @PluginMethod
    public void initSDK(PluginCall call) {
        String key = call.getString("klaviyoKey");

        Klaviyo.INSTANCE.initialize(key, getActivity().getApplicationContext());
        JSObject ret = new JSObject();
        ret.put("result", true);
        call.resolve(ret);
    }

    @PluginMethod
    public void setUser(PluginCall call) {
        String email = call.getString("email");
        String firstName = call.getString("firstName");

        Klaviyo.INSTANCE
                .setEmail(email)
                .setProfileAttribute(ProfileKey.FIRST_NAME.INSTANCE, firstName);
        JSObject ret = new JSObject();
        ret.put("result", true);
        call.resolve(ret);
    }

    @PluginMethod
    public void setPushToken(PluginCall call) {
        JSObject ret = new JSObject();
        String token = call.getString("token");
        Klaviyo.INSTANCE.setPushToken(token);
        ret.put("token", "test-token");
        call.resolve(ret);
    }
}
