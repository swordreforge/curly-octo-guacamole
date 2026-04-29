package miuix.internal.util;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: renamed from: miuix.internal.util.k */
/* JADX INFO: compiled from: AccessibilityUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7163k {
    /* JADX INFO: renamed from: k */
    public static boolean m25944k(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }
}
