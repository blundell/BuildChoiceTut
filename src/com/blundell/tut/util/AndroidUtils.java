package com.blundell.tut.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

public class AndroidUtils {

	public static String getVersion(Context context) {
        String rtn="";
        try {
            PackageManager manager = context.getPackageManager();
            if(manager != null) {
                PackageInfo info = manager.getPackageInfo(context.getPackageName(), 0);
                if(info != null) {
                    rtn = info.versionName;
                }
            }
        } catch (Exception e) {
            Log.e("", "No version info found");
        }
        return rtn;
    }

}
