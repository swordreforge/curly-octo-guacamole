package com.airbnb.lottie;

import java.util.HashMap;
import java.util.Map;
import zy.uv6;
import zy.yz;

/* JADX INFO: compiled from: TextDelegate.java */
/* JADX INFO: loaded from: classes.dex */
public class hb {

    /* JADX INFO: renamed from: k */
    private final Map<String, String> f7947k;

    /* JADX INFO: renamed from: q */
    private boolean f7948q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @zy.dd
    private final LottieAnimationView f55956toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @zy.dd
    private final C1504r f55957zy;

    @yz
    hb() {
        this.f7947k = new HashMap();
        this.f7948q = true;
        this.f55956toq = null;
        this.f55957zy = null;
    }

    /* JADX INFO: renamed from: q */
    private void m5964q() {
        LottieAnimationView lottieAnimationView = this.f55956toq;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        C1504r c1504r = this.f55957zy;
        if (c1504r != null) {
            c1504r.invalidateSelf();
        }
    }

    public void f7l8(boolean z2) {
        this.f7948q = z2;
    }

    /* JADX INFO: renamed from: g */
    public void m5965g(String str) {
        this.f7947k.remove(str);
        m5964q();
    }

    /* JADX INFO: renamed from: k */
    public String m5966k(String str) {
        return str;
    }

    /* JADX INFO: renamed from: n */
    public void m5967n() {
        this.f7947k.clear();
        m5964q();
    }

    public String toq(String str, String str2) {
        return m5966k(str2);
    }

    /* JADX INFO: renamed from: y */
    public void m5968y(String str, String str2) {
        this.f7947k.put(str, str2);
        m5964q();
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY})
    public final String zy(String str, String str2) {
        if (this.f7948q && this.f7947k.containsKey(str2)) {
            return this.f7947k.get(str2);
        }
        String qVar = toq(str, str2);
        if (this.f7948q) {
            this.f7947k.put(str2, qVar);
        }
        return qVar;
    }

    public hb(LottieAnimationView lottieAnimationView) {
        this.f7947k = new HashMap();
        this.f7948q = true;
        this.f55956toq = lottieAnimationView;
        this.f55957zy = null;
    }

    public hb(C1504r c1504r) {
        this.f7947k = new HashMap();
        this.f7948q = true;
        this.f55957zy = c1504r;
        this.f55956toq = null;
    }
}
