package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.View$OnUnhandledKeyEventListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.C0701k;
import androidx.core.view.accessibility.ki;
import androidx.core.view.tfm;
import androidx.core.view.vq;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import n7h.C7400k;
import zy.InterfaceC7830i;
import zy.InterfaceC7833l;
import zy.InterfaceC7843t;
import zy.uv6;

/* JADX INFO: renamed from: androidx.core.view.f */
/* JADX INFO: compiled from: ViewCompat.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class C0683f {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final int f50770a9 = 8;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f50771cdj = 2;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private static boolean f50772d2ok = false;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private static Field f50773d3 = null;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private static boolean f50774dd = false;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private static Field f50775eqxt = null;

    /* JADX INFO: renamed from: f */
    private static ThreadLocal<Rect> f3999f = null;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f50776f7l8 = 2;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    @Deprecated
    public static final int f50777fn3e = 16;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    public static final int f50778fti = 16;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final int f50779fu4 = 1;

    /* JADX INFO: renamed from: g */
    public static final int f4000g = 1;

    /* JADX INFO: renamed from: h */
    public static final int f4001h = 1;

    /* JADX INFO: renamed from: i */
    @Deprecated
    public static final int f4002i = -16777216;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static final int f50782jk = 4;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    public static final int f50783jp0y = 32;

    /* JADX INFO: renamed from: k */
    private static final String f4003k = "ViewCompat";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final int f50784ki = 3;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f50785kja0 = 0;

    /* JADX INFO: renamed from: l */
    private static Method f4004l = null;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f50786ld6 = 2;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private static Method f50788lvui = null;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final int f50789mcp = 2;

    /* JADX INFO: renamed from: n */
    public static final int f4005n = 0;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    private static Field f50790n5r1 = null;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    @Deprecated
    public static final int f50791n7h = 2;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final int f50793ni7 = 0;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final int f50794o1t = 0;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private static boolean f50795oc = false;

    /* JADX INFO: renamed from: p */
    public static final int f4006p = 1;

    /* JADX INFO: renamed from: q */
    @Deprecated
    public static final int f4007q = 2;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @Deprecated
    public static final int f50796qrj = 1;

    /* JADX INFO: renamed from: r */
    private static Method f4008r = null;

    /* JADX INFO: renamed from: s */
    public static final int f4009s = 0;

    /* JADX INFO: renamed from: t */
    public static final int f4010t = 1;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    @Deprecated
    public static final int f50797t8r = 16777215;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @Deprecated
    public static final int f50798toq = 0;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final int f50800wvg = 1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @Deprecated
    public static final int f50801x2 = 0;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private static WeakHashMap<View, String> f50802x9kr = null;

    /* JADX INFO: renamed from: y */
    public static final int f4011y = 4;

    /* JADX INFO: renamed from: z */
    public static final int f4012z = 2;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    @Deprecated
    public static final int f50803zurt = 16777216;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @Deprecated
    public static final int f50804zy = 1;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private static final AtomicInteger f50780gvn7 = new AtomicInteger(1);

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private static WeakHashMap<View, gyi> f50792ncyb = null;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    private static boolean f50781hyr = false;

    /* JADX INFO: renamed from: c */
    private static final int[] f3998c = {C7400k.n.f93271toq, C7400k.n.f93281zy, C7400k.n.f93261n7h, C7400k.n.f42568z, C7400k.n.f42564t, C7400k.n.f93259mcp, C7400k.n.f93251jk, C7400k.n.f93233a9, C7400k.n.f93245fti, C7400k.n.f93252jp0y, C7400k.n.f42561q, C7400k.n.f42558n, C7400k.n.f42551g, C7400k.n.f93243f7l8, C7400k.n.f42567y, C7400k.n.f42563s, C7400k.n.f42560p, C7400k.n.f93255ld6, C7400k.n.f93275x2, C7400k.n.f93268qrj, C7400k.n.f93254kja0, C7400k.n.f42552h, C7400k.n.f93236cdj, C7400k.n.f93253ki, C7400k.n.f93270t8r, C7400k.n.f42553i, C7400k.n.f93244fn3e, C7400k.n.f93280zurt, C7400k.n.f93263ni7, C7400k.n.f93246fu4, C7400k.n.f93266o1t, C7400k.n.f93274wvg};

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    private static final lvui f50787lrht = new lvui() { // from class: androidx.core.view.hyr
        @Override // androidx.core.view.lvui
        /* JADX INFO: renamed from: k */
        public final C0711q mo448k(C0711q c0711q) {
            return C0683f.bwp(c0711q);
        }
    };

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    private static final n f50799uv6 = new n();

    /* JADX INFO: renamed from: androidx.core.view.f$cdj */
    /* JADX INFO: compiled from: ViewCompat.java */
    @zy.hyr(28)
    static class cdj {
        private cdj() {
        }

        @InterfaceC7830i
        static void f7l8(View view, boolean z2) {
            view.setAccessibilityHeading(z2);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: g */
        static <T> T m3181g(View view, int i2) {
            return (T) view.requireViewById(i2);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m3182k(@zy.lvui View view, @zy.lvui final o1t o1tVar) {
            int i2 = C7400k.n.f42566x;
            androidx.collection.qrj qrjVar = (androidx.collection.qrj) view.getTag(i2);
            if (qrjVar == null) {
                qrjVar = new androidx.collection.qrj();
                view.setTag(i2, qrjVar);
            }
            Objects.requireNonNull(o1tVar);
            View$OnUnhandledKeyEventListener view$OnUnhandledKeyEventListener = new View$OnUnhandledKeyEventListener() { // from class: androidx.core.view.m
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return o1tVar.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            qrjVar.put(o1tVar, view$OnUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(view$OnUnhandledKeyEventListener);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: n */
        static void m3183n(@zy.lvui View view, @zy.lvui o1t o1tVar) {
            View$OnUnhandledKeyEventListener view$OnUnhandledKeyEventListener;
            androidx.collection.qrj qrjVar = (androidx.collection.qrj) view.getTag(C7400k.n.f42566x);
            if (qrjVar == null || (view$OnUnhandledKeyEventListener = (View$OnUnhandledKeyEventListener) qrjVar.get(o1tVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(view$OnUnhandledKeyEventListener);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static boolean m3184q(View view) {
            return view.isScreenReaderFocusable();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: s */
        static void m3185s(View view, boolean z2) {
            view.setScreenReaderFocusable(z2);
        }

        @InterfaceC7830i
        static CharSequence toq(View view) {
            return view.getAccessibilityPaneTitle();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: y */
        static void m3186y(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        @InterfaceC7830i
        static boolean zy(View view) {
            return view.isAccessibilityHeading();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.f$f7l8 */
    /* JADX INFO: compiled from: ViewCompat.java */
    @zy.hyr(15)
    static class f7l8 {
        private f7l8() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static boolean m3187k(@zy.lvui View view) {
            return view.hasOnClickListeners();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.f$fn3e */
    /* JADX INFO: compiled from: ViewCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface fn3e {
    }

    /* JADX INFO: renamed from: androidx.core.view.f$fu4 */
    /* JADX INFO: compiled from: ViewCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface fu4 {
    }

    /* JADX INFO: renamed from: androidx.core.view.f$g */
    /* JADX INFO: compiled from: ViewCompat.java */
    static abstract class g<T> {

        /* JADX INFO: renamed from: k */
        private final int f4013k;

        /* JADX INFO: renamed from: q */
        private final int f4014q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Class<T> f50805toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int f50806zy;

        g(int i2, Class<T> cls, int i3) {
            this(i2, cls, 0, i3);
        }

        private boolean toq() {
            return true;
        }

        private boolean zy() {
            return Build.VERSION.SDK_INT >= this.f50806zy;
        }

        void f7l8(View view, T t2) {
            if (zy()) {
                mo3190n(view, t2);
            } else if (toq() && mo3192y(m3188g(view), t2)) {
                C0683f.mcp(view);
                view.setTag(this.f4013k, t2);
                C0683f.se(view, this.f4014q);
            }
        }

        /* JADX INFO: renamed from: g */
        T m3188g(View view) {
            if (zy()) {
                return mo3191q(view);
            }
            if (!toq()) {
                return null;
            }
            T t2 = (T) view.getTag(this.f4013k);
            if (this.f50805toq.isInstance(t2)) {
                return t2;
            }
            return null;
        }

        /* JADX INFO: renamed from: k */
        boolean m3189k(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        /* JADX INFO: renamed from: n */
        abstract void mo3190n(View view, T t2);

        /* JADX INFO: renamed from: q */
        abstract T mo3191q(View view);

        /* JADX INFO: renamed from: y */
        boolean mo3192y(T t2, T t3) {
            return !t3.equals(t2);
        }

        g(int i2, Class<T> cls, int i3, int i4) {
            this.f4013k = i2;
            this.f50805toq = cls;
            this.f4014q = i3;
            this.f50806zy = i4;
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.f$h */
    /* JADX INFO: compiled from: ViewCompat.java */
    @zy.hyr(26)
    static class h {
        private h() {
        }

        @InterfaceC7830i
        static boolean f7l8(@zy.lvui View view) {
            return view.isKeyboardNavigationCluster();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: g */
        static boolean m3193g(View view) {
            return view.isImportantForAutofill();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m3194k(@zy.lvui View view, Collection<View> collection, int i2) {
            view.addKeyboardNavigationClusters(collection, i2);
        }

        @InterfaceC7830i
        static void kja0(@zy.lvui View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }

        @InterfaceC7830i
        static void ld6(@zy.lvui View view, boolean z2) {
            view.setFocusedByDefault(z2);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: n */
        static boolean m3195n(@zy.lvui View view) {
            return view.isFocusedByDefault();
        }

        @InterfaceC7830i
        static void n7h(View view, int i2) {
            view.setNextClusterForwardId(i2);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: p */
        static void m3196p(@zy.lvui View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static boolean m3197q(@zy.lvui View view) {
            return view.hasExplicitFocusable();
        }

        @InterfaceC7830i
        static void qrj(@zy.lvui View view, boolean z2) {
            view.setKeyboardNavigationCluster(z2);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: s */
        static boolean m3198s(@zy.lvui View view) {
            return view.restoreDefaultFocus();
        }

        @InterfaceC7830i
        static int toq(View view) {
            return view.getImportantForAutofill();
        }

        @InterfaceC7830i
        static void x2(View view, int i2) {
            view.setImportantForAutofill(i2);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: y */
        static View m3199y(@zy.lvui View view, View view2, int i2) {
            return view.keyboardNavigationClusterSearch(view2, i2);
        }

        @InterfaceC7830i
        static int zy(@zy.lvui View view) {
            return view.getNextClusterForwardId();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.f$i */
    /* JADX INFO: compiled from: ViewCompat.java */
    @zy.hyr(31)
    private static final class i {
        private i() {
        }

        @InterfaceC7830i
        @zy.dd
        /* JADX INFO: renamed from: k */
        public static String[] m3200k(@zy.lvui View view) {
            return view.getReceiveContentMimeTypes();
        }

        @InterfaceC7830i
        @zy.dd
        public static C0711q toq(@zy.lvui View view, @zy.lvui C0711q c0711q) {
            ContentInfo contentInfoX2 = c0711q.x2();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoX2);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoX2 ? c0711q : C0711q.qrj(contentInfoPerformReceiveContent);
        }

        @InterfaceC7830i
        public static void zy(@zy.lvui View view, @zy.dd String[] strArr, @zy.dd d2ok d2okVar) {
            if (d2okVar == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new z(d2okVar));
            }
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.f$k */
    /* JADX INFO: compiled from: ViewCompat.java */
    class k extends g<Boolean> {
        k(int i2, Class cls, int i3) {
            super(i2, cls, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0683f.g
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public boolean mo3192y(Boolean bool, Boolean bool2) {
            return !m3189k(bool, bool2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0683f.g
        @zy.hyr(28)
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo3190n(@zy.lvui View view, Boolean bool) {
            cdj.m3185s(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0683f.g
        @zy.hyr(28)
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public Boolean mo3191q(@zy.lvui View view) {
            return Boolean.valueOf(cdj.m3184q(view));
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.f$ki */
    /* JADX INFO: compiled from: ViewCompat.java */
    @zy.hyr(29)
    private static class ki {
        private ki() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static View.AccessibilityDelegate m3203k(View view) {
            return view.getAccessibilityDelegate();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static void m3204q(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }

        @InterfaceC7830i
        static List<Rect> toq(View view) {
            return view.getSystemGestureExclusionRects();
        }

        @InterfaceC7830i
        static void zy(@zy.lvui View view, @zy.lvui Context context, @zy.lvui int[] iArr, @zy.dd AttributeSet attributeSet, @zy.lvui TypedArray typedArray, int i2, int i3) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.f$kja0 */
    /* JADX INFO: compiled from: ViewCompat.java */
    @zy.hyr(24)
    static class kja0 {
        private kja0() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: g */
        static void m3205g(@zy.lvui View view, @zy.lvui View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m3206k(@zy.lvui View view) {
            view.cancelDragAndDrop();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: n */
        static boolean m3207n(@zy.lvui View view, @zy.dd ClipData clipData, @zy.lvui View.DragShadowBuilder dragShadowBuilder, @zy.dd Object obj, int i2) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i2);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static void m3208q(@zy.lvui View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        @InterfaceC7830i
        static void toq(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        @InterfaceC7830i
        static void zy(View view) {
            view.dispatchStartTemporaryDetach();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.f$ld6 */
    /* JADX INFO: compiled from: ViewCompat.java */
    @zy.hyr(19)
    static class ld6 {
        private ld6() {
        }

        @InterfaceC7830i
        static void f7l8(AccessibilityEvent accessibilityEvent, int i2) {
            accessibilityEvent.setContentChangeTypes(i2);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: g */
        static void m3209g(View view, int i2) {
            view.setAccessibilityLiveRegion(i2);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static int m3210k(View view) {
            return view.getAccessibilityLiveRegion();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: n */
        static void m3211n(ViewParent viewParent, View view, View view2, int i2) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i2);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static boolean m3212q(@zy.lvui View view) {
            return view.isLayoutDirectionResolved();
        }

        @InterfaceC7830i
        static boolean toq(@zy.lvui View view) {
            return view.isAttachedToWindow();
        }

        @InterfaceC7830i
        static boolean zy(@zy.lvui View view) {
            return view.isLaidOut();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.f$mcp */
    /* JADX INFO: compiled from: ViewCompat.java */
    static class mcp {

        /* JADX INFO: renamed from: q */
        private static final ArrayList<WeakReference<View>> f4015q = new ArrayList<>();

        /* JADX INFO: renamed from: k */
        @zy.dd
        private WeakHashMap<View, Boolean> f4016k = null;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private SparseArray<WeakReference<View>> f50807toq = null;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private WeakReference<KeyEvent> f50808zy = null;

        mcp() {
        }

        private void f7l8() {
            WeakHashMap<View, Boolean> weakHashMap = this.f4016k;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f4015q;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f4016k == null) {
                    this.f4016k = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = f4015q;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f4016k.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f4016k.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: k */
        static mcp m3213k(View view) {
            int i2 = C7400k.n.f93279zp;
            mcp mcpVar = (mcp) view.getTag(i2);
            if (mcpVar != null) {
                return mcpVar;
            }
            mcp mcpVar2 = new mcp();
            view.setTag(i2, mcpVar2);
            return mcpVar2;
        }

        /* JADX INFO: renamed from: n */
        private boolean m3214n(@zy.lvui View view, @zy.lvui KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C7400k.n.f42566x);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((o1t) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: q */
        private SparseArray<WeakReference<View>> m3215q() {
            if (this.f50807toq == null) {
                this.f50807toq = new SparseArray<>();
            }
            return this.f50807toq;
        }

        /* JADX INFO: renamed from: s */
        static void m3216s(View view) {
            synchronized (f4015q) {
                int i2 = 0;
                while (true) {
                    ArrayList<WeakReference<View>> arrayList = f4015q;
                    if (i2 >= arrayList.size()) {
                        return;
                    }
                    if (arrayList.get(i2).get() == view) {
                        arrayList.remove(i2);
                        return;
                    }
                    i2++;
                }
            }
        }

        /* JADX INFO: renamed from: y */
        static void m3217y(View view) {
            ArrayList<WeakReference<View>> arrayList = f4015q;
            synchronized (arrayList) {
                Iterator<WeakReference<View>> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next().get() == view) {
                        return;
                    }
                }
                f4015q.add(new WeakReference<>(view));
            }
        }

        @zy.dd
        private View zy(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f4016k;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewZy = zy(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewZy != null) {
                            return viewZy;
                        }
                    }
                }
                if (m3214n(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: g */
        boolean m3218g(KeyEvent keyEvent) {
            int iIndexOfKey;
            WeakReference<KeyEvent> weakReference = this.f50808zy;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f50808zy = new WeakReference<>(keyEvent);
            WeakReference<View> weakReferenceValueAt = null;
            SparseArray<WeakReference<View>> sparseArrayM3215q = m3215q();
            if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArrayM3215q.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReferenceValueAt = sparseArrayM3215q.valueAt(iIndexOfKey);
                sparseArrayM3215q.removeAt(iIndexOfKey);
            }
            if (weakReferenceValueAt == null) {
                weakReferenceValueAt = sparseArrayM3215q.get(keyEvent.getKeyCode());
            }
            if (weakReferenceValueAt == null) {
                return false;
            }
            View view = weakReferenceValueAt.get();
            if (view != null && C0683f.zsr0(view)) {
                m3214n(view, keyEvent);
            }
            return true;
        }

        boolean toq(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                f7l8();
            }
            View viewZy = zy(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewZy != null && !KeyEvent.isModifierKey(keyCode)) {
                    m3215q().put(keyCode, new WeakReference<>(viewZy));
                }
            }
            return viewZy != null;
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.f$n */
    /* JADX INFO: compiled from: ViewCompat.java */
    static class n implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: k */
        private final WeakHashMap<View, Boolean> f4017k = new WeakHashMap<>();

        n() {
        }

        @zy.hyr(19)
        /* JADX INFO: renamed from: n */
        private void m3219n(View view) {
            y.kja0(view.getViewTreeObserver(), this);
        }

        @zy.hyr(19)
        private void toq(View view, boolean z2) {
            boolean z3 = view.isShown() && view.getWindowVisibility() == 0;
            if (z2 != z3) {
                C0683f.se(view, z3 ? 16 : 32);
                this.f4017k.put(view, Boolean.valueOf(z3));
            }
        }

        @zy.hyr(19)
        private void zy(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @zy.hyr(19)
        /* JADX INFO: renamed from: k */
        void m3220k(View view) {
            this.f4017k.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (ld6.toq(view)) {
                zy(view);
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        @zy.hyr(19)
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f4017k.entrySet()) {
                    toq(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        @zy.hyr(19)
        public void onViewAttachedToWindow(View view) {
            zy(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }

        @zy.hyr(19)
        /* JADX INFO: renamed from: q */
        void m3221q(View view) {
            this.f4017k.remove(view);
            view.removeOnAttachStateChangeListener(this);
            m3219n(view);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.f$n7h */
    /* JADX INFO: compiled from: ViewCompat.java */
    @zy.hyr(23)
    private static class n7h {
        private n7h() {
        }

        @zy.dd
        /* JADX INFO: renamed from: k */
        public static tfm m3222k(@zy.lvui View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            tfm tfmVarEqxt = tfm.eqxt(rootWindowInsets);
            tfmVarEqxt.gvn7(tfmVarEqxt);
            tfmVarEqxt.m3472q(view.getRootView());
            return tfmVarEqxt;
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static void m3223q(@zy.lvui View view, int i2, int i3) {
            view.setScrollIndicators(i2, i3);
        }

        @InterfaceC7830i
        static int toq(@zy.lvui View view) {
            return view.getScrollIndicators();
        }

        @InterfaceC7830i
        static void zy(@zy.lvui View view, int i2) {
            view.setScrollIndicators(i2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.f$ni7 */
    /* JADX INFO: compiled from: ViewCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface ni7 {
    }

    /* JADX INFO: renamed from: androidx.core.view.f$o1t */
    /* JADX INFO: compiled from: ViewCompat.java */
    public interface o1t {
        boolean onUnhandledKeyEvent(@zy.lvui View view, @zy.lvui KeyEvent keyEvent);
    }

    /* JADX INFO: renamed from: androidx.core.view.f$p */
    /* JADX INFO: compiled from: ViewCompat.java */
    @zy.hyr(18)
    static class p {
        private p() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static Rect m3224k(@zy.lvui View view) {
            return view.getClipBounds();
        }

        @InterfaceC7830i
        static boolean toq(@zy.lvui View view) {
            return view.isInLayout();
        }

        @InterfaceC7830i
        static void zy(@zy.lvui View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.f$q */
    /* JADX INFO: compiled from: ViewCompat.java */
    class q extends g<Boolean> {
        q(int i2, Class cls, int i3) {
            super(i2, cls, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0683f.g
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public boolean mo3192y(Boolean bool, Boolean bool2) {
            return !m3189k(bool, bool2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0683f.g
        @zy.hyr(28)
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo3190n(View view, Boolean bool) {
            cdj.f7l8(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0683f.g
        @zy.hyr(28)
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public Boolean mo3191q(View view) {
            return Boolean.valueOf(cdj.zy(view));
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.f$qrj */
    /* JADX INFO: compiled from: ViewCompat.java */
    @zy.hyr(21)
    private static class qrj {

        /* JADX INFO: renamed from: androidx.core.view.f$qrj$k */
        /* JADX INFO: compiled from: ViewCompat.java */
        class k implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: k */
            tfm f4018k = null;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            final /* synthetic */ View f50809toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            final /* synthetic */ eqxt f50810zy;

            k(View view, eqxt eqxtVar) {
                this.f50809toq = view;
                this.f50810zy = eqxtVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                tfm tfmVarD2ok = tfm.d2ok(windowInsets, view);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 30) {
                    qrj.m3230k(windowInsets, this.f50809toq);
                    if (tfmVarD2ok.equals(this.f4018k)) {
                        return this.f50810zy.mo151k(view, tfmVarD2ok).oc();
                    }
                }
                this.f4018k = tfmVarD2ok;
                tfm tfmVarMo151k = this.f50810zy.mo151k(view, tfmVarD2ok);
                if (i2 >= 30) {
                    return tfmVarMo151k.oc();
                }
                C0683f.m28243do(view);
                return tfmVarMo151k.oc();
            }
        }

        private qrj() {
        }

        @InterfaceC7830i
        static void cdj(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        @InterfaceC7830i
        static ColorStateList f7l8(View view) {
            return view.getBackgroundTintList();
        }

        @InterfaceC7830i
        static void fn3e(@zy.lvui View view, @zy.dd eqxt eqxtVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C7400k.n.f93277y9n, eqxtVar);
            }
            if (eqxtVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C7400k.n.f93237ch));
            } else {
                view.setOnApplyWindowInsetsListener(new k(view, eqxtVar));
            }
        }

        @InterfaceC7830i
        static void fu4(@zy.lvui View view, float f2) {
            view.setZ(f2);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: g */
        static boolean m3227g(View view, int i2, int i3, int i4, int i5, int[] iArr) {
            return view.dispatchNestedScroll(i2, i3, i4, i5, iArr);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: h */
        static boolean m3228h(View view) {
            return view.isNestedScrollingEnabled();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: i */
        static void m3229i(View view, boolean z2) {
            view.setNestedScrollingEnabled(z2);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m3230k(@zy.lvui WindowInsets windowInsets, @zy.lvui View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C7400k.n.f93237ch);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        @InterfaceC7830i
        static void ki(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        @InterfaceC7830i
        static boolean kja0(View view) {
            return view.isImportantForAccessibility();
        }

        @InterfaceC7830i
        static String ld6(View view) {
            return view.getTransitionName();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: n */
        static boolean m3231n(View view, int i2, int i3, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i2, i3, iArr, iArr2);
        }

        @InterfaceC7830i
        static boolean n7h(View view) {
            return view.hasNestedScrollingParent();
        }

        @InterfaceC7830i
        static void ni7(View view, float f2) {
            view.setTranslationZ(f2);
        }

        @InterfaceC7830i
        static void o1t(View view) {
            view.stopNestedScroll();
        }

        @InterfaceC7830i
        @zy.dd
        /* JADX INFO: renamed from: p */
        public static tfm m3232p(@zy.lvui View view) {
            return tfm.C0723k.m3490k(view);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static boolean m3233q(@zy.lvui View view, float f2, float f3) {
            return view.dispatchNestedPreFling(f2, f3);
        }

        @InterfaceC7830i
        static float qrj(@zy.lvui View view) {
            return view.getZ();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: s */
        static float m3234s(View view) {
            return view.getElevation();
        }

        @InterfaceC7830i
        static void t8r(View view, float f2) {
            view.setElevation(f2);
        }

        @InterfaceC7830i
        static tfm toq(@zy.lvui View view, @zy.lvui tfm tfmVar, @zy.lvui Rect rect) {
            WindowInsets windowInsetsOc = tfmVar.oc();
            if (windowInsetsOc != null) {
                return tfm.d2ok(view.computeSystemWindowInsets(windowInsetsOc, rect), view);
            }
            rect.setEmpty();
            return tfmVar;
        }

        @InterfaceC7830i
        static float x2(View view) {
            return view.getTranslationZ();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: y */
        static PorterDuff.Mode m3235y(View view) {
            return view.getBackgroundTintMode();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: z */
        static boolean m3236z(View view, int i2) {
            return view.startNestedScroll(i2);
        }

        @InterfaceC7830i
        static void zurt(View view, String str) {
            view.setTransitionName(str);
        }

        @InterfaceC7830i
        static boolean zy(@zy.lvui View view, float f2, float f3, boolean z2) {
            return view.dispatchNestedFling(f2, f3, z2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.f$s */
    /* JADX INFO: compiled from: ViewCompat.java */
    @zy.hyr(17)
    static class s {
        private s() {
        }

        @InterfaceC7830i
        static boolean f7l8(View view) {
            return view.isPaddingRelative();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: g */
        static int m3237g(View view) {
            return view.getPaddingStart();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static int m3238k() {
            return View.generateViewId();
        }

        @InterfaceC7830i
        static void ld6(View view, int i2, int i3, int i4, int i5) {
            view.setPaddingRelative(i2, i3, i4, i5);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: n */
        static int m3239n(View view) {
            return view.getPaddingEnd();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: p */
        static void m3240p(View view, int i2) {
            view.setLayoutDirection(i2);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static int m3241q(View view) {
            return view.getLayoutDirection();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: s */
        static void m3242s(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        @InterfaceC7830i
        static Display toq(@zy.lvui View view) {
            return view.getDisplay();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: y */
        static void m3243y(View view, int i2) {
            view.setLabelFor(i2);
        }

        @InterfaceC7830i
        static int zy(View view) {
            return view.getLabelFor();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.f$t */
    /* JADX INFO: compiled from: ViewCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface t {
    }

    /* JADX INFO: renamed from: androidx.core.view.f$t8r */
    /* JADX INFO: compiled from: ViewCompat.java */
    @zy.hyr(30)
    private static class t8r {
        private t8r() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static CharSequence m3244k(View view) {
            return view.getStateDescription();
        }

        @zy.dd
        public static sok toq(@zy.lvui View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return sok.x2(windowInsetsController);
            }
            return null;
        }

        @InterfaceC7830i
        static void zy(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.f$toq */
    /* JADX INFO: compiled from: ViewCompat.java */
    class toq extends g<CharSequence> {
        toq(int i2, Class cls, int i3, int i4) {
            super(i2, cls, i3, i4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0683f.g
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public boolean mo3192y(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0683f.g
        @zy.hyr(28)
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo3190n(View view, CharSequence charSequence) {
            cdj.m3186y(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0683f.g
        @zy.hyr(28)
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public CharSequence mo3191q(View view) {
            return cdj.toq(view);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.f$wvg */
    /* JADX INFO: compiled from: ViewCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface wvg {
    }

    /* JADX INFO: renamed from: androidx.core.view.f$x2 */
    /* JADX INFO: compiled from: ViewCompat.java */
    @zy.hyr(20)
    static class x2 {
        private x2() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static WindowInsets m3247k(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        @InterfaceC7830i
        static WindowInsets toq(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        @InterfaceC7830i
        static void zy(View view) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.f$y */
    /* JADX INFO: compiled from: ViewCompat.java */
    @zy.hyr(16)
    static class y {
        private y() {
        }

        @InterfaceC7830i
        static void cdj(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        @InterfaceC7830i
        static int f7l8(View view) {
            return view.getWindowSystemUiVisibility();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: g */
        static ViewParent m3248g(View view) {
            return view.getParentForAccessibility();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: h */
        static void m3249h(View view) {
            view.requestFitSystemWindows();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static AccessibilityNodeProvider m3250k(View view) {
            return view.getAccessibilityNodeProvider();
        }

        @InterfaceC7830i
        static void ki(View view, boolean z2) {
            view.setHasTransientState(z2);
        }

        @InterfaceC7830i
        static void kja0(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        @InterfaceC7830i
        static void ld6(View view) {
            view.postInvalidateOnAnimation();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: n */
        static int m3251n(View view) {
            return view.getMinimumWidth();
        }

        @InterfaceC7830i
        static void n7h(View view, Runnable runnable, long j2) {
            view.postOnAnimationDelayed(runnable, j2);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: p */
        static boolean m3252p(View view, int i2, Bundle bundle) {
            return view.performAccessibilityAction(i2, bundle);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static int m3253q(View view) {
            return view.getMinimumHeight();
        }

        @InterfaceC7830i
        static void qrj(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: s */
        static boolean m3254s(View view) {
            return view.hasTransientState();
        }

        @InterfaceC7830i
        static void t8r(View view, int i2) {
            view.setImportantForAccessibility(i2);
        }

        @InterfaceC7830i
        static boolean toq(View view) {
            return view.getFitsSystemWindows();
        }

        @InterfaceC7830i
        static void x2(View view, int i2, int i3, int i4, int i5) {
            view.postInvalidateOnAnimation(i2, i3, i4, i5);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: y */
        static boolean m3255y(View view) {
            return view.hasOverlappingRendering();
        }

        @InterfaceC7830i
        static int zy(View view) {
            return view.getImportantForAccessibility();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.f$z */
    /* JADX INFO: compiled from: ViewCompat.java */
    @zy.hyr(31)
    private static final class z implements OnReceiveContentListener {

        /* JADX INFO: renamed from: k */
        @zy.lvui
        private final d2ok f4019k;

        z(@zy.lvui d2ok d2okVar) {
            this.f4019k = d2okVar;
        }

        @zy.dd
        public ContentInfo onReceiveContent(@zy.lvui View view, @zy.lvui ContentInfo contentInfo) {
            C0711q c0711qQrj = C0711q.qrj(contentInfo);
            C0711q c0711qMo3148k = this.f4019k.mo3148k(view, c0711qQrj);
            if (c0711qMo3148k == null) {
                return null;
            }
            return c0711qMo3148k == c0711qQrj ? contentInfo : c0711qMo3148k.x2();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.f$zurt */
    /* JADX INFO: compiled from: ViewCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface zurt {
    }

    /* JADX INFO: renamed from: androidx.core.view.f$zy */
    /* JADX INFO: compiled from: ViewCompat.java */
    class zy extends g<CharSequence> {
        zy(int i2, Class cls, int i3, int i4) {
            super(i2, cls, i3, i4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0683f.g
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public boolean mo3192y(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0683f.g
        @zy.hyr(30)
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void mo3190n(View view, CharSequence charSequence) {
            t8r.zy(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.C0683f.g
        @zy.hyr(30)
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public CharSequence mo3191q(View view) {
            return t8r.m3244k(view);
        }
    }

    @Deprecated
    protected C0683f() {
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public static float m3155a(View view) {
        return view.getPivotX();
    }

    public static void a5id(@zy.lvui View view, float f2) {
        qrj.t8r(view, f2);
    }

    @zy.dd
    public static C0701k a9(@zy.lvui View view) {
        View.AccessibilityDelegate accessibilityDelegateFti = fti(view);
        if (accessibilityDelegateFti == null) {
            return null;
        }
        return accessibilityDelegateFti instanceof C0701k.k ? ((C0701k.k) accessibilityDelegateFti).f4057k : new C0701k(accessibilityDelegateFti);
    }

    @zy.dd
    public static ViewParent a98o(@zy.lvui View view) {
        return y.m3248g(view);
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public static int m3156b(View view) {
        return view.getOverScrollMode();
    }

    private static g<CharSequence> b3e() {
        return new toq(C7400k.n.f93278yz, CharSequence.class, 8, 28);
    }

    public static void b8(@zy.lvui View view, @zy.dd Paint paint) {
        s.m3242s(view, paint);
    }

    public static void b9ub(@zy.lvui View view, @InterfaceC7843t int i2) {
        s.m3243y(view, i2);
    }

    @Deprecated
    public static void bap7(View view, @zy.zurt(from = 0.0d, to = 1.0d) float f2) {
        view.setAlpha(f2);
    }

    public static boolean bek6(@zy.lvui View view, int i2, @zy.dd Bundle bundle) {
        return y.m3252p(view, i2, bundle);
    }

    @InterfaceC7833l
    public static int bf2(@zy.lvui View view) {
        return s.m3239n(view);
    }

    @Deprecated
    public static void bih(View view, float f2) {
        view.setScaleX(f2);
    }

    public static int bo(@zy.lvui View view) {
        return n7h.toq(view);
    }

    @Deprecated
    public static void bqie(View view, float f2) {
        view.setX(f2);
    }

    private static g<CharSequence> btvn() {
        return new zy(C7400k.n.f93234a98o, CharSequence.class, 64, 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C0711q bwp(C0711q c0711q) {
        return c0711q;
    }

    @zy.lvui
    public static tfm bz2(@zy.lvui View view, @zy.lvui tfm tfmVar) {
        WindowInsets windowInsetsOc = tfmVar.oc();
        if (windowInsetsOc != null) {
            WindowInsets qVar = x2.toq(view, windowInsetsOc);
            if (!qVar.equals(windowInsetsOc)) {
                return tfm.d2ok(qVar, view);
            }
        }
        return tfmVar;
    }

    /* JADX INFO: renamed from: c */
    public static int m3157c(@zy.lvui View view) {
        return y.zy(view);
    }

    @zy.lvui
    public static List<Rect> c8jq(@zy.lvui View view) {
        return Build.VERSION.SDK_INT >= 29 ? ki.toq(view) : Collections.emptyList();
    }

    public static void cdj(@zy.lvui View view) {
        kja0.toq(view);
    }

    @Deprecated
    public static boolean cfr(View view) {
        return view.isOpaque();
    }

    @Deprecated
    public static float ch(View view) {
        return view.getRotation();
    }

    public static void cn02(@zy.lvui View view, @zy.lvui View.DragShadowBuilder dragShadowBuilder) {
        kja0.m3205g(view, dragShadowBuilder);
    }

    public static void cnbm(@zy.lvui View view, boolean z2) {
        h.qrj(view, z2);
    }

    @zy.dd
    public static C0711q cv06(@zy.lvui View view, @zy.lvui C0711q c0711q) {
        if (Log.isLoggable(f4003k, 3)) {
            Log.d(f4003k, "performReceiveContent: " + c0711q + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return i.toq(view, c0711q);
        }
        d2ok d2okVar = (d2ok) view.getTag(C7400k.n.f42547b);
        if (d2okVar == null) {
            return hyr(view).mo448k(c0711q);
        }
        C0711q c0711qMo3148k = d2okVar.mo3148k(view, c0711q);
        if (c0711qMo3148k == null) {
            return null;
        }
        return hyr(view).mo448k(c0711qMo3148k);
    }

    public static void cyoe(@zy.lvui View view, @zy.lvui List<Rect> list) {
        if (Build.VERSION.SDK_INT >= 29) {
            ki.m3204q(view, list);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static int m3158d(@zy.lvui View view) {
        return y.f7l8(view);
    }

    @Deprecated
    public static float d2ok(View view) {
        return view.getAlpha();
    }

    @zy.dd
    public static androidx.core.view.accessibility.t8r d3(@zy.lvui View view) {
        AccessibilityNodeProvider accessibilityNodeProviderM3250k = y.m3250k(view);
        if (accessibilityNodeProviderM3250k != null) {
            return new androidx.core.view.accessibility.t8r(accessibilityNodeProviderM3250k);
        }
        return null;
    }

    public static boolean d8wk(@zy.lvui View view) {
        return f7l8.m3187k(view);
    }

    @zy.dd
    public static PorterDuff.Mode dd(@zy.lvui View view) {
        return qrj.m3235y(view);
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static void m28243do(@zy.lvui View view) {
        x2.zy(view);
    }

    @Deprecated
    public static float dr(View view) {
        return view.getTranslationX();
    }

    @SuppressLint({"BanUncheckedReflection"})
    @Deprecated
    public static void dxef(ViewGroup viewGroup, boolean z2) {
        if (f4004l == null) {
            try {
                f4004l = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e2) {
                Log.e(f4003k, "Unable to find childrenDrawingOrderEnabled", e2);
            }
            f4004l.setAccessible(true);
        }
        try {
            f4004l.invoke(viewGroup, Boolean.valueOf(z2));
        } catch (IllegalAccessException e3) {
            Log.e(f4003k, "Unable to invoke childrenDrawingOrderEnabled", e3);
        } catch (IllegalArgumentException e4) {
            Log.e(f4003k, "Unable to invoke childrenDrawingOrderEnabled", e4);
        } catch (InvocationTargetException e6) {
            Log.e(f4003k, "Unable to invoke childrenDrawingOrderEnabled", e6);
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m3159e(@zy.lvui View view) {
        return s.m3241q(view);
    }

    public static void e5(@zy.lvui View view, @zy.dd PorterDuff.Mode mode) {
        qrj.ki(view, mode);
    }

    @Deprecated
    public static int ebn(int i2, int i3, int i4) {
        return View.resolveSizeAndState(i2, i3, i4);
    }

    @Deprecated
    public static void ec(View view, float f2) {
        view.setScaleY(f2);
    }

    public static int ek5k(@zy.lvui View view) {
        return y.m3251n(view);
    }

    @Deprecated
    public static void el(View view, float f2) {
        view.setTranslationY(f2);
    }

    private static List<ki.C0656k> eqxt(View view) {
        int i2 = C7400k.n.f42559o;
        ArrayList arrayList = (ArrayList) view.getTag(i2);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i2, arrayList2);
        return arrayList2;
    }

    public static boolean etdu(@zy.lvui View view) {
        return ld6.m3212q(view);
    }

    public static void ew(@zy.lvui View view, boolean z2) {
        qrj.m3229i(view, z2);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m3160f(@zy.lvui View view) {
        return y.toq(view);
    }

    @Deprecated
    public static void f1bi(View view, float f2) {
        view.setY(f2);
    }

    @zy.lvui
    public static gyi f7l8(@zy.lvui View view) {
        if (f50792ncyb == null) {
            f50792ncyb = new WeakHashMap<>();
        }
        gyi gyiVar = f50792ncyb.get(view);
        if (gyiVar != null) {
            return gyiVar;
        }
        gyi gyiVar2 = new gyi(view);
        f50792ncyb.put(view, gyiVar2);
        return gyiVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean fn3e(@zy.lvui View view, int i2, int i3, @zy.dd int[] iArr, @zy.dd int[] iArr2, int i4) {
        if (view instanceof androidx.core.view.mcp) {
            return ((androidx.core.view.mcp) view).dispatchNestedPreScroll(i2, i3, iArr, iArr2, i4);
        }
        if (i4 == 0) {
            return m3163i(view, i2, i3, iArr, iArr2);
        }
        return false;
    }

    public static boolean fnq8(@zy.lvui View view) {
        return fti(view) != null;
    }

    @zy.dd
    private static View.AccessibilityDelegate fti(@zy.lvui View view) {
        return Build.VERSION.SDK_INT >= 29 ? ki.m3203k(view) : jp0y(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean fu4(@zy.lvui View view, int i2, int i3, int i4, int i5, @zy.dd int[] iArr, int i6) {
        if (view instanceof androidx.core.view.mcp) {
            return ((androidx.core.view.mcp) view).dispatchNestedScroll(i2, i3, i4, i5, iArr, i6);
        }
        if (i6 == 0) {
            return ni7(view, i2, i3, i4, i5, iArr);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static void m3161g(@zy.lvui View view, @zy.lvui o1t o1tVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            cdj.m3182k(view, o1tVar);
            return;
        }
        int i2 = C7400k.n.f42566x;
        ArrayList arrayList = (ArrayList) view.getTag(i2);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(i2, arrayList);
        }
        arrayList.add(o1tVar);
        if (arrayList.size() == 1) {
            mcp.m3217y(view);
        }
    }

    private static void g0ad(View view) {
        if (m3157c(view) == 0) {
            o05(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (m3157c((View) parent) == 4) {
                o05(view, 2);
                return;
            }
        }
    }

    public static boolean g1(@zy.lvui View view) {
        return y.m3255y(view);
    }

    public static void ga(@zy.lvui View view, @zy.dd ColorStateList colorStateList) {
        qrj.cdj(view, colorStateList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean gb(@zy.lvui View view, int i2, int i3) {
        if (view instanceof androidx.core.view.mcp) {
            return ((androidx.core.view.mcp) view).startNestedScroll(i2, i3);
        }
        if (i3 == 0) {
            return kbj(view, i2);
        }
        return false;
    }

    @zy.ek5k
    public static boolean gbni(@zy.lvui View view) {
        Boolean boolM3188g = toq().m3188g(view);
        return boolM3188g != null && boolM3188g.booleanValue();
    }

    public static void gc3c(@zy.lvui View view, int i2) {
        view.offsetLeftAndRight(i2);
    }

    public static void gcp(@zy.lvui View view, boolean z2) {
        h.ld6(view, z2);
    }

    public static int gvn7(@zy.lvui View view) {
        return ld6.m3210k(view);
    }

    @zy.dd
    public static String gyi(@zy.lvui View view) {
        return qrj.ld6(view);
    }

    @zy.lvui
    /* JADX INFO: renamed from: h */
    public static tfm m3162h(@zy.lvui View view, @zy.lvui tfm tfmVar) {
        WindowInsets windowInsetsOc = tfmVar.oc();
        if (windowInsetsOc != null) {
            WindowInsets windowInsetsM3247k = x2.m3247k(view, windowInsetsOc);
            if (!windowInsetsM3247k.equals(windowInsetsOc)) {
                return tfm.d2ok(windowInsetsM3247k, view);
            }
        }
        return tfmVar;
    }

    public static void h4b(@zy.lvui View view, @zy.dd String... strArr) {
        h.m3196p(view, strArr);
    }

    public static void h7am(@zy.lvui View view) {
        y.ld6(view);
    }

    @Deprecated
    public static int hb(View view) {
        return view.getMeasuredHeightAndState();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static lvui hyr(@zy.lvui View view) {
        return view instanceof lvui ? (lvui) view : f50787lrht;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m3163i(@zy.lvui View view, int i2, int i3, @zy.dd int[] iArr, @zy.dd int[] iArr2) {
        return qrj.m3231n(view, i2, i3, iArr, iArr2);
    }

    @InterfaceC7833l
    public static int i1(@zy.lvui View view) {
        return s.m3237g(view);
    }

    public static boolean i9jn(@zy.lvui View view) {
        return qrj.kja0(view);
    }

    public static void ij(@zy.lvui View view, @zy.lvui @SuppressLint({"ContextFirst"}) Context context, @zy.lvui int[] iArr, @zy.dd AttributeSet attributeSet, @zy.lvui TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            ki.zy(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    @Deprecated
    @zy.dd
    public static sok ikck(@zy.lvui View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return t8r.toq(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return ikck.m3315k(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void imd(@zy.lvui View view, @zy.dd vq.toq toqVar) {
        vq.m3524y(view, toqVar);
    }

    public static void ix(@zy.lvui View view, int i2) {
        h.n7h(view, i2);
    }

    public static void ixz(@zy.lvui View view, @zy.lvui ki.C0656k c0656k, @zy.dd CharSequence charSequence, @zy.dd androidx.core.view.accessibility.fn3e fn3eVar) {
        if (fn3eVar == null && charSequence == null) {
            yl(view, c0656k.toq());
        } else {
            m3171q(view, c0656k.m3063k(charSequence, fn3eVar));
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: j */
    public static int m3164j(View view) {
        return view.getMeasuredState();
    }

    @SuppressLint({"LambdaLast"})
    public static void jbh(@zy.lvui View view, @zy.lvui Runnable runnable, long j2) {
        y.n7h(view, runnable, j2);
    }

    public static int jk() {
        return s.m3238k();
    }

    @zy.dd
    private static View.AccessibilityDelegate jp0y(@zy.lvui View view) {
        if (f50781hyr) {
            return null;
        }
        if (f50790n5r1 == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f50790n5r1 = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f50781hyr = true;
                return null;
            }
        }
        try {
            Object obj = f50790n5r1.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f50781hyr = true;
            return null;
        }
    }

    public static void jz5(@zy.lvui View view, @zy.lvui androidx.core.view.accessibility.ki kiVar) {
        view.onInitializeAccessibilityNodeInfo(kiVar.nme());
    }

    public static boolean kbj(@zy.lvui View view, int i2) {
        return qrj.m3236z(view, i2);
    }

    @zy.dd
    public static View kcsr(@zy.lvui View view, @zy.dd View view2, int i2) {
        return h.m3199y(view, view2, i2);
    }

    public static boolean ki(@zy.lvui View view, float f2, float f3, boolean z2) {
        return qrj.zy(view, f2, f3, z2);
    }

    @Deprecated
    public static void kiv(View view, float f2) {
        view.setRotationY(f2);
    }

    @zy.lvui
    public static tfm kja0(@zy.lvui View view, @zy.lvui tfm tfmVar, @zy.lvui Rect rect) {
        return qrj.toq(view, tfmVar, rect);
    }

    public static void kq2f(@zy.lvui View view) {
        qrj.o1t(view);
    }

    @Deprecated
    public static void ktq(View view, AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    public static void kx3(@zy.lvui View view, @zy.dd eqxt eqxtVar) {
        qrj.fn3e(view, eqxtVar);
    }

    /* JADX INFO: renamed from: l */
    public static float m3166l(@zy.lvui View view) {
        return qrj.m3234s(view);
    }

    @zy.ek5k
    public static void l05(@zy.lvui View view, @zy.dd CharSequence charSequence) {
        btvn().f7l8(view, charSequence);
    }

    public static void ld6(@zy.lvui View view) {
        kja0.m3206k(view);
    }

    @Deprecated
    public static void lh(View view, boolean z2) {
        view.setActivated(z2);
    }

    @SuppressLint({"InlinedApi"})
    public static int lrht(@zy.lvui View view) {
        return h.toq(view);
    }

    public static boolean ltg8(@zy.lvui View view) {
        return h.m3193g(view);
    }

    @Deprecated
    public static float lv5(View view) {
        return view.getRotationY();
    }

    private static int lvui(View view, @zy.lvui CharSequence charSequence) {
        List<ki.C0656k> listEqxt = eqxt(view);
        for (int i2 = 0; i2 < listEqxt.size(); i2++) {
            if (TextUtils.equals(charSequence, listEqxt.get(i2).zy())) {
                return listEqxt.get(i2).toq();
            }
        }
        int i3 = -1;
        int i4 = 0;
        while (true) {
            int[] iArr = f3998c;
            if (i4 >= iArr.length || i3 != -1) {
                break;
            }
            int i5 = iArr[i4];
            boolean z2 = true;
            for (int i6 = 0; i6 < listEqxt.size(); i6++) {
                z2 &= listEqxt.get(i6).toq() != i5;
            }
            if (z2) {
                i3 = i5;
            }
            i4++;
        }
        return i3;
    }

    @Deprecated
    public static void lw(View view, boolean z2) {
        view.setFitsSystemWindows(z2);
    }

    /* JADX INFO: renamed from: m */
    public static int m3167m(@zy.lvui View view) {
        return y.m3253q(view);
    }

    @Deprecated
    public static void m2t(View view, int i2) {
        view.setOverScrollMode(i2);
    }

    public static boolean m4(@zy.lvui View view) {
        return h.f7l8(view);
    }

    public static void m58i(@zy.lvui View view, int i2) {
        h.x2(view, i2);
    }

    public static void mbx(@zy.lvui View view, @zy.lvui Runnable runnable) {
        y.qrj(view, runnable);
    }

    static void mcp(@zy.lvui View view) {
        C0701k c0701kA9 = a9(view);
        if (c0701kA9 == null) {
            c0701kA9 = new C0701k();
        }
        zwy(view, c0701kA9);
    }

    private static void mj(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    @Deprecated
    public static float mu(View view) {
        return view.getX();
    }

    /* JADX INFO: renamed from: n */
    public static void m3168n(@zy.lvui View view, @zy.lvui Collection<View> collection, int i2) {
        h.m3194k(view, collection, i2);
    }

    @zy.ek5k
    public static void n2t(@zy.lvui View view, boolean z2) {
        toq().f7l8(view, Boolean.valueOf(z2));
    }

    private static Rect n5r1() {
        if (f3999f == null) {
            f3999f = new ThreadLocal<>();
        }
        Rect rect = f3999f.get();
        if (rect == null) {
            rect = new Rect();
            f3999f.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    private static void n7h(View view, int i2) {
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            mj(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                mj((View) parent);
            }
        }
    }

    @zy.dd
    public static Display ncyb(@zy.lvui View view) {
        return s.toq(view);
    }

    @zy.ek5k
    public static void ngy(@zy.lvui View view, @zy.dd CharSequence charSequence) {
        b3e().f7l8(view, charSequence);
        if (charSequence != null) {
            f50799uv6.m3220k(view);
        } else {
            f50799uv6.m3221q(view);
        }
    }

    public static boolean ni7(@zy.lvui View view, int i2, int i3, int i4, int i5, @zy.dd int[] iArr) {
        return qrj.m3227g(view, i2, i3, i4, i5, iArr);
    }

    @Deprecated
    public static void nme(View view, int i2, Paint paint) {
        view.setLayerType(i2, paint);
    }

    @Deprecated
    public static float nmn5(View view) {
        return view.getRotationX();
    }

    @Deprecated
    @zy.dd
    public static Matrix nn86(View view) {
        return view.getMatrix();
    }

    @Deprecated
    public static void nnh(View view, float f2) {
        view.setRotation(f2);
    }

    private static g<Boolean> nsb() {
        return new k(C7400k.n.f93250i1, Boolean.class, 28);
    }

    @Deprecated
    /* JADX INFO: renamed from: o */
    public static int m3169o(View view) {
        return view.getMeasuredWidthAndState();
    }

    @zy.ek5k
    public static void o05(@zy.lvui View view, int i2) {
        y.t8r(view, i2);
    }

    @zy.ek5k
    static boolean o1t(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return mcp.m3213k(view).toq(view, keyEvent);
    }

    @zy.ek5k
    public static void o5(@zy.lvui View view, boolean z2) {
        nsb().f7l8(view, Boolean.valueOf(z2));
    }

    public static boolean ob(@zy.lvui View view, @zy.dd ClipData clipData, @zy.lvui View.DragShadowBuilder dragShadowBuilder, @zy.dd Object obj, int i2) {
        return kja0.m3207n(view, clipData, dragShadowBuilder, obj, i2);
    }

    @zy.ek5k
    @zy.dd
    public static CharSequence oc(@zy.lvui View view) {
        return b3e().m3188g(view);
    }

    public static void oki(@zy.lvui View view, boolean z2) {
        y.ki(view, z2);
    }

    @Deprecated
    /* JADX INFO: renamed from: p */
    public static boolean m3170p(View view, int i2) {
        return view.canScrollVertically(i2);
    }

    public static boolean pc(@zy.lvui View view) {
        return h.m3198s(view);
    }

    public static void pjz9(@zy.lvui View view, int i2) {
        ld6.m3209g(view, i2);
    }

    @Deprecated
    public static void ps(View view, float f2) {
        view.setPivotX(f2);
    }

    public static boolean py(@zy.lvui View view) {
        return h.m3195n(view);
    }

    /* JADX INFO: renamed from: q */
    private static void m3171q(@zy.lvui View view, @zy.lvui ki.C0656k c0656k) {
        mcp(view);
        uc(c0656k.toq(), view);
        eqxt(view).add(c0656k);
        se(view, 0);
    }

    public static float qkj8(@zy.lvui View view) {
        return qrj.qrj(view);
    }

    public static boolean qo(@zy.lvui View view) {
        return h.m3197q(view);
    }

    private static void qrj(View view, int i2) {
        view.offsetLeftAndRight(i2);
        if (view.getVisibility() == 0) {
            mj(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                mj((View) parent);
            }
        }
    }

    @zy.dd
    /* JADX INFO: renamed from: r */
    public static ColorStateList m3172r(@zy.lvui View view) {
        return qrj.f7l8(view);
    }

    public static void r25n(@zy.lvui View view, int i2) {
        s.m3240p(view, i2);
    }

    public static void r6ty(@zy.lvui View view, @zy.dd CharSequence charSequence) {
        h.kja0(view, charSequence);
    }

    public static boolean r8s8(@zy.lvui View view) {
        return p.toq(view);
    }

    public static void ra(@zy.lvui View view, @zy.dd dd ddVar) {
        kja0.m3208q(view, (PointerIcon) (ddVar != null ? ddVar.toq() : null));
    }

    public static void rp(@zy.lvui View view, int i2, int i3) {
        n7h.m3223q(view, i2, i3);
    }

    @Deprecated
    /* JADX INFO: renamed from: s */
    public static boolean m3173s(View view, int i2) {
        return view.canScrollHorizontally(i2);
    }

    @zy.hyr(19)
    static void se(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z2 = oc(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (gvn7(view) != 0 || z2) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z2 ? 32 : 2048);
                ld6.f7l8(accessibilityEventObtain, i2);
                if (z2) {
                    accessibilityEventObtain.getText().add(oc(view));
                    g0ad(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i2 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                ld6.f7l8(accessibilityEventObtain2, i2);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(oc(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    ld6.m3211n(view.getParent(), view, view, i2);
                } catch (AbstractMethodError e2) {
                    Log.e(f4003k, view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                }
            }
        }
    }

    public static boolean sok(@zy.lvui View view) {
        return qrj.m3228h(view);
    }

    /* JADX INFO: renamed from: t */
    public static void m3174t(@zy.lvui View view) {
        mcp(view);
    }

    @Deprecated
    public static float t8iq(View view) {
        return view.getScaleX();
    }

    public static boolean t8r(@zy.lvui View view, float f2, float f3) {
        return qrj.m3233q(view, f2, f3);
    }

    public static boolean tfm(@zy.lvui View view) {
        return qrj.n7h(view);
    }

    private static g<Boolean> toq() {
        return new q(C7400k.n.f93241ek5k, Boolean.class, 28);
    }

    public static void tww7(@zy.lvui View view, float f2) {
        qrj.fu4(view, f2);
    }

    @Deprecated
    /* JADX INFO: renamed from: u */
    public static float m3175u(View view) {
        return view.getScaleY();
    }

    public static void u38j(@zy.lvui View view, @InterfaceC7833l int i2, @InterfaceC7833l int i3, @InterfaceC7833l int i4, @InterfaceC7833l int i5) {
        s.ld6(view, i2, i3, i4, i5);
    }

    private static void uc(int i2, View view) {
        List<ki.C0656k> listEqxt = eqxt(view);
        for (int i3 = 0; i3 < listEqxt.size(); i3++) {
            if (listEqxt.get(i3).toq() == i2) {
                listEqxt.remove(i3);
                return;
            }
        }
    }

    @Deprecated
    public static void uf(View view, float f2) {
        view.setRotationX(f2);
    }

    @Deprecated
    public static void uj2j(View view, AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @zy.lvui
    public static <T extends View> T ukdy(@zy.lvui View view, @InterfaceC7843t int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) cdj.m3181g(view, i2);
        }
        T t2 = (T) view.findViewById(i2);
        if (t2 != null) {
            return t2;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    public static int uv6(@zy.lvui View view) {
        return s.zy(view);
    }

    /* JADX INFO: renamed from: v */
    public static float m3176v(@zy.lvui View view) {
        return qrj.x2(view);
    }

    public static boolean v0af(@zy.lvui View view) {
        return ld6.zy(view);
    }

    @Deprecated
    public static void v5yj(View view, float f2) {
        view.setPivotY(f2);
    }

    public static void vep5(@zy.lvui View view, int i2, int i3, int i4, int i5) {
        y.x2(view, i2, i3, i4, i5);
    }

    @Deprecated
    public static float vq(View view) {
        return view.getY();
    }

    public static void vy(@zy.lvui View view, @zy.dd Rect rect) {
        p.zy(view, rect);
    }

    @Deprecated
    public static int vyq(View view) {
        return view.getLayerType();
    }

    /* JADX INFO: renamed from: w */
    public static void m3177w(@zy.lvui View view, @zy.dd String[] strArr, @zy.dd d2ok d2okVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            i.zy(view, strArr, d2okVar);
            return;
        }
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z2 = false;
        if (d2okVar != null) {
            androidx.core.util.n7h.toq(strArr != null, "When the listener is set, MIME types must also be set");
        }
        if (strArr != null) {
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (strArr[i2].startsWith("*")) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            androidx.core.util.n7h.toq(!z2, "A MIME type set here must not start with *: " + Arrays.toString(strArr));
        }
        view.setTag(C7400k.n.f93235bf2, strArr);
        view.setTag(C7400k.n.f42547b, d2okVar);
    }

    public static boolean w831(@zy.lvui View view) {
        return s.f7l8(view);
    }

    public static boolean was(@zy.lvui View view) {
        return y.m3254s(view);
    }

    public static void wlev(@zy.lvui View view, @zy.dd Drawable drawable) {
        y.cdj(view, drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean wo(@zy.lvui View view, int i2) {
        if (view instanceof androidx.core.view.mcp) {
            ((androidx.core.view.mcp) view).hasNestedScrollingParent(i2);
            return false;
        }
        if (i2 == 0) {
            return tfm(view);
        }
        return false;
    }

    public static void wt(@zy.lvui View view, float f2) {
        qrj.ni7(view, f2);
    }

    @zy.ek5k
    static boolean wvg(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return mcp.m3213k(view).m3218g(keyEvent);
    }

    public static void wx16(@zy.lvui View view, @zy.lvui o1t o1tVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            cdj.m3183n(view, o1tVar);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(C7400k.n.f42566x);
        if (arrayList != null) {
            arrayList.remove(o1tVar);
            if (arrayList.size() == 0) {
                mcp.m3216s(view);
            }
        }
    }

    @zy.dd
    /* JADX INFO: renamed from: x */
    public static tfm m3178x(@zy.lvui View view) {
        return n7h.m3222k(view);
    }

    @Deprecated
    public static int x2(int i2, int i3) {
        return View.combineMeasuredStates(i2, i3);
    }

    @zy.dd
    public static Rect x9kr(@zy.lvui View view) {
        return p.m3224k(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void xm(@zy.lvui View view, int i2) {
        if (view instanceof androidx.core.view.mcp) {
            ((androidx.core.view.mcp) view).stopNestedScroll(i2);
        } else if (i2 == 0) {
            kq2f(view);
        }
    }

    @Deprecated
    public static float xwq3(View view) {
        return view.getTranslationY();
    }

    /* JADX INFO: renamed from: y */
    private static void m3179y() {
        try {
            f50788lvui = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
            f4008r = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
        } catch (NoSuchMethodException e2) {
            Log.e(f4003k, "Couldn't find method", e2);
        }
        f50774dd = true;
    }

    @zy.ek5k
    @zy.dd
    public static CharSequence y2(@zy.lvui View view) {
        return btvn().m3188g(view);
    }

    @zy.dd
    public static String[] y9n(@zy.lvui View view) {
        return Build.VERSION.SDK_INT >= 31 ? i.m3200k(view) : (String[]) view.getTag(C7400k.n.f93235bf2);
    }

    public static void yl(@zy.lvui View view, int i2) {
        uc(i2, view);
        se(view, 0);
    }

    public static void yp31(@zy.lvui View view, @zy.dd String str) {
        qrj.zurt(view, str);
    }

    @Deprecated
    public static void yqrt(View view) {
        view.jumpDrawablesToCurrentState();
    }

    public static void yw(@zy.lvui View view, int i2) {
        n7h.zy(view, i2);
    }

    public static int yz(@zy.lvui View view) {
        return h.zy(view);
    }

    /* JADX INFO: renamed from: z */
    public static void m3180z(@zy.lvui View view) {
        kja0.zy(view);
    }

    @zy.ek5k
    public static boolean z4(@zy.lvui View view) {
        Boolean boolM3188g = nsb().m3188g(view);
        return boolM3188g != null && boolM3188g.booleanValue();
    }

    @Deprecated
    public static void z4t(View view, boolean z2) {
        view.setSaveFromParentEnabled(z2);
    }

    @Deprecated
    public static void zff0(View view, float f2) {
        view.setTranslationX(f2);
    }

    public static void zkd(@zy.lvui View view, int i2) {
        view.offsetTopAndBottom(i2);
    }

    @Deprecated
    public static float zp(View view) {
        return view.getPivotY();
    }

    public static boolean zsr0(@zy.lvui View view) {
        return ld6.toq(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void zurt(@zy.lvui View view, int i2, int i3, int i4, int i5, @zy.dd int[] iArr, int i6, @zy.lvui int[] iArr2) {
        if (view instanceof jk) {
            ((jk) view).dispatchNestedScroll(i2, i3, i4, i5, iArr, i6, iArr2);
        } else {
            fu4(view, i2, i3, i4, i5, iArr, i6);
        }
    }

    public static void zwy(@zy.lvui View view, @zy.dd C0701k c0701k) {
        if (c0701k == null && (fti(view) instanceof C0701k.k)) {
            c0701k = new C0701k();
        }
        view.setAccessibilityDelegate(c0701k == null ? null : c0701k.getBridge());
    }

    public static int zy(@zy.lvui View view, @zy.lvui CharSequence charSequence, @zy.lvui androidx.core.view.accessibility.fn3e fn3eVar) {
        int iLvui = lvui(view, charSequence);
        if (iLvui != -1) {
            m3171q(view, new ki.C0656k(iLvui, charSequence, fn3eVar));
        }
        return iLvui;
    }
}
