package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.C0830n;
import zy.a9;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: EmojiInputConnection.java */
/* JADX INFO: loaded from: classes.dex */
@hyr(19)
@uv6({uv6.EnumC7844k.LIBRARY})
final class zy extends InputConnectionWrapper {

    /* JADX INFO: renamed from: k */
    private final TextView f4599k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final C0845k f51204toq;

    /* JADX INFO: renamed from: androidx.emoji2.viewsintegration.zy$k */
    /* JADX INFO: compiled from: EmojiInputConnection.java */
    public static class C0845k {
        /* JADX INFO: renamed from: k */
        public boolean m4124k(@lvui InputConnection inputConnection, @lvui Editable editable, @a9(from = 0) int i2, @a9(from = 0) int i3, boolean z2) {
            return C0830n.m4029g(inputConnection, editable, i2, i3, z2);
        }

        public void toq(@lvui EditorInfo editorInfo) {
            if (C0830n.qrj()) {
                C0830n.toq().mcp(editorInfo);
            }
        }
    }

    zy(@lvui TextView textView, @lvui InputConnection inputConnection, @lvui EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new C0845k());
    }

    /* JADX INFO: renamed from: k */
    private Editable m4123k() {
        return this.f4599k.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i2, int i3) {
        return this.f51204toq.m4124k(this, m4123k(), i2, i3, false) || super.deleteSurroundingText(i2, i3);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        return this.f51204toq.m4124k(this, m4123k(), i2, i3, true) || super.deleteSurroundingTextInCodePoints(i2, i3);
    }

    zy(@lvui TextView textView, @lvui InputConnection inputConnection, @lvui EditorInfo editorInfo, @lvui C0845k c0845k) {
        super(inputConnection, false);
        this.f4599k = textView;
        this.f51204toq = c0845k;
        c0845k.toq(editorInfo);
    }
}
