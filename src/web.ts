import { WebPlugin } from '@capacitor/core';

import type { KlaviyoSDKCapacitorPlugin } from './definitions';

export class KlaviyoSDKCapacitorWeb
  extends WebPlugin
  implements KlaviyoSDKCapacitorPlugin
{
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
