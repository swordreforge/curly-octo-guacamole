package com.xiaomi.push;

import android.util.Log;
import android.util.Pair;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
class uc implements Runnable {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ String f33977k;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ yl f33978n;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ Throwable f33979q;

    uc(yl ylVar, String str, Throwable th) {
        this.f33978n = ylVar;
        this.f33977k = str;
        this.f33979q = th;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        yl.f34213g.add(new Pair(String.format("%1$s %2$s %3$s ", yl.f34215q.format(new Date()), this.f33978n.f34216k, this.f33977k), this.f33979q));
        if (yl.f34213g.size() > 20000) {
            int size = (yl.f34213g.size() - com.android.thememanager.lockscreen.lock.wallpaper.kja0.f60389kja0) + 50;
            for (int i2 = 0; i2 < size; i2++) {
                try {
                    if (yl.f34213g.size() > 0) {
                        yl.f34213g.remove(0);
                    }
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            yl.f34213g.add(new Pair(String.format("%1$s %2$s %3$s ", yl.f34215q.format(new Date()), this.f33978n.f34216k, "flush " + size + " lines logs."), null));
        }
        try {
            this.f33978n.m22056y();
        } catch (Exception e2) {
            Log.e(this.f33978n.f34216k, "", e2);
        }
    }
}
