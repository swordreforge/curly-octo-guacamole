package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.view.C0683f;
import androidx.core.view.C0711q;
import androidx.core.view.InterfaceC0704l;
import androidx.core.view.inputmethod.C0697n;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatEditText extends EditText implements InterfaceC0704l, androidx.core.view.lvui, lvui {

    /* JADX INFO: renamed from: g */
    private final androidx.core.widget.fu4 f732g;

    /* JADX INFO: renamed from: k */
    private final C0206n f733k;

    /* JADX INFO: renamed from: n */
    private final o1t f734n;

    /* JADX INFO: renamed from: q */
    private final C0220t f735q;

    /* JADX INFO: renamed from: y */
    @zy.lvui
    private final qrj f736y;

    public AppCompatEditText(@zy.lvui Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0206n c0206n = this.f733k;
        if (c0206n != null) {
            c0206n.toq();
        }
        C0220t c0220t = this.f735q;
        if (c0220t != null) {
            c0220t.toq();
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
        C0206n c0206n = this.f733k;
        if (c0206n != null) {
            return c0206n.zy();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0704l
    @zy.dd
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0206n c0206n = this.f733k;
        if (c0206n != null) {
            return c0206n.m661q();
        }
        return null;
    }

    @Override // android.widget.TextView
    @zy.hyr(api = 26)
    @zy.lvui
    public TextClassifier getTextClassifier() {
        o1t o1tVar;
        return (Build.VERSION.SDK_INT >= 28 || (o1tVar = this.f734n) == null) ? super.getTextClassifier() : o1tVar.m695k();
    }

    @Override // androidx.core.view.lvui
    @zy.dd
    /* JADX INFO: renamed from: k */
    public C0711q mo448k(@zy.lvui C0711q c0711q) {
        return this.f732g.mo3148k(this, c0711q);
    }

    @Override // androidx.appcompat.widget.lvui
    /* JADX INFO: renamed from: n */
    public boolean mo447n() {
        return this.f736y.zy();
    }

    @Override // android.widget.TextView, android.view.View
    @zy.dd
    public InputConnection onCreateInputConnection(@zy.lvui EditorInfo editorInfo) {
        String[] strArrY9n;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f735q.ki(this, inputConnectionOnCreateInputConnection, editorInfo);
        InputConnection inputConnectionM626k = kja0.m626k(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionM626k != null && Build.VERSION.SDK_INT <= 30 && (strArrY9n = C0683f.y9n(this)) != null) {
            C0697n.m3332y(editorInfo, strArrY9n);
            inputConnectionM626k = androidx.core.view.inputmethod.f7l8.m3322q(this, inputConnectionM626k, editorInfo);
        }
        return this.f736y.m709n(inputConnectionM626k, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (ni7.m685k(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i2) {
        if (ni7.toq(this, i2)) {
            return true;
        }
        return super.onTextContextMenuItem(i2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@zy.dd Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0206n c0206n = this.f733k;
        if (c0206n != null) {
            c0206n.m658g(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@zy.fn3e int i2) {
        super.setBackgroundResource(i2);
        C0206n c0206n = this.f733k;
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
        this.f736y.m707g(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@zy.dd KeyListener keyListener) {
        super.setKeyListener(this.f736y.m708k(keyListener));
    }

    @Override // androidx.core.view.InterfaceC0704l
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@zy.dd ColorStateList colorStateList) {
        C0206n c0206n = this.f733k;
        if (c0206n != null) {
            c0206n.m662s(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0704l
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@zy.dd PorterDuff.Mode mode) {
        C0206n c0206n = this.f733k;
        if (c0206n != null) {
            c0206n.m660p(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0220t c0220t = this.f735q;
        if (c0220t != null) {
            c0220t.cdj(context, i2);
        }
    }

    @Override // android.widget.TextView
    @zy.hyr(api = 26)
    public void setTextClassifier(@zy.dd TextClassifier textClassifier) {
        o1t o1tVar;
        if (Build.VERSION.SDK_INT >= 28 || (o1tVar = this.f734n) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            o1tVar.toq(textClassifier);
        }
    }

    void toq(qrj qrjVar) {
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

    public AppCompatEditText(@zy.lvui Context context, @zy.dd AttributeSet attributeSet) {
        this(context, attributeSet, C7397k.toq.f92987wx16);
    }

    @Override // android.widget.EditText, android.widget.TextView
    @zy.dd
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    public AppCompatEditText(@zy.lvui Context context, @zy.dd AttributeSet attributeSet, int i2) {
        super(ek5k.toq(context), attributeSet, i2);
        C0214o.m692k(this, getContext());
        C0206n c0206n = new C0206n(this);
        this.f733k = c0206n;
        c0206n.m659n(attributeSet, i2);
        C0220t c0220t = new C0220t(this);
        this.f735q = c0220t;
        c0220t.qrj(attributeSet, i2);
        c0220t.toq();
        this.f734n = new o1t(this);
        this.f732g = new androidx.core.widget.fu4();
        qrj qrjVar = new qrj(this);
        this.f736y = qrjVar;
        qrjVar.m710q(attributeSet, i2);
        toq(qrjVar);
    }
}
