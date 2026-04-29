package kotlin.text;

import cyoe.InterfaceC5979h;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C6227f;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: renamed from: kotlin.text.y */
/* JADX INFO: compiled from: Strings.kt */
/* JADX INFO: loaded from: classes3.dex */
final class C6458y implements kotlin.sequences.qrj<kotlin.ranges.x2> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final CharSequence f36721k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final InterfaceC5979h<CharSequence, Integer, C6227f<Integer, Integer>> f36722q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final int f81940toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final int f81941zy;

    /* JADX INFO: renamed from: kotlin.text.y$k */
    /* JADX INFO: compiled from: Strings.kt */
    public static final class k implements Iterator<kotlin.ranges.x2>, InterfaceC7625k {

        /* JADX INFO: renamed from: g */
        @InterfaceC7395n
        private kotlin.ranges.x2 f36723g;

        /* JADX INFO: renamed from: k */
        private int f36724k = -1;

        /* JADX INFO: renamed from: n */
        private int f36725n;

        /* JADX INFO: renamed from: q */
        private int f36726q;

        /* JADX INFO: renamed from: y */
        private int f36728y;

        k() {
            int iD3 = kotlin.ranges.fn3e.d3(C6458y.this.f81940toq, 0, C6458y.this.f36721k.length());
            this.f36726q = iD3;
            this.f36725n = iD3;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        /* JADX INFO: renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void m23643k() {
            /*
                r6 = this;
                int r0 = r6.f36725n
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f36724k = r1
                r0 = 0
                r6.f36723g = r0
                goto L9e
            Lc:
                kotlin.text.y r0 = kotlin.text.C6458y.this
                int r0 = kotlin.text.C6458y.m23641n(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f36728y
                int r0 = r0 + r3
                r6.f36728y = r0
                kotlin.text.y r4 = kotlin.text.C6458y.this
                int r4 = kotlin.text.C6458y.m23641n(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f36725n
                kotlin.text.y r4 = kotlin.text.C6458y.this
                java.lang.CharSequence r4 = kotlin.text.C6458y.m23642q(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                kotlin.ranges.x2 r0 = new kotlin.ranges.x2
                int r1 = r6.f36726q
                kotlin.text.y r4 = kotlin.text.C6458y.this
                java.lang.CharSequence r4 = kotlin.text.C6458y.m23642q(r4)
                int r4 = kotlin.text.zurt.kt06(r4)
                r0.<init>(r1, r4)
                r6.f36723g = r0
                r6.f36725n = r2
                goto L9c
            L47:
                kotlin.text.y r0 = kotlin.text.C6458y.this
                cyoe.h r0 = kotlin.text.C6458y.zy(r0)
                kotlin.text.y r4 = kotlin.text.C6458y.this
                java.lang.CharSequence r4 = kotlin.text.C6458y.m23642q(r4)
                int r5 = r6.f36725n
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                kotlin.f r0 = (kotlin.C6227f) r0
                if (r0 != 0) goto L77
                kotlin.ranges.x2 r0 = new kotlin.ranges.x2
                int r1 = r6.f36726q
                kotlin.text.y r4 = kotlin.text.C6458y.this
                java.lang.CharSequence r4 = kotlin.text.C6458y.m23642q(r4)
                int r4 = kotlin.text.zurt.kt06(r4)
                r0.<init>(r1, r4)
                r6.f36723g = r0
                r6.f36725n = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.component1()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.component2()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f36726q
                kotlin.ranges.x2 r4 = kotlin.ranges.t8r.nme(r4, r2)
                r6.f36723g = r4
                int r2 = r2 + r0
                r6.f36726q = r2
                if (r0 != 0) goto L99
                r1 = r3
            L99:
                int r2 = r2 + r1
                r6.f36725n = r2
            L9c:
                r6.f36724k = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.C6458y.k.m23643k():void");
        }

        public final int f7l8() {
            return this.f36725n;
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: g */
        public final kotlin.ranges.x2 m23644g() {
            return this.f36723g;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f36724k == -1) {
                m23643k();
            }
            return this.f36724k == 1;
        }

        public final void ld6(int i2) {
            this.f36726q = i2;
        }

        public final void n7h(int i2) {
            this.f36724k = i2;
        }

        /* JADX INFO: renamed from: p */
        public final void m23645p(int i2) {
            this.f36728y = i2;
        }

        public final void qrj(int i2) {
            this.f36725n = i2;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Iterator
        @InterfaceC7396q
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public kotlin.ranges.x2 next() {
            if (this.f36724k == -1) {
                m23643k();
            }
            if (this.f36724k == 0) {
                throw new NoSuchElementException();
            }
            kotlin.ranges.x2 x2Var = this.f36723g;
            kotlin.jvm.internal.d2ok.n7h(x2Var, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f36723g = null;
            this.f36724k = -1;
            return x2Var;
        }

        public final int toq() {
            return this.f36728y;
        }

        public final void x2(@InterfaceC7395n kotlin.ranges.x2 x2Var) {
            this.f36723g = x2Var;
        }

        /* JADX INFO: renamed from: y */
        public final int m23647y() {
            return this.f36724k;
        }

        public final int zy() {
            return this.f36726q;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6458y(@InterfaceC7396q CharSequence input, int i2, int i3, @InterfaceC7396q InterfaceC5979h<? super CharSequence, ? super Integer, C6227f<Integer, Integer>> getNextMatch) {
        kotlin.jvm.internal.d2ok.m23075h(input, "input");
        kotlin.jvm.internal.d2ok.m23075h(getNextMatch, "getNextMatch");
        this.f36721k = input;
        this.f81940toq = i2;
        this.f81941zy = i3;
        this.f36722q = getNextMatch;
    }

    @Override // kotlin.sequences.qrj
    @InterfaceC7396q
    public Iterator<kotlin.ranges.x2> iterator() {
        return new k();
    }
}
