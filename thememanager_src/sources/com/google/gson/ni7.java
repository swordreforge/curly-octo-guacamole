package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: LongSerializationPolicy.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ni7 {
    public static final ni7 DEFAULT;
    public static final ni7 STRING;

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ ni7[] f27822k;

    /* JADX INFO: renamed from: com.google.gson.ni7$k */
    /* JADX INFO: compiled from: LongSerializationPolicy.java */
    enum C4919k extends ni7 {
        C4919k(String str, int i2) {
            super(str, i2, null);
        }

        @Override // com.google.gson.ni7
        public x2 serialize(Long l2) {
            return new ki(l2);
        }
    }

    static {
        C4919k c4919k = new C4919k("DEFAULT", 0);
        DEFAULT = c4919k;
        ni7 ni7Var = new ni7("STRING", 1) { // from class: com.google.gson.ni7.toq
            {
                C4919k c4919k2 = null;
            }

            @Override // com.google.gson.ni7
            public x2 serialize(Long l2) {
                return new ki(String.valueOf(l2));
            }
        };
        STRING = ni7Var;
        f27822k = new ni7[]{c4919k, ni7Var};
    }

    private ni7(String str, int i2) {
    }

    public static ni7 valueOf(String str) {
        return (ni7) Enum.valueOf(ni7.class, str);
    }

    public static ni7[] values() {
        return (ni7[]) f27822k.clone();
    }

    public abstract x2 serialize(Long l2);

    /* synthetic */ ni7(String str, int i2, C4919k c4919k) {
        this(str, i2);
    }
}
