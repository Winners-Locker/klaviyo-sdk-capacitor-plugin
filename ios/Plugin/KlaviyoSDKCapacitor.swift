import Foundation

@objc public class KlaviyoSDKCapacitor: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
