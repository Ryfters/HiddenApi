package android.app.admin;

import android.content.ComponentName;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

public interface IDevicePolicyManager extends IInterface {

    void setActiveAdmin(ComponentName policyReceiver, boolean refreshing,
                        int userHandle, String provisioningContext);

    void setActiveAdmin(ComponentName policyReceiver, boolean refreshing, int userHandle);

    abstract class Stub extends Binder implements IDevicePolicyManager {
        public static IDevicePolicyManager asInterface(IBinder obj) {
            throw new RuntimeException("Stub!");
        }
    }
}
