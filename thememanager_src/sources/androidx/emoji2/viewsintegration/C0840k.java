package androidx.emoji2.viewsintegration;

import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.util.n7h;
import zy.a9;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.emoji2.viewsintegration.k */
/* JADX INFO: compiled from: EmojiEditTextHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0840k {

    /* JADX INFO: renamed from: k */
    private final toq f4592k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f51196toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f51197zy;

    /* JADX INFO: renamed from: androidx.emoji2.viewsintegration.k$k */
    /* JADX INFO: compiled from: EmojiEditTextHelper.java */
    @hyr(19)
    private static class k extends toq {

        /* JADX INFO: renamed from: k */
        private final EditText f4593k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final f7l8 f51198toq;

        k(@lvui EditText editText, boolean z2) {
            this.f4593k = editText;
            f7l8 f7l8Var = new f7l8(editText, z2);
            this.f51198toq = f7l8Var;
            editText.addTextChangedListener(f7l8Var);
            editText.setEditableFactory(androidx.emoji2.viewsintegration.toq.getInstance());
        }

        @Override // androidx.emoji2.viewsintegration.C0840k.toq
        /* JADX INFO: renamed from: g */
        void mo4116g(int i2) {
            this.f51198toq.m4099y(i2);
        }

        @Override // androidx.emoji2.viewsintegration.C0840k.toq
        /* JADX INFO: renamed from: k */
        KeyListener mo4117k(@dd KeyListener keyListener) {
            if (keyListener instanceof C0841n) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return new C0841n(keyListener);
        }

        @Override // androidx.emoji2.viewsintegration.C0840k.toq
        /* JADX INFO: renamed from: n */
        void mo4118n(boolean z2) {
            this.f51198toq.f7l8(z2);
        }

        @Override // androidx.emoji2.viewsintegration.C0840k.toq
        /* JADX INFO: renamed from: q */
        void mo4119q(int i2) {
            this.f51198toq.m4096g(i2);
        }

        @Override // androidx.emoji2.viewsintegration.C0840k.toq
        boolean toq() {
            return this.f51198toq.m4098q();
        }

        @Override // androidx.emoji2.viewsintegration.C0840k.toq
        InputConnection zy(@lvui InputConnection inputConnection, @lvui EditorInfo editorInfo) {
            return inputConnection instanceof zy ? inputConnection : new zy(this.f4593k, inputConnection, editorInfo);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.viewsintegration.k$toq */
    /* JADX INFO: compiled from: EmojiEditTextHelper.java */
    static class toq {
        toq() {
        }

        /* JADX INFO: renamed from: g */
        void mo4116g(int i2) {
        }

        @dd
        /* JADX INFO: renamed from: k */
        KeyListener mo4117k(@dd KeyListener keyListener) {
            return keyListener;
        }

        /* JADX INFO: renamed from: n */
        void mo4118n(boolean z2) {
        }

        /* JADX INFO: renamed from: q */
        void mo4119q(int i2) {
        }

        boolean toq() {
            return false;
        }

        InputConnection zy(@lvui InputConnection inputConnection, @lvui EditorInfo editorInfo) {
            return inputConnection;
        }
    }

    public C0840k(@lvui EditText editText) {
        this(editText, true);
    }

    public void f7l8(boolean z2) {
        this.f4592k.mo4118n(z2);
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    /* JADX INFO: renamed from: g */
    public void m4111g(int i2) {
        this.f51197zy = i2;
        this.f4592k.mo4119q(i2);
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    /* JADX INFO: renamed from: k */
    public int m4112k() {
        return this.f51197zy;
    }

    @dd
    /* JADX INFO: renamed from: n */
    public InputConnection m4113n(@dd InputConnection inputConnection, @lvui EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f4592k.zy(inputConnection, editorInfo);
    }

    /* JADX INFO: renamed from: q */
    public boolean m4114q() {
        return this.f4592k.toq();
    }

    @dd
    public KeyListener toq(@dd KeyListener keyListener) {
        return this.f4592k.mo4117k(keyListener);
    }

    /* JADX INFO: renamed from: y */
    public void m4115y(@a9(from = 0) int i2) {
        n7h.m2977p(i2, "maxEmojiCount should be greater than 0");
        this.f51196toq = i2;
        this.f4592k.mo4116g(i2);
    }

    public int zy() {
        return this.f51196toq;
    }

    public C0840k(@lvui EditText editText, boolean z2) {
        this.f51196toq = Integer.MAX_VALUE;
        this.f51197zy = 0;
        n7h.qrj(editText, "editText cannot be null");
        this.f4592k = new k(editText, z2);
    }
}
