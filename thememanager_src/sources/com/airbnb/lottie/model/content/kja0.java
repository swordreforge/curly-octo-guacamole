package com.airbnb.lottie.model.content;

import android.graphics.Path;
import com.airbnb.lottie.C1504r;
import com.airbnb.lottie.model.animatable.C1443k;
import com.airbnb.lottie.model.animatable.C1446q;
import zy.dd;

/* JADX INFO: compiled from: ShapeFill.java */
/* JADX INFO: loaded from: classes.dex */
public class kja0 implements zy {

    /* JADX INFO: renamed from: g */
    private final boolean f8009g;

    /* JADX INFO: renamed from: k */
    private final boolean f8010k;

    /* JADX INFO: renamed from: n */
    @dd
    private final C1446q f8011n;

    /* JADX INFO: renamed from: q */
    @dd
    private final C1443k f8012q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Path.FillType f56001toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final String f56002zy;

    public kja0(String str, boolean z2, Path.FillType fillType, @dd C1443k c1443k, @dd C1446q c1446q, boolean z3) {
        this.f56002zy = str;
        this.f8010k = z2;
        this.f56001toq = fillType;
        this.f8012q = c1443k;
        this.f8011n = c1446q;
        this.f8009g = z3;
    }

    /* JADX INFO: renamed from: g */
    public boolean m6022g() {
        return this.f8009g;
    }

    @Override // com.airbnb.lottie.model.content.zy
    /* JADX INFO: renamed from: k */
    public com.airbnb.lottie.animation.content.zy mo6000k(C1504r c1504r, com.airbnb.lottie.model.layer.toq toqVar) {
        return new com.airbnb.lottie.animation.content.f7l8(c1504r, toqVar, this);
    }

    @dd
    /* JADX INFO: renamed from: n */
    public C1446q m6023n() {
        return this.f8011n;
    }

    /* JADX INFO: renamed from: q */
    public String m6024q() {
        return this.f56002zy;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f8010k + '}';
    }

    @dd
    public C1443k toq() {
        return this.f8012q;
    }

    public Path.FillType zy() {
        return this.f56001toq;
    }
}
