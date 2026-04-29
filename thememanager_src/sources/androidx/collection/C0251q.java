package androidx.collection;

import androidx.exifinterface.media.C0846k;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: androidx.collection.q */
/* JADX INFO: compiled from: ArraySet.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u0086\b\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\"\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {C0846k.zaso, "Landroidx/collection/zy;", "k", "", "values", "toq", "([Ljava/lang/Object;)Landroidx/collection/zy;", "collection-ktx"}, m22787k = 2, mv = {1, 4, 0})
public final class C0251q {
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final <T> zy<T> m869k() {
        return new zy<>();
    }

    @InterfaceC7396q
    public static final <T> zy<T> toq(@InterfaceC7396q T... values) {
        d2ok.cdj(values, "values");
        zy<T> zyVar = new zy<>(values.length);
        for (T t2 : values) {
            zyVar.add(t2);
        }
        return zyVar;
    }
}
