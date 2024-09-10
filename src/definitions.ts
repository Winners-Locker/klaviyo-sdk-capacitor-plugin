export interface KlaviyoSDKCapacitorPlugin {
  initSDK(options: { klaviyoKey: string }): Promise<{ result: boolean }>;
  setUser(options: {
    email: string;
    firstName: string;
    lastName: string;
  }): Promise<{ result: boolean }>;
  requestPushPermission(): Promise<{ result: boolean }>; // only required for IOS
  setPushToken(options: { token: string }): Promise<{ token: string }>;
  resetProfile(): Promise<{ result: boolean; }>;
}
