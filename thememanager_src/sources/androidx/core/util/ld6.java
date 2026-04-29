package androidx.core.util;

import android.util.Pair;
import kotlin.C6227f;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Pair.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a4\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00018\u00008\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\n¢\u0006\u0004\b\u0004\u0010\u0005\u001a4\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\n¢\u0006\u0004\b\u0006\u0010\u0005\u001aA\u0010\b\u001a\u001e\u0012\f\u0012\n \u0003*\u0004\u0018\u00018\u00008\u0000\u0012\f\u0012\n \u0003*\u0004\u0018\u00018\u00018\u00010\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\b\u001a1\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007H\u0086\b¨\u0006\n"}, d2 = {com.market.sdk.reflect.toq.f28136y, "S", "Landroid/util/Pair;", "kotlin.jvm.PlatformType", "k", "(Landroid/util/Pair;)Ljava/lang/Object;", "toq", "Lkotlin/f;", "q", "zy", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class ld6 {
    /* JADX INFO: renamed from: k */
    public static final <F, S> F m2969k(@InterfaceC7396q Pair<F, S> component1) {
        d2ok.cdj(component1, "$this$component1");
        return (F) component1.first;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public static final <F, S> C6227f<F, S> m2970q(@InterfaceC7396q Pair<F, S> toKotlinPair) {
        d2ok.cdj(toKotlinPair, "$this$toKotlinPair");
        return new C6227f<>(toKotlinPair.first, toKotlinPair.second);
    }

    public static final <F, S> S toq(@InterfaceC7396q Pair<F, S> component2) {
        d2ok.cdj(component2, "$this$component2");
        return (S) component2.second;
    }

    @InterfaceC7396q
    public static final <F, S> Pair<F, S> zy(@InterfaceC7396q C6227f<? extends F, ? extends S> toAndroidPair) {
        d2ok.cdj(toAndroidPair, "$this$toAndroidPair");
        return new Pair<>(toAndroidPair.getFirst(), toAndroidPair.getSecond());
    }
}
