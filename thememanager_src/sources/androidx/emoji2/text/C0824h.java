package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.emoji2.text.h */
/* JADX INFO: compiled from: SpannableBuilder.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public final class C0824h extends SpannableStringBuilder {

    /* JADX INFO: renamed from: k */
    @lvui
    private final Class<?> f4505k;

    /* JADX INFO: renamed from: q */
    @lvui
    private final List<k> f4506q;

    /* JADX INFO: renamed from: androidx.emoji2.text.h$k */
    /* JADX INFO: compiled from: SpannableBuilder.java */
    private static class k implements TextWatcher, SpanWatcher {

        /* JADX INFO: renamed from: k */
        final Object f4507k;

        /* JADX INFO: renamed from: q */
        private final AtomicInteger f4508q = new AtomicInteger(0);

        k(Object obj) {
            this.f4507k = obj;
        }

        private boolean toq(Object obj) {
            return obj instanceof AbstractC0833p;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f4507k).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            ((TextWatcher) this.f4507k).beforeTextChanged(charSequence, i2, i3, i4);
        }

        /* JADX INFO: renamed from: k */
        final void m4013k() {
            this.f4508q.incrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i2, int i3) {
            if (this.f4508q.get() <= 0 || !toq(obj)) {
                ((SpanWatcher) this.f4507k).onSpanAdded(spannable, obj, i2, i3);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i2, int i3, int i4, int i5) {
            if (this.f4508q.get() <= 0 || !toq(obj)) {
                ((SpanWatcher) this.f4507k).onSpanChanged(spannable, obj, i2, i3, i4, i5);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i2, int i3) {
            if (this.f4508q.get() <= 0 || !toq(obj)) {
                ((SpanWatcher) this.f4507k).onSpanRemoved(spannable, obj, i2, i3);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            ((TextWatcher) this.f4507k).onTextChanged(charSequence, i2, i3, i4);
        }

        final void zy() {
            this.f4508q.decrementAndGet();
        }
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    C0824h(@lvui Class<?> cls) {
        this.f4506q = new ArrayList();
        androidx.core.util.n7h.qrj(cls, "watcherClass cannot be null");
        this.f4505k = cls;
    }

    private boolean f7l8(@lvui Class<?> cls) {
        return this.f4505k == cls;
    }

    /* JADX INFO: renamed from: g */
    private k m4007g(Object obj) {
        for (int i2 = 0; i2 < this.f4506q.size(); i2++) {
            k kVar = this.f4506q.get(i2);
            if (kVar.f4507k == obj) {
                return kVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    private void m4008n() {
        for (int i2 = 0; i2 < this.f4506q.size(); i2++) {
            this.f4506q.get(i2).onTextChanged(this, 0, length(), length());
        }
    }

    /* JADX INFO: renamed from: s */
    private void m4009s() {
        for (int i2 = 0; i2 < this.f4506q.size(); i2++) {
            this.f4506q.get(i2).zy();
        }
    }

    private void toq() {
        for (int i2 = 0; i2 < this.f4506q.size(); i2++) {
            this.f4506q.get(i2).m4013k();
        }
    }

    /* JADX INFO: renamed from: y */
    private boolean m4010y(@dd Object obj) {
        return obj != null && f7l8(obj.getClass());
    }

    @lvui
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public static C0824h zy(@lvui Class<?> cls, @lvui CharSequence charSequence) {
        return new C0824h(cls, charSequence);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(@dd Object obj) {
        k kVarM4007g;
        if (m4010y(obj) && (kVarM4007g = m4007g(obj)) != null) {
            obj = kVarM4007g;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(@dd Object obj) {
        k kVarM4007g;
        if (m4010y(obj) && (kVarM4007g = m4007g(obj)) != null) {
            obj = kVarM4007g;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(@dd Object obj) {
        k kVarM4007g;
        if (m4010y(obj) && (kVarM4007g = m4007g(obj)) != null) {
            obj = kVarM4007g;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int i2, int i3, @lvui Class<T> cls) {
        if (!f7l8(cls)) {
            return (T[]) super.getSpans(i2, i3, cls);
        }
        k[] kVarArr = (k[]) super.getSpans(i2, i3, k.class);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, kVarArr.length));
        for (int i4 = 0; i4 < kVarArr.length; i4++) {
            tArr[i4] = kVarArr[i4].f4507k;
        }
        return tArr;
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    /* JADX INFO: renamed from: k */
    public void m4011k() {
        toq();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i2, int i3, @dd Class cls) {
        if (cls == null || f7l8(cls)) {
            cls = k.class;
        }
        return super.nextSpanTransition(i2, i3, cls);
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    /* JADX INFO: renamed from: q */
    public void m4012q() {
        m4009s();
        m4008n();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(@dd Object obj) {
        k kVarM4007g;
        if (m4010y(obj)) {
            kVarM4007g = m4007g(obj);
            if (kVarM4007g != null) {
                obj = kVarM4007g;
            }
        } else {
            kVarM4007g = null;
        }
        super.removeSpan(obj);
        if (kVarM4007g != null) {
            this.f4506q.remove(kVarM4007g);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(@dd Object obj, int i2, int i3, int i4) {
        if (m4010y(obj)) {
            k kVar = new k(obj);
            this.f4506q.add(kVar);
            obj = kVar;
        }
        super.setSpan(obj, i2, i3, i4);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int i2, int i3) {
        return new C0824h(this.f4505k, this, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder delete(int i2, int i3) {
        super.delete(i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence) {
        toq();
        super.replace(i2, i3, charSequence);
        m4009s();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i2, CharSequence charSequence, int i3, int i4) {
        super.insert(i2, charSequence, i3, i4);
        return this;
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    C0824h(@lvui Class<?> cls, @lvui CharSequence charSequence) {
        super(charSequence);
        this.f4506q = new ArrayList();
        androidx.core.util.n7h.qrj(cls, "watcherClass cannot be null");
        this.f4505k = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        toq();
        super.replace(i2, i3, charSequence, i4, i5);
        m4009s();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @lvui
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @lvui
    public SpannableStringBuilder append(char c2) {
        super.append(c2);
        return this;
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    C0824h(@lvui Class<?> cls, @lvui CharSequence charSequence, int i2, int i3) {
        super(charSequence, i2, i3);
        this.f4506q = new ArrayList();
        androidx.core.util.n7h.qrj(cls, "watcherClass cannot be null");
        this.f4505k = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @lvui
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i2) {
        super.append(charSequence, obj, i2);
        return this;
    }
}
