package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.C0830n;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.emoji2.viewsintegration.q */
/* JADX INFO: compiled from: EmojiInputFilter.java */
/* JADX INFO: loaded from: classes.dex */
@hyr(19)
@uv6({uv6.EnumC7844k.LIBRARY})
final class C0842q implements InputFilter {

    /* JADX INFO: renamed from: k */
    private final TextView f4595k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private C0830n.n f51200toq;

    /* JADX INFO: renamed from: androidx.emoji2.viewsintegration.q$k */
    /* JADX INFO: compiled from: EmojiInputFilter.java */
    @hyr(19)
    private static class k extends C0830n.n {

        /* JADX INFO: renamed from: k */
        private final Reference<TextView> f4596k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Reference<C0842q> f51201toq;

        k(TextView textView, C0842q c0842q) {
            this.f4596k = new WeakReference(textView);
            this.f51201toq = new WeakReference(c0842q);
        }

        private boolean zy(@dd TextView textView, @dd InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.emoji2.text.C0830n.n
        public void toq() {
            super.toq();
            TextView textView = this.f4596k.get();
            if (zy(textView, this.f51201toq.get()) && textView.isAttachedToWindow()) {
                CharSequence charSequenceM4034i = C0830n.toq().m4034i(textView.getText());
                int selectionStart = Selection.getSelectionStart(charSequenceM4034i);
                int selectionEnd = Selection.getSelectionEnd(charSequenceM4034i);
                textView.setText(charSequenceM4034i);
                if (charSequenceM4034i instanceof Spannable) {
                    C0842q.toq((Spannable) charSequenceM4034i, selectionStart, selectionEnd);
                }
            }
        }
    }

    C0842q(@lvui TextView textView) {
        this.f4595k = textView;
    }

    /* JADX INFO: renamed from: k */
    private C0830n.n m4121k() {
        if (this.f51200toq == null) {
            this.f51200toq = new k(this.f4595k, this);
        }
        return this.f51200toq;
    }

    static void toq(Spannable spannable, int i2, int i3) {
        if (i2 >= 0 && i3 >= 0) {
            Selection.setSelection(spannable, i2, i3);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        } else if (i3 >= 0) {
            Selection.setSelection(spannable, i3);
        }
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        if (this.f4595k.isInEditMode()) {
            return charSequence;
        }
        int iM4035n = C0830n.toq().m4035n();
        if (iM4035n != 0) {
            boolean z2 = true;
            if (iM4035n == 1) {
                if (i5 == 0 && i4 == 0 && spanned.length() == 0 && charSequence == this.f4595k.getText()) {
                    z2 = false;
                }
                if (!z2 || charSequence == null) {
                    return charSequence;
                }
                if (i2 != 0 || i3 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i2, i3);
                }
                return C0830n.toq().fn3e(charSequence, 0, charSequence.length());
            }
            if (iM4035n != 3) {
                return charSequence;
            }
        }
        C0830n.toq().fu4(m4121k());
        return charSequence;
    }
}
