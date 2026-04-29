package miuix.responsive.page.manager;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.fu4;
import androidx.lifecycle.gvn7;
import androidx.lifecycle.kja0;
import cn02.toq;
import com.xiaomi.onetrack.util.C5814z;
import d1ts.AbstractLayoutInflaterFactory2C5988k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kt06.C6752k;
import kt06.C6753n;
import kt06.C6754q;
import kz28.InterfaceC6758k;
import zy.dd;
import zy.lvui;
import zy.yz;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseResponseStateManager extends AbstractC7322k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    protected ArrayMap<Integer, C6754q> f90058f7l8;

    /* JADX INFO: renamed from: g */
    protected ArrayMap<View, List<C6754q>> f41593g;

    /* JADX INFO: renamed from: n */
    protected ArrayMap<View, zy> f41594n;

    /* JADX INFO: renamed from: q */
    protected InterfaceC6758k f41595q;

    /* JADX INFO: renamed from: s */
    protected ArrayMap<Integer, kz28.toq> f41596s;

    /* JADX INFO: renamed from: y */
    protected View f41597y;

    class ResponseLifecycleObserver implements fu4 {

        /* JADX INFO: renamed from: k */
        private BaseResponseStateManager f41598k;

        public ResponseLifecycleObserver(BaseResponseStateManager baseResponseStateManager) {
            this.f41598k = baseResponseStateManager;
        }

        @gvn7(kja0.toq.ON_CREATE)
        public void onCreate() {
        }

        @gvn7(kja0.toq.ON_DESTROY)
        public void onDestroy() {
            this.f41598k.kja0();
            this.f41598k = null;
        }
    }

    /* JADX INFO: renamed from: miuix.responsive.page.manager.BaseResponseStateManager$k */
    class C7321k extends AbstractLayoutInflaterFactory2C5988k {
        C7321k() {
        }

        @Override // d1ts.AbstractLayoutInflaterFactory2C5988k, android.view.LayoutInflater.Factory2
        @dd
        public View onCreateView(@dd View view, @lvui String str, @lvui Context context, @lvui AttributeSet attributeSet) {
            BaseResponseStateManager.this.fn3e(context, view, attributeSet, str);
            return super.onCreateView(view, str, context, attributeSet);
        }
    }

    class toq extends d1ts.toq {
        toq() {
        }

        @Override // d1ts.toq, android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (((ViewGroup) view).getChildCount() == 1) {
                BaseResponseStateManager.this.f90058f7l8.get(Integer.valueOf(view.getId())).f7l8(view);
            }
            List<C6754q> list = BaseResponseStateManager.this.f41593g.get(view);
            if (list != null && !list.isEmpty()) {
                for (C6754q c6754q : list) {
                    if (c6754q.m24684q() == view2.getId()) {
                        c6754q.f7l8(view2);
                    }
                }
            }
            super.onChildViewAdded(view, view2);
        }
    }

    class zy implements InterfaceC6758k<View> {

        /* JADX INFO: renamed from: k */
        private View f41602k;

        /* JADX INFO: renamed from: q */
        private kz28.toq f41604q;

        public zy(View view) {
            this.f41602k = view;
        }

        /* JADX INFO: renamed from: k */
        private void m26545k(Configuration configuration, C6753n c6753n, boolean z2) {
            List<C6754q> list = BaseResponseStateManager.this.f41593g.get(this.f41602k);
            kz28.toq toqVar = this.f41604q;
            if (toqVar == null || !toqVar.m24699k(configuration, c6753n, z2, list)) {
                int iM24682k = BaseResponseStateManager.this.f90058f7l8.get(Integer.valueOf(this.f41602k.getId())).m24682k();
                if (configuration == null) {
                    configuration = BaseResponseStateManager.this.f7l8().getResources().getConfiguration();
                }
                int i2 = configuration.orientation;
                if (list == null || list.isEmpty()) {
                    return;
                }
                if (C6752k.m24680k(i2, iM24682k)) {
                    Iterator<C6754q> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().m24683n(c6753n);
                    }
                } else {
                    Iterator<C6754q> it2 = list.iterator();
                    while (it2.hasNext()) {
                        View viewZy = it2.next().zy();
                        if (viewZy != null) {
                            viewZy.setVisibility(0);
                        }
                    }
                }
            }
        }

        @Override // kz28.InterfaceC6758k
        public kt06.toq getResponsiveState() {
            return null;
        }

        @Override // kz28.InterfaceC6758k
        public void onResponsiveLayout(Configuration configuration, C6753n c6753n, boolean z2) {
            m26545k(configuration, c6753n, z2);
        }

        @Override // kz28.InterfaceC6758k
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public View getResponsiveSubject() {
            return null;
        }

        public void zy(kz28.toq toqVar) {
            this.f41604q = toqVar;
        }
    }

    public BaseResponseStateManager(InterfaceC6758k interfaceC6758k) {
        this.f41595q = interfaceC6758k;
        if (interfaceC6758k.getResponsiveSubject() instanceof InterfaceC0954z) {
            zurt((InterfaceC0954z) this.f41595q.getResponsiveSubject());
        }
        this.f41594n = new ArrayMap<>();
        this.f41593g = new ArrayMap<>();
        this.f90058f7l8 = new ArrayMap<>();
        this.f41596s = new ArrayMap<>();
        d1ts.zy.m22229k(LayoutInflater.from(f7l8()), new C7321k());
        this.f90060toq = zy();
    }

    private void cdj(ViewGroup viewGroup) {
        viewGroup.setOnHierarchyChangeListener(new toq());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fn3e(@lvui Context context, @dd View view, @lvui AttributeSet attributeSet, String str) {
        int resourceId;
        if (this.f41597y == null) {
            this.f41597y = view;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.C1400p.f55796t8iq);
        if (str.split(C5814z.f32495a).length > 1 && kz28.toq.class.isAssignableFrom(miuix.reflect.toq.m26536k(str)) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(toq.C1400p.f7740u, -1)) != -1) {
            this.f41596s.put(Integer.valueOf(resourceId), null);
        }
        int integer = typedArrayObtainStyledAttributes.getInteger(toq.C1400p.f55762bo, 0);
        if (integer != 0) {
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(toq.C1400p.f7740u, -1);
            if (resourceId2 != -1) {
                C6754q c6754q = new C6754q(resourceId2);
                c6754q.m24681g(integer);
                this.f90058f7l8.put(Integer.valueOf(resourceId2), c6754q);
            }
        } else {
            int integer2 = typedArrayObtainStyledAttributes.getInteger(toq.C1400p.f55804y2, 0);
            if (integer2 != 0) {
                List<C6754q> arrayList = this.f41593g.get(view);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f41593g.put(view, arrayList);
                    qrj(view);
                    cdj((ViewGroup) view);
                }
                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(toq.C1400p.f7740u, -1);
                if (resourceId3 != -1) {
                    arrayList.add(new C6754q(resourceId3, integer2));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void qrj(View view) {
        this.f41594n.remove(view);
        this.f41594n.put(view, new zy(view));
        if (this.f90058f7l8.containsKey(Integer.valueOf(view.getId()))) {
            return;
        }
        C6754q c6754q = new C6754q(view.getId());
        c6754q.m24681g(3);
        this.f90058f7l8.put(Integer.valueOf(view.getId()), c6754q);
    }

    private void zurt(InterfaceC0954z interfaceC0954z) {
        interfaceC0954z.getLifecycle().mo4451k(new ResponseLifecycleObserver(this));
    }

    public void fu4() {
        zy();
    }

    /* JADX INFO: renamed from: h */
    public kt06.toq m26542h() {
        return this.f90060toq;
    }

    /* JADX INFO: renamed from: i */
    protected void m26543i() {
        kt06.zy.m24693k().m24694n(f7l8());
    }

    @Override // miuix.responsive.page.manager.AbstractC7322k
    /* JADX INFO: renamed from: k */
    public void mo26544k(Configuration configuration) {
        if (AbstractC7322k.m26548s()) {
            this.f90060toq = m26550q(configuration);
            m26549p(configuration);
            ki(configuration, this.f90060toq, !m26551y(this.f90060toq, this.f41605k));
        }
    }

    protected void ki(Configuration configuration, @dd kt06.toq toqVar, boolean z2) {
        C6753n c6753n = new C6753n();
        if (toqVar != null) {
            toqVar.ki(c6753n);
        }
        this.f41595q.dispatchResponsiveLayout(configuration, c6753n, z2);
        Iterator<View> it = this.f41594n.keySet().iterator();
        while (it.hasNext()) {
            zy zyVar = this.f41594n.get(it.next());
            if (zyVar != null) {
                zyVar.dispatchResponsiveLayout(configuration, c6753n, z2);
            }
        }
        for (Integer num : this.f41596s.keySet()) {
            kz28.toq toqVar2 = this.f41596s.get(num);
            if (toqVar2 == null) {
                toqVar2 = (kz28.toq) this.f41597y.findViewById(num.intValue());
                this.f41596s.put(num, toqVar2);
            }
            toqVar2.onResponsiveLayout(configuration, c6753n, z2);
        }
    }

    public void kja0() {
        m26543i();
        this.f41595q = null;
        this.f41594n.clear();
        this.f41593g.clear();
    }

    public void n7h(ViewGroup viewGroup, kz28.toq toqVar) {
        if (this.f41594n.containsKey(viewGroup)) {
            this.f41594n.get(viewGroup).zy(toqVar);
        }
    }

    @yz
    public void ni7(int i2) {
        C6753n c6753n = new C6753n();
        m26542h().ki(c6753n);
        c6753n.f82097zy = i2;
        this.f41595q.dispatchResponsiveLayout(null, c6753n, true);
        Iterator<View> it = this.f41594n.keySet().iterator();
        while (it.hasNext()) {
            zy zyVar = this.f41594n.get(it.next());
            if (zyVar != null) {
                zyVar.dispatchResponsiveLayout(null, c6753n, true);
            }
        }
    }

    public void t8r() {
        ki(null, this.f90060toq, false);
    }

    @Override // miuix.responsive.page.manager.AbstractC7322k
    public void toq(Configuration configuration) {
        if (AbstractC7322k.m26548s()) {
            this.f41605k.qrj(this.f90060toq);
            ld6(configuration);
        }
    }
}
