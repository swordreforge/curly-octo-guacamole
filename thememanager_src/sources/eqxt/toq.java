package eqxt;

import androidx.exifinterface.media.C0846k;
import androidx.lifecycle.C0924e;
import androidx.lifecycle.lrht;
import com.android.thememanager.settingssearch.C2690k;
import com.market.sdk.reflect.C4991s;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: InitializerViewModelFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u001a\u0010\u000e\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\n\"\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR \u0010\u000e\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Leqxt/toq;", "Landroidx/lifecycle/e$toq;", "Landroidx/lifecycle/lrht;", C0846k.zaso, "Ljava/lang/Class;", "modelClass", "Leqxt/k;", C2690k.k.f15972p, "zy", "(Ljava/lang/Class;Leqxt/k;)Landroidx/lifecycle/lrht;", "", "Leqxt/y;", "toq", "[Leqxt/y;", "initializers", C4991s.f28129n, "([Leqxt/y;)V", "lifecycle-viewmodel_release"}, m22787k = 1, mv = {1, 6, 0})
public final class toq implements C0924e.toq {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final C6011y<?>[] f73819toq;

    public toq(@InterfaceC7396q C6011y<?>... initializers) {
        d2ok.m23075h(initializers, "initializers");
        this.f73819toq = initializers;
    }

    @Override // androidx.lifecycle.C0924e.toq
    @InterfaceC7396q
    public <T extends lrht> T zy(@InterfaceC7396q Class<T> modelClass, @InterfaceC7396q AbstractC6008k extras) {
        d2ok.m23075h(modelClass, "modelClass");
        d2ok.m23075h(extras, "extras");
        T t2 = null;
        for (C6011y<?> c6011y : this.f73819toq) {
            if (d2ok.f7l8(c6011y.m22255k(), modelClass)) {
                T tInvoke = c6011y.toq().invoke(extras);
                t2 = tInvoke instanceof lrht ? tInvoke : null;
            }
        }
        if (t2 != null) {
            return t2;
        }
        throw new IllegalArgumentException("No initializer set for given class " + modelClass.getName());
    }
}
