package com.google.android.exoplayer2.audio;

/* JADX INFO: compiled from: WavUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class uv6 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f63516f7l8 = 1;

    /* JADX INFO: renamed from: g */
    public static final int f19486g = 1685272116;

    /* JADX INFO: renamed from: k */
    public static final int f19487k = 1380533830;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f63517ld6 = 17;

    /* JADX INFO: renamed from: n */
    public static final int f19488n = 1380333108;

    /* JADX INFO: renamed from: p */
    public static final int f19489p = 7;

    /* JADX INFO: renamed from: q */
    public static final int f19490q = 1684108385;

    /* JADX INFO: renamed from: s */
    public static final int f19491s = 6;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f63518toq = 1463899717;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f63519x2 = 65534;

    /* JADX INFO: renamed from: y */
    public static final int f19492y = 3;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f63520zy = 1718449184;

    private uv6() {
    }

    /* JADX INFO: renamed from: k */
    public static int m11527k(int i2, int i3) {
        if (i2 != 1) {
            if (i2 == 3) {
                return i3 == 32 ? 4 : 0;
            }
            if (i2 != 65534) {
                return 0;
            }
        }
        return com.google.android.exoplayer2.util.lrht.m13652a(i3);
    }

    public static int toq(int i2) {
        if (i2 == 2 || i2 == 3) {
            return 1;
        }
        if (i2 == 4) {
            return 3;
        }
        if (i2 == 536870912 || i2 == 805306368) {
            return 1;
        }
        throw new IllegalArgumentException();
    }
}
