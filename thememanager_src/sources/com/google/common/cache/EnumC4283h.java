package com.google.common.cache;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.google.common.cache.h */
/* JADX INFO: compiled from: RemovalCause.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public abstract class EnumC4283h {
    public static final EnumC4283h COLLECTED;
    public static final EnumC4283h EXPIRED;
    public static final EnumC4283h EXPLICIT;
    public static final EnumC4283h REPLACED;
    public static final EnumC4283h SIZE;

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ EnumC4283h[] f25771k;

    /* JADX INFO: renamed from: com.google.common.cache.h$k */
    /* JADX INFO: compiled from: RemovalCause.java */
    enum k extends EnumC4283h {
        k(String str, int i2) {
            super(str, i2, null);
        }

        @Override // com.google.common.cache.EnumC4283h
        boolean wasEvicted() {
            return false;
        }
    }

    static {
        k kVar = new k("EXPLICIT", 0);
        EXPLICIT = kVar;
        EnumC4283h enumC4283h = new EnumC4283h("REPLACED", 1) { // from class: com.google.common.cache.h.toq
            {
                k kVar2 = null;
            }

            @Override // com.google.common.cache.EnumC4283h
            boolean wasEvicted() {
                return false;
            }
        };
        REPLACED = enumC4283h;
        EnumC4283h enumC4283h2 = new EnumC4283h("COLLECTED", 2) { // from class: com.google.common.cache.h.zy
            {
                k kVar2 = null;
            }

            @Override // com.google.common.cache.EnumC4283h
            boolean wasEvicted() {
                return true;
            }
        };
        COLLECTED = enumC4283h2;
        EnumC4283h enumC4283h3 = new EnumC4283h("EXPIRED", 3) { // from class: com.google.common.cache.h.q
            {
                k kVar2 = null;
            }

            @Override // com.google.common.cache.EnumC4283h
            boolean wasEvicted() {
                return true;
            }
        };
        EXPIRED = enumC4283h3;
        EnumC4283h enumC4283h4 = new EnumC4283h("SIZE", 4) { // from class: com.google.common.cache.h.n
            {
                k kVar2 = null;
            }

            @Override // com.google.common.cache.EnumC4283h
            boolean wasEvicted() {
                return true;
            }
        };
        SIZE = enumC4283h4;
        f25771k = new EnumC4283h[]{kVar, enumC4283h, enumC4283h2, enumC4283h3, enumC4283h4};
    }

    private EnumC4283h(String str, int i2) {
    }

    public static EnumC4283h valueOf(String str) {
        return (EnumC4283h) Enum.valueOf(EnumC4283h.class, str);
    }

    public static EnumC4283h[] values() {
        return (EnumC4283h[]) f25771k.clone();
    }

    abstract boolean wasEvicted();

    /* synthetic */ EnumC4283h(String str, int i2, k kVar) {
        this(str, i2);
    }
}
