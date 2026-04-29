package com.google.common.base;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: Joiner.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public class ni7 {

    /* JADX INFO: renamed from: k */
    private final String f25724k;

    /* JADX INFO: renamed from: com.google.common.base.ni7$k */
    /* JADX INFO: compiled from: Joiner.java */
    class C4266k extends ni7 {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ String f68105toq;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4266k(ni7 ni7Var, String str) {
            super(ni7Var, null);
            this.f68105toq = str;
        }

        @Override // com.google.common.base.ni7
        public ni7 cdj() {
            throw new UnsupportedOperationException("already specified useForNull");
        }

        @Override // com.google.common.base.ni7
        CharSequence ki(@NullableDecl Object obj) {
            return obj == null ? this.f68105toq : ni7.this.ki(obj);
        }

        @Override // com.google.common.base.ni7
        public ni7 t8r(String str) {
            throw new UnsupportedOperationException("already specified useForNull");
        }
    }

    /* JADX INFO: renamed from: com.google.common.base.ni7$q */
    /* JADX INFO: compiled from: Joiner.java */
    public static final class C4267q {

        /* JADX INFO: renamed from: k */
        private final ni7 f25725k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final String f68107toq;

        /* synthetic */ C4267q(ni7 ni7Var, String str, C4266k c4266k) {
            this(ni7Var, str);
        }

        @InterfaceC7731k
        public String f7l8(Iterable<? extends Map.Entry<?, ?>> iterable) {
            return m15448y(iterable.iterator());
        }

        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: g */
        public StringBuilder m15442g(StringBuilder sb, Map<?, ?> map) {
            return m15446q(sb, map.entrySet());
        }

        @CanIgnoreReturnValue
        @InterfaceC7731k
        /* JADX INFO: renamed from: k */
        public <A extends Appendable> A m15443k(A a2, Iterable<? extends Map.Entry<?, ?>> iterable) throws IOException {
            return (A) toq(a2, iterable.iterator());
        }

        @CanIgnoreReturnValue
        @InterfaceC7731k
        /* JADX INFO: renamed from: n */
        public StringBuilder m15444n(StringBuilder sb, Iterator<? extends Map.Entry<?, ?>> it) {
            try {
                toq(sb, it);
                return sb;
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        /* JADX INFO: renamed from: p */
        public C4267q m15445p(String str) {
            return new C4267q(this.f25725k.t8r(str), this.f68107toq);
        }

        @CanIgnoreReturnValue
        @InterfaceC7731k
        /* JADX INFO: renamed from: q */
        public StringBuilder m15446q(StringBuilder sb, Iterable<? extends Map.Entry<?, ?>> iterable) {
            return m15444n(sb, iterable.iterator());
        }

        /* JADX INFO: renamed from: s */
        public String m15447s(Map<?, ?> map) {
            return f7l8(map.entrySet());
        }

        @CanIgnoreReturnValue
        @InterfaceC7731k
        public <A extends Appendable> A toq(A a2, Iterator<? extends Map.Entry<?, ?>> it) throws IOException {
            jk.a9(a2);
            if (it.hasNext()) {
                Map.Entry<?, ?> next = it.next();
                a2.append(this.f25725k.ki(next.getKey()));
                a2.append(this.f68107toq);
                a2.append(this.f25725k.ki(next.getValue()));
                while (it.hasNext()) {
                    a2.append(this.f25725k.f25724k);
                    Map.Entry<?, ?> next2 = it.next();
                    a2.append(this.f25725k.ki(next2.getKey()));
                    a2.append(this.f68107toq);
                    a2.append(this.f25725k.ki(next2.getValue()));
                }
            }
            return a2;
        }

        @InterfaceC7731k
        /* JADX INFO: renamed from: y */
        public String m15448y(Iterator<? extends Map.Entry<?, ?>> it) {
            return m15444n(new StringBuilder(), it).toString();
        }

        @CanIgnoreReturnValue
        public <A extends Appendable> A zy(A a2, Map<?, ?> map) throws IOException {
            return (A) m15443k(a2, map.entrySet());
        }

        private C4267q(ni7 ni7Var, String str) {
            this.f25725k = ni7Var;
            this.f68107toq = (String) jk.a9(str);
        }
    }

    /* JADX INFO: compiled from: Joiner.java */
    class toq extends ni7 {
        toq(ni7 ni7Var) {
            super(ni7Var, null);
        }

        @Override // com.google.common.base.ni7
        public C4267q fn3e(String str) {
            throw new UnsupportedOperationException("can't use .skipNulls() with maps");
        }

        @Override // com.google.common.base.ni7
        /* JADX INFO: renamed from: q */
        public <A extends Appendable> A mo15439q(A a2, Iterator<?> it) throws IOException {
            jk.fti(a2, "appendable");
            jk.fti(it, "parts");
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null) {
                    a2.append(ni7.this.ki(next));
                    break;
                }
            }
            while (it.hasNext()) {
                Object next2 = it.next();
                if (next2 != null) {
                    a2.append(ni7.this.f25724k);
                    a2.append(ni7.this.ki(next2));
                }
            }
            return a2;
        }

        @Override // com.google.common.base.ni7
        public ni7 t8r(String str) {
            throw new UnsupportedOperationException("already specified skipNulls");
        }
    }

    /* JADX INFO: compiled from: Joiner.java */
    static class zy extends AbstractList<Object> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Object[] f25726k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ Object f25727n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Object f25728q;

        zy(Object[] objArr, Object obj, Object obj2) {
            this.f25726k = objArr;
            this.f25728q = obj;
            this.f25727n = obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i2) {
            return i2 != 0 ? i2 != 1 ? this.f25726k[i2 - 2] : this.f25727n : this.f25728q;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f25726k.length + 2;
        }
    }

    /* synthetic */ ni7(ni7 ni7Var, C4266k c4266k) {
        this(ni7Var);
    }

    /* JADX INFO: renamed from: h */
    public static ni7 m15433h(String str) {
        return new ni7(str);
    }

    public static ni7 kja0(char c2) {
        return new ni7(String.valueOf(c2));
    }

    /* JADX INFO: renamed from: p */
    private static Iterable<Object> m15435p(Object obj, Object obj2, Object[] objArr) {
        jk.a9(objArr);
        return new zy(objArr, obj, obj2);
    }

    public ni7 cdj() {
        return new toq(this);
    }

    @CanIgnoreReturnValue
    public final StringBuilder f7l8(StringBuilder sb, @NullableDecl Object obj, @NullableDecl Object obj2, Object... objArr) {
        return m15436g(sb, m15435p(obj, obj2, objArr));
    }

    public C4267q fn3e(String str) {
        return new C4267q(this, str, null);
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: g */
    public final StringBuilder m15436g(StringBuilder sb, Iterable<?> iterable) {
        return m15441y(sb, iterable.iterator());
    }

    /* JADX INFO: renamed from: i */
    public C4267q m15437i(char c2) {
        return fn3e(String.valueOf(c2));
    }

    CharSequence ki(Object obj) {
        jk.a9(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final String ld6(Iterable<?> iterable) {
        return qrj(iterable.iterator());
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: n */
    public final <A extends Appendable> A m15438n(A a2, Object[] objArr) throws IOException {
        return (A) toq(a2, Arrays.asList(objArr));
    }

    public final String n7h(Object[] objArr) {
        return ld6(Arrays.asList(objArr));
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: q */
    public <A extends Appendable> A mo15439q(A a2, Iterator<?> it) throws IOException {
        jk.a9(a2);
        if (it.hasNext()) {
            a2.append(ki(it.next()));
            while (it.hasNext()) {
                a2.append(this.f25724k);
                a2.append(ki(it.next()));
            }
        }
        return a2;
    }

    public final String qrj(Iterator<?> it) {
        return m15441y(new StringBuilder(), it).toString();
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: s */
    public final StringBuilder m15440s(StringBuilder sb, Object[] objArr) {
        return m15436g(sb, Arrays.asList(objArr));
    }

    public ni7 t8r(String str) {
        jk.a9(str);
        return new C4266k(this, str);
    }

    @CanIgnoreReturnValue
    public <A extends Appendable> A toq(A a2, Iterable<?> iterable) throws IOException {
        return (A) mo15439q(a2, iterable.iterator());
    }

    public final String x2(@NullableDecl Object obj, @NullableDecl Object obj2, Object... objArr) {
        return ld6(m15435p(obj, obj2, objArr));
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: y */
    public final StringBuilder m15441y(StringBuilder sb, Iterator<?> it) {
        try {
            mo15439q(sb, it);
            return sb;
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    @CanIgnoreReturnValue
    public final <A extends Appendable> A zy(A a2, @NullableDecl Object obj, @NullableDecl Object obj2, Object... objArr) throws IOException {
        return (A) toq(a2, m15435p(obj, obj2, objArr));
    }

    private ni7(String str) {
        this.f25724k = (String) jk.a9(str);
    }

    private ni7(ni7 ni7Var) {
        this.f25724k = ni7Var.f25724k;
    }
}
