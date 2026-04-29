package kotlin.enums;

import java.io.Serializable;
import java.lang.Enum;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.enums.q */
/* JADX INFO: compiled from: EnumEntriesSerializationProxy.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C6226q<E extends Enum<E>> implements Serializable {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private static final k f36271k = new k(null);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c */
    @InterfaceC7396q
    private final Class<E> f36272c;

    /* JADX INFO: renamed from: kotlin.enums.q$k */
    /* JADX INFO: compiled from: EnumEntriesSerializationProxy.kt */
    private static final class k {
        private k() {
        }

        public /* synthetic */ k(ni7 ni7Var) {
            this();
        }
    }

    public C6226q(@InterfaceC7396q E[] entries) {
        d2ok.m23075h(entries, "entries");
        Class<E> cls = (Class<E>) entries.getClass().getComponentType();
        d2ok.qrj(cls);
        this.f36272c = cls;
    }

    private final Object readResolve() {
        E[] enumConstants = this.f36272c.getEnumConstants();
        d2ok.kja0(enumConstants, "c.enumConstants");
        return toq.toq(enumConstants);
    }
}
