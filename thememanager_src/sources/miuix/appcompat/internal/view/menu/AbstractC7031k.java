package miuix.appcompat.internal.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import miuix.appcompat.internal.view.menu.ld6;
import miuix.appcompat.internal.view.menu.x2;

/* JADX INFO: renamed from: miuix.appcompat.internal.view.menu.k */
/* JADX INFO: compiled from: BaseMenuPresenter.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7031k implements ld6 {

    /* JADX INFO: renamed from: g */
    protected LayoutInflater f39529g;

    /* JADX INFO: renamed from: h */
    private int f39530h;

    /* JADX INFO: renamed from: i */
    protected x2 f39531i;

    /* JADX INFO: renamed from: k */
    protected Context f39532k;

    /* JADX INFO: renamed from: n */
    protected f7l8 f39533n;

    /* JADX INFO: renamed from: p */
    private int f39534p;

    /* JADX INFO: renamed from: q */
    protected Context f39535q;

    /* JADX INFO: renamed from: s */
    private ld6.InterfaceC7032k f39536s;

    /* JADX INFO: renamed from: y */
    protected LayoutInflater f39537y;

    /* JADX INFO: renamed from: z */
    private int f39538z;

    public AbstractC7031k(Context context, int i2, int i3) {
        this.f39532k = context;
        this.f39529g = LayoutInflater.from(context);
        this.f39534p = i2;
        this.f39530h = i3;
    }

    protected static boolean cdj(f7l8 f7l8Var, f7l8 f7l8Var2, MenuItem menuItem) {
        return f7l8Var.mo25350y(f7l8Var2, menuItem);
    }

    /* JADX INFO: renamed from: h */
    protected static MenuItemC7036s m25357h(f7l8 f7l8Var, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        return new MenuItemC7036s(f7l8Var, i2, i3, i4, i5, charSequence, i6);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void qrj(f7l8 f7l8Var, boolean z2) {
        f7l8Var.m25340g(z2);
    }

    protected static void t8r(f7l8 f7l8Var, boolean z2) {
        f7l8Var.lvui(z2);
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    public void f7l8(f7l8 f7l8Var, boolean z2) {
        ld6.InterfaceC7032k interfaceC7032k = this.f39536s;
        if (interfaceC7032k != null) {
            interfaceC7032k.f7l8(f7l8Var, z2);
        }
    }

    public boolean fn3e(int i2, MenuItemC7036s menuItemC7036s) {
        return true;
    }

    /* JADX INFO: renamed from: g */
    protected void m25358g(View view, int i2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f39531i).addView(view, i2);
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    public int getId() {
        return this.f39538z;
    }

    /* JADX INFO: renamed from: i */
    public void m25359i(int i2) {
        this.f39538z = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View ki(MenuItemC7036s menuItemC7036s, View view, ViewGroup viewGroup) {
        x2.InterfaceC7037k interfaceC7037kKja0 = view instanceof x2.InterfaceC7037k ? (x2.InterfaceC7037k) view : kja0(viewGroup);
        mo25284y(menuItemC7036s, interfaceC7037kKja0);
        return (View) interfaceC7037kKja0;
    }

    public x2.InterfaceC7037k kja0(ViewGroup viewGroup) {
        return (x2.InterfaceC7037k) this.f39529g.inflate(this.f39530h, viewGroup, false);
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    public void ld6(ld6.InterfaceC7032k interfaceC7032k) {
        this.f39536s = interfaceC7032k;
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    /* JADX INFO: renamed from: n */
    public boolean mo25176n() {
        return false;
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    public boolean n7h(qrj qrjVar) {
        ld6.InterfaceC7032k interfaceC7032k = this.f39536s;
        return interfaceC7032k != null && interfaceC7032k.mo25076y(qrjVar);
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    /* JADX INFO: renamed from: p */
    public boolean mo25177p(f7l8 f7l8Var, MenuItemC7036s menuItemC7036s) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r1v2, types: [miuix.appcompat.internal.view.menu.x2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v0, types: [miuix.appcompat.internal.view.menu.k] */
    /* JADX WARN: Type inference failed for: r7v1, types: [miuix.appcompat.internal.view.menu.x2] */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [int] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [int] */
    /* JADX WARN: Type inference failed for: r7v7, types: [int] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [int] */
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
    @Override // miuix.appcompat.internal.view.menu.ld6
    /* JADX INFO: renamed from: q */
    public void mo25178q(boolean z2) {
        ?? r7 = this.f39531i;
        ?? r0 = (ViewGroup) r7;
        if (r0 == 0) {
            return;
        }
        ?? Mo25265y = r7.mo25265y();
        f7l8 f7l8Var = this.f39533n;
        if (f7l8Var != null) {
            f7l8Var.m25341i();
            for (MenuItemC7036s menuItemC7036s : this.f39533n.gvn7()) {
                if (fn3e(Mo25265y, menuItemC7036s)) {
                    ?? childAt = r0.getChildAt(Mo25265y);
                    MenuItemC7036s itemData = childAt instanceof x2.InterfaceC7037k ? ((x2.InterfaceC7037k) childAt).getItemData() : null;
                    View viewKi = ki(menuItemC7036s, childAt, r0);
                    if (menuItemC7036s != itemData) {
                        viewKi.setPressed(false);
                    }
                    if (viewKi != childAt) {
                        m25358g(viewKi, Mo25265y);
                    }
                    if (menuItemC7036s != null) {
                        menuItemC7036s.jp0y(viewKi);
                    }
                    Mo25265y++;
                }
            }
        }
        while (Mo25265y < r0.getChildCount()) {
            if (!this.f39531i.mo25264k(Mo25265y)) {
                Mo25265y++;
            }
        }
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    /* JADX INFO: renamed from: s */
    public void mo25179s(Context context, f7l8 f7l8Var) {
        this.f39535q = context;
        this.f39537y = LayoutInflater.from(context);
        this.f39533n = f7l8Var;
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    public x2 toq(ViewGroup viewGroup) {
        if (this.f39531i == null) {
            x2 x2Var = (x2) this.f39529g.inflate(this.f39534p, viewGroup, false);
            this.f39531i = x2Var;
            x2Var.f7l8(this.f39533n);
            mo25178q(true);
        }
        return this.f39531i;
    }

    @Override // miuix.appcompat.internal.view.menu.ld6
    public boolean x2(f7l8 f7l8Var, MenuItemC7036s menuItemC7036s) {
        return false;
    }

    /* JADX INFO: renamed from: y */
    public abstract void mo25284y(MenuItemC7036s menuItemC7036s, x2.InterfaceC7037k interfaceC7037k);
}
