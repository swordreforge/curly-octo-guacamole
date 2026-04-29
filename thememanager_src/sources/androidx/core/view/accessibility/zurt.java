package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: AccessibilityWindowInfoCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class zurt {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f50749f7l8 = 5;

    /* JADX INFO: renamed from: g */
    public static final int f3968g = 4;

    /* JADX INFO: renamed from: n */
    public static final int f3969n = 3;

    /* JADX INFO: renamed from: q */
    public static final int f3970q = 2;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f50750toq = -1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f50751zy = 1;

    /* JADX INFO: renamed from: k */
    private final Object f3971k;

    /* JADX INFO: renamed from: androidx.core.view.accessibility.zurt$k */
    /* JADX INFO: compiled from: AccessibilityWindowInfoCompat.java */
    @hyr(21)
    private static class C0666k {
        private C0666k() {
        }

        @InterfaceC7830i
        static AccessibilityNodeInfo f7l8(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getRoot();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: g */
        static AccessibilityWindowInfo m3110g(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getParent();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m3111k(AccessibilityWindowInfo accessibilityWindowInfo, Rect rect) {
            accessibilityWindowInfo.getBoundsInScreen(rect);
        }

        @InterfaceC7830i
        static boolean ld6(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isFocused();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: n */
        static int m3112n(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLayer();
        }

        @InterfaceC7830i
        static void n7h(AccessibilityWindowInfo accessibilityWindowInfo) {
            accessibilityWindowInfo.recycle();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: p */
        static boolean m3113p(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isActive();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static int m3114q(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getId();
        }

        @InterfaceC7830i
        static AccessibilityWindowInfo qrj(AccessibilityWindowInfo accessibilityWindowInfo) {
            return AccessibilityWindowInfo.obtain(accessibilityWindowInfo);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: s */
        static boolean m3115s(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isAccessibilityFocused();
        }

        @InterfaceC7830i
        static AccessibilityWindowInfo toq(AccessibilityWindowInfo accessibilityWindowInfo, int i2) {
            return accessibilityWindowInfo.getChild(i2);
        }

        @InterfaceC7830i
        static AccessibilityWindowInfo x2() {
            return AccessibilityWindowInfo.obtain();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: y */
        static int m3116y(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getType();
        }

        @InterfaceC7830i
        static int zy(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getChildCount();
        }
    }

    /* JADX INFO: compiled from: AccessibilityWindowInfoCompat.java */
    @hyr(24)
    private static class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static AccessibilityNodeInfo m3117k(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getAnchor();
        }

        @InterfaceC7830i
        static CharSequence toq(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTitle();
        }
    }

    private zurt(Object obj) {
        this.f3971k = obj;
    }

    private static String cdj(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "<UNKNOWN>" : "TYPE_ACCESSIBILITY_OVERLAY" : "TYPE_SYSTEM" : "TYPE_INPUT_METHOD" : "TYPE_APPLICATION";
    }

    static zurt ki(Object obj) {
        if (obj != null) {
            return new zurt(obj);
        }
        return null;
    }

    @dd
    public static zurt kja0(@dd zurt zurtVar) {
        if (zurtVar == null) {
            return null;
        }
        return ki(C0666k.qrj((AccessibilityWindowInfo) zurtVar.f3971k));
    }

    @dd
    public static zurt n7h() {
        return ki(C0666k.x2());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zurt)) {
            return false;
        }
        zurt zurtVar = (zurt) obj;
        Object obj2 = this.f3971k;
        return obj2 == null ? zurtVar.f3971k == null : obj2.equals(zurtVar.f3971k);
    }

    @dd
    public zurt f7l8() {
        return ki(C0666k.m3110g((AccessibilityWindowInfo) this.f3971k));
    }

    /* JADX INFO: renamed from: g */
    public int m3102g() {
        return C0666k.m3112n((AccessibilityWindowInfo) this.f3971k);
    }

    /* JADX INFO: renamed from: h */
    public void m3103h() {
        C0666k.n7h((AccessibilityWindowInfo) this.f3971k);
    }

    public int hashCode() {
        Object obj = this.f3971k;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @dd
    /* JADX INFO: renamed from: k */
    public ki m3104k() {
        return ki.ew(toq.m3117k((AccessibilityWindowInfo) this.f3971k));
    }

    public boolean ld6() {
        return C0666k.m3115s((AccessibilityWindowInfo) this.f3971k);
    }

    /* JADX INFO: renamed from: n */
    public int m3105n() {
        return C0666k.m3114q((AccessibilityWindowInfo) this.f3971k);
    }

    /* JADX INFO: renamed from: p */
    public int m3106p() {
        return C0666k.m3116y((AccessibilityWindowInfo) this.f3971k);
    }

    /* JADX INFO: renamed from: q */
    public int m3107q() {
        return C0666k.zy((AccessibilityWindowInfo) this.f3971k);
    }

    public boolean qrj() {
        return C0666k.ld6((AccessibilityWindowInfo) this.f3971k);
    }

    @dd
    /* JADX INFO: renamed from: s */
    public CharSequence m3108s() {
        return toq.toq((AccessibilityWindowInfo) this.f3971k);
    }

    @lvui
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Rect rect = new Rect();
        toq(rect);
        sb.append("AccessibilityWindowInfo[");
        sb.append("id=");
        sb.append(m3105n());
        sb.append(", type=");
        sb.append(cdj(m3106p()));
        sb.append(", layer=");
        sb.append(m3102g());
        sb.append(", bounds=");
        sb.append(rect);
        sb.append(", focused=");
        sb.append(qrj());
        sb.append(", active=");
        sb.append(x2());
        sb.append(", hasParent=");
        sb.append(f7l8() != null);
        sb.append(", hasChildren=");
        sb.append(m3107q() > 0);
        sb.append(']');
        return sb.toString();
    }

    public void toq(@lvui Rect rect) {
        C0666k.m3111k((AccessibilityWindowInfo) this.f3971k, rect);
    }

    public boolean x2() {
        return C0666k.m3113p((AccessibilityWindowInfo) this.f3971k);
    }

    @dd
    /* JADX INFO: renamed from: y */
    public ki m3109y() {
        return ki.ew(C0666k.f7l8((AccessibilityWindowInfo) this.f3971k));
    }

    @dd
    public zurt zy(int i2) {
        return ki(C0666k.toq((AccessibilityWindowInfo) this.f3971k, i2));
    }
}
