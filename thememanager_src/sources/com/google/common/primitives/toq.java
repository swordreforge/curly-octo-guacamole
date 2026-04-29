package com.google.common.primitives;

import com.google.common.base.jk;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: Bytes.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public final class toq {

    /* JADX INFO: renamed from: com.google.common.primitives.toq$k */
    /* JADX INFO: compiled from: Bytes.java */
    @wlev.toq
    private static class C4748k extends AbstractList<Byte> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final byte[] array;
        final int end;
        final int start;

        C4748k(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Byte) && toq.m16737s(this.array, ((Byte) obj).byteValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C4748k)) {
                return super.equals(obj);
            }
            C4748k c4748k = (C4748k) obj;
            int size = size();
            if (c4748k.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (this.array[this.start + i2] != c4748k.array[c4748k.start + i2]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iF7l8 = 1;
            for (int i2 = this.start; i2 < this.end; i2++) {
                iF7l8 = (iF7l8 * 31) + toq.f7l8(this.array[i2]);
            }
            return iF7l8;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int iM16737s;
            if (!(obj instanceof Byte) || (iM16737s = toq.m16737s(this.array, ((Byte) obj).byteValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iM16737s - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int iX2;
            if (!(obj instanceof Byte) || (iX2 = toq.x2(this.array, ((Byte) obj).byteValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iX2 - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Byte> subList(int i2, int i3) {
            jk.ek5k(i2, i3, size());
            if (i2 == i3) {
                return Collections.emptyList();
            }
            byte[] bArr = this.array;
            int i4 = this.start;
            return new C4748k(bArr, i2 + i4, i4 + i3);
        }

        byte[] toByteArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append((int) this.array[this.start]);
            int i2 = this.start;
            while (true) {
                i2++;
                if (i2 >= this.end) {
                    sb.append(']');
                    return sb.toString();
                }
                sb.append(", ");
                sb.append((int) this.array[i2]);
            }
        }

        C4748k(byte[] bArr, int i2, int i3) {
            this.array = bArr;
            this.start = i2;
            this.end = i3;
        }

        @Override // java.util.AbstractList, java.util.List
        public Byte get(int i2) {
            jk.mcp(i2, size());
            return Byte.valueOf(this.array[this.start + i2]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Byte set(int i2, Byte b2) {
            jk.mcp(i2, size());
            byte[] bArr = this.array;
            int i3 = this.start;
            byte b3 = bArr[i3 + i2];
            bArr[i3 + i2] = ((Byte) jk.a9(b2)).byteValue();
            return Byte.valueOf(b3);
        }
    }

    private toq() {
    }

    public static int f7l8(byte b2) {
        return b2;
    }

    /* JADX INFO: renamed from: g */
    public static byte[] m16732g(byte[] bArr, int i2, int i3) {
        jk.ld6(i2 >= 0, "Invalid minLength: %s", i2);
        jk.ld6(i3 >= 0, "Invalid padding: %s", i3);
        return bArr.length < i2 ? Arrays.copyOf(bArr, i2 + i3) : bArr;
    }

    public static byte[] kja0(Collection<? extends Number> collection) {
        if (collection instanceof C4748k) {
            return ((C4748k) collection).toByteArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = ((Number) jk.a9(array[i2])).byteValue();
        }
        return bArr;
    }

    public static int ld6(byte[] bArr, byte b2) {
        return x2(bArr, b2, 0, bArr.length);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m16734n(byte[] bArr, byte b2) {
        for (byte b3 : bArr) {
            if (b3 == b2) {
                return true;
            }
        }
        return false;
    }

    public static void n7h(byte[] bArr, int i2, int i3) {
        jk.a9(bArr);
        jk.ek5k(i2, i3, bArr.length);
        for (int i4 = i3 - 1; i2 < i4; i4--) {
            byte b2 = bArr[i2];
            bArr[i2] = bArr[i4];
            bArr[i4] = b2;
            i2++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m16735p(byte[] r5, byte[] r6) {
        /*
            java.lang.String r0 = "array"
            com.google.common.base.jk.fti(r5, r0)
            java.lang.String r0 = "target"
            com.google.common.base.jk.fti(r6, r0)
            int r0 = r6.length
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r0 = r1
        L10:
            int r2 = r5.length
            int r3 = r6.length
            int r2 = r2 - r3
            int r2 = r2 + 1
            if (r0 >= r2) goto L2a
            r2 = r1
        L18:
            int r3 = r6.length
            if (r2 >= r3) goto L29
            int r3 = r0 + r2
            r3 = r5[r3]
            r4 = r6[r2]
            if (r3 == r4) goto L26
            int r0 = r0 + 1
            goto L10
        L26:
            int r2 = r2 + 1
            goto L18
        L29:
            return r0
        L2a:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.toq.m16735p(byte[], byte[]):int");
    }

    /* JADX INFO: renamed from: q */
    public static byte[] m16736q(byte[]... bArr) {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    public static void qrj(byte[] bArr) {
        jk.a9(bArr);
        n7h(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static int m16737s(byte[] bArr, byte b2, int i2, int i3) {
        while (i2 < i3) {
            if (bArr[i2] == b2) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int x2(byte[] bArr, byte b2, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (bArr[i4] == b2) {
                return i4;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: y */
    public static int m16738y(byte[] bArr, byte b2) {
        return m16737s(bArr, b2, 0, bArr.length);
    }

    public static List<Byte> zy(byte... bArr) {
        return bArr.length == 0 ? Collections.emptyList() : new C4748k(bArr);
    }
}
