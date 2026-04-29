package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.C0830n;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import zy.dd;
import zy.hyr;
import zy.uv6;

/* JADX INFO: compiled from: EmojiTextWatcher.java */
/* JADX INFO: loaded from: classes.dex */
@hyr(19)
@uv6({uv6.EnumC7844k.LIBRARY})
final class f7l8 implements TextWatcher {

    /* JADX INFO: renamed from: k */
    private final EditText f4583k;

    /* JADX INFO: renamed from: n */
    private C0830n.n f4584n;

    /* JADX INFO: renamed from: q */
    private final boolean f4585q;

    /* JADX INFO: renamed from: g */
    private int f4582g = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: y */
    private int f4587y = 0;

    /* JADX INFO: renamed from: s */
    private boolean f4586s = true;

    /* JADX INFO: renamed from: androidx.emoji2.viewsintegration.f7l8$k */
    /* JADX INFO: compiled from: EmojiTextWatcher.java */
    @hyr(19)
    private static class C0838k extends C0830n.n {

        /* JADX INFO: renamed from: k */
        private final Reference<EditText> f4588k;

        C0838k(EditText editText) {
            this.f4588k = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.C0830n.n
        public void toq() {
            super.toq();
            f7l8.m4094n(this.f4588k.get(), 1);
        }
    }

    f7l8(EditText editText, boolean z2) {
        this.f4583k = editText;
        this.f4585q = z2;
    }

    /* JADX INFO: renamed from: n */
    static void m4094n(@dd EditText editText, int i2) {
        if (i2 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C0830n.toq().m4034i(editableText);
            C0842q.toq(editableText, selectionStart, selectionEnd);
        }
    }

    /* JADX INFO: renamed from: s */
    private boolean m4095s() {
        return (this.f4586s && (this.f4585q || C0830n.qrj())) ? false : true;
    }

    private C0830n.n toq() {
        if (this.f4584n == null) {
            this.f4584n = new C0838k(this.f4583k);
        }
        return this.f4584n;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public void f7l8(boolean z2) {
        if (this.f4586s != z2) {
            if (this.f4584n != null) {
                C0830n.toq().m4038t(this.f4584n);
            }
            this.f4586s = z2;
            if (z2) {
                m4094n(this.f4583k, C0830n.toq().m4035n());
            }
        }
    }

    /* JADX INFO: renamed from: g */
    void m4096g(int i2) {
        this.f4587y = i2;
    }

    /* JADX INFO: renamed from: k */
    int m4097k() {
        return this.f4587y;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        if (this.f4583k.isInEditMode() || m4095s() || i3 > i4 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iM4035n = C0830n.toq().m4035n();
        if (iM4035n != 0) {
            if (iM4035n == 1) {
                C0830n.toq().ni7((Spannable) charSequence, i2, i2 + i4, this.f4582g, this.f4587y);
                return;
            } else if (iM4035n != 3) {
                return;
            }
        }
        C0830n.toq().fu4(toq());
    }

    /* JADX INFO: renamed from: q */
    public boolean m4098q() {
        return this.f4586s;
    }

    /* JADX INFO: renamed from: y */
    void m4099y(int i2) {
        this.f4582g = i2;
    }

    int zy() {
        return this.f4582g;
    }
}
