package com.google.android.material.resources;

import android.graphics.Typeface;
import zy.uv6;

/* JADX INFO: renamed from: com.google.android.material.resources.k */
/* JADX INFO: compiled from: CancelableFontCallback.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public final class C4090k extends AbstractC4089g {

    /* JADX INFO: renamed from: k */
    private final Typeface f24865k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final k f67773toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f67774zy;

    /* JADX INFO: renamed from: com.google.android.material.resources.k$k */
    /* JADX INFO: compiled from: CancelableFontCallback.java */
    public interface k {
        /* JADX INFO: renamed from: k */
        void mo14617k(Typeface typeface);
    }

    public C4090k(k kVar, Typeface typeface) {
        this.f24865k = typeface;
        this.f67773toq = kVar;
    }

    /* JADX INFO: renamed from: q */
    private void m14736q(Typeface typeface) {
        if (this.f67774zy) {
            return;
        }
        this.f67773toq.mo14617k(typeface);
    }

    @Override // com.google.android.material.resources.AbstractC4089g
    /* JADX INFO: renamed from: k */
    public void mo14231k(int i2) {
        m14736q(this.f24865k);
    }

    @Override // com.google.android.material.resources.AbstractC4089g
    public void toq(Typeface typeface, boolean z2) {
        m14736q(typeface);
    }

    public void zy() {
        this.f67774zy = true;
    }
}
