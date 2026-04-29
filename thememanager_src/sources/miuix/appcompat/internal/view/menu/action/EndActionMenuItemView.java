package miuix.appcompat.internal.view.menu.action;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import gb.toq;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.ITouchStyle;
import miuix.animation.ViewHoverListener;
import miuix.animation.base.AnimConfig;
import miuix.appcompat.internal.view.menu.MenuItemC7036s;
import miuix.appcompat.internal.view.menu.f7l8;
import miuix.appcompat.internal.view.menu.x2;

/* JADX INFO: loaded from: classes3.dex */
public class EndActionMenuItemView extends LinearLayout implements x2.InterfaceC7037k, ViewHoverListener {

    /* JADX INFO: renamed from: g */
    private boolean f39420g;

    /* JADX INFO: renamed from: k */
    private MenuItemC7036s f39421k;

    /* JADX INFO: renamed from: n */
    private ImageView f39422n;

    /* JADX INFO: renamed from: q */
    private f7l8.zy f39423q;

    /* JADX INFO: renamed from: y */
    private boolean f39424y;

    public EndActionMenuItemView(Context context) {
        this(context, null, 0);
    }

    @Override // miuix.appcompat.internal.view.menu.x2.InterfaceC7037k
    public MenuItemC7036s getItemData() {
        return this.f39421k;
    }

    @Override // miuix.animation.ViewHoverListener
    public boolean isHover() {
        return this.f39424y;
    }

    @Override // miuix.appcompat.internal.view.menu.x2.InterfaceC7037k
    /* JADX INFO: renamed from: k */
    public boolean mo25269k() {
        return false;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // miuix.animation.ViewHoverListener
    public void onEnterHover() {
        this.f39424y = true;
    }

    @Override // miuix.animation.ViewHoverListener
    public void onExitHover() {
        this.f39424y = false;
    }

    @Override // miuix.animation.ViewHoverListener
    public void onMoveHover() {
    }

    @Override // android.view.View
    public boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        int i2 = this.f39421k.getItemId() == toq.C6054p.iz ? 1 : 0;
        f7l8.zy zyVar = this.f39423q;
        if (zyVar == null || !zyVar.toq(this.f39421k, i2)) {
            return false;
        }
        playSoundEffect(0);
        return true;
    }

    @Override // miuix.appcompat.internal.view.menu.x2.InterfaceC7037k
    public void setCheckable(boolean z2) {
        this.f39420g = z2;
    }

    @Override // miuix.appcompat.internal.view.menu.x2.InterfaceC7037k
    public void setChecked(boolean z2) {
        if (this.f39420g) {
            setSelected(z2);
        }
    }

    @Override // android.view.View, miuix.appcompat.internal.view.menu.x2.InterfaceC7037k
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        this.f39422n.setEnabled(z2);
    }

    @Override // miuix.appcompat.internal.view.menu.x2.InterfaceC7037k
    public void setIcon(Drawable drawable) {
        if (this.f39422n.getDrawable() != drawable) {
            this.f39422n.setImageDrawable(drawable);
        }
    }

    @Override // miuix.appcompat.internal.view.menu.x2.InterfaceC7037k
    public void setItemInvoker(f7l8.zy zyVar) {
        this.f39423q = zyVar;
    }

    @Override // miuix.appcompat.internal.view.menu.x2.InterfaceC7037k
    public void setShortcut(boolean z2, char c2) {
    }

    @Override // miuix.appcompat.internal.view.menu.x2.InterfaceC7037k
    public void setTitle(CharSequence charSequence) {
    }

    @Override // miuix.appcompat.internal.view.menu.x2.InterfaceC7037k
    public boolean toq() {
        return true;
    }

    @Override // miuix.appcompat.internal.view.menu.x2.InterfaceC7037k
    public void zy(MenuItemC7036s menuItemC7036s, int i2) {
        this.f39421k = menuItemC7036s;
        setSelected(false);
        setTitle(menuItemC7036s.getTitle());
        setIcon(menuItemC7036s.getIcon());
        setCheckable(menuItemC7036s.isCheckable());
        setChecked(menuItemC7036s.isChecked());
        setEnabled(menuItemC7036s.isEnabled());
        setClickable(true);
        if (TextUtils.isEmpty(menuItemC7036s.getContentDescription())) {
            setContentDescription(menuItemC7036s.getTitle());
        } else {
            setContentDescription(menuItemC7036s.getContentDescription());
        }
    }

    public EndActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EndActionMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        setOrientation(1);
        setGravity(17);
        View.inflate(context, toq.qrj.f76725lrht, this);
        ImageView imageView = (ImageView) findViewById(toq.C6054p.f34887a);
        this.f39422n = imageView;
        if (Build.VERSION.SDK_INT >= 29) {
            imageView.setForceDarkAllowed(false);
        }
        Folme.useAt(this).touch().setScale(1.0f, new ITouchStyle.TouchType[0]).setAlpha(0.6f, ITouchStyle.TouchType.DOWN).setAlpha(1.0f, ITouchStyle.TouchType.UP).handleTouchOf(this, new AnimConfig[0]);
        Folme.useAt(this).hover().setFeedbackRadius(60.0f);
        Folme.useAt(this).hover().setEffect(IHoverStyle.HoverEffect.FLOATED_WRAPPED).handleHoverOf(this, new AnimConfig[0]);
    }
}
