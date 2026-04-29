package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import androidx.core.view.InterfaceC0704l;
import p023g.C6045k;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView implements InterfaceC0704l, lvui {

    /* JADX INFO: renamed from: g */
    private static final int[] f743g = {R.attr.popupBackground};

    /* JADX INFO: renamed from: k */
    private final C0206n f744k;

    /* JADX INFO: renamed from: n */
    @zy.lvui
    private final qrj f745n;

    /* JADX INFO: renamed from: q */
    private final C0220t f746q;

    public AppCompatMultiAutoCompleteTextView(@zy.lvui Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0206n c0206n = this.f744k;
        if (c0206n != null) {
            c0206n.toq();
        }
        C0220t c0220t = this.f746q;
        if (c0220t != null) {
            c0220t.toq();
        }
    }

    @Override // androidx.core.view.InterfaceC0704l
    @zy.dd
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C0206n c0206n = this.f744k;
        if (c0206n != null) {
            return c0206n.zy();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0704l
    @zy.dd
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0206n c0206n = this.f744k;
        if (c0206n != null) {
            return c0206n.m661q();
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    void m449k(qrj qrjVar) {
        KeyListener keyListener = getKeyListener();
        if (qrjVar.toq(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            int inputType = super.getInputType();
            KeyListener keyListenerM708k = qrjVar.m708k(keyListener);
            if (keyListenerM708k == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerM708k);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
        }
    }

    @Override // androidx.appcompat.widget.lvui
    /* JADX INFO: renamed from: n */
    public boolean mo447n() {
        return this.f745n.zy();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f745n.m709n(kja0.m626k(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@zy.dd Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0206n c0206n = this.f744k;
        if (c0206n != null) {
            c0206n.m658g(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@zy.fn3e int i2) {
        super.setBackgroundResource(i2);
        C0206n c0206n = this.f744k;
        if (c0206n != null) {
            c0206n.f7l8(i2);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(@zy.fn3e int i2) {
        setDropDownBackgroundDrawable(C6045k.toq(getContext(), i2));
    }

    @Override // androidx.appcompat.widget.lvui
    public void setEmojiCompatEnabled(boolean z2) {
        this.f745n.m707g(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@zy.dd KeyListener keyListener) {
        super.setKeyListener(this.f745n.m708k(keyListener));
    }

    @Override // androidx.core.view.InterfaceC0704l
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@zy.dd ColorStateList colorStateList) {
        C0206n c0206n = this.f744k;
        if (c0206n != null) {
            c0206n.m662s(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0704l
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@zy.dd PorterDuff.Mode mode) {
        C0206n c0206n = this.f744k;
        if (c0206n != null) {
            c0206n.m660p(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0220t c0220t = this.f746q;
        if (c0220t != null) {
            c0220t.cdj(context, i2);
        }
    }

    public AppCompatMultiAutoCompleteTextView(@zy.lvui Context context, @zy.dd AttributeSet attributeSet) {
        this(context, attributeSet, C7397k.toq.f92921n5r1);
    }

    public AppCompatMultiAutoCompleteTextView(@zy.lvui Context context, @zy.dd AttributeSet attributeSet, int i2) {
        super(ek5k.toq(context), attributeSet, i2);
        C0214o.m692k(this, getContext());
        C0184b c0184bJp0y = C0184b.jp0y(getContext(), attributeSet, f743g, i2, 0);
        if (c0184bJp0y.mcp(0)) {
            setDropDownBackgroundDrawable(c0184bJp0y.m553y(0));
        }
        c0184bJp0y.d3();
        C0206n c0206n = new C0206n(this);
        this.f744k = c0206n;
        c0206n.m659n(attributeSet, i2);
        C0220t c0220t = new C0220t(this);
        this.f746q = c0220t;
        c0220t.qrj(attributeSet, i2);
        c0220t.toq();
        qrj qrjVar = new qrj(this);
        this.f745n = qrjVar;
        qrjVar.m710q(attributeSet, i2);
        m449k(qrjVar);
    }
}
