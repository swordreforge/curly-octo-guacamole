package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.text.f7l8;
import androidx.core.view.InterfaceC0704l;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p023g.C6045k;
import zy.InterfaceC7833l;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView implements InterfaceC0704l, androidx.core.widget.wvg, androidx.core.widget.toq, lvui {

    /* JADX INFO: renamed from: g */
    @zy.lvui
    private n7h f782g;

    /* JADX INFO: renamed from: k */
    private final C0206n f783k;

    /* JADX INFO: renamed from: n */
    private final o1t f784n;

    /* JADX INFO: renamed from: q */
    private final C0220t f785q;

    /* JADX INFO: renamed from: s */
    @zy.dd
    private Future<androidx.core.text.f7l8> f786s;

    /* JADX INFO: renamed from: y */
    private boolean f787y;

    public AppCompatTextView(@zy.lvui Context context) {
        this(context, null);
    }

    private void f7l8() {
        Future<androidx.core.text.f7l8> future = this.f786s;
        if (future != null) {
            try {
                this.f786s = null;
                androidx.core.widget.t8r.jk(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @zy.lvui
    private n7h getEmojiTextViewHelper() {
        if (this.f782g == null) {
            this.f782g = new n7h(this);
        }
        return this.f782g;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0206n c0206n = this.f783k;
        if (c0206n != null) {
            c0206n.toq();
        }
        C0220t c0220t = this.f785q;
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
        C0220t c0220t = this.f785q;
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
        C0220t c0220t = this.f785q;
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
        C0220t c0220t = this.f785q;
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
        C0220t c0220t = this.f785q;
        return c0220t != null ? c0220t.m725y() : new int[0];
    }

    @Override // android.widget.TextView, androidx.core.widget.toq
    @SuppressLint({"WrongConstant"})
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeTextType() {
        if (androidx.core.widget.toq.f50989toq) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0220t c0220t = this.f785q;
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.t8r.m3687s(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.t8r.m3685p(this);
    }

    @Override // androidx.core.view.InterfaceC0704l
    @zy.dd
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C0206n c0206n = this.f783k;
        if (c0206n != null) {
            return c0206n.zy();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0704l
    @zy.dd
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0206n c0206n = this.f783k;
        if (c0206n != null) {
            return c0206n.m661q();
        }
        return null;
    }

    @Override // androidx.core.widget.wvg
    @zy.dd
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f785q.m723p();
    }

    @Override // androidx.core.widget.wvg
    @zy.dd
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f785q.ld6();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        f7l8();
        return super.getText();
    }

    @Override // android.widget.TextView
    @zy.hyr(api = 26)
    @zy.lvui
    public TextClassifier getTextClassifier() {
        o1t o1tVar;
        return (Build.VERSION.SDK_INT >= 28 || (o1tVar = this.f784n) == null) ? super.getTextClassifier() : o1tVar.m695k();
    }

    @zy.lvui
    public f7l8.C0613k getTextMetricsParamsCompat() {
        return androidx.core.widget.t8r.kja0(this);
    }

    @Override // androidx.appcompat.widget.lvui
    /* JADX INFO: renamed from: n */
    public boolean mo447n() {
        return getEmojiTextViewHelper().toq();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f785q.ki(this, inputConnectionOnCreateInputConnection, editorInfo);
        return kja0.m626k(inputConnectionOnCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        C0220t c0220t = this.f785q;
        if (c0220t != null) {
            c0220t.kja0(z2, i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) {
        f7l8();
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        C0220t c0220t = this.f785q;
        if (c0220t == null || androidx.core.widget.toq.f50989toq || !c0220t.x2()) {
            return;
        }
        this.f785q.zy();
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
        C0220t c0220t = this.f785q;
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
        C0220t c0220t = this.f785q;
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
        C0220t c0220t = this.f785q;
        if (c0220t != null) {
            c0220t.zurt(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@zy.dd Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0206n c0206n = this.f783k;
        if (c0206n != null) {
            c0206n.m658g(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@zy.fn3e int i2) {
        super.setBackgroundResource(i2);
        C0206n c0206n = this.f783k;
        if (c0206n != null) {
            c0206n.f7l8(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@zy.dd Drawable drawable, @zy.dd Drawable drawable2, @zy.dd Drawable drawable3, @zy.dd Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0220t c0220t = this.f785q;
        if (c0220t != null) {
            c0220t.m720h();
        }
    }

    @Override // android.widget.TextView
    @zy.hyr(17)
    public void setCompoundDrawablesRelative(@zy.dd Drawable drawable, @zy.dd Drawable drawable2, @zy.dd Drawable drawable3, @zy.dd Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0220t c0220t = this.f785q;
        if (c0220t != null) {
            c0220t.m720h();
        }
    }

    @Override // android.widget.TextView
    @zy.hyr(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@zy.dd Drawable drawable, @zy.dd Drawable drawable2, @zy.dd Drawable drawable3, @zy.dd Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0220t c0220t = this.f785q;
        if (c0220t != null) {
            c0220t.m720h();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@zy.dd Drawable drawable, @zy.dd Drawable drawable2, @zy.dd Drawable drawable3, @zy.dd Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0220t c0220t = this.f785q;
        if (c0220t != null) {
            c0220t.m720h();
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(@InterfaceC7833l @zy.a9(from = 0) int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i2);
        } else {
            androidx.core.widget.t8r.wvg(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(@InterfaceC7833l @zy.a9(from = 0) int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i2);
        } else {
            androidx.core.widget.t8r.m3688t(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(@InterfaceC7833l @zy.a9(from = 0) int i2) {
        androidx.core.widget.t8r.mcp(this, i2);
    }

    public void setPrecomputedText(@zy.lvui androidx.core.text.f7l8 f7l8Var) {
        androidx.core.widget.t8r.jk(this, f7l8Var);
    }

    @Override // androidx.core.view.InterfaceC0704l
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@zy.dd ColorStateList colorStateList) {
        C0206n c0206n = this.f783k;
        if (c0206n != null) {
            c0206n.m662s(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0704l
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@zy.dd PorterDuff.Mode mode) {
        C0206n c0206n = this.f783k;
        if (c0206n != null) {
            c0206n.m660p(mode);
        }
    }

    @Override // androidx.core.widget.wvg
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@zy.dd ColorStateList colorStateList) {
        this.f785q.ni7(colorStateList);
        this.f785q.toq();
    }

    @Override // androidx.core.widget.wvg
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@zy.dd PorterDuff.Mode mode) {
        this.f785q.fu4(mode);
        this.f785q.toq();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0220t c0220t = this.f785q;
        if (c0220t != null) {
            c0220t.cdj(context, i2);
        }
    }

    @Override // android.widget.TextView
    @zy.hyr(api = 26)
    public void setTextClassifier(@zy.dd TextClassifier textClassifier) {
        o1t o1tVar;
        if (Build.VERSION.SDK_INT >= 28 || (o1tVar = this.f784n) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            o1tVar.toq(textClassifier);
        }
    }

    public void setTextFuture(@zy.dd Future<androidx.core.text.f7l8> future) {
        this.f786s = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@zy.lvui f7l8.C0613k c0613k) {
        androidx.core.widget.t8r.fti(this, c0613k);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i2, float f2) {
        if (androidx.core.widget.toq.f50989toq) {
            super.setTextSize(i2, f2);
            return;
        }
        C0220t c0220t = this.f785q;
        if (c0220t != null) {
            c0220t.wvg(i2, f2);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(@zy.dd Typeface typeface, int i2) {
        if (this.f787y) {
            return;
        }
        Typeface qVar = null;
        if (typeface != null && i2 > 0) {
            qVar = androidx.core.graphics.o1t.toq(getContext(), typeface, i2);
        }
        this.f787y = true;
        if (qVar != null) {
            typeface = qVar;
        }
        try {
            super.setTypeface(typeface, i2);
        } finally {
            this.f787y = false;
        }
    }

    public AppCompatTextView(@zy.lvui Context context, @zy.dd AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public AppCompatTextView(@zy.lvui Context context, @zy.dd AttributeSet attributeSet, int i2) {
        super(ek5k.toq(context), attributeSet, i2);
        this.f787y = false;
        C0214o.m692k(this, getContext());
        C0206n c0206n = new C0206n(this);
        this.f783k = c0206n;
        c0206n.m659n(attributeSet, i2);
        C0220t c0220t = new C0220t(this);
        this.f785q = c0220t;
        c0220t.qrj(attributeSet, i2);
        c0220t.toq();
        this.f784n = new o1t(this);
        getEmojiTextViewHelper().zy(attributeSet, i2);
    }

    @Override // android.widget.TextView
    @zy.hyr(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i2 != 0 ? C6045k.toq(context, i2) : null, i3 != 0 ? C6045k.toq(context, i3) : null, i4 != 0 ? C6045k.toq(context, i4) : null, i5 != 0 ? C6045k.toq(context, i5) : null);
        C0220t c0220t = this.f785q;
        if (c0220t != null) {
            c0220t.m720h();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i2 != 0 ? C6045k.toq(context, i2) : null, i3 != 0 ? C6045k.toq(context, i3) : null, i4 != 0 ? C6045k.toq(context, i4) : null, i5 != 0 ? C6045k.toq(context, i5) : null);
        C0220t c0220t = this.f785q;
        if (c0220t != null) {
            c0220t.m720h();
        }
    }
}
