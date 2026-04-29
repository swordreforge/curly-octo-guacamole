package com.airbnb.lottie.model;

import com.airbnb.lottie.model.content.C1450h;
import java.util.List;
import zy.uv6;

/* JADX INFO: renamed from: com.airbnb.lottie.model.q */
/* JADX INFO: compiled from: FontCharacter.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY})
public class C1472q {

    /* JADX INFO: renamed from: g */
    private final String f8087g;

    /* JADX INFO: renamed from: k */
    private final List<C1450h> f8088k;

    /* JADX INFO: renamed from: n */
    private final String f8089n;

    /* JADX INFO: renamed from: q */
    private final double f8090q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final char f56105toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final double f56106zy;

    public C1472q(List<C1450h> list, char c2, double d2, double d4, String str, String str2) {
        this.f8088k = list;
        this.f56105toq = c2;
        this.f56106zy = d2;
        this.f8090q = d4;
        this.f8089n = str;
        this.f8087g = str2;
    }

    public static int zy(char c2, String str, String str2) {
        return ((((0 + c2) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public int hashCode() {
        return zy(this.f56105toq, this.f8087g, this.f8089n);
    }

    /* JADX INFO: renamed from: k */
    public List<C1450h> m6093k() {
        return this.f8088k;
    }

    public double toq() {
        return this.f8090q;
    }
}
