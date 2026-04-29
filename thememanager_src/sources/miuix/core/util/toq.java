package miuix.core.util;

import com.android.thememanager.share.C2706p;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: DirectIndexedFile.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {

    /* JADX INFO: renamed from: k */
    private static final String f39907k = "DensityIndexFile: ";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final boolean f87382toq = false;

    /* JADX INFO: compiled from: DirectIndexedFile.java */
    private static class f7l8 {

        /* JADX INFO: renamed from: q */
        private static final int f39908q = 2;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final byte[] f87383zy = {73, 68, 70, 32};

        /* JADX INFO: renamed from: k */
        private C7094g[] f39909k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f87384toq;

        /* synthetic */ f7l8(int i2, int i3, C7095k c7095k) {
            this(i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public int m25628g(DataOutput dataOutput) throws IOException {
            byte[] bArr = f87383zy;
            int length = bArr.length + 4 + 4 + 4;
            if (dataOutput != null) {
                dataOutput.write(bArr);
                dataOutput.writeInt(2);
                dataOutput.writeInt(this.f39909k.length);
                dataOutput.writeInt(this.f87384toq);
            }
            for (C7094g c7094g : this.f39909k) {
                length += c7094g.m25636y(dataOutput);
            }
            return length;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public static f7l8 m25630n(DataInput dataInput) throws IOException {
            int length = f87383zy.length;
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                bArr[i2] = dataInput.readByte();
            }
            if (!Arrays.equals(bArr, f87383zy)) {
                throw new IOException("File tag unmatched, file may be corrupt");
            }
            if (dataInput.readInt() != 2) {
                throw new IOException("File version unmatched, please upgrade your reader");
            }
            int i3 = dataInput.readInt();
            f7l8 f7l8Var = new f7l8(i3, dataInput.readInt());
            for (int i4 = 0; i4 < i3; i4++) {
                f7l8Var.f39909k[i4] = C7094g.f7l8(dataInput);
            }
            return f7l8Var;
        }

        private f7l8(int i2, int i3) {
            this.f39909k = new C7094g[i2];
            this.f87384toq = i3;
        }
    }

    /* JADX INFO: renamed from: miuix.core.util.toq$g */
    /* JADX INFO: compiled from: DirectIndexedFile.java */
    private static class C7094g {

        /* JADX INFO: renamed from: k */
        private long f39910k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private long f87385toq;

        /* synthetic */ C7094g(long j2, long j3, C7095k c7095k) {
            this(j2, j3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static C7094g f7l8(DataInput dataInput) throws IOException {
            return new C7094g(dataInput.readLong(), dataInput.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: y */
        public int m25636y(DataOutput dataOutput) throws IOException {
            if (dataOutput == null) {
                return 16;
            }
            dataOutput.writeLong(this.f39910k);
            dataOutput.writeLong(this.f87385toq);
            return 16;
        }

        private C7094g(long j2, long j3) {
            this.f39910k = j2;
            this.f87385toq = j3;
        }
    }

    /* JADX INFO: renamed from: miuix.core.util.toq$k */
    /* JADX INFO: compiled from: DirectIndexedFile.java */
    static /* synthetic */ class C7095k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f39911k;

        static {
            int[] iArr = new int[C7096n.k.values().length];
            f39911k = iArr;
            try {
                iArr[C7096n.k.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39911k[C7096n.k.BYTE_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39911k[C7096n.k.SHORT_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39911k[C7096n.k.INTEGER_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39911k[C7096n.k.LONG_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39911k[C7096n.k.BYTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f39911k[C7096n.k.SHORT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f39911k[C7096n.k.INTEGER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f39911k[C7096n.k.LONG.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: renamed from: miuix.core.util.toq$n */
    /* JADX INFO: compiled from: DirectIndexedFile.java */
    private static class C7096n {

        /* JADX INFO: renamed from: g */
        private static byte[] f39912g = new byte[1024];

        /* JADX INFO: renamed from: k */
        private k f39913k;

        /* JADX INFO: renamed from: n */
        private long f39914n;

        /* JADX INFO: renamed from: q */
        private byte f39915q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private byte f87386toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private byte f87387zy;

        /* JADX INFO: renamed from: miuix.core.util.toq$n$k */
        /* JADX INFO: compiled from: DirectIndexedFile.java */
        private enum k {
            BYTE,
            SHORT,
            INTEGER,
            LONG,
            STRING,
            BYTE_ARRAY,
            SHORT_ARRAY,
            INTEGER_ARRAY,
            LONG_ARRAY
        }

        /* synthetic */ C7096n(k kVar, byte b2, byte b3, byte b4, long j2, C7095k c7095k) {
            this(kVar, b2, b3, b4, j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object[] cdj(InterfaceC7099s interfaceC7099s) throws IOException {
            switch (C7095k.f39911k[this.f39913k.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    Object[] objArr = new Object[interfaceC7099s.readInt()];
                    objArr[0] = ki(interfaceC7099s, 0);
                    return objArr;
                case 6:
                    return new Object[]{Byte.valueOf(interfaceC7099s.readByte())};
                case 7:
                    return new Object[]{Short.valueOf(interfaceC7099s.readShort())};
                case 8:
                    return new Object[]{Integer.valueOf(interfaceC7099s.readInt())};
                case 9:
                    return new Object[]{Long.valueOf(interfaceC7099s.readLong())};
                default:
                    return null;
            }
        }

        private static void fn3e(DataOutput dataOutput, int i2, long j2) throws IOException {
            if (i2 == 1) {
                dataOutput.writeByte((int) j2);
                return;
            }
            if (i2 == 2) {
                dataOutput.writeShort((int) j2);
                return;
            }
            if (i2 == 4) {
                dataOutput.writeInt((int) j2);
            } else {
                if (i2 == 8) {
                    dataOutput.writeLong(j2);
                    return;
                }
                throw new IllegalArgumentException("Unsuppoert size " + i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static long m25638h(DataInput dataInput, int i2) throws IOException {
            int i3;
            if (i2 == 1) {
                i3 = dataInput.readByte();
            } else if (i2 == 2) {
                i3 = dataInput.readShort();
            } else {
                if (i2 != 4) {
                    if (i2 == 8) {
                        return dataInput.readLong();
                    }
                    throw new IllegalArgumentException("Unsuppoert size " + i2);
                }
                i3 = dataInput.readInt();
            }
            return i3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: i */
        public int m25639i(DataOutput dataOutput) throws IOException {
            if (dataOutput == null) {
                return 12;
            }
            dataOutput.writeByte(this.f39913k.ordinal());
            dataOutput.writeByte(this.f87386toq);
            dataOutput.writeByte(this.f87387zy);
            dataOutput.writeByte(this.f39915q);
            dataOutput.writeLong(this.f39914n);
            return 12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v11, types: [long[]] */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v9, types: [int[]] */
        public Object ki(InterfaceC7099s interfaceC7099s, int i2) throws IOException {
            short[] str;
            long jMo25656k = interfaceC7099s.mo25656k();
            if (i2 != 0) {
                interfaceC7099s.zy(((long) (this.f39915q * i2)) + jMo25656k);
            }
            interfaceC7099s.zy(jMo25656k + m25638h(interfaceC7099s, this.f39915q));
            int i3 = C7095k.f39911k[this.f39913k.ordinal()];
            byte[] bArrQrj = null;
            int i4 = 0;
            if (i3 == 1) {
                int iM25638h = (int) m25638h(interfaceC7099s, this.f87387zy);
                bArrQrj = qrj(iM25638h);
                interfaceC7099s.readFully(bArrQrj, 0, iM25638h);
                str = new String(bArrQrj, 0, iM25638h);
            } else if (i3 == 2) {
                byte[] bArr = new byte[(int) m25638h(interfaceC7099s, this.f87387zy)];
                interfaceC7099s.readFully(bArr);
                str = bArr;
            } else if (i3 == 3) {
                int iM25638h2 = (int) m25638h(interfaceC7099s, this.f87387zy);
                str = new short[iM25638h2];
                while (i4 < iM25638h2) {
                    str[i4] = interfaceC7099s.readShort();
                    i4++;
                }
            } else if (i3 == 4) {
                int iM25638h3 = (int) m25638h(interfaceC7099s, this.f87387zy);
                str = new int[iM25638h3];
                while (i4 < iM25638h3) {
                    str[i4] = interfaceC7099s.readInt();
                    i4++;
                }
            } else if (i3 != 5) {
                str = 0;
            } else {
                int iM25638h4 = (int) m25638h(interfaceC7099s, this.f87387zy);
                str = new long[iM25638h4];
                while (i4 < iM25638h4) {
                    str[i4] = interfaceC7099s.readLong();
                    i4++;
                }
            }
            t8r(bArrQrj);
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static C7096n kja0(DataInput dataInput) throws IOException {
            return new C7096n(k.values()[dataInput.readByte()], dataInput.readByte(), dataInput.readByte(), dataInput.readByte(), dataInput.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static byte n7h(int i2) {
            byte b2 = 0;
            for (long j2 = i2 * 2; j2 > 0; j2 >>= 8) {
                b2 = (byte) (b2 + 1);
            }
            if (b2 == 3) {
                return (byte) 4;
            }
            if (b2 <= 4 || b2 >= 8) {
                return b2;
            }
            return (byte) 8;
        }

        /* JADX WARN: Removed duplicated region for block: B:57:0x005b A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x001a A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private int ni7(java.io.DataOutput r13, java.util.List<java.lang.Object> r14) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 203
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: miuix.core.util.toq.C7096n.ni7(java.io.DataOutput, java.util.List):int");
        }

        private static byte[] qrj(int i2) {
            byte[] bArr;
            synchronized (C7096n.class) {
                byte[] bArr2 = f39912g;
                if (bArr2 == null || bArr2.length < i2) {
                    f39912g = new byte[i2];
                }
                bArr = f39912g;
                f39912g = null;
            }
            return bArr;
        }

        private static void t8r(byte[] bArr) {
            synchronized (C7096n.class) {
                if (bArr != null) {
                    byte[] bArr2 = f39912g;
                    if (bArr2 == null || bArr2.length < bArr.length) {
                        f39912g = bArr;
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int zurt(DataOutput dataOutput, List<Object> list) throws IOException {
            int iNi7 = 4;
            switch (C7095k.f39911k[this.f39913k.ordinal()]) {
                case 1:
                    if (dataOutput != null) {
                        dataOutput.writeInt(list.size());
                    }
                    int iNi72 = 4 + ni7(dataOutput, list);
                    Iterator<Object> it = list.iterator();
                    int length = iNi72;
                    while (it.hasNext()) {
                        byte[] bytes = ((String) it.next()).getBytes();
                        if (dataOutput != null) {
                            fn3e(dataOutput, this.f87387zy, bytes.length);
                            for (byte b2 : bytes) {
                                dataOutput.writeByte(b2);
                            }
                        }
                        length += this.f87387zy + bytes.length;
                    }
                    return length;
                case 2:
                    if (dataOutput != null) {
                        dataOutput.writeInt(list.size());
                    }
                    int iNi73 = 4 + ni7(dataOutput, list);
                    Iterator<Object> it2 = list.iterator();
                    int length2 = iNi73;
                    while (it2.hasNext()) {
                        byte[] bArr = (byte[]) it2.next();
                        if (dataOutput != null) {
                            fn3e(dataOutput, this.f87387zy, bArr.length);
                            dataOutput.write(bArr);
                        }
                        length2 += this.f87387zy + bArr.length;
                    }
                    return length2;
                case 3:
                    if (dataOutput != null) {
                        dataOutput.writeInt(list.size());
                    }
                    int iNi74 = 4 + ni7(dataOutput, list);
                    Iterator<Object> it3 = list.iterator();
                    int length3 = iNi74;
                    while (it3.hasNext()) {
                        short[] sArr = (short[]) it3.next();
                        if (dataOutput != null) {
                            fn3e(dataOutput, this.f87387zy, sArr.length);
                            for (short s2 : sArr) {
                                dataOutput.writeShort(s2);
                            }
                        }
                        length3 += this.f87387zy + (sArr.length * 2);
                    }
                    return length3;
                case 4:
                    if (dataOutput != null) {
                        dataOutput.writeInt(list.size());
                    }
                    int iNi75 = ni7(dataOutput, list) + 4;
                    Iterator<Object> it4 = list.iterator();
                    int length4 = iNi75;
                    while (it4.hasNext()) {
                        int[] iArr = (int[]) it4.next();
                        if (dataOutput != null) {
                            fn3e(dataOutput, this.f87387zy, iArr.length);
                            for (int i2 : iArr) {
                                dataOutput.writeInt(i2);
                            }
                        }
                        length4 += this.f87387zy + (iArr.length * 4);
                    }
                    return length4;
                case 5:
                    if (dataOutput != null) {
                        dataOutput.writeInt(list.size());
                    }
                    iNi7 = 4 + ni7(dataOutput, list);
                    Iterator<Object> it5 = list.iterator();
                    while (it5.hasNext()) {
                        long[] jArr = (long[]) it5.next();
                        if (dataOutput != null) {
                            fn3e(dataOutput, this.f87387zy, jArr.length);
                            for (long j2 : jArr) {
                                dataOutput.writeLong(j2);
                            }
                        }
                        iNi7 += this.f87387zy + (jArr.length * 8);
                    }
                    break;
                case 6:
                    if (dataOutput != null) {
                        dataOutput.writeByte(((Byte) list.get(0)).byteValue());
                    }
                    return 1;
                case 7:
                    if (dataOutput != null) {
                        dataOutput.writeShort(((Short) list.get(0)).shortValue());
                    }
                    return 2;
                case 8:
                    if (dataOutput != null) {
                        dataOutput.writeInt(((Integer) list.get(0)).intValue());
                    }
                    break;
                case 9:
                    if (dataOutput == null) {
                        return 8;
                    }
                    dataOutput.writeLong(((Long) list.get(0)).longValue());
                    return 8;
                default:
                    return 0;
            }
            return iNi7;
        }

        private C7096n(k kVar, byte b2, byte b3, byte b4, long j2) {
            this.f39913k = kVar;
            this.f87386toq = b2;
            this.f87387zy = b3;
            this.f39915q = b4;
            this.f39914n = j2;
        }
    }

    /* JADX INFO: renamed from: miuix.core.util.toq$p */
    /* JADX INFO: compiled from: DirectIndexedFile.java */
    public static class C7097p {

        /* JADX INFO: renamed from: k */
        private InterfaceC7099s f39917k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private f7l8 f87388toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private k[] f87389zy;

        /* JADX INFO: renamed from: miuix.core.util.toq$p$k */
        /* JADX INFO: compiled from: DirectIndexedFile.java */
        private static class k {

            /* JADX INFO: renamed from: k */
            private C7101y[] f39918k;

            /* JADX INFO: renamed from: q */
            private int f39919q;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            private C7096n[] f87390toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            private Object[][] f87391zy;

            private k() {
            }

            /* JADX INFO: renamed from: s */
            static /* synthetic */ int m25654s(k kVar, int i2) {
                int i3 = kVar.f39919q + i2;
                kVar.f39919q = i3;
                return i3;
            }

            /* synthetic */ k(C7095k c7095k) {
                this();
            }
        }

        /* synthetic */ C7097p(InputStream inputStream, C7095k c7095k) throws IOException {
            this(inputStream);
        }

        private Object f7l8(int i2, int i3, int i4) throws IOException {
            if (this.f87389zy[i2].f87391zy[i3][i4] == null) {
                this.f39917k.zy(this.f87389zy[i2].f87390toq[i3].f39914n + 4);
                this.f87389zy[i2].f87391zy[i3][i4] = this.f87389zy[i2].f87390toq[i3].ki(this.f39917k, i4);
            }
            return this.f87389zy[i2].f87391zy[i3][i4];
        }

        /* JADX INFO: renamed from: g */
        private long m25646g(int i2, int i3) {
            C7101y c7101y;
            int length = this.f87389zy[i2].f39918k.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    c7101y = null;
                    break;
                }
                int i5 = (length + i4) / 2;
                if (this.f87389zy[i2].f39918k[i5].f39932k <= i3) {
                    if (this.f87389zy[i2].f39918k[i5].f87398toq > i3) {
                        c7101y = this.f87389zy[i2].f39918k[i5];
                        break;
                    }
                    i4 = i5 + 1;
                } else {
                    length = i5;
                }
            }
            if (c7101y != null) {
                return c7101y.f87399zy + ((long) ((i3 - c7101y.f39932k) * this.f87389zy[i2].f39919q));
            }
            return -1L;
        }

        private void toq(String str) throws IOException {
            System.currentTimeMillis();
            try {
                this.f39917k.zy(0L);
                f7l8 f7l8VarM25630n = f7l8.m25630n(this.f39917k);
                this.f87388toq = f7l8VarM25630n;
                this.f87389zy = new k[f7l8VarM25630n.f39909k.length];
                for (int i2 = 0; i2 < this.f87388toq.f39909k.length; i2++) {
                    this.f87389zy[i2] = new k(null);
                    this.f39917k.zy(this.f87388toq.f39909k[i2].f39910k);
                    int i3 = this.f39917k.readInt();
                    this.f87389zy[i2].f39918k = new C7101y[i3];
                    for (int i4 = 0; i4 < i3; i4++) {
                        this.f87389zy[i2].f39918k[i4] = C7101y.zy(this.f39917k);
                    }
                    this.f39917k.zy(this.f87388toq.f39909k[i2].f87385toq);
                    int i5 = this.f39917k.readInt();
                    this.f87389zy[i2].f39919q = 0;
                    this.f87389zy[i2].f87390toq = new C7096n[i5];
                    for (int i6 = 0; i6 < i5; i6++) {
                        this.f87389zy[i2].f87390toq[i6] = C7096n.kja0(this.f39917k);
                        k kVar = this.f87389zy[i2];
                        k.m25654s(kVar, kVar.f87390toq[i6].f87386toq);
                    }
                    this.f87389zy[i2].f87391zy = new Object[i5][];
                    for (int i7 = 0; i7 < i5; i7++) {
                        this.f39917k.zy(this.f87389zy[i2].f87390toq[i7].f39914n);
                        this.f87389zy[i2].f87391zy[i7] = this.f87389zy[i2].f87390toq[i7].cdj(this.f39917k);
                    }
                }
            } catch (IOException e2) {
                m25647k();
                throw e2;
            }
        }

        /* JADX INFO: renamed from: k */
        public synchronized void m25647k() {
            InterfaceC7099s interfaceC7099s = this.f39917k;
            if (interfaceC7099s != null) {
                try {
                    interfaceC7099s.close();
                } catch (IOException unused) {
                }
            }
            this.f39917k = null;
            this.f87388toq = null;
            this.f87389zy = null;
        }

        /* JADX INFO: renamed from: n */
        public int m25648n() {
            f7l8 f7l8Var = this.f87388toq;
            if (f7l8Var == null) {
                return -1;
            }
            return f7l8Var.f87384toq;
        }

        /* JADX INFO: renamed from: q */
        public synchronized Object[] m25649q(int i2, int i3) {
            if (this.f39917k == null) {
                throw new IllegalStateException("Get data from a corrupt file");
            }
            if (i2 < 0 || i2 >= this.f87389zy.length) {
                throw new IllegalArgumentException("Cannot get data kind " + i2);
            }
            System.currentTimeMillis();
            long jM25646g = m25646g(i2, i3);
            int length = this.f87389zy[i2].f87390toq.length;
            Object[] objArr = new Object[length];
            if (jM25646g < 0) {
                for (int i4 = 0; i4 < length; i4++) {
                    objArr[i4] = this.f87389zy[i2].f87391zy[i4][0];
                }
                return objArr;
            }
            try {
                this.f39917k.zy(jM25646g);
                for (int i5 = 0; i5 < length; i5++) {
                    switch (C7095k.f39911k[this.f87389zy[i2].f87390toq[i5].f39913k.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            try {
                                int iM25638h = (int) C7096n.m25638h(this.f39917k, this.f87389zy[i2].f87390toq[i5].f87386toq);
                                long jMo25656k = this.f39917k.mo25656k();
                                objArr[i5] = f7l8(i2, i5, iM25638h);
                                this.f39917k.zy(jMo25656k);
                            } catch (IOException e2) {
                                throw new IllegalStateException("File may be corrupt due to invalid data index size", e2);
                            }
                            break;
                        case 6:
                            objArr[i5] = Byte.valueOf(this.f39917k.readByte());
                            break;
                        case 7:
                            objArr[i5] = Short.valueOf(this.f39917k.readShort());
                            break;
                        case 8:
                            objArr[i5] = Integer.valueOf(this.f39917k.readInt());
                            break;
                        case 9:
                            objArr[i5] = Long.valueOf(this.f39917k.readLong());
                            break;
                        default:
                            throw new IllegalStateException("Unknown type " + this.f87389zy[i2].f87390toq[i5].f39913k);
                    }
                }
                return objArr;
            } catch (IOException e3) {
                throw new IllegalStateException("Seek data from a corrupt file", e3);
            }
        }

        public synchronized Object zy(int i2, int i3, int i4) {
            Object obj;
            if (this.f39917k == null) {
                throw new IllegalStateException("Get data from a corrupt file");
            }
            if (i2 >= 0) {
                k[] kVarArr = this.f87389zy;
                if (i2 < kVarArr.length) {
                    if (i4 < 0 || i4 >= kVarArr[i2].f87390toq.length) {
                        throw new IllegalArgumentException("DataIndex " + i4 + " out of range[0, " + this.f87389zy[i2].f87390toq.length + ")");
                    }
                    System.currentTimeMillis();
                    long jM25646g = m25646g(i2, i3);
                    Object objF7l8 = null;
                    if (jM25646g < 0) {
                        obj = this.f87389zy[i2].f87391zy[i4][0];
                    } else {
                        try {
                            this.f39917k.zy(jM25646g);
                            for (int i5 = 0; i5 <= i4; i5++) {
                                switch (C7095k.f39911k[this.f87389zy[i2].f87390toq[i5].f39913k.ordinal()]) {
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                        try {
                                            int iM25638h = (int) C7096n.m25638h(this.f39917k, this.f87389zy[i2].f87390toq[i5].f87386toq);
                                            if (i5 == i4) {
                                                objF7l8 = f7l8(i2, i4, iM25638h);
                                            }
                                        } catch (IOException e2) {
                                            throw new IllegalStateException("File may be corrupt due to invalid data index size", e2);
                                        }
                                        break;
                                    case 6:
                                        objF7l8 = Byte.valueOf(this.f39917k.readByte());
                                        break;
                                    case 7:
                                        objF7l8 = Short.valueOf(this.f39917k.readShort());
                                        break;
                                    case 8:
                                        objF7l8 = Integer.valueOf(this.f39917k.readInt());
                                        break;
                                    case 9:
                                        objF7l8 = Long.valueOf(this.f39917k.readLong());
                                        break;
                                    default:
                                        throw new IllegalStateException("Unknown type " + this.f87389zy[i2].f87390toq[i5].f39913k);
                                }
                            }
                            obj = objF7l8;
                        } catch (IOException e3) {
                            throw new IllegalStateException("Seek data from a corrupt file", e3);
                        }
                    }
                }
            }
            throw new IllegalArgumentException("Kind " + i2 + " out of range[0, " + this.f87389zy.length + ")");
            return obj;
        }

        /* synthetic */ C7097p(String str, C7095k c7095k) throws IOException {
            this(str);
        }

        private C7097p(InputStream inputStream) throws IOException {
            this.f39917k = new C7098q(inputStream);
            toq("assets");
        }

        private C7097p(String str) throws IOException {
            this.f39917k = new zy(new RandomAccessFile(str, "r"));
            toq(str);
        }
    }

    /* JADX INFO: renamed from: miuix.core.util.toq$s */
    /* JADX INFO: compiled from: DirectIndexedFile.java */
    private interface InterfaceC7099s extends DataInput {
        void close() throws IOException;

        /* JADX INFO: renamed from: k */
        long mo25656k() throws IOException;

        void zy(long j2) throws IOException;
    }

    /* JADX INFO: renamed from: miuix.core.util.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DirectIndexedFile.java */
    public static class C8102toq {

        /* JADX INFO: renamed from: k */
        private f7l8 f39922k;

        /* JADX INFO: renamed from: q */
        private int f39923q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private ArrayList<C8103toq> f87392toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private C8103toq f87393zy;

        /* JADX INFO: renamed from: miuix.core.util.toq$toq$toq, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DirectIndexedFile.java */
        private static class C8103toq {

            /* JADX INFO: renamed from: g */
            private C7101y[] f39925g;

            /* JADX INFO: renamed from: k */
            private zy f39926k;

            /* JADX INFO: renamed from: n */
            private C7096n[] f39927n;

            /* JADX INFO: renamed from: q */
            private ArrayList<C7100k> f39928q;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            private HashMap<Integer, zy> f87396toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            private ArrayList<ArrayList<zy>> f87397zy;

            /* synthetic */ C8103toq(int i2, C7095k c7095k) {
                this(i2);
            }

            private C8103toq(int i2) {
                this.f87396toq = new HashMap<>();
                this.f39928q = new ArrayList<>();
                this.f87397zy = new ArrayList<>();
                this.f39927n = new C7096n[i2];
            }
        }

        /* JADX INFO: renamed from: miuix.core.util.toq$toq$zy */
        /* JADX INFO: compiled from: DirectIndexedFile.java */
        private class zy implements Comparable<zy> {

            /* JADX INFO: renamed from: k */
            private int f39929k;

            /* JADX INFO: renamed from: q */
            private Object[] f39931q;

            /* synthetic */ zy(C8102toq c8102toq, int i2, Object[] objArr, C7095k c7095k) {
                this(i2, objArr);
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                return (obj instanceof zy) && this.f39929k == ((zy) obj).f39929k;
            }

            public int hashCode() {
                return this.f39929k;
            }

            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public int compareTo(zy zyVar) {
                return this.f39929k - zyVar.f39929k;
            }

            private zy(int i2, Object[] objArr) {
                this.f39929k = i2;
                this.f39931q = objArr;
            }
        }

        /* synthetic */ C8102toq(int i2, C7095k c7095k) {
            this(i2);
        }

        /* JADX INFO: renamed from: g */
        private void m25657g() {
            m25658n();
            if (this.f87393zy.f87397zy.size() == 0) {
                throw new IllegalArgumentException("Please add a data group before adding data");
            }
        }

        /* JADX INFO: renamed from: n */
        private void m25658n() {
            if (this.f87393zy == null) {
                throw new IllegalArgumentException("Please add a data kind before adding group");
            }
        }

        /* JADX INFO: renamed from: q */
        private void m25659q() {
            int size = this.f87392toq.size();
            this.f39922k = new f7l8(size, this.f39923q, null);
            for (int i2 = 0; i2 < size; i2++) {
                C8103toq c8103toq = this.f87392toq.get(i2);
                this.f39922k.f39909k[i2] = new C7094g(0L, 0L, null);
                int i3 = 0;
                while (i3 < c8103toq.f87397zy.size() && ((ArrayList) c8103toq.f87397zy.get(i3)).size() != 0) {
                    i3++;
                }
                c8103toq.f39925g = new C7101y[i3];
                for (int i4 = 0; i4 < c8103toq.f39925g.length; i4++) {
                    ArrayList arrayList = (ArrayList) c8103toq.f87397zy.get(i4);
                    Collections.sort(arrayList);
                    c8103toq.f39925g[i4] = new C7101y(((zy) arrayList.get(0)).f39929k, ((zy) arrayList.get(arrayList.size() - 1)).f39929k + 1, 0L, null);
                }
            }
            try {
                m25660s(null);
            } catch (IOException unused) {
            }
        }

        /* JADX INFO: renamed from: s */
        private int m25660s(DataOutput dataOutput) throws IOException {
            int iZurt = 0;
            for (int i2 = 0; i2 < this.f39922k.f39909k.length; i2++) {
                int iM25628g = iZurt + this.f39922k.m25628g(dataOutput);
                this.f39922k.f39909k[i2].f39910k = iM25628g;
                C8103toq c8103toq = this.f87392toq.get(i2);
                if (dataOutput != null) {
                    dataOutput.writeInt(c8103toq.f39925g.length);
                }
                int iM25674q = iM25628g + 4;
                for (int i3 = 0; i3 < c8103toq.f39925g.length; i3++) {
                    iM25674q += c8103toq.f39925g[i3].m25674q(dataOutput);
                }
                this.f39922k.f39909k[i2].f87385toq = iM25674q;
                if (dataOutput != null) {
                    dataOutput.writeInt(c8103toq.f39927n.length);
                }
                iZurt = iM25674q + 4;
                for (int i4 = 0; i4 < c8103toq.f39927n.length; i4++) {
                    iZurt += c8103toq.f39927n[i4].m25639i(dataOutput);
                }
                for (int i5 = 0; i5 < c8103toq.f39927n.length; i5++) {
                    c8103toq.f39927n[i5].f39914n = iZurt;
                    iZurt += c8103toq.f39927n[i5].zurt(dataOutput, ((C7100k) c8103toq.f39928q.get(i5)).m25666q());
                }
                for (int i6 = 0; i6 < c8103toq.f39925g.length; i6++) {
                    c8103toq.f39925g[i6].f87399zy = iZurt;
                    if (dataOutput == null) {
                        int i7 = 0;
                        for (int i8 = 0; i8 < c8103toq.f39927n.length; i8++) {
                            i7 += c8103toq.f39927n[i8].f87386toq;
                        }
                        iZurt += (c8103toq.f39925g[i6].f87398toq - c8103toq.f39925g[i6].f39932k) * i7;
                    } else {
                        for (int i9 = c8103toq.f39925g[i6].f39932k; i9 < c8103toq.f39925g[i6].f87398toq; i9++) {
                            zy zyVar = (zy) c8103toq.f87396toq.get(Integer.valueOf(i9));
                            if (zyVar == null) {
                                zyVar = c8103toq.f39926k;
                            }
                            for (int i10 = 0; i10 < c8103toq.f39927n.length; i10++) {
                                if (c8103toq.f39927n[i10].f87386toq == 1) {
                                    dataOutput.writeByte(((Integer) zyVar.f39931q[i10]).intValue());
                                } else if (c8103toq.f39927n[i10].f87386toq == 2) {
                                    dataOutput.writeShort(((Integer) zyVar.f39931q[i10]).intValue());
                                } else if (c8103toq.f39927n[i10].f87386toq == 4) {
                                    dataOutput.writeInt(((Integer) zyVar.f39931q[i10]).intValue());
                                } else if (c8103toq.f39927n[i10].f87386toq == 8) {
                                    dataOutput.writeLong(((Long) zyVar.f39931q[i10]).longValue());
                                }
                                iZurt += c8103toq.f39927n[i10].f87386toq;
                            }
                        }
                    }
                }
            }
            return iZurt;
        }

        public void f7l8() {
            if (this.f87393zy.f87397zy.size() == 0 || ((ArrayList) this.f87393zy.f87397zy.get(this.f87393zy.f87397zy.size() - 1)).size() != 0) {
                this.f87393zy.f87397zy.add(new ArrayList());
            }
        }

        /* JADX INFO: renamed from: k */
        public void m25661k(int i2, Object... objArr) {
            m25657g();
            if (this.f87393zy.f39927n.length != objArr.length) {
                throw new IllegalArgumentException("Different number of objects inputted, " + this.f87393zy.f39927n.length + " data expected");
            }
            for (int i3 = 0; i3 < objArr.length; i3++) {
                switch (C7095k.f39911k[this.f87393zy.f39927n[i3].f39913k.ordinal()]) {
                    case 1:
                        if (!(objArr[i3] instanceof String)) {
                            throw new IllegalArgumentException("Object[" + i3 + "] should be String");
                        }
                        objArr[i3] = ((C7100k) this.f87393zy.f39928q.get(i3)).m25665n(objArr[i3]);
                        this.f87393zy.f39927n[i3].f87386toq = C7096n.n7h(((C7100k) this.f87393zy.f39928q.get(i3)).m25663g());
                        break;
                        break;
                    case 2:
                        if (!(objArr[i3] instanceof byte[])) {
                            throw new IllegalArgumentException("Object[" + i3 + "] should be byte[]");
                        }
                        objArr[i3] = ((C7100k) this.f87393zy.f39928q.get(i3)).m25665n(objArr[i3]);
                        this.f87393zy.f39927n[i3].f87386toq = C7096n.n7h(((C7100k) this.f87393zy.f39928q.get(i3)).m25663g());
                        break;
                        break;
                    case 3:
                        if (!(objArr[i3] instanceof short[])) {
                            throw new IllegalArgumentException("Object[" + i3 + "] should be short[]");
                        }
                        objArr[i3] = ((C7100k) this.f87393zy.f39928q.get(i3)).m25665n(objArr[i3]);
                        this.f87393zy.f39927n[i3].f87386toq = C7096n.n7h(((C7100k) this.f87393zy.f39928q.get(i3)).m25663g());
                        break;
                        break;
                    case 4:
                        if (!(objArr[i3] instanceof int[])) {
                            throw new IllegalArgumentException("Object[" + i3 + "] should be int[]");
                        }
                        objArr[i3] = ((C7100k) this.f87393zy.f39928q.get(i3)).m25665n(objArr[i3]);
                        this.f87393zy.f39927n[i3].f87386toq = C7096n.n7h(((C7100k) this.f87393zy.f39928q.get(i3)).m25663g());
                        break;
                        break;
                    case 5:
                        if (!(objArr[i3] instanceof long[])) {
                            throw new IllegalArgumentException("Object[" + i3 + "] should be long[]");
                        }
                        objArr[i3] = ((C7100k) this.f87393zy.f39928q.get(i3)).m25665n(objArr[i3]);
                        this.f87393zy.f39927n[i3].f87386toq = C7096n.n7h(((C7100k) this.f87393zy.f39928q.get(i3)).m25663g());
                        break;
                        break;
                    case 6:
                        if (!(objArr[i3] instanceof Byte)) {
                            throw new IllegalArgumentException("Object[" + i3 + "] should be byte");
                        }
                        break;
                        break;
                    case 7:
                        if (!(objArr[i3] instanceof Short)) {
                            throw new IllegalArgumentException("Object[" + i3 + "] should be short");
                        }
                        break;
                        break;
                    case 8:
                        if (!(objArr[i3] instanceof Integer)) {
                            throw new IllegalArgumentException("Object[" + i3 + "] should be int");
                        }
                        break;
                        break;
                    case 9:
                        if (!(objArr[i3] instanceof Long)) {
                            throw new IllegalArgumentException("Object[" + i3 + "] should be long");
                        }
                        break;
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported type of objects " + i3 + ", " + this.f87393zy.f39927n[i3].f39913k + " expected");
                }
            }
            zy zyVar = new zy(this, i2, objArr, null);
            this.f87393zy.f87396toq.put(Integer.valueOf(i2), zyVar);
            ((ArrayList) this.f87393zy.f87397zy.get(this.f87393zy.f87397zy.size() - 1)).add(zyVar);
        }

        public void toq(int[] iArr, Object[][] objArr) {
            m25658n();
            if (iArr.length != objArr.length) {
                throw new IllegalArgumentException("Different number between indexes and objects");
            }
            f7l8();
            for (int i2 = 0; i2 < iArr.length; i2++) {
                m25661k(iArr[i2], objArr[i2]);
            }
        }

        /* JADX INFO: renamed from: y */
        public void m25662y(String str) throws Throwable {
            DataOutputStream dataOutputStream;
            Throwable th;
            m25659q();
            try {
                dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(str)));
                try {
                    m25660s(dataOutputStream);
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th = th2;
                    if (dataOutputStream != null) {
                        dataOutputStream.close();
                    }
                    if (new File(str).delete()) {
                        System.err.println("Cannot delete file " + str);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                dataOutputStream = null;
                th = th3;
            }
        }

        public void zy(Object... objArr) {
            C7096n.k kVar;
            C7095k c7095k = null;
            C8103toq c8103toq = new C8103toq(objArr.length, c7095k);
            this.f87393zy = c8103toq;
            this.f87392toq.add(c8103toq);
            for (int i2 = 0; i2 < objArr.length; i2++) {
                this.f87393zy.f39928q.add(new C7100k(this, c7095k));
                Object obj = objArr[i2];
                byte b2 = 1;
                if (obj instanceof Byte) {
                    kVar = C7096n.k.BYTE;
                    ((C7100k) this.f87393zy.f39928q.get(i2)).m25665n(objArr[i2]);
                } else if (obj instanceof Short) {
                    kVar = C7096n.k.SHORT;
                    b2 = 2;
                    ((C7100k) this.f87393zy.f39928q.get(i2)).m25665n(objArr[i2]);
                } else if (obj instanceof Integer) {
                    kVar = C7096n.k.INTEGER;
                    b2 = 4;
                    ((C7100k) this.f87393zy.f39928q.get(i2)).m25665n(objArr[i2]);
                } else if (obj instanceof Long) {
                    kVar = C7096n.k.LONG;
                    b2 = 8;
                    ((C7100k) this.f87393zy.f39928q.get(i2)).m25665n(objArr[i2]);
                } else if (obj instanceof String) {
                    kVar = C7096n.k.STRING;
                    objArr[i2] = ((C7100k) this.f87393zy.f39928q.get(i2)).m25665n(objArr[i2]);
                } else if (obj instanceof byte[]) {
                    kVar = C7096n.k.BYTE_ARRAY;
                    objArr[i2] = ((C7100k) this.f87393zy.f39928q.get(i2)).m25665n(objArr[i2]);
                } else if (obj instanceof short[]) {
                    kVar = C7096n.k.SHORT_ARRAY;
                    objArr[i2] = ((C7100k) this.f87393zy.f39928q.get(i2)).m25665n(objArr[i2]);
                } else if (obj instanceof int[]) {
                    kVar = C7096n.k.INTEGER_ARRAY;
                    objArr[i2] = ((C7100k) this.f87393zy.f39928q.get(i2)).m25665n(objArr[i2]);
                } else {
                    if (!(obj instanceof long[])) {
                        throw new IllegalArgumentException("Unsupported type of the [" + i2 + "] argument");
                    }
                    kVar = C7096n.k.LONG_ARRAY;
                    objArr[i2] = ((C7100k) this.f87393zy.f39928q.get(i2)).m25665n(objArr[i2]);
                }
                this.f87393zy.f39927n[i2] = new C7096n(kVar, b2, (byte) 0, (byte) 0, 0L, null);
            }
            this.f87393zy.f39926k = new zy(this, -1, objArr, c7095k);
        }

        private C8102toq(int i2) {
            this.f87392toq = new ArrayList<>();
            this.f39923q = i2;
        }

        /* JADX INFO: renamed from: miuix.core.util.toq$toq$k */
        /* JADX INFO: compiled from: DirectIndexedFile.java */
        private class C7100k {

            /* JADX INFO: renamed from: k */
            private HashMap<Object, Integer> f39924k;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            private ArrayList<Object> f87394toq;

            private C7100k() {
                this.f39924k = new HashMap<>();
                this.f87394toq = new ArrayList<>();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: g */
            public int m25663g() {
                return this.f87394toq.size();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: n */
            public Integer m25665n(Object obj) {
                Integer num = this.f39924k.get(obj);
                if (num != null) {
                    return num;
                }
                Integer numValueOf = Integer.valueOf(this.f87394toq.size());
                this.f39924k.put(obj, numValueOf);
                this.f87394toq.add(obj);
                return numValueOf;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: q */
            public ArrayList<Object> m25666q() {
                return this.f87394toq;
            }

            /* synthetic */ C7100k(C8102toq c8102toq, C7095k c7095k) {
                this();
            }
        }
    }

    /* JADX INFO: renamed from: miuix.core.util.toq$y */
    /* JADX INFO: compiled from: DirectIndexedFile.java */
    private static class C7101y {

        /* JADX INFO: renamed from: k */
        int f39932k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f87398toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        long f87399zy;

        /* synthetic */ C7101y(int i2, int i3, long j2, C7095k c7095k) {
            this(i2, i3, j2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public int m25674q(DataOutput dataOutput) throws IOException {
            if (dataOutput == null) {
                return 16;
            }
            dataOutput.writeInt(this.f39932k);
            dataOutput.writeInt(this.f87398toq);
            dataOutput.writeLong(this.f87399zy);
            return 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static C7101y zy(DataInput dataInput) throws IOException {
            return new C7101y(dataInput.readInt(), dataInput.readInt(), dataInput.readLong());
        }

        private C7101y(int i2, int i3, long j2) {
            this.f39932k = i2;
            this.f87398toq = i3;
            this.f87399zy = j2;
        }
    }

    /* JADX INFO: compiled from: DirectIndexedFile.java */
    private static class zy implements InterfaceC7099s {

        /* JADX INFO: renamed from: k */
        private RandomAccessFile f39933k;

        zy(RandomAccessFile randomAccessFile) {
            this.f39933k = randomAccessFile;
        }

        @Override // miuix.core.util.toq.InterfaceC7099s
        public void close() throws IOException {
            this.f39933k.close();
        }

        @Override // miuix.core.util.toq.InterfaceC7099s
        /* JADX INFO: renamed from: k */
        public long mo25656k() throws IOException {
            return this.f39933k.getFilePointer();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            return this.f39933k.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            return this.f39933k.readByte();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            return this.f39933k.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return this.f39933k.readDouble();
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return this.f39933k.readFloat();
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f39933k.readFully(bArr);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            return this.f39933k.readInt();
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            return this.f39933k.readLine();
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            return this.f39933k.readLong();
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            return this.f39933k.readShort();
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            return this.f39933k.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            return this.f39933k.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            return this.f39933k.readUnsignedShort();
        }

        @Override // java.io.DataInput
        public int skipBytes(int i2) throws IOException {
            return this.f39933k.skipBytes(i2);
        }

        @Override // miuix.core.util.toq.InterfaceC7099s
        public void zy(long j2) throws IOException {
            this.f39933k.seek(j2);
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i2, int i3) throws IOException {
            this.f39933k.readFully(bArr, i2, i3);
        }
    }

    protected toq() throws InstantiationException {
        throw new InstantiationException("Cannot instantiate utility class");
    }

    /* JADX INFO: renamed from: k */
    public static C8102toq m25627k(int i2) {
        return new C8102toq(i2, null);
    }

    public static C7097p toq(InputStream inputStream) throws IOException {
        return new C7097p(inputStream, (C7095k) null);
    }

    public static C7097p zy(String str) throws IOException {
        return new C7097p(str, (C7095k) null);
    }

    /* JADX INFO: renamed from: miuix.core.util.toq$q */
    /* JADX INFO: compiled from: DirectIndexedFile.java */
    private static class C7098q implements InterfaceC7099s {

        /* JADX INFO: renamed from: k */
        private InputStream f39920k;

        /* JADX INFO: renamed from: q */
        private long f39921q;

        C7098q(InputStream inputStream) {
            this.f39920k = inputStream;
            inputStream.mark(0);
            this.f39921q = 0L;
        }

        @Override // miuix.core.util.toq.InterfaceC7099s
        public void close() throws IOException {
            this.f39920k.close();
        }

        @Override // miuix.core.util.toq.InterfaceC7099s
        /* JADX INFO: renamed from: k */
        public long mo25656k() throws IOException {
            return this.f39921q;
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.f39921q++;
            return this.f39920k.read() != 0;
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f39921q++;
            return (byte) this.f39920k.read();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            byte[] bArr = new byte[2];
            this.f39921q += 2;
            if (this.f39920k.read(bArr) == 2) {
                return (char) (((char) (bArr[1] & 255)) | ((bArr[0] << 8) & 65280));
            }
            return (char) 0;
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            throw new IOException();
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            throw new IOException();
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f39921q += (long) this.f39920k.read(bArr);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            byte[] bArr = new byte[4];
            this.f39921q += 4;
            if (this.f39920k.read(bArr) == 4) {
                return (bArr[3] & 255) | ((bArr[2] << 8) & 65280) | ((bArr[1] << 16) & C2706p.f61107fn3e) | ((bArr[0] << com.google.common.base.zy.f25759t) & (-16777216));
            }
            return 0;
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            throw new IOException();
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            byte[] bArr = new byte[8];
            this.f39921q += 8;
            if (this.f39920k.read(bArr) != 8) {
                return 0L;
            }
            return ((((long) bArr[0]) << 56) & (-72057594037927936L)) | ((long) (bArr[7] & 255)) | (((long) (bArr[6] << 8)) & 65280) | (((long) (bArr[5] << 16)) & 16711680) | (((long) (bArr[4] << com.google.common.base.zy.f25759t)) & 4278190080L) | ((((long) bArr[3]) << 32) & 1095216660480L) | ((((long) bArr[2]) << 40) & 280375465082880L) | ((((long) bArr[1]) << 48) & 71776119061217280L);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            byte[] bArr = new byte[2];
            this.f39921q += 2;
            if (this.f39920k.read(bArr) == 2) {
                return (short) (((short) (bArr[1] & 255)) | ((bArr[0] << 8) & 65280));
            }
            return (short) 0;
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            throw new IOException();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.f39921q++;
            return (byte) this.f39920k.read();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            byte[] bArr = new byte[2];
            this.f39921q += 2;
            if (this.f39920k.read(bArr) == 2) {
                return (short) (((short) (bArr[1] & 255)) | ((bArr[0] << 8) & 65280));
            }
            return 0;
        }

        @Override // java.io.DataInput
        public int skipBytes(int i2) throws IOException {
            int iSkip = (int) this.f39920k.skip(i2);
            this.f39921q += (long) iSkip;
            return iSkip;
        }

        @Override // miuix.core.util.toq.InterfaceC7099s
        public void zy(long j2) throws IOException {
            this.f39920k.reset();
            if (this.f39920k.skip(j2) != j2) {
                throw new IOException("Skip failed");
            }
            this.f39921q = j2;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i2, int i3) throws IOException {
            this.f39921q += (long) this.f39920k.read(bArr, i2, i3);
        }
    }
}
