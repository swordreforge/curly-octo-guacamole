package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C1504r;
import com.airbnb.lottie.utils.C1510q;
import zy.dd;

/* JADX INFO: renamed from: com.airbnb.lottie.model.content.s */
/* JADX INFO: compiled from: MergePaths.java */
/* JADX INFO: loaded from: classes.dex */
public class C1457s implements zy {

    /* JADX INFO: renamed from: k */
    private final String f8034k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final k f56016toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final boolean f56017zy;

    /* JADX INFO: renamed from: com.airbnb.lottie.model.content.s$k */
    /* JADX INFO: compiled from: MergePaths.java */
    public enum k {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static k forId(int i2) {
            return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public C1457s(String str, k kVar, boolean z2) {
        this.f8034k = str;
        this.f56016toq = kVar;
        this.f56017zy = z2;
    }

    @Override // com.airbnb.lottie.model.content.zy
    @dd
    /* JADX INFO: renamed from: k */
    public com.airbnb.lottie.animation.content.zy mo6000k(C1504r c1504r, com.airbnb.lottie.model.layer.toq toqVar) {
        if (c1504r.oc()) {
            return new com.airbnb.lottie.animation.content.x2(this);
        }
        C1510q.m6255n("Animation contains merge paths but they are disabled.");
        return null;
    }

    /* JADX INFO: renamed from: q */
    public boolean m6045q() {
        return this.f56017zy;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f56016toq + '}';
    }

    public k toq() {
        return this.f56016toq;
    }

    public String zy() {
        return this.f8034k;
    }
}
