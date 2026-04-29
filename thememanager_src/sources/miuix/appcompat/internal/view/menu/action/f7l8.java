package miuix.appcompat.internal.view.menu.action;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import gb.toq;
import miuix.animation.ViewHoverListener;
import miuix.appcompat.internal.view.menu.action.ActionMenuView;

/* JADX INFO: compiled from: OverflowMenuButton.java */
/* JADX INFO: loaded from: classes3.dex */
class f7l8 extends LinearLayout implements ActionMenuView.InterfaceC7016k, ViewHoverListener {

    /* JADX INFO: renamed from: k */
    private final zy f39482k;

    /* JADX INFO: renamed from: n */
    private boolean f39483n;

    /* JADX INFO: renamed from: q */
    private InterfaceC7019k f39484q;

    /* JADX INFO: renamed from: miuix.appcompat.internal.view.menu.action.f7l8$k */
    /* JADX INFO: compiled from: OverflowMenuButton.java */
    interface InterfaceC7019k {
        /* JADX INFO: renamed from: k */
        void mo25310k();
    }

    public f7l8(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: k */
    private boolean m25309k() {
        ViewGroup viewGroup = this;
        while (viewGroup != null && viewGroup.getVisibility() == 0) {
            ViewParent parent = viewGroup.getParent();
            viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        }
        return viewGroup == null;
    }

    @Override // miuix.animation.ViewHoverListener
    public boolean isHover() {
        return this.f39483n;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f39482k.m25318k(configuration);
    }

    @Override // miuix.animation.ViewHoverListener
    public void onEnterHover() {
        this.f39483n = true;
    }

    @Override // miuix.animation.ViewHoverListener
    public void onExitHover() {
        this.f39483n = false;
    }

    @Override // miuix.animation.ViewHoverListener
    public void onMoveHover() {
    }

    @Override // android.view.View
    public boolean performClick() {
        if (super.performClick() || !m25309k()) {
            return true;
        }
        playSoundEffect(0);
        InterfaceC7019k interfaceC7019k = this.f39484q;
        if (interfaceC7019k != null) {
            interfaceC7019k.mo25310k();
        }
        return true;
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView.InterfaceC7016k
    /* JADX INFO: renamed from: q */
    public boolean mo25293q() {
        return false;
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        this.f39482k.zy(z2);
    }

    public void toq(InterfaceC7019k interfaceC7019k) {
        this.f39484q = interfaceC7019k;
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView.InterfaceC7016k
    public boolean zy() {
        return false;
    }

    public f7l8(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public f7l8(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.ki.sd, i2, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(toq.ki.nvs3);
        CharSequence text = typedArrayObtainStyledAttributes.getText(toq.ki.kbf0);
        String string = typedArrayObtainStyledAttributes.getString(toq.ki.wp);
        typedArrayObtainStyledAttributes.recycle();
        zy zyVar = new zy(this);
        this.f39482k = zyVar;
        zyVar.m25320q(drawable);
        zyVar.m25317g(text);
        zyVar.toq(string);
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
    }
}
