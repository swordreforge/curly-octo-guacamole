package okio;

import java.util.Arrays;
import kotlin.jvm.internal.lv5;
import l05.InterfaceC6765n;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: okio.c */
/* JADX INFO: compiled from: Segment.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nSegment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Segment.kt\nokio/Segment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"})
public final class C7541c {

    /* JADX INFO: renamed from: p */
    public static final int f43683p = 1024;

    /* JADX INFO: renamed from: s */
    public static final int f43684s = 8192;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    public static final k f43685y = new k(null);

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC6765n
    @InterfaceC7395n
    public C7541c f94262f7l8;

    /* JADX INFO: renamed from: g */
    @InterfaceC6765n
    @InterfaceC7395n
    public C7541c f43686g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    @InterfaceC6765n
    public final byte[] f43687k;

    /* JADX INFO: renamed from: n */
    @InterfaceC6765n
    public boolean f43688n;

    /* JADX INFO: renamed from: q */
    @InterfaceC6765n
    public boolean f43689q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC6765n
    public int f94263toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC6765n
    public int f94264zy;

    /* JADX INFO: renamed from: okio.c$k */
    /* JADX INFO: compiled from: Segment.kt */
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }
    }

    public C7541c() {
        this.f43687k = new byte[8192];
        this.f43688n = true;
        this.f43689q = false;
    }

    public final void f7l8(@InterfaceC7396q C7541c sink, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        if (!sink.f43688n) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i3 = sink.f94264zy;
        if (i3 + i2 > 8192) {
            if (sink.f43689q) {
                throw new IllegalArgumentException();
            }
            int i4 = sink.f94263toq;
            if ((i3 + i2) - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f43687k;
            kotlin.collections.kja0.vq(bArr, bArr, 0, i4, i3, 2, null);
            sink.f94264zy -= sink.f94263toq;
            sink.f94263toq = 0;
        }
        byte[] bArr2 = this.f43687k;
        byte[] bArr3 = sink.f43687k;
        int i5 = sink.f94264zy;
        int i6 = this.f94263toq;
        kotlin.collections.kja0.y2(bArr2, bArr3, i5, i6, i6 + i2);
        sink.f94264zy += i2;
        this.f94263toq += i2;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public final C7541c m27581g() {
        byte[] bArr = this.f43687k;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.d2ok.kja0(bArrCopyOf, "copyOf(this, size)");
        return new C7541c(bArrCopyOf, this.f94263toq, this.f94264zy, false, true);
    }

    /* JADX INFO: renamed from: k */
    public final void m27582k() {
        C7541c c7541c = this.f94262f7l8;
        int i2 = 0;
        if (!(c7541c != this)) {
            throw new IllegalStateException("cannot compact".toString());
        }
        kotlin.jvm.internal.d2ok.qrj(c7541c);
        if (c7541c.f43688n) {
            int i3 = this.f94264zy - this.f94263toq;
            C7541c c7541c2 = this.f94262f7l8;
            kotlin.jvm.internal.d2ok.qrj(c7541c2);
            int i4 = 8192 - c7541c2.f94264zy;
            C7541c c7541c3 = this.f94262f7l8;
            kotlin.jvm.internal.d2ok.qrj(c7541c3);
            if (!c7541c3.f43689q) {
                C7541c c7541c4 = this.f94262f7l8;
                kotlin.jvm.internal.d2ok.qrj(c7541c4);
                i2 = c7541c4.f94263toq;
            }
            if (i3 > i4 + i2) {
                return;
            }
            C7541c c7541c5 = this.f94262f7l8;
            kotlin.jvm.internal.d2ok.qrj(c7541c5);
            f7l8(c7541c5, i3);
            toq();
            lrht.m27786q(this);
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public final C7541c m27583n(int i2) {
        C7541c c7541cM27785n;
        if (!(i2 > 0 && i2 <= this.f94264zy - this.f94263toq)) {
            throw new IllegalArgumentException("byteCount out of range".toString());
        }
        if (i2 >= 1024) {
            c7541cM27785n = m27584q();
        } else {
            c7541cM27785n = lrht.m27785n();
            byte[] bArr = this.f43687k;
            byte[] bArr2 = c7541cM27785n.f43687k;
            int i3 = this.f94263toq;
            kotlin.collections.kja0.vq(bArr, bArr2, 0, i3, i3 + i2, 2, null);
        }
        c7541cM27785n.f94264zy = c7541cM27785n.f94263toq + i2;
        this.f94263toq += i2;
        C7541c c7541c = this.f94262f7l8;
        kotlin.jvm.internal.d2ok.qrj(c7541c);
        c7541c.zy(c7541cM27785n);
        return c7541cM27785n;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public final C7541c m27584q() {
        this.f43689q = true;
        return new C7541c(this.f43687k, this.f94263toq, this.f94264zy, true, false);
    }

    @InterfaceC7395n
    public final C7541c toq() {
        C7541c c7541c = this.f43686g;
        if (c7541c == this) {
            c7541c = null;
        }
        C7541c c7541c2 = this.f94262f7l8;
        kotlin.jvm.internal.d2ok.qrj(c7541c2);
        c7541c2.f43686g = this.f43686g;
        C7541c c7541c3 = this.f43686g;
        kotlin.jvm.internal.d2ok.qrj(c7541c3);
        c7541c3.f94262f7l8 = this.f94262f7l8;
        this.f43686g = null;
        this.f94262f7l8 = null;
        return c7541c;
    }

    @InterfaceC7396q
    public final C7541c zy(@InterfaceC7396q C7541c segment) {
        kotlin.jvm.internal.d2ok.m23075h(segment, "segment");
        segment.f94262f7l8 = this;
        segment.f43686g = this.f43686g;
        C7541c c7541c = this.f43686g;
        kotlin.jvm.internal.d2ok.qrj(c7541c);
        c7541c.f94262f7l8 = segment;
        this.f43686g = segment;
        return segment;
    }

    public C7541c(@InterfaceC7396q byte[] data, int i2, int i3, boolean z2, boolean z3) {
        kotlin.jvm.internal.d2ok.m23075h(data, "data");
        this.f43687k = data;
        this.f94263toq = i2;
        this.f94264zy = i3;
        this.f43689q = z2;
        this.f43688n = z3;
    }
}
