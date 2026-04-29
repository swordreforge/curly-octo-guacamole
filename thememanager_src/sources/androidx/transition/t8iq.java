package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.C1224k;
import androidx.transition.jk;
import androidx.transition.oc;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import zy.uv6;

/* JADX INFO: compiled from: Visibility.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class t8iq extends oc {
    private static final String bc = "android:visibility:screenLocation";
    public static final int bd = 2;
    public static final int bu = 1;
    private int bs;
    static final String k0 = "android:visibility:visibility";
    private static final String ar = "android:visibility:parent";
    private static final String[] tlhn = {k0, ar};

    /* JADX INFO: renamed from: androidx.transition.t8iq$k */
    /* JADX INFO: compiled from: Visibility.java */
    class C1247k extends d2ok {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ViewGroup f6768k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ View f6769n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ View f6770q;

        C1247k(ViewGroup viewGroup, View view, View view2) {
            this.f6768k = viewGroup;
            this.f6770q = view;
            this.f6769n = view2;
        }

        @Override // androidx.transition.d2ok, androidx.transition.oc.InterfaceC1241y
        /* JADX INFO: renamed from: k */
        public void mo5309k(@zy.lvui oc ocVar) {
            if (this.f6770q.getParent() == null) {
                C1194e.toq(this.f6768k).zy(this.f6770q);
            } else {
                t8iq.this.cancel();
            }
        }

        @Override // androidx.transition.d2ok, androidx.transition.oc.InterfaceC1241y
        /* JADX INFO: renamed from: q */
        public void mo5311q(@zy.lvui oc ocVar) {
            this.f6769n.setTag(jk.f7l8.f52623z4, null);
            C1194e.toq(this.f6768k).mo5306q(this.f6770q);
            ocVar.mo5320x(this);
        }

        @Override // androidx.transition.d2ok, androidx.transition.oc.InterfaceC1241y
        public void zy(@zy.lvui oc ocVar) {
            C1194e.toq(this.f6768k).mo5306q(this.f6770q);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.t8iq$q */
    /* JADX INFO: compiled from: Visibility.java */
    private static class C1248q {

        /* JADX INFO: renamed from: g */
        ViewGroup f6771g;

        /* JADX INFO: renamed from: k */
        boolean f6772k;

        /* JADX INFO: renamed from: n */
        ViewGroup f6773n;

        /* JADX INFO: renamed from: q */
        int f6774q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        boolean f53533toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f53534zy;

        C1248q() {
        }
    }

    /* JADX INFO: compiled from: Visibility.java */
    private static class toq extends AnimatorListenerAdapter implements oc.InterfaceC1241y, C1224k.k {

        /* JADX INFO: renamed from: g */
        private final boolean f6775g;

        /* JADX INFO: renamed from: k */
        private final View f6776k;

        /* JADX INFO: renamed from: n */
        private final ViewGroup f6777n;

        /* JADX INFO: renamed from: q */
        private final int f6778q;

        /* JADX INFO: renamed from: s */
        boolean f6779s = false;

        /* JADX INFO: renamed from: y */
        private boolean f6780y;

        toq(View view, int i2, boolean z2) {
            this.f6776k = view;
            this.f6778q = i2;
            this.f6777n = (ViewGroup) view.getParent();
            this.f6775g = z2;
            f7l8(true);
        }

        private void f7l8(boolean z2) {
            ViewGroup viewGroup;
            if (!this.f6775g || this.f6780y == z2 || (viewGroup = this.f6777n) == null) {
                return;
            }
            this.f6780y = z2;
            C1194e.m5324q(viewGroup, z2);
        }

        /* JADX INFO: renamed from: g */
        private void m5422g() {
            if (!this.f6779s) {
                C1231m.m5393s(this.f6776k, this.f6778q);
                ViewGroup viewGroup = this.f6777n;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f7l8(false);
        }

        @Override // androidx.transition.oc.InterfaceC1241y
        /* JADX INFO: renamed from: k */
        public void mo5309k(@zy.lvui oc ocVar) {
            f7l8(true);
        }

        @Override // androidx.transition.oc.InterfaceC1241y
        /* JADX INFO: renamed from: n */
        public void mo5310n(@zy.lvui oc ocVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6779s = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m5422g();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, androidx.transition.C1224k.k
        public void onAnimationPause(Animator animator) {
            if (this.f6779s) {
                return;
            }
            C1231m.m5393s(this.f6776k, this.f6778q);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, androidx.transition.C1224k.k
        public void onAnimationResume(Animator animator) {
            if (this.f6779s) {
                return;
            }
            C1231m.m5393s(this.f6776k, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // androidx.transition.oc.InterfaceC1241y
        /* JADX INFO: renamed from: q */
        public void mo5311q(@zy.lvui oc ocVar) {
            m5422g();
            ocVar.mo5320x(this);
        }

        @Override // androidx.transition.oc.InterfaceC1241y
        public void toq(@zy.lvui oc ocVar) {
        }

        @Override // androidx.transition.oc.InterfaceC1241y
        public void zy(@zy.lvui oc ocVar) {
            f7l8(false);
        }
    }

    /* JADX INFO: compiled from: Visibility.java */
    @SuppressLint({"UniqueConstants"})
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface zy {
    }

    public t8iq() {
        this.bs = 3;
    }

    private void fnq8(C1225l c1225l) {
        c1225l.f6686k.put(k0, Integer.valueOf(c1225l.f53502toq.getVisibility()));
        c1225l.f6686k.put(ar, c1225l.f53502toq.getParent());
        int[] iArr = new int[2];
        c1225l.f53502toq.getLocationOnScreen(iArr);
        c1225l.f6686k.put(bc, iArr);
    }

    private C1248q tfm(C1225l c1225l, C1225l c1225l2) {
        C1248q c1248q = new C1248q();
        c1248q.f6772k = false;
        c1248q.f53533toq = false;
        if (c1225l == null || !c1225l.f6686k.containsKey(k0)) {
            c1248q.f53534zy = -1;
            c1248q.f6773n = null;
        } else {
            c1248q.f53534zy = ((Integer) c1225l.f6686k.get(k0)).intValue();
            c1248q.f6773n = (ViewGroup) c1225l.f6686k.get(ar);
        }
        if (c1225l2 == null || !c1225l2.f6686k.containsKey(k0)) {
            c1248q.f6774q = -1;
            c1248q.f6771g = null;
        } else {
            c1248q.f6774q = ((Integer) c1225l2.f6686k.get(k0)).intValue();
            c1248q.f6771g = (ViewGroup) c1225l2.f6686k.get(ar);
        }
        if (c1225l != null && c1225l2 != null) {
            int i2 = c1248q.f53534zy;
            int i3 = c1248q.f6774q;
            if (i2 == i3 && c1248q.f6773n == c1248q.f6771g) {
                return c1248q;
            }
            if (i2 != i3) {
                if (i2 == 0) {
                    c1248q.f53533toq = false;
                    c1248q.f6772k = true;
                } else if (i3 == 0) {
                    c1248q.f53533toq = true;
                    c1248q.f6772k = true;
                }
            } else if (c1248q.f6771g == null) {
                c1248q.f53533toq = false;
                c1248q.f6772k = true;
            } else if (c1248q.f6773n == null) {
                c1248q.f53533toq = true;
                c1248q.f6772k = true;
            }
        } else if (c1225l == null && c1248q.f6774q == 0) {
            c1248q.f53533toq = true;
            c1248q.f6772k = true;
        } else if (c1225l2 == null && c1248q.f53534zy == 0) {
            c1248q.f53533toq = false;
            c1248q.f6772k = true;
        }
        return c1248q;
    }

    @Override // androidx.transition.oc
    public void cdj(@zy.lvui C1225l c1225l) {
        fnq8(c1225l);
    }

    @zy.dd
    public Animator d8wk(ViewGroup viewGroup, View view, C1225l c1225l, C1225l c1225l2) {
        return null;
    }

    @Override // androidx.transition.oc
    @zy.dd
    public Animator fu4(@zy.lvui ViewGroup viewGroup, @zy.dd C1225l c1225l, @zy.dd C1225l c1225l2) {
        C1248q c1248qTfm = tfm(c1225l, c1225l2);
        if (!c1248qTfm.f6772k) {
            return null;
        }
        if (c1248qTfm.f6773n == null && c1248qTfm.f6771g == null) {
            return null;
        }
        return c1248qTfm.f53533toq ? g1(viewGroup, c1225l, c1248qTfm.f53534zy, c1225l2, c1248qTfm.f6774q) : gbni(viewGroup, c1225l, c1248qTfm.f53534zy, c1225l2, c1248qTfm.f6774q);
    }

    @zy.dd
    public Animator g1(ViewGroup viewGroup, C1225l c1225l, int i2, C1225l c1225l2, int i3) {
        if ((this.bs & 1) != 1 || c1225l2 == null) {
            return null;
        }
        if (c1225l == null) {
            View view = (View) c1225l2.f53502toq.getParent();
            if (tfm(ncyb(view, false), hb(view, false)).f6772k) {
                return null;
            }
        }
        return d8wk(viewGroup, c1225l2.f53502toq, c1225l, c1225l2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008f A[PHI: r8
      0x008f: PHI (r8v3 android.view.View) = 
      (r8v2 android.view.View)
      (r8v2 android.view.View)
      (r8v2 android.view.View)
      (r8v2 android.view.View)
      (r8v2 android.view.View)
      (r8v2 android.view.View)
      (r8v6 android.view.View)
     binds: [B:26:0x0048, B:31:0x0057, B:36:0x007c, B:38:0x007f, B:40:0x0085, B:42:0x0089, B:34:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    @zy.dd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator gbni(android.view.ViewGroup r18, androidx.transition.C1225l r19, int r20, androidx.transition.C1225l r21, int r22) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.t8iq.gbni(android.view.ViewGroup, androidx.transition.l, int, androidx.transition.l, int):android.animation.Animator");
    }

    @Override // androidx.transition.oc
    /* JADX INFO: renamed from: i */
    public void mo5315i(@zy.lvui C1225l c1225l) {
        fnq8(c1225l);
    }

    @Override // androidx.transition.oc
    /* JADX INFO: renamed from: j */
    public boolean mo5410j(@zy.dd C1225l c1225l, @zy.dd C1225l c1225l2) {
        if (c1225l == null && c1225l2 == null) {
            return false;
        }
        if (c1225l != null && c1225l2 != null && c1225l2.f6686k.containsKey(k0) != c1225l.f6686k.containsKey(k0)) {
            return false;
        }
        C1248q c1248qTfm = tfm(c1225l, c1225l2);
        if (c1248qTfm.f6772k) {
            return c1248qTfm.f53534zy == 0 || c1248qTfm.f6774q == 0;
        }
        return false;
    }

    @Override // androidx.transition.oc
    @zy.dd
    public String[] nn86() {
        return tlhn;
    }

    public int qo() {
        return this.bs;
    }

    @zy.dd
    public Animator was(ViewGroup viewGroup, View view, C1225l c1225l, C1225l c1225l2) {
        return null;
    }

    public boolean wo(C1225l c1225l) {
        if (c1225l == null) {
            return false;
        }
        return ((Integer) c1225l.f6686k.get(k0)).intValue() == 0 && ((View) c1225l.f6686k.get(ar)) != null;
    }

    public void zsr0(int i2) {
        if ((i2 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.bs = i2;
    }

    @SuppressLint({"RestrictedApi"})
    public t8iq(@zy.lvui Context context, @zy.lvui AttributeSet attributeSet) {
        super(context, attributeSet);
        this.bs = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d3.f6377n);
        int iLd6 = androidx.core.content.res.kja0.ld6(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (iLd6 != 0) {
            zsr0(iLd6);
        }
    }
}
