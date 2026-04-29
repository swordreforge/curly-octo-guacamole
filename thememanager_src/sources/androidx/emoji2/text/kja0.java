package androidx.emoji2.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.core.os.zurt;
import androidx.emoji2.text.flatbuffer.C0809h;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import zy.InterfaceC7840q;
import zy.hyr;
import zy.lvui;
import zy.uv6;
import zy.yz;

/* JADX INFO: compiled from: MetadataRepo.java */
/* JADX INFO: loaded from: classes.dex */
@hyr(19)
@InterfaceC7840q
public final class kja0 {

    /* JADX INFO: renamed from: g */
    private static final String f4510g = "EmojiCompat.MetadataRepo.create";

    /* JADX INFO: renamed from: n */
    private static final int f4511n = 1024;

    /* JADX INFO: renamed from: k */
    @lvui
    private final C0809h f4512k;

    /* JADX INFO: renamed from: q */
    @lvui
    private final Typeface f4513q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @lvui
    private final char[] f51142toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @lvui
    private final C0826k f51143zy = new C0826k(1024);

    /* JADX INFO: renamed from: androidx.emoji2.text.kja0$k */
    /* JADX INFO: compiled from: MetadataRepo.java */
    @uv6({uv6.EnumC7844k.LIBRARY})
    static class C0826k {

        /* JADX INFO: renamed from: k */
        private final SparseArray<C0826k> f4514k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private C0836y f51144toq;

        private C0826k() {
            this(1);
        }

        /* JADX INFO: renamed from: k */
        C0826k m4021k(int i2) {
            SparseArray<C0826k> sparseArray = this.f4514k;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i2);
        }

        final C0836y toq() {
            return this.f51144toq;
        }

        void zy(@lvui C0836y c0836y, int i2, int i3) {
            C0826k c0826kM4021k = m4021k(c0836y.toq(i2));
            if (c0826kM4021k == null) {
                c0826kM4021k = new C0826k();
                this.f4514k.put(c0836y.toq(i2), c0826kM4021k);
            }
            if (i3 > i2) {
                c0826kM4021k.zy(c0836y, i2 + 1, i3);
            } else {
                c0826kM4021k.f51144toq = c0836y;
            }
        }

        C0826k(int i2) {
            this.f4514k = new SparseArray<>(i2);
        }
    }

    private kja0(@lvui Typeface typeface, @lvui C0809h c0809h) {
        this.f4513q = typeface;
        this.f4512k = c0809h;
        this.f51142toq = new char[c0809h.eqxt() * 2];
        m4014k(c0809h);
    }

    /* JADX INFO: renamed from: k */
    private void m4014k(C0809h c0809h) {
        int iEqxt = c0809h.eqxt();
        for (int i2 = 0; i2 < iEqxt; i2++) {
            C0836y c0836y = new C0836y(this, i2);
            Character.toChars(c0836y.f7l8(), this.f51142toq, i2 * 2);
            ld6(c0836y);
        }
    }

    @lvui
    /* JADX INFO: renamed from: n */
    public static kja0 m4015n(@lvui Typeface typeface, @lvui ByteBuffer byteBuffer) throws IOException {
        try {
            zurt.toq(f4510g);
            return new kja0(typeface, n7h.m4056q(byteBuffer));
        } finally {
            zurt.m2775q();
        }
    }

    @lvui
    /* JADX INFO: renamed from: q */
    public static kja0 m4016q(@lvui Typeface typeface, @lvui InputStream inputStream) throws IOException {
        try {
            zurt.toq(f4510g);
            return new kja0(typeface, n7h.zy(inputStream));
        } finally {
            zurt.m2775q();
        }
    }

    @lvui
    public static kja0 toq(@lvui AssetManager assetManager, @lvui String str) throws IOException {
        try {
            zurt.toq(f4510g);
            return new kja0(Typeface.createFromAsset(assetManager, str), n7h.toq(assetManager, str));
        } finally {
            zurt.m2775q();
        }
    }

    @lvui
    @uv6({uv6.EnumC7844k.TESTS})
    public static kja0 zy(@lvui Typeface typeface) {
        try {
            zurt.toq(f4510g);
            return new kja0(typeface, new C0809h());
        } finally {
            zurt.m2775q();
        }
    }

    @lvui
    @uv6({uv6.EnumC7844k.LIBRARY})
    public C0809h f7l8() {
        return this.f4512k;
    }

    @lvui
    @uv6({uv6.EnumC7844k.LIBRARY})
    /* JADX INFO: renamed from: g */
    public char[] m4017g() {
        return this.f51142toq;
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    @yz
    void ld6(@lvui C0836y c0836y) {
        androidx.core.util.n7h.qrj(c0836y, "emoji metadata cannot be null");
        androidx.core.util.n7h.toq(c0836y.zy() > 0, "invalid metadata codepoint length");
        this.f51143zy.zy(c0836y, 0, c0836y.zy() - 1);
    }

    @lvui
    @uv6({uv6.EnumC7844k.LIBRARY})
    /* JADX INFO: renamed from: p */
    Typeface m4018p() {
        return this.f4513q;
    }

    @lvui
    @uv6({uv6.EnumC7844k.LIBRARY})
    /* JADX INFO: renamed from: s */
    C0826k m4019s() {
        return this.f51143zy;
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    /* JADX INFO: renamed from: y */
    int m4020y() {
        return this.f4512k.n5r1();
    }
}
