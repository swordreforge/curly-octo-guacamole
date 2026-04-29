package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.exoplayer2.InterfaceC3555s;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.C3853q;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import zy.InterfaceC7839p;

/* JADX INFO: compiled from: ExoPlaybackException.java */
/* JADX INFO: loaded from: classes2.dex */
public final class ki extends yqrt {
    public static final InterfaceC3555s.k<ki> CREATOR = new InterfaceC3555s.k() { // from class: com.google.android.exoplayer2.cdj
        @Override // com.google.android.exoplayer2.InterfaceC3555s.k
        /* JADX INFO: renamed from: k */
        public final InterfaceC3555s mo11492k(Bundle bundle) {
            return ki.m12158q(bundle);
        }
    };
    public static final int TYPE_REMOTE = 3;
    public static final int TYPE_RENDERER = 1;
    public static final int TYPE_SOURCE = 0;
    public static final int TYPE_UNEXPECTED = 2;

    /* JADX INFO: renamed from: h */
    private static final int f20593h = 1003;

    /* JADX INFO: renamed from: i */
    private static final int f20594i = 1004;

    /* JADX INFO: renamed from: p */
    private static final int f20595p = 1002;

    /* JADX INFO: renamed from: s */
    private static final int f20596s = 1001;

    /* JADX INFO: renamed from: t */
    private static final int f20597t = 1006;

    /* JADX INFO: renamed from: z */
    private static final int f20598z = 1005;
    final boolean isRecoverable;

    @zy.dd
    public final com.google.android.exoplayer2.source.a9 mediaPeriodId;

    @zy.dd
    public final xwq3 rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;

    @zy.dd
    public final String rendererName;
    public final int type;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ki$k */
    /* JADX INFO: compiled from: ExoPlaybackException.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3450k {
    }

    private ki(int i2, Throwable th, int i3) {
        this(i2, th, null, i3, null, -1, null, 4, false);
    }

    public static ki createForRemote(String str) {
        return new ki(3, null, str, 1001, null, -1, null, 4, false);
    }

    public static ki createForRenderer(Throwable th, String str, int i2, @zy.dd xwq3 xwq3Var, int i3, boolean z2, int i4) {
        return new ki(1, th, null, i4, str, i2, xwq3Var, xwq3Var == null ? 4 : i3, z2);
    }

    public static ki createForSource(IOException iOException, int i2) {
        return new ki(0, iOException, i2);
    }

    @Deprecated
    public static ki createForUnexpected(RuntimeException runtimeException) {
        return createForUnexpected(runtimeException, 1000);
    }

    /* JADX INFO: renamed from: n */
    private static String m12157n(int i2, @zy.dd String str, @zy.dd String str2, int i3, @zy.dd xwq3 xwq3Var, int i4) {
        String string;
        if (i2 == 0) {
            string = "Source error";
        } else if (i2 != 1) {
            string = i2 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            String strValueOf = String.valueOf(xwq3Var);
            String strYz = com.google.android.exoplayer2.util.lrht.yz(i4);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 53 + strValueOf.length() + String.valueOf(strYz).length());
            sb.append(str2);
            sb.append(" error, index=");
            sb.append(i3);
            sb.append(", format=");
            sb.append(strValueOf);
            sb.append(", format_supported=");
            sb.append(strYz);
            string = sb.toString();
        }
        if (TextUtils.isEmpty(str)) {
            return string;
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 2 + String.valueOf(str).length());
        sb2.append(strValueOf2);
        sb2.append(": ");
        sb2.append(str);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ ki m12158q(Bundle bundle) {
        return new ki(bundle);
    }

    @InterfaceC7839p
    ki copyWithMediaPeriodId(@zy.dd com.google.android.exoplayer2.source.a9 a9Var) {
        return new ki((String) com.google.android.exoplayer2.util.lrht.ld6(getMessage()), getCause(), this.errorCode, this.type, this.rendererName, this.rendererIndex, this.rendererFormat, this.rendererFormatSupport, a9Var, this.timestampMs, this.isRecoverable);
    }

    @Override // com.google.android.exoplayer2.yqrt
    public boolean errorInfoEquals(@zy.dd yqrt yqrtVar) {
        if (!super.errorInfoEquals(yqrtVar)) {
            return false;
        }
        ki kiVar = (ki) com.google.android.exoplayer2.util.lrht.ld6(yqrtVar);
        return this.type == kiVar.type && com.google.android.exoplayer2.util.lrht.zy(this.rendererName, kiVar.rendererName) && this.rendererIndex == kiVar.rendererIndex && com.google.android.exoplayer2.util.lrht.zy(this.rendererFormat, kiVar.rendererFormat) && this.rendererFormatSupport == kiVar.rendererFormatSupport && com.google.android.exoplayer2.util.lrht.zy(this.mediaPeriodId, kiVar.mediaPeriodId) && this.isRecoverable == kiVar.isRecoverable;
    }

    public Exception getRendererException() {
        C3844k.m13633s(this.type == 1);
        return (Exception) C3844k.f7l8(getCause());
    }

    public IOException getSourceException() {
        C3844k.m13633s(this.type == 0);
        return (IOException) C3844k.f7l8(getCause());
    }

    public RuntimeException getUnexpectedException() {
        C3844k.m13633s(this.type == 2);
        return (RuntimeException) C3844k.f7l8(getCause());
    }

    @Override // com.google.android.exoplayer2.yqrt, com.google.android.exoplayer2.InterfaceC3555s
    public Bundle toBundle() {
        Bundle bundle = super.toBundle();
        bundle.putInt(yqrt.keyForField(1001), this.type);
        bundle.putString(yqrt.keyForField(1002), this.rendererName);
        bundle.putInt(yqrt.keyForField(1003), this.rendererIndex);
        bundle.putBundle(yqrt.keyForField(1004), C3853q.m13719p(this.rendererFormat));
        bundle.putInt(yqrt.keyForField(1005), this.rendererFormatSupport);
        bundle.putBoolean(yqrt.keyForField(1006), this.isRecoverable);
        return bundle;
    }

    private ki(int i2, @zy.dd Throwable th, @zy.dd String str, int i3, @zy.dd String str2, int i4, @zy.dd xwq3 xwq3Var, int i5, boolean z2) {
        this(m12157n(i2, str, str2, i4, xwq3Var, i5), th, i3, i2, str2, i4, xwq3Var, i5, null, SystemClock.elapsedRealtime(), z2);
    }

    public static ki createForUnexpected(RuntimeException runtimeException, int i2) {
        return new ki(2, runtimeException, i2);
    }

    private ki(Bundle bundle) {
        super(bundle);
        this.type = bundle.getInt(yqrt.keyForField(1001), 2);
        this.rendererName = bundle.getString(yqrt.keyForField(1002));
        this.rendererIndex = bundle.getInt(yqrt.keyForField(1003), -1);
        this.rendererFormat = (xwq3) C3853q.m13718n(xwq3.hp, bundle.getBundle(yqrt.keyForField(1004)));
        this.rendererFormatSupport = bundle.getInt(yqrt.keyForField(1005), 4);
        this.isRecoverable = bundle.getBoolean(yqrt.keyForField(1006), false);
        this.mediaPeriodId = null;
    }

    private ki(String str, @zy.dd Throwable th, int i2, int i3, @zy.dd String str2, int i4, @zy.dd xwq3 xwq3Var, int i5, @zy.dd com.google.android.exoplayer2.source.a9 a9Var, long j2, boolean z2) {
        super(str, th, i2, j2);
        C3844k.m13629k(!z2 || i3 == 1);
        C3844k.m13629k(th != null || i3 == 3);
        this.type = i3;
        this.rendererName = str2;
        this.rendererIndex = i4;
        this.rendererFormat = xwq3Var;
        this.rendererFormatSupport = i5;
        this.mediaPeriodId = a9Var;
        this.isRecoverable = z2;
    }
}
