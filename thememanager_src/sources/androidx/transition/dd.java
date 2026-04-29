package androidx.transition;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.oc;
import java.util.ArrayList;
import java.util.Iterator;
import zy.InterfaceC7843t;
import zy.uv6;

/* JADX INFO: compiled from: TransitionSet.java */
/* JADX INFO: loaded from: classes.dex */
public class dd extends oc {
    private static final int bd = 1;
    private static final int tgs = 8;
    private static final int tlhn = 2;
    private static final int w97r = 4;
    public static final int yl25 = 0;
    public static final int zmmu = 1;
    int ar;
    boolean bc;
    private ArrayList<oc> bs;
    private int bu;
    private boolean k0;

    /* JADX INFO: renamed from: androidx.transition.dd$k */
    /* JADX INFO: compiled from: TransitionSet.java */
    class C1193k extends d2ok {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ oc f6397k;

        C1193k(oc ocVar) {
            this.f6397k = ocVar;
        }

        @Override // androidx.transition.d2ok, androidx.transition.oc.InterfaceC1241y
        /* JADX INFO: renamed from: q */
        public void mo5311q(@zy.lvui oc ocVar) {
            this.f6397k.y2();
            ocVar.mo5320x(this);
        }
    }

    /* JADX INFO: compiled from: TransitionSet.java */
    static class toq extends d2ok {

        /* JADX INFO: renamed from: k */
        dd f6399k;

        toq(dd ddVar) {
            this.f6399k = ddVar;
        }

        @Override // androidx.transition.d2ok, androidx.transition.oc.InterfaceC1241y
        /* JADX INFO: renamed from: q */
        public void mo5311q(@zy.lvui oc ocVar) {
            dd ddVar = this.f6399k;
            int i2 = ddVar.ar - 1;
            ddVar.ar = i2;
            if (i2 == 0) {
                ddVar.bc = false;
                ddVar.o1t();
            }
            ocVar.mo5320x(this);
        }

        @Override // androidx.transition.d2ok, androidx.transition.oc.InterfaceC1241y
        public void toq(@zy.lvui oc ocVar) {
            dd ddVar = this.f6399k;
            if (ddVar.bc) {
                return;
            }
            ddVar.vq();
            this.f6399k.bc = true;
        }
    }

    public dd() {
        this.bs = new ArrayList<>();
        this.k0 = true;
        this.bc = false;
        this.bu = 0;
    }

    private void was(@zy.lvui oc ocVar) {
        this.bs.add(ocVar);
        ocVar.f6747o = this;
    }

    private void yqrt() {
        toq toqVar = new toq(this);
        Iterator<oc> it = this.bs.iterator();
        while (it.hasNext()) {
            it.next().mo5316k(toqVar);
        }
        this.ar = this.bs.size();
    }

    @Override // androidx.transition.oc
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: a */
    public void mo5312a(View view) {
        super.mo5312a(view);
        int size = this.bs.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.bs.get(i2).mo5312a(view);
        }
    }

    @Override // androidx.transition.oc
    void c8jq(boolean z2) {
        super.c8jq(z2);
        int size = this.bs.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.bs.get(i2).c8jq(z2);
        }
    }

    @Override // androidx.transition.oc
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    protected void cancel() {
        super.cancel();
        int size = this.bs.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.bs.get(i2).cancel();
        }
    }

    @Override // androidx.transition.oc
    public void cdj(@zy.lvui C1225l c1225l) {
        if (m5412m(c1225l.f53502toq)) {
            for (oc ocVar : this.bs) {
                if (ocVar.m5412m(c1225l.f53502toq)) {
                    ocVar.cdj(c1225l);
                    c1225l.f53503zy.add(ocVar);
                }
            }
        }
    }

    @Override // androidx.transition.oc
    @zy.lvui
    /* JADX INFO: renamed from: cfr, reason: merged with bridge method [inline-methods] */
    public dd xwq3(@zy.dd TimeInterpolator timeInterpolator) {
        this.bu |= 1;
        ArrayList<oc> arrayList = this.bs;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.bs.get(i2).xwq3(timeInterpolator);
            }
        }
        return (dd) super.xwq3(timeInterpolator);
    }

    @Override // androidx.transition.oc
    /* JADX INFO: renamed from: d */
    public void mo5313d(AbstractC1244r abstractC1244r) {
        super.mo5313d(abstractC1244r);
        this.bu |= 2;
        int size = this.bs.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.bs.get(i2).mo5313d(abstractC1244r);
        }
    }

    @Override // androidx.transition.oc
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    void d2ok(ViewGroup viewGroup) {
        super.d2ok(viewGroup);
        int size = this.bs.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.bs.get(i2).d2ok(viewGroup);
        }
    }

    @Override // androidx.transition.oc
    @zy.lvui
    public oc d3(@zy.lvui String str, boolean z2) {
        for (int i2 = 0; i2 < this.bs.size(); i2++) {
            this.bs.get(i2).d3(str, z2);
        }
        return super.d3(str, z2);
    }

    @Override // androidx.transition.oc
    @zy.lvui
    /* JADX INFO: renamed from: d8wk, reason: merged with bridge method [inline-methods] */
    public dd mo5321y(@zy.lvui String str) {
        for (int i2 = 0; i2 < this.bs.size(); i2++) {
            this.bs.get(i2).mo5321y(str);
        }
        return (dd) super.mo5321y(str);
    }

    @Override // androidx.transition.oc
    public void dr(oc.AbstractC1237g abstractC1237g) {
        super.dr(abstractC1237g);
        this.bu |= 8;
        int size = this.bs.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.bs.get(i2).dr(abstractC1237g);
        }
    }

    @zy.lvui
    public dd etdu(@zy.lvui oc ocVar) {
        this.bs.remove(ocVar);
        ocVar.f6747o = null;
        return this;
    }

    @Override // androidx.transition.oc
    @zy.lvui
    /* JADX INFO: renamed from: fnq8, reason: merged with bridge method [inline-methods] */
    public dd mo5316k(@zy.lvui oc.InterfaceC1241y interfaceC1241y) {
        return (dd) super.mo5316k(interfaceC1241y);
    }

    @Override // androidx.transition.oc
    @zy.lvui
    public oc fti(int i2, boolean z2) {
        for (int i3 = 0; i3 < this.bs.size(); i3++) {
            this.bs.get(i3).fti(i2, z2);
        }
        return super.fti(i2, z2);
    }

    @zy.lvui
    public dd g1(@zy.lvui oc ocVar) {
        was(ocVar);
        long j2 = this.f6746n;
        if (j2 >= 0) {
            ocVar.gyi(j2);
        }
        if ((this.bu & 1) != 0) {
            ocVar.xwq3(x9kr());
        }
        if ((this.bu & 2) != 0) {
            ocVar.mo5313d(hyr());
        }
        if ((this.bu & 4) != 0) {
            ocVar.ikck(n5r1());
        }
        if ((this.bu & 8) != 0) {
            ocVar.dr(dd());
        }
        return this;
    }

    public int gbni() {
        return !this.k0 ? 1 : 0;
    }

    @Override // androidx.transition.oc
    @zy.lvui
    public oc gvn7(@zy.lvui Class<?> cls, boolean z2) {
        for (int i2 = 0; i2 < this.bs.size(); i2++) {
            this.bs.get(i2).gvn7(cls, z2);
        }
        return super.gvn7(cls, z2);
    }

    @Override // androidx.transition.oc
    /* JADX INFO: renamed from: i */
    public void mo5315i(@zy.lvui C1225l c1225l) {
        if (m5412m(c1225l.f53502toq)) {
            for (oc ocVar : this.bs) {
                if (ocVar.m5412m(c1225l.f53502toq)) {
                    ocVar.mo5315i(c1225l);
                    c1225l.f53503zy.add(ocVar);
                }
            }
        }
    }

    @Override // androidx.transition.oc
    @zy.lvui
    /* JADX INFO: renamed from: i9jn, reason: merged with bridge method [inline-methods] */
    public dd mo5320x(@zy.lvui oc.InterfaceC1241y interfaceC1241y) {
        return (dd) super.mo5320x(interfaceC1241y);
    }

    @Override // androidx.transition.oc
    public void ikck(o1t o1tVar) {
        super.ikck(o1tVar);
        this.bu |= 4;
        if (this.bs != null) {
            for (int i2 = 0; i2 < this.bs.size(); i2++) {
                this.bs.get(i2).ikck(o1tVar);
            }
        }
    }

    @Override // androidx.transition.oc
    @zy.lvui
    public oc jp0y(@zy.lvui View view, boolean z2) {
        for (int i2 = 0; i2 < this.bs.size(); i2++) {
            this.bs.get(i2).jp0y(view, z2);
        }
        return super.jp0y(view, z2);
    }

    @Override // androidx.transition.oc
    @zy.lvui
    /* JADX INFO: renamed from: ltg8, reason: merged with bridge method [inline-methods] */
    public dd ch(@InterfaceC7843t int i2) {
        for (int i3 = 0; i3 < this.bs.size(); i3++) {
            this.bs.get(i3).ch(i2);
        }
        return (dd) super.ch(i2);
    }

    @Override // androidx.transition.oc
    @zy.lvui
    /* JADX INFO: renamed from: m4, reason: merged with bridge method [inline-methods] */
    public dd lv5(@zy.lvui Class<?> cls) {
        for (int i2 = 0; i2 < this.bs.size(); i2++) {
            this.bs.get(i2).lv5(cls);
        }
        return (dd) super.lv5(cls);
    }

    @Override // androidx.transition.oc
    /* JADX INFO: renamed from: ni7 */
    public oc clone() {
        dd ddVar = (dd) super.clone();
        ddVar.bs = new ArrayList<>();
        int size = this.bs.size();
        for (int i2 = 0; i2 < size; i2++) {
            ddVar.was(this.bs.get(i2).clone());
        }
        return ddVar;
    }

    public int py() {
        return this.bs.size();
    }

    @Override // androidx.transition.oc
    String qkj8(String str) {
        String strQkj8 = super.qkj8(str);
        for (int i2 = 0; i2 < this.bs.size(); i2++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strQkj8);
            sb.append("\n");
            sb.append(this.bs.get(i2).qkj8(str + "  "));
            strQkj8 = sb.toString();
        }
        return strQkj8;
    }

    @Override // androidx.transition.oc
    @zy.lvui
    /* JADX INFO: renamed from: qo, reason: merged with bridge method [inline-methods] */
    public dd mo5318q(@InterfaceC7843t int i2) {
        for (int i3 = 0; i3 < this.bs.size(); i3++) {
            this.bs.get(i3).mo5318q(i2);
        }
        return (dd) super.mo5318q(i2);
    }

    @Override // androidx.transition.oc
    @zy.lvui
    /* JADX INFO: renamed from: r8s8, reason: merged with bridge method [inline-methods] */
    public dd nmn5(@zy.lvui View view) {
        for (int i2 = 0; i2 < this.bs.size(); i2++) {
            this.bs.get(i2).nmn5(view);
        }
        return (dd) super.nmn5(view);
    }

    @Override // androidx.transition.oc
    @zy.lvui
    /* JADX INFO: renamed from: sok, reason: merged with bridge method [inline-methods] */
    public dd gyi(long j2) {
        ArrayList<oc> arrayList;
        super.gyi(j2);
        if (this.f6746n >= 0 && (arrayList = this.bs) != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.bs.get(i2).gyi(j2);
            }
        }
        return this;
    }

    @Override // androidx.transition.oc
    void t8r(C1225l c1225l) {
        super.t8r(c1225l);
        int size = this.bs.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.bs.get(i2).t8r(c1225l);
        }
    }

    @Override // androidx.transition.oc
    @zy.lvui
    /* JADX INFO: renamed from: tfm, reason: merged with bridge method [inline-methods] */
    public dd mo5317n(@zy.lvui View view) {
        for (int i2 = 0; i2 < this.bs.size(); i2++) {
            this.bs.get(i2).mo5317n(view);
        }
        return (dd) super.mo5317n(view);
    }

    @Override // androidx.transition.oc
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: u */
    public void mo5319u(View view) {
        super.mo5319u(view);
        int size = this.bs.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.bs.get(i2).mo5319u(view);
        }
    }

    @Override // androidx.transition.oc
    @zy.lvui
    /* JADX INFO: renamed from: v0af, reason: merged with bridge method [inline-methods] */
    public dd t8iq(@zy.lvui String str) {
        for (int i2 = 0; i2 < this.bs.size(); i2++) {
            this.bs.get(i2).t8iq(str);
        }
        return (dd) super.t8iq(str);
    }

    @zy.lvui
    public dd w831(int i2) {
        if (i2 == 0) {
            this.k0 = true;
        } else {
            if (i2 != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i2);
            }
            this.k0 = false;
        }
        return this;
    }

    @Override // androidx.transition.oc
    @zy.lvui
    /* JADX INFO: renamed from: wo, reason: merged with bridge method [inline-methods] */
    public dd mo5314g(@zy.lvui Class<?> cls) {
        for (int i2 = 0; i2 < this.bs.size(); i2++) {
            this.bs.get(i2).mo5314g(cls);
        }
        return (dd) super.mo5314g(cls);
    }

    @Override // androidx.transition.oc
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    protected void y2() {
        if (this.bs.isEmpty()) {
            vq();
            o1t();
            return;
        }
        yqrt();
        if (this.k0) {
            Iterator<oc> it = this.bs.iterator();
            while (it.hasNext()) {
                it.next().y2();
            }
            return;
        }
        for (int i2 = 1; i2 < this.bs.size(); i2++) {
            this.bs.get(i2 - 1).mo5316k(new C1193k(this.bs.get(i2)));
        }
        oc ocVar = this.bs.get(0);
        if (ocVar != null) {
            ocVar.y2();
        }
    }

    @Override // androidx.transition.oc
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: z */
    protected void mo5322z(ViewGroup viewGroup, n5r1 n5r1Var, n5r1 n5r1Var2, ArrayList<C1225l> arrayList, ArrayList<C1225l> arrayList2) {
        long jM5408c = m5408c();
        int size = this.bs.size();
        for (int i2 = 0; i2 < size; i2++) {
            oc ocVar = this.bs.get(i2);
            if (jM5408c > 0 && (this.k0 || i2 == 0)) {
                long jM5408c2 = ocVar.m5408c();
                if (jM5408c2 > 0) {
                    ocVar.mu(jM5408c2 + jM5408c);
                } else {
                    ocVar.mu(jM5408c);
                }
            }
            ocVar.mo5322z(viewGroup, n5r1Var, n5r1Var2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.oc
    @zy.lvui
    /* JADX INFO: renamed from: z4, reason: merged with bridge method [inline-methods] */
    public dd mu(long j2) {
        return (dd) super.mu(j2);
    }

    @zy.dd
    public oc zsr0(int i2) {
        if (i2 < 0 || i2 >= this.bs.size()) {
            return null;
        }
        return this.bs.get(i2);
    }

    @SuppressLint({"RestrictedApi"})
    public dd(@zy.lvui Context context, @zy.lvui AttributeSet attributeSet) {
        super(context, attributeSet);
        this.bs = new ArrayList<>();
        this.k0 = true;
        this.bc = false;
        this.bu = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d3.f6380s);
        w831(androidx.core.content.res.kja0.ld6(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }
}
