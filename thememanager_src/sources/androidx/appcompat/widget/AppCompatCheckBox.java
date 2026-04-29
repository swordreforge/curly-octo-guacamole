package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.core.view.InterfaceC0704l;
import p023g.C6045k;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox implements androidx.core.widget.o1t, InterfaceC0704l, lvui {

    /* JADX INFO: renamed from: g */
    private n7h f724g;

    /* JADX INFO: renamed from: k */
    private final C0216p f725k;

    /* JADX INFO: renamed from: n */
    private final C0220t f726n;

    /* JADX INFO: renamed from: q */
    private final C0206n f727q;

    public AppCompatCheckBox(@zy.lvui Context context) {
        this(context, null);
    }

    @zy.lvui
    private n7h getEmojiTextViewHelper() {
        if (this.f724g == null) {
            this.f724g = new n7h(this);
        }
        return this.f724g;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0206n c0206n = this.f727q;
        if (c0206n != null) {
            c0206n.toq();
        }
        C0220t c0220t = this.f726n;
        if (c0220t != null) {
            c0220t.toq();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0216p c0216p = this.f725k;
        return c0216p != null ? c0216p.toq(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // androidx.core.view.InterfaceC0704l
    @zy.dd
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C0206n c0206n = this.f727q;
        if (c0206n != null) {
            return c0206n.zy();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0704l
    @zy.dd
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0206n c0206n = this.f727q;
        if (c0206n != null) {
            return c0206n.m661q();
        }
        return null;
    }

    @Override // androidx.core.widget.o1t
    @zy.dd
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportButtonTintList() {
        C0216p c0216p = this.f725k;
        if (c0216p != null) {
            return c0216p.zy();
        }
        return null;
    }

    @Override // androidx.core.widget.o1t
    @zy.dd
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportButtonTintMode() {
        C0216p c0216p = this.f725k;
        if (c0216p != null) {
            return c0216p.m704q();
        }
        return null;
    }

    @Override // androidx.appcompat.widget.lvui
    /* JADX INFO: renamed from: n */
    public boolean mo447n() {
        return getEmojiTextViewHelper().toq();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m683q(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@zy.dd Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0206n c0206n = this.f727q;
        if (c0206n != null) {
            c0206n.m658g(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@zy.fn3e int i2) {
        super.setBackgroundResource(i2);
        C0206n c0206n = this.f727q;
        if (c0206n != null) {
            c0206n.f7l8(i2);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0216p c0216p = this.f725k;
        if (c0216p != null) {
            c0216p.m701g();
        }
    }

    @Override // androidx.appcompat.widget.lvui
    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().m682n(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(@zy.lvui InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m681k(inputFilterArr));
    }

    @Override // androidx.core.view.InterfaceC0704l
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@zy.dd ColorStateList colorStateList) {
        C0206n c0206n = this.f727q;
        if (c0206n != null) {
            c0206n.m662s(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0704l
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@zy.dd PorterDuff.Mode mode) {
        C0206n c0206n = this.f727q;
        if (c0206n != null) {
            c0206n.m660p(mode);
        }
    }

    @Override // androidx.core.widget.o1t
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setSupportButtonTintList(@zy.dd ColorStateList colorStateList) {
        C0216p c0216p = this.f725k;
        if (c0216p != null) {
            c0216p.f7l8(colorStateList);
        }
    }

    @Override // androidx.core.widget.o1t
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setSupportButtonTintMode(@zy.dd PorterDuff.Mode mode) {
        C0216p c0216p = this.f725k;
        if (c0216p != null) {
            c0216p.m705y(mode);
        }
    }

    public AppCompatCheckBox(@zy.lvui Context context, @zy.dd AttributeSet attributeSet) {
        this(context, attributeSet, C7397k.toq.f92995y2);
    }

    public AppCompatCheckBox(@zy.lvui Context context, @zy.dd AttributeSet attributeSet, int i2) {
        super(ek5k.toq(context), attributeSet, i2);
        C0214o.m692k(this, getContext());
        C0216p c0216p = new C0216p(this);
        this.f725k = c0216p;
        c0216p.m703n(attributeSet, i2);
        C0206n c0206n = new C0206n(this);
        this.f727q = c0206n;
        c0206n.m659n(attributeSet, i2);
        C0220t c0220t = new C0220t(this);
        this.f726n = c0220t;
        c0220t.qrj(attributeSet, i2);
        getEmojiTextViewHelper().zy(attributeSet, i2);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(@zy.fn3e int i2) {
        setButtonDrawable(C6045k.toq(getContext(), i2));
    }
}
