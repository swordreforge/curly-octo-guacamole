package com.android.thememanager;

import a98o.C0004k;
import android.content.res.Resources;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.util.gbni;
import com.android.thememanager.util.r8s8;
import com.android.thememanager.util.y9n;
import java.util.List;

/* JADX INFO: renamed from: com.android.thememanager.k */
/* JADX INFO: compiled from: AppInnerContext.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class C2082k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private volatile y9n f60330f7l8;

    /* JADX INFO: renamed from: g */
    private volatile r8s8 f12303g;

    /* JADX INFO: renamed from: k */
    private ThemeApplication f12304k;

    /* JADX INFO: renamed from: n */
    private volatile gbni f12305n;

    /* JADX INFO: renamed from: q */
    private volatile C2322r f12306q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private List<C0004k<Resource>> f60331toq;

    /* JADX INFO: renamed from: y */
    private volatile C2965z f12307y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private volatile o1t f60332zy;

    /* JADX INFO: renamed from: s */
    private static C2082k f12302s = new C2082k();

    /* JADX INFO: renamed from: p */
    private static final Object f12301p = new Object();

    private C2082k() {
    }

    /* JADX INFO: renamed from: k */
    public static ThemeApplication m7998k() {
        return f12302s.toq();
    }

    /* JADX INFO: renamed from: p */
    public static Resources m7999p() {
        return m7998k().getResources();
    }

    public static C2082k zy() {
        return f12302s;
    }

    public gbni f7l8() {
        if (this.f12305n == null) {
            synchronized (f12301p) {
                if (this.f12305n == null) {
                    this.f12305n = this.f12304k.cdj();
                }
            }
        }
        return this.f12305n;
    }

    /* JADX INFO: renamed from: g */
    public o1t m8000g() {
        if (this.f60332zy == null) {
            synchronized (f12301p) {
                if (this.f60332zy == null) {
                    this.f60332zy = this.f12304k.m6312h();
                }
            }
        }
        return this.f60332zy;
    }

    public List<C0004k<Resource>> ld6() {
        return this.f60331toq;
    }

    /* JADX INFO: renamed from: n */
    public C2965z m8001n() {
        if (this.f12307y == null) {
            synchronized (f12301p) {
                if (this.f12307y == null) {
                    this.f12307y = this.f12304k.kja0();
                }
            }
        }
        return this.f12307y;
    }

    /* JADX INFO: renamed from: q */
    public y9n m8002q() {
        if (this.f60330f7l8 == null) {
            synchronized (f12301p) {
                if (this.f60330f7l8 == null) {
                    this.f60330f7l8 = this.f12304k.n7h();
                }
            }
        }
        return this.f60330f7l8;
    }

    public void qrj(List<C0004k<Resource>> workingDataSet) {
        this.f60331toq = workingDataSet;
    }

    /* JADX INFO: renamed from: s */
    public r8s8 m8003s() {
        if (this.f12303g == null) {
            synchronized (f12301p) {
                if (this.f12303g == null) {
                    this.f12303g = this.f12304k.t8r();
                }
            }
        }
        return this.f12303g;
    }

    @Deprecated
    public ThemeApplication toq() {
        return this.f12304k;
    }

    public void x2(ThemeApplication applicationContext) {
        this.f12304k = applicationContext;
    }

    /* JADX INFO: renamed from: y */
    public C2322r m8004y() {
        if (this.f12306q == null) {
            synchronized (f12301p) {
                if (this.f12306q == null) {
                    this.f12306q = this.f12304k.ki();
                }
            }
        }
        return this.f12306q;
    }
}
