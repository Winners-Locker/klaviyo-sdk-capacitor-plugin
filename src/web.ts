import { WebPlugin } from '@capacitor/core';

import type { KlaviyoSDKCapacitorPlugin } from './definitions';

export class KlaviyoSDKCapacitorWeb
  extends WebPlugin
  implements KlaviyoSDKCapacitorPlugin
{
  // eslint-disable-next-line @typescript-eslint/no-unused-vars
  initSDK(_options: { klaviyoKey: string }): Promise<{ result: boolean }> {
    throw new Error('Method not implemented.');
  }
  // eslint-disable-next-line @typescript-eslint/no-unused-vars
  setUser(_options: {
    email: string;
    firstName: string;
  }): Promise<{ result: boolean }> {
    throw new Error('Method not implemented.');
  }
  requestPushPermission(): Promise<{ result: boolean }> {
    throw new Error('Method not implemented.');
  }
  // eslint-disable-next-line @typescript-eslint/no-unused-vars
  setPushToken(_options: { token: string }): Promise<{ token: string }> {
    throw new Error('Method not implemented.');
  }
}
