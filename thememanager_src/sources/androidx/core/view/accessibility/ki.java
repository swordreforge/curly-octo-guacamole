package androidx.core.view.accessibility;

import android.R;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo;
import androidx.core.os.C0582k;
import androidx.core.view.accessibility.fn3e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n7h.C7400k;
import zy.a9;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: AccessibilityNodeInfoCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class ki {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final int f50655a9 = 4096;

    /* JADX INFO: renamed from: c */
    public static final String f3918c = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f50656cdj = 4;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    public static final int f50657d2ok = 524288;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final int f50658d3 = 65536;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    public static final String f50659dd = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";

    /* JADX INFO: renamed from: e */
    @SuppressLint({"ActionValue"})
    public static final String f3919e = "android.view.accessibility.action.ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT";

    /* JADX INFO: renamed from: ek5k, reason: collision with root package name */
    public static final int f50660ek5k = 8;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    public static final int f50661eqxt = 262144;

    /* JADX INFO: renamed from: f */
    public static final String f3920f = "android.view.accessibility.action.ARGUMENT_ROW_INT";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f50662f7l8 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY";

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final int f50663fn3e = 4;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    public static final int f50664fti = 8192;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final int f50665fu4 = 32;

    /* JADX INFO: renamed from: g */
    private static final String f3921g = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY";

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    public static final int f50666gvn7 = 32768;

    /* JADX INFO: renamed from: h */
    private static final int f3922h = 2;

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    public static final int f50667hb = 2;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    public static final String f50668hyr = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";

    /* JADX INFO: renamed from: i */
    public static final int f3923i = 2;

    /* JADX INFO: renamed from: j */
    public static final int f3924j = 1;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static final int f50669jk = 2048;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    public static final int f50670jp0y = 16384;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final int f50671ki = 8;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f50672kja0 = 1;

    /* JADX INFO: renamed from: l */
    public static final String f3925l = "ACTION_ARGUMENT_SELECTION_START_INT";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f50673ld6 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY";

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    public static final String f50674lrht = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    public static final int f50675lvui = 1048576;

    /* JADX INFO: renamed from: m */
    public static final int f3926m = 4;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final int f50676mcp = 1024;

    /* JADX INFO: renamed from: n */
    private static final String f3927n = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY";

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    public static final String f50677n5r1 = "ACTION_ARGUMENT_SELECTION_END_INT";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final String f50678n7h = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY";

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    public static final String f50679ncyb = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final int f50680ni7 = 16;

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    public static final int f50681nn86 = 1;

    /* JADX INFO: renamed from: o */
    public static final int f3928o = 2;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final int f50682o1t = 128;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    public static final int f50683oc = 131072;

    /* JADX INFO: renamed from: p */
    private static final String f3929p = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";

    /* JADX INFO: renamed from: q */
    private static final String f3930q = "AccessibilityNodeInfo.roleDescription";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f50684qrj = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY";

    /* JADX INFO: renamed from: r */
    public static final int f3931r = 2097152;

    /* JADX INFO: renamed from: s */
    private static final String f3932s = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY";

    /* JADX INFO: renamed from: t */
    public static final int f3933t = 512;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final int f50685t8r = 1;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    public static final String f50686uv6 = "ACTION_ARGUMENT_MOVE_WINDOW_X";

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    public static final String f50687vyq = "ACTION_ARGUMENT_MOVE_WINDOW_Y";

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final int f50688wvg = 256;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f50689x2 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY";

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    public static final String f50690x9kr = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";

    /* JADX INFO: renamed from: y */
    private static final String f3934y = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";

    /* JADX INFO: renamed from: y9n, reason: collision with root package name */
    private static int f50691y9n = 0;

    /* JADX INFO: renamed from: yz, reason: collision with root package name */
    public static final int f50692yz = 16;

    /* JADX INFO: renamed from: z */
    public static final int f3935z = 64;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final int f50693zurt = 8;

    /* JADX INFO: renamed from: k */
    private final AccessibilityNodeInfo f3936k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public int f50694toq = -1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f50695zy = -1;

    /* JADX INFO: renamed from: androidx.core.view.accessibility.ki$k */
    /* JADX INFO: compiled from: AccessibilityNodeInfoCompat.java */
    public static class C0656k {

        /* JADX INFO: renamed from: a9, reason: collision with root package name */
        public static final C0656k f50696a9;

        /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
        public static final C0656k f50698d2ok;

        /* JADX INFO: renamed from: d3, reason: collision with root package name */
        @lvui
        public static final C0656k f50699d3;

        /* JADX INFO: renamed from: dd, reason: collision with root package name */
        public static final C0656k f50700dd;

        /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
        @lvui
        public static final C0656k f50701eqxt;

        /* JADX INFO: renamed from: fti, reason: collision with root package name */
        public static final C0656k f50704fti;

        /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
        @lvui
        public static final C0656k f50706gvn7;

        /* JADX INFO: renamed from: jk, reason: collision with root package name */
        public static final C0656k f50707jk;

        /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
        public static final C0656k f50708jp0y;

        /* JADX INFO: renamed from: l */
        @lvui
        public static final C0656k f3940l;

        /* JADX INFO: renamed from: lvui, reason: collision with root package name */
        public static final C0656k f50712lvui;

        /* JADX INFO: renamed from: mcp, reason: collision with root package name */
        public static final C0656k f50713mcp;

        /* JADX INFO: renamed from: n */
        private static final String f3941n = "A11yActionCompat";

        /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
        @lvui
        public static final C0656k f50715ncyb;

        /* JADX INFO: renamed from: oc, reason: collision with root package name */
        @lvui
        public static final C0656k f50718oc;

        /* JADX INFO: renamed from: r */
        public static final C0656k f3943r;

        /* JADX INFO: renamed from: t */
        public static final C0656k f3945t;

        /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
        public static final C0656k f50723x9kr;

        /* JADX INFO: renamed from: k */
        final Object f3948k;

        /* JADX INFO: renamed from: q */
        @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        protected final fn3e f3949q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f50725toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final Class<? extends fn3e.AbstractC0648k> f50726zy;

        /* JADX INFO: renamed from: g */
        public static final C0656k f3937g = new C0656k(1, null);

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public static final C0656k f50702f7l8 = new C0656k(2, null);

        /* JADX INFO: renamed from: y */
        public static final C0656k f3946y = new C0656k(4, null);

        /* JADX INFO: renamed from: s */
        public static final C0656k f3944s = new C0656k(8, null);

        /* JADX INFO: renamed from: p */
        public static final C0656k f3942p = new C0656k(16, null);

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        public static final C0656k f50711ld6 = new C0656k(32, null);

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        public static final C0656k f50722x2 = new C0656k(64, null);

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        public static final C0656k f50719qrj = new C0656k(128, null);

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        public static final C0656k f50714n7h = new C0656k(256, (CharSequence) null, (Class<? extends fn3e.AbstractC0648k>) fn3e.toq.class);

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        public static final C0656k f50710kja0 = new C0656k(512, (CharSequence) null, (Class<? extends fn3e.AbstractC0648k>) fn3e.toq.class);

        /* JADX INFO: renamed from: h */
        public static final C0656k f3938h = new C0656k(1024, (CharSequence) null, (Class<? extends fn3e.AbstractC0648k>) fn3e.zy.class);

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        public static final C0656k f50697cdj = new C0656k(2048, (CharSequence) null, (Class<? extends fn3e.AbstractC0648k>) fn3e.zy.class);

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        public static final C0656k f50709ki = new C0656k(4096, null);

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        public static final C0656k f50720t8r = new C0656k(8192, null);

        /* JADX INFO: renamed from: i */
        public static final C0656k f3939i = new C0656k(16384, null);

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        public static final C0656k f50703fn3e = new C0656k(32768, null);

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        public static final C0656k f50724zurt = new C0656k(65536, null);

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        public static final C0656k f50716ni7 = new C0656k(131072, (CharSequence) null, (Class<? extends fn3e.AbstractC0648k>) fn3e.f7l8.class);

        /* JADX INFO: renamed from: fu4, reason: collision with root package name */
        public static final C0656k f50705fu4 = new C0656k(262144, null);

        /* JADX INFO: renamed from: z */
        public static final C0656k f3947z = new C0656k(524288, null);

        /* JADX INFO: renamed from: o1t, reason: collision with root package name */
        public static final C0656k f50717o1t = new C0656k(1048576, null);

        /* JADX INFO: renamed from: wvg, reason: collision with root package name */
        public static final C0656k f50721wvg = new C0656k(2097152, (CharSequence) null, (Class<? extends fn3e.AbstractC0648k>) fn3e.C0651y.class);

        static {
            int i2 = Build.VERSION.SDK_INT;
            f3945t = new C0656k(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            f50713mcp = new C0656k(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, fn3e.C0649n.class);
            f50707jk = new C0656k(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f50696a9 = new C0656k(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f50704fti = new C0656k(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f50708jp0y = new C0656k(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            f50706gvn7 = new C0656k(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            f50699d3 = new C0656k(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            f50718oc = new C0656k(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            f50701eqxt = new C0656k(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            f50698d2ok = new C0656k(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f50712lvui = new C0656k(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, fn3e.C0647g.class);
            f3943r = new C0656k(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, fn3e.C0650q.class);
            f50700dd = new C0656k(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            f50723x9kr = new C0656k(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            f50715ncyb = new C0656k(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            f3940l = new C0656k(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        }

        public C0656k(int i2, CharSequence charSequence) {
            this(null, i2, charSequence, null, null);
        }

        public boolean equals(@dd Object obj) {
            if (obj == null || !(obj instanceof C0656k)) {
                return false;
            }
            C0656k c0656k = (C0656k) obj;
            Object obj2 = this.f3948k;
            return obj2 == null ? c0656k.f3948k == null : obj2.equals(c0656k.f3948k);
        }

        public int hashCode() {
            Object obj = this.f3948k;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: k */
        public C0656k m3063k(CharSequence charSequence, fn3e fn3eVar) {
            return new C0656k(null, this.f50725toq, charSequence, fn3eVar, this.f50726zy);
        }

        @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: q */
        public boolean m3064q(View view, Bundle bundle) {
            fn3e.AbstractC0648k abstractC0648kNewInstance;
            if (this.f3949q == null) {
                return false;
            }
            fn3e.AbstractC0648k abstractC0648k = null;
            Class<? extends fn3e.AbstractC0648k> cls = this.f50726zy;
            if (cls != null) {
                try {
                    abstractC0648kNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    abstractC0648kNewInstance.m3016k(bundle);
                    abstractC0648k = abstractC0648kNewInstance;
                } catch (Exception e3) {
                    e = e3;
                    abstractC0648k = abstractC0648kNewInstance;
                    Class<? extends fn3e.AbstractC0648k> cls2 = this.f50726zy;
                    Log.e(f3941n, "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                }
            }
            return this.f3949q.perform(view, abstractC0648k);
        }

        public int toq() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f3948k).getId();
        }

        public CharSequence zy() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f3948k).getLabel();
        }

        @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public C0656k(int i2, CharSequence charSequence, fn3e fn3eVar) {
            this(null, i2, charSequence, fn3eVar, null);
        }

        C0656k(Object obj) {
            this(obj, 0, null, null, null);
        }

        private C0656k(int i2, CharSequence charSequence, Class<? extends fn3e.AbstractC0648k> cls) {
            this(null, i2, charSequence, null, cls);
        }

        C0656k(Object obj, int i2, CharSequence charSequence, fn3e fn3eVar, Class<? extends fn3e.AbstractC0648k> cls) {
            this.f50725toq = i2;
            this.f3949q = fn3eVar;
            if (obj == null) {
                this.f3948k = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            } else {
                this.f3948k = obj;
            }
            this.f50726zy = cls;
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.accessibility.ki$q */
    /* JADX INFO: compiled from: AccessibilityNodeInfoCompat.java */
    public static class C0658q {

        /* JADX INFO: renamed from: q */
        public static final int f3951q = 2;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final int f50727toq = 0;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final int f50728zy = 1;

        /* JADX INFO: renamed from: k */
        final Object f3952k;

        C0658q(Object obj) {
            this.f3952k = obj;
        }

        /* JADX INFO: renamed from: n */
        public static C0658q m3066n(int i2, float f2, float f3, float f4) {
            return new C0658q(AccessibilityNodeInfo.RangeInfo.obtain(i2, f2, f3, f4));
        }

        /* JADX INFO: renamed from: k */
        public float m3067k() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f3952k).getCurrent();
        }

        /* JADX INFO: renamed from: q */
        public int m3068q() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f3952k).getType();
        }

        public float toq() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f3952k).getMax();
        }

        public float zy() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f3952k).getMin();
        }
    }

    /* JADX INFO: compiled from: AccessibilityNodeInfoCompat.java */
    public static class toq {

        /* JADX INFO: renamed from: q */
        public static final int f3953q = 2;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final int f50729toq = 0;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final int f50730zy = 1;

        /* JADX INFO: renamed from: k */
        final Object f3954k;

        toq(Object obj) {
            this.f3954k = obj;
        }

        /* JADX INFO: renamed from: g */
        public static toq m3069g(int i2, int i3, boolean z2, int i4) {
            return new toq(AccessibilityNodeInfo.CollectionInfo.obtain(i2, i3, z2, i4));
        }

        /* JADX INFO: renamed from: n */
        public static toq m3070n(int i2, int i3, boolean z2) {
            return new toq(AccessibilityNodeInfo.CollectionInfo.obtain(i2, i3, z2));
        }

        /* JADX INFO: renamed from: k */
        public int m3071k() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f3954k).getColumnCount();
        }

        /* JADX INFO: renamed from: q */
        public boolean m3072q() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f3954k).isHierarchical();
        }

        public int toq() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f3954k).getRowCount();
        }

        public int zy() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f3954k).getSelectionMode();
        }
    }

    /* JADX INFO: compiled from: AccessibilityNodeInfoCompat.java */
    public static class zy {

        /* JADX INFO: renamed from: k */
        final Object f3955k;

        zy(Object obj) {
            this.f3955k = obj;
        }

        public static zy f7l8(int i2, int i3, int i4, int i5, boolean z2) {
            return new zy(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, z2));
        }

        /* JADX INFO: renamed from: y */
        public static zy m3073y(int i2, int i3, int i4, int i5, boolean z2, boolean z3) {
            return new zy(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, z2, z3));
        }

        /* JADX INFO: renamed from: g */
        public boolean m3074g() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f3955k).isSelected();
        }

        /* JADX INFO: renamed from: k */
        public int m3075k() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f3955k).getColumnIndex();
        }

        @Deprecated
        /* JADX INFO: renamed from: n */
        public boolean m3076n() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f3955k).isHeading();
        }

        /* JADX INFO: renamed from: q */
        public int m3077q() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f3955k).getRowSpan();
        }

        public int toq() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f3955k).getColumnSpan();
        }

        public int zy() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f3955k).getRowIndex();
        }
    }

    @Deprecated
    public ki(Object obj) {
        this.f3936k = (AccessibilityNodeInfo) obj;
    }

    /* JADX INFO: renamed from: d */
    public static ki m3038d() {
        return r25n(AccessibilityNodeInfo.obtain());
    }

    private int ek5k(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                if (clickableSpan.equals(sparseArray.valueAt(i2).get())) {
                    return sparseArray.keyAt(i2);
                }
            }
        }
        int i3 = f50691y9n;
        f50691y9n = i3 + 1;
        return i3;
    }

    static ki ew(Object obj) {
        if (obj != null) {
            return new ki(obj);
        }
        return null;
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public static ClickableSpan[] fu4(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private void gbni(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayN5r1 = n5r1(view);
        if (sparseArrayN5r1 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < sparseArrayN5r1.size(); i2++) {
                if (sparseArrayN5r1.valueAt(i2).get() == null) {
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                sparseArrayN5r1.remove(((Integer) arrayList.get(i3)).intValue());
            }
        }
    }

    private void i9jn(int i2, boolean z2) {
        Bundle bundleJk = jk();
        if (bundleJk != null) {
            int i3 = bundleJk.getInt(f3934y, 0) & (~i2);
            if (!z2) {
                i2 = 0;
            }
            bundleJk.putInt(f3934y, i2 | i3);
        }
    }

    private boolean ki(int i2) {
        Bundle bundleJk = jk();
        return bundleJk != null && (bundleJk.getInt(f3934y, 0) & i2) == i2;
    }

    private static String kja0(int i2) {
        if (i2 == 1) {
            return "ACTION_FOCUS";
        }
        if (i2 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i2) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionImeEnter:
                return "ACTION_IME_ENTER";
            default:
                switch (i2) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i2) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    private SparseArray<WeakReference<ClickableSpan>> lvui(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayN5r1 = n5r1(view);
        if (sparseArrayN5r1 != null) {
            return sparseArrayN5r1;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(C7400k.n.f42557m, sparseArray);
        return sparseArray;
    }

    /* JADX INFO: renamed from: m */
    private boolean m3039m() {
        return !m3041s(f3929p).isEmpty();
    }

    public static ki mu(View view) {
        return r25n(AccessibilityNodeInfo.obtain(view));
    }

    /* JADX INFO: renamed from: n */
    private void m3040n(ClickableSpan clickableSpan, Spanned spanned, int i2) {
        m3041s(f3929p).add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m3041s(f50673ld6).add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m3041s(f50689x2).add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m3041s(f3932s).add(Integer.valueOf(i2));
    }

    private SparseArray<WeakReference<ClickableSpan>> n5r1(View view) {
        return (SparseArray) view.getTag(C7400k.n.f42557m);
    }

    public static ki qkj8(ki kiVar) {
        return r25n(AccessibilityNodeInfo.obtain(kiVar.f3936k));
    }

    public static ki r25n(@lvui AccessibilityNodeInfo accessibilityNodeInfo) {
        return new ki(accessibilityNodeInfo);
    }

    /* JADX INFO: renamed from: s */
    private List<Integer> m3041s(String str) {
        ArrayList<Integer> integerArrayList = this.f3936k.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f3936k.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public static ki vq(View view, int i2) {
        return ew(AccessibilityNodeInfo.obtain(view, i2));
    }

    /* JADX INFO: renamed from: y */
    private void m3042y() {
        this.f3936k.getExtras().remove(f3929p);
        this.f3936k.getExtras().remove(f50673ld6);
        this.f3936k.getExtras().remove(f50689x2);
        this.f3936k.getExtras().remove(f3932s);
    }

    /* JADX INFO: renamed from: a */
    public boolean m3043a() {
        return this.f3936k.isDismissable();
    }

    public void a5id(int i2, int i3) {
        this.f3936k.setTextSelection(i2, i3);
    }

    @dd
    public CharSequence a9() {
        return this.f3936k.getHintText();
    }

    public boolean a98o() {
        return this.f3936k.isContextClickable();
    }

    /* JADX INFO: renamed from: b */
    public boolean m3044b() {
        return this.f3936k.isChecked();
    }

    public void b3e(boolean z2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3936k.setHeading(z2);
        } else {
            i9jn(2, z2);
        }
    }

    public void b8(boolean z2) {
        this.f3936k.setVisibleToUser(z2);
    }

    public void b9ub(String str) {
        this.f3936k.setViewIdResourceName(str);
    }

    public void bap7(boolean z2) {
        this.f3936k.setSelected(z2);
    }

    public void bek6(@dd CharSequence charSequence) {
        this.f3936k.setHintText(charSequence);
    }

    public boolean bf2() {
        return this.f3936k.isClickable();
    }

    public boolean bo() {
        return this.f3936k.isMultiLine();
    }

    public void bwp(boolean z2) {
        this.f3936k.setContextClickable(z2);
    }

    public void bz2(boolean z2) {
        this.f3936k.setEnabled(z2);
    }

    /* JADX INFO: renamed from: c */
    public int m3045c() {
        return this.f3936k.getTextSelectionEnd();
    }

    public boolean c8jq() {
        return Build.VERSION.SDK_INT >= 28 ? this.f3936k.isScreenReaderFocusable() : ki(1);
    }

    @lvui
    public List<String> cdj() {
        return this.f3936k.getAvailableExtraData();
    }

    public void cfr(boolean z2) {
        this.f3936k.setClickable(z2);
    }

    public boolean ch() {
        return this.f3936k.isFocusable();
    }

    public void cnbm(View view, int i2) {
        this.f3936k.setTraversalBefore(view, i2);
    }

    public void cv06(boolean z2) {
        this.f3936k.setImportantForAccessibility(z2);
    }

    public int d2ok() {
        return this.f3936k.getMovementGranularities();
    }

    public ki d3() {
        return ew(this.f3936k.getLabeledBy());
    }

    public boolean d8wk(C0656k c0656k) {
        return this.f3936k.removeAction((AccessibilityNodeInfo.AccessibilityAction) c0656k.f3948k);
    }

    @dd
    public CharSequence dd() {
        return Build.VERSION.SDK_INT >= 28 ? this.f3936k.getPaneTitle() : this.f3936k.getExtras().getCharSequence(f3927n);
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public void m28242do(int i2) {
        this.f3936k.setMovementGranularities(i2);
    }

    public boolean dr() {
        return this.f3936k.isSelected();
    }

    public void dxef(CharSequence charSequence) {
        this.f3936k.setText(charSequence);
    }

    /* JADX INFO: renamed from: e */
    public ki m3046e() {
        return ew(this.f3936k.getTraversalAfter());
    }

    public void e5(@dd CharSequence charSequence) {
        if (C0582k.m2731y()) {
            this.f3936k.setStateDescription(charSequence);
        } else {
            this.f3936k.getExtras().putCharSequence(f50678n7h, charSequence);
        }
    }

    public void ebn(CharSequence charSequence) {
        this.f3936k.setPackageName(charSequence);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ki)) {
            return false;
        }
        ki kiVar = (ki) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3936k;
        if (accessibilityNodeInfo == null) {
            if (kiVar.f3936k != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(kiVar.f3936k)) {
            return false;
        }
        return this.f50695zy == kiVar.f50695zy && this.f50694toq == kiVar.f50694toq;
    }

    public int eqxt() {
        return this.f3936k.getMaxTextLength();
    }

    public void etdu(boolean z2) {
        this.f3936k.setChecked(z2);
    }

    /* JADX INFO: renamed from: f */
    public CharSequence m3047f() {
        if (!m3039m()) {
            return this.f3936k.getText();
        }
        List<Integer> listM3041s = m3041s(f3929p);
        List<Integer> listM3041s2 = m3041s(f50673ld6);
        List<Integer> listM3041s3 = m3041s(f50689x2);
        List<Integer> listM3041s4 = m3041s(f3932s);
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f3936k.getText(), 0, this.f3936k.getText().length()));
        for (int i2 = 0; i2 < listM3041s.size(); i2++) {
            spannableString.setSpan(new C0655k(listM3041s4.get(i2).intValue(), this, jk().getInt(f50684qrj)), listM3041s.get(i2).intValue(), listM3041s2.get(i2).intValue(), listM3041s3.get(i2).intValue());
        }
        return spannableString;
    }

    public boolean f7l8() {
        return this.f3936k.canOpenPopup();
    }

    public ki fn3e(int i2) {
        return ew(this.f3936k.getChild(i2));
    }

    public boolean fnq8(int i2) {
        return this.f3936k.performAction(i2);
    }

    @Deprecated
    public Object fti() {
        return this.f3936k;
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: g */
    public void m3048g(CharSequence charSequence, View view) {
    }

    public boolean g1(View view) {
        return this.f3936k.removeChild(view);
    }

    public void ga(View view, int i2) {
        this.f50695zy = i2;
        this.f3936k.setSource(view, i2);
    }

    public void gc3c(int i2) {
        this.f3936k.setDrawingOrder(i2);
    }

    public void gcp(@lvui C0657n c0657n) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3936k.setTouchDelegateInfo(c0657n.f3950k);
        }
    }

    public ki gvn7() {
        return ew(this.f3936k.getLabelFor());
    }

    public boolean gyi() {
        return this.f3936k.isScrollable();
    }

    /* JADX INFO: renamed from: h */
    public int m3049h() {
        return this.f3936k.getActions();
    }

    public void h4b(boolean z2) {
        this.f3936k.setShowingHintText(z2);
    }

    public void h7am(int i2) {
        this.f3936k.setInputType(i2);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3936k;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public String hb() {
        return this.f3936k.getViewIdResourceName();
    }

    @dd
    public CharSequence hyr() {
        return C0582k.m2731y() ? this.f3936k.getStateDescription() : this.f3936k.getExtras().getCharSequence(f50678n7h);
    }

    /* JADX INFO: renamed from: i */
    public void m3050i(Rect rect) {
        this.f3936k.getBoundsInScreen(rect);
    }

    public boolean i1() {
        return this.f3936k.isContentInvalid();
    }

    public void ij(View view) {
        this.f50694toq = -1;
        this.f3936k.setParent(view);
    }

    public boolean ikck() {
        return this.f3936k.isVisibleToUser();
    }

    public void ixz(int i2) {
        this.f3936k.setMaxTextLength(i2);
    }

    /* JADX INFO: renamed from: j */
    public zurt m3051j() {
        return zurt.ki(this.f3936k.getWindow());
    }

    public void jbh(View view) {
        this.f3936k.setLabeledBy(view);
    }

    public Bundle jk() {
        return this.f3936k.getExtras();
    }

    public int jp0y() {
        return this.f3936k.getInputType();
    }

    public void jz5(boolean z2) {
        this.f3936k.setFocusable(z2);
    }

    /* JADX INFO: renamed from: k */
    public void m3052k(int i2) {
        this.f3936k.addAction(i2);
    }

    public void kcsr(boolean z2) {
        this.f3936k.setContentInvalid(z2);
    }

    public void ktq(boolean z2) {
        this.f3936k.setFocused(z2);
    }

    @dd
    /* JADX INFO: renamed from: l */
    public CharSequence m3053l() {
        return this.f3936k.getExtras().getCharSequence(f3930q);
    }

    public List<ki> ld6(String str) {
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByViewId = this.f3936k.findAccessibilityNodeInfosByViewId(str);
        ArrayList arrayList = new ArrayList();
        Iterator<AccessibilityNodeInfo> it = listFindAccessibilityNodeInfosByViewId.iterator();
        while (it.hasNext()) {
            arrayList.add(r25n(it.next()));
        }
        return arrayList;
    }

    public void lh(boolean z2) {
        this.f3936k.setScrollable(z2);
    }

    public int lrht() {
        return this.f3936k.getTextSelectionStart();
    }

    @Deprecated
    public void ltg8(Rect rect) {
        this.f3936k.setBoundsInParent(rect);
    }

    public boolean lv5() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f3936k.isHeading();
        }
        if (ki(2)) {
            return true;
        }
        zy zyVarO1t = o1t();
        return zyVarO1t != null && zyVarO1t.m3076n();
    }

    public void lw(@dd CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3936k.setTooltipText(charSequence);
        } else {
            this.f3936k.getExtras().putCharSequence(f3921g, charSequence);
        }
    }

    public void m4(boolean z2) {
        this.f3936k.setCanOpenPopup(z2);
    }

    public void m58i(View view) {
        this.f3936k.setTraversalBefore(view);
    }

    public void mbx(View view, int i2) {
        this.f3936k.setLabelFor(view, i2);
    }

    public CharSequence mcp() {
        return this.f3936k.getError();
    }

    public void n2t(C0658q c0658q) {
        this.f3936k.setRangeInfo((AccessibilityNodeInfo.RangeInfo) c0658q.f3952k);
    }

    public List<C0656k> n7h() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f3936k.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C0656k(actionList.get(i2)));
        }
        return arrayList;
    }

    public C0658q ncyb() {
        AccessibilityNodeInfo.RangeInfo rangeInfo = this.f3936k.getRangeInfo();
        if (rangeInfo != null) {
            return new C0658q(rangeInfo);
        }
        return null;
    }

    public void ngy(boolean z2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3936k.setScreenReaderFocusable(z2);
        } else {
            i9jn(1, z2);
        }
    }

    public CharSequence ni7() {
        return this.f3936k.getClassName();
    }

    public AccessibilityNodeInfo nme() {
        return this.f3936k;
    }

    public boolean nmn5() {
        return this.f3936k.isFocused();
    }

    public ki nn86() {
        return ew(this.f3936k.getTraversalBefore());
    }

    public void nsb(View view, int i2) {
        this.f50694toq = i2;
        this.f3936k.setParent(view, i2);
    }

    /* JADX INFO: renamed from: o */
    public int m3054o() {
        return this.f3936k.getWindowId();
    }

    public void o05(View view, int i2) {
        this.f3936k.setTraversalAfter(view, i2);
    }

    public zy o1t() {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = this.f3936k.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            return new zy(collectionItemInfo);
        }
        return null;
    }

    public int oc() {
        return this.f3936k.getLiveRegion();
    }

    public void oki(View view) {
        this.f3936k.setTraversalAfter(view);
    }

    /* JADX INFO: renamed from: p */
    public List<ki> m3055p(String str) {
        ArrayList arrayList = new ArrayList();
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByText = this.f3936k.findAccessibilityNodeInfosByText(str);
        int size = listFindAccessibilityNodeInfosByText.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(r25n(listFindAccessibilityNodeInfosByText.get(i2)));
        }
        return arrayList;
    }

    public void pc(@dd CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3936k.setPaneTitle(charSequence);
        } else {
            this.f3936k.getExtras().putCharSequence(f3927n, charSequence);
        }
    }

    public void pjz9(@dd CharSequence charSequence) {
        this.f3936k.getExtras().putCharSequence(f3930q, charSequence);
    }

    public void py(@lvui List<String> list) {
        this.f3936k.setAvailableExtraData(list);
    }

    /* JADX INFO: renamed from: q */
    public void m3056q(View view, int i2) {
        this.f3936k.addChild(view, i2);
    }

    public boolean qo(int i2, Bundle bundle) {
        return this.f3936k.performAction(i2, bundle);
    }

    public ki qrj(int i2) {
        return ew(this.f3936k.focusSearch(i2));
    }

    /* JADX INFO: renamed from: r */
    public CharSequence m3057r() {
        return this.f3936k.getPackageName();
    }

    public void r8s8(Rect rect) {
        this.f3936k.setBoundsInScreen(rect);
    }

    public void se(boolean z2) {
        this.f3936k.setDismissable(z2);
    }

    public void sok(CharSequence charSequence) {
        this.f3936k.setClassName(charSequence);
    }

    /* JADX INFO: renamed from: t */
    public int m3058t() {
        return this.f3936k.getDrawingOrder();
    }

    public boolean t8iq() {
        return this.f3936k.isImportantForAccessibility();
    }

    @Deprecated
    public void t8r(Rect rect) {
        this.f3936k.getBoundsInParent(rect);
    }

    public void tfm() {
        this.f3936k.recycle();
    }

    @lvui
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        t8r(rect);
        sb.append("; boundsInParent: " + rect);
        m3050i(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(m3057r());
        sb.append("; className: ");
        sb.append(ni7());
        sb.append("; text: ");
        sb.append(m3047f());
        sb.append("; contentDescription: ");
        sb.append(wvg());
        sb.append("; viewId: ");
        sb.append(hb());
        sb.append("; checkable: ");
        sb.append(y9n());
        sb.append("; checked: ");
        sb.append(m3044b());
        sb.append("; focusable: ");
        sb.append(ch());
        sb.append("; focused: ");
        sb.append(nmn5());
        sb.append("; selected: ");
        sb.append(dr());
        sb.append("; clickable: ");
        sb.append(bf2());
        sb.append("; longClickable: ");
        sb.append(m3059u());
        sb.append("; enabled: ");
        sb.append(m3061x());
        sb.append("; password: ");
        sb.append(y2());
        sb.append("; scrollable: " + gyi());
        sb.append("; [");
        List<C0656k> listN7h = n7h();
        for (int i2 = 0; i2 < listN7h.size(); i2++) {
            C0656k c0656k = listN7h.get(i2);
            String strKja0 = kja0(c0656k.toq());
            if (strKja0.equals("ACTION_UNKNOWN") && c0656k.zy() != null) {
                strKja0 = c0656k.zy().toString();
            }
            sb.append(strKja0);
            if (i2 != listN7h.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void toq(C0656k c0656k) {
        this.f3936k.addAction((AccessibilityNodeInfo.AccessibilityAction) c0656k.f3948k);
    }

    /* JADX INFO: renamed from: u */
    public boolean m3059u() {
        return this.f3936k.isLongClickable();
    }

    public void uc(int i2) {
        this.f3936k.setLiveRegion(i2);
    }

    public void uj2j(CharSequence charSequence) {
        this.f3936k.setError(charSequence);
    }

    public void ukdy(boolean z2) {
        this.f3936k.setMultiLine(z2);
    }

    @dd
    public CharSequence uv6() {
        return Build.VERSION.SDK_INT >= 28 ? this.f3936k.getTooltipText() : this.f3936k.getExtras().getCharSequence(f3921g);
    }

    /* JADX INFO: renamed from: v */
    public boolean m3060v() {
        return Build.VERSION.SDK_INT >= 29 ? this.f3936k.isTextEntryKey() : ki(8);
    }

    public void v0af(boolean z2) {
        this.f3936k.setCheckable(z2);
    }

    public void vep5(View view) {
        this.f3936k.setLabelFor(view);
    }

    public void vy(boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3936k.setTextEntryKey(z2);
        } else {
            i9jn(8, z2);
        }
    }

    @dd
    public C0657n vyq() {
        AccessibilityNodeInfo$TouchDelegateInfo touchDelegateInfo;
        if (Build.VERSION.SDK_INT < 29 || (touchDelegateInfo = this.f3936k.getTouchDelegateInfo()) == null) {
            return null;
        }
        return new C0657n(touchDelegateInfo);
    }

    public void w831(Object obj) {
        this.f3936k.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((toq) obj).f3954k);
    }

    public boolean was(View view, int i2) {
        return this.f3936k.removeChild(view, i2);
    }

    public void wlev(View view) {
        this.f50695zy = -1;
        this.f3936k.setSource(view);
    }

    public boolean wo() {
        return this.f3936k.refresh();
    }

    public CharSequence wvg() {
        return this.f3936k.getContentDescription();
    }

    public void wx16(boolean z2) {
        this.f3936k.setLongClickable(z2);
    }

    /* JADX INFO: renamed from: x */
    public boolean m3061x() {
        return this.f3936k.isEnabled();
    }

    public ki x2(int i2) {
        return ew(this.f3936k.findFocus(i2));
    }

    public ki x9kr() {
        return ew(this.f3936k.getParent());
    }

    public boolean xwq3() {
        return this.f3936k.isShowingHintText();
    }

    public boolean y2() {
        return this.f3936k.isPassword();
    }

    public boolean y9n() {
        return this.f3936k.isCheckable();
    }

    public void yl(View view, int i2) {
        this.f3936k.setLabeledBy(view, i2);
    }

    public void yqrt(CharSequence charSequence) {
        this.f3936k.setContentDescription(charSequence);
    }

    public boolean yz() {
        return this.f3936k.isAccessibilityFocused();
    }

    /* JADX INFO: renamed from: z */
    public toq m3062z() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo = this.f3936k.getCollectionInfo();
        if (collectionInfo != null) {
            return new toq(collectionInfo);
        }
        return null;
    }

    public void z4(Object obj) {
        this.f3936k.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((zy) obj).f3955k);
    }

    public void zkd(boolean z2) {
        this.f3936k.setEditable(z2);
    }

    public boolean zp() {
        return this.f3936k.isEditable();
    }

    public void zsr0(boolean z2) {
        this.f3936k.setAccessibilityFocused(z2);
    }

    public int zurt() {
        return this.f3936k.getChildCount();
    }

    public void zwy(boolean z2) {
        this.f3936k.setPassword(z2);
    }

    public void zy(View view) {
        this.f3936k.addChild(view);
    }

    /* JADX INFO: renamed from: androidx.core.view.accessibility.ki$n */
    /* JADX INFO: compiled from: AccessibilityNodeInfoCompat.java */
    public static final class C0657n {

        /* JADX INFO: renamed from: k */
        final AccessibilityNodeInfo$TouchDelegateInfo f3950k;

        public C0657n(@lvui Map<Region, View> map) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f3950k = new AccessibilityNodeInfo$TouchDelegateInfo(map);
            } else {
                this.f3950k = null;
            }
        }

        @dd
        /* JADX INFO: renamed from: k */
        public Region m3065k(@a9(from = 0) int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                return this.f3950k.getRegionAt(i2);
            }
            return null;
        }

        @a9(from = 0)
        public int toq() {
            if (Build.VERSION.SDK_INT >= 29) {
                return this.f3950k.getRegionCount();
            }
            return 0;
        }

        @dd
        public ki zy(@lvui Region region) {
            AccessibilityNodeInfo targetForRegion;
            if (Build.VERSION.SDK_INT < 29 || (targetForRegion = this.f3950k.getTargetForRegion(region)) == null) {
                return null;
            }
            return ki.r25n(targetForRegion);
        }

        C0657n(@lvui AccessibilityNodeInfo$TouchDelegateInfo accessibilityNodeInfo$TouchDelegateInfo) {
            this.f3950k = accessibilityNodeInfo$TouchDelegateInfo;
        }
    }

    private ki(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f3936k = accessibilityNodeInfo;
    }
}
