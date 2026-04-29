package com.google.android.exoplayer2.text.webvtt;

import android.text.TextUtils;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.text.webvtt.q */
/* JADX INFO: compiled from: WebvttCssStyle.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3688q {

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final int f65934fn3e = 2;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final int f65935fu4 = 2;

    /* JADX INFO: renamed from: i */
    public static final int f22114i = 1;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final int f65936ki = -1;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final int f65937ni7 = 1;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final int f65938o1t = 0;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final int f65939t8r = 0;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final int f65940wvg = 1;

    /* JADX INFO: renamed from: z */
    public static final int f22115z = 3;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final int f65941zurt = 3;

    /* JADX INFO: renamed from: g */
    @zy.x2
    private int f22116g;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private float f65944kja0;

    /* JADX INFO: renamed from: y */
    private int f22123y;

    /* JADX INFO: renamed from: k */
    private String f22118k = "";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private String f65948toq = "";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Set<String> f65950zy = Collections.emptySet();

    /* JADX INFO: renamed from: q */
    private String f22121q = "";

    /* JADX INFO: renamed from: n */
    @dd
    private String f22119n = null;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private boolean f65943f7l8 = false;

    /* JADX INFO: renamed from: s */
    private boolean f22122s = false;

    /* JADX INFO: renamed from: p */
    private int f22120p = -1;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int f65945ld6 = -1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f65949x2 = -1;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private int f65947qrj = -1;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private int f65946n7h = -1;

    /* JADX INFO: renamed from: h */
    private int f22117h = -1;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private boolean f65942cdj = false;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.webvtt.q$k */
    /* JADX INFO: compiled from: WebvttCssStyle.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface k {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.webvtt.q$toq */
    /* JADX INFO: compiled from: WebvttCssStyle.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface toq {
    }

    private static int mcp(int i2, String str, @dd String str2, int i3) {
        if (str.isEmpty() || i2 == -1) {
            return i2;
        }
        if (str.equals(str2)) {
            return i2 + i3;
        }
        return -1;
    }

    public C3688q cdj(int i2) {
        this.f22116g = i2;
        this.f65943f7l8 = true;
        return this;
    }

    public int f7l8() {
        return this.f22117h;
    }

    public C3688q fn3e(boolean z2) {
        this.f65947qrj = z2 ? 1 : 0;
        return this;
    }

    public void fu4(String[] strArr) {
        this.f65950zy = new HashSet(Arrays.asList(strArr));
    }

    /* JADX INFO: renamed from: g */
    public int m12995g() {
        return this.f65946n7h;
    }

    /* JADX INFO: renamed from: h */
    public C3688q m12996h(boolean z2) {
        this.f65942cdj = z2;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public C3688q m12997i(int i2) {
        this.f65946n7h = i2;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public int m12998k() {
        if (this.f22122s) {
            return this.f22123y;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public C3688q ki(@dd String str) {
        this.f22119n = str == null ? null : com.google.common.base.zy.f7l8(str);
        return this;
    }

    public C3688q kja0(boolean z2) {
        this.f65949x2 = z2 ? 1 : 0;
        return this;
    }

    public boolean ld6() {
        return this.f65943f7l8;
    }

    /* JADX INFO: renamed from: n */
    public float m12999n() {
        return this.f65944kja0;
    }

    public C3688q n7h(int i2) {
        this.f22123y = i2;
        this.f22122s = true;
        return this;
    }

    public C3688q ni7(int i2) {
        this.f22117h = i2;
        return this;
    }

    public void o1t(String str) {
        this.f65948toq = str;
    }

    /* JADX INFO: renamed from: p */
    public boolean m13000p() {
        return this.f22122s;
    }

    @dd
    /* JADX INFO: renamed from: q */
    public String m13001q() {
        return this.f22119n;
    }

    public boolean qrj() {
        return this.f65945ld6 == 1;
    }

    /* JADX INFO: renamed from: s */
    public int m13002s() {
        int i2 = this.f65949x2;
        if (i2 == -1 && this.f65947qrj == -1) {
            return -1;
        }
        return (i2 == 1 ? 1 : 0) | (this.f65947qrj == 1 ? 2 : 0);
    }

    /* JADX INFO: renamed from: t */
    public C3688q m13003t(boolean z2) {
        this.f65945ld6 = z2 ? 1 : 0;
        return this;
    }

    public C3688q t8r(float f2) {
        this.f65944kja0 = f2;
        return this;
    }

    public boolean toq() {
        return this.f65942cdj;
    }

    public void wvg(String str) {
        this.f22121q = str;
    }

    public boolean x2() {
        return this.f22120p == 1;
    }

    /* JADX INFO: renamed from: y */
    public int m13004y(@dd String str, @dd String str2, Set<String> set, @dd String str3) {
        if (this.f22118k.isEmpty() && this.f65948toq.isEmpty() && this.f65950zy.isEmpty() && this.f22121q.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iMcp = mcp(mcp(mcp(0, this.f22118k, str, 1073741824), this.f65948toq, str2, 2), this.f22121q, str3, 4);
        if (iMcp == -1 || !set.containsAll(this.f65950zy)) {
            return 0;
        }
        return iMcp + (this.f65950zy.size() * 4);
    }

    /* JADX INFO: renamed from: z */
    public void m13005z(String str) {
        this.f22118k = str;
    }

    public C3688q zurt(boolean z2) {
        this.f22120p = z2 ? 1 : 0;
        return this;
    }

    public int zy() {
        if (this.f65943f7l8) {
            return this.f22116g;
        }
        throw new IllegalStateException("Font color not defined");
    }
}
