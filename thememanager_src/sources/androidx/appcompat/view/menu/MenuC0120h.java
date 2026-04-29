package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p024h.InterfaceMenuC6069k;
import zy.uv6;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.h */
/* JADX INFO: compiled from: MenuWrapperICS.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class MenuC0120h extends zy implements Menu {

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final InterfaceMenuC6069k f46732kja0;

    public MenuC0120h(Context context, InterfaceMenuC6069k interfaceMenuC6069k) {
        super(context);
        if (interfaceMenuC6069k == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f46732kja0 = interfaceMenuC6069k;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m393n(this.f46732kja0.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f46732kja0.addIntentOptions(i2, i3, i4, componentName, intentArr, intent, i5, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i6 = 0; i6 < length; i6++) {
                menuItemArr[i6] = m393n(menuItemArr2[i6]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m392g(this.f46732kja0.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        f7l8();
        this.f46732kja0.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f46732kja0.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i2) {
        return m393n(this.f46732kja0.findItem(i2));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i2) {
        return m393n(this.f46732kja0.getItem(i2));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f46732kja0.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return this.f46732kja0.isShortcutKey(i2, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i2, int i3) {
        return this.f46732kja0.performIdentifierAction(i2, i3);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        return this.f46732kja0.performShortcut(i2, keyEvent, i3);
    }

    @Override // android.view.Menu
    public void removeGroup(int i2) {
        m395y(i2);
        this.f46732kja0.removeGroup(i2);
    }

    @Override // android.view.Menu
    public void removeItem(int i2) {
        m394s(i2);
        this.f46732kja0.removeItem(i2);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i2, boolean z2, boolean z3) {
        this.f46732kja0.setGroupCheckable(i2, z2, z3);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i2, boolean z2) {
        this.f46732kja0.setGroupEnabled(i2, z2);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i2, boolean z2) {
        this.f46732kja0.setGroupVisible(i2, z2);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f46732kja0.setQwertyMode(z2);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f46732kja0.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i2) {
        return m393n(this.f46732kja0.add(i2));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2) {
        return m392g(this.f46732kja0.addSubMenu(i2));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return m393n(this.f46732kja0.add(i2, i3, i4, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        return m392g(this.f46732kja0.addSubMenu(i2, i3, i4, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, int i5) {
        return m393n(this.f46732kja0.add(i2, i3, i4, i5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return m392g(this.f46732kja0.addSubMenu(i2, i3, i4, i5));
    }
}
