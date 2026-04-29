package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0683f;
import androidx.core.view.ViewTreeObserverOnPreDrawListenerC0714r;
import androidx.core.view.t8iq;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: FragmentTransitionImpl.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public abstract class jk {

    /* JADX INFO: renamed from: androidx.fragment.app.jk$k */
    /* JADX INFO: compiled from: FragmentTransitionImpl.java */
    class RunnableC0882k implements Runnable {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ ArrayList f4792g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f4793k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ ArrayList f4794n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ ArrayList f4795q;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ ArrayList f4797y;

        RunnableC0882k(int i2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f4793k = i2;
            this.f4795q = arrayList;
            this.f4794n = arrayList2;
            this.f4792g = arrayList3;
            this.f4797y = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i2 = 0; i2 < this.f4793k; i2++) {
                C0683f.yp31((View) this.f4795q.get(i2), (String) this.f4794n.get(i2));
                C0683f.yp31((View) this.f4792g.get(i2), (String) this.f4797y.get(i2));
            }
        }
    }

    /* JADX INFO: compiled from: FragmentTransitionImpl.java */
    class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ArrayList f4798k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Map f4800q;

        toq(ArrayList arrayList, Map map) {
            this.f4798k = arrayList;
            this.f4800q = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f4798k.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) this.f4798k.get(i2);
                String strGyi = C0683f.gyi(view);
                if (strGyi != null) {
                    C0683f.yp31(view, jk.m4282s(this.f4800q, strGyi));
                }
            }
        }
    }

    /* JADX INFO: compiled from: FragmentTransitionImpl.java */
    class zy implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ArrayList f4801k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Map f4803q;

        zy(ArrayList arrayList, Map map) {
            this.f4801k = arrayList;
            this.f4803q = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f4801k.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = (View) this.f4801k.get(i2);
                C0683f.yp31(view, (String) this.f4803q.get(C0683f.gyi(view)));
            }
        }
    }

    /* JADX INFO: renamed from: q */
    protected static void m4281q(List<View> list, View view) {
        int size = list.size();
        if (m4283y(list, view, size)) {
            return;
        }
        if (C0683f.gyi(view) != null) {
            list.add(view);
        }
        for (int i2 = size; i2 < list.size(); i2++) {
            View view2 = list.get(i2);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    if (!m4283y(list, childAt, size) && C0683f.gyi(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    static String m4282s(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    protected static boolean x2(List list) {
        return list == null || list.isEmpty();
    }

    /* JADX INFO: renamed from: y */
    private static boolean m4283y(List<View> list, View view, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (list.get(i3) == view) {
                return true;
            }
        }
        return false;
    }

    public abstract void cdj(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object f7l8(Object obj);

    public abstract void fn3e(Object obj, Rect rect);

    void fu4(View view, ArrayList<View> arrayList, Map<String, String> map) {
        ViewTreeObserverOnPreDrawListenerC0714r.m3434k(view, new toq(arrayList, map));
    }

    /* JADX INFO: renamed from: g */
    void m4284g(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            if (!(view instanceof ViewGroup)) {
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (t8iq.zy(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                m4284g(arrayList, viewGroup.getChildAt(i2));
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo4285h(Object obj, View view);

    /* JADX INFO: renamed from: i */
    public abstract void mo4286i(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* JADX INFO: renamed from: k */
    public abstract void mo4287k(Object obj, View view);

    public abstract void ki(Object obj, View view, ArrayList<View> arrayList);

    ArrayList<String> kja0(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = arrayList.get(i2);
            arrayList2.add(C0683f.gyi(view));
            C0683f.yp31(view, null);
        }
        return arrayList2;
    }

    protected void ld6(View view, Rect rect) {
        if (C0683f.zsr0(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* JADX INFO: renamed from: n */
    public abstract boolean mo4288n(Object obj);

    public abstract Object n7h(Object obj, Object obj2, Object obj3);

    public void ni7(@lvui Fragment fragment, @lvui Object obj, @lvui androidx.core.os.zy zyVar, @lvui Runnable runnable) {
        runnable.run();
    }

    public abstract void o1t(Object obj, View view, ArrayList<View> arrayList);

    /* JADX INFO: renamed from: p */
    void m4289p(Map<String, View> map, @lvui View view) {
        if (view.getVisibility() == 0) {
            String strGyi = C0683f.gyi(view);
            if (strGyi != null) {
                map.put(strGyi, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    m4289p(map, viewGroup.getChildAt(i2));
                }
            }
        }
    }

    public abstract Object qrj(Object obj, Object obj2, Object obj3);

    /* JADX INFO: renamed from: t */
    public abstract Object mo4290t(Object obj);

    void t8r(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        ViewTreeObserverOnPreDrawListenerC0714r.m3434k(viewGroup, new zy(arrayList, map));
    }

    public abstract void toq(Object obj, ArrayList<View> arrayList);

    public abstract void wvg(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* JADX INFO: renamed from: z */
    void m4291z(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = arrayList.get(i2);
            String strGyi = C0683f.gyi(view2);
            arrayList4.add(strGyi);
            if (strGyi != null) {
                C0683f.yp31(view2, null);
                String str = map.get(strGyi);
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i3))) {
                        C0683f.yp31(arrayList2.get(i3), strGyi);
                        break;
                    }
                    i3++;
                }
            }
        }
        ViewTreeObserverOnPreDrawListenerC0714r.m3434k(view, new RunnableC0882k(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void zurt(Object obj, View view);

    public abstract void zy(ViewGroup viewGroup, Object obj);
}
