package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.view.InterfaceC0704l;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button implements InterfaceC0704l, androidx.core.widget.toq, androidx.core.widget.wvg, lvui {

    /* JADX INFO: renamed from: k */
    private final C0206n f721k;

    /* JADX INFO: renamed from: n */
    @zy.lvui
    private n7h f722n;

    /* JADX INFO: renamed from: q */
    private final C0220t f723q;

    public AppCompatButton(@zy.lvui Context context) {
        this(context, null);
    }

    @zy.lvui
    private n7h getEmojiTextViewHelper() {
        if (this.f722n == null) {
            this.f722n = new n7h(this);
        }
        return this.f722n;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0206n c0206n = this.f721k;
        if (c0206n != null) {
            c0206n.toq();
        }
        C0220t c0220t = this.f723q;
        if (c0220t != null) {
            c0220t.toq();
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.toq
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        if (androidx.core.widget.toq.f50989toq) {
            return super.getAutoSizeMaxTextSize();
        }
        C0220t c0220t = this.f723q;
        if (c0220t != null) {
            return c0220t.m722n();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.toq
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMinTextSize() {
        if (androidx.core.widget.toq.f50989toq) {
            return super.getAutoSizeMinTextSize();
        }
        C0220t c0220t = this.f723q;
        if (c0220t != null) {
            return c0220t.m719g();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.toq
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeStepGranularity() {
        if (androidx.core.widget.toq.f50989toq) {
            return super.getAutoSizeStepGranularity();
        }
        C0220t c0220t = this.f723q;
        if (c0220t != null) {
            return c0220t.f7l8();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.toq
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public int[] getAutoSizeTextAvailableSizes() {
        if (androidx.core.widget.toq.f50989toq) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0220t c0220t = this.f723q;
        return c0220t != null ? c0220t.m725y() : new int[0];
    }

    @Override // android.widget.TextView, androidx.core.widget.toq
    @SuppressLint({"WrongConstant"})
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeTextType() {
        if (androidx.core.widget.toq.f50989toq) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0220t c0220t = this.f723q;
        if (c0220t != null) {
            return c0220t.m724s();
        }
        return 0;
    }

    @Override // android.widget.TextView
    @zy.dd
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.t8r.jp0y(super.getCustomSelectionActionModeCallback());
    }

    @Override // androidx.core.view.InterfaceC0704l
    @zy.dd
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C0206n c0206n = this.f721k;
        if (c0206n != null) {
            return c0206n.zy();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0704l
    @zy.dd
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0206n c0206n = this.f721k;
        if (c0206n != null) {
            return c0206n.m661q();
        }
        return null;
    }

    @Override // androidx.core.widget.wvg
    @zy.dd
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f723q.m723p();
    }

    @Override // androidx.core.widget.wvg
    @zy.dd
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f723q.ld6();
    }

    @Override // androidx.appcompat.widget.lvui
    /* JADX INFO: renamed from: n */
    public boolean mo447n() {
        return getEmojiTextViewHelper().toq();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        C0220t c0220t = this.f723q;
        if (c0220t != null) {
            c0220t.kja0(z2, i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        C0220t c0220t = this.f723q;
        if (c0220t == null || androidx.core.widget.toq.f50989toq || !c0220t.x2()) {
            return;
        }
        this.f723q.zy();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m683q(z2);
    }

    @Override // android.widget.TextView, androidx.core.widget.toq
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) throws IllegalArgumentException {
        if (androidx.core.widget.toq.f50989toq) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        C0220t c0220t = this.f723q;
        if (c0220t != null) {
            c0220t.m721i(i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.toq
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@zy.lvui int[] iArr, int i2) throws IllegalArgumentException {
        if (androidx.core.widget.toq.f50989toq) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        C0220t c0220t = this.f723q;
        if (c0220t != null) {
            c0220t.fn3e(iArr, i2);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.toq
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (androidx.core.widget.toq.f50989toq) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        C0220t c0220t = this.f723q;
        if (c0220t != null) {
            c0220t.zurt(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@zy.dd Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0206n c0206n = this.f721k;
        if (c0206n != null) {
            c0206n.m658g(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@zy.fn3e int i2) {
        super.setBackgroundResource(i2);
        C0206n c0206n = this.f721k;
        if (c0206n != null) {
            c0206n.f7l8(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@zy.dd ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.t8r.gvn7(this, callback));
    }

    @Override // androidx.appcompat.widget.lvui
    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().m682n(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(@zy.lvui InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m681k(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z2) {
        C0220t c0220t = this.f723q;
        if (c0220t != null) {
            c0220t.t8r(z2);
        }
    }

    @Override // androidx.core.view.InterfaceC0704l
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@zy.dd ColorStateList colorStateList) {
        C0206n c0206n = this.f721k;
        if (c0206n != null) {
            c0206n.m662s(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0704l
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@zy.dd PorterDuff.Mode mode) {
        C0206n c0206n = this.f721k;
        if (c0206n != null) {
            c0206n.m660p(mode);
        }
    }

    @Override // androidx.core.widget.wvg
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@zy.dd ColorStateList colorStateList) {
        this.f723q.ni7(colorStateList);
        this.f723q.toq();
    }

    @Override // androidx.core.widget.wvg
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@zy.dd PorterDuff.Mode mode) {
        this.f723q.fu4(mode);
        this.f723q.toq();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0220t c0220t = this.f723q;
        if (c0220t != null) {
            c0220t.cdj(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i2, float f2) {
        if (androidx.core.widget.toq.f50989toq) {
            super.setTextSize(i2, f2);
            return;
        }
        C0220t c0220t = this.f723q;
        if (c0220t != null) {
            c0220t.wvg(i2, f2);
        }
    }

    public AppCompatButton(@zy.lvui Context context, @zy.dd AttributeSet attributeSet) {
        this(context, attributeSet, C7397k.toq.f42500x);
    }

    public AppCompatButton(@zy.lvui Context context, @zy.dd AttributeSet attributeSet, int i2) {
        super(ek5k.toq(context), attributeSet, i2);
        C0214o.m692k(this, getContext());
        C0206n c0206n = new C0206n(this);
        this.f721k = c0206n;
        c0206n.m659n(attributeSet, i2);
        C0220t c0220t = new C0220t(this);
        this.f723q = c0220t;
        c0220t.qrj(attributeSet, i2);
        c0220t.toq();
        getEmojiTextViewHelper().zy(attributeSet, i2);
    }
}
