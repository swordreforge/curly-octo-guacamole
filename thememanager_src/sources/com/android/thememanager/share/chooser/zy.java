package com.android.thememanager.share.chooser;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ActivityC0891q;
import com.android.thememanager.R;
import com.android.thememanager.share.C2702g;
import com.android.thememanager.share.C2705n;
import com.android.thememanager.share.C2706p;
import com.android.thememanager.share.InterfaceC2707q;
import com.android.thememanager.share.delegate.AbstractC2694g;
import com.android.thememanager.share.delegate.cdj;
import com.android.thememanager.share.ld6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: ShareChooserManager.java */
/* JADX INFO: loaded from: classes2.dex */
class zy {

    /* JADX INFO: renamed from: k */
    private static final Integer[] f16003k = {Integer.valueOf(C2706p.f61104d3), Integer.valueOf(C2706p.f61112jp0y), Integer.valueOf(C2706p.f61110gvn7)};

    /* JADX INFO: renamed from: com.android.thememanager.share.chooser.zy$k */
    /* JADX INFO: compiled from: ShareChooserManager.java */
    class ViewOnClickListenerC2693k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ AbstractC2694g f16004k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ WeakReference f16005n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Intent f16006q;

        /* JADX INFO: renamed from: com.android.thememanager.share.chooser.zy$k$k */
        /* JADX INFO: compiled from: ShareChooserManager.java */
        class k implements InterfaceC2707q {
            k() {
            }

            @Override // com.android.thememanager.share.InterfaceC2707q
            /* JADX INFO: renamed from: k */
            public void mo9416k() {
                zy.zy(ViewOnClickListenerC2693k.this.f16005n);
            }
        }

        ViewOnClickListenerC2693k(final AbstractC2694g val$shareDelegate, final Intent val$shareIntent, final WeakReference val$activityRef) {
            this.f16004k = val$shareDelegate;
            this.f16006q = val$shareIntent;
            this.f16005n = val$activityRef;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f16004k.mo9431p(this.f16006q, new k());
        }
    }

    zy() {
    }

    /* JADX INFO: renamed from: k */
    private static boolean m9413k(final Activity activity, ArrayList<C2692q> shareInfos, final Intent shareIntent, final AbstractC2694g shareDelegate) {
        if (!shareDelegate.mo9434y(shareIntent)) {
            return false;
        }
        shareInfos.add(new C2692q(shareIntent, shareDelegate, new ViewOnClickListenerC2693k(shareDelegate, shareIntent, new WeakReference(activity))));
        return true;
    }

    /* JADX INFO: renamed from: n */
    static void m9414n(ActivityC0891q activity, Intent shareIntent, Bundle shareConfig) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        ArrayList<C2692q> arrayListM9415q = m9415q(activity, shareIntent, shareConfig);
        if (arrayListM9415q.isEmpty()) {
            ld6.fti(activity, shareIntent);
            toq(activity, false);
            return;
        }
        C2691k c2691kCn02 = C2691k.cn02();
        c2691kCn02.pnt2(shareConfig.getString(C2705n.f61100x2, activity.getResources().getString(R.string.miuishare_title_share)));
        c2691kCn02.xblq(arrayListM9415q);
        c2691kCn02.hyow(shareConfig.getString(C2702g.f61079mcp));
        c2691kCn02.qh4d(shareConfig.getString(C2702g.f61075jp0y));
        c2691kCn02.cyoe(activity.getSupportFragmentManager(), "share_chooser");
    }

    /* JADX INFO: renamed from: q */
    static ArrayList<C2692q> m9415q(Activity activity, Intent shareIntent, Bundle shareConfig) {
        ArrayList<C2692q> arrayList = new ArrayList<>();
        List<Integer> integerArrayList = shareConfig.getIntegerArrayList(C2705n.f61096ld6);
        shareConfig.getBoolean(C2705n.f61098qrj, true);
        if (integerArrayList == null) {
            integerArrayList = Arrays.asList(f16003k);
        }
        for (Integer num : integerArrayList) {
            AbstractC2694g abstractC2694gLd6 = cdj.ld6(num.intValue(), shareConfig);
            if (abstractC2694gLd6 != null) {
                abstractC2694gLd6.m9433s(activity);
                m9413k(activity, arrayList, cdj.ni7(num.intValue(), shareIntent), abstractC2694gLd6);
            }
        }
        if (!arrayList.isEmpty()) {
            AbstractC2694g abstractC2694gLd62 = cdj.ld6(0, shareConfig);
            abstractC2694gLd62.m9433s(activity);
            m9413k(activity, arrayList, shareIntent, abstractC2694gLd62);
        }
        return arrayList;
    }

    static void toq(Activity activity, boolean noAnimation) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        activity.finish();
        if (noAnimation) {
            activity.overridePendingTransition(android.R.anim.fade_in, R.anim.push_down_out);
        }
    }

    static void zy(WeakReference<Activity> activityRef) {
        if (activityRef == null || activityRef.get() == null) {
            return;
        }
        toq(activityRef.get(), true);
    }
}
