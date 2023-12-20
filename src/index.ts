import { registerPlugin } from '@capacitor/core';

import type { KlaviyoSDKCapacitorPlugin } from './definitions';

const KlaviyoSDKCapacitor = registerPlugin<KlaviyoSDKCapacitorPlugin>(
  'KlaviyoSDKCapacitor',
  {
    web: () => import('./web').then(m => new m.KlaviyoSDKCapacitorWeb()),
  },
);

export * from './definitions';
export { KlaviyoSDKCapacitor };
