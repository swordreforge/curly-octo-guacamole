package kotlin.enums;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.collections.C6144h;
import kotlin.jvm.internal.d2ok;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: EnumEntries.kt */
/* JADX INFO: loaded from: classes3.dex */
@yz(version = "1.8")
final class zy<T extends Enum<T>> extends kotlin.collections.zy<T> implements InterfaceC6225k<T>, Serializable {

    @InterfaceC7396q
    private final T[] entries;

    public zy(@InterfaceC7396q T[] entries) {
        d2ok.m23075h(entries, "entries");
        this.entries = entries;
    }

    private final Object writeReplace() {
        return new C6226q(this.entries);
    }

    @Override // kotlin.collections.AbstractC6147k, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return contains((Enum) obj);
        }
        return false;
    }

    @Override // kotlin.collections.zy, kotlin.collections.AbstractC6147k
    public int getSize() {
        return this.entries.length;
    }

    @Override // kotlin.collections.zy, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return indexOf((Enum) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.zy, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return lastIndexOf((Enum) obj);
        }
        return -1;
    }

    public boolean contains(@InterfaceC7396q T element) {
        d2ok.m23075h(element, "element");
        return ((Enum) C6144h.b0(this.entries, element.ordinal())) == element;
    }

    @Override // kotlin.collections.zy, java.util.List
    @InterfaceC7396q
    public T get(int i2) {
        kotlin.collections.zy.Companion.toq(i2, this.entries.length);
        return this.entries[i2];
    }

    public int indexOf(@InterfaceC7396q T element) {
        d2ok.m23075h(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) C6144h.b0(this.entries, iOrdinal)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    public int lastIndexOf(@InterfaceC7396q T element) {
        d2ok.m23075h(element, "element");
        return indexOf((Object) element);
    }
}
