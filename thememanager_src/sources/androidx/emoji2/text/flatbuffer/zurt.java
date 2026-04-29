package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: Table.java */
/* JADX INFO: loaded from: classes.dex */
public class zurt {

    /* JADX INFO: renamed from: k */
    protected int f4497k;

    /* JADX INFO: renamed from: n */
    fu4 f4498n = fu4.m3870q();

    /* JADX INFO: renamed from: q */
    private int f4499q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected ByteBuffer f51140toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f51141zy;

    /* JADX INFO: renamed from: androidx.emoji2.text.flatbuffer.zurt$k */
    /* JADX INFO: compiled from: Table.java */
    class C0822k implements Comparator<Integer> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ByteBuffer f4500k;

        C0822k(ByteBuffer byteBuffer) {
            this.f4500k = byteBuffer;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compare(Integer num, Integer num2) {
            return zurt.this.t8r(num, num2, this.f4500k);
        }
    }

    protected static int cdj(int i2, byte[] bArr, ByteBuffer byteBuffer) {
        int i3 = i2 + byteBuffer.getInt(i2);
        int i4 = byteBuffer.getInt(i3);
        int length = bArr.length;
        int i5 = i3 + 4;
        int iMin = Math.min(i4, length);
        for (int i6 = 0; i6 < iMin; i6++) {
            int i7 = i6 + i5;
            if (byteBuffer.get(i7) != bArr[i6]) {
                return byteBuffer.get(i7) - bArr[i6];
            }
        }
        return i4 - length;
    }

    /* JADX INFO: renamed from: h */
    protected static int m3996h(int i2, int i3, ByteBuffer byteBuffer) {
        int i4 = i2 + byteBuffer.getInt(i2);
        int i5 = i3 + byteBuffer.getInt(i3);
        int i6 = byteBuffer.getInt(i4);
        int i7 = byteBuffer.getInt(i5);
        int i8 = i4 + 4;
        int i9 = i5 + 4;
        int iMin = Math.min(i6, i7);
        for (int i10 = 0; i10 < iMin; i10++) {
            int i11 = i10 + i8;
            int i12 = i10 + i9;
            if (byteBuffer.get(i11) != byteBuffer.get(i12)) {
                return byteBuffer.get(i11) - byteBuffer.get(i12);
            }
        }
        return i6 - i7;
    }

    /* JADX INFO: renamed from: k */
    protected static boolean m3997k(ByteBuffer byteBuffer, String str) {
        if (str.length() != 4) {
            throw new AssertionError("FlatBuffers: file identifier must be length 4");
        }
        for (int i2 = 0; i2 < 4; i2++) {
            if (str.charAt(i2) != ((char) byteBuffer.get(byteBuffer.position() + 4 + i2))) {
                return false;
            }
        }
        return true;
    }

    protected static zurt ld6(zurt zurtVar, int i2, ByteBuffer byteBuffer) {
        zurtVar.f7l8(zy(i2, byteBuffer), byteBuffer);
        return zurtVar;
    }

    /* JADX INFO: renamed from: n */
    protected static int m3998n(int i2, int i3, ByteBuffer byteBuffer) {
        int iCapacity = byteBuffer.capacity() - i3;
        return byteBuffer.getShort((i2 + iCapacity) - byteBuffer.getInt(iCapacity)) + iCapacity;
    }

    /* JADX INFO: renamed from: s */
    protected static String m3999s(int i2, ByteBuffer byteBuffer, fu4 fu4Var) {
        int i3 = i2 + byteBuffer.getInt(i2);
        return fu4Var.mo3871k(byteBuffer, i3 + 4, byteBuffer.getInt(i3));
    }

    protected static int zy(int i2, ByteBuffer byteBuffer) {
        return i2 + byteBuffer.getInt(i2);
    }

    protected void f7l8(int i2, ByteBuffer byteBuffer) {
        this.f51140toq = byteBuffer;
        if (byteBuffer == null) {
            this.f4497k = 0;
            this.f51141zy = 0;
            this.f4499q = 0;
        } else {
            this.f4497k = i2;
            int i3 = i2 - byteBuffer.getInt(i2);
            this.f51141zy = i3;
            this.f4499q = this.f51140toq.getShort(i3);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m4000g() {
        f7l8(0, null);
    }

    /* JADX INFO: renamed from: i */
    protected void m4001i(int[] iArr, ByteBuffer byteBuffer) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i2] = Integer.valueOf(iArr[i2]);
        }
        Arrays.sort(numArr, new C0822k(byteBuffer));
        for (int i3 = 0; i3 < iArr.length; i3++) {
            iArr[i3] = numArr[i3].intValue();
        }
    }

    public ByteBuffer ki() {
        return this.f51140toq;
    }

    protected int kja0(int i2) {
        int i3 = i2 + this.f4497k;
        return this.f51140toq.getInt(i3 + this.f51140toq.getInt(i3));
    }

    protected ByteBuffer n7h(ByteBuffer byteBuffer, int i2, int i3) {
        int iM4003q = m4003q(i2);
        if (iM4003q == 0) {
            return null;
        }
        int iX2 = x2(iM4003q);
        byteBuffer.rewind();
        byteBuffer.limit((kja0(iM4003q) * i3) + iX2);
        byteBuffer.position(iX2);
        return byteBuffer;
    }

    /* JADX INFO: renamed from: p */
    protected zurt m4002p(zurt zurtVar, int i2) {
        return ld6(zurtVar, i2, this.f51140toq);
    }

    /* JADX INFO: renamed from: q */
    protected int m4003q(int i2) {
        if (i2 < this.f4499q) {
            return this.f51140toq.getShort(this.f51141zy + i2);
        }
        return 0;
    }

    protected ByteBuffer qrj(int i2, int i3) {
        int iM4003q = m4003q(i2);
        if (iM4003q == 0) {
            return null;
        }
        ByteBuffer byteBufferOrder = this.f51140toq.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int iX2 = x2(iM4003q);
        byteBufferOrder.position(iX2);
        byteBufferOrder.limit(iX2 + (kja0(iM4003q) * i3));
        return byteBufferOrder;
    }

    protected int t8r(Integer num, Integer num2, ByteBuffer byteBuffer) {
        return 0;
    }

    protected int toq(int i2) {
        return i2 + this.f51140toq.getInt(i2);
    }

    protected int x2(int i2) {
        int i3 = i2 + this.f4497k;
        return i3 + this.f51140toq.getInt(i3) + 4;
    }

    /* JADX INFO: renamed from: y */
    protected String m4004y(int i2) {
        return m3999s(i2, this.f51140toq, this.f4498n);
    }
}
