package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import zy.a9;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: TypefaceEmojiSpan.java */
/* JADX INFO: loaded from: classes.dex */
@hyr(19)
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public final class cdj extends AbstractC0833p {

    /* JADX INFO: renamed from: s */
    @dd
    private static Paint f4435s;

    public cdj(@lvui C0836y c0836y) {
        super(c0836y);
    }

    @lvui
    /* JADX INFO: renamed from: g */
    private static Paint m3866g() {
        if (f4435s == null) {
            TextPaint textPaint = new TextPaint();
            f4435s = textPaint;
            textPaint.setColor(C0830n.toq().m4036q());
            f4435s.setStyle(Paint.Style.FILL);
        }
        return f4435s;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@lvui Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, @a9(from = 0) int i2, @a9(from = 0) int i3, float f2, int i4, int i5, int i6, @lvui Paint paint) {
        if (C0830n.toq().n7h()) {
            canvas.drawRect(f2, i4, f2 + m4062n(), i6, m3866g());
        }
        zy().m4085k(canvas, f2, i5, paint);
    }
}
