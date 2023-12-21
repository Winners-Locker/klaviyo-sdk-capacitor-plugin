package com.capacitor.klaviyosdk.plugin;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "KlaviyoSDKCapacitor")
public class KlaviyoSDKCapacitorPlugin extends Plugin {

    private KlaviyoSDKCapacitor implementation = new KlaviyoSDKCapacitor();

    @PluginMethod
    public void initSDK(PluginCall call) {
        String value = call.getString("klaviyoKey");

        JSObject ret = new JSObject();
        ret.put("result", true);
        call.resolve(ret);
    }

    @PluginMethod
    public void setUser(PluginCall call) {
        String email = call.getString("email");
        String firstName = call.getString("firstName");

        JSObject ret = new JSObject();
        ret.put("result", true);
        call.resolve(ret);
    }

    @PluginMethod
    public void setPushToken(PluginCall call) {
        JSObject ret = new JSObject();
        ret.put("token", "test-token");
        call.resolve(ret);
    }
}
