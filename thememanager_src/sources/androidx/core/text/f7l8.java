package androidx.core.text;

import android.annotation.NonNull;
import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.core.os.zurt;
import androidx.core.util.C0642s;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import zy.a9;
import zy.dd;
import zy.ek5k;
import zy.hyr;
import zy.lvui;
import zy.o1t;
import zy.uv6;

/* JADX INFO: compiled from: PrecomputedTextCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class f7l8 implements Spannable {

    /* JADX INFO: renamed from: p */
    @o1t("sLock")
    @lvui
    private static Executor f3800p = null;

    /* JADX INFO: renamed from: s */
    private static final Object f3801s = new Object();

    /* JADX INFO: renamed from: y */
    private static final char f3802y = '\n';

    /* JADX INFO: renamed from: g */
    @dd
    private final PrecomputedText f3803g;

    /* JADX INFO: renamed from: k */
    @lvui
    private final Spannable f3804k;

    /* JADX INFO: renamed from: n */
    @lvui
    private final int[] f3805n;

    /* JADX INFO: renamed from: q */
    @lvui
    private final C0613k f3806q;

    /* JADX INFO: compiled from: PrecomputedTextCompat.java */
    private static class toq extends FutureTask<f7l8> {

        /* JADX INFO: renamed from: androidx.core.text.f7l8$toq$k */
        /* JADX INFO: compiled from: PrecomputedTextCompat.java */
        private static class CallableC0614k implements Callable<f7l8> {

            /* JADX INFO: renamed from: k */
            private C0613k f3812k;

            /* JADX INFO: renamed from: q */
            private CharSequence f3813q;

            CallableC0614k(@lvui C0613k c0613k, @lvui CharSequence charSequence) {
                this.f3812k = c0613k;
                this.f3813q = charSequence;
            }

            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public f7l8 call() throws Exception {
                return f7l8.m2848k(this.f3813q, this.f3812k);
            }
        }

        toq(@lvui C0613k c0613k, @lvui CharSequence charSequence) {
            super(new CallableC0614k(c0613k, charSequence));
        }
    }

    private f7l8(@lvui CharSequence charSequence, @lvui C0613k c0613k, @lvui int[] iArr) {
        this.f3804k = new SpannableString(charSequence);
        this.f3806q = c0613k;
        this.f3805n = iArr;
        this.f3803g = null;
    }

    @ek5k
    public static Future<f7l8> f7l8(@lvui CharSequence charSequence, @lvui C0613k c0613k, @dd Executor executor) {
        toq toqVar = new toq(c0613k, charSequence);
        if (executor == null) {
            synchronized (f3801s) {
                if (f3800p == null) {
                    f3800p = Executors.newFixedThreadPool(1);
                }
                executor = f3800p;
            }
        }
        executor.execute(toqVar);
        return toqVar;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: k */
    public static f7l8 m2848k(@lvui CharSequence charSequence, @lvui C0613k c0613k) {
        PrecomputedText.Params params;
        androidx.core.util.n7h.x2(charSequence);
        androidx.core.util.n7h.x2(c0613k);
        try {
            zurt.toq("PrecomputedText");
            if (Build.VERSION.SDK_INT >= 29 && (params = c0613k.f3808n) != null) {
                return new f7l8(PrecomputedText.create(charSequence, params), c0613k);
            }
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int i2 = 0;
            while (i2 < length) {
                int iIndexOf = TextUtils.indexOf(charSequence, f3802y, i2, length);
                i2 = iIndexOf < 0 ? length : iIndexOf + 1;
                arrayList.add(Integer.valueOf(i2));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                iArr[i3] = ((Integer) arrayList.get(i3)).intValue();
            }
            StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), c0613k.m2853n(), Integer.MAX_VALUE).setBreakStrategy(c0613k.toq()).setHyphenationFrequency(c0613k.zy()).setTextDirection(c0613k.m2854q()).build();
            return new f7l8(charSequence, c0613k, iArr);
        } finally {
            zurt.m2775q();
        }
    }

    @Override // java.lang.CharSequence
    public char charAt(int i2) {
        return this.f3804k.charAt(i2);
    }

    @hyr(28)
    @dd
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: g */
    public PrecomputedText m2849g() {
        Spannable spannable = this.f3804k;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f3804k.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f3804k.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f3804k.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i2, int i3, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f3803g.getSpans(i2, i3, cls) : (T[]) this.f3804k.getSpans(i2, i3, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f3804k.length();
    }

    @lvui
    /* JADX INFO: renamed from: n */
    public C0613k m2850n() {
        return this.f3806q;
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i2, int i3, Class cls) {
        return this.f3804k.nextSpanTransition(i2, i3, cls);
    }

    @a9(from = 0)
    /* JADX INFO: renamed from: q */
    public int m2851q(@a9(from = 0) int i2) {
        androidx.core.util.n7h.f7l8(i2, 0, toq(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f3803g.getParagraphStart(i2);
        }
        if (i2 == 0) {
            return 0;
        }
        return this.f3805n[i2 - 1];
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3803g.removeSpan(obj);
        } else {
            this.f3804k.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i2, int i3, int i4) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3803g.setSpan(obj, i2, i3, i4);
        } else {
            this.f3804k.setSpan(obj, i2, i3, i4);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i2, int i3) {
        return this.f3804k.subSequence(i2, i3);
    }

    @Override // java.lang.CharSequence
    @lvui
    public String toString() {
        return this.f3804k.toString();
    }

    @a9(from = 0)
    public int toq() {
        return Build.VERSION.SDK_INT >= 29 ? this.f3803g.getParagraphCount() : this.f3805n.length;
    }

    @a9(from = 0)
    public int zy(@a9(from = 0) int i2) {
        androidx.core.util.n7h.f7l8(i2, 0, toq(), "paraIndex");
        return Build.VERSION.SDK_INT >= 29 ? this.f3803g.getParagraphEnd(i2) : this.f3805n[i2];
    }

    @hyr(28)
    private f7l8(@lvui PrecomputedText precomputedText, @lvui C0613k c0613k) {
        this.f3804k = precomputedText;
        this.f3806q = c0613k;
        this.f3805n = null;
        this.f3803g = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    /* JADX INFO: renamed from: androidx.core.text.f7l8$k */
    /* JADX INFO: compiled from: PrecomputedTextCompat.java */
    public static final class C0613k {

        /* JADX INFO: renamed from: k */
        @lvui
        private final TextPaint f3807k;

        /* JADX INFO: renamed from: n */
        final PrecomputedText.Params f3808n;

        /* JADX INFO: renamed from: q */
        private final int f3809q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @dd
        private final TextDirectionHeuristic f50575toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int f50576zy;

        /* JADX INFO: renamed from: androidx.core.text.f7l8$k$k */
        /* JADX INFO: compiled from: PrecomputedTextCompat.java */
        public static class k {

            /* JADX INFO: renamed from: k */
            @lvui
            private final TextPaint f3810k;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            private int f50578zy = 1;

            /* JADX INFO: renamed from: q */
            private int f3811q = 1;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            private TextDirectionHeuristic f50577toq = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public k(@lvui TextPaint textPaint) {
                this.f3810k = textPaint;
            }

            @lvui
            /* JADX INFO: renamed from: k */
            public C0613k m2855k() {
                return new C0613k(this.f3810k, this.f50577toq, this.f50578zy, this.f3811q);
            }

            @hyr(18)
            /* JADX INFO: renamed from: q */
            public k m2856q(@lvui TextDirectionHeuristic textDirectionHeuristic) {
                this.f50577toq = textDirectionHeuristic;
                return this;
            }

            @hyr(23)
            public k toq(int i2) {
                this.f50578zy = i2;
                return this;
            }

            @hyr(23)
            public k zy(int i2) {
                this.f3811q = i2;
                return this;
            }
        }

        C0613k(@lvui TextPaint textPaint, @lvui TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f3808n = new Object(textPaint) { // from class: android.text.PrecomputedText.Params.Builder
                    static {
                        throw new NoClassDefFoundError();
                    }

                    public /* synthetic */ Builder(@NonNull TextPaint textPaint2) {
                    }

                    @NonNull
                    public native /* synthetic */ Params build();

                    public native /* synthetic */ Builder setBreakStrategy(int i4);

                    public native /* synthetic */ Builder setHyphenationFrequency(int i4);

                    public native /* synthetic */ Builder setTextDirection(@NonNull TextDirectionHeuristic textDirectionHeuristic2);
                }.setBreakStrategy(i2).setHyphenationFrequency(i3).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f3808n = null;
            }
            this.f3807k = textPaint2;
            this.f50575toq = textDirectionHeuristic;
            this.f50576zy = i2;
            this.f3809q = i3;
        }

        public boolean equals(@dd Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0613k)) {
                return false;
            }
            C0613k c0613k = (C0613k) obj;
            return m2852k(c0613k) && this.f50575toq == c0613k.m2854q();
        }

        public int hashCode() {
            return C0642s.toq(Float.valueOf(this.f3807k.getTextSize()), Float.valueOf(this.f3807k.getTextScaleX()), Float.valueOf(this.f3807k.getTextSkewX()), Float.valueOf(this.f3807k.getLetterSpacing()), Integer.valueOf(this.f3807k.getFlags()), this.f3807k.getTextLocales(), this.f3807k.getTypeface(), Boolean.valueOf(this.f3807k.isElegantTextHeight()), this.f50575toq, Integer.valueOf(this.f50576zy), Integer.valueOf(this.f3809q));
        }

        @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: k */
        public boolean m2852k(@lvui C0613k c0613k) {
            if (this.f50576zy == c0613k.toq() && this.f3809q == c0613k.zy() && this.f3807k.getTextSize() == c0613k.m2853n().getTextSize() && this.f3807k.getTextScaleX() == c0613k.m2853n().getTextScaleX() && this.f3807k.getTextSkewX() == c0613k.m2853n().getTextSkewX() && this.f3807k.getLetterSpacing() == c0613k.m2853n().getLetterSpacing() && TextUtils.equals(this.f3807k.getFontFeatureSettings(), c0613k.m2853n().getFontFeatureSettings()) && this.f3807k.getFlags() == c0613k.m2853n().getFlags() && this.f3807k.getTextLocales().equals(c0613k.m2853n().getTextLocales())) {
                return this.f3807k.getTypeface() == null ? c0613k.m2853n().getTypeface() == null : this.f3807k.getTypeface().equals(c0613k.m2853n().getTypeface());
            }
            return false;
        }

        @lvui
        /* JADX INFO: renamed from: n */
        public TextPaint m2853n() {
            return this.f3807k;
        }

        @hyr(18)
        @dd
        /* JADX INFO: renamed from: q */
        public TextDirectionHeuristic m2854q() {
            return this.f50575toq;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f3807k.getTextSize());
            sb.append(", textScaleX=" + this.f3807k.getTextScaleX());
            sb.append(", textSkewX=" + this.f3807k.getTextSkewX());
            sb.append(", letterSpacing=" + this.f3807k.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f3807k.isElegantTextHeight());
            sb.append(", textLocale=" + this.f3807k.getTextLocales());
            sb.append(", typeface=" + this.f3807k.getTypeface());
            sb.append(", variationSettings=" + this.f3807k.getFontVariationSettings());
            sb.append(", textDir=" + this.f50575toq);
            sb.append(", breakStrategy=" + this.f50576zy);
            sb.append(", hyphenationFrequency=" + this.f3809q);
            sb.append("}");
            return sb.toString();
        }

        @hyr(23)
        public int toq() {
            return this.f50576zy;
        }

        @hyr(23)
        public int zy() {
            return this.f3809q;
        }

        @hyr(28)
        public C0613k(@lvui PrecomputedText.Params params) {
            this.f3807k = params.getTextPaint();
            this.f50575toq = params.getTextDirection();
            this.f50576zy = params.getBreakStrategy();
            this.f3809q = params.getHyphenationFrequency();
            this.f3808n = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
