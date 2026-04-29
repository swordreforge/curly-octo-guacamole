package com.android.thememanager.util;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.C0103s;
import androidx.fragment.app.ActivityC0891q;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.android.thememanager.basemodule.base.C1723y;
import com.android.thememanager.util.C2821y;
import ek5k.C6002g;
import kotlin.jvm.internal.AbstractC6308r;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: com.android.thememanager.util.y */
/* JADX INFO: compiled from: ApplyThemeDialog.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2821y extends C0103s {

    @InterfaceC7396q
    public static final k bl = new k(null);

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    @InterfaceC7395n
    private miuix.appcompat.app.dd f61439ab;

    @InterfaceC7395n
    private toq an;
    private int bb;
    private int bp;

    @InterfaceC7395n
    private Animator id;

    @InterfaceC7396q
    private String bv = "";

    @InterfaceC7396q
    private final ValueAnimator.AnimatorUpdateListener in = new ValueAnimator.AnimatorUpdateListener() { // from class: com.android.thememanager.util.q
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2821y.ob(this.f16718k, valueAnimator);
        }
    };

    /* JADX INFO: renamed from: com.android.thememanager.util.y$k */
    /* JADX INFO: compiled from: ApplyThemeDialog.kt */
    public static final class k {

        /* JADX INFO: renamed from: com.android.thememanager.util.y$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ApplyThemeDialog.kt */
        static final class C7939k extends AbstractC6308r implements cyoe.x2<C1723y<Integer>, kotlin.was> {
            final /* synthetic */ ActivityC0891q $activity;
            final /* synthetic */ C2821y $af;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7939k(C2821y c2821y, ActivityC0891q activityC0891q) {
                super(1);
                this.$af = c2821y;
                this.$activity = activityC0891q;
            }

            @Override // cyoe.x2
            public /* bridge */ /* synthetic */ kotlin.was invoke(C1723y<Integer> c1723y) {
                invoke2(c1723y);
                return kotlin.was.f36763k;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(C1723y<Integer> c1723y) {
                Integer numM6720k = c1723y.m6720k();
                if (numM6720k == null) {
                    return;
                }
                this.$af.tww7(numM6720k.intValue(), this.$activity);
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.util.y$k$toq */
        /* JADX INFO: compiled from: ApplyThemeDialog.kt */
        static final class toq extends AbstractC6308r implements cyoe.x2<String, kotlin.was> {
            final /* synthetic */ C2821y $af;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            toq(C2821y c2821y) {
                super(1);
                this.$af = c2821y;
            }

            @Override // cyoe.x2
            public /* bridge */ /* synthetic */ kotlin.was invoke(String str) {
                invoke2(str);
                return kotlin.was.f36763k;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
                C2821y c2821y = this.$af;
                kotlin.jvm.internal.d2ok.qrj(str);
                c2821y.bv = str;
                Dialog dialogU38j = this.$af.u38j();
                if (dialogU38j instanceof miuix.appcompat.app.dd) {
                    ((miuix.appcompat.app.dd) dialogU38j).n5r1(str);
                }
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.util.y$k$zy */
        /* JADX INFO: compiled from: ApplyThemeDialog.kt */
        static final class zy extends AbstractC6308r implements cyoe.x2<C1723y<Boolean>, kotlin.was> {
            final /* synthetic */ C2821y $af;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            zy(C2821y c2821y) {
                super(1);
                this.$af = c2821y;
            }

            @Override // cyoe.x2
            public /* bridge */ /* synthetic */ kotlin.was invoke(C1723y<Boolean> c1723y) {
                invoke2(c1723y);
                return kotlin.was.f36763k;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(C1723y<Boolean> c1723y) {
                Boolean boolM6720k = c1723y.m6720k();
                if (boolM6720k != null && boolM6720k.booleanValue()) {
                    try {
                        if (this.$af.u38j() != null) {
                            Dialog dialogU38j = this.$af.u38j();
                            kotlin.jvm.internal.d2ok.qrj(dialogU38j);
                            if (dialogU38j.isShowing()) {
                                this.$af.kx3();
                            }
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }

        private k() {
        }

        public /* synthetic */ k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f7l8(cyoe.x2 tmp0, Object obj) {
            kotlin.jvm.internal.d2ok.m23075h(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public static final void m10085g(cyoe.x2 tmp0, Object obj) {
            kotlin.jvm.internal.d2ok.m23075h(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public static final void m10087n(cyoe.x2 tmp0, Object obj) {
            kotlin.jvm.internal.d2ok.m23075h(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @InterfaceC7396q
        @l05.qrj
        /* JADX INFO: renamed from: q */
        public final C2821y m10088q(@InterfaceC7396q ActivityC0891q activity, @InterfaceC7396q LiveData<C1723y<Integer>> liveData, @InterfaceC7396q LiveData<String> titleData, @InterfaceC7396q LiveData<C1723y<Boolean>> dismissData) {
            kotlin.jvm.internal.d2ok.m23075h(activity, "activity");
            kotlin.jvm.internal.d2ok.m23075h(liveData, "liveData");
            kotlin.jvm.internal.d2ok.m23075h(titleData, "titleData");
            kotlin.jvm.internal.d2ok.m23075h(dismissData, "dismissData");
            Fragment fragmentNmn5 = activity.getSupportFragmentManager().nmn5(com.android.thememanager.basemodule.analysis.toq.hql);
            C2821y c2821y = fragmentNmn5 == null ? new C2821y() : (C2821y) fragmentNmn5;
            final C7939k c7939k = new C7939k(c2821y, activity);
            liveData.m4391p(activity, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.util.n
                @Override // androidx.lifecycle.jp0y
                public final void toq(Object obj) {
                    C2821y.k.m10087n(c7939k, obj);
                }
            });
            final toq toqVar = new toq(c2821y);
            titleData.m4391p(activity, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.util.g
                @Override // androidx.lifecycle.jp0y
                public final void toq(Object obj) {
                    C2821y.k.m10085g(toqVar, obj);
                }
            });
            final zy zyVar = new zy(c2821y);
            dismissData.m4391p(activity, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.util.f7l8
                @Override // androidx.lifecycle.jp0y
                public final void toq(Object obj) {
                    C2821y.k.f7l8(zyVar, obj);
                }
            });
            return c2821y;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.y$toq */
    /* JADX INFO: compiled from: ApplyThemeDialog.kt */
    public interface toq {
        /* JADX INFO: renamed from: k */
        void mo6352k();

        void onDismiss();
    }

    @InterfaceC7396q
    @l05.qrj
    public static final C2821y bqie(@InterfaceC7396q ActivityC0891q activityC0891q, @InterfaceC7396q LiveData<C1723y<Integer>> liveData, @InterfaceC7396q LiveData<String> liveData2, @InterfaceC7396q LiveData<C1723y<Boolean>> liveData3) {
        return bl.m10088q(activityC0891q, liveData, liveData2, liveData3);
    }

    private final void g0ad() {
        C6002g.zurt(new Runnable() { // from class: com.android.thememanager.util.zy
            @Override // java.lang.Runnable
            public final void run() {
                C2821y.imd(this.f16943k);
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void imd(C2821y this$0) {
        kotlin.jvm.internal.d2ok.m23075h(this$0, "this$0");
        try {
            this$0.mo4377w();
        } catch (Exception e2) {
            C2789j.ld6("ApplyFragment.dismiss : " + e2);
        }
    }

    private final void kbj(int i2) {
        this.bp = i2;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.bb, i2);
        valueAnimatorOfInt.addUpdateListener(this.in);
        valueAnimatorOfInt.setDuration(300L);
        Animator animator = this.id;
        if (animator != null) {
            animator.cancel();
        }
        valueAnimatorOfInt.start();
        this.id = valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ob(C2821y this$0, ValueAnimator animation) {
        kotlin.jvm.internal.d2ok.m23075h(this$0, "this$0");
        kotlin.jvm.internal.d2ok.m23075h(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.d2ok.n7h(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        int i2 = this$0.bb;
        if (i2 == iIntValue || iIntValue <= i2) {
            return;
        }
        this$0.bb = iIntValue;
        miuix.appcompat.app.dd ddVar = this$0.f61439ab;
        if (ddVar != null) {
            ddVar.lv5(iIntValue);
        }
        if (iIntValue >= 100) {
            this$0.g0ad();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tww7(int i2, ActivityC0891q activityC0891q) {
        if (i2 > 100) {
            if (this.bb < 100) {
                kbj(100);
            }
        } else {
            if (i2 > 0) {
                kbj(i2);
                return;
            }
            this.bb = 0;
            try {
                FragmentManager supportFragmentManager = activityC0891q.getSupportFragmentManager();
                kotlin.jvm.internal.d2ok.kja0(supportFragmentManager, "getSupportFragmentManager(...)");
                r6ty(supportFragmentManager, com.android.thememanager.basemodule.analysis.toq.hql);
            } catch (Exception e2) {
                C2789j.ld6("ApplyFragment.showNow fail. " + e2);
            }
        }
    }

    @Override // androidx.fragment.app.zy
    public void cyoe(@InterfaceC7396q FragmentManager manager, @InterfaceC7395n String str) {
        kotlin.jvm.internal.d2ok.m23075h(manager, "manager");
        super.cyoe(manager, str);
        toq toqVar = this.an;
        if (toqVar != null) {
            toqVar.mo6352k();
        }
    }

    public final void f1bi(@InterfaceC7396q toq l2) {
        kotlin.jvm.internal.d2ok.m23075h(l2, "l");
        this.an = l2;
    }

    @Override // androidx.appcompat.app.C0103s, androidx.fragment.app.zy
    @InterfaceC7396q
    public Dialog nnh(@InterfaceC7395n Bundle bundle) {
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.d2ok.kja0(contextRequireContext, "requireContext(...)");
        miuix.appcompat.app.dd ddVar = new miuix.appcompat.app.dd(contextRequireContext);
        ddVar.y2(1);
        ddVar.n5r1(this.bv);
        ddVar.setCancelable(false);
        ddVar.setCanceledOnTouchOutside(false);
        ddVar.nmn5(100);
        ddVar.m24876u("");
        ddVar.lv5(this.bb);
        this.f61439ab = ddVar;
        int i2 = this.bb;
        if (i2 >= 100) {
            g0ad();
        } else {
            int i3 = this.bp;
            if (i3 > i2) {
                kbj(i3);
            }
        }
        return ddVar;
    }

    @Override // androidx.fragment.app.zy, androidx.fragment.app.Fragment
    public void onCreate(@InterfaceC7395n Bundle bundle) {
        super.onCreate(bundle);
        ec(false);
        if (bundle != null) {
            this.bb = bundle.getInt("themeProgress");
            this.bp = bundle.getInt("endProgress");
        }
    }

    @Override // androidx.fragment.app.zy, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@InterfaceC7396q DialogInterface dialog) {
        kotlin.jvm.internal.d2ok.m23075h(dialog, "dialog");
        super.onDismiss(dialog);
        toq toqVar = this.an;
        if (toqVar != null) {
            toqVar.onDismiss();
        }
    }

    @Override // androidx.fragment.app.zy, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@InterfaceC7396q Bundle outState) {
        kotlin.jvm.internal.d2ok.m23075h(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putInt("themeProgress", this.bb);
        outState.putInt("endProgress", this.bp);
    }

    @Override // androidx.fragment.app.zy
    public void r6ty(@InterfaceC7396q FragmentManager manager, @InterfaceC7395n String str) {
        kotlin.jvm.internal.d2ok.m23075h(manager, "manager");
        super.r6ty(manager, str);
        toq toqVar = this.an;
        if (toqVar != null) {
            toqVar.mo6352k();
        }
    }
}
