package com.android.thememanager.lockscreen.lock.color.picker;

import kotlin.enums.InterfaceC6225k;
import mub.InterfaceC7396q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: AutoColorPicker.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class n7h {

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ n7h[] f12363k;

    /* JADX INFO: renamed from: q */
    private static final /* synthetic */ InterfaceC6225k f12364q;
    public static final n7h PHONE = new n7h("PHONE", 0);
    public static final n7h PORT = new n7h("PORT", 1);
    public static final n7h LAND = new n7h("LAND", 2);
    public static final n7h SMALL = new n7h("SMALL", 3);

    static {
        n7h[] qVar = toq();
        f12363k = qVar;
        f12364q = kotlin.enums.toq.toq(qVar);
    }

    private n7h(String str, int i2) {
    }

    @InterfaceC7396q
    public static InterfaceC6225k<n7h> getEntries() {
        return f12364q;
    }

    private static final /* synthetic */ n7h[] toq() {
        return new n7h[]{PHONE, PORT, LAND, SMALL};
    }

    public static n7h valueOf(String str) {
        return (n7h) Enum.valueOf(n7h.class, str);
    }

    public static n7h[] values() {
        return (n7h[]) f12363k.clone();
    }
}
