package kotlin.enums;

import cyoe.InterfaceC5981k;
import kotlin.jvm.internal.d2ok;
import kotlin.nn86;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: EnumEntries.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class toq {
    @nn86
    @InterfaceC7396q
    @yz(version = "1.8")
    /* JADX INFO: renamed from: k */
    public static final <E extends Enum<E>> InterfaceC6225k<E> m22812k(@InterfaceC7396q InterfaceC5981k<E[]> entriesProvider) {
        d2ok.m23075h(entriesProvider, "entriesProvider");
        return new zy(entriesProvider.invoke());
    }

    @nn86
    @InterfaceC7396q
    @yz(version = "1.8")
    public static final <E extends Enum<E>> InterfaceC6225k<E> toq(@InterfaceC7396q E[] entries) {
        d2ok.m23075h(entries, "entries");
        return new zy(entries);
    }
}
