package androidx.core.view.accessibility;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.view.accessibility.AccessibilityManager;
import java.util.List;
import zy.InterfaceC7830i;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: AccessibilityManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class zy {

    /* JADX INFO: renamed from: androidx.core.view.accessibility.zy$g */
    /* JADX INFO: compiled from: AccessibilityManagerCompat.java */
    @hyr(19)
    private static final class AccessibilityManagerTouchExplorationStateChangeListenerC0667g implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: k */
        final InterfaceC0669n f3972k;

        AccessibilityManagerTouchExplorationStateChangeListenerC0667g(@lvui InterfaceC0669n interfaceC0669n) {
            this.f3972k = interfaceC0669n;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC0667g) {
                return this.f3972k.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC0667g) obj).f3972k);
            }
            return false;
        }

        public int hashCode() {
            return this.f3972k.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z2) {
            this.f3972k.onTouchExplorationStateChanged(z2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.accessibility.zy$k */
    /* JADX INFO: compiled from: AccessibilityManagerCompat.java */
    @Deprecated
    public interface InterfaceC0668k {
        @Deprecated
        void onAccessibilityStateChanged(boolean z2);
    }

    /* JADX INFO: renamed from: androidx.core.view.accessibility.zy$n */
    /* JADX INFO: compiled from: AccessibilityManagerCompat.java */
    public interface InterfaceC0669n {
        void onTouchExplorationStateChanged(boolean z2);
    }

    /* JADX INFO: renamed from: androidx.core.view.accessibility.zy$q */
    /* JADX INFO: compiled from: AccessibilityManagerCompat.java */
    @hyr(19)
    static class C0670q {
        private C0670q() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static boolean m3122k(AccessibilityManager accessibilityManager, InterfaceC0669n interfaceC0669n) {
            return accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0667g(interfaceC0669n));
        }

        @InterfaceC7830i
        static boolean toq(AccessibilityManager accessibilityManager, InterfaceC0669n interfaceC0669n) {
            return accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0667g(interfaceC0669n));
        }
    }

    /* JADX INFO: compiled from: AccessibilityManagerCompat.java */
    @Deprecated
    public static abstract class toq implements InterfaceC0668k {
    }

    /* JADX INFO: renamed from: androidx.core.view.accessibility.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AccessibilityManagerCompat.java */
    private static class AccessibilityManagerAccessibilityStateChangeListenerC7872zy implements AccessibilityManager.AccessibilityStateChangeListener {

        /* JADX INFO: renamed from: k */
        InterfaceC0668k f3973k;

        AccessibilityManagerAccessibilityStateChangeListenerC7872zy(@lvui InterfaceC0668k interfaceC0668k) {
            this.f3973k = interfaceC0668k;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AccessibilityManagerAccessibilityStateChangeListenerC7872zy) {
                return this.f3973k.equals(((AccessibilityManagerAccessibilityStateChangeListenerC7872zy) obj).f3973k);
            }
            return false;
        }

        public int hashCode() {
            return this.f3973k.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z2) {
            this.f3973k.onAccessibilityStateChanged(z2);
        }
    }

    private zy() {
    }

    public static boolean f7l8(@lvui AccessibilityManager accessibilityManager, @lvui InterfaceC0669n interfaceC0669n) {
        return C0670q.toq(accessibilityManager, interfaceC0669n);
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public static boolean m3118g(AccessibilityManager accessibilityManager, InterfaceC0668k interfaceC0668k) {
        if (interfaceC0668k == null) {
            return false;
        }
        return accessibilityManager.removeAccessibilityStateChangeListener(new AccessibilityManagerAccessibilityStateChangeListenerC7872zy(interfaceC0668k));
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    public static boolean m3119k(AccessibilityManager accessibilityManager, InterfaceC0668k interfaceC0668k) {
        if (interfaceC0668k == null) {
            return false;
        }
        return accessibilityManager.addAccessibilityStateChangeListener(new AccessibilityManagerAccessibilityStateChangeListenerC7872zy(interfaceC0668k));
    }

    @Deprecated
    /* JADX INFO: renamed from: n */
    public static boolean m3120n(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isTouchExplorationEnabled();
    }

    @Deprecated
    /* JADX INFO: renamed from: q */
    public static List<AccessibilityServiceInfo> m3121q(AccessibilityManager accessibilityManager) {
        return accessibilityManager.getInstalledAccessibilityServiceList();
    }

    public static boolean toq(@lvui AccessibilityManager accessibilityManager, @lvui InterfaceC0669n interfaceC0669n) {
        return C0670q.m3122k(accessibilityManager, interfaceC0669n);
    }

    @Deprecated
    public static List<AccessibilityServiceInfo> zy(AccessibilityManager accessibilityManager, int i2) {
        return accessibilityManager.getEnabledAccessibilityServiceList(i2);
    }
}
