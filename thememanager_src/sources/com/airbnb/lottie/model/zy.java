package com.airbnb.lottie.model;

import android.graphics.Typeface;
import zy.dd;
import zy.uv6;

/* JADX INFO: compiled from: Font.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY})
public class zy {

    /* JADX INFO: renamed from: k */
    private final String f8102k;

    /* JADX INFO: renamed from: n */
    @dd
    private Typeface f8103n;

    /* JADX INFO: renamed from: q */
    private final float f8104q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final String f56114toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final String f56115zy;

    public zy(String str, String str2, String str3, float f2) {
        this.f8102k = str;
        this.f56114toq = str2;
        this.f56115zy = str3;
        this.f8104q = f2;
    }

    /* JADX INFO: renamed from: g */
    public void m6098g(@dd Typeface typeface) {
        this.f8103n = typeface;
    }

    /* JADX INFO: renamed from: k */
    float m6099k() {
        return this.f8104q;
    }

    @dd
    /* JADX INFO: renamed from: n */
    public Typeface m6100n() {
        return this.f8103n;
    }

    /* JADX INFO: renamed from: q */
    public String m6101q() {
        return this.f56115zy;
    }

    public String toq() {
        return this.f8102k;
    }

    public String zy() {
        return this.f56114toq;
    }
}
