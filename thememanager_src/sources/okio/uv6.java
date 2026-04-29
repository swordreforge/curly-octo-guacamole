package okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: SegmentedByteString.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nSegmentedByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedByteString.kt\nokio/SegmentedByteString\n+ 2 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n63#2,12:141\n63#2,12:153\n104#2,2:165\n106#2,26:168\n135#2,5:194\n142#2:199\n145#2,3:200\n63#2,8:203\n148#2,8:211\n71#2,4:219\n156#2:223\n63#2,12:224\n160#2:236\n85#2,10:237\n161#2,9:247\n95#2,4:256\n170#2,2:260\n179#2,4:262\n85#2,10:266\n183#2,3:276\n95#2,4:279\n186#2:283\n195#2,8:284\n85#2,10:292\n203#2,3:302\n95#2,4:305\n206#2:309\n215#2,5:310\n85#2,10:315\n220#2,3:325\n95#2,4:328\n223#2:332\n226#2,4:333\n234#2,6:337\n63#2,8:343\n240#2,7:351\n71#2,4:358\n247#2,2:362\n1#3:167\n*S KotlinDebug\n*F\n+ 1 SegmentedByteString.kt\nokio/SegmentedByteString\n*L\n54#1:141,12\n66#1:153,12\n78#1:165,2\n78#1:168,26\n80#1:194,5\n82#1:199\n84#1:200,3\n84#1:203,8\n84#1:211,8\n84#1:219,4\n84#1:223\n90#1:224,12\n96#1:236\n96#1:237,10\n96#1:247,9\n96#1:256,4\n96#1:260,2\n103#1:262,4\n103#1:266,10\n103#1:276,3\n103#1:279,4\n103#1:283\n110#1:284,8\n110#1:292,10\n110#1:302,3\n110#1:305,4\n110#1:309\n117#1:310,5\n117#1:315,10\n117#1:325,3\n117#1:328,4\n117#1:332\n131#1:333,4\n133#1:337,6\n133#1:343,8\n133#1:351,7\n133#1:358,4\n133#1:362,2\n78#1:167\n*E\n"})
public final class uv6 extends kja0 {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final transient int[] f43839g;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private final transient byte[][] f43840n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv6(@InterfaceC7396q byte[][] segments, @InterfaceC7396q int[] directory) {
        super(kja0.EMPTY.getData$okio());
        kotlin.jvm.internal.d2ok.m23075h(segments, "segments");
        kotlin.jvm.internal.d2ok.m23075h(directory, "directory");
        this.f43840n = segments;
        this.f43839g = directory;
    }

    private final kja0 toq() {
        return new kja0(toByteArray());
    }

    private final Object writeReplace() {
        kja0 qVar = toq();
        kotlin.jvm.internal.d2ok.n7h(qVar, "null cannot be cast to non-null type java.lang.Object");
        return qVar;
    }

    @Override // okio.kja0
    @InterfaceC7396q
    public ByteBuffer asByteBuffer() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
        kotlin.jvm.internal.d2ok.kja0(byteBufferAsReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return byteBufferAsReadOnlyBuffer;
    }

    @Override // okio.kja0
    @InterfaceC7396q
    public String base64() {
        return toq().base64();
    }

    @Override // okio.kja0
    @InterfaceC7396q
    public String base64Url() {
        return toq().base64Url();
    }

    @Override // okio.kja0
    public void copyInto(int i2, @InterfaceC7396q byte[] target, int i3, int i4) {
        kotlin.jvm.internal.d2ok.m23075h(target, "target");
        long j2 = i4;
        C7575s.m27855n(size(), i2, j2);
        C7575s.m27855n(target.length, i3, j2);
        int i5 = i4 + i2;
        int iN7h = okio.internal.f7l8.n7h(this, i2);
        while (i2 < i5) {
            int i6 = iN7h == 0 ? 0 : getDirectory$okio()[iN7h - 1];
            int i7 = getDirectory$okio()[iN7h] - i6;
            int i8 = getDirectory$okio()[getSegments$okio().length + iN7h];
            int iMin = Math.min(i5, i7 + i6) - i2;
            int i9 = i8 + (i2 - i6);
            kotlin.collections.kja0.y2(getSegments$okio()[iN7h], target, i3, i9, i9 + iMin);
            i3 += iMin;
            i2 += iMin;
            iN7h++;
        }
    }

    @Override // okio.kja0
    @InterfaceC7396q
    public kja0 digest$okio(@InterfaceC7396q String algorithm) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.d2ok.m23075h(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        int length = getSegments$okio().length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = getDirectory$okio()[length + i2];
            int i5 = getDirectory$okio()[i2];
            messageDigest.update(getSegments$okio()[i2], i4, i5 - i3);
            i2++;
            i3 = i5;
        }
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.d2ok.qrj(bArrDigest);
        return new kja0(bArrDigest);
    }

    @Override // okio.kja0
    public boolean equals(@InterfaceC7395n Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kja0) {
            kja0 kja0Var = (kja0) obj;
            if (kja0Var.size() == size() && rangeEquals(0, kja0Var, 0, size())) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC7396q
    public final int[] getDirectory$okio() {
        return this.f43839g;
    }

    @InterfaceC7396q
    public final byte[][] getSegments$okio() {
        return this.f43840n;
    }

    @Override // okio.kja0
    public int getSize$okio() {
        return getDirectory$okio()[getSegments$okio().length - 1];
    }

    @Override // okio.kja0
    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = getSegments$okio().length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int i5 = getDirectory$okio()[length + i2];
            int i6 = getDirectory$okio()[i2];
            byte[] bArr = getSegments$okio()[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        setHashCode$okio(i3);
        return i3;
    }

    @Override // okio.kja0
    @InterfaceC7396q
    public String hex() {
        return toq().hex();
    }

    @Override // okio.kja0
    @InterfaceC7396q
    public kja0 hmac$okio(@InterfaceC7396q String algorithm, @InterfaceC7396q kja0 key) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.d2ok.m23075h(algorithm, "algorithm");
        kotlin.jvm.internal.d2ok.m23075h(key, "key");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            int length = getSegments$okio().length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                int i4 = getDirectory$okio()[length + i2];
                int i5 = getDirectory$okio()[i2];
                mac.update(getSegments$okio()[i2], i4, i5 - i3);
                i2++;
                i3 = i5;
            }
            byte[] bArrDoFinal = mac.doFinal();
            kotlin.jvm.internal.d2ok.kja0(bArrDoFinal, "doFinal(...)");
            return new kja0(bArrDoFinal);
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    @Override // okio.kja0
    public int indexOf(@InterfaceC7396q byte[] other, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        return toq().indexOf(other, i2);
    }

    @Override // okio.kja0
    @InterfaceC7396q
    public byte[] internalArray$okio() {
        return toByteArray();
    }

    @Override // okio.kja0
    public byte internalGet$okio(int i2) {
        C7575s.m27855n(getDirectory$okio()[getSegments$okio().length - 1], i2, 1L);
        int iN7h = okio.internal.f7l8.n7h(this, i2);
        return getSegments$okio()[iN7h][(i2 - (iN7h == 0 ? 0 : getDirectory$okio()[iN7h - 1])) + getDirectory$okio()[getSegments$okio().length + iN7h]];
    }

    @Override // okio.kja0
    public int lastIndexOf(@InterfaceC7396q byte[] other, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        return toq().lastIndexOf(other, i2);
    }

    @Override // okio.kja0
    public boolean rangeEquals(int i2, @InterfaceC7396q kja0 other, int i3, int i4) {
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        if (i2 < 0 || i2 > size() - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int iN7h = okio.internal.f7l8.n7h(this, i2);
        while (i2 < i5) {
            int i6 = iN7h == 0 ? 0 : getDirectory$okio()[iN7h - 1];
            int i7 = getDirectory$okio()[iN7h] - i6;
            int i8 = getDirectory$okio()[getSegments$okio().length + iN7h];
            int iMin = Math.min(i5, i7 + i6) - i2;
            if (!other.rangeEquals(i3, getSegments$okio()[iN7h], i8 + (i2 - i6), iMin)) {
                return false;
            }
            i3 += iMin;
            i2 += iMin;
            iN7h++;
        }
        return true;
    }

    @Override // okio.kja0
    @InterfaceC7396q
    public String string(@InterfaceC7396q Charset charset) {
        kotlin.jvm.internal.d2ok.m23075h(charset, "charset");
        return toq().string(charset);
    }

    @Override // okio.kja0
    @InterfaceC7396q
    public kja0 substring(int i2, int i3) {
        int iX2 = C7575s.x2(this, i3);
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("beginIndex=" + i2 + " < 0").toString());
        }
        if (!(iX2 <= size())) {
            throw new IllegalArgumentException(("endIndex=" + iX2 + " > length(" + size() + ')').toString());
        }
        int i4 = iX2 - i2;
        if (!(i4 >= 0)) {
            throw new IllegalArgumentException(("endIndex=" + iX2 + " < beginIndex=" + i2).toString());
        }
        if (i2 == 0 && iX2 == size()) {
            return this;
        }
        if (i2 == iX2) {
            return kja0.EMPTY;
        }
        int iN7h = okio.internal.f7l8.n7h(this, i2);
        int iN7h2 = okio.internal.f7l8.n7h(this, iX2 - 1);
        byte[][] bArr = (byte[][]) kotlin.collections.kja0.bek6(getSegments$okio(), iN7h, iN7h2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iN7h <= iN7h2) {
            int i5 = 0;
            int i6 = iN7h;
            while (true) {
                iArr[i5] = Math.min(getDirectory$okio()[i6] - i2, i4);
                int i7 = i5 + 1;
                iArr[i5 + bArr.length] = getDirectory$okio()[getSegments$okio().length + i6];
                if (i6 == iN7h2) {
                    break;
                }
                i6++;
                i5 = i7;
            }
        }
        int i8 = iN7h != 0 ? getDirectory$okio()[iN7h - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i2 - i8);
        return new uv6(bArr, iArr);
    }

    @Override // okio.kja0
    @InterfaceC7396q
    public kja0 toAsciiLowercase() {
        return toq().toAsciiLowercase();
    }

    @Override // okio.kja0
    @InterfaceC7396q
    public kja0 toAsciiUppercase() {
        return toq().toAsciiUppercase();
    }

    @Override // okio.kja0
    @InterfaceC7396q
    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        int length = getSegments$okio().length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int i5 = getDirectory$okio()[length + i2];
            int i6 = getDirectory$okio()[i2];
            int i7 = i6 - i3;
            kotlin.collections.kja0.y2(getSegments$okio()[i2], bArr, i4, i5, i5 + i7);
            i4 += i7;
            i2++;
            i3 = i6;
        }
        return bArr;
    }

    @Override // okio.kja0
    @InterfaceC7396q
    public String toString() {
        return toq().toString();
    }

    @Override // okio.kja0
    public void write(@InterfaceC7396q OutputStream out) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(out, "out");
        int length = getSegments$okio().length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = getDirectory$okio()[length + i2];
            int i5 = getDirectory$okio()[i2];
            out.write(getSegments$okio()[i2], i4, i5 - i3);
            i2++;
            i3 = i5;
        }
    }

    @Override // okio.kja0
    public void write$okio(@InterfaceC7396q x2 buffer, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(buffer, "buffer");
        int i4 = i2 + i3;
        int iN7h = okio.internal.f7l8.n7h(this, i2);
        while (i2 < i4) {
            int i5 = iN7h == 0 ? 0 : getDirectory$okio()[iN7h - 1];
            int i6 = getDirectory$okio()[iN7h] - i5;
            int i7 = getDirectory$okio()[getSegments$okio().length + iN7h];
            int iMin = Math.min(i4, i6 + i5) - i2;
            int i8 = i7 + (i2 - i5);
            C7541c c7541c = new C7541c(getSegments$okio()[iN7h], i8, i8 + iMin, true, false);
            C7541c c7541c2 = buffer.f43846k;
            if (c7541c2 == null) {
                c7541c.f94262f7l8 = c7541c;
                c7541c.f43686g = c7541c;
                buffer.f43846k = c7541c;
            } else {
                kotlin.jvm.internal.d2ok.qrj(c7541c2);
                C7541c c7541c3 = c7541c2.f94262f7l8;
                kotlin.jvm.internal.d2ok.qrj(c7541c3);
                c7541c3.zy(c7541c);
            }
            i2 += iMin;
            iN7h++;
        }
        buffer.vy(buffer.size() + ((long) i3));
    }

    @Override // okio.kja0
    public boolean rangeEquals(int i2, @InterfaceC7396q byte[] other, int i3, int i4) {
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        if (i2 < 0 || i2 > size() - i4 || i3 < 0 || i3 > other.length - i4) {
            return false;
        }
        int i5 = i4 + i2;
        int iN7h = okio.internal.f7l8.n7h(this, i2);
        while (i2 < i5) {
            int i6 = iN7h == 0 ? 0 : getDirectory$okio()[iN7h - 1];
            int i7 = getDirectory$okio()[iN7h] - i6;
            int i8 = getDirectory$okio()[getSegments$okio().length + iN7h];
            int iMin = Math.min(i5, i7 + i6) - i2;
            if (!C7575s.m27857q(getSegments$okio()[iN7h], i8 + (i2 - i6), other, i3, iMin)) {
                return false;
            }
            i3 += iMin;
            i2 += iMin;
            iN7h++;
        }
        return true;
    }
}
