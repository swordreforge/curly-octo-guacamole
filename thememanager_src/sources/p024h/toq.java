package p024h;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: SupportMenuItem.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public interface toq extends MenuItem {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f77050f7l8 = 0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f77051ld6 = 8;

    /* JADX INFO: renamed from: p */
    public static final int f35070p = 4;

    /* JADX INFO: renamed from: s */
    public static final int f35071s = 2;

    /* JADX INFO: renamed from: y */
    public static final int f35072y = 1;

    @Override // android.view.MenuItem
    boolean collapseActionView();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    @dd
    View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    @dd
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    @dd
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    @dd
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    @dd
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    @dd
    /* JADX INFO: renamed from: k */
    androidx.core.view.toq mo345k();

    /* JADX INFO: renamed from: q */
    boolean mo347q();

    @Override // android.view.MenuItem
    @lvui
    MenuItem setActionView(int i2);

    @Override // android.view.MenuItem
    @lvui
    MenuItem setActionView(@dd View view);

    @Override // android.view.MenuItem
    @lvui
    MenuItem setAlphabeticShortcut(char c2, int i2);

    @Override // android.view.MenuItem
    @lvui
    toq setContentDescription(@dd CharSequence charSequence);

    @Override // android.view.MenuItem
    @lvui
    MenuItem setIconTintList(@dd ColorStateList colorStateList);

    @Override // android.view.MenuItem
    @lvui
    MenuItem setIconTintMode(@dd PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    @lvui
    MenuItem setNumericShortcut(char c2, int i2);

    @Override // android.view.MenuItem
    @lvui
    MenuItem setShortcut(char c2, char c3, int i2, int i3);

    @Override // android.view.MenuItem
    void setShowAsAction(int i2);

    @Override // android.view.MenuItem
    @lvui
    MenuItem setShowAsActionFlags(int i2);

    @Override // android.view.MenuItem
    @lvui
    toq setTooltipText(@dd CharSequence charSequence);

    boolean toq();

    @lvui
    toq zy(@dd androidx.core.view.toq toqVar);
}
