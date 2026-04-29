package miuix.appcompat.internal.view.menu.action;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import miuix.appcompat.internal.view.menu.MenuItemC7036s;
import miuix.appcompat.internal.view.menu.f7l8;
import miuix.appcompat.internal.view.menu.x2;

/* JADX INFO: loaded from: classes3.dex */
public class ActionMenuItemView extends LinearLayout implements x2.InterfaceC7037k {

    /* JADX INFO: renamed from: g */
    private final zy f39379g;

    /* JADX INFO: renamed from: k */
    private MenuItemC7036s f39380k;

    /* JADX INFO: renamed from: n */
    private boolean f39381n;

    /* JADX INFO: renamed from: q */
    private f7l8.zy f39382q;

    public ActionMenuItemView(Context context) {
        this(context, null, 0);
    }

    @Override // miuix.appcompat.internal.view.menu.x2.InterfaceC7037k
    public MenuItemC7036s getItemData() {
        return this.f39380k;
    }

    @Override // miuix.appcompat.internal.view.menu.x2.InterfaceC7037k
    /* JADX INFO: renamed from: k */
    public boolean mo25269k() {
        return false;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f39379g.m25318k(configuration);
    }

    @Override // android.view.View
    public boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        f7l8.zy zyVar = this.f39382q;
        if (zyVar == null || !zyVar.toq(this.f39380k, 0)) {
            return false;
        }
        playSoundEffect(0);
        return true;
    }

    @Override // miuix.appcompat.internal.view.menu.x2.InterfaceC7037k
    public void setCheckable(boolean z2) {
        this.f39381n = z2;
    }

    @Override // miuix.appcompat.internal.view.menu.x2.InterfaceC7037k
    public void setChecked(boolean z2) {
        if (this.f39381n) {
            setSelected(z2);
        }
    }

    @Override // android.view.View, miuix.appcompat.internal.view.menu.x2.InterfaceC7037k
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        this.f39379g.zy(z2);
    }

    @Override // miuix.appcompat.internal.view.menu.x2.InterfaceC7037k
    public void setIcon(Drawable drawable) {
        this.f39379g.m25320q(drawable);
    }

    @Override // miuix.appcompat.internal.view.menu.x2.InterfaceC7037k
    public void setItemInvoker(f7l8.zy zyVar) {
        this.f39382q = zyVar;
    }

    @Override // miuix.appcompat.internal.view.menu.x2.InterfaceC7037k
    public void setShortcut(boolean z2, char c2) {
    }

    @Override // miuix.appcompat.internal.view.menu.x2.InterfaceC7037k
    public void setTitle(CharSequence charSequence) {
        this.f39379g.m25317g(charSequence);
    }

    @Override // miuix.appcompat.internal.view.menu.x2.InterfaceC7037k
    public boolean toq() {
        return true;
    }

    @Override // miuix.appcompat.internal.view.menu.x2.InterfaceC7037k
    public void zy(MenuItemC7036s menuItemC7036s, int i2) {
        this.f39380k = menuItemC7036s;
        setSelected(false);
        setTitle(menuItemC7036s.getTitle());
        setIcon(menuItemC7036s.getIcon());
        setCheckable(menuItemC7036s.isCheckable());
        setChecked(menuItemC7036s.isChecked());
        setEnabled(menuItemC7036s.isEnabled());
        setClickable(true);
        this.f39379g.toq(menuItemC7036s.getContentDescription());
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f39379g = new zy(this);
    }
}
