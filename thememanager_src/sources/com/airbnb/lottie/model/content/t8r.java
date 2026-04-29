package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C1504r;
import com.airbnb.lottie.animation.content.zurt;

/* JADX INFO: compiled from: ShapeTrimPath.java */
/* JADX INFO: loaded from: classes.dex */
public class t8r implements zy {

    /* JADX INFO: renamed from: g */
    private final boolean f8036g;

    /* JADX INFO: renamed from: k */
    private final String f8037k;

    /* JADX INFO: renamed from: n */
    private final com.airbnb.lottie.model.animatable.toq f8038n;

    /* JADX INFO: renamed from: q */
    private final com.airbnb.lottie.model.animatable.toq f8039q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final EnumC1458k f56018toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final com.airbnb.lottie.model.animatable.toq f56019zy;

    /* JADX INFO: renamed from: com.airbnb.lottie.model.content.t8r$k */
    /* JADX INFO: compiled from: ShapeTrimPath.java */
    public enum EnumC1458k {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static EnumC1458k forId(int i2) {
            if (i2 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i2 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i2);
        }
    }

    public t8r(String str, EnumC1458k enumC1458k, com.airbnb.lottie.model.animatable.toq toqVar, com.airbnb.lottie.model.animatable.toq toqVar2, com.airbnb.lottie.model.animatable.toq toqVar3, boolean z2) {
        this.f8037k = str;
        this.f56018toq = enumC1458k;
        this.f56019zy = toqVar;
        this.f8039q = toqVar2;
        this.f8038n = toqVar3;
        this.f8036g = z2;
    }

    public boolean f7l8() {
        return this.f8036g;
    }

    /* JADX INFO: renamed from: g */
    public EnumC1458k m6046g() {
        return this.f56018toq;
    }

    @Override // com.airbnb.lottie.model.content.zy
    /* JADX INFO: renamed from: k */
    public com.airbnb.lottie.animation.content.zy mo6000k(C1504r c1504r, com.airbnb.lottie.model.layer.toq toqVar) {
        return new zurt(toqVar, this);
    }

    /* JADX INFO: renamed from: n */
    public com.airbnb.lottie.model.animatable.toq m6047n() {
        return this.f56019zy;
    }

    /* JADX INFO: renamed from: q */
    public com.airbnb.lottie.model.animatable.toq m6048q() {
        return this.f8038n;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f56019zy + ", end: " + this.f8039q + ", offset: " + this.f8038n + "}";
    }

    public com.airbnb.lottie.model.animatable.toq toq() {
        return this.f8039q;
    }

    public String zy() {
        return this.f8037k;
    }
}
