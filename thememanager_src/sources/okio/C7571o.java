package okio;

import kotlin.jvm.internal.lv5;
import kotlin.was;
import l05.InterfaceC6768s;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: okio.o */
/* JADX INFO: compiled from: Utf8.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nUtf8.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utf8.kt\nokio/Utf8\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,559:1\n397#1,9:563\n127#1:572\n406#1,20:574\n440#1,4:595\n127#1:599\n446#1,10:601\n127#1:611\n456#1,5:612\n127#1:617\n461#1,24:618\n500#1,4:643\n127#1:647\n506#1,2:649\n127#1:651\n510#1,10:652\n127#1:662\n520#1,5:663\n127#1:668\n525#1,5:669\n127#1:674\n530#1,28:675\n397#1,9:704\n127#1:713\n406#1,20:715\n440#1,4:736\n127#1:740\n446#1,10:742\n127#1:752\n456#1,5:753\n127#1:758\n461#1,24:759\n500#1,4:784\n127#1:788\n506#1,2:790\n127#1:792\n510#1,10:793\n127#1:803\n520#1,5:804\n127#1:809\n525#1,5:810\n127#1:815\n530#1,28:816\n127#1:844\n127#1:846\n127#1:848\n127#1:850\n127#1:852\n127#1:854\n127#1:856\n127#1:858\n127#1:860\n1#2:560\n74#3:561\n68#3:562\n74#3:573\n68#3:594\n74#3:600\n68#3:642\n74#3:648\n68#3:703\n74#3:714\n68#3:735\n74#3:741\n68#3:783\n74#3:789\n74#3:845\n74#3:847\n74#3:849\n74#3:851\n74#3:853\n74#3:855\n74#3:857\n74#3:859\n74#3:861\n*S KotlinDebug\n*F\n+ 1 Utf8.kt\nokio/Utf8\n*L\n228#1:563,9\n228#1:572\n228#1:574,20\n232#1:595,4\n232#1:599\n232#1:601,10\n232#1:611\n232#1:612,5\n232#1:617\n232#1:618,24\n236#1:643,4\n236#1:647\n236#1:649,2\n236#1:651\n236#1:652,10\n236#1:662\n236#1:663,5\n236#1:668\n236#1:669,5\n236#1:674\n236#1:675,28\n277#1:704,9\n277#1:713\n277#1:715,20\n281#1:736,4\n281#1:740\n281#1:742,10\n281#1:752\n281#1:753,5\n281#1:758\n281#1:759,24\n285#1:784,4\n285#1:788\n285#1:790,2\n285#1:792\n285#1:793,10\n285#1:803\n285#1:804,5\n285#1:809\n285#1:810,5\n285#1:815\n285#1:816,28\n405#1:844\n443#1:846\n455#1:848\n460#1:850\n503#1:852\n507#1:854\n519#1:856\n524#1:858\n529#1:860\n127#1:561\n226#1:562\n228#1:573\n230#1:594\n232#1:600\n234#1:642\n236#1:648\n275#1:703\n277#1:714\n279#1:735\n281#1:741\n283#1:783\n285#1:789\n405#1:845\n443#1:847\n455#1:849\n460#1:851\n503#1:853\n507#1:855\n519#1:857\n524#1:859\n529#1:861\n*E\n"})
@InterfaceC6769y(name = "Utf8")
public final class C7571o {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f94297f7l8 = -123008;

    /* JADX INFO: renamed from: g */
    public static final int f43817g = 3968;

    /* JADX INFO: renamed from: k */
    public static final byte f43818k = 63;

    /* JADX INFO: renamed from: n */
    public static final int f43819n = 56320;

    /* JADX INFO: renamed from: q */
    public static final int f43820q = 55232;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final char f94298toq = 65533;

    /* JADX INFO: renamed from: y */
    public static final int f43821y = 3678080;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f94299zy = 65533;

    public static final void f7l8(@InterfaceC7396q String str, int i2, int i3, @InterfaceC7396q cyoe.x2<? super Byte, was> yield) {
        int i4;
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(yield, "yield");
        while (i2 < i3) {
            char cCharAt = str.charAt(i2);
            if (kotlin.jvm.internal.d2ok.m23076i(cCharAt, 128) < 0) {
                yield.invoke(Byte.valueOf((byte) cCharAt));
                i2++;
                while (i2 < i3 && kotlin.jvm.internal.d2ok.m23076i(str.charAt(i2), 128) < 0) {
                    yield.invoke(Byte.valueOf((byte) str.charAt(i2)));
                    i2++;
                }
            } else {
                if (kotlin.jvm.internal.d2ok.m23076i(cCharAt, 2048) < 0) {
                    yield.invoke(Byte.valueOf((byte) ((cCharAt >> 6) | com.google.android.exoplayer2.extractor.ts.wvg.f64653fu4)));
                    yield.invoke(Byte.valueOf((byte) ((cCharAt & '?') | 128)));
                } else {
                    boolean z2 = false;
                    if (55296 <= cCharAt && cCharAt < 57344) {
                        if (kotlin.jvm.internal.d2ok.m23076i(cCharAt, 56319) <= 0 && i3 > (i4 = i2 + 1)) {
                            char cCharAt2 = str.charAt(i4);
                            if (56320 <= cCharAt2 && cCharAt2 < 57344) {
                                z2 = true;
                            }
                            if (z2) {
                                int iCharAt = ((cCharAt << '\n') + str.charAt(i4)) - 56613888;
                                yield.invoke(Byte.valueOf((byte) ((iCharAt >> 18) | com.google.android.exoplayer2.extractor.ts.wvg.f64659wvg)));
                                yield.invoke(Byte.valueOf((byte) (((iCharAt >> 12) & 63) | 128)));
                                yield.invoke(Byte.valueOf((byte) (((iCharAt >> 6) & 63) | 128)));
                                yield.invoke(Byte.valueOf((byte) ((iCharAt & 63) | 128)));
                                i2 += 2;
                            }
                        }
                        yield.invoke(Byte.valueOf(f43818k));
                    } else {
                        yield.invoke(Byte.valueOf((byte) ((cCharAt >> '\f') | 224)));
                        yield.invoke(Byte.valueOf((byte) (((cCharAt >> 6) & 63) | 128)));
                        yield.invoke(Byte.valueOf((byte) ((cCharAt & '?') | 128)));
                    }
                }
                i2++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d2  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m27831g(@mub.InterfaceC7396q byte[] r16, int r17, int r18, @mub.InterfaceC7396q cyoe.x2<? super java.lang.Character, kotlin.was> r19) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C7571o.m27831g(byte[], int, int, cyoe.x2):void");
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m27832k(int i2) {
        if (i2 >= 0 && i2 < 32) {
            return true;
        }
        return 127 <= i2 && i2 < 160;
    }

    @InterfaceC6768s
    @InterfaceC6769y(name = "size")
    public static final long ld6(@InterfaceC7396q String str, int i2, int i3) {
        int i4;
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i2).toString());
        }
        if (!(i3 >= i2)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i3 + " < " + i2).toString());
        }
        if (!(i3 <= str.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i3 + " > " + str.length()).toString());
        }
        long j2 = 0;
        while (i2 < i3) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                j2++;
            } else {
                if (cCharAt < 2048) {
                    i4 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i4 = 3;
                } else {
                    int i5 = i2 + 1;
                    char cCharAt2 = i5 < i3 ? str.charAt(i5) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j2++;
                        i2 = i5;
                    } else {
                        j2 += (long) 4;
                        i2 += 2;
                    }
                }
                j2 += (long) i4;
            }
            i2++;
        }
        return j2;
    }

    /* JADX INFO: renamed from: n */
    public static final int m27833n(@InterfaceC7396q byte[] bArr, int i2, int i3, @InterfaceC7396q cyoe.x2<? super Integer, was> yield) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(yield, "yield");
        int i4 = i2 + 3;
        Integer numValueOf = Integer.valueOf(f94299zy);
        if (i3 <= i4) {
            yield.invoke(numValueOf);
            int i5 = i2 + 1;
            if (i3 > i5) {
                if ((bArr[i5] & 192) == 128) {
                    int i6 = i2 + 2;
                    if (i3 > i6) {
                        if ((bArr[i6] & 192) == 128) {
                            return 3;
                        }
                    }
                    return 2;
                }
            }
            return 1;
        }
        byte b2 = bArr[i2];
        byte b3 = bArr[i2 + 1];
        if (!((b3 & 192) == 128)) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b4 = bArr[i2 + 2];
        if (!((b4 & 192) == 128)) {
            yield.invoke(numValueOf);
            return 2;
        }
        byte b5 = bArr[i4];
        if (!((b5 & 192) == 128)) {
            yield.invoke(numValueOf);
            return 3;
        }
        int i7 = (((b5 ^ 3678080) ^ (b4 << 6)) ^ (b3 << com.google.common.base.zy.f68128n7h)) ^ (b2 << 18);
        if (i7 > 1114111) {
            yield.invoke(numValueOf);
            return 4;
        }
        if (55296 <= i7 && i7 < 57344) {
            z = true;
        }
        if (z) {
            yield.invoke(numValueOf);
            return 4;
        }
        if (i7 < 65536) {
            yield.invoke(numValueOf);
            return 4;
        }
        yield.invoke(Integer.valueOf(i7));
        return 4;
    }

    @InterfaceC6768s
    @InterfaceC6769y(name = "size")
    /* JADX INFO: renamed from: p */
    public static final long m27834p(@InterfaceC7396q String str, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return x2(str, i2, 0, 2, null);
    }

    /* JADX INFO: renamed from: q */
    public static final int m27835q(@InterfaceC7396q byte[] bArr, int i2, int i3, @InterfaceC7396q cyoe.x2<? super Integer, was> yield) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(yield, "yield");
        int i4 = i2 + 2;
        Integer numValueOf = Integer.valueOf(f94299zy);
        if (i3 <= i4) {
            yield.invoke(numValueOf);
            int i5 = i2 + 1;
            if (i3 > i5) {
                if ((bArr[i5] & 192) == 128) {
                    return 2;
                }
            }
            return 1;
        }
        byte b2 = bArr[i2];
        byte b3 = bArr[i2 + 1];
        if (!((b3 & 192) == 128)) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b4 = bArr[i4];
        if (!((b4 & 192) == 128)) {
            yield.invoke(numValueOf);
            return 2;
        }
        int i6 = ((b4 ^ (-123008)) ^ (b3 << 6)) ^ (b2 << com.google.common.base.zy.f68128n7h);
        if (i6 < 2048) {
            yield.invoke(numValueOf);
            return 3;
        }
        if (55296 <= i6 && i6 < 57344) {
            z = true;
        }
        if (z) {
            yield.invoke(numValueOf);
            return 3;
        }
        yield.invoke(Integer.valueOf(i6));
        return 3;
    }

    @InterfaceC6768s
    @InterfaceC6769y(name = "size")
    /* JADX INFO: renamed from: s */
    public static final long m27836s(@InterfaceC7396q String str) {
        kotlin.jvm.internal.d2ok.m23075h(str, "<this>");
        return x2(str, 0, 0, 3, null);
    }

    public static final boolean toq(byte b2) {
        return (b2 & 192) == 128;
    }

    public static /* synthetic */ long x2(String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        return ld6(str, i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ce  */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m27837y(@mub.InterfaceC7396q byte[] r16, int r17, int r18, @mub.InterfaceC7396q cyoe.x2<? super java.lang.Integer, kotlin.was> r19) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C7571o.m27837y(byte[], int, int, cyoe.x2):void");
    }

    public static final int zy(@InterfaceC7396q byte[] bArr, int i2, int i3, @InterfaceC7396q cyoe.x2<? super Integer, was> yield) {
        kotlin.jvm.internal.d2ok.m23075h(bArr, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(yield, "yield");
        int i4 = i2 + 1;
        Integer numValueOf = Integer.valueOf(f94299zy);
        if (i3 <= i4) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b2 = bArr[i2];
        byte b3 = bArr[i4];
        if (!((b3 & 192) == 128)) {
            yield.invoke(numValueOf);
            return 1;
        }
        int i5 = (b3 ^ 3968) ^ (b2 << 6);
        if (i5 < 128) {
            yield.invoke(numValueOf);
            return 2;
        }
        yield.invoke(Integer.valueOf(i5));
        return 2;
    }
}
