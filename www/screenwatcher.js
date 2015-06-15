/**
 * Created by d.konopelkin on 15.06.2015.
 */
module.exports = {
    blockScreenshot: function (successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "ScreenWatcher", "block");
    }
};