
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
public class RNSambaPlayerNativoModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNSambaPlayerNativoModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNSambaPlayerNativo";
  }

  @ReactMethod
public void checkBridge(final Promise promise) {
  promise.resolve("Funcionou!");
}

}
