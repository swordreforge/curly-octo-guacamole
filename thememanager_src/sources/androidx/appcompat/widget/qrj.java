package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.emoji2.viewsintegration.C0840k;
import p030n.C7397k;

/* JADX INFO: compiled from: AppCompatEmojiEditTextHelper.java */
/* JADX INFO: loaded from: classes.dex */
class qrj {

    /* JADX INFO: renamed from: k */
    @zy.lvui
    private final EditText f1174k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @zy.lvui
    private final C0840k f46947toq;

    qrj(@zy.lvui EditText editText) {
        this.f1174k = editText;
        this.f46947toq = new C0840k(editText, false);
    }

    /* JADX INFO: renamed from: g */
    void m707g(boolean z2) {
        this.f46947toq.f7l8(z2);
    }

    @zy.dd
    /* JADX INFO: renamed from: k */
    KeyListener m708k(@zy.dd KeyListener keyListener) {
        return toq(keyListener) ? this.f46947toq.toq(keyListener) : keyListener;
    }

    @zy.dd
    /* JADX INFO: renamed from: n */
    InputConnection m709n(@zy.dd InputConnection inputConnection, @zy.lvui EditorInfo editorInfo) {
        return this.f46947toq.m4113n(inputConnection, editorInfo);
    }

    /* JADX INFO: renamed from: q */
    void m710q(@zy.dd AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = this.f1174k.getContext().obtainStyledAttributes(attributeSet, C7397k.qrj.f92666h7am, i2, 0);
        try {
            int i3 = C7397k.qrj.f92714n2t;
            boolean z2 = typedArrayObtainStyledAttributes.hasValue(i3) ? typedArrayObtainStyledAttributes.getBoolean(i3, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m707g(z2);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    boolean toq(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    boolean zy() {
        return this.f46947toq.m4114q();
    }
}
