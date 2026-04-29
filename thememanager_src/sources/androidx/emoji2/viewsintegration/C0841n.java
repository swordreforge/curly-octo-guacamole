package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.C0830n;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.emoji2.viewsintegration.n */
/* JADX INFO: compiled from: EmojiKeyListener.java */
/* JADX INFO: loaded from: classes.dex */
@hyr(19)
@uv6({uv6.EnumC7844k.LIBRARY})
final class C0841n implements KeyListener {

    /* JADX INFO: renamed from: k */
    private final KeyListener f4594k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final k f51199toq;

    /* JADX INFO: renamed from: androidx.emoji2.viewsintegration.n$k */
    /* JADX INFO: compiled from: EmojiKeyListener.java */
    public static class k {
        /* JADX INFO: renamed from: k */
        public boolean m4120k(@lvui Editable editable, int i2, @lvui KeyEvent keyEvent) {
            return C0830n.f7l8(editable, i2, keyEvent);
        }
    }

    C0841n(KeyListener keyListener) {
        this(keyListener, new k());
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i2) {
        this.f4594k.clearMetaKeyState(view, editable, i2);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f4594k.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i2, KeyEvent keyEvent) {
        return this.f51199toq.m4120k(editable, i2, keyEvent) || this.f4594k.onKeyDown(view, editable, i2, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f4594k.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i2, KeyEvent keyEvent) {
        return this.f4594k.onKeyUp(view, editable, i2, keyEvent);
    }

    C0841n(KeyListener keyListener, k kVar) {
        this.f4594k = keyListener;
        this.f51199toq = kVar;
    }
}
