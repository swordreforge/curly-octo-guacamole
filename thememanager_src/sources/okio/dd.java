package okio;

import java.io.IOException;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Options.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class dd extends kotlin.collections.zy<kja0> implements RandomAccess {

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    public static final C7542k f43697n = new C7542k(null);

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final kja0[] f43698k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final int[] f43699q;

    /* JADX INFO: renamed from: okio.dd$k */
    /* JADX INFO: compiled from: Options.kt */
    @lv5({"SMAP\nOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Options.kt\nokio/Options$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,236:1\n11065#2:237\n11400#2,3:238\n13374#2,3:243\n37#3,2:241\n1#4:246\n74#5:247\n74#5:248\n*S KotlinDebug\n*F\n+ 1 Options.kt\nokio/Options$Companion\n*L\n43#1:237\n43#1:238,3\n44#1:243,3\n43#1:241,2\n151#1:247\n208#1:248\n*E\n"})
    public static final class C7542k {
        private C7542k() {
        }

        public /* synthetic */ C7542k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        /* JADX INFO: renamed from: k */
        private final void m27603k(long j2, x2 x2Var, int i2, List<? extends kja0> list, int i3, int i4, List<Integer> list2) throws IOException {
            int i5;
            int i6;
            int i7;
            int i8;
            x2 x2Var2;
            int i9 = i2;
            if (!(i3 < i4)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i10 = i3; i10 < i4; i10++) {
                if (!(list.get(i10).size() >= i9)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            kja0 kja0Var = list.get(i3);
            kja0 kja0Var2 = list.get(i4 - 1);
            int i11 = -1;
            if (i9 == kja0Var.size()) {
                int iIntValue = list2.get(i3).intValue();
                int i12 = i3 + 1;
                kja0 kja0Var3 = list.get(i12);
                i5 = i12;
                i6 = iIntValue;
                kja0Var = kja0Var3;
            } else {
                i5 = i3;
                i6 = -1;
            }
            if (kja0Var.getByte(i9) == kja0Var2.getByte(i9)) {
                int iMin = Math.min(kja0Var.size(), kja0Var2.size());
                int i13 = 0;
                for (int i14 = i9; i14 < iMin && kja0Var.getByte(i14) == kja0Var2.getByte(i14); i14++) {
                    i13++;
                }
                long jZy = j2 + zy(x2Var) + ((long) 2) + ((long) i13) + 1;
                x2Var.writeInt(-i13);
                x2Var.writeInt(i6);
                int i15 = i9 + i13;
                while (i9 < i15) {
                    x2Var.writeInt(kja0Var.getByte(i9) & 255);
                    i9++;
                }
                if (i5 + 1 == i4) {
                    if (!(i15 == list.get(i5).size())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    x2Var.writeInt(list2.get(i5).intValue());
                    return;
                } else {
                    x2 x2Var3 = new x2();
                    x2Var.writeInt(((int) (zy(x2Var3) + jZy)) * (-1));
                    m27603k(jZy, x2Var3, i15, list, i5, i4, list2);
                    x2Var.ek5k(x2Var3);
                    return;
                }
            }
            int i16 = 1;
            for (int i17 = i5 + 1; i17 < i4; i17++) {
                if (list.get(i17 - 1).getByte(i9) != list.get(i17).getByte(i9)) {
                    i16++;
                }
            }
            long jZy2 = j2 + zy(x2Var) + ((long) 2) + ((long) (i16 * 2));
            x2Var.writeInt(i16);
            x2Var.writeInt(i6);
            for (int i18 = i5; i18 < i4; i18++) {
                byte b2 = list.get(i18).getByte(i9);
                if (i18 == i5 || b2 != list.get(i18 - 1).getByte(i9)) {
                    x2Var.writeInt(b2 & 255);
                }
            }
            x2 x2Var4 = new x2();
            while (i5 < i4) {
                byte b3 = list.get(i5).getByte(i9);
                int i19 = i5 + 1;
                int i20 = i19;
                while (true) {
                    if (i20 >= i4) {
                        i7 = i4;
                        break;
                    } else {
                        if (b3 != list.get(i20).getByte(i9)) {
                            i7 = i20;
                            break;
                        }
                        i20++;
                    }
                }
                if (i19 == i7 && i9 + 1 == list.get(i5).size()) {
                    x2Var.writeInt(list2.get(i5).intValue());
                    i8 = i7;
                    x2Var2 = x2Var4;
                } else {
                    x2Var.writeInt(((int) (jZy2 + zy(x2Var4))) * i11);
                    i8 = i7;
                    x2Var2 = x2Var4;
                    m27603k(jZy2, x2Var4, i9 + 1, list, i5, i7, list2);
                }
                x2Var4 = x2Var2;
                i5 = i8;
                i11 = -1;
            }
            x2Var.ek5k(x2Var4);
        }

        static /* synthetic */ void toq(C7542k c7542k, long j2, x2 x2Var, int i2, List list, int i3, int i4, List list2, int i5, Object obj) throws IOException {
            c7542k.m27603k((i5 & 1) != 0 ? 0L : j2, x2Var, (i5 & 4) != 0 ? 0 : i2, list, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) != 0 ? list.size() : i4, list2);
        }

        private final long zy(x2 x2Var) {
            return x2Var.size() / ((long) 4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:54:0x00e9, code lost:
        
            continue;
         */
        @mub.InterfaceC7396q
        @l05.qrj
        /* JADX INFO: renamed from: q */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final okio.dd m27604q(@mub.InterfaceC7396q okio.kja0... r17) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 320
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.dd.C7542k.m27604q(okio.kja0[]):okio.dd");
        }
    }

    private dd(kja0[] kja0VarArr, int[] iArr) {
        this.f43698k = kja0VarArr;
        this.f43699q = iArr;
    }

    public /* synthetic */ dd(kja0[] kja0VarArr, int[] iArr, kotlin.jvm.internal.ni7 ni7Var) {
        this(kja0VarArr, iArr);
    }

    @InterfaceC7396q
    @l05.qrj
    /* JADX INFO: renamed from: s */
    public static final dd m27599s(@InterfaceC7396q kja0... kja0VarArr) {
        return f43697n.m27604q(kja0VarArr);
    }

    @Override // kotlin.collections.AbstractC6147k, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof kja0) {
            return m27601k((kja0) obj);
        }
        return false;
    }

    public /* bridge */ int f7l8(kja0 kja0Var) {
        return super.indexOf(kja0Var);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public final int[] m27600g() {
        return this.f43699q;
    }

    @Override // kotlin.collections.zy, kotlin.collections.AbstractC6147k
    public int getSize() {
        return this.f43698k.length;
    }

    @Override // kotlin.collections.zy, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof kja0) {
            return f7l8((kja0) obj);
        }
        return -1;
    }

    /* JADX INFO: renamed from: k */
    public /* bridge */ boolean m27601k(kja0 kja0Var) {
        return super.contains(kja0Var);
    }

    @Override // kotlin.collections.zy, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof kja0) {
            return m27602y((kja0) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.zy, java.util.List
    @InterfaceC7396q
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public kja0 get(int i2) {
        return this.f43698k[i2];
    }

    /* JADX INFO: renamed from: y */
    public /* bridge */ int m27602y(kja0 kja0Var) {
        return super.lastIndexOf(kja0Var);
    }

    @InterfaceC7396q
    public final kja0[] zy() {
        return this.f43698k;
    }
}
