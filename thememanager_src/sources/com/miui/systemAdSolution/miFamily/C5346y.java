package com.miui.systemAdSolution.miFamily;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import java.util.List;
import m2t.C6794k;

/* JADX INFO: renamed from: com.miui.systemAdSolution.miFamily.y */
/* JADX INFO: compiled from: MiFamilyManager.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5346y {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f72504toq = "MiFamilyManager";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static volatile C5346y f72505zy;

    /* JADX INFO: renamed from: k */
    private Context f29852k;

    /* JADX INFO: renamed from: com.miui.systemAdSolution.miFamily.y$k */
    /* JADX INFO: compiled from: MiFamilyManager.java */
    public static class k {

        /* JADX INFO: renamed from: k */
        public String f29853k;

        /* JADX INFO: renamed from: q */
        public String f29854q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public String f72506toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public String f72507zy;
    }

    private C5346y(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f29852k = applicationContext;
        if (applicationContext == null) {
            this.f29852k = context;
        }
    }

    private String f7l8() {
        if (m18189s()) {
            return new C5345q(this, this.f29852k, IMiFamilyService.class).ld6(m18186k());
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    private String m18185g() {
        if (m18189s()) {
            return new zy(this, this.f29852k, IMiFamilyService.class).ld6(m18186k());
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    private Intent m18186k() {
        Intent intent = new Intent("miui.intent.action.ad.MI_FAMILY_HELPER");
        intent.setPackage(C6794k.f38036k);
        return intent;
    }

    /* JADX INFO: renamed from: p */
    private boolean m18187p() {
        Boolean boolLd6;
        if (m18189s() && (boolLd6 = new C5343k(this, this.f29852k, IMiFamilyService.class).ld6(m18186k())) != null) {
            return boolLd6.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    private String m18188q() {
        if (m18189s()) {
            return new C5344n(this, this.f29852k, IMiFamilyService.class).ld6(m18186k());
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    private boolean m18189s() {
        List<ResolveInfo> listQueryIntentServices = this.f29852k.getPackageManager().queryIntentServices(m18186k(), 0);
        return (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) ? false : true;
    }

    private boolean toq(k kVar) {
        return (kVar == null || TextUtils.isEmpty(kVar.f29853k) || TextUtils.isEmpty(kVar.f29854q) || TextUtils.isEmpty(kVar.f72506toq) || TextUtils.isEmpty(kVar.f72507zy)) ? false : true;
    }

    /* JADX INFO: renamed from: y */
    private String m18190y(String str) {
        if (m18189s()) {
            return new toq(this, this.f29852k, IMiFamilyService.class, str).ld6(m18186k());
        }
        return null;
    }

    public static C5346y zy(Context context) {
        if (f72505zy == null) {
            synchronized (C5346y.class) {
                if (f72505zy == null) {
                    f72505zy = new C5346y(context);
                }
            }
        }
        return f72505zy;
    }

    public void ld6(String str) {
        if (m18189s()) {
            new f7l8(this, this.f29852k, IMiFamilyService.class, str).x2(m18186k());
        }
    }

    /* JADX INFO: renamed from: n */
    public k m18191n(String str) {
        if (!m18187p()) {
            return null;
        }
        k kVar = new k();
        kVar.f29853k = m18190y(str);
        kVar.f29854q = f7l8();
        kVar.f72506toq = m18185g();
        kVar.f72507zy = m18188q();
        if (toq(kVar)) {
            return kVar;
        }
        return null;
    }

    public void x2(String str) {
        if (m18189s()) {
            new C5342g(this, this.f29852k, IMiFamilyService.class, str).x2(m18186k());
        }
    }
}
