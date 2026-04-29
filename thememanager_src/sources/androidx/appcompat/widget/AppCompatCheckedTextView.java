package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.view.InterfaceC0704l;
import androidx.core.widget.InterfaceC0771z;
import p023g.C6045k;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView implements InterfaceC0771z, InterfaceC0704l, lvui {

    /* JADX INFO: renamed from: g */
    @zy.lvui
    private n7h f728g;

    /* JADX INFO: renamed from: k */
    private final C0219s f729k;

    /* JADX INFO: renamed from: n */
    private final C0220t f730n;

    /* JADX INFO: renamed from: q */
    private final C0206n f731q;

    public AppCompatCheckedTextView(@zy.lvui Context context) {
        this(context, null);
    }

    @zy.lvui
    private n7h getEmojiTextViewHelper() {
        if (this.f728g == null) {
            this.f728g = new n7h(this);
        }
        return this.f728g;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0220t c0220t = this.f730n;
        if (c0220t != null) {
            c0220t.toq();
        }
        C0206n c0206n = this.f731q;
        if (c0206n != null) {
            c0206n.toq();
        }
        C0219s c0219s = this.f729k;
        if (c0219s != null) {
            c0219s.m712k();
        }
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
        C0206n c0206n = this.f731q;
        if (c0206n != null) {
            return c0206n.zy();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0704l
    @zy.dd
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0206n c0206n = this.f731q;
        if (c0206n != null) {
            return c0206n.m661q();
        }
        return null;
    }

    @Override // androidx.core.widget.InterfaceC0771z
    @zy.dd
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCheckMarkTintList() {
        C0219s c0219s = this.f729k;
        if (c0219s != null) {
            return c0219s.toq();
        }
        return null;
    }

    @Override // androidx.core.widget.InterfaceC0771z
    @zy.dd
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0219s c0219s = this.f729k;
        if (c0219s != null) {
            return c0219s.zy();
        }
        return null;
    }

    @Override // androidx.appcompat.widget.lvui
    /* JADX INFO: renamed from: n */
    public boolean mo447n() {
        return getEmojiTextViewHelper().toq();
    }

    @Override // android.widget.TextView, android.view.View
    @zy.dd
    public InputConnection onCreateInputConnection(@zy.lvui EditorInfo editorInfo) {
        return kja0.m626k(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m683q(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@zy.dd Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0206n c0206n = this.f731q;
        if (c0206n != null) {
            c0206n.m658g(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@zy.fn3e int i2) {
        super.setBackgroundResource(i2);
        C0206n c0206n = this.f731q;
        if (c0206n != null) {
            c0206n.f7l8(i2);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@zy.dd Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0219s c0219s = this.f729k;
        if (c0219s != null) {
            c0219s.m713n();
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

    @Override // androidx.core.view.InterfaceC0704l
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@zy.dd ColorStateList colorStateList) {
        C0206n c0206n = this.f731q;
        if (c0206n != null) {
            c0206n.m662s(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0704l
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@zy.dd PorterDuff.Mode mode) {
        C0206n c0206n = this.f731q;
        if (c0206n != null) {
            c0206n.m660p(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC0771z
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setSupportCheckMarkTintList(@zy.dd ColorStateList colorStateList) {
        C0219s c0219s = this.f729k;
        if (c0219s != null) {
            c0219s.m711g(colorStateList);
        }
    }

    @Override // androidx.core.widget.InterfaceC0771z
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setSupportCheckMarkTintMode(@zy.dd PorterDuff.Mode mode) {
        C0219s c0219s = this.f729k;
        if (c0219s != null) {
            c0219s.f7l8(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(@zy.lvui Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0220t c0220t = this.f730n;
        if (c0220t != null) {
            c0220t.cdj(context, i2);
        }
    }

    public AppCompatCheckedTextView(@zy.lvui Context context, @zy.dd AttributeSet attributeSet) {
        this(context, attributeSet, C7397k.toq.f92829c8jq);
    }

    public AppCompatCheckedTextView(@zy.lvui Context context, @zy.dd AttributeSet attributeSet, int i2) {
        super(ek5k.toq(context), attributeSet, i2);
        C0214o.m692k(this, getContext());
        C0220t c0220t = new C0220t(this);
        this.f730n = c0220t;
        c0220t.qrj(attributeSet, i2);
        c0220t.toq();
        C0206n c0206n = new C0206n(this);
        this.f731q = c0206n;
        c0206n.m659n(attributeSet, i2);
        C0219s c0219s = new C0219s(this);
        this.f729k = c0219s;
        c0219s.m714q(attributeSet, i2);
        getEmojiTextViewHelper().zy(attributeSet, i2);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@zy.fn3e int i2) {
        setCheckMarkDrawable(C6045k.toq(getContext(), i2));
    }
}
