package androidx.fragment.app;

import android.os.Bundle;
import zy.InterfaceC7843t;

/* JADX INFO: compiled from: FragmentTransaction.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\t\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0086\b\u001a-\u0010\n\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0086\b\u001a;\u0010\u000b\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0086\b¨\u0006\f"}, d2 = {"Landroidx/fragment/app/Fragment;", com.market.sdk.reflect.toq.f28136y, "Landroidx/fragment/app/o1t;", "", "containerViewId", "", "tag", "Landroid/os/Bundle;", "args", "k", "toq", "n", "fragment-ktx_release"}, m22787k = 2, mv = {1, 4, 1})
public final class wvg {
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ o1t m4353g(o1t replace, int i2, String str, Bundle bundle, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        if ((i3 & 4) != 0) {
            bundle = null;
        }
        kotlin.jvm.internal.d2ok.m23075h(replace, "$this$replace");
        kotlin.jvm.internal.d2ok.m23086z(4, com.market.sdk.reflect.toq.f28136y);
        o1t o1tVarM4315t = replace.m4315t(i2, Fragment.class, bundle, str);
        kotlin.jvm.internal.d2ok.kja0(o1tVarM4315t, "replace(containerViewId, F::class.java, args, tag)");
        return o1tVarM4315t;
    }

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ <F extends Fragment> o1t m4354k(o1t add, @InterfaceC7843t int i2, String str, Bundle bundle) {
        kotlin.jvm.internal.d2ok.m23075h(add, "$this$add");
        kotlin.jvm.internal.d2ok.m23086z(4, com.market.sdk.reflect.toq.f28136y);
        o1t o1tVarM4310n = add.m4310n(i2, Fragment.class, bundle, str);
        kotlin.jvm.internal.d2ok.kja0(o1tVarM4310n, "add(containerViewId, F::class.java, args, tag)");
        return o1tVarM4310n;
    }

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ <F extends Fragment> o1t m4355n(o1t replace, @InterfaceC7843t int i2, String str, Bundle bundle) {
        kotlin.jvm.internal.d2ok.m23075h(replace, "$this$replace");
        kotlin.jvm.internal.d2ok.m23086z(4, com.market.sdk.reflect.toq.f28136y);
        o1t o1tVarM4315t = replace.m4315t(i2, Fragment.class, bundle, str);
        kotlin.jvm.internal.d2ok.kja0(o1tVarM4315t, "replace(containerViewId, F::class.java, args, tag)");
        return o1tVarM4315t;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ o1t m4356q(o1t add, String tag, Bundle bundle, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        kotlin.jvm.internal.d2ok.m23075h(add, "$this$add");
        kotlin.jvm.internal.d2ok.m23075h(tag, "tag");
        kotlin.jvm.internal.d2ok.m23086z(4, com.market.sdk.reflect.toq.f28136y);
        o1t o1tVarM4316y = add.m4316y(Fragment.class, bundle, tag);
        kotlin.jvm.internal.d2ok.kja0(o1tVarM4316y, "add(F::class.java, args, tag)");
        return o1tVarM4316y;
    }

    public static final /* synthetic */ <F extends Fragment> o1t toq(o1t add, String tag, Bundle bundle) {
        kotlin.jvm.internal.d2ok.m23075h(add, "$this$add");
        kotlin.jvm.internal.d2ok.m23075h(tag, "tag");
        kotlin.jvm.internal.d2ok.m23086z(4, com.market.sdk.reflect.toq.f28136y);
        o1t o1tVarM4316y = add.m4316y(Fragment.class, bundle, tag);
        kotlin.jvm.internal.d2ok.kja0(o1tVarM4316y, "add(F::class.java, args, tag)");
        return o1tVarM4316y;
    }

    public static /* synthetic */ o1t zy(o1t add, int i2, String str, Bundle bundle, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        if ((i3 & 4) != 0) {
            bundle = null;
        }
        kotlin.jvm.internal.d2ok.m23075h(add, "$this$add");
        kotlin.jvm.internal.d2ok.m23086z(4, com.market.sdk.reflect.toq.f28136y);
        o1t o1tVarM4310n = add.m4310n(i2, Fragment.class, bundle, str);
        kotlin.jvm.internal.d2ok.kja0(o1tVarM4310n, "add(containerViewId, F::class.java, args, tag)");
        return o1tVarM4310n;
    }
}
