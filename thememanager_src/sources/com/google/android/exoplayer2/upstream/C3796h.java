package com.google.android.exoplayer2.upstream;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.h */
/* JADX INFO: compiled from: DataSourceException.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3796h extends IOException {

    @Deprecated
    public static final int POSITION_OUT_OF_RANGE = 2008;
    public final int reason;

    public C3796h(int i2) {
        this.reason = i2;
    }

    public static boolean isCausedByPositionOutOfRange(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof C3796h) && ((C3796h) cause).reason == 2008) {
                return true;
            }
        }
        return false;
    }

    public C3796h(@zy.dd Throwable th, int i2) {
        super(th);
        this.reason = i2;
    }

    public C3796h(@zy.dd String str, int i2) {
        super(str);
        this.reason = i2;
    }

    public C3796h(@zy.dd String str, @zy.dd Throwable th, int i2) {
        super(str, th);
        this.reason = i2;
    }
}
