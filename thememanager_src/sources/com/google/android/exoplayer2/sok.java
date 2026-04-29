package com.google.android.exoplayer2;

import java.io.IOException;

/* JADX INFO: compiled from: ParserException.java */
/* JADX INFO: loaded from: classes2.dex */
public class sok extends IOException {
    public final boolean contentIsMalformed;
    public final int dataType;

    protected sok(@zy.dd String str, @zy.dd Throwable th, boolean z2, int i2) {
        super(str, th);
        this.contentIsMalformed = z2;
        this.dataType = i2;
    }

    public static sok createForMalformedContainer(@zy.dd String str, @zy.dd Throwable th) {
        return new sok(str, th, true, 1);
    }

    public static sok createForMalformedDataOfUnknownType(@zy.dd String str, @zy.dd Throwable th) {
        return new sok(str, th, true, 0);
    }

    public static sok createForMalformedManifest(@zy.dd String str, @zy.dd Throwable th) {
        return new sok(str, th, true, 4);
    }

    public static sok createForManifestWithUnsupportedFeature(@zy.dd String str, @zy.dd Throwable th) {
        return new sok(str, th, false, 4);
    }

    public static sok createForUnsupportedContainerFeature(@zy.dd String str) {
        return new sok(str, null, false, 1);
    }
}
