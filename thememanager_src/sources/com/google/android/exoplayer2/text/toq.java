package com.google.android.exoplayer2.text;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.google.android.exoplayer2.InterfaceC3555s;
import com.google.android.exoplayer2.util.C3844k;
import com.google.common.base.C4280z;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.dataflow.qual.Pure;
import zy.dd;

/* JADX INFO: compiled from: Cue.java */
/* JADX INFO: loaded from: classes2.dex */
public final class toq implements InterfaceC3555s {

    /* JADX INFO: renamed from: a */
    public static final int f21983a = 0;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    public static final int f65764ab = 2;
    private static final int ac = 11;
    private static final int ad = 12;
    private static final int aj = 16;
    private static final int am = 13;
    private static final int an = 1;
    private static final int as = 5;
    private static final int ax = 9;
    private static final int ay = 14;
    private static final int az = 7;

    /* JADX INFO: renamed from: b */
    public static final int f21984b = Integer.MIN_VALUE;
    private static final int ba = 8;
    public static final int bb = 1;
    private static final int be = 15;
    private static final int bg = 6;
    private static final int bl = 4;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    public static final int f65765bo = 0;
    public static final int bp = 2;
    private static final int bq = 10;
    private static final int bv = 0;

    /* JADX INFO: renamed from: d */
    public static final int f21985d = 0;
    private static final int id = 2;
    private static final int in = 3;

    /* JADX INFO: renamed from: m */
    public static final float f21986m = -3.4028235E38f;

    /* JADX INFO: renamed from: u */
    public static final int f21988u = 2;

    /* JADX INFO: renamed from: v */
    public static final int f21989v = 1;

    /* JADX INFO: renamed from: w */
    public static final int f21990w = 1;

    /* JADX INFO: renamed from: x */
    public static final int f21991x = 1;

    /* JADX INFO: renamed from: c */
    public final float f21992c;

    /* JADX INFO: renamed from: e */
    public final int f21993e;

    /* JADX INFO: renamed from: f */
    public final int f21994f;

    /* JADX INFO: renamed from: g */
    @dd
    public final Bitmap f21995g;

    /* JADX INFO: renamed from: h */
    public final float f21996h;

    /* JADX INFO: renamed from: i */
    public final int f21997i;

    /* JADX INFO: renamed from: j */
    public final float f21998j;

    /* JADX INFO: renamed from: k */
    @dd
    public final CharSequence f21999k;

    /* JADX INFO: renamed from: l */
    public final int f22000l;

    /* JADX INFO: renamed from: n */
    @dd
    public final Layout.Alignment f22001n;

    /* JADX INFO: renamed from: p */
    public final int f22002p;

    /* JADX INFO: renamed from: q */
    @dd
    public final Layout.Alignment f22003q;

    /* JADX INFO: renamed from: r */
    public final boolean f22004r;

    /* JADX INFO: renamed from: s */
    public final int f22005s;

    /* JADX INFO: renamed from: t */
    public final float f22006t;

    /* JADX INFO: renamed from: y */
    public final float f22007y;

    /* JADX INFO: renamed from: z */
    public final float f22008z;

    /* JADX INFO: renamed from: o */
    public static final toq f21987o = new zy().wvg("").m12938k();
    public static final InterfaceC3555s.k<toq> bs = new InterfaceC3555s.k() { // from class: com.google.android.exoplayer2.text.k
        @Override // com.google.android.exoplayer2.InterfaceC3555s.k
        /* JADX INFO: renamed from: k */
        public final InterfaceC3555s mo11492k(Bundle bundle) {
            return toq.zy(bundle);
        }
    };

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.toq$g */
    /* JADX INFO: compiled from: Cue.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3670g {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.toq$n */
    /* JADX INFO: compiled from: Cue.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3672n {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.toq$q */
    /* JADX INFO: compiled from: Cue.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3673q {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Cue.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC7963toq {
    }

    /* JADX INFO: compiled from: Cue.java */
    public static final class zy {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        private float f65766cdj;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private int f65767f7l8;

        /* JADX INFO: renamed from: g */
        private int f22009g;

        /* JADX INFO: renamed from: h */
        private int f22010h;

        /* JADX INFO: renamed from: k */
        @dd
        private CharSequence f22011k;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        @zy.x2
        private int f65768kja0;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private float f65769ld6;

        /* JADX INFO: renamed from: n */
        private float f22012n;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private boolean f65770n7h;

        /* JADX INFO: renamed from: p */
        private int f22013p;

        /* JADX INFO: renamed from: q */
        @dd
        private Layout.Alignment f22014q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private float f65771qrj;

        /* JADX INFO: renamed from: s */
        private int f22015s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @dd
        private Bitmap f65772toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private float f65773x2;

        /* JADX INFO: renamed from: y */
        private float f22016y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @dd
        private Layout.Alignment f65774zy;

        public zy a9(@zy.x2 int i2) {
            this.f65768kja0 = i2;
            this.f65770n7h = true;
            return this;
        }

        public boolean cdj() {
            return this.f65770n7h;
        }

        @Pure
        public int f7l8() {
            return this.f22009g;
        }

        public zy fn3e(int i2) {
            this.f65767f7l8 = i2;
            return this;
        }

        public zy fu4(int i2) {
            this.f22015s = i2;
            return this;
        }

        @Pure
        /* JADX INFO: renamed from: g */
        public int m12935g() {
            return this.f65767f7l8;
        }

        @zy.x2
        @Pure
        /* JADX INFO: renamed from: h */
        public int m12936h() {
            return this.f65768kja0;
        }

        /* JADX INFO: renamed from: i */
        public zy m12937i(float f2, int i2) {
            this.f22012n = f2;
            this.f22009g = i2;
            return this;
        }

        public zy jk(int i2) {
            this.f22010h = i2;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public toq m12938k() {
            return new toq(this.f22011k, this.f65774zy, this.f22014q, this.f65772toq, this.f22012n, this.f22009g, this.f65767f7l8, this.f22016y, this.f22015s, this.f22013p, this.f65769ld6, this.f65773x2, this.f65771qrj, this.f65770n7h, this.f65768kja0, this.f22010h, this.f65766cdj);
        }

        public zy ki(Bitmap bitmap) {
            this.f65772toq = bitmap;
            return this;
        }

        @Pure
        public int kja0() {
            return this.f22010h;
        }

        @Pure
        @dd
        public CharSequence ld6() {
            return this.f22011k;
        }

        public zy mcp(float f2, int i2) {
            this.f65769ld6 = f2;
            this.f22013p = i2;
            return this;
        }

        @Pure
        /* JADX INFO: renamed from: n */
        public float m12939n() {
            return this.f22012n;
        }

        @Pure
        public int n7h() {
            return this.f22013p;
        }

        public zy ni7(float f2) {
            this.f22016y = f2;
            return this;
        }

        public zy o1t(float f2) {
            this.f65773x2 = f2;
            return this;
        }

        @Pure
        /* JADX INFO: renamed from: p */
        public float m12940p() {
            return this.f65773x2;
        }

        @Pure
        /* JADX INFO: renamed from: q */
        public float m12941q() {
            return this.f65771qrj;
        }

        @Pure
        public float qrj() {
            return this.f65769ld6;
        }

        @Pure
        /* JADX INFO: renamed from: s */
        public int m12942s() {
            return this.f22015s;
        }

        /* JADX INFO: renamed from: t */
        public zy m12943t(@dd Layout.Alignment alignment) {
            this.f65774zy = alignment;
            return this;
        }

        public zy t8r(float f2) {
            this.f65771qrj = f2;
            return this;
        }

        public zy toq() {
            this.f65770n7h = false;
            return this;
        }

        public zy wvg(CharSequence charSequence) {
            this.f22011k = charSequence;
            return this;
        }

        @Pure
        @dd
        public Layout.Alignment x2() {
            return this.f65774zy;
        }

        @Pure
        /* JADX INFO: renamed from: y */
        public float m12944y() {
            return this.f22016y;
        }

        /* JADX INFO: renamed from: z */
        public zy m12945z(float f2) {
            this.f65766cdj = f2;
            return this;
        }

        public zy zurt(@dd Layout.Alignment alignment) {
            this.f22014q = alignment;
            return this;
        }

        @Pure
        @dd
        public Bitmap zy() {
            return this.f65772toq;
        }

        public zy() {
            this.f22011k = null;
            this.f65772toq = null;
            this.f65774zy = null;
            this.f22014q = null;
            this.f22012n = -3.4028235E38f;
            this.f22009g = Integer.MIN_VALUE;
            this.f65767f7l8 = Integer.MIN_VALUE;
            this.f22016y = -3.4028235E38f;
            this.f22015s = Integer.MIN_VALUE;
            this.f22013p = Integer.MIN_VALUE;
            this.f65769ld6 = -3.4028235E38f;
            this.f65773x2 = -3.4028235E38f;
            this.f65771qrj = -3.4028235E38f;
            this.f65770n7h = false;
            this.f65768kja0 = -16777216;
            this.f22010h = Integer.MIN_VALUE;
        }

        private zy(toq toqVar) {
            this.f22011k = toqVar.f21999k;
            this.f65772toq = toqVar.f21995g;
            this.f65774zy = toqVar.f22003q;
            this.f22014q = toqVar.f22001n;
            this.f22012n = toqVar.f22007y;
            this.f22009g = toqVar.f22005s;
            this.f65767f7l8 = toqVar.f22002p;
            this.f22016y = toqVar.f21996h;
            this.f22015s = toqVar.f21997i;
            this.f22013p = toqVar.f21994f;
            this.f65769ld6 = toqVar.f21992c;
            this.f65773x2 = toqVar.f22008z;
            this.f65771qrj = toqVar.f22006t;
            this.f65770n7h = toqVar.f22004r;
            this.f65768kja0 = toqVar.f22000l;
            this.f22010h = toqVar.f21993e;
            this.f65766cdj = toqVar.f21998j;
        }
    }

    /* JADX INFO: renamed from: q */
    private static String m12934q(int i2) {
        return Integer.toString(i2, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final toq zy(Bundle bundle) {
        zy zyVar = new zy();
        CharSequence charSequence = bundle.getCharSequence(m12934q(0));
        if (charSequence != null) {
            zyVar.wvg(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(m12934q(1));
        if (alignment != null) {
            zyVar.m12943t(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(m12934q(2));
        if (alignment2 != null) {
            zyVar.zurt(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(m12934q(3));
        if (bitmap != null) {
            zyVar.ki(bitmap);
        }
        if (bundle.containsKey(m12934q(4)) && bundle.containsKey(m12934q(5))) {
            zyVar.m12937i(bundle.getFloat(m12934q(4)), bundle.getInt(m12934q(5)));
        }
        if (bundle.containsKey(m12934q(6))) {
            zyVar.fn3e(bundle.getInt(m12934q(6)));
        }
        if (bundle.containsKey(m12934q(7))) {
            zyVar.ni7(bundle.getFloat(m12934q(7)));
        }
        if (bundle.containsKey(m12934q(8))) {
            zyVar.fu4(bundle.getInt(m12934q(8)));
        }
        if (bundle.containsKey(m12934q(10)) && bundle.containsKey(m12934q(9))) {
            zyVar.mcp(bundle.getFloat(m12934q(10)), bundle.getInt(m12934q(9)));
        }
        if (bundle.containsKey(m12934q(11))) {
            zyVar.o1t(bundle.getFloat(m12934q(11)));
        }
        if (bundle.containsKey(m12934q(12))) {
            zyVar.t8r(bundle.getFloat(m12934q(12)));
        }
        if (bundle.containsKey(m12934q(13))) {
            zyVar.a9(bundle.getInt(m12934q(13)));
        }
        if (!bundle.getBoolean(m12934q(14), false)) {
            zyVar.toq();
        }
        if (bundle.containsKey(m12934q(15))) {
            zyVar.jk(bundle.getInt(m12934q(15)));
        }
        if (bundle.containsKey(m12934q(16))) {
            zyVar.m12945z(bundle.getFloat(m12934q(16)));
        }
        return zyVar.m12938k();
    }

    public boolean equals(@dd Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || toq.class != obj.getClass()) {
            return false;
        }
        toq toqVar = (toq) obj;
        return TextUtils.equals(this.f21999k, toqVar.f21999k) && this.f22003q == toqVar.f22003q && this.f22001n == toqVar.f22001n && ((bitmap = this.f21995g) != null ? !((bitmap2 = toqVar.f21995g) == null || !bitmap.sameAs(bitmap2)) : toqVar.f21995g == null) && this.f22007y == toqVar.f22007y && this.f22005s == toqVar.f22005s && this.f22002p == toqVar.f22002p && this.f21996h == toqVar.f21996h && this.f21997i == toqVar.f21997i && this.f22008z == toqVar.f22008z && this.f22006t == toqVar.f22006t && this.f22004r == toqVar.f22004r && this.f22000l == toqVar.f22000l && this.f21994f == toqVar.f21994f && this.f21992c == toqVar.f21992c && this.f21993e == toqVar.f21993e && this.f21998j == toqVar.f21998j;
    }

    public int hashCode() {
        return C4280z.toq(this.f21999k, this.f22003q, this.f22001n, this.f21995g, Float.valueOf(this.f22007y), Integer.valueOf(this.f22005s), Integer.valueOf(this.f22002p), Float.valueOf(this.f21996h), Integer.valueOf(this.f21997i), Float.valueOf(this.f22008z), Float.valueOf(this.f22006t), Boolean.valueOf(this.f22004r), Integer.valueOf(this.f22000l), Integer.valueOf(this.f21994f), Float.valueOf(this.f21992c), Integer.valueOf(this.f21993e), Float.valueOf(this.f21998j));
    }

    @Override // com.google.android.exoplayer2.InterfaceC3555s
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(m12934q(0), this.f21999k);
        bundle.putSerializable(m12934q(1), this.f22003q);
        bundle.putSerializable(m12934q(2), this.f22001n);
        bundle.putParcelable(m12934q(3), this.f21995g);
        bundle.putFloat(m12934q(4), this.f22007y);
        bundle.putInt(m12934q(5), this.f22005s);
        bundle.putInt(m12934q(6), this.f22002p);
        bundle.putFloat(m12934q(7), this.f21996h);
        bundle.putInt(m12934q(8), this.f21997i);
        bundle.putInt(m12934q(9), this.f21994f);
        bundle.putFloat(m12934q(10), this.f21992c);
        bundle.putFloat(m12934q(11), this.f22008z);
        bundle.putFloat(m12934q(12), this.f22006t);
        bundle.putBoolean(m12934q(14), this.f22004r);
        bundle.putInt(m12934q(13), this.f22000l);
        bundle.putInt(m12934q(15), this.f21993e);
        bundle.putFloat(m12934q(16), this.f21998j);
        return bundle;
    }

    public zy toq() {
        return new zy();
    }

    @Deprecated
    public toq(CharSequence charSequence) {
        this(charSequence, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f);
    }

    @Deprecated
    public toq(CharSequence charSequence, @dd Layout.Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4) {
        this(charSequence, alignment, f2, i2, i3, f3, i4, f4, false, -16777216);
    }

    @Deprecated
    public toq(CharSequence charSequence, @dd Layout.Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4, int i5, float f5) {
        this(charSequence, alignment, null, null, f2, i2, i3, f3, i4, i5, f5, f4, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    @Deprecated
    public toq(CharSequence charSequence, @dd Layout.Alignment alignment, float f2, int i2, int i3, float f3, int i4, float f4, boolean z2, int i5) {
        this(charSequence, alignment, null, null, f2, i2, i3, f3, i4, Integer.MIN_VALUE, -3.4028235E38f, f4, -3.4028235E38f, z2, i5, Integer.MIN_VALUE, 0.0f);
    }

    private toq(@dd CharSequence charSequence, @dd Layout.Alignment alignment, @dd Layout.Alignment alignment2, @dd Bitmap bitmap, float f2, int i2, int i3, float f3, int i4, int i5, float f4, float f5, float f6, boolean z2, int i6, int i7, float f7) {
        if (charSequence == null) {
            C3844k.f7l8(bitmap);
        } else {
            C3844k.m13629k(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f21999k = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f21999k = charSequence.toString();
        } else {
            this.f21999k = null;
        }
        this.f22003q = alignment;
        this.f22001n = alignment2;
        this.f21995g = bitmap;
        this.f22007y = f2;
        this.f22005s = i2;
        this.f22002p = i3;
        this.f21996h = f3;
        this.f21997i = i4;
        this.f22008z = f5;
        this.f22006t = f6;
        this.f22004r = z2;
        this.f22000l = i6;
        this.f21994f = i5;
        this.f21992c = f4;
        this.f21993e = i7;
        this.f21998j = f7;
    }
}
