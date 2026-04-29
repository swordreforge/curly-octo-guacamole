package kotlin.random;

import java.io.Serializable;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.random.s */
/* JADX INFO: compiled from: XorWowRandom.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nXorWowRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XorWowRandom.kt\nkotlin/random/XorWowRandom\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
public final class C6336s extends AbstractC6332g implements Serializable {

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private static final k f36496q = new k(null);
    private static final long serialVersionUID = 0;
    private int addend;

    /* JADX INFO: renamed from: v */
    private int f36497v;

    /* JADX INFO: renamed from: w */
    private int f36498w;

    /* JADX INFO: renamed from: x */
    private int f36499x;

    /* JADX INFO: renamed from: y */
    private int f36500y;

    /* JADX INFO: renamed from: z */
    private int f36501z;

    /* JADX INFO: renamed from: kotlin.random.s$k */
    /* JADX INFO: compiled from: XorWowRandom.kt */
    private static final class k {
        private k() {
        }

        public /* synthetic */ k(ni7 ni7Var) {
            this();
        }
    }

    public C6336s(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f36499x = i2;
        this.f36500y = i3;
        this.f36501z = i4;
        this.f36498w = i5;
        this.f36497v = i6;
        this.addend = i7;
        int i8 = i2 | i3 | i4 | i5 | i6;
        if (!(i8 != 0)) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
        }
        for (int i9 = 0; i9 < 64; i9++) {
            nextInt();
        }
    }

    @Override // kotlin.random.AbstractC6332g
    public int nextBits(int i2) {
        return f7l8.m23272p(nextInt(), i2);
    }

    @Override // kotlin.random.AbstractC6332g
    public int nextInt() {
        int i2 = this.f36499x;
        int i3 = i2 ^ (i2 >>> 2);
        this.f36499x = this.f36500y;
        this.f36500y = this.f36501z;
        this.f36501z = this.f36498w;
        int i4 = this.f36497v;
        this.f36498w = i4;
        int i5 = ((i3 ^ (i3 << 1)) ^ i4) ^ (i4 << 4);
        this.f36497v = i5;
        int i6 = this.addend + 362437;
        this.addend = i6;
        return i5 + i6;
    }

    public C6336s(int i2, int i3) {
        this(i2, i3, 0, 0, ~i2, (i2 << 10) ^ (i3 >>> 4));
    }
}
