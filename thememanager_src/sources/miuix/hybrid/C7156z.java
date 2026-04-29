package miuix.hybrid;

import android.view.View;

/* JADX INFO: renamed from: miuix.hybrid.z */
/* JADX INFO: compiled from: Request.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7156z {

    /* JADX INFO: renamed from: g */
    private View f40357g;

    /* JADX INFO: renamed from: k */
    private String f40358k;

    /* JADX INFO: renamed from: n */
    private ni7 f40359n;

    /* JADX INFO: renamed from: q */
    private fu4 f40360q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private String f87756toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private C7148k f87757zy;

    public void f7l8(String action) {
        this.f40358k = action;
    }

    /* JADX INFO: renamed from: g */
    public View m25919g() {
        return this.f40357g;
    }

    /* JADX INFO: renamed from: k */
    public String m25920k() {
        return this.f40358k;
    }

    public void ld6(String rawParams) {
        this.f87756toq = rawParams;
    }

    /* JADX INFO: renamed from: n */
    public String m25921n() {
        return this.f87756toq;
    }

    /* JADX INFO: renamed from: p */
    public void m25922p(fu4 pageContext) {
        this.f40360q = pageContext;
    }

    /* JADX INFO: renamed from: q */
    public fu4 m25923q() {
        return this.f40360q;
    }

    /* JADX INFO: renamed from: s */
    public void m25924s(ni7 nativeInterface) {
        this.f40359n = nativeInterface;
    }

    public C7148k toq() {
        return this.f87757zy;
    }

    public void x2(View view) {
        this.f40357g = view;
    }

    /* JADX INFO: renamed from: y */
    public void m25925y(C7148k callback) {
        this.f87757zy = callback;
    }

    public ni7 zy() {
        return this.f40359n;
    }
}
