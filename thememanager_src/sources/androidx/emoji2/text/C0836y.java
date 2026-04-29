package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import zy.InterfaceC7840q;
import zy.a9;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.emoji2.text.y */
/* JADX INFO: compiled from: EmojiMetadata.java */
/* JADX INFO: loaded from: classes.dex */
@hyr(19)
@InterfaceC7840q
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class C0836y {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final ThreadLocal<androidx.emoji2.text.flatbuffer.kja0> f51191f7l8 = new ThreadLocal<>();

    /* JADX INFO: renamed from: g */
    public static final int f4577g = 2;

    /* JADX INFO: renamed from: n */
    public static final int f4578n = 1;

    /* JADX INFO: renamed from: q */
    public static final int f4579q = 0;

    /* JADX INFO: renamed from: k */
    private final int f4580k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @lvui
    private final kja0 f51192toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private volatile int f51193zy = 0;

    /* JADX INFO: renamed from: androidx.emoji2.text.y$k */
    /* JADX INFO: compiled from: EmojiMetadata.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface k {
    }

    C0836y(@lvui kja0 kja0Var, @a9(from = 0) int i2) {
        this.f51192toq = kja0Var;
        this.f4580k = i2;
    }

    /* JADX INFO: renamed from: y */
    private androidx.emoji2.text.flatbuffer.kja0 m4083y() {
        ThreadLocal<androidx.emoji2.text.flatbuffer.kja0> threadLocal = f51191f7l8;
        androidx.emoji2.text.flatbuffer.kja0 kja0Var = threadLocal.get();
        if (kja0Var == null) {
            kja0Var = new androidx.emoji2.text.flatbuffer.kja0();
            threadLocal.set(kja0Var);
        }
        this.f51192toq.f7l8().oc(kja0Var, this.f4580k);
        return kja0Var;
    }

    public int f7l8() {
        return m4083y().hyr();
    }

    /* JADX INFO: renamed from: g */
    public short m4084g() {
        return m4083y().n5r1();
    }

    /* JADX INFO: renamed from: k */
    public void m4085k(@lvui Canvas canvas, float f2, float f3, @lvui Paint paint) {
        Typeface typefaceM4018p = this.f51192toq.m4018p();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceM4018p);
        canvas.drawText(this.f51192toq.m4017g(), this.f4580k * 2, 2, f2, f3, paint);
        paint.setTypeface(typeface);
    }

    public short ld6() {
        return m4083y().uv6();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    /* JADX INFO: renamed from: n */
    public int m4086n() {
        return this.f51193zy;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void n7h(boolean z2) {
        this.f51193zy = z2 ? 2 : 1;
    }

    @lvui
    /* JADX INFO: renamed from: p */
    public Typeface m4087p() {
        return this.f51192toq.m4018p();
    }

    /* JADX INFO: renamed from: q */
    public short m4088q() {
        return m4083y().d2ok();
    }

    @uv6({uv6.EnumC7844k.TESTS})
    public void qrj() {
        this.f51193zy = 0;
    }

    /* JADX INFO: renamed from: s */
    public short m4089s() {
        return m4083y().m3902f();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(f7l8()));
        sb.append(", codepoints:");
        int iZy = zy();
        for (int i2 = 0; i2 < iZy; i2++) {
            sb.append(Integer.toHexString(toq(i2)));
            sb.append(" ");
        }
        return sb.toString();
    }

    public int toq(int i2) {
        return m4083y().fti(i2);
    }

    public boolean x2() {
        return m4083y().dd();
    }

    public int zy() {
        return m4083y().d3();
    }
}
