package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.zy;
import androidx.fragment.app.Fragment;
import androidx.transition.oc;
import java.util.ArrayList;
import java.util.List;
import zy.uv6;

/* JADX INFO: renamed from: androidx.transition.h */
/* JADX INFO: compiled from: FragmentTransitionSupport.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
@zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class C1212h extends androidx.fragment.app.jk {

    /* JADX INFO: renamed from: androidx.transition.h$g */
    /* JADX INFO: compiled from: FragmentTransitionSupport.java */
    class g extends oc.AbstractC1237g {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Rect f6431k;

        g(Rect rect) {
            this.f6431k = rect;
        }

        @Override // androidx.transition.oc.AbstractC1237g
        /* JADX INFO: renamed from: k */
        public Rect mo5348k(@zy.lvui oc ocVar) {
            Rect rect = this.f6431k;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f6431k;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.h$k */
    /* JADX INFO: compiled from: FragmentTransitionSupport.java */
    class k extends oc.AbstractC1237g {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Rect f6432k;

        k(Rect rect) {
            this.f6432k = rect;
        }

        @Override // androidx.transition.oc.AbstractC1237g
        /* JADX INFO: renamed from: k */
        public Rect mo5348k(@zy.lvui oc ocVar) {
            return this.f6432k;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.h$n */
    /* JADX INFO: compiled from: FragmentTransitionSupport.java */
    class n implements oc.InterfaceC1241y {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Runnable f6433k;

        n(Runnable runnable) {
            this.f6433k = runnable;
        }

        @Override // androidx.transition.oc.InterfaceC1241y
        /* JADX INFO: renamed from: k */
        public void mo5309k(@zy.lvui oc ocVar) {
        }

        @Override // androidx.transition.oc.InterfaceC1241y
        /* JADX INFO: renamed from: n */
        public void mo5310n(@zy.lvui oc ocVar) {
        }

        @Override // androidx.transition.oc.InterfaceC1241y
        /* JADX INFO: renamed from: q */
        public void mo5311q(@zy.lvui oc ocVar) {
            this.f6433k.run();
        }

        @Override // androidx.transition.oc.InterfaceC1241y
        public void toq(@zy.lvui oc ocVar) {
        }

        @Override // androidx.transition.oc.InterfaceC1241y
        public void zy(@zy.lvui oc ocVar) {
        }
    }

    /* JADX INFO: renamed from: androidx.transition.h$q */
    /* JADX INFO: compiled from: FragmentTransitionSupport.java */
    class q implements zy.toq {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ oc f6435k;

        q(oc ocVar) {
            this.f6435k = ocVar;
        }

        @Override // androidx.core.os.zy.toq
        public void onCancel() {
            this.f6435k.cancel();
        }
    }

    /* JADX INFO: renamed from: androidx.transition.h$toq */
    /* JADX INFO: compiled from: FragmentTransitionSupport.java */
    class toq implements oc.InterfaceC1241y {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f6436k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ ArrayList f6438q;

        toq(View view, ArrayList arrayList) {
            this.f6436k = view;
            this.f6438q = arrayList;
        }

        @Override // androidx.transition.oc.InterfaceC1241y
        /* JADX INFO: renamed from: k */
        public void mo5309k(@zy.lvui oc ocVar) {
        }

        @Override // androidx.transition.oc.InterfaceC1241y
        /* JADX INFO: renamed from: n */
        public void mo5310n(@zy.lvui oc ocVar) {
        }

        @Override // androidx.transition.oc.InterfaceC1241y
        /* JADX INFO: renamed from: q */
        public void mo5311q(@zy.lvui oc ocVar) {
            ocVar.mo5320x(this);
            this.f6436k.setVisibility(8);
            int size = this.f6438q.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((View) this.f6438q.get(i2)).setVisibility(0);
            }
        }

        @Override // androidx.transition.oc.InterfaceC1241y
        public void toq(@zy.lvui oc ocVar) {
            ocVar.mo5320x(this);
            ocVar.mo5316k(this);
        }

        @Override // androidx.transition.oc.InterfaceC1241y
        public void zy(@zy.lvui oc ocVar) {
        }
    }

    /* JADX INFO: renamed from: androidx.transition.h$zy */
    /* JADX INFO: compiled from: FragmentTransitionSupport.java */
    class zy extends d2ok {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ ArrayList f6439g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Object f6440k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ Object f6441n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ ArrayList f6443q;

        /* JADX INFO: renamed from: s */
        final /* synthetic */ ArrayList f6444s;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Object f6445y;

        zy(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f6440k = obj;
            this.f6443q = arrayList;
            this.f6441n = obj2;
            this.f6439g = arrayList2;
            this.f6445y = obj3;
            this.f6444s = arrayList3;
        }

        @Override // androidx.transition.d2ok, androidx.transition.oc.InterfaceC1241y
        /* JADX INFO: renamed from: q */
        public void mo5311q(@zy.lvui oc ocVar) {
            ocVar.mo5320x(this);
        }

        @Override // androidx.transition.d2ok, androidx.transition.oc.InterfaceC1241y
        public void toq(@zy.lvui oc ocVar) {
            Object obj = this.f6440k;
            if (obj != null) {
                C1212h.this.cdj(obj, this.f6443q, null);
            }
            Object obj2 = this.f6441n;
            if (obj2 != null) {
                C1212h.this.cdj(obj2, this.f6439g, null);
            }
            Object obj3 = this.f6445y;
            if (obj3 != null) {
                C1212h.this.cdj(obj3, this.f6444s, null);
            }
        }
    }

    private static boolean mcp(oc ocVar) {
        return (androidx.fragment.app.jk.x2(ocVar.lrht()) && androidx.fragment.app.jk.x2(ocVar.uv6()) && androidx.fragment.app.jk.x2(ocVar.vyq())) ? false : true;
    }

    @Override // androidx.fragment.app.jk
    public void cdj(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        oc ocVar = (oc) obj;
        int i2 = 0;
        if (ocVar instanceof dd) {
            dd ddVar = (dd) ocVar;
            int iPy = ddVar.py();
            while (i2 < iPy) {
                cdj(ddVar.zsr0(i2), arrayList, arrayList2);
                i2++;
            }
            return;
        }
        if (mcp(ocVar)) {
            return;
        }
        List<View> listM5409e = ocVar.m5409e();
        if (listM5409e.size() == arrayList.size() && listM5409e.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i2 < size) {
                ocVar.mo5317n(arrayList2.get(i2));
                i2++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ocVar.nmn5(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.jk
    public Object f7l8(Object obj) {
        if (obj != null) {
            return ((oc) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.jk
    public void fn3e(Object obj, Rect rect) {
        if (obj != null) {
            ((oc) obj).dr(new g(rect));
        }
    }

    @Override // androidx.fragment.app.jk
    /* JADX INFO: renamed from: h */
    public void mo4285h(Object obj, View view) {
        if (obj != null) {
            ((oc) obj).nmn5(view);
        }
    }

    @Override // androidx.fragment.app.jk
    /* JADX INFO: renamed from: i */
    public void mo4286i(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((oc) obj).mo5316k(new zy(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.jk
    /* JADX INFO: renamed from: k */
    public void mo4287k(Object obj, View view) {
        if (obj != null) {
            ((oc) obj).mo5317n(view);
        }
    }

    @Override // androidx.fragment.app.jk
    public void ki(Object obj, View view, ArrayList<View> arrayList) {
        ((oc) obj).mo5316k(new toq(view, arrayList));
    }

    @Override // androidx.fragment.app.jk
    /* JADX INFO: renamed from: n */
    public boolean mo4288n(Object obj) {
        return obj instanceof oc;
    }

    @Override // androidx.fragment.app.jk
    public Object n7h(Object obj, Object obj2, Object obj3) {
        dd ddVar = new dd();
        if (obj != null) {
            ddVar.g1((oc) obj);
        }
        if (obj2 != null) {
            ddVar.g1((oc) obj2);
        }
        if (obj3 != null) {
            ddVar.g1((oc) obj3);
        }
        return ddVar;
    }

    @Override // androidx.fragment.app.jk
    public void ni7(@zy.lvui Fragment fragment, @zy.lvui Object obj, @zy.lvui androidx.core.os.zy zyVar, @zy.lvui Runnable runnable) {
        oc ocVar = (oc) obj;
        zyVar.m2782q(new q(ocVar));
        ocVar.mo5316k(new n(runnable));
    }

    @Override // androidx.fragment.app.jk
    public void o1t(Object obj, View view, ArrayList<View> arrayList) {
        dd ddVar = (dd) obj;
        List<View> listM5409e = ddVar.m5409e();
        listM5409e.clear();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            androidx.fragment.app.jk.m4281q(listM5409e, arrayList.get(i2));
        }
        listM5409e.add(view);
        arrayList.add(view);
        toq(ddVar, arrayList);
    }

    @Override // androidx.fragment.app.jk
    public Object qrj(Object obj, Object obj2, Object obj3) {
        oc ocVarW831 = (oc) obj;
        oc ocVar = (oc) obj2;
        oc ocVar2 = (oc) obj3;
        if (ocVarW831 != null && ocVar != null) {
            ocVarW831 = new dd().g1(ocVarW831).g1(ocVar).w831(1);
        } else if (ocVarW831 == null) {
            ocVarW831 = ocVar != null ? ocVar : null;
        }
        if (ocVar2 == null) {
            return ocVarW831;
        }
        dd ddVar = new dd();
        if (ocVarW831 != null) {
            ddVar.g1(ocVarW831);
        }
        ddVar.g1(ocVar2);
        return ddVar;
    }

    @Override // androidx.fragment.app.jk
    /* JADX INFO: renamed from: t */
    public Object mo4290t(Object obj) {
        if (obj == null) {
            return null;
        }
        dd ddVar = new dd();
        ddVar.g1((oc) obj);
        return ddVar;
    }

    @Override // androidx.fragment.app.jk
    public void toq(Object obj, ArrayList<View> arrayList) {
        oc ocVar = (oc) obj;
        if (ocVar == null) {
            return;
        }
        int i2 = 0;
        if (ocVar instanceof dd) {
            dd ddVar = (dd) ocVar;
            int iPy = ddVar.py();
            while (i2 < iPy) {
                toq(ddVar.zsr0(i2), arrayList);
                i2++;
            }
            return;
        }
        if (mcp(ocVar) || !androidx.fragment.app.jk.x2(ocVar.m5409e())) {
            return;
        }
        int size = arrayList.size();
        while (i2 < size) {
            ocVar.mo5317n(arrayList.get(i2));
            i2++;
        }
    }

    @Override // androidx.fragment.app.jk
    public void wvg(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        dd ddVar = (dd) obj;
        if (ddVar != null) {
            ddVar.m5409e().clear();
            ddVar.m5409e().addAll(arrayList2);
            cdj(ddVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.jk
    public void zurt(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            ld6(view, rect);
            ((oc) obj).dr(new k(rect));
        }
    }

    @Override // androidx.fragment.app.jk
    public void zy(ViewGroup viewGroup, Object obj) {
        lvui.toq(viewGroup, (oc) obj);
    }
}
