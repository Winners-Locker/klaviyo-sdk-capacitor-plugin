export interface KlaviyoSDKCapacitorPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
