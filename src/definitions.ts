export interface KlaviyoSDKCapacitorPlugin {
  initSDK(options: { klaviyoKey: string }): Promise<{ result: boolean }>;
  setUser(options: {
    email: string;
    firstName: string; // only required for android
  }): Promise<{ result: boolean }>;
  requestPushPermission(): Promise<{ result: boolean }>; // only required for IOS
  setPushToken(): Promise<{ token: string }>;
}
