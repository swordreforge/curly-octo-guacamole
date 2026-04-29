package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.collection.C0247k;
import androidx.collection.C0252s;
import androidx.core.view.C0683f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import zy.InterfaceC7843t;
import zy.uv6;

/* JADX INFO: compiled from: Transition.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class oc implements Cloneable {
    private static final String ac = "name";
    private static final String ad = "id";
    private static final String am = "itemId";
    private static final int as = 1;
    private static final int ax = 4;
    public static final int az = 3;
    public static final int ba = 4;
    public static final int bg = 2;
    public static final int bl = 1;
    private static final String bq = "instance";
    private static final String id = "Transition";
    static final boolean in = false;

    /* JADX INFO: renamed from: a */
    private ArrayList<C1225l> f6733a;

    /* JADX INFO: renamed from: b */
    private ArrayList<C1225l> f6734b;
    AbstractC1244r bb;
    private AbstractC1237g bp;
    private C0247k<String, String> bv;
    private static final int[] ay = {2, 1, 3, 4};
    private static final o1t be = new C1238k();
    private static ThreadLocal<C0247k<Animator, C1240q>> aj = new ThreadLocal<>();

    /* JADX INFO: renamed from: k */
    private String f6743k = getClass().getName();

    /* JADX INFO: renamed from: q */
    private long f6749q = -1;

    /* JADX INFO: renamed from: n */
    long f6746n = -1;

    /* JADX INFO: renamed from: g */
    private TimeInterpolator f6739g = null;

    /* JADX INFO: renamed from: y */
    ArrayList<Integer> f6757y = new ArrayList<>();

    /* JADX INFO: renamed from: s */
    ArrayList<View> f6751s = new ArrayList<>();

    /* JADX INFO: renamed from: p */
    private ArrayList<String> f6748p = null;

    /* JADX INFO: renamed from: h */
    private ArrayList<Class<?>> f6740h = null;

    /* JADX INFO: renamed from: i */
    private ArrayList<Integer> f6741i = null;

    /* JADX INFO: renamed from: z */
    private ArrayList<View> f6758z = null;

    /* JADX INFO: renamed from: t */
    private ArrayList<Class<?>> f6752t = null;

    /* JADX INFO: renamed from: r */
    private ArrayList<String> f6750r = null;

    /* JADX INFO: renamed from: l */
    private ArrayList<Integer> f6744l = null;

    /* JADX INFO: renamed from: f */
    private ArrayList<View> f6738f = null;

    /* JADX INFO: renamed from: c */
    private ArrayList<Class<?>> f6735c = null;

    /* JADX INFO: renamed from: e */
    private n5r1 f6737e = new n5r1();

    /* JADX INFO: renamed from: j */
    private n5r1 f6742j = new n5r1();

    /* JADX INFO: renamed from: o */
    dd f6747o = null;

    /* JADX INFO: renamed from: m */
    private int[] f6745m = ay;

    /* JADX INFO: renamed from: x */
    boolean f6756x = false;

    /* JADX INFO: renamed from: u */
    ArrayList<Animator> f6753u = new ArrayList<>();

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private int f53528bo = 0;

    /* JADX INFO: renamed from: v */
    private boolean f6754v = false;

    /* JADX INFO: renamed from: d */
    private boolean f6736d = false;

    /* JADX INFO: renamed from: w */
    private ArrayList<InterfaceC1241y> f6755w = null;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private ArrayList<Animator> f53527ab = new ArrayList<>();
    private o1t an = be;

    /* JADX INFO: compiled from: Transition.java */
    @Retention(RetentionPolicy.SOURCE)
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface f7l8 {
    }

    /* JADX INFO: renamed from: androidx.transition.oc$g */
    /* JADX INFO: compiled from: Transition.java */
    public static abstract class AbstractC1237g {
        /* JADX INFO: renamed from: k */
        public abstract Rect mo5348k(@zy.lvui oc ocVar);
    }

    /* JADX INFO: renamed from: androidx.transition.oc$k */
    /* JADX INFO: compiled from: Transition.java */
    class C1238k extends o1t {
        C1238k() {
        }

        @Override // androidx.transition.o1t
        /* JADX INFO: renamed from: k */
        public Path mo5403k(float f2, float f3, float f4, float f5) {
            Path path = new Path();
            path.moveTo(f2, f3);
            path.lineTo(f4, f5);
            return path;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.oc$n */
    /* JADX INFO: compiled from: Transition.java */
    private static class C1239n {
        private C1239n() {
        }

        /* JADX INFO: renamed from: k */
        static <T> ArrayList<T> m5416k(ArrayList<T> arrayList, T t2) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(t2)) {
                arrayList.add(t2);
            }
            return arrayList;
        }

        static <T> ArrayList<T> toq(ArrayList<T> arrayList, T t2) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(t2);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.oc$q */
    /* JADX INFO: compiled from: Transition.java */
    private static class C1240q {

        /* JADX INFO: renamed from: k */
        View f6759k;

        /* JADX INFO: renamed from: n */
        oc f6760n;

        /* JADX INFO: renamed from: q */
        c8jq f6761q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        String f53529toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        C1225l f53530zy;

        C1240q(View view, String str, oc ocVar, c8jq c8jqVar, C1225l c1225l) {
            this.f6759k = view;
            this.f53529toq = str;
            this.f53530zy = c1225l;
            this.f6761q = c8jqVar;
            this.f6760n = ocVar;
        }
    }

    /* JADX INFO: compiled from: Transition.java */
    class toq extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ C0247k f6762k;

        toq(C0247k c0247k) {
            this.f6762k = c0247k;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6762k.remove(animator);
            oc.this.f6753u.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            oc.this.f6753u.add(animator);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.oc$y */
    /* JADX INFO: compiled from: Transition.java */
    public interface InterfaceC1241y {
        /* JADX INFO: renamed from: k */
        void mo5309k(@zy.lvui oc ocVar);

        /* JADX INFO: renamed from: n */
        void mo5310n(@zy.lvui oc ocVar);

        /* JADX INFO: renamed from: q */
        void mo5311q(@zy.lvui oc ocVar);

        void toq(@zy.lvui oc ocVar);

        void zy(@zy.lvui oc ocVar);
    }

    /* JADX INFO: compiled from: Transition.java */
    class zy extends AnimatorListenerAdapter {
        zy() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            oc.this.o1t();
            animator.removeListener(this);
        }
    }

    public oc() {
    }

    private static <T> ArrayList<T> a9(ArrayList<T> arrayList, T t2, boolean z2) {
        return t2 != null ? z2 ? C1239n.m5416k(arrayList, t2) : C1239n.toq(arrayList, t2) : arrayList;
    }

    private static int[] a98o(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i2 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strTrim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(strTrim)) {
                iArr[i2] = 3;
            } else if (bq.equalsIgnoreCase(strTrim)) {
                iArr[i2] = 1;
            } else if ("name".equalsIgnoreCase(strTrim)) {
                iArr[i2] = 2;
            } else if (am.equalsIgnoreCase(strTrim)) {
                iArr[i2] = 4;
            } else {
                if (!strTrim.isEmpty()) {
                    throw new InflateException("Unknown match type in matchOrder: '" + strTrim + "'");
                }
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i2);
                i2--;
                iArr = iArr2;
            }
            i2++;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    private void m5404b(C0247k<View, C1225l> c0247k, C0247k<View, C1225l> c0247k2, C0252s<View> c0252s, C0252s<View> c0252s2) {
        View viewN7h;
        int iJk = c0252s.jk();
        for (int i2 = 0; i2 < iJk; i2++) {
            View viewA9 = c0252s.a9(i2);
            if (viewA9 != null && m5412m(viewA9) && (viewN7h = c0252s2.n7h(c0252s.m877i(i2))) != null && m5412m(viewN7h)) {
                C1225l c1225l = c0247k.get(viewA9);
                C1225l c1225l2 = c0247k2.get(viewN7h);
                if (c1225l != null && c1225l2 != null) {
                    this.f6734b.add(c1225l);
                    this.f6733a.add(c1225l2);
                    c0247k.remove(viewA9);
                    c0247k2.remove(viewN7h);
                }
            }
        }
    }

    private void bf2(C0247k<View, C1225l> c0247k, C0247k<View, C1225l> c0247k2, C0247k<String, View> c0247k3, C0247k<String, View> c0247k4) {
        View view;
        int size = c0247k3.size();
        for (int i2 = 0; i2 < size; i2++) {
            View viewM873h = c0247k3.m873h(i2);
            if (viewM873h != null && m5412m(viewM873h) && (view = c0247k4.get(c0247k3.ld6(i2))) != null && m5412m(view)) {
                C1225l c1225l = c0247k.get(viewM873h);
                C1225l c1225l2 = c0247k2.get(view);
                if (c1225l != null && c1225l2 != null) {
                    this.f6734b.add(c1225l);
                    this.f6733a.add(c1225l2);
                    c0247k.remove(viewM873h);
                    c0247k2.remove(view);
                }
            }
        }
    }

    private void bo(Animator animator, C0247k<Animator, C1240q> c0247k) {
        if (animator != null) {
            animator.addListener(new toq(c0247k));
            kja0(animator);
        }
    }

    private static boolean ek5k(C1225l c1225l, C1225l c1225l2, String str) {
        Object obj = c1225l.f6686k.get(str);
        Object obj2 = c1225l2.f6686k.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    private ArrayList<View> eqxt(ArrayList<View> arrayList, View view, boolean z2) {
        return view != null ? z2 ? C1239n.m5416k(arrayList, view) : C1239n.toq(arrayList, view) : arrayList;
    }

    /* JADX INFO: renamed from: f */
    private static C0247k<Animator, C1240q> m5405f() {
        C0247k<Animator, C1240q> c0247k = aj.get();
        if (c0247k != null) {
            return c0247k;
        }
        C0247k<Animator, C1240q> c0247k2 = new C0247k<>();
        aj.set(c0247k2);
        return c0247k2;
    }

    private void i1(n5r1 n5r1Var, n5r1 n5r1Var2) {
        C0247k<View, C1225l> c0247k = new C0247k<>(n5r1Var.f6719k);
        C0247k<View, C1225l> c0247k2 = new C0247k<>(n5r1Var2.f6719k);
        int i2 = 0;
        while (true) {
            int[] iArr = this.f6745m;
            if (i2 >= iArr.length) {
                m5407s(c0247k, c0247k2);
                return;
            }
            int i3 = iArr[i2];
            if (i3 == 1) {
                y9n(c0247k, c0247k2);
            } else if (i3 == 2) {
                bf2(c0247k, c0247k2, n5r1Var.f6720q, n5r1Var2.f6720q);
            } else if (i3 == 3) {
                yz(c0247k, c0247k2, n5r1Var.f53516toq, n5r1Var2.f53516toq);
            } else if (i3 == 4) {
                m5404b(c0247k, c0247k2, n5r1Var.f53517zy, n5r1Var2.f53517zy);
            }
            i2++;
        }
    }

    private ArrayList<Integer> jk(ArrayList<Integer> arrayList, int i2, boolean z2) {
        return i2 > 0 ? z2 ? C1239n.m5416k(arrayList, Integer.valueOf(i2)) : C1239n.toq(arrayList, Integer.valueOf(i2)) : arrayList;
    }

    private void ki(View view, boolean z2) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.f6741i;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList<View> arrayList2 = this.f6758z;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.f6752t;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (this.f6752t.get(i2).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    C1225l c1225l = new C1225l(view);
                    if (z2) {
                        mo5315i(c1225l);
                    } else {
                        cdj(c1225l);
                    }
                    c1225l.f53503zy.add(this);
                    t8r(c1225l);
                    if (z2) {
                        qrj(this.f6737e, view, c1225l);
                    } else {
                        qrj(this.f6742j, view, c1225l);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.f6744l;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList<View> arrayList5 = this.f6738f;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.f6735c;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    if (this.f6735c.get(i3).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                                ki(viewGroup.getChildAt(i4), z2);
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean n7h(int[] iArr, int i2) {
        int i3 = iArr[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            if (iArr[i4] == i3) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    private static boolean m5406o(int i2) {
        return i2 >= 1 && i2 <= 4;
    }

    private ArrayList<Class<?>> oc(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z2) {
        return cls != null ? z2 ? C1239n.m5416k(arrayList, cls) : C1239n.toq(arrayList, cls) : arrayList;
    }

    private static void qrj(n5r1 n5r1Var, View view, C1225l c1225l) {
        n5r1Var.f6719k.put(view, c1225l);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (n5r1Var.f53516toq.indexOfKey(id2) >= 0) {
                n5r1Var.f53516toq.put(id2, null);
            } else {
                n5r1Var.f53516toq.put(id2, view);
            }
        }
        String strGyi = C0683f.gyi(view);
        if (strGyi != null) {
            if (n5r1Var.f6720q.containsKey(strGyi)) {
                n5r1Var.f6720q.put(strGyi, null);
            } else {
                n5r1Var.f6720q.put(strGyi, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (n5r1Var.f53517zy.cdj(itemIdAtPosition) < 0) {
                    C0683f.oki(view, true);
                    n5r1Var.f53517zy.fn3e(itemIdAtPosition, view);
                    return;
                }
                View viewN7h = n5r1Var.f53517zy.n7h(itemIdAtPosition);
                if (viewN7h != null) {
                    C0683f.oki(viewN7h, false);
                    n5r1Var.f53517zy.fn3e(itemIdAtPosition, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    private void m5407s(C0247k<View, C1225l> c0247k, C0247k<View, C1225l> c0247k2) {
        for (int i2 = 0; i2 < c0247k.size(); i2++) {
            C1225l c1225lM873h = c0247k.m873h(i2);
            if (m5412m(c1225lM873h.f53502toq)) {
                this.f6734b.add(c1225lM873h);
                this.f6733a.add(null);
            }
        }
        for (int i3 = 0; i3 < c0247k2.size(); i3++) {
            C1225l c1225lM873h2 = c0247k2.m873h(i3);
            if (m5412m(c1225lM873h2.f53502toq)) {
                this.f6733a.add(c1225lM873h2);
                this.f6734b.add(null);
            }
        }
    }

    private void y9n(C0247k<View, C1225l> c0247k, C0247k<View, C1225l> c0247k2) {
        C1225l c1225lRemove;
        for (int size = c0247k.size() - 1; size >= 0; size--) {
            View viewLd6 = c0247k.ld6(size);
            if (viewLd6 != null && m5412m(viewLd6) && (c1225lRemove = c0247k2.remove(viewLd6)) != null && m5412m(c1225lRemove.f53502toq)) {
                this.f6734b.add(c0247k.n7h(size));
                this.f6733a.add(c1225lRemove);
            }
        }
    }

    private void yz(C0247k<View, C1225l> c0247k, C0247k<View, C1225l> c0247k2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            View viewValueAt = sparseArray.valueAt(i2);
            if (viewValueAt != null && m5412m(viewValueAt) && (view = sparseArray2.get(sparseArray.keyAt(i2))) != null && m5412m(view)) {
                C1225l c1225l = c0247k.get(viewValueAt);
                C1225l c1225l2 = c0247k2.get(view);
                if (c1225l != null && c1225l2 != null) {
                    this.f6734b.add(c1225l);
                    this.f6733a.add(c1225l2);
                    c0247k.remove(viewValueAt);
                    c0247k2.remove(view);
                }
            }
        }
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: a */
    public void mo5312a(View view) {
        if (this.f6736d) {
            return;
        }
        for (int size = this.f6753u.size() - 1; size >= 0; size--) {
            C1224k.toq(this.f6753u.get(size));
        }
        ArrayList<InterfaceC1241y> arrayList = this.f6755w;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f6755w.clone();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((InterfaceC1241y) arrayList2.get(i2)).zy(this);
            }
        }
        this.f6754v = true;
    }

    /* JADX INFO: renamed from: c */
    public long m5408c() {
        return this.f6749q;
    }

    void c8jq(boolean z2) {
        this.f6756x = z2;
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    protected void cancel() {
        for (int size = this.f6753u.size() - 1; size >= 0; size--) {
            this.f6753u.get(size).cancel();
        }
        ArrayList<InterfaceC1241y> arrayList = this.f6755w;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.f6755w.clone();
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((InterfaceC1241y) arrayList2.get(i2)).mo5310n(this);
        }
    }

    public abstract void cdj(@zy.lvui C1225l c1225l);

    @zy.lvui
    public oc ch(@InterfaceC7843t int i2) {
        if (i2 != 0) {
            this.f6757y.remove(Integer.valueOf(i2));
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public void mo5313d(@zy.dd AbstractC1244r abstractC1244r) {
        this.bb = abstractC1244r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    void d2ok(ViewGroup viewGroup) {
        C0247k<Animator, C1240q> c0247kM5405f = m5405f();
        int size = c0247kM5405f.size();
        if (viewGroup == null || size == 0) {
            return;
        }
        c8jq c8jqVarM5392q = C1231m.m5392q(viewGroup);
        C0247k c0247k = new C0247k(c0247kM5405f);
        c0247kM5405f.clear();
        for (int i2 = size - 1; i2 >= 0; i2--) {
            C1240q c1240q = (C1240q) c0247k.m873h(i2);
            if (c1240q.f6759k != null && c8jqVarM5392q != null && c8jqVarM5392q.equals(c1240q.f6761q)) {
                ((Animator) c0247k.ld6(i2)).end();
            }
        }
    }

    @zy.lvui
    public oc d3(@zy.lvui String str, boolean z2) {
        this.f6750r = a9(this.f6750r, str, z2);
        return this;
    }

    @zy.dd
    public AbstractC1237g dd() {
        return this.bp;
    }

    public void dr(@zy.dd AbstractC1237g abstractC1237g) {
        this.bp = abstractC1237g;
    }

    @zy.lvui
    /* JADX INFO: renamed from: e */
    public List<View> m5409e() {
        return this.f6751s;
    }

    void fn3e(ViewGroup viewGroup, boolean z2) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        C0247k<String, String> c0247k;
        zurt(z2);
        if ((this.f6757y.size() > 0 || this.f6751s.size() > 0) && (((arrayList = this.f6748p) == null || arrayList.isEmpty()) && ((arrayList2 = this.f6740h) == null || arrayList2.isEmpty()))) {
            for (int i2 = 0; i2 < this.f6757y.size(); i2++) {
                View viewFindViewById = viewGroup.findViewById(this.f6757y.get(i2).intValue());
                if (viewFindViewById != null) {
                    C1225l c1225l = new C1225l(viewFindViewById);
                    if (z2) {
                        mo5315i(c1225l);
                    } else {
                        cdj(c1225l);
                    }
                    c1225l.f53503zy.add(this);
                    t8r(c1225l);
                    if (z2) {
                        qrj(this.f6737e, viewFindViewById, c1225l);
                    } else {
                        qrj(this.f6742j, viewFindViewById, c1225l);
                    }
                }
            }
            for (int i3 = 0; i3 < this.f6751s.size(); i3++) {
                View view = this.f6751s.get(i3);
                C1225l c1225l2 = new C1225l(view);
                if (z2) {
                    mo5315i(c1225l2);
                } else {
                    cdj(c1225l2);
                }
                c1225l2.f53503zy.add(this);
                t8r(c1225l2);
                if (z2) {
                    qrj(this.f6737e, view, c1225l2);
                } else {
                    qrj(this.f6742j, view, c1225l2);
                }
            }
        } else {
            ki(viewGroup, z2);
        }
        if (z2 || (c0247k = this.bv) == null) {
            return;
        }
        int size = c0247k.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList3.add(this.f6737e.f6720q.remove(this.bv.ld6(i4)));
        }
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = (View) arrayList3.get(i5);
            if (view2 != null) {
                this.f6737e.f6720q.put(this.bv.m873h(i5), view2);
            }
        }
    }

    @zy.lvui
    public oc fti(@InterfaceC7843t int i2, boolean z2) {
        this.f6741i = jk(this.f6741i, i2, z2);
        return this;
    }

    @zy.dd
    public Animator fu4(@zy.lvui ViewGroup viewGroup, @zy.dd C1225l c1225l, @zy.dd C1225l c1225l2) {
        return null;
    }

    @zy.lvui
    /* JADX INFO: renamed from: g */
    public oc mo5314g(@zy.lvui Class<?> cls) {
        if (this.f6740h == null) {
            this.f6740h = new ArrayList<>();
        }
        this.f6740h.add(cls);
        return this;
    }

    @zy.lvui
    public oc gvn7(@zy.lvui Class<?> cls, boolean z2) {
        this.f6752t = oc(this.f6752t, cls, z2);
        return this;
    }

    @zy.lvui
    public oc gyi(long j2) {
        this.f6746n = j2;
        return this;
    }

    @zy.dd
    public C1225l hb(@zy.lvui View view, boolean z2) {
        dd ddVar = this.f6747o;
        if (ddVar != null) {
            return ddVar.hb(view, z2);
        }
        return (z2 ? this.f6737e : this.f6742j).f6719k.get(view);
    }

    @zy.dd
    public AbstractC1244r hyr() {
        return this.bb;
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo5315i(@zy.lvui C1225l c1225l);

    public void ikck(@zy.dd o1t o1tVar) {
        if (o1tVar == null) {
            this.an = be;
        } else {
            this.an = o1tVar;
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean mo5410j(@zy.dd C1225l c1225l, @zy.dd C1225l c1225l2) {
        if (c1225l == null || c1225l2 == null) {
            return false;
        }
        String[] strArrNn86 = nn86();
        if (strArrNn86 == null) {
            Iterator<String> it = c1225l.f6686k.keySet().iterator();
            while (it.hasNext()) {
                if (ek5k(c1225l, c1225l2, it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrNn86) {
            if (!ek5k(c1225l, c1225l2, str)) {
            }
        }
        return false;
        return true;
    }

    @zy.lvui
    public oc jp0y(@zy.lvui View view, boolean z2) {
        this.f6758z = eqxt(this.f6758z, view, z2);
        return this;
    }

    @zy.lvui
    /* JADX INFO: renamed from: k */
    public oc mo5316k(@zy.lvui InterfaceC1241y interfaceC1241y) {
        if (this.f6755w == null) {
            this.f6755w = new ArrayList<>();
        }
        this.f6755w.add(interfaceC1241y);
        return this;
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    protected void kja0(Animator animator) {
        if (animator == null) {
            o1t();
            return;
        }
        if (lvui() >= 0) {
            animator.setDuration(lvui());
        }
        if (m5408c() >= 0) {
            animator.setStartDelay(m5408c() + animator.getStartDelay());
        }
        if (x9kr() != null) {
            animator.setInterpolator(x9kr());
        }
        animator.addListener(new zy());
        animator.start();
    }

    @zy.lvui
    /* JADX INFO: renamed from: l */
    public String m5411l() {
        return this.f6743k;
    }

    @zy.lvui
    public List<Integer> lrht() {
        return this.f6757y;
    }

    @zy.lvui
    public oc lv5(@zy.lvui Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.f6740h;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    public long lvui() {
        return this.f6746n;
    }

    /* JADX INFO: renamed from: m */
    boolean m5412m(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.f6741i;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f6758z;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f6752t;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.f6752t.get(i2).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f6750r != null && C0683f.gyi(view) != null && this.f6750r.contains(C0683f.gyi(view))) {
            return false;
        }
        if ((this.f6757y.size() == 0 && this.f6751s.size() == 0 && (((arrayList = this.f6740h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f6748p) == null || arrayList2.isEmpty()))) || this.f6757y.contains(Integer.valueOf(id2)) || this.f6751s.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f6748p;
        if (arrayList6 != null && arrayList6.contains(C0683f.gyi(view))) {
            return true;
        }
        if (this.f6740h != null) {
            for (int i3 = 0; i3 < this.f6740h.size(); i3++) {
                if (this.f6740h.get(i3).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    @zy.lvui
    public oc mcp(@zy.lvui Class<?> cls, boolean z2) {
        this.f6735c = oc(this.f6735c, cls, z2);
        return this;
    }

    @zy.lvui
    public oc mu(long j2) {
        this.f6749q = j2;
        return this;
    }

    @zy.lvui
    /* JADX INFO: renamed from: n */
    public oc mo5317n(@zy.lvui View view) {
        this.f6751s.add(view);
        return this;
    }

    @zy.lvui
    public o1t n5r1() {
        return this.an;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
    
        if (r3 < 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0030, code lost:
    
        if (r8 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
    
        r7 = r6.f6733a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0035, code lost:
    
        r7 = r6.f6734b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
    
        return r7.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.transition.C1225l ncyb(android.view.View r7, boolean r8) {
        /*
            r6 = this;
            androidx.transition.dd r0 = r6.f6747o
            if (r0 == 0) goto L9
            androidx.transition.l r7 = r0.ncyb(r7, r8)
            return r7
        L9:
            if (r8 == 0) goto Le
            java.util.ArrayList<androidx.transition.l> r0 = r6.f6734b
            goto L10
        Le:
            java.util.ArrayList<androidx.transition.l> r0 = r6.f6733a
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = -1
            r4 = 0
        L1a:
            if (r4 >= r2) goto L2e
            java.lang.Object r5 = r0.get(r4)
            androidx.transition.l r5 = (androidx.transition.C1225l) r5
            if (r5 != 0) goto L25
            return r1
        L25:
            android.view.View r5 = r5.f53502toq
            if (r5 != r7) goto L2b
            r3 = r4
            goto L2e
        L2b:
            int r4 = r4 + 1
            goto L1a
        L2e:
            if (r3 < 0) goto L3e
            if (r8 == 0) goto L35
            java.util.ArrayList<androidx.transition.l> r7 = r6.f6733a
            goto L37
        L35:
            java.util.ArrayList<androidx.transition.l> r7 = r6.f6734b
        L37:
            java.lang.Object r7 = r7.get(r3)
            r1 = r7
            androidx.transition.l r1 = (androidx.transition.C1225l) r1
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.oc.ncyb(android.view.View, boolean):androidx.transition.l");
    }

    @Override // 
    /* JADX INFO: renamed from: ni7, reason: merged with bridge method [inline-methods] */
    public oc clone() {
        try {
            oc ocVar = (oc) super.clone();
            ocVar.f53527ab = new ArrayList<>();
            ocVar.f6737e = new n5r1();
            ocVar.f6742j = new n5r1();
            ocVar.f6734b = null;
            ocVar.f6733a = null;
            return ocVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @zy.lvui
    public oc nmn5(@zy.lvui View view) {
        this.f6751s.remove(view);
        return this;
    }

    @zy.dd
    public String[] nn86() {
        return null;
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    protected void o1t() {
        int i2 = this.f53528bo - 1;
        this.f53528bo = i2;
        if (i2 == 0) {
            ArrayList<InterfaceC1241y> arrayList = this.f6755w;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f6755w.clone();
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((InterfaceC1241y) arrayList2.get(i3)).mo5311q(this);
                }
            }
            for (int i4 = 0; i4 < this.f6737e.f53517zy.jk(); i4++) {
                View viewA9 = this.f6737e.f53517zy.a9(i4);
                if (viewA9 != null) {
                    C0683f.oki(viewA9, false);
                }
            }
            for (int i5 = 0; i5 < this.f6742j.f53517zy.jk(); i5++) {
                View viewA92 = this.f6742j.f53517zy.a9(i5);
                if (viewA92 != null) {
                    C0683f.oki(viewA92, false);
                }
            }
            this.f6736d = true;
        }
    }

    @zy.lvui
    /* JADX INFO: renamed from: q */
    public oc mo5318q(@InterfaceC7843t int i2) {
        if (i2 != 0) {
            this.f6757y.add(Integer.valueOf(i2));
        }
        return this;
    }

    String qkj8(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f6746n != -1) {
            str2 = str2 + "dur(" + this.f6746n + ") ";
        }
        if (this.f6749q != -1) {
            str2 = str2 + "dly(" + this.f6749q + ") ";
        }
        if (this.f6739g != null) {
            str2 = str2 + "interp(" + this.f6739g + ") ";
        }
        if (this.f6757y.size() <= 0 && this.f6751s.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f6757y.size() > 0) {
            for (int i2 = 0; i2 < this.f6757y.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f6757y.get(i2);
            }
        }
        if (this.f6751s.size() > 0) {
            for (int i3 = 0; i3 < this.f6751s.size(); i3++) {
                if (i3 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f6751s.get(i3);
            }
        }
        return str3 + ")";
    }

    @zy.dd
    /* JADX INFO: renamed from: r */
    public Rect m5413r() {
        AbstractC1237g abstractC1237g = this.bp;
        if (abstractC1237g == null) {
            return null;
        }
        return abstractC1237g.mo5348k(this);
    }

    @zy.lvui
    /* JADX INFO: renamed from: t */
    public oc m5414t(@zy.lvui View view, boolean z2) {
        this.f6738f = eqxt(this.f6738f, view, z2);
        return this;
    }

    @zy.lvui
    public oc t8iq(@zy.lvui String str) {
        ArrayList<String> arrayList = this.f6748p;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    void t8r(C1225l c1225l) {
        String[] qVar;
        if (this.bb == null || c1225l.f6686k.isEmpty() || (qVar = this.bb.toq()) == null) {
            return;
        }
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= qVar.length) {
                z2 = true;
                break;
            } else if (!c1225l.f6686k.containsKey(qVar[i2])) {
                break;
            } else {
                i2++;
            }
        }
        if (z2) {
            return;
        }
        this.bb.mo5418k(c1225l);
    }

    public String toString() {
        return qkj8("");
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: u */
    public void mo5319u(View view) {
        if (this.f6754v) {
            if (!this.f6736d) {
                for (int size = this.f6753u.size() - 1; size >= 0; size--) {
                    C1224k.zy(this.f6753u.get(size));
                }
                ArrayList<InterfaceC1241y> arrayList = this.f6755w;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f6755w.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((InterfaceC1241y) arrayList2.get(i2)).mo5309k(this);
                    }
                }
            }
            this.f6754v = false;
        }
    }

    @zy.dd
    public List<String> uv6() {
        return this.f6748p;
    }

    /* JADX INFO: renamed from: v */
    public void m5415v(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.f6745m = ay;
            return;
        }
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (!m5406o(iArr[i2])) {
                throw new IllegalArgumentException("matches contains invalid value");
            }
            if (n7h(iArr, i2)) {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.f6745m = (int[]) iArr.clone();
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    protected void vq() {
        if (this.f53528bo == 0) {
            ArrayList<InterfaceC1241y> arrayList = this.f6755w;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f6755w.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((InterfaceC1241y) arrayList2.get(i2)).toq(this);
                }
            }
            this.f6736d = false;
        }
        this.f53528bo++;
    }

    @zy.dd
    public List<Class<?>> vyq() {
        return this.f6740h;
    }

    @zy.lvui
    public oc wvg(@InterfaceC7843t int i2, boolean z2) {
        this.f6744l = jk(this.f6744l, i2, z2);
        return this;
    }

    @zy.lvui
    /* JADX INFO: renamed from: x */
    public oc mo5320x(@zy.lvui InterfaceC1241y interfaceC1241y) {
        ArrayList<InterfaceC1241y> arrayList = this.f6755w;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(interfaceC1241y);
        if (this.f6755w.size() == 0) {
            this.f6755w = null;
        }
        return this;
    }

    @zy.dd
    public TimeInterpolator x9kr() {
        return this.f6739g;
    }

    @zy.lvui
    public oc xwq3(@zy.dd TimeInterpolator timeInterpolator) {
        this.f6739g = timeInterpolator;
        return this;
    }

    @zy.lvui
    /* JADX INFO: renamed from: y */
    public oc mo5321y(@zy.lvui String str) {
        if (this.f6748p == null) {
            this.f6748p = new ArrayList<>();
        }
        this.f6748p.add(str);
        return this;
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    protected void y2() {
        vq();
        C0247k<Animator, C1240q> c0247kM5405f = m5405f();
        for (Animator animator : this.f53527ab) {
            if (c0247kM5405f.containsKey(animator)) {
                vq();
                bo(animator, c0247kM5405f);
            }
        }
        this.f53527ab.clear();
        o1t();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    @zy.uv6({zy.uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void mo5322z(android.view.ViewGroup r20, androidx.transition.n5r1 r21, androidx.transition.n5r1 r22, java.util.ArrayList<androidx.transition.C1225l> r23, java.util.ArrayList<androidx.transition.C1225l> r24) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.oc.mo5322z(android.view.ViewGroup, androidx.transition.n5r1, androidx.transition.n5r1, java.util.ArrayList, java.util.ArrayList):void");
    }

    void zp(ViewGroup viewGroup) {
        C1240q c1240q;
        this.f6734b = new ArrayList<>();
        this.f6733a = new ArrayList<>();
        i1(this.f6737e, this.f6742j);
        C0247k<Animator, C1240q> c0247kM5405f = m5405f();
        int size = c0247kM5405f.size();
        c8jq c8jqVarM5392q = C1231m.m5392q(viewGroup);
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator animatorLd6 = c0247kM5405f.ld6(i2);
            if (animatorLd6 != null && (c1240q = c0247kM5405f.get(animatorLd6)) != null && c1240q.f6759k != null && c8jqVarM5392q.equals(c1240q.f6761q)) {
                C1225l c1225l = c1240q.f53530zy;
                View view = c1240q.f6759k;
                C1225l c1225lHb = hb(view, true);
                C1225l c1225lNcyb = ncyb(view, true);
                if (c1225lHb == null && c1225lNcyb == null) {
                    c1225lNcyb = this.f6742j.f6719k.get(view);
                }
                if (!(c1225lHb == null && c1225lNcyb == null) && c1240q.f6760n.mo5410j(c1225l, c1225lNcyb)) {
                    if (animatorLd6.isRunning() || animatorLd6.isStarted()) {
                        animatorLd6.cancel();
                    } else {
                        c0247kM5405f.remove(animatorLd6);
                    }
                }
            }
        }
        mo5322z(viewGroup, this.f6737e, this.f6742j, this.f6734b, this.f6733a);
        y2();
    }

    void zurt(boolean z2) {
        if (z2) {
            this.f6737e.f6719k.clear();
            this.f6737e.f53516toq.clear();
            this.f6737e.f53517zy.m880q();
        } else {
            this.f6742j.f6719k.clear();
            this.f6742j.f53516toq.clear();
            this.f6742j.f53517zy.m880q();
        }
    }

    @SuppressLint({"RestrictedApi"})
    public oc(@zy.lvui Context context, @zy.lvui AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d3.f52476zy);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long jLd6 = androidx.core.content.res.kja0.ld6(typedArrayObtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (jLd6 >= 0) {
            gyi(jLd6);
        }
        long jLd62 = androidx.core.content.res.kja0.ld6(typedArrayObtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (jLd62 > 0) {
            mu(jLd62);
        }
        int iX2 = androidx.core.content.res.kja0.x2(typedArrayObtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (iX2 > 0) {
            xwq3(AnimationUtils.loadInterpolator(context, iX2));
        }
        String strQrj = androidx.core.content.res.kja0.qrj(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (strQrj != null) {
            m5415v(a98o(strQrj));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
