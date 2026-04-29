package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.emoji2.text.p */
/* JADX INFO: compiled from: EmojiSpan.java */
/* JADX INFO: loaded from: classes.dex */
@hyr(19)
public abstract class AbstractC0833p extends ReplacementSpan {

    /* JADX INFO: renamed from: q */
    @lvui
    private final C0836y f4556q;

    /* JADX INFO: renamed from: k */
    private final Paint.FontMetricsInt f4554k = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: n */
    private short f4555n = -1;

    /* JADX INFO: renamed from: g */
    private short f4553g = -1;

    /* JADX INFO: renamed from: y */
    private float f4557y = 1.0f;

    @uv6({uv6.EnumC7844k.LIBRARY})
    AbstractC0833p(@lvui C0836y c0836y) {
        androidx.core.util.n7h.qrj(c0836y, "metadata cannot be null");
        this.f4556q = c0836y;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@lvui Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i2, int i3, @dd Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f4554k);
        Paint.FontMetricsInt fontMetricsInt2 = this.f4554k;
        this.f4557y = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f4556q.m4084g();
        this.f4553g = (short) (this.f4556q.m4084g() * this.f4557y);
        short sLd6 = (short) (this.f4556q.ld6() * this.f4557y);
        this.f4555n = sLd6;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f4554k;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sLd6;
    }

    @uv6({uv6.EnumC7844k.TESTS})
    /* JADX INFO: renamed from: k */
    public final int m4061k() {
        return this.f4553g;
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    /* JADX INFO: renamed from: n */
    final int m4062n() {
        return this.f4555n;
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    /* JADX INFO: renamed from: q */
    final float m4063q() {
        return this.f4557y;
    }

    @uv6({uv6.EnumC7844k.TESTS})
    public final int toq() {
        return zy().f7l8();
    }

    @lvui
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public final C0836y zy() {
        return this.f4556q;
    }
}
