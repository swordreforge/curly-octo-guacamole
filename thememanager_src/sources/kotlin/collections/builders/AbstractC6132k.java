package kotlin.collections.builders;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.collections.AbstractC6172y;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.collections.builders.k */
/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6132k<E extends Map.Entry<? extends K, ? extends V>, K, V> extends AbstractC6172y<E> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return m22440k((Map.Entry) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m22440k(@InterfaceC7396q E element) {
        d2ok.m23075h(element, "element");
        return toq(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return zy((Map.Entry) obj);
        }
        return false;
    }

    public abstract boolean toq(@InterfaceC7396q Map.Entry<? extends K, ? extends V> entry);

    public /* bridge */ boolean zy(Map.Entry<?, ?> entry) {
        return super.remove(entry);
    }
}
