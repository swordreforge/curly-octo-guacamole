package com.android.thememanager.module.detail.view;

import android.util.Log;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.base.C1723y;
import com.android.thememanager.module.detail.presenter.C2225g;
import com.android.thememanager.module.detail.util.InterfaceC2245k;
import com.android.thememanager.router.app.entity.ThemeStatus;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: ApplyLargeIconController.java */
/* JADX INFO: loaded from: classes2.dex */
public class zurt {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f60579f7l8 = 30;

    /* JADX INFO: renamed from: k */
    private androidx.lifecycle.fti<ThemeStatus> f13414k;

    /* JADX INFO: renamed from: q */
    private WeakReference<C2225g> f13416q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private WeakReference<AbstractActivityC1717k> f60580toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private androidx.lifecycle.fti<C1723y<Integer>> f60581zy;

    /* JADX INFO: renamed from: n */
    private int f13415n = 0;

    /* JADX INFO: renamed from: g */
    private androidx.lifecycle.jp0y<ThemeStatus> f13413g = new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.module.detail.view.fn3e
        @Override // androidx.lifecycle.jp0y
        public final void toq(Object obj) {
            this.f13247k.m8407q((ThemeStatus) obj);
        }
    };

    public zurt(AbstractActivityC1717k activity, androidx.lifecycle.fti<ThemeStatus> status, C2225g mVm, boolean needDownload) {
        this.f13414k = status;
        this.f60580toq = new WeakReference<>(activity);
        this.f13414k.m4391p(activity, this.f13413g);
        this.f13416q = new WeakReference<>(mVm);
        this.f60581zy = ((InterfaceC2245k) this.f60580toq.get()).mo6346h();
        if (this.f60580toq.get() instanceof InterfaceC2245k) {
            this.f60581zy = ((InterfaceC2245k) this.f60580toq.get()).mo6346h();
            ((InterfaceC2245k) this.f60580toq.get()).ki(bf2.toq.toq().getResources().getString(needDownload ? R.string.common_downloading : R.string.theme_changing_dialog_title));
            m8404g(0, false);
        }
    }

    /* JADX INFO: renamed from: g */
    private void m8404g(int increment, boolean isFailed) {
        int i2 = this.f13415n + increment;
        if (!isFailed && i2 >= 30) {
            i2 = 30;
        }
        androidx.lifecycle.fti<C1723y<Integer>> ftiVar = this.f60581zy;
        if (ftiVar != null) {
            ftiVar.cdj(new C1723y<>(Integer.valueOf(i2)));
        }
    }

    /* JADX INFO: renamed from: n */
    private void m8406n(int status) {
        m8404g(100, true);
        androidx.lifecycle.fti<ThemeStatus> ftiVar = this.f13414k;
        if (ftiVar != null) {
            ftiVar.kja0(this.f13413g);
        }
        Log.i("ApplyLargeIconController", "onTaskFinish: " + status);
        this.f13414k = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void m8407q(com.android.thememanager.router.app.entity.ThemeStatus r5) {
        /*
            r4 = this;
            int r0 = r5.status
            r1 = 96
            r2 = 0
            if (r0 == r1) goto L86
            r1 = 2
            switch(r0) {
                case 32: goto L60;
                case 33: goto L50;
                case 34: goto L2d;
                case 35: goto L50;
                case 36: goto L60;
                default: goto Lb;
            }
        Lb:
            switch(r0) {
                case 48: goto L29;
                case 49: goto L50;
                case 50: goto L13;
                default: goto Le;
            }
        Le:
            switch(r0) {
                case 80: goto L29;
                case 81: goto L50;
                case 82: goto L29;
                default: goto L11;
            }
        L11:
            goto L8b
        L13:
            java.lang.ref.WeakReference<com.android.thememanager.module.detail.presenter.g> r5 = r4.f13416q
            if (r5 == 0) goto L8b
            java.lang.Object r5 = r5.get()
            if (r5 == 0) goto L8b
            java.lang.ref.WeakReference<com.android.thememanager.module.detail.presenter.g> r5 = r4.f13416q
            java.lang.Object r5 = r5.get()
            com.android.thememanager.module.detail.presenter.g r5 = (com.android.thememanager.module.detail.presenter.C2225g) r5
            r5.apply()
            goto L8b
        L29:
            r4.m8404g(r1, r2)
            goto L8b
        L2d:
            java.lang.ref.WeakReference<com.android.thememanager.basemodule.base.k> r5 = r4.f60580toq
            java.lang.Object r5 = r5.get()
            if (r5 == 0) goto L8b
            java.lang.ref.WeakReference<com.android.thememanager.basemodule.base.k> r5 = r4.f60580toq
            java.lang.Object r5 = r5.get()
            com.android.thememanager.module.detail.util.k r5 = (com.android.thememanager.module.detail.util.InterfaceC2245k) r5
            android.content.Context r0 = bf2.toq.toq()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131887751(0x7f120687, float:1.9410118E38)
            java.lang.String r0 = r0.getString(r1)
            r5.ki(r0)
            goto L8b
        L50:
            r1 = 81
            if (r1 == r0) goto L5a
            r0 = 2131886197(0x7f120075, float:1.9406966E38)
            com.android.thememanager.basemodule.utils.nn86.m7150k(r0, r2)
        L5a:
            int r5 = r5.status
            r4.m8406n(r5)
            goto L8b
        L60:
            java.lang.ref.WeakReference<com.android.thememanager.basemodule.base.k> r5 = r4.f60580toq
            java.lang.Object r5 = r5.get()
            if (r5 == 0) goto L82
            java.lang.ref.WeakReference<com.android.thememanager.basemodule.base.k> r5 = r4.f60580toq
            java.lang.Object r5 = r5.get()
            com.android.thememanager.module.detail.util.k r5 = (com.android.thememanager.module.detail.util.InterfaceC2245k) r5
            android.content.Context r0 = bf2.toq.toq()
            android.content.res.Resources r0 = r0.getResources()
            r3 = 2131886341(0x7f120105, float:1.9407258E38)
            java.lang.String r0 = r0.getString(r3)
            r5.ki(r0)
        L82:
            r4.m8404g(r1, r2)
            goto L8b
        L86:
            r5 = 10
            r4.m8404g(r5, r2)
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.module.detail.view.zurt.m8407q(com.android.thememanager.router.app.entity.ThemeStatus):void");
    }

    public void f7l8(String id, int status) {
        androidx.lifecycle.fti<ThemeStatus> ftiVar = this.f13414k;
        if (ftiVar != null) {
            ftiVar.m4388g().status = status;
            ftiVar.cdj(ftiVar.m4388g());
        }
    }

    public void toq() {
        Log.i("ApplyLargeIconController", "cancel");
        WeakReference<AbstractActivityC1717k> weakReference = this.f60580toq;
        if (weakReference != null && weakReference.get() != null && (this.f60580toq.get() instanceof InterfaceC2245k)) {
            ((InterfaceC2245k) this.f60580toq.get()).mo6348y();
        }
        androidx.lifecycle.fti<ThemeStatus> ftiVar = this.f13414k;
        if (ftiVar != null) {
            ftiVar.kja0(this.f13413g);
        }
        this.f13414k = null;
        WeakReference<AbstractActivityC1717k> weakReference2 = this.f60580toq;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
    }

    public boolean zy() {
        androidx.lifecycle.fti<C1723y<Integer>> ftiVar;
        androidx.lifecycle.fti<ThemeStatus> ftiVar2 = this.f13414k;
        return ftiVar2 != null && ftiVar2.m4392s() && (ftiVar = this.f60581zy) != null && ftiVar.m4388g() != null && this.f60581zy.m4388g().zy().intValue() > 0 && this.f60581zy.m4388g().zy().intValue() < 100;
    }
}
