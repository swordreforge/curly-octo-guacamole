package com.google.gson.internal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: compiled from: PreJava9DateFormatProvider.java */
/* JADX INFO: loaded from: classes3.dex */
public class x2 {
    /* JADX INFO: renamed from: k */
    private static String m17205k(int i2) {
        if (i2 == 0) {
            return "EEEE, MMMM d, y";
        }
        if (i2 == 1) {
            return "MMMM d, y";
        }
        if (i2 == 2) {
            return "MMM d, y";
        }
        if (i2 == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i2);
    }

    /* JADX INFO: renamed from: n */
    public static DateFormat m17206n(int i2, int i3) {
        return new SimpleDateFormat(toq(i2) + " " + zy(i3), Locale.US);
    }

    /* JADX INFO: renamed from: q */
    public static DateFormat m17207q(int i2) {
        return new SimpleDateFormat(m17205k(i2), Locale.US);
    }

    private static String toq(int i2) {
        if (i2 == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i2 == 1) {
            return "MMMM d, yyyy";
        }
        if (i2 == 2) {
            return "MMM d, yyyy";
        }
        if (i2 == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i2);
    }

    private static String zy(int i2) {
        if (i2 == 0 || i2 == 1) {
            return "h:mm:ss a z";
        }
        if (i2 == 2) {
            return "h:mm:ss a";
        }
        if (i2 == 3) {
            return "h:mm a";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i2);
    }
}
