package com.android.thememanager.lockscreen.lock.color.picker;

import kotlin.enums.InterfaceC6225k;
import mub.InterfaceC7396q;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: AutoColorPicker.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class x2 {

    /* JADX INFO: renamed from: k */
    private static final /* synthetic */ x2[] f12366k;

    /* JADX INFO: renamed from: q */
    private static final /* synthetic */ InterfaceC6225k f12367q;
    public static final x2 DEFAULT = new x2("DEFAULT", 0);
    public static final x2 CLOCK = new x2("CLOCK", 1);
    public static final x2 STATUS_BAR = new x2("STATUS_BAR", 2);
    public static final x2 MAGAZINE = new x2("MAGAZINE", 3);

    static {
        x2[] qVar = toq();
        f12366k = qVar;
        f12367q = kotlin.enums.toq.toq(qVar);
    }

    private x2(String str, int i2) {
    }

    @InterfaceC7396q
    public static InterfaceC6225k<x2> getEntries() {
        return f12367q;
    }

    private static final /* synthetic */ x2[] toq() {
        return new x2[]{DEFAULT, CLOCK, STATUS_BAR, MAGAZINE};
    }

    public static x2 valueOf(String str) {
        return (x2) Enum.valueOf(x2.class, str);
    }

    public static x2[] values() {
        return (x2[]) f12366k.clone();
    }
}
