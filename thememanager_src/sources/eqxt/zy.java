package eqxt;

import androidx.exifinterface.media.C0846k;
import androidx.lifecycle.C0924e;
import androidx.lifecycle.lrht;
import com.market.sdk.reflect.C4991s;
import cyoe.x2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.reflect.InterfaceC6374q;
import l05.C6764k;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: InitializerViewModelFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@f7l8
@d3(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\bJ\u0006\u0010\r\u001a\u00020\fR\u001e\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0014"}, d2 = {"Leqxt/zy;", "", "Landroidx/lifecycle/lrht;", C0846k.zaso, "Lkotlin/reflect/q;", "clazz", "Lkotlin/Function1;", "Leqxt/k;", "Lkotlin/fn3e;", "initializer", "Lkotlin/was;", "k", "Landroidx/lifecycle/e$toq;", "toq", "", "Leqxt/y;", "Ljava/util/List;", "initializers", C4991s.f28129n, "()V", "lifecycle-viewmodel_release"}, m22787k = 1, mv = {1, 6, 0})
public final class zy {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final List<C6011y<?>> f34402k = new ArrayList();

    /* JADX INFO: renamed from: k */
    public final <T extends lrht> void m22256k(@InterfaceC7396q InterfaceC6374q<T> clazz, @InterfaceC7396q x2<? super AbstractC6008k, ? extends T> initializer) {
        d2ok.m23075h(clazz, "clazz");
        d2ok.m23075h(initializer, "initializer");
        this.f34402k.add(new C6011y<>(C6764k.m24702n(clazz), initializer));
    }

    @InterfaceC7396q
    public final C0924e.toq toq() {
        Object[] array = this.f34402k.toArray(new C6011y[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        C6011y[] c6011yArr = (C6011y[]) array;
        return new toq((C6011y[]) Arrays.copyOf(c6011yArr, c6011yArr.length));
    }
}
