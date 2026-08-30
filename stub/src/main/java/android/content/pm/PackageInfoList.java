package android.content.pm;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.List;

@RequiresApi(37)
public class PackageInfoList extends ParceledListSlice<PackageInfo> {

    public PackageInfoList(List<PackageInfo> list) {
        super(list);
    }
}