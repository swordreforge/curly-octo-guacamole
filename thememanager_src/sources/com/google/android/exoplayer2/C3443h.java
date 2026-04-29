package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.InterfaceC3555s;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: com.google.android.exoplayer2.h */
/* JADX INFO: compiled from: DeviceInfo.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3443h implements InterfaceC3555s {

    /* JADX INFO: renamed from: g */
    public static final int f20537g = 0;

    /* JADX INFO: renamed from: h */
    private static final int f20538h = 1;

    /* JADX INFO: renamed from: i */
    private static final int f20539i = 2;

    /* JADX INFO: renamed from: p */
    private static final int f20540p = 0;

    /* JADX INFO: renamed from: y */
    public static final int f20542y = 1;

    /* JADX INFO: renamed from: k */
    public final int f20544k;

    /* JADX INFO: renamed from: n */
    public final int f20545n;

    /* JADX INFO: renamed from: q */
    public final int f20546q;

    /* JADX INFO: renamed from: s */
    public static final C3443h f20541s = new C3443h(0, 0, 0);

    /* JADX INFO: renamed from: z */
    public static final InterfaceC3555s.k<C3443h> f20543z = new InterfaceC3555s.k() { // from class: com.google.android.exoplayer2.kja0
        @Override // com.google.android.exoplayer2.InterfaceC3555s.k
        /* JADX INFO: renamed from: k */
        public final InterfaceC3555s mo11492k(Bundle bundle) {
            return C3443h.zy(bundle);
        }
    };

    /* JADX INFO: renamed from: com.google.android.exoplayer2.h$k */
    /* JADX INFO: compiled from: DeviceInfo.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface k {
    }

    public C3443h(int i2, int i3, int i4) {
        this.f20544k = i2;
        this.f20546q = i3;
        this.f20545n = i4;
    }

    private static String toq(int i2) {
        return Integer.toString(i2, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C3443h zy(Bundle bundle) {
        return new C3443h(bundle.getInt(toq(0), 0), bundle.getInt(toq(1), 0), bundle.getInt(toq(2), 0));
    }

    public boolean equals(@zy.dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3443h)) {
            return false;
        }
        C3443h c3443h = (C3443h) obj;
        return this.f20544k == c3443h.f20544k && this.f20546q == c3443h.f20546q && this.f20545n == c3443h.f20545n;
    }

    public int hashCode() {
        return ((((527 + this.f20544k) * 31) + this.f20546q) * 31) + this.f20545n;
    }

    @Override // com.google.android.exoplayer2.InterfaceC3555s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(toq(0), this.f20544k);
        bundle.putInt(toq(1), this.f20546q);
        bundle.putInt(toq(2), this.f20545n);
        return bundle;
    }
}
