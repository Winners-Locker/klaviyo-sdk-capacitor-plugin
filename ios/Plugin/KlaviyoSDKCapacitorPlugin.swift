import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(KlaviyoSDKCapacitorPlugin)
public class KlaviyoSDKCapacitorPlugin: CAPPlugin {
    private let implementation = KlaviyoSDKCapacitor()

    @objc func initSDK(_ call: CAPPluginCall) {
        let value = call.getString("klaviyoKey") ?? ""
        call.resolve([
            "result": true
        ])
    }

    @objc func setUser(_ call: CAPPluginCall) {
        let value = call.getString("email") ?? ""
        call.resolve([
            "result": true
        ])
    }
    
    @objc func requestPushPermission(_ call: CAPPluginCall) {
    
      call.resolve([
          "result": true
      ])
    }

    @objc func setPushToken(_ call: CAPPluginCall) {
      
      call.resolve([
          "token": "test-token"
      ])
    }
}
