package com.tencent.p003a.p004a.p005a.p006a;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class toq extends AbstractC5357g {
    toq(Context context) {
        super(context);
    }

    @Override // com.tencent.p003a.p004a.p005a.p006a.AbstractC5357g
    /* JADX INFO: renamed from: q */
    protected final String mo18229q() {
        String str;
        Iterator<String> it;
        synchronized (this) {
            Log.i("MID", "read mid from InternalStorage");
            try {
                it = C5358k.m18230k(new File(Environment.getExternalStorageDirectory(), C5361y.m18236y("6X8Y4XdM2Vhvn0KfzcEatGnWaNU="))).iterator();
            } catch (IOException e2) {
                Log.w("MID", e2);
            }
            while (it.hasNext()) {
                String[] strArrSplit = it.next().split(",");
                if (strArrSplit.length == 2 && strArrSplit[0].equals(C5361y.m18236y("4kU71lN96TJUomD1vOU9lgj9Tw=="))) {
                    Log.i("MID", "read mid from InternalStorage:" + strArrSplit[1]);
                    str = strArrSplit[1];
                    break;
                }
                str = null;
            }
            str = null;
        }
        return str;
    }

    @Override // com.tencent.p003a.p004a.p005a.p006a.AbstractC5357g
    protected final void toq(String str) {
        synchronized (this) {
            Log.i("MID", "write mid to InternalStorage");
            C5358k.toq(Environment.getExternalStorageDirectory() + "/" + C5361y.m18236y("6X8Y4XdM2Vhvn0I="));
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(Environment.getExternalStorageDirectory(), C5361y.m18236y("6X8Y4XdM2Vhvn0KfzcEatGnWaNU="))));
                bufferedWriter.write(C5361y.m18236y("4kU71lN96TJUomD1vOU9lgj9Tw==") + "," + str);
                bufferedWriter.write("\n");
                bufferedWriter.close();
            } catch (Exception e2) {
                Log.w("MID", e2);
            }
        }
    }

    @Override // com.tencent.p003a.p004a.p005a.p006a.AbstractC5357g
    protected final boolean zy() {
        return C5361y.m18234q(this.f29894k, "android.permission.WRITE_EXTERNAL_STORAGE") && Environment.getExternalStorageState().equals("mounted");
    }
}
