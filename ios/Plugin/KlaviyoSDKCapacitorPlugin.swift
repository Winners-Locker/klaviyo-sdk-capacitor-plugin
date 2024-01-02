import Foundation
import Capacitor
import KlaviyoSwift
import UserNotifications

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(KlaviyoSDKCapacitorPlugin)
public class KlaviyoSDKCapacitorPlugin: CAPPlugin {
    private let implementation = KlaviyoSDKCapacitor()

    @objc func initSDK(_ call: CAPPluginCall) {
        let value = call.getString("klaviyoKey") ?? ""
        KlaviyoSDK().initialize(with: value)
        call.resolve([
            "result": true
        ])
    }

    @objc func setUser(_ call: CAPPluginCall) {
        let value = call.getString("email") ?? ""
        KlaviyoSDK().set(email: value)
        call.resolve([
            "result": true
        ])
    }
    
    // this is not needed
    @objc func requestPushPermission(_ call: CAPPluginCall) {
        call.resolve([
            "result": true
        ])
    }

    // this is not needed
    @objc func setPushToken(_ call: CAPPluginCall) {
      call.resolve([
          "result": true
      ])
    }
}
