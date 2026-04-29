package com.xiaomi.push;

import android.os.Looper;
import android.text.TextUtils;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public class y3 {

    /* JADX INFO: renamed from: com.xiaomi.push.y3$k */
    public static class C5965k {

        /* JADX INFO: renamed from: k */
        private final StringBuilder f34211k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final String f73743toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final String f73744zy;

        public C5965k() {
            this(":", ",");
        }

        /* JADX INFO: renamed from: k */
        public C5965k m22050k(String str, Object obj) {
            if (!TextUtils.isEmpty(str)) {
                if (this.f34211k.length() > 0) {
                    this.f34211k.append(this.f73744zy);
                }
                StringBuilder sb = this.f34211k;
                sb.append(str);
                sb.append(this.f73743toq);
                sb.append(obj);
            }
            return this;
        }

        public String toString() {
            return this.f34211k.toString();
        }

        public C5965k(String str, String str2) {
            this.f34211k = new StringBuilder();
            this.f73743toq = str;
            this.f73744zy = str2;
        }
    }

    /* JADX INFO: renamed from: k */
    public static int m22047k(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return i2;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i2;
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m22048n(String str, int i2) {
        return !TextUtils.isEmpty(str) ? ((str.hashCode() / 10) * 10) + i2 : i2;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m22049q(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static long toq(String str, long j2) {
        if (TextUtils.isEmpty(str)) {
            return j2;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return j2;
        }
    }

    public static boolean zy() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }
}
