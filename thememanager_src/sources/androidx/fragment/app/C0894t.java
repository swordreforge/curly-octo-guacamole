package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.C0247k;
import androidx.core.app.y2;
import androidx.core.view.C0683f;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC0714r;
import androidx.transition.C1212h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import zy.lvui;

/* JADX INFO: renamed from: androidx.fragment.app.t */
/* JADX INFO: compiled from: FragmentTransition.java */
/* JADX INFO: loaded from: classes.dex */
class C0894t {

    /* JADX INFO: renamed from: k */
    private static final int[] f4871k = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    static final jk f51533toq = new mcp();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    static final jk f51534zy = fu4();

    /* JADX INFO: renamed from: androidx.fragment.app.t$f7l8 */
    /* JADX INFO: compiled from: FragmentTransition.java */
    interface f7l8 {
        /* JADX INFO: renamed from: k */
        void mo4215k(@lvui Fragment fragment, @lvui androidx.core.os.zy zyVar);

        void toq(@lvui Fragment fragment, @lvui androidx.core.os.zy zyVar);
    }

    /* JADX INFO: renamed from: androidx.fragment.app.t$g */
    /* JADX INFO: compiled from: FragmentTransition.java */
    class g implements Runnable {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ y f4872g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ Fragment f4873h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ boolean f4874i;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ jk f4875k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ Object f4876n;

        /* JADX INFO: renamed from: p */
        final /* synthetic */ Fragment f4877p;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ C0247k f4878q;

        /* JADX INFO: renamed from: r */
        final /* synthetic */ Rect f4879r;

        /* JADX INFO: renamed from: s */
        final /* synthetic */ View f4880s;

        /* JADX INFO: renamed from: t */
        final /* synthetic */ Object f4881t;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ ArrayList f4882y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ ArrayList f4883z;

        g(jk jkVar, C0247k c0247k, Object obj, y yVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z2, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f4875k = jkVar;
            this.f4878q = c0247k;
            this.f4876n = obj;
            this.f4872g = yVar;
            this.f4882y = arrayList;
            this.f4880s = view;
            this.f4877p = fragment;
            this.f4873h = fragment2;
            this.f4874i = z2;
            this.f4883z = arrayList2;
            this.f4881t = obj2;
            this.f4879r = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0247k<String, View> c0247kM4342y = C0894t.m4342y(this.f4875k, this.f4878q, this.f4876n, this.f4872g);
            if (c0247kM4342y != null) {
                this.f4882y.addAll(c0247kM4342y.values());
                this.f4882y.add(this.f4880s);
            }
            C0894t.m4333g(this.f4877p, this.f4873h, this.f4874i, c0247kM4342y, false);
            Object obj = this.f4876n;
            if (obj != null) {
                this.f4875k.wvg(obj, this.f4883z, this.f4882y);
                View viewM4335i = C0894t.m4335i(c0247kM4342y, this.f4872g, this.f4881t, this.f4874i);
                if (viewM4335i != null) {
                    this.f4875k.ld6(viewM4335i, this.f4879r);
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.t$k */
    /* JADX INFO: compiled from: FragmentTransition.java */
    class k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ f7l8 f4884k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ androidx.core.os.zy f4885n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Fragment f4886q;

        k(f7l8 f7l8Var, Fragment fragment, androidx.core.os.zy zyVar) {
            this.f4884k = f7l8Var;
            this.f4886q = fragment;
            this.f4885n = zyVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4884k.mo4215k(this.f4886q, this.f4885n);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.t$n */
    /* JADX INFO: compiled from: FragmentTransition.java */
    class n implements Runnable {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ C0247k f4887g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Fragment f4888k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ boolean f4889n;

        /* JADX INFO: renamed from: p */
        final /* synthetic */ Rect f4890p;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Fragment f4891q;

        /* JADX INFO: renamed from: s */
        final /* synthetic */ jk f4892s;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ View f4893y;

        n(Fragment fragment, Fragment fragment2, boolean z2, C0247k c0247k, View view, jk jkVar, Rect rect) {
            this.f4888k = fragment;
            this.f4891q = fragment2;
            this.f4889n = z2;
            this.f4887g = c0247k;
            this.f4893y = view;
            this.f4892s = jkVar;
            this.f4890p = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0894t.m4333g(this.f4888k, this.f4891q, this.f4889n, this.f4887g, false);
            View view = this.f4893y;
            if (view != null) {
                this.f4892s.ld6(view, this.f4890p);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.t$q */
    /* JADX INFO: compiled from: FragmentTransition.java */
    class q implements Runnable {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ Fragment f4894g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ Object f4895h;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Object f4896k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ View f4897n;

        /* JADX INFO: renamed from: p */
        final /* synthetic */ ArrayList f4898p;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ jk f4899q;

        /* JADX INFO: renamed from: s */
        final /* synthetic */ ArrayList f4900s;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ ArrayList f4901y;

        q(Object obj, jk jkVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f4896k = obj;
            this.f4899q = jkVar;
            this.f4897n = view;
            this.f4894g = fragment;
            this.f4901y = arrayList;
            this.f4900s = arrayList2;
            this.f4898p = arrayList3;
            this.f4895h = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f4896k;
            if (obj != null) {
                this.f4899q.mo4285h(obj, this.f4897n);
                this.f4900s.addAll(C0894t.ld6(this.f4899q, this.f4896k, this.f4894g, this.f4901y, this.f4897n));
            }
            if (this.f4898p != null) {
                if (this.f4895h != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f4897n);
                    this.f4899q.cdj(this.f4895h, this.f4898p, arrayList);
                }
                this.f4898p.clear();
                this.f4898p.add(this.f4897n);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.t$toq */
    /* JADX INFO: compiled from: FragmentTransition.java */
    class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ArrayList f4902k;

        toq(ArrayList arrayList) {
            this.f4902k = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0894t.m4341t(this.f4902k, 4);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.t$y */
    /* JADX INFO: compiled from: FragmentTransition.java */
    static class y {

        /* JADX INFO: renamed from: g */
        public C0884k f4903g;

        /* JADX INFO: renamed from: k */
        public Fragment f4904k;

        /* JADX INFO: renamed from: n */
        public boolean f4905n;

        /* JADX INFO: renamed from: q */
        public Fragment f4906q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public boolean f51535toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public C0884k f51536zy;

        y() {
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.t$zy */
    /* JADX INFO: compiled from: FragmentTransition.java */
    class zy implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ f7l8 f4907k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ androidx.core.os.zy f4908n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Fragment f4909q;

        zy(f7l8 f7l8Var, Fragment fragment, androidx.core.os.zy zyVar) {
            this.f4907k = f7l8Var;
            this.f4909q = fragment;
            this.f4908n = zyVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4907k.mo4215k(this.f4909q, this.f4908n);
        }
    }

    private C0894t() {
    }

    static String cdj(C0247k<String, String> c0247k, String str) {
        int size = c0247k.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (str.equals(c0247k.m873h(i2))) {
                return c0247k.ld6(i2);
            }
        }
        return null;
    }

    private static boolean f7l8(jk jkVar, List<Object> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!jkVar.mo4288n(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    private static Object fn3e(jk jkVar, Fragment fragment, Fragment fragment2, boolean z2) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return jkVar.mo4290t(jkVar.f7l8(z2 ? fragment2.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition()));
    }

    private static jk fu4() {
        try {
            return (jk) C1212h.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    static void m4333g(Fragment fragment, Fragment fragment2, boolean z2, C0247k<String, View> c0247k, boolean z3) {
        y2 enterTransitionCallback = z2 ? fragment2.getEnterTransitionCallback() : fragment.getEnterTransitionCallback();
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = c0247k == null ? 0 : c0247k.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(c0247k.ld6(i2));
                arrayList.add(c0247k.m873h(i2));
            }
            if (z3) {
                enterTransitionCallback.f7l8(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.m2134g(arrayList2, arrayList, null);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    private static y m4334h(y yVar, SparseArray<y> sparseArray, int i2) {
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y();
        sparseArray.put(i2, yVar2);
        return yVar2;
    }

    /* JADX INFO: renamed from: i */
    static View m4335i(C0247k<String, View> c0247k, y yVar, Object obj, boolean z2) {
        ArrayList<String> arrayList;
        C0884k c0884k = yVar.f51536zy;
        if (obj == null || c0247k == null || (arrayList = c0884k.f4848h) == null || arrayList.isEmpty()) {
            return null;
        }
        return c0247k.get(z2 ? c0884k.f4848h.get(0) : c0884k.f51517cdj.get(0));
    }

    static boolean jk() {
        return (f51533toq == null && f51534zy == null) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    private static void m4336k(ArrayList<View> arrayList, C0247k<String, View> c0247k, Collection<String> collection) {
        for (int size = c0247k.size() - 1; size >= 0; size--) {
            View viewM873h = c0247k.m873h(size);
            if (collection.contains(C0683f.gyi(viewM873h))) {
                arrayList.add(viewM873h);
            }
        }
    }

    private static Object ki(jk jkVar, Fragment fragment, boolean z2) {
        if (fragment == null) {
            return null;
        }
        return jkVar.f7l8(z2 ? fragment.getReenterTransition() : fragment.getEnterTransition());
    }

    private static void kja0(@lvui ViewGroup viewGroup, y yVar, View view, C0247k<String, String> c0247k, f7l8 f7l8Var) {
        Object obj;
        Fragment fragment = yVar.f4904k;
        Fragment fragment2 = yVar.f4906q;
        jk jkVarM4338p = m4338p(fragment2, fragment);
        if (jkVarM4338p == null) {
            return;
        }
        boolean z2 = yVar.f51535toq;
        boolean z3 = yVar.f4905n;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objKi = ki(jkVarM4338p, fragment, z2);
        Object objT8r = t8r(jkVarM4338p, fragment2, z3);
        Object objQrj = qrj(jkVarM4338p, viewGroup, view, c0247k, yVar, arrayList2, arrayList, objKi, objT8r);
        if (objKi == null && objQrj == null) {
            obj = objT8r;
            if (obj == null) {
                return;
            }
        } else {
            obj = objT8r;
        }
        ArrayList<View> arrayListLd6 = ld6(jkVarM4338p, obj, fragment2, arrayList2, view);
        ArrayList<View> arrayListLd62 = ld6(jkVarM4338p, objKi, fragment, arrayList, view);
        m4341t(arrayListLd62, 4);
        Object objZurt = zurt(jkVarM4338p, objKi, obj, objQrj, fragment, z2);
        if (fragment2 != null && arrayListLd6 != null && (arrayListLd6.size() > 0 || arrayList2.size() > 0)) {
            androidx.core.os.zy zyVar = new androidx.core.os.zy();
            f7l8Var.toq(fragment2, zyVar);
            jkVarM4338p.ni7(fragment2, objZurt, zyVar, new k(f7l8Var, fragment2, zyVar));
        }
        if (objZurt != null) {
            ni7(jkVarM4338p, obj, fragment2, arrayListLd6);
            ArrayList<String> arrayListKja0 = jkVarM4338p.kja0(arrayList);
            jkVarM4338p.mo4286i(objZurt, objKi, arrayListLd62, obj, arrayListLd6, objQrj, arrayList);
            jkVarM4338p.zy(viewGroup, objZurt);
            jkVarM4338p.m4291z(viewGroup, arrayList2, arrayList, arrayListKja0, c0247k);
            m4341t(arrayListLd62, 0);
            jkVarM4338p.wvg(objQrj, arrayList2, arrayList);
        }
    }

    static ArrayList<View> ld6(jk jkVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.getView();
        if (view2 != null) {
            jkVar.m4284g(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        jkVar.toq(obj, arrayList2);
        return arrayList2;
    }

    static void mcp(@lvui Context context, @lvui AbstractC0879g abstractC0879g, ArrayList<C0884k> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, boolean z2, f7l8 f7l8Var) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i4 = i2; i4 < i3; i4++) {
            C0884k c0884k = arrayList.get(i4);
            if (arrayList2.get(i4).booleanValue()) {
                m4337n(c0884k, sparseArray, z2);
            } else {
                zy(c0884k, sparseArray, z2);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i5 = 0; i5 < size; i5++) {
                int iKeyAt = sparseArray.keyAt(i5);
                C0247k<String, String> c0247kM4339q = m4339q(iKeyAt, arrayList, arrayList2, i2, i3);
                y yVar = (y) sparseArray.valueAt(i5);
                if (abstractC0879g.mo4180q() && (viewGroup = (ViewGroup) abstractC0879g.zy(iKeyAt)) != null) {
                    if (z2) {
                        kja0(viewGroup, yVar, view, c0247kM4339q, f7l8Var);
                    } else {
                        n7h(viewGroup, yVar, view, c0247kM4339q, f7l8Var);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m4337n(C0884k c0884k, SparseArray<y> sparseArray, boolean z2) {
        if (c0884k.f51489d2ok.ikck().mo4180q()) {
            for (int size = c0884k.f51527zy.size() - 1; size >= 0; size--) {
                toq(c0884k, c0884k.f51527zy.get(size), sparseArray, true, z2);
            }
        }
    }

    private static void n7h(@lvui ViewGroup viewGroup, y yVar, View view, C0247k<String, String> c0247k, f7l8 f7l8Var) {
        Object obj;
        Fragment fragment = yVar.f4904k;
        Fragment fragment2 = yVar.f4906q;
        jk jkVarM4338p = m4338p(fragment2, fragment);
        if (jkVarM4338p == null) {
            return;
        }
        boolean z2 = yVar.f51535toq;
        boolean z3 = yVar.f4905n;
        Object objKi = ki(jkVarM4338p, fragment, z2);
        Object objT8r = t8r(jkVarM4338p, fragment2, z3);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objX2 = x2(jkVarM4338p, viewGroup, view, c0247k, yVar, arrayList, arrayList2, objKi, objT8r);
        if (objKi == null && objX2 == null) {
            obj = objT8r;
            if (obj == null) {
                return;
            }
        } else {
            obj = objT8r;
        }
        ArrayList<View> arrayListLd6 = ld6(jkVarM4338p, obj, fragment2, arrayList, view);
        if (arrayListLd6 == null || arrayListLd6.isEmpty()) {
            obj = null;
        }
        Object obj2 = obj;
        jkVarM4338p.mo4287k(objKi, view);
        Object objZurt = zurt(jkVarM4338p, objKi, obj2, objX2, fragment, yVar.f51535toq);
        if (fragment2 != null && arrayListLd6 != null && (arrayListLd6.size() > 0 || arrayList.size() > 0)) {
            androidx.core.os.zy zyVar = new androidx.core.os.zy();
            f7l8Var.toq(fragment2, zyVar);
            jkVarM4338p.ni7(fragment2, objZurt, zyVar, new zy(f7l8Var, fragment2, zyVar));
        }
        if (objZurt != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            jkVarM4338p.mo4286i(objZurt, objKi, arrayList3, obj2, arrayListLd6, objX2, arrayList2);
            o1t(jkVarM4338p, viewGroup, fragment, view, arrayList2, objKi, arrayList3, obj2, arrayListLd6);
            jkVarM4338p.fu4(viewGroup, arrayList2, c0247k);
            jkVarM4338p.zy(viewGroup, objZurt);
            jkVarM4338p.t8r(viewGroup, arrayList2, c0247k);
        }
    }

    private static void ni7(jk jkVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            jkVar.ki(obj, fragment.getView(), arrayList);
            ViewTreeObserverOnPreDrawListenerC0714r.m3434k(fragment.mContainer, new toq(arrayList));
        }
    }

    private static void o1t(jk jkVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewTreeObserverOnPreDrawListenerC0714r.m3434k(viewGroup, new q(obj, jkVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    /* JADX INFO: renamed from: p */
    private static jk m4338p(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        jk jkVar = f51533toq;
        if (jkVar != null && f7l8(jkVar, arrayList)) {
            return jkVar;
        }
        jk jkVar2 = f51534zy;
        if (jkVar2 != null && f7l8(jkVar2, arrayList)) {
            return jkVar2;
        }
        if (jkVar == null && jkVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* JADX INFO: renamed from: q */
    private static C0247k<String, String> m4339q(int i2, ArrayList<C0884k> arrayList, ArrayList<Boolean> arrayList2, int i3, int i4) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C0247k<String, String> c0247k = new C0247k<>();
        for (int i5 = i4 - 1; i5 >= i3; i5--) {
            C0884k c0884k = arrayList.get(i5);
            if (c0884k.uv6(i2)) {
                boolean zBooleanValue = arrayList2.get(i5).booleanValue();
                ArrayList<String> arrayList5 = c0884k.f4848h;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (zBooleanValue) {
                        arrayList3 = c0884k.f4848h;
                        arrayList4 = c0884k.f51517cdj;
                    } else {
                        ArrayList<String> arrayList6 = c0884k.f4848h;
                        arrayList3 = c0884k.f51517cdj;
                        arrayList4 = arrayList6;
                    }
                    for (int i6 = 0; i6 < size; i6++) {
                        String str = arrayList4.get(i6);
                        String str2 = arrayList3.get(i6);
                        String strRemove = c0247k.remove(str2);
                        if (strRemove != null) {
                            c0247k.put(str, strRemove);
                        } else {
                            c0247k.put(str, str2);
                        }
                    }
                }
            }
        }
        return c0247k;
    }

    private static Object qrj(jk jkVar, ViewGroup viewGroup, View view, C0247k<String, String> c0247k, y yVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = yVar.f4904k;
        Fragment fragment2 = yVar.f4906q;
        if (fragment != null) {
            fragment.requireView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z2 = yVar.f51535toq;
        Object objFn3e = c0247k.isEmpty() ? null : fn3e(jkVar, fragment, fragment2, z2);
        C0247k<String, View> c0247kM4340s = m4340s(jkVar, c0247k, objFn3e, yVar);
        C0247k<String, View> c0247kM4342y = m4342y(jkVar, c0247k, objFn3e, yVar);
        if (c0247k.isEmpty()) {
            if (c0247kM4340s != null) {
                c0247kM4340s.clear();
            }
            if (c0247kM4342y != null) {
                c0247kM4342y.clear();
            }
            obj3 = null;
        } else {
            m4336k(arrayList, c0247kM4340s, c0247k.keySet());
            m4336k(arrayList2, c0247kM4342y, c0247k.values());
            obj3 = objFn3e;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m4333g(fragment, fragment2, z2, c0247kM4340s, true);
        if (obj3 != null) {
            arrayList2.add(view);
            jkVar.o1t(obj3, view, arrayList);
            wvg(jkVar, obj3, obj2, c0247kM4340s, yVar.f4905n, yVar.f4903g);
            Rect rect2 = new Rect();
            View viewM4335i = m4335i(c0247kM4342y, yVar, obj, z2);
            if (viewM4335i != null) {
                jkVar.fn3e(obj, rect2);
            }
            rect = rect2;
            view2 = viewM4335i;
        } else {
            view2 = null;
            rect = null;
        }
        ViewTreeObserverOnPreDrawListenerC0714r.m3434k(viewGroup, new n(fragment, fragment2, z2, c0247kM4342y, view2, jkVar, rect));
        return obj3;
    }

    /* JADX INFO: renamed from: s */
    private static C0247k<String, View> m4340s(jk jkVar, C0247k<String, String> c0247k, Object obj, y yVar) {
        y2 exitTransitionCallback;
        ArrayList<String> arrayList;
        if (c0247k.isEmpty() || obj == null) {
            c0247k.clear();
            return null;
        }
        Fragment fragment = yVar.f4906q;
        C0247k<String, View> c0247k2 = new C0247k<>();
        jkVar.m4289p(c0247k2, fragment.requireView());
        C0884k c0884k = yVar.f4903g;
        if (yVar.f4905n) {
            exitTransitionCallback = fragment.getEnterTransitionCallback();
            arrayList = c0884k.f51517cdj;
        } else {
            exitTransitionCallback = fragment.getExitTransitionCallback();
            arrayList = c0884k.f4848h;
        }
        if (arrayList != null) {
            c0247k2.fn3e(arrayList);
        }
        if (exitTransitionCallback != null) {
            exitTransitionCallback.m2136q(arrayList, c0247k2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = c0247k2.get(str);
                if (view == null) {
                    c0247k.remove(str);
                } else if (!str.equals(C0683f.gyi(view))) {
                    c0247k.put(C0683f.gyi(view), c0247k.remove(str));
                }
            }
        } else {
            c0247k.fn3e(c0247k2.keySet());
        }
        return c0247k2;
    }

    /* JADX INFO: renamed from: t */
    static void m4341t(ArrayList<View> arrayList, int i2) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i2);
        }
    }

    private static Object t8r(jk jkVar, Fragment fragment, boolean z2) {
        if (fragment == null) {
            return null;
        }
        return jkVar.f7l8(z2 ? fragment.getReturnTransition() : fragment.getExitTransition());
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void toq(androidx.fragment.app.C0884k r8, androidx.fragment.app.o1t.C0889k r9, android.util.SparseArray<androidx.fragment.app.C0894t.y> r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0894t.toq(androidx.fragment.app.k, androidx.fragment.app.o1t$k, android.util.SparseArray, boolean, boolean):void");
    }

    private static void wvg(jk jkVar, Object obj, Object obj2, C0247k<String, View> c0247k, boolean z2, C0884k c0884k) {
        ArrayList<String> arrayList = c0884k.f4848h;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = c0247k.get(z2 ? c0884k.f51517cdj.get(0) : c0884k.f4848h.get(0));
        jkVar.zurt(obj, view);
        if (obj2 != null) {
            jkVar.zurt(obj2, view);
        }
    }

    private static Object x2(jk jkVar, ViewGroup viewGroup, View view, C0247k<String, String> c0247k, y yVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object objFn3e;
        C0247k<String, String> c0247k2;
        Object obj3;
        Rect rect;
        Fragment fragment = yVar.f4904k;
        Fragment fragment2 = yVar.f4906q;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z2 = yVar.f51535toq;
        if (c0247k.isEmpty()) {
            c0247k2 = c0247k;
            objFn3e = null;
        } else {
            objFn3e = fn3e(jkVar, fragment, fragment2, z2);
            c0247k2 = c0247k;
        }
        C0247k<String, View> c0247kM4340s = m4340s(jkVar, c0247k2, objFn3e, yVar);
        if (c0247k.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(c0247kM4340s.values());
            obj3 = objFn3e;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m4333g(fragment, fragment2, z2, c0247kM4340s, true);
        if (obj3 != null) {
            rect = new Rect();
            jkVar.o1t(obj3, view, arrayList);
            wvg(jkVar, obj3, obj2, c0247kM4340s, yVar.f4905n, yVar.f4903g);
            if (obj != null) {
                jkVar.fn3e(obj, rect);
            }
        } else {
            rect = null;
        }
        ViewTreeObserverOnPreDrawListenerC0714r.m3434k(viewGroup, new g(jkVar, c0247k, obj3, yVar, arrayList2, view, fragment, fragment2, z2, arrayList, obj, rect));
        return obj3;
    }

    /* JADX INFO: renamed from: y */
    static C0247k<String, View> m4342y(jk jkVar, C0247k<String, String> c0247k, Object obj, y yVar) {
        y2 enterTransitionCallback;
        ArrayList<String> arrayList;
        String strCdj;
        Fragment fragment = yVar.f4904k;
        View view = fragment.getView();
        if (c0247k.isEmpty() || obj == null || view == null) {
            c0247k.clear();
            return null;
        }
        C0247k<String, View> c0247k2 = new C0247k<>();
        jkVar.m4289p(c0247k2, view);
        C0884k c0884k = yVar.f51536zy;
        if (yVar.f51535toq) {
            enterTransitionCallback = fragment.getExitTransitionCallback();
            arrayList = c0884k.f4848h;
        } else {
            enterTransitionCallback = fragment.getEnterTransitionCallback();
            arrayList = c0884k.f51517cdj;
        }
        if (arrayList != null) {
            c0247k2.fn3e(arrayList);
            c0247k2.fn3e(c0247k.values());
        }
        if (enterTransitionCallback != null) {
            enterTransitionCallback.m2136q(arrayList, c0247k2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view2 = c0247k2.get(str);
                if (view2 == null) {
                    String strCdj2 = cdj(c0247k, str);
                    if (strCdj2 != null) {
                        c0247k.remove(strCdj2);
                    }
                } else if (!str.equals(C0683f.gyi(view2)) && (strCdj = cdj(c0247k, str)) != null) {
                    c0247k.put(strCdj, C0683f.gyi(view2));
                }
            }
        } else {
            m4343z(c0247k, c0247k2);
        }
        return c0247k2;
    }

    /* JADX INFO: renamed from: z */
    static void m4343z(@lvui C0247k<String, String> c0247k, @lvui C0247k<String, View> c0247k2) {
        for (int size = c0247k.size() - 1; size >= 0; size--) {
            if (!c0247k2.containsKey(c0247k.m873h(size))) {
                c0247k.n7h(size);
            }
        }
    }

    private static Object zurt(jk jkVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z2) {
        return (obj == null || obj2 == null || fragment == null) ? true : z2 ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() ? jkVar.n7h(obj2, obj, obj3) : jkVar.qrj(obj2, obj, obj3);
    }

    public static void zy(C0884k c0884k, SparseArray<y> sparseArray, boolean z2) {
        int size = c0884k.f51527zy.size();
        for (int i2 = 0; i2 < size; i2++) {
            toq(c0884k, c0884k.f51527zy.get(i2), sparseArray, false, z2);
        }
    }
}
