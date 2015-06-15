package ru.isys.cordova.plugins;

import android.view.WindowManager;
import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class ScreenWatcher extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {
        if ("block".equals(action)) {
            cordova.getActivity().getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
            callbackContext.success();
            return true;
        } else {
            return false;
        }
    }
}