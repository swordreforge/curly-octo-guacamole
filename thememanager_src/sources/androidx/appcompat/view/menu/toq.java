package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.kja0;
import androidx.appcompat.view.menu.n7h;
import java.util.ArrayList;
import zy.uv6;

/* JADX INFO: compiled from: BaseMenuPresenter.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public abstract class toq implements n7h {

    /* JADX INFO: renamed from: g */
    protected LayoutInflater f566g;

    /* JADX INFO: renamed from: h */
    private int f567h;

    /* JADX INFO: renamed from: i */
    protected kja0 f568i;

    /* JADX INFO: renamed from: k */
    protected Context f569k;

    /* JADX INFO: renamed from: n */
    protected f7l8 f570n;

    /* JADX INFO: renamed from: p */
    private int f571p;

    /* JADX INFO: renamed from: q */
    protected Context f572q;

    /* JADX INFO: renamed from: s */
    private n7h.InterfaceC0129k f573s;

    /* JADX INFO: renamed from: y */
    protected LayoutInflater f574y;

    /* JADX INFO: renamed from: z */
    private int f575z;

    public toq(Context context, int i2, int i3) {
        this.f569k = context;
        this.f566g = LayoutInflater.from(context);
        this.f571p = i2;
        this.f567h = i3;
    }

    public n7h.InterfaceC0129k cdj() {
        return this.f573s;
    }

    @Override // androidx.appcompat.view.menu.n7h
    public void f7l8(f7l8 f7l8Var, boolean z2) {
        n7h.InterfaceC0129k interfaceC0129k = this.f573s;
        if (interfaceC0129k != null) {
            interfaceC0129k.f7l8(f7l8Var, z2);
        }
    }

    @Override // androidx.appcompat.view.menu.n7h
    public int getId() {
        return this.f575z;
    }

    /* JADX INFO: renamed from: h */
    protected boolean mo388h(ViewGroup viewGroup, int i2) {
        viewGroup.removeViewAt(i2);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public boolean mo389i(int i2, C0130p c0130p) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View ki(C0130p c0130p, View view, ViewGroup viewGroup) {
        kja0.InterfaceC0124k interfaceC0124kKja0 = view instanceof kja0.InterfaceC0124k ? (kja0.InterfaceC0124k) view : kja0(viewGroup);
        n7h(c0130p, interfaceC0124kKja0);
        return (View) interfaceC0124kKja0;
    }

    public kja0.InterfaceC0124k kja0(ViewGroup viewGroup) {
        return (kja0.InterfaceC0124k) this.f566g.inflate(this.f567h, viewGroup, false);
    }

    @Override // androidx.appcompat.view.menu.n7h
    public boolean ld6(f7l8 f7l8Var, C0130p c0130p) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: n */
    public boolean mo353n() {
        return false;
    }

    public abstract void n7h(C0130p c0130p, kja0.InterfaceC0124k interfaceC0124k);

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: p */
    public boolean mo354p(t8r t8rVar) {
        n7h.InterfaceC0129k interfaceC0129k = this.f573s;
        f7l8 f7l8Var = t8rVar;
        if (interfaceC0129k == null) {
            return false;
        }
        if (t8rVar == null) {
            f7l8Var = this.f570n;
        }
        return interfaceC0129k.mo143y(f7l8Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: q */
    public void mo355q(boolean z2) {
        ViewGroup viewGroup = (ViewGroup) this.f568i;
        if (viewGroup == null) {
            return;
        }
        f7l8 f7l8Var = this.f570n;
        int i2 = 0;
        if (f7l8Var != null) {
            f7l8Var.fn3e();
            ArrayList<C0130p> arrayListGvn7 = this.f570n.gvn7();
            int size = arrayListGvn7.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                C0130p c0130p = arrayListGvn7.get(i4);
                if (mo389i(i3, c0130p)) {
                    View childAt = viewGroup.getChildAt(i3);
                    C0130p itemData = childAt instanceof kja0.InterfaceC0124k ? ((kja0.InterfaceC0124k) childAt).getItemData() : null;
                    View viewKi = ki(c0130p, childAt, viewGroup);
                    if (c0130p != itemData) {
                        viewKi.setPressed(false);
                        viewKi.jumpDrawablesToCurrentState();
                    }
                    if (viewKi != childAt) {
                        qrj(viewKi, i3);
                    }
                    i3++;
                }
            }
            i2 = i3;
        }
        while (i2 < viewGroup.getChildCount()) {
            if (!mo388h(viewGroup, i2)) {
                i2++;
            }
        }
    }

    protected void qrj(View view, int i2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f568i).addView(view, i2);
    }

    @Override // androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: s */
    public void mo356s(n7h.InterfaceC0129k interfaceC0129k) {
        this.f573s = interfaceC0129k;
    }

    public void t8r(int i2) {
        this.f575z = i2;
    }

    @Override // androidx.appcompat.view.menu.n7h
    public kja0 toq(ViewGroup viewGroup) {
        if (this.f568i == null) {
            kja0 kja0Var = (kja0) this.f566g.inflate(this.f571p, viewGroup, false);
            this.f568i = kja0Var;
            kja0Var.zy(this.f570n);
            mo355q(true);
        }
        return this.f568i;
    }

    @Override // androidx.appcompat.view.menu.n7h
    public void x2(Context context, f7l8 f7l8Var) {
        this.f572q = context;
        this.f574y = LayoutInflater.from(context);
        this.f570n = f7l8Var;
    }

    @Override // androidx.appcompat.view.menu.n7h
    /* JADX INFO: renamed from: y */
    public boolean mo367y(f7l8 f7l8Var, C0130p c0130p) {
        return false;
    }
}
