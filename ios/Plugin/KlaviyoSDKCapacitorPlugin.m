#import <Foundation/Foundation.h>
#import <Capacitor/Capacitor.h>

// Define the plugin using the CAP_PLUGIN Macro, and
// each method the plugin supports using the CAP_PLUGIN_METHOD macro.
CAP_PLUGIN(KlaviyoSDKCapacitorPlugin, "KlaviyoSDKCapacitor",
           CAP_PLUGIN_METHOD(initSDK, CAPPluginReturnPromise);
           CAP_PLUGIN_METHOD(setUser, CAPPluginReturnPromise);
           CAP_PLUGIN_METHOD(requestPushPermission, CAPPluginReturnPromise);
           CAP_PLUGIN_METHOD(setPushToken, CAPPluginReturnPromise);
           CAP_PLUGIN_METHOD(resetProfile, CAPPluginReturnPromise);
)
