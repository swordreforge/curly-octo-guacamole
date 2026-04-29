package com.miui.systemAdSolution.landingPage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import java.util.List;
import m2t.C6794k;

/* JADX INFO: renamed from: com.miui.systemAdSolution.landingPage.p */
/* JADX INFO: compiled from: LandingPageManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5331p {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f72481toq = "LandingPageManager";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static volatile C5331p f72482zy;

    /* JADX INFO: renamed from: k */
    private Context f29787k;

    private C5331p(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f29787k = applicationContext;
        if (applicationContext == null) {
            this.f29787k = context;
        }
    }

    /* JADX INFO: renamed from: k */
    private Intent m18149k() {
        Intent intent = new Intent("miui.intent.action.ad.LANDING_PAGE_SERVICE");
        intent.setPackage(C6794k.f38036k);
        return intent;
    }

    /* JADX INFO: renamed from: n */
    public static C5331p m18150n(Context context) {
        if (f72482zy == null) {
            synchronized (C5331p.class) {
                if (f72482zy == null) {
                    f72482zy = new C5331p(context);
                }
            }
        }
        return f72482zy;
    }

    /* JADX INFO: renamed from: y */
    private boolean m18151y() {
        List<ResolveInfo> listQueryIntentServices = this.f29787k.getPackageManager().queryIntentServices(m18149k(), 0);
        return (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) ? false : true;
    }

    public int f7l8() {
        Integer numLd6;
        if (m18151y() && (numLd6 = new f7l8(this, this.f29787k, ILandingPageService.class).ld6(m18149k())) != null) {
            return numLd6.intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public int m18152g(String str) {
        Integer numLd6;
        if (m18151y() && (numLd6 = new toq(this, this.f29787k, ILandingPageService.class, str).ld6(m18149k())) != null) {
            return numLd6.intValue();
        }
        return -1;
    }

    public void ld6(String str, Bundle bundle) {
        if (m18151y()) {
            new C5332q(this, this.f29787k, ILandingPageService.class, str, bundle).x2(m18149k());
        }
    }

    /* JADX INFO: renamed from: p */
    public void m18153p(String str, Bundle bundle) {
        if (m18151y()) {
            new zy(this, this.f29787k, ILandingPageService.class, str, bundle).x2(m18149k());
        }
    }

    /* JADX INFO: renamed from: q */
    public long m18154q(String str) {
        if (!m18151y()) {
            return -1L;
        }
        long jLongValue = new C5334y(this, this.f29787k, ILandingPageService.class, str).ld6(m18149k()).longValue();
        if (jLongValue != -1) {
            return jLongValue;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: s */
    public void m18155s(String str, ILandingPageListener iLandingPageListener) {
        if (m18151y()) {
            new C5328g(this, this.f29787k, ILandingPageService.class, str, iLandingPageListener).x2(m18149k());
        }
    }

    public boolean toq(String str) {
        Boolean boolLd6;
        if (m18151y() && (boolLd6 = new C5330n(this, this.f29787k, ILandingPageService.class, str).ld6(m18149k())) != null) {
            return boolLd6.booleanValue();
        }
        return false;
    }

    public void x2(String str, ILandingPageListener iLandingPageListener) {
        if (m18151y()) {
            new C5333s(this, this.f29787k, ILandingPageService.class, str, iLandingPageListener).x2(m18149k());
        }
    }

    public void zy(String str, Bundle bundle) {
        if (m18151y()) {
            new C5329k(this, this.f29787k, ILandingPageService.class, str, bundle).x2(m18149k());
        }
    }
}
