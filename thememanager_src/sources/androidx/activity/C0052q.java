package androidx.activity;

import androidx.lifecycle.InterfaceC0954z;
import cyoe.x2;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: androidx.activity.q */
/* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\n\u001a\u00020\u0006*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¨\u0006\u000b"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "Landroidx/lifecycle/z;", "owner", "", "enabled", "Lkotlin/Function1;", "Landroidx/activity/zy;", "Lkotlin/was;", "Lkotlin/fn3e;", "onBackPressed", "k", "activity-ktx_release"}, m22787k = 2, mv = {1, 4, 1})
public final class C0052q {

    /* JADX INFO: renamed from: androidx.activity.q$k */
    /* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
    @d3(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"androidx/activity/q$k", "Landroidx/activity/zy;", "Lkotlin/was;", "n", "activity-ktx_release"}, m22787k = 1, mv = {1, 4, 1})
    public static final class k extends zy {

        /* JADX INFO: renamed from: q */
        final /* synthetic */ boolean f104q;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ x2 f46451zy;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(x2 x2Var, boolean z2, boolean z3) {
            super(z3);
            this.f46451zy = x2Var;
            this.f104q = z2;
        }

        @Override // androidx.activity.zy
        /* JADX INFO: renamed from: n */
        public void mo21n() {
            this.f46451zy.invoke(this);
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final zy m20k(@InterfaceC7396q OnBackPressedDispatcher addCallback, @InterfaceC7395n InterfaceC0954z interfaceC0954z, boolean z2, @InterfaceC7396q x2<? super zy, was> onBackPressed) {
        d2ok.m23075h(addCallback, "$this$addCallback");
        d2ok.m23075h(onBackPressed, "onBackPressed");
        k kVar = new k(onBackPressed, z2, z2);
        if (interfaceC0954z != null) {
            addCallback.toq(interfaceC0954z, kVar);
        } else {
            addCallback.m12k(kVar);
        }
        return kVar;
    }

    public static /* synthetic */ zy toq(OnBackPressedDispatcher onBackPressedDispatcher, InterfaceC0954z interfaceC0954z, boolean z2, x2 x2Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            interfaceC0954z = null;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        return m20k(onBackPressedDispatcher, interfaceC0954z, z2, x2Var);
    }
}
