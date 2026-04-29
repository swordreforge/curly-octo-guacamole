package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.zy;
import p023g.C6045k;
import p030n.C7397k;

/* JADX INFO: compiled from: ShareActionProvider.java */
/* JADX INFO: loaded from: classes.dex */
public class nn86 extends androidx.core.view.toq {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f46931ld6 = 4;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final String f46932x2 = "share_history.xml";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    final Context f46933f7l8;

    /* JADX INFO: renamed from: g */
    private final zy f1149g;

    /* JADX INFO: renamed from: n */
    private int f1150n;

    /* JADX INFO: renamed from: p */
    private zy.InterfaceC0226g f1151p;

    /* JADX INFO: renamed from: s */
    InterfaceC0213k f1152s;

    /* JADX INFO: renamed from: y */
    String f1153y;

    /* JADX INFO: renamed from: androidx.appcompat.widget.nn86$k */
    /* JADX INFO: compiled from: ShareActionProvider.java */
    public interface InterfaceC0213k {
        /* JADX INFO: renamed from: k */
        boolean m689k(nn86 nn86Var, Intent intent);
    }

    /* JADX INFO: compiled from: ShareActionProvider.java */
    private class toq implements zy.InterfaceC0226g {
        toq() {
        }

        @Override // androidx.appcompat.widget.zy.InterfaceC0226g
        /* JADX INFO: renamed from: k */
        public boolean mo690k(androidx.appcompat.widget.zy zyVar, Intent intent) {
            nn86 nn86Var = nn86.this;
            InterfaceC0213k interfaceC0213k = nn86Var.f1152s;
            if (interfaceC0213k == null) {
                return false;
            }
            interfaceC0213k.m689k(nn86Var, intent);
            return false;
        }
    }

    /* JADX INFO: compiled from: ShareActionProvider.java */
    private class zy implements MenuItem.OnMenuItemClickListener {
        zy() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            nn86 nn86Var = nn86.this;
            Intent qVar = androidx.appcompat.widget.zy.m753q(nn86Var.f46933f7l8, nn86Var.f1153y).toq(menuItem.getItemId());
            if (qVar == null) {
                return true;
            }
            String action = qVar.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                nn86.this.ki(qVar);
            }
            nn86.this.f46933f7l8.startActivity(qVar);
            return true;
        }
    }

    public nn86(Context context) {
        super(context);
        this.f1150n = 4;
        this.f1149g = new zy();
        this.f1153y = f46932x2;
        this.f46933f7l8 = context;
    }

    private void n7h() {
        if (this.f1152s == null) {
            return;
        }
        if (this.f1151p == null) {
            this.f1151p = new toq();
        }
        androidx.appcompat.widget.zy.m753q(this.f46933f7l8, this.f1153y).fn3e(this.f1151p);
    }

    public void cdj(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                ki(intent);
            }
        }
        androidx.appcompat.widget.zy.m753q(this.f46933f7l8, this.f1153y).m755i(intent);
    }

    @Override // androidx.core.view.toq
    public void f7l8(SubMenu subMenu) {
        subMenu.clear();
        androidx.appcompat.widget.zy zyVarM753q = androidx.appcompat.widget.zy.m753q(this.f46933f7l8, this.f1153y);
        PackageManager packageManager = this.f46933f7l8.getPackageManager();
        int iM754g = zyVarM753q.m754g();
        int iMin = Math.min(iM754g, this.f1150n);
        for (int i2 = 0; i2 < iMin; i2++) {
            ResolveInfo resolveInfoM756n = zyVarM753q.m756n(i2);
            subMenu.add(0, i2, i2, resolveInfoM756n.loadLabel(packageManager)).setIcon(resolveInfoM756n.loadIcon(packageManager)).setOnMenuItemClickListener(this.f1149g);
        }
        if (iMin < iM754g) {
            SubMenu subMenuAddSubMenu = subMenu.addSubMenu(0, iMin, iMin, this.f46933f7l8.getString(C7397k.ld6.f42379n));
            for (int i3 = 0; i3 < iM754g; i3++) {
                ResolveInfo resolveInfoM756n2 = zyVarM753q.m756n(i3);
                subMenuAddSubMenu.add(0, i3, i3, resolveInfoM756n2.loadLabel(packageManager)).setIcon(resolveInfoM756n2.loadIcon(packageManager)).setOnMenuItemClickListener(this.f1149g);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m688h(String str) {
        this.f1153y = str;
        n7h();
    }

    void ki(Intent intent) {
        intent.addFlags(134742016);
    }

    public void kja0(InterfaceC0213k interfaceC0213k) {
        this.f1152s = interfaceC0213k;
        n7h();
    }

    @Override // androidx.core.view.toq
    /* JADX INFO: renamed from: q */
    public View mo360q() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.f46933f7l8);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(androidx.appcompat.widget.zy.m753q(this.f46933f7l8, this.f1153y));
        }
        TypedValue typedValue = new TypedValue();
        this.f46933f7l8.getTheme().resolveAttribute(C7397k.toq.f92985wvg, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(C6045k.toq(this.f46933f7l8, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(C7397k.ld6.f92445o1t);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(C7397k.ld6.f42385z);
        return activityChooserView;
    }

    @Override // androidx.core.view.toq
    public boolean toq() {
        return true;
    }
}
