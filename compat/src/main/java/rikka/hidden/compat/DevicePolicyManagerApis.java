package rikka.hidden.compat;

import static rikka.hidden.compat.Services.devicePolicyManager;

import android.content.ComponentName;

@SuppressWarnings("unused")
public class DevicePolicyManagerApis {
    public static void setActiveAdmin(ComponentName policyReceiver, boolean refreshing,
                                      int userHandle, String provisioningContext) {

        try {
            devicePolicyManager.get().setActiveAdmin(policyReceiver, refreshing, userHandle, provisioningContext);
        } catch(Exception e) {
            devicePolicyManager.get().setActiveAdmin(policyReceiver, refreshing, userHandle);
        }
    }

    public static void setActiveAdmin(ComponentName policyReceiver, boolean refreshing, int userHandle) {
        setActiveAdmin(policyReceiver, refreshing, userHandle, null);
    }
}
