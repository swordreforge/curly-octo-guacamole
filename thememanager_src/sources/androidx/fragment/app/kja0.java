package androidx.fragment.app;

import com.google.android.exoplayer2.text.ttml.C3678q;
import kotlin.was;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: FragmentManager.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a3\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a3\u0010\t\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a=\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"Landroidx/fragment/app/FragmentManager;", "", "allowStateLoss", "Lkotlin/Function1;", "Landroidx/fragment/app/o1t;", "Lkotlin/was;", "Lkotlin/fn3e;", C3678q.f22041h, "k", "zy", "now", "n", "fragment-ktx_release"}, m22787k = 2, mv = {1, 4, 1})
public final class kja0 {
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m4301g(FragmentManager transaction, boolean z2, boolean z3, cyoe.x2 body, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        if ((i2 & 2) != 0) {
            z3 = false;
        }
        kotlin.jvm.internal.d2ok.m23075h(transaction, "$this$transaction");
        kotlin.jvm.internal.d2ok.m23075h(body, "body");
        o1t o1tVarKi = transaction.ki();
        kotlin.jvm.internal.d2ok.kja0(o1tVarKi, "beginTransaction()");
        body.invoke(o1tVarKi);
        if (z2) {
            if (z3) {
                o1tVarKi.mo4296h();
                return;
            } else {
                o1tVarKi.kja0();
                return;
            }
        }
        if (z3) {
            o1tVarKi.n7h();
        } else {
            o1tVarKi.qrj();
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m4302k(@InterfaceC7396q FragmentManager commit, boolean z2, @InterfaceC7396q cyoe.x2<? super o1t, was> body) {
        kotlin.jvm.internal.d2ok.m23075h(commit, "$this$commit");
        kotlin.jvm.internal.d2ok.m23075h(body, "body");
        o1t o1tVarKi = commit.ki();
        kotlin.jvm.internal.d2ok.kja0(o1tVarKi, "beginTransaction()");
        body.invoke(o1tVarKi);
        if (z2) {
            o1tVarKi.n7h();
        } else {
            o1tVarKi.qrj();
        }
    }

    @kotlin.ld6(message = "Use commit { .. } or commitNow { .. } extensions")
    /* JADX INFO: renamed from: n */
    public static final void m4303n(@InterfaceC7396q FragmentManager transaction, boolean z2, boolean z3, @InterfaceC7396q cyoe.x2<? super o1t, was> body) {
        kotlin.jvm.internal.d2ok.m23075h(transaction, "$this$transaction");
        kotlin.jvm.internal.d2ok.m23075h(body, "body");
        o1t o1tVarKi = transaction.ki();
        kotlin.jvm.internal.d2ok.kja0(o1tVarKi, "beginTransaction()");
        body.invoke(o1tVarKi);
        if (z2) {
            if (z3) {
                o1tVarKi.mo4296h();
                return;
            } else {
                o1tVarKi.kja0();
                return;
            }
        }
        if (z3) {
            o1tVarKi.n7h();
        } else {
            o1tVarKi.qrj();
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m4304q(FragmentManager commitNow, boolean z2, cyoe.x2 body, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        kotlin.jvm.internal.d2ok.m23075h(commitNow, "$this$commitNow");
        kotlin.jvm.internal.d2ok.m23075h(body, "body");
        o1t o1tVarKi = commitNow.ki();
        kotlin.jvm.internal.d2ok.kja0(o1tVarKi, "beginTransaction()");
        body.invoke(o1tVarKi);
        if (z2) {
            o1tVarKi.mo4296h();
        } else {
            o1tVarKi.kja0();
        }
    }

    public static /* synthetic */ void toq(FragmentManager commit, boolean z2, cyoe.x2 body, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        kotlin.jvm.internal.d2ok.m23075h(commit, "$this$commit");
        kotlin.jvm.internal.d2ok.m23075h(body, "body");
        o1t o1tVarKi = commit.ki();
        kotlin.jvm.internal.d2ok.kja0(o1tVarKi, "beginTransaction()");
        body.invoke(o1tVarKi);
        if (z2) {
            o1tVarKi.n7h();
        } else {
            o1tVarKi.qrj();
        }
    }

    public static final void zy(@InterfaceC7396q FragmentManager commitNow, boolean z2, @InterfaceC7396q cyoe.x2<? super o1t, was> body) {
        kotlin.jvm.internal.d2ok.m23075h(commitNow, "$this$commitNow");
        kotlin.jvm.internal.d2ok.m23075h(body, "body");
        o1t o1tVarKi = commitNow.ki();
        kotlin.jvm.internal.d2ok.kja0(o1tVarKi, "beginTransaction()");
        body.invoke(o1tVarKi);
        if (z2) {
            o1tVarKi.mo4296h();
        } else {
            o1tVarKi.kja0();
        }
    }
}
