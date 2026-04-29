package miuix.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import gb.toq;
import miuix.appcompat.internal.view.menu.f7l8;
import miuix.internal.widget.x2;
import zy.dd;
import zy.eqxt;
import zy.lvui;

/* JADX INFO: renamed from: miuix.appcompat.widget.q */
/* JADX INFO: compiled from: PopupMenu.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7063q {

    /* JADX INFO: renamed from: g */
    private toq f39736g;

    /* JADX INFO: renamed from: k */
    private final Context f39737k;

    /* JADX INFO: renamed from: n */
    private zy f39738n;

    /* JADX INFO: renamed from: q */
    private x2 f39739q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final f7l8 f87165toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final View f87166zy;

    /* JADX INFO: renamed from: miuix.appcompat.widget.q$k */
    /* JADX INFO: compiled from: PopupMenu.java */
    class k extends x2 {
        k(Context context) {
            super(context);
        }

        @Override // miuix.internal.widget.x2
        protected void bo(MenuItem menuItem) {
            if (C7063q.this.f39738n != null) {
                C7063q.this.f39738n.onMenuItemClick(menuItem);
            }
        }

        @Override // miuix.internal.widget.x2
        /* JADX INFO: renamed from: u */
        protected void mo25493u() {
            if (C7063q.this.f39736g != null) {
                C7063q.this.f39736g.m25494k(C7063q.this);
            }
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.widget.q$toq */
    /* JADX INFO: compiled from: PopupMenu.java */
    public interface toq {
        /* JADX INFO: renamed from: k */
        void m25494k(C7063q c7063q);
    }

    /* JADX INFO: renamed from: miuix.appcompat.widget.q$zy */
    /* JADX INFO: compiled from: PopupMenu.java */
    public interface zy {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public C7063q(@lvui Context context, @lvui View view) {
        this(context, view, 0);
    }

    /* JADX INFO: renamed from: n */
    private MenuInflater m25487n() {
        return new androidx.appcompat.view.f7l8(this.f39737k);
    }

    public boolean f7l8() {
        x2 x2Var = this.f39739q;
        if (x2Var == null) {
            return false;
        }
        return x2Var.isShowing();
    }

    /* JADX INFO: renamed from: g */
    public void m25488g(@eqxt int i2) {
        m25487n().inflate(i2, this.f87165toq);
    }

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
    public void ld6(int i2, int i3) {
        this.f39739q.f7l8(this.f87165toq);
        this.f39739q.toq(i2);
        this.f39739q.m26040n(i3);
        this.f39739q.kja0(this.f87166zy, null);
    }

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
    /* JADX INFO: renamed from: p */
    public void m25489p() {
        this.f39739q.f7l8(this.f87165toq);
        this.f39739q.kja0(this.f87166zy, null);
    }

    /* JADX INFO: renamed from: q */
    public Menu m25490q() {
        return this.f87165toq;
    }

    /* JADX INFO: renamed from: s */
    public void m25491s(@dd zy zyVar) {
        this.f39738n = zyVar;
    }

    /* JADX INFO: renamed from: y */
    public void m25492y(@dd toq toqVar) {
        this.f39736g = toqVar;
    }

    public void zy() {
        this.f39739q.dismiss();
    }

    public C7063q(@lvui Context context, @lvui View view, int i2) {
        if (i2 == 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, toq.ki.p05g, toq.C6055q.b6t2, 0);
            try {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(toq.ki.xyt, 0);
                typedArrayObtainStyledAttributes.recycle();
                i2 = resourceId;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        if (i2 != 0) {
            this.f39737k = new ContextThemeWrapper(context, i2);
        } else {
            this.f39737k = context;
        }
        this.f87166zy = view;
        this.f87165toq = new f7l8(this.f39737k);
        this.f39739q = new k(this.f39737k);
    }
}
