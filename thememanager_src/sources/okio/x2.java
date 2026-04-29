package okio;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.i9jn;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.lv5;
import kotlin.text.C6433g;
import l05.InterfaceC6765n;
import l05.InterfaceC6768s;
import l05.InterfaceC6769y;
import miuix.security.C7323k;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.internal.connection.C7448g;
import okio.internal.C7551k;

/* JADX INFO: compiled from: Buffer.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 Buffer.kt\nokio/internal/-Buffer\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,641:1\n89#2:642\n86#2:675\n86#2:677\n74#2:737\n74#2:763\n83#2:802\n77#2:813\n89#2:1003\n74#2:1018\n86#2:1122\n89#2:1615\n244#3,32:643\n279#3,10:678\n292#3,18:688\n414#3,2:706\n112#3:708\n416#3:709\n114#3,18:710\n313#3,9:728\n322#3,15:738\n340#3,10:753\n350#3,3:764\n348#3,25:767\n376#3,10:792\n386#3:803\n384#3,9:804\n393#3,7:814\n391#3,20:821\n682#3,60:841\n745#3,56:901\n803#3:957\n806#3:958\n807#3,6:960\n817#3,7:966\n827#3,6:973\n835#3,5:979\n867#3,6:984\n877#3:990\n878#3,11:992\n889#3,5:1004\n898#3,9:1009\n908#3,61:1019\n633#3:1080\n636#3:1081\n637#3,5:1083\n644#3:1088\n647#3,7:1089\n656#3,20:1096\n420#3:1116\n423#3,5:1117\n428#3,10:1123\n439#3,7:1133\n444#3,2:1140\n973#3:1142\n974#3,87:1144\n1064#3,48:1231\n603#3:1279\n610#3,21:1280\n1115#3,7:1301\n1125#3,7:1308\n1135#3,4:1315\n1142#3,8:1319\n1153#3,10:1327\n1166#3,14:1337\n449#3,91:1351\n543#3,40:1442\n586#3:1482\n588#3,13:1484\n1183#3:1497\n1234#3:1498\n1235#3,39:1500\n1276#3,2:1539\n1278#3,4:1542\n1285#3,3:1546\n1289#3,4:1550\n112#3:1554\n1293#3,22:1555\n114#3,18:1577\n1319#3,2:1595\n1321#3,3:1598\n112#3:1601\n1324#3,13:1602\n1337#3,13:1616\n114#3,18:1629\n1354#3,2:1647\n1357#3:1650\n112#3:1651\n1358#3,50:1652\n114#3,18:1702\n1417#3,14:1720\n1434#3,32:1734\n1469#3,12:1766\n1484#3,18:1778\n1506#3:1796\n1507#3:1798\n1512#3,34:1799\n1#4:676\n1#4:959\n1#4:991\n1#4:1082\n1#4:1143\n1#4:1483\n1#4:1499\n1#4:1541\n1#4:1549\n1#4:1597\n1#4:1649\n1#4:1797\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer\n*L\n167#1:642\n197#1:675\n235#1:677\n261#1:737\n264#1:763\n267#1:802\n267#1:813\n335#1:1003\n338#1:1018\n374#1:1122\n483#1:1615\n181#1:643,32\n252#1:678,10\n255#1:688,18\n258#1:706,2\n258#1:708\n258#1:709\n258#1:710,18\n261#1:728,9\n261#1:738,15\n264#1:753,10\n264#1:764,3\n264#1:767,25\n267#1:792,10\n267#1:803\n267#1:804,9\n267#1:814,7\n267#1:821,20\n279#1:841,60\n282#1:901,56\n284#1:957\n287#1:958\n287#1:960,6\n289#1:966,7\n292#1:973,6\n295#1:979,5\n329#1:984,6\n335#1:990\n335#1:992,11\n335#1:1004,5\n338#1:1009,9\n338#1:1019,61\n340#1:1080\n343#1:1081\n343#1:1083,5\n345#1:1088\n348#1:1089,7\n351#1:1096,20\n371#1:1116\n374#1:1117,5\n374#1:1123,10\n376#1:1133,7\n379#1:1140,2\n384#1:1142\n384#1:1144,87\n387#1:1231,48\n410#1:1279\n416#1:1280,21\n437#1:1301,7\n441#1:1308,7\n443#1:1315,4\n445#1:1319,8\n449#1:1327,10\n453#1:1337,14\n457#1:1351,91\n460#1:1442,40\n463#1:1482\n463#1:1484,13\n465#1:1497\n465#1:1498\n465#1:1500,39\n467#1:1539,2\n467#1:1542,4\n477#1:1546,3\n477#1:1550,4\n477#1:1554\n477#1:1555,22\n477#1:1577,18\n483#1:1595,2\n483#1:1598,3\n483#1:1601\n483#1:1602,13\n483#1:1616,13\n483#1:1629,18\n488#1:1647,2\n488#1:1650\n488#1:1651\n488#1:1652,50\n488#1:1702,18\n498#1:1720,14\n568#1:1734,32\n570#1:1766,12\n578#1:1778,18\n586#1:1796\n586#1:1798\n588#1:1799,34\n287#1:959\n335#1:991\n343#1:1082\n384#1:1143\n463#1:1483\n465#1:1499\n467#1:1541\n477#1:1549\n483#1:1597\n488#1:1649\n586#1:1797\n*E\n"})
public final class x2 implements n7h, qrj, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: k */
    @InterfaceC6765n
    @InterfaceC7395n
    public C7541c f43846k;

    /* JADX INFO: renamed from: q */
    private long f43847q;

    /* JADX INFO: renamed from: okio.x2$k */
    /* JADX INFO: compiled from: Buffer.kt */
    @lv5({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer$UnsafeCursor\n+ 2 Buffer.kt\nokio/internal/-Buffer\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,641:1\n1567#2:642\n1568#2:644\n1572#2:645\n1573#2,68:647\n1644#2:715\n1645#2,32:717\n1677#2,18:750\n1698#2:768\n1699#2,18:770\n1721#2:788\n1723#2,7:790\n1#3:643\n1#3:646\n1#3:716\n1#3:769\n1#3:789\n86#4:749\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer$UnsafeCursor\n*L\n628#1:642\n628#1:644\n630#1:645\n630#1:647,68\n632#1:715\n632#1:717,32\n632#1:750,18\n634#1:768\n634#1:770,18\n637#1:788\n637#1:790,7\n628#1:643\n630#1:646\n632#1:716\n634#1:769\n637#1:789\n632#1:749\n*E\n"})
    public static final class C7577k implements Closeable {

        /* JADX INFO: renamed from: k */
        @InterfaceC6765n
        @InterfaceC7395n
        public x2 f43849k;

        /* JADX INFO: renamed from: n */
        @InterfaceC7395n
        private C7541c f43850n;

        /* JADX INFO: renamed from: q */
        @InterfaceC6765n
        public boolean f43852q;

        /* JADX INFO: renamed from: y */
        @InterfaceC6765n
        @InterfaceC7395n
        public byte[] f43854y;

        /* JADX INFO: renamed from: g */
        @InterfaceC6765n
        public long f43848g = -1;

        /* JADX INFO: renamed from: s */
        @InterfaceC6765n
        public int f43853s = -1;

        /* JADX INFO: renamed from: p */
        @InterfaceC6765n
        public int f43851p = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!(this.f43849k != null)) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.f43849k = null;
            ld6(null);
            this.f43848g = -1L;
            this.f43854y = null;
            this.f43853s = -1;
            this.f43851p = -1;
        }

        /* JADX INFO: renamed from: k */
        public final long m27874k(int i2) {
            if (!(i2 > 0)) {
                throw new IllegalArgumentException(("minByteCount <= 0: " + i2).toString());
            }
            if (!(i2 <= 8192)) {
                throw new IllegalArgumentException(("minByteCount > Segment.SIZE: " + i2).toString());
            }
            x2 x2Var = this.f43849k;
            if (x2Var == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.f43852q) {
                throw new IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
            }
            long size = x2Var.size();
            C7541c c7541cM58i = x2Var.m58i(i2);
            int i3 = 8192 - c7541cM58i.f94264zy;
            c7541cM58i.f94264zy = 8192;
            long j2 = i3;
            x2Var.vy(size + j2);
            ld6(c7541cM58i);
            this.f43848g = size;
            this.f43854y = c7541cM58i.f43687k;
            this.f43853s = 8192 - i3;
            this.f43851p = 8192;
            return j2;
        }

        public final void ld6(@InterfaceC7395n C7541c c7541c) {
            this.f43850n = c7541c;
        }

        /* JADX INFO: renamed from: p */
        public final int m27875p(long j2) {
            C7541c c7541cZy;
            x2 x2Var = this.f43849k;
            if (x2Var == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (j2 < -1 || j2 > x2Var.size()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + j2 + " > size=" + x2Var.size());
            }
            if (j2 == -1 || j2 == x2Var.size()) {
                ld6(null);
                this.f43848g = j2;
                this.f43854y = null;
                this.f43853s = -1;
                this.f43851p = -1;
                return -1;
            }
            long j3 = 0;
            long size = x2Var.size();
            C7541c c7541cZy2 = x2Var.f43846k;
            if (zy() != null) {
                long j4 = this.f43848g;
                int i2 = this.f43853s;
                C7541c c7541cZy3 = zy();
                kotlin.jvm.internal.d2ok.qrj(c7541cZy3);
                long j5 = j4 - ((long) (i2 - c7541cZy3.f94263toq));
                if (j5 > j2) {
                    c7541cZy2 = zy();
                    size = j5;
                    c7541cZy = c7541cZy2;
                } else {
                    c7541cZy = zy();
                    j3 = j5;
                }
            } else {
                c7541cZy = c7541cZy2;
            }
            if (size - j2 > j2 - j3) {
                while (true) {
                    kotlin.jvm.internal.d2ok.qrj(c7541cZy);
                    int i3 = c7541cZy.f94264zy;
                    int i4 = c7541cZy.f94263toq;
                    if (j2 < ((long) (i3 - i4)) + j3) {
                        break;
                    }
                    j3 += (long) (i3 - i4);
                    c7541cZy = c7541cZy.f43686g;
                }
            } else {
                while (size > j2) {
                    kotlin.jvm.internal.d2ok.qrj(c7541cZy2);
                    c7541cZy2 = c7541cZy2.f94262f7l8;
                    kotlin.jvm.internal.d2ok.qrj(c7541cZy2);
                    size -= (long) (c7541cZy2.f94264zy - c7541cZy2.f94263toq);
                }
                j3 = size;
                c7541cZy = c7541cZy2;
            }
            if (this.f43852q) {
                kotlin.jvm.internal.d2ok.qrj(c7541cZy);
                if (c7541cZy.f43689q) {
                    C7541c c7541cM27581g = c7541cZy.m27581g();
                    if (x2Var.f43846k == c7541cZy) {
                        x2Var.f43846k = c7541cM27581g;
                    }
                    c7541cZy = c7541cZy.zy(c7541cM27581g);
                    C7541c c7541c = c7541cZy.f94262f7l8;
                    kotlin.jvm.internal.d2ok.qrj(c7541c);
                    c7541c.toq();
                }
            }
            ld6(c7541cZy);
            this.f43848g = j2;
            kotlin.jvm.internal.d2ok.qrj(c7541cZy);
            this.f43854y = c7541cZy.f43687k;
            int i5 = c7541cZy.f94263toq + ((int) (j2 - j3));
            this.f43853s = i5;
            int i6 = c7541cZy.f94264zy;
            this.f43851p = i6;
            return i6 - i5;
        }

        /* JADX INFO: renamed from: q */
        public final int m27876q() {
            long j2 = this.f43848g;
            x2 x2Var = this.f43849k;
            kotlin.jvm.internal.d2ok.qrj(x2Var);
            if (!(j2 != x2Var.size())) {
                throw new IllegalStateException("no more bytes".toString());
            }
            long j3 = this.f43848g;
            return m27875p(j3 == -1 ? 0L : j3 + ((long) (this.f43851p - this.f43853s)));
        }

        /* JADX INFO: renamed from: y */
        public final long m27877y(long j2) {
            x2 x2Var = this.f43849k;
            if (x2Var == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.f43852q) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            long size = x2Var.size();
            int i2 = 1;
            if (j2 <= size) {
                if (!(j2 >= 0)) {
                    throw new IllegalArgumentException(("newSize < 0: " + j2).toString());
                }
                long j3 = size - j2;
                while (true) {
                    if (j3 <= 0) {
                        break;
                    }
                    C7541c c7541c = x2Var.f43846k;
                    kotlin.jvm.internal.d2ok.qrj(c7541c);
                    C7541c c7541c2 = c7541c.f94262f7l8;
                    kotlin.jvm.internal.d2ok.qrj(c7541c2);
                    int i3 = c7541c2.f94264zy;
                    long j4 = i3 - c7541c2.f94263toq;
                    if (j4 > j3) {
                        c7541c2.f94264zy = i3 - ((int) j3);
                        break;
                    }
                    x2Var.f43846k = c7541c2.toq();
                    lrht.m27786q(c7541c2);
                    j3 -= j4;
                }
                ld6(null);
                this.f43848g = j2;
                this.f43854y = null;
                this.f43853s = -1;
                this.f43851p = -1;
            } else if (j2 > size) {
                long j5 = j2 - size;
                boolean z2 = true;
                while (j5 > 0) {
                    C7541c c7541cM58i = x2Var.m58i(i2);
                    int iMin = (int) Math.min(j5, 8192 - c7541cM58i.f94264zy);
                    c7541cM58i.f94264zy += iMin;
                    j5 -= (long) iMin;
                    if (z2) {
                        ld6(c7541cM58i);
                        this.f43848g = size;
                        this.f43854y = c7541cM58i.f43687k;
                        int i4 = c7541cM58i.f94264zy;
                        this.f43853s = i4 - iMin;
                        this.f43851p = i4;
                        z2 = false;
                    }
                    i2 = 1;
                }
            }
            x2Var.vy(j2);
            return size;
        }

        @InterfaceC7395n
        public final C7541c zy() {
            return this.f43850n;
        }
    }

    /* JADX INFO: compiled from: Buffer.kt */
    public static final class zy extends OutputStream {
        zy() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        @InterfaceC7396q
        public String toString() {
            return x2.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i2) {
            x2.this.writeByte(i2);
        }

        @Override // java.io.OutputStream
        public void write(@InterfaceC7396q byte[] data, int i2, int i3) {
            kotlin.jvm.internal.d2ok.m23075h(data, "data");
            x2.this.write(data, i2, i3);
        }
    }

    public static /* synthetic */ x2 a98o(x2 x2Var, x2 x2Var2, long j2, long j3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        return x2Var.yz(x2Var2, j2, j3);
    }

    public static /* synthetic */ x2 bih(x2 x2Var, OutputStream outputStream, long j2, int i2, Object obj) throws IOException {
        if ((i2 & 2) != 0) {
            j2 = x2Var.f43847q;
        }
        return x2Var.z4t(outputStream, j2);
    }

    public static /* synthetic */ C7577k dxef(x2 x2Var, C7577k c7577k, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            c7577k = C7575s.f7l8();
        }
        return x2Var.e5(c7577k);
    }

    public static /* synthetic */ x2 i1(x2 x2Var, x2 x2Var2, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        return x2Var.m27868f(x2Var2, j2);
    }

    public static /* synthetic */ C7577k ngy(x2 x2Var, C7577k c7577k, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            c7577k = C7575s.f7l8();
        }
        return x2Var.nsb(c7577k);
    }

    private final kja0 was(String str, kja0 kja0Var) throws NoSuchAlgorithmException {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(kja0Var.internalArray$okio(), str));
            C7541c c7541c = this.f43846k;
            if (c7541c != null) {
                byte[] bArr = c7541c.f43687k;
                int i2 = c7541c.f94263toq;
                mac.update(bArr, i2, c7541c.f94264zy - i2);
                C7541c c7541c2 = c7541c.f43686g;
                kotlin.jvm.internal.d2ok.qrj(c7541c2);
                while (c7541c2 != c7541c) {
                    byte[] bArr2 = c7541c2.f43687k;
                    int i3 = c7541c2.f94263toq;
                    mac.update(bArr2, i3, c7541c2.f94264zy - i3);
                    c7541c2 = c7541c2.f43686g;
                    kotlin.jvm.internal.d2ok.qrj(c7541c2);
                }
            }
            byte[] bArrDoFinal = mac.doFinal();
            kotlin.jvm.internal.d2ok.kja0(bArrDoFinal, "doFinal(...)");
            return new kja0(bArrDoFinal);
        } catch (InvalidKeyException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    private final void wlev(InputStream inputStream, long j2, boolean z2) throws IOException {
        while (true) {
            if (j2 <= 0 && !z2) {
                return;
            }
            C7541c c7541cM58i = m58i(1);
            int i2 = inputStream.read(c7541cM58i.f43687k, c7541cM58i.f94264zy, (int) Math.min(j2, 8192 - c7541cM58i.f94264zy));
            if (i2 == -1) {
                if (c7541cM58i.f94263toq == c7541cM58i.f94264zy) {
                    this.f43846k = c7541cM58i.toq();
                    lrht.m27786q(c7541cM58i);
                }
                if (!z2) {
                    throw new EOFException();
                }
                return;
            }
            c7541cM58i.f94264zy += i2;
            long j3 = i2;
            this.f43847q += j3;
            j2 -= j3;
        }
    }

    /* JADX INFO: renamed from: x */
    private final kja0 m27867x(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        C7541c c7541c = this.f43846k;
        if (c7541c != null) {
            byte[] bArr = c7541c.f43687k;
            int i2 = c7541c.f94263toq;
            messageDigest.update(bArr, i2, c7541c.f94264zy - i2);
            C7541c c7541c2 = c7541c.f43686g;
            kotlin.jvm.internal.d2ok.qrj(c7541c2);
            while (c7541c2 != c7541c) {
                byte[] bArr2 = c7541c2.f43687k;
                int i3 = c7541c2.f94263toq;
                messageDigest.update(bArr2, i3, c7541c2.f94264zy - i3);
                c7541c2 = c7541c2.f43686g;
                kotlin.jvm.internal.d2ok.qrj(c7541c2);
            }
        }
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.d2ok.kja0(bArrDigest, "digest(...)");
        return new kja0(bArrDigest);
    }

    public static /* synthetic */ x2 y9n(x2 x2Var, OutputStream outputStream, long j2, long j3, int i2, Object obj) throws IOException {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            j3 = x2Var.f43847q - j4;
        }
        return x2Var.hyr(outputStream, j4, j3);
    }

    @InterfaceC7396q
    public final kja0 a5id() {
        return m27867x(C7323k.f90062zy);
    }

    @Override // okio.qrj
    @InterfaceC7396q
    /* JADX INFO: renamed from: b8, reason: merged with bridge method [inline-methods] */
    public x2 ktq(@InterfaceC7396q nn86 source, long j2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        while (j2 > 0) {
            long jWx16 = source.wx16(this, j2);
            if (jWx16 == -1) {
                throw new EOFException();
            }
            j2 -= jWx16;
        }
        return this;
    }

    @Override // okio.qrj
    @InterfaceC7396q
    /* JADX INFO: renamed from: b9ub, reason: merged with bridge method [inline-methods] */
    public x2 wo(@InterfaceC7396q kja0 byteString, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(byteString, "byteString");
        byteString.write$okio(this, i2, i3);
        return this;
    }

    @InterfaceC7396q
    public final x2 bap7(@InterfaceC7396q InputStream input) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(input, "input");
        wlev(input, Long.MAX_VALUE, true);
        return this;
    }

    @InterfaceC7396q
    public final kja0 bek6(@InterfaceC7396q kja0 key) {
        kotlin.jvm.internal.d2ok.m23075h(key, "key");
        return was("HmacSHA512", key);
    }

    @Override // okio.n7h
    public boolean bf2(long j2) {
        return this.f43847q >= j2;
    }

    @Override // okio.n7h
    public short bo() throws EOFException {
        return C7575s.cdj(readShort());
    }

    @InterfaceC7396q
    public final kja0 bwp(@InterfaceC7396q kja0 key) {
        kotlin.jvm.internal.d2ok.m23075h(key, "key");
        return was("HmacSHA256", key);
    }

    @Override // okio.n7h
    public boolean ch(long j2, @InterfaceC7396q kja0 bytes, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(bytes, "bytes");
        if (j2 < 0 || i2 < 0 || i3 < 0 || size() - j2 < i3 || bytes.size() - i2 < i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (g1(((long) i4) + j2) != bytes.getByte(i2 + i4)) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.nn86, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // okio.qrj
    @InterfaceC7396q
    /* JADX INFO: renamed from: cnbm, reason: merged with bridge method [inline-methods] */
    public x2 uc(@InterfaceC7396q kja0 byteString) {
        kotlin.jvm.internal.d2ok.m23075h(byteString, "byteString");
        byteString.write$okio(this, 0, byteString.size());
        return this;
    }

    @Override // okio.n7h
    public int cv06() throws EOFException {
        return C7575s.kja0(readInt());
    }

    @Override // okio.n7h
    @InterfaceC7396q
    /* JADX INFO: renamed from: d */
    public String mo27610d(long j2) throws EOFException {
        return yl(j2, C6433g.f81921toq);
    }

    @InterfaceC6768s
    @InterfaceC7396q
    public final x2 d2ok(@InterfaceC7396q OutputStream out, long j2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(out, "out");
        return y9n(this, out, j2, 0L, 4, null);
    }

    @Override // okio.n7h
    public long d3(@InterfaceC7396q kja0 targetBytes) {
        kotlin.jvm.internal.d2ok.m23075h(targetBytes, "targetBytes");
        return gyi(targetBytes, 0L);
    }

    @Override // okio.n7h
    public void dr(long j2) throws EOFException {
        if (this.f43847q < j2) {
            throw new EOFException();
        }
    }

    @InterfaceC6768s
    @InterfaceC7396q
    public final C7577k e5(@InterfaceC7396q C7577k unsafeCursor) {
        kotlin.jvm.internal.d2ok.m23075h(unsafeCursor, "unsafeCursor");
        return C7551k.fti(this, unsafeCursor);
    }

    @Override // okio.qrj
    @InterfaceC7396q
    /* JADX INFO: renamed from: ec, reason: merged with bridge method [inline-methods] */
    public x2 lrht(@InterfaceC7396q String string) {
        kotlin.jvm.internal.d2ok.m23075h(string, "string");
        return mo27639m(string, 0, string.length());
    }

    @Override // okio.qrj
    public long ek5k(@InterfaceC7396q nn86 source) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        long j2 = 0;
        while (true) {
            long jWx16 = source.wx16(this, 8192L);
            if (jWx16 == -1) {
                return j2;
            }
            j2 += jWx16;
        }
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this != obj) {
            if (!(obj instanceof x2)) {
                return false;
            }
            x2 x2Var = (x2) obj;
            if (size() != x2Var.size()) {
                return false;
            }
            if (size() != 0) {
                C7541c c7541c = this.f43846k;
                kotlin.jvm.internal.d2ok.qrj(c7541c);
                C7541c c7541c2 = x2Var.f43846k;
                kotlin.jvm.internal.d2ok.qrj(c7541c2);
                int i2 = c7541c.f94263toq;
                int i3 = c7541c2.f94263toq;
                long j2 = 0;
                while (j2 < size()) {
                    long jMin = Math.min(c7541c.f94264zy - i2, c7541c2.f94264zy - i3);
                    long j3 = 0;
                    while (j3 < jMin) {
                        int i4 = i2 + 1;
                        int i5 = i3 + 1;
                        if (c7541c.f43687k[i2] != c7541c2.f43687k[i3]) {
                            return false;
                        }
                        j3++;
                        i2 = i4;
                        i3 = i5;
                    }
                    if (i2 == c7541c.f94264zy) {
                        c7541c = c7541c.f43686g;
                        kotlin.jvm.internal.d2ok.qrj(c7541c);
                        i2 = c7541c.f94263toq;
                    }
                    if (i3 == c7541c2.f94264zy) {
                        c7541c2 = c7541c2.f43686g;
                        kotlin.jvm.internal.d2ok.qrj(c7541c2);
                        i3 = c7541c2.f94263toq;
                    }
                    j2 += jMin;
                }
            }
        }
        return true;
    }

    @Override // okio.qrj
    @InterfaceC7396q
    /* JADX INFO: renamed from: ew, reason: merged with bridge method [inline-methods] */
    public x2 writeByte(int i2) {
        C7541c c7541cM58i = m58i(1);
        byte[] bArr = c7541cM58i.f43687k;
        int i3 = c7541cM58i.f94264zy;
        c7541cM58i.f94264zy = i3 + 1;
        bArr[i3] = (byte) i2;
        vy(size() + 1);
        return this;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: f */
    public final x2 m27868f(@InterfaceC7396q x2 out, long j2) {
        kotlin.jvm.internal.d2ok.m23075h(out, "out");
        return yz(out, j2, this.f43847q - j2);
    }

    @Override // okio.qrj, okio.vyq, java.io.Flushable
    public void flush() {
    }

    @Override // okio.n7h
    @InterfaceC7396q
    public kja0 fnq8(long j2) throws EOFException {
        if (!(j2 >= 0 && j2 <= 2147483647L)) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (size() < j2) {
            throw new EOFException();
        }
        if (j2 < 4096) {
            return new kja0(lv5(j2));
        }
        kja0 kja0VarO05 = o05((int) j2);
        skip(j2);
        return kja0VarO05;
    }

    @Override // okio.n7h
    public long fti(byte b2, long j2) {
        return gvn7(b2, j2, Long.MAX_VALUE);
    }

    public final long fu4() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        C7541c c7541c = this.f43846k;
        kotlin.jvm.internal.d2ok.qrj(c7541c);
        C7541c c7541c2 = c7541c.f94262f7l8;
        kotlin.jvm.internal.d2ok.qrj(c7541c2);
        int i2 = c7541c2.f94264zy;
        if (i2 < 8192 && c7541c2.f43688n) {
            size -= (long) (i2 - c7541c2.f94263toq);
        }
        return size;
    }

    @Override // okio.n7h
    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public x2 mo27611g() {
        return this;
    }

    @InterfaceC6769y(name = "getByte")
    public final byte g1(long j2) {
        C7575s.m27855n(size(), j2, 1L);
        C7541c c7541c = this.f43846k;
        if (c7541c == null) {
            kotlin.jvm.internal.d2ok.qrj(null);
            throw null;
        }
        if (size() - j2 < j2) {
            long size = size();
            while (size > j2) {
                c7541c = c7541c.f94262f7l8;
                kotlin.jvm.internal.d2ok.qrj(c7541c);
                size -= (long) (c7541c.f94264zy - c7541c.f94263toq);
            }
            kotlin.jvm.internal.d2ok.qrj(c7541c);
            return c7541c.f43687k[(int) ((((long) c7541c.f94263toq) + j2) - size)];
        }
        long j3 = 0;
        while (true) {
            long j4 = ((long) (c7541c.f94264zy - c7541c.f94263toq)) + j3;
            if (j4 > j2) {
                kotlin.jvm.internal.d2ok.qrj(c7541c);
                return c7541c.f43687k[(int) ((((long) c7541c.f94263toq) + j2) - j3)];
            }
            c7541c = c7541c.f43686g;
            kotlin.jvm.internal.d2ok.qrj(c7541c);
            j3 = j4;
        }
    }

    @InterfaceC6768s
    @InterfaceC7396q
    public final C7577k ga() {
        return dxef(this, null, 1, null);
    }

    @Override // okio.n7h
    @InterfaceC7396q
    public byte[] gbni() {
        return lv5(size());
    }

    @InterfaceC7396q
    public final kja0 gcp() {
        return m27867x("SHA-512");
    }

    @Override // okio.n7h
    public long gvn7(byte b2, long j2, long j3) {
        C7541c c7541c;
        int i2;
        long size = 0;
        boolean z2 = false;
        if (0 <= j2 && j2 <= j3) {
            z2 = true;
        }
        if (!z2) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j2 + " toIndex=" + j3).toString());
        }
        if (j3 > size()) {
            j3 = size();
        }
        if (j2 == j3 || (c7541c = this.f43846k) == null) {
            return -1L;
        }
        if (size() - j2 < j2) {
            size = size();
            while (size > j2) {
                c7541c = c7541c.f94262f7l8;
                kotlin.jvm.internal.d2ok.qrj(c7541c);
                size -= (long) (c7541c.f94264zy - c7541c.f94263toq);
            }
            while (size < j3) {
                byte[] bArr = c7541c.f43687k;
                int iMin = (int) Math.min(c7541c.f94264zy, (((long) c7541c.f94263toq) + j3) - size);
                i2 = (int) ((((long) c7541c.f94263toq) + j2) - size);
                while (i2 < iMin) {
                    if (bArr[i2] != b2) {
                        i2++;
                    }
                }
                size += (long) (c7541c.f94264zy - c7541c.f94263toq);
                c7541c = c7541c.f43686g;
                kotlin.jvm.internal.d2ok.qrj(c7541c);
                j2 = size;
            }
            return -1L;
        }
        while (true) {
            long j4 = ((long) (c7541c.f94264zy - c7541c.f94263toq)) + size;
            if (j4 > j2) {
                break;
            }
            c7541c = c7541c.f43686g;
            kotlin.jvm.internal.d2ok.qrj(c7541c);
            size = j4;
        }
        while (size < j3) {
            byte[] bArr2 = c7541c.f43687k;
            int iMin2 = (int) Math.min(c7541c.f94264zy, (((long) c7541c.f94263toq) + j3) - size);
            i2 = (int) ((((long) c7541c.f94263toq) + j2) - size);
            while (i2 < iMin2) {
                if (bArr2[i2] != b2) {
                    i2++;
                }
            }
            size += (long) (c7541c.f94264zy - c7541c.f94263toq);
            c7541c = c7541c.f43686g;
            kotlin.jvm.internal.d2ok.qrj(c7541c);
            j2 = size;
        }
        return -1L;
        return ((long) (i2 - c7541c.f94263toq)) + size;
    }

    @Override // okio.n7h
    public long gyi(@InterfaceC7396q kja0 targetBytes, long j2) {
        int i2;
        int i3;
        kotlin.jvm.internal.d2ok.m23075h(targetBytes, "targetBytes");
        long size = 0;
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j2).toString());
        }
        C7541c c7541c = this.f43846k;
        if (c7541c == null) {
            return -1L;
        }
        if (size() - j2 < j2) {
            size = size();
            while (size > j2) {
                c7541c = c7541c.f94262f7l8;
                kotlin.jvm.internal.d2ok.qrj(c7541c);
                size -= (long) (c7541c.f94264zy - c7541c.f94263toq);
            }
            if (targetBytes.size() == 2) {
                byte b2 = targetBytes.getByte(0);
                byte b3 = targetBytes.getByte(1);
                while (size < size()) {
                    byte[] bArr = c7541c.f43687k;
                    i2 = (int) ((((long) c7541c.f94263toq) + j2) - size);
                    int i4 = c7541c.f94264zy;
                    while (i2 < i4) {
                        byte b4 = bArr[i2];
                        if (b4 == b2 || b4 == b3) {
                            i3 = c7541c.f94263toq;
                        } else {
                            i2++;
                        }
                    }
                    size += (long) (c7541c.f94264zy - c7541c.f94263toq);
                    c7541c = c7541c.f43686g;
                    kotlin.jvm.internal.d2ok.qrj(c7541c);
                    j2 = size;
                }
                return -1L;
            }
            byte[] bArrInternalArray$okio = targetBytes.internalArray$okio();
            while (size < size()) {
                byte[] bArr2 = c7541c.f43687k;
                i2 = (int) ((((long) c7541c.f94263toq) + j2) - size);
                int i5 = c7541c.f94264zy;
                while (i2 < i5) {
                    byte b5 = bArr2[i2];
                    for (byte b6 : bArrInternalArray$okio) {
                        if (b5 == b6) {
                            i3 = c7541c.f94263toq;
                        }
                    }
                    i2++;
                }
                size += (long) (c7541c.f94264zy - c7541c.f94263toq);
                c7541c = c7541c.f43686g;
                kotlin.jvm.internal.d2ok.qrj(c7541c);
                j2 = size;
            }
            return -1L;
        }
        while (true) {
            long j3 = ((long) (c7541c.f94264zy - c7541c.f94263toq)) + size;
            if (j3 > j2) {
                break;
            }
            c7541c = c7541c.f43686g;
            kotlin.jvm.internal.d2ok.qrj(c7541c);
            size = j3;
        }
        if (targetBytes.size() == 2) {
            byte b9 = targetBytes.getByte(0);
            byte b10 = targetBytes.getByte(1);
            while (size < size()) {
                byte[] bArr3 = c7541c.f43687k;
                i2 = (int) ((((long) c7541c.f94263toq) + j2) - size);
                int i6 = c7541c.f94264zy;
                while (i2 < i6) {
                    byte b11 = bArr3[i2];
                    if (b11 == b9 || b11 == b10) {
                        i3 = c7541c.f94263toq;
                    } else {
                        i2++;
                    }
                }
                size += (long) (c7541c.f94264zy - c7541c.f94263toq);
                c7541c = c7541c.f43686g;
                kotlin.jvm.internal.d2ok.qrj(c7541c);
                j2 = size;
            }
            return -1L;
        }
        byte[] bArrInternalArray$okio2 = targetBytes.internalArray$okio();
        while (size < size()) {
            byte[] bArr4 = c7541c.f43687k;
            i2 = (int) ((((long) c7541c.f94263toq) + j2) - size);
            int i7 = c7541c.f94264zy;
            while (i2 < i7) {
                byte b12 = bArr4[i2];
                for (byte b13 : bArrInternalArray$okio2) {
                    if (b12 == b13) {
                        i3 = c7541c.f94263toq;
                    }
                }
                i2++;
            }
            size += (long) (c7541c.f94264zy - c7541c.f94263toq);
            c7541c = c7541c.f43686g;
            kotlin.jvm.internal.d2ok.qrj(c7541c);
            j2 = size;
        }
        return -1L;
        return ((long) (i2 - i3)) + size;
    }

    @InterfaceC7396q
    public final x2 h4b(@InterfaceC7396q InputStream input, long j2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(input, "input");
        if (j2 >= 0) {
            wlev(input, j2, false);
            return this;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
    }

    @InterfaceC7396q
    public final kja0 h7am() {
        return m27867x(C7323k.f90061toq);
    }

    public int hashCode() {
        C7541c c7541c = this.f43846k;
        if (c7541c == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = c7541c.f94264zy;
            for (int i4 = c7541c.f94263toq; i4 < i3; i4++) {
                i2 = (i2 * 31) + c7541c.f43687k[i4];
            }
            c7541c = c7541c.f43686g;
            kotlin.jvm.internal.d2ok.qrj(c7541c);
        } while (c7541c != this.f43846k);
        return i2;
    }

    @InterfaceC6768s
    @InterfaceC7396q
    public final x2 hyr(@InterfaceC7396q OutputStream out, long j2, long j3) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(out, "out");
        C7575s.m27855n(this.f43847q, j2, j3);
        if (j3 == 0) {
            return this;
        }
        C7541c c7541c = this.f43846k;
        while (true) {
            kotlin.jvm.internal.d2ok.qrj(c7541c);
            int i2 = c7541c.f94264zy;
            int i3 = c7541c.f94263toq;
            if (j2 < i2 - i3) {
                break;
            }
            j2 -= (long) (i2 - i3);
            c7541c = c7541c.f43686g;
        }
        while (j3 > 0) {
            kotlin.jvm.internal.d2ok.qrj(c7541c);
            int i4 = (int) (((long) c7541c.f94263toq) + j2);
            int iMin = (int) Math.min(c7541c.f94264zy - i4, j3);
            out.write(c7541c.f43687k, i4, iMin);
            j3 -= (long) iMin;
            c7541c = c7541c.f43686g;
            j2 = 0;
        }
        return this;
    }

    @InterfaceC6768s
    @InterfaceC7396q
    public final C7577k ij() {
        return ngy(this, null, 1, null);
    }

    @Override // okio.n7h
    public long ikck(byte b2) {
        return gvn7(b2, 0L, Long.MAX_VALUE);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // okio.qrj
    @InterfaceC7396q
    /* JADX INFO: renamed from: ix, reason: merged with bridge method [inline-methods] */
    public x2 xwq3(long j2) {
        if (j2 == 0) {
            return writeByte(48);
        }
        boolean z2 = false;
        int i2 = 1;
        if (j2 < 0) {
            j2 = -j2;
            if (j2 < 0) {
                return lrht("-9223372036854775808");
            }
            z2 = true;
        }
        if (j2 >= 100000000) {
            i2 = j2 < i9jn.f64793n7h ? j2 < C7448g.f93869ni7 ? j2 < C3548p.f21101p ? 9 : 10 : j2 < 100000000000L ? 11 : 12 : j2 < 1000000000000000L ? j2 < 10000000000000L ? 13 : j2 < 100000000000000L ? 14 : 15 : j2 < 100000000000000000L ? j2 < 10000000000000000L ? 16 : 17 : j2 < 1000000000000000000L ? 18 : 19;
        } else if (j2 >= 10000) {
            i2 = j2 < 1000000 ? j2 < 100000 ? 5 : 6 : j2 < 10000000 ? 7 : 8;
        } else if (j2 >= 100) {
            i2 = j2 < 1000 ? 3 : 4;
        } else if (j2 >= 10) {
            i2 = 2;
        }
        if (z2) {
            i2++;
        }
        C7541c c7541cM58i = m58i(i2);
        byte[] bArr = c7541cM58i.f43687k;
        int i3 = c7541cM58i.f94264zy + i2;
        while (j2 != 0) {
            long j3 = 10;
            i3--;
            bArr[i3] = C7551k.yz()[(int) (j2 % j3)];
            j2 /= j3;
        }
        if (z2) {
            bArr[i3 - 1] = 45;
        }
        c7541cM58i.f94264zy += i2;
        vy(size() + ((long) i2));
        return this;
    }

    @Override // okio.vyq
    /* JADX INFO: renamed from: j */
    public void mo26936j(@InterfaceC7396q x2 source, long j2) {
        C7541c c7541c;
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        if (!(source != this)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        C7575s.m27855n(source.size(), 0L, j2);
        while (j2 > 0) {
            C7541c c7541c2 = source.f43846k;
            kotlin.jvm.internal.d2ok.qrj(c7541c2);
            int i2 = c7541c2.f94264zy;
            kotlin.jvm.internal.d2ok.qrj(source.f43846k);
            if (j2 < i2 - r2.f94263toq) {
                C7541c c7541c3 = this.f43846k;
                if (c7541c3 != null) {
                    kotlin.jvm.internal.d2ok.qrj(c7541c3);
                    c7541c = c7541c3.f94262f7l8;
                } else {
                    c7541c = null;
                }
                if (c7541c != null && c7541c.f43688n) {
                    if ((((long) c7541c.f94264zy) + j2) - ((long) (c7541c.f43689q ? 0 : c7541c.f94263toq)) <= 8192) {
                        C7541c c7541c4 = source.f43846k;
                        kotlin.jvm.internal.d2ok.qrj(c7541c4);
                        c7541c4.f7l8(c7541c, (int) j2);
                        source.vy(source.size() - j2);
                        vy(size() + j2);
                        return;
                    }
                }
                C7541c c7541c5 = source.f43846k;
                kotlin.jvm.internal.d2ok.qrj(c7541c5);
                source.f43846k = c7541c5.m27583n((int) j2);
            }
            C7541c c7541c6 = source.f43846k;
            kotlin.jvm.internal.d2ok.qrj(c7541c6);
            long j3 = c7541c6.f94264zy - c7541c6.f94263toq;
            source.f43846k = c7541c6.toq();
            C7541c c7541c7 = this.f43846k;
            if (c7541c7 == null) {
                this.f43846k = c7541c6;
                c7541c6.f94262f7l8 = c7541c6;
                c7541c6.f43686g = c7541c6;
            } else {
                kotlin.jvm.internal.d2ok.qrj(c7541c7);
                C7541c c7541c8 = c7541c7.f94262f7l8;
                kotlin.jvm.internal.d2ok.qrj(c7541c8);
                c7541c8.zy(c7541c6).m27582k();
            }
            source.vy(source.size() - j3);
            vy(size() + j3);
            j2 -= j3;
        }
    }

    @Override // okio.n7h
    @InterfaceC7396q
    public String jbh() {
        return yl(this.f43847q, C6433g.f81921toq);
    }

    @Override // okio.n7h
    public long jk(@InterfaceC7396q kja0 bytes) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(bytes, "bytes");
        return kja0(bytes, 0L);
    }

    @Override // okio.n7h
    public void jp0y(@InterfaceC7396q x2 sink, long j2) throws EOFException {
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        if (size() >= j2) {
            sink.mo26936j(this, j2);
        } else {
            sink.mo26936j(this, size());
            throw new EOFException();
        }
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to operator function", replaceWith = @kotlin.hb(expression = "this[index]", imports = {}))
    @InterfaceC6769y(name = "-deprecated_getByte")
    /* JADX INFO: renamed from: k */
    public final byte m27869k(long j2) {
        return g1(j2);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: ki, reason: merged with bridge method [inline-methods] */
    public x2 clone() {
        return wvg();
    }

    @InterfaceC6768s
    @InterfaceC7396q
    public final x2 kiv(@InterfaceC7396q OutputStream out) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(out, "out");
        return bih(this, out, 0L, 2, null);
    }

    @Override // okio.n7h
    public long kja0(@InterfaceC7396q kja0 bytes, long j2) throws IOException {
        long j3 = j2;
        kotlin.jvm.internal.d2ok.m23075h(bytes, "bytes");
        if (!(bytes.size() > 0)) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long j4 = 0;
        if (!(j3 >= 0)) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j3).toString());
        }
        C7541c c7541c = this.f43846k;
        if (c7541c != null) {
            if (size() - j3 < j3) {
                long size = size();
                while (size > j3) {
                    c7541c = c7541c.f94262f7l8;
                    kotlin.jvm.internal.d2ok.qrj(c7541c);
                    size -= (long) (c7541c.f94264zy - c7541c.f94263toq);
                }
                byte[] bArrInternalArray$okio = bytes.internalArray$okio();
                byte b2 = bArrInternalArray$okio[0];
                int size2 = bytes.size();
                long size3 = (size() - ((long) size2)) + 1;
                while (size < size3) {
                    byte[] bArr = c7541c.f43687k;
                    long j5 = size;
                    int iMin = (int) Math.min(c7541c.f94264zy, (((long) c7541c.f94263toq) + size3) - size);
                    for (int i2 = (int) ((((long) c7541c.f94263toq) + j3) - j5); i2 < iMin; i2++) {
                        if (bArr[i2] == b2 && C7551k.m27674b(c7541c, i2 + 1, bArrInternalArray$okio, 1, size2)) {
                            return ((long) (i2 - c7541c.f94263toq)) + j5;
                        }
                    }
                    size = j5 + ((long) (c7541c.f94264zy - c7541c.f94263toq));
                    c7541c = c7541c.f43686g;
                    kotlin.jvm.internal.d2ok.qrj(c7541c);
                    j3 = size;
                }
            } else {
                while (true) {
                    long j6 = ((long) (c7541c.f94264zy - c7541c.f94263toq)) + j4;
                    if (j6 > j3) {
                        break;
                    }
                    c7541c = c7541c.f43686g;
                    kotlin.jvm.internal.d2ok.qrj(c7541c);
                    j4 = j6;
                }
                byte[] bArrInternalArray$okio2 = bytes.internalArray$okio();
                byte b3 = bArrInternalArray$okio2[0];
                int size4 = bytes.size();
                long size5 = (size() - ((long) size4)) + 1;
                while (j4 < size5) {
                    byte[] bArr2 = c7541c.f43687k;
                    long j7 = size5;
                    int iMin2 = (int) Math.min(c7541c.f94264zy, (((long) c7541c.f94263toq) + size5) - j4);
                    for (int i3 = (int) ((((long) c7541c.f94263toq) + j3) - j4); i3 < iMin2; i3++) {
                        if (bArr2[i3] == b3 && C7551k.m27674b(c7541c, i3 + 1, bArrInternalArray$okio2, 1, size4)) {
                            return ((long) (i3 - c7541c.f94263toq)) + j4;
                        }
                    }
                    j4 += (long) (c7541c.f94264zy - c7541c.f94263toq);
                    c7541c = c7541c.f43686g;
                    kotlin.jvm.internal.d2ok.qrj(c7541c);
                    j3 = j4;
                    size5 = j7;
                }
            }
        }
        return -1L;
    }

    @Override // okio.qrj
    @InterfaceC7396q
    /* JADX INFO: renamed from: kx3, reason: merged with bridge method [inline-methods] */
    public x2 bz2(long j2) {
        if (j2 == 0) {
            return writeByte(48);
        }
        long j3 = (j2 >>> 1) | j2;
        long j4 = j3 | (j3 >>> 2);
        long j5 = j4 | (j4 >>> 4);
        long j6 = j5 | (j5 >>> 8);
        long j7 = j6 | (j6 >>> 16);
        long j8 = j7 | (j7 >>> 32);
        long j9 = j8 - ((j8 >>> 1) & 6148914691236517205L);
        long j10 = ((j9 >>> 2) & 3689348814741910323L) + (j9 & 3689348814741910323L);
        long j11 = ((j10 >>> 4) + j10) & 1085102592571150095L;
        long j12 = j11 + (j11 >>> 8);
        long j13 = j12 + (j12 >>> 16);
        int i2 = (int) ((((j13 & 63) + ((j13 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        C7541c c7541cM58i = m58i(i2);
        byte[] bArr = c7541cM58i.f43687k;
        int i3 = c7541cM58i.f94264zy;
        for (int i4 = (i3 + i2) - 1; i4 >= i3; i4--) {
            bArr[i4] = C7551k.yz()[(int) (15 & j2)];
            j2 >>>= 4;
        }
        c7541cM58i.f94264zy += i2;
        vy(size() + ((long) i2));
        return this;
    }

    @Override // okio.n7h
    public int lh(@InterfaceC7396q dd options) throws EOFException {
        kotlin.jvm.internal.d2ok.m23075h(options, "options");
        int iM27673a = C7551k.m27673a(this, options, false, 2, null);
        if (iM27673a == -1) {
            return -1;
        }
        skip(options.zy()[iM27673a].size());
        return iM27673a;
    }

    @InterfaceC7396q
    public final kja0 ltg8(@InterfaceC7396q kja0 key) {
        kotlin.jvm.internal.d2ok.m23075h(key, "key");
        return was("HmacSHA1", key);
    }

    @Override // okio.n7h
    @InterfaceC7396q
    public byte[] lv5(long j2) throws EOFException {
        if (!(j2 >= 0 && j2 <= 2147483647L)) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (size() < j2) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j2];
        readFully(bArr);
        return bArr;
    }

    @InterfaceC7396q
    public final kja0 lw() {
        return m27867x("SHA-256");
    }

    @Override // okio.qrj
    @InterfaceC7396q
    /* JADX INFO: renamed from: m2t, reason: merged with bridge method [inline-methods] */
    public x2 zsr0(int i2) {
        return writeInt(C7575s.kja0(i2));
    }

    @InterfaceC7396q
    public final C7541c m58i(int i2) {
        if (!(i2 >= 1 && i2 <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        C7541c c7541c = this.f43846k;
        if (c7541c != null) {
            kotlin.jvm.internal.d2ok.qrj(c7541c);
            C7541c c7541c2 = c7541c.f94262f7l8;
            kotlin.jvm.internal.d2ok.qrj(c7541c2);
            return (c7541c2.f94264zy + i2 > 8192 || !c7541c2.f43688n) ? c7541c2.zy(lrht.m27785n()) : c7541c2;
        }
        C7541c c7541cM27785n = lrht.m27785n();
        this.f43846k = c7541cM27785n;
        c7541cM27785n.f94262f7l8 = c7541cM27785n;
        c7541cM27785n.f43686g = c7541cM27785n;
        return c7541cM27785n;
    }

    @Override // okio.n7h
    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public x2 mo27612n() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa A[EDGE_INSN: B:44:0x00aa->B:38:0x00aa BREAK  A[LOOP:0: B:5:0x000d->B:46:?], SYNTHETIC] */
    @Override // okio.n7h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long n2t() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb4
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            okio.c r6 = r14.f43846k
            kotlin.jvm.internal.d2ok.qrj(r6)
            byte[] r7 = r6.f43687k
            int r8 = r6.f94263toq
            int r9 = r6.f94264zy
        L18:
            if (r8 >= r9) goto L96
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L27
            r11 = 57
            if (r10 > r11) goto L27
            int r11 = r10 + (-48)
            goto L3f
        L27:
            r11 = 97
            if (r10 < r11) goto L34
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L34
            int r11 = r10 + (-97)
        L31:
            int r11 = r11 + 10
            goto L3f
        L34:
            r11 = 65
            if (r10 < r11) goto L77
            r11 = 70
            if (r10 > r11) goto L77
            int r11 = r10 + (-65)
            goto L31
        L3f:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4f
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L4f:
            okio.x2 r0 = new okio.x2
            r0.<init>()
            okio.x2 r0 = r0.bz2(r4)
            okio.x2 r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.jbh()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L77:
            if (r0 == 0) goto L7b
            r1 = 1
            goto L96
        L7b:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = okio.C7575s.fn3e(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L96:
            if (r8 != r9) goto La2
            okio.c r7 = r6.toq()
            r14.f43846k = r7
            okio.lrht.m27786q(r6)
            goto La4
        La2:
            r6.f94263toq = r8
        La4:
            if (r1 != 0) goto Laa
            okio.c r6 = r14.f43846k
            if (r6 != 0) goto Ld
        Laa:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.vy(r1)
            return r4
        Lb4:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.x2.n2t():long");
    }

    @Override // okio.qrj
    @InterfaceC7396q
    /* JADX INFO: renamed from: nme, reason: merged with bridge method [inline-methods] */
    public x2 write(@InterfaceC7396q byte[] source) {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        return write(source, 0, source.length);
    }

    @Override // okio.qrj
    @InterfaceC7396q
    /* JADX INFO: renamed from: nmn5, reason: merged with bridge method [inline-methods] */
    public x2 fn3e() {
        return this;
    }

    @Override // okio.qrj
    @InterfaceC7396q
    /* JADX INFO: renamed from: nnh, reason: merged with bridge method [inline-methods] */
    public x2 c8jq(@InterfaceC7396q String string, int i2, int i3, @InterfaceC7396q Charset charset) {
        kotlin.jvm.internal.d2ok.m23075h(string, "string");
        kotlin.jvm.internal.d2ok.m23075h(charset, "charset");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i2).toString());
        }
        if (!(i3 >= i2)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i3 + " < " + i2).toString());
        }
        if (!(i3 <= string.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i3 + " > " + string.length()).toString());
        }
        if (kotlin.jvm.internal.d2ok.f7l8(charset, C6433g.f81921toq)) {
            return mo27639m(string, i2, i3);
        }
        String strSubstring = string.substring(i2, i3);
        kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        byte[] bytes = strSubstring.getBytes(charset);
        kotlin.jvm.internal.d2ok.kja0(bytes, "this as java.lang.String).getBytes(charset)");
        return write(bytes, 0, bytes.length);
    }

    @InterfaceC6768s
    @InterfaceC7396q
    public final C7577k nsb(@InterfaceC7396q C7577k unsafeCursor) {
        kotlin.jvm.internal.d2ok.m23075h(unsafeCursor, "unsafeCursor");
        return C7551k.t8r(this, unsafeCursor);
    }

    @InterfaceC7396q
    public final kja0 o05(int i2) {
        if (i2 == 0) {
            return kja0.EMPTY;
        }
        C7575s.m27855n(size(), 0L, i2);
        C7541c c7541c = this.f43846k;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            kotlin.jvm.internal.d2ok.qrj(c7541c);
            int i6 = c7541c.f94264zy;
            int i7 = c7541c.f94263toq;
            if (i6 == i7) {
                throw new AssertionError("s.limit == s.pos");
            }
            i4 += i6 - i7;
            i5++;
            c7541c = c7541c.f43686g;
        }
        byte[][] bArr = new byte[i5][];
        int[] iArr = new int[i5 * 2];
        C7541c c7541c2 = this.f43846k;
        int i8 = 0;
        while (i3 < i2) {
            kotlin.jvm.internal.d2ok.qrj(c7541c2);
            bArr[i8] = c7541c2.f43687k;
            i3 += c7541c2.f94264zy - c7541c2.f94263toq;
            iArr[i8] = Math.min(i3, i2);
            iArr[i8 + i5] = c7541c2.f94263toq;
            c7541c2.f43689q = true;
            i8++;
            c7541c2 = c7541c2.f43686g;
        }
        return new uv6(bArr, iArr);
    }

    @Override // okio.qrj
    @InterfaceC7396q
    /* JADX INFO: renamed from: o5, reason: merged with bridge method [inline-methods] */
    public x2 mo27639m(@InterfaceC7396q String string, int i2, int i3) {
        char cCharAt;
        kotlin.jvm.internal.d2ok.m23075h(string, "string");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i2).toString());
        }
        if (!(i3 >= i2)) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i3 + " < " + i2).toString());
        }
        if (!(i3 <= string.length())) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i3 + " > " + string.length()).toString());
        }
        while (i2 < i3) {
            char cCharAt2 = string.charAt(i2);
            if (cCharAt2 < 128) {
                C7541c c7541cM58i = m58i(1);
                byte[] bArr = c7541cM58i.f43687k;
                int i4 = c7541cM58i.f94264zy - i2;
                int iMin = Math.min(i3, 8192 - i4);
                int i5 = i2 + 1;
                bArr[i2 + i4] = (byte) cCharAt2;
                while (true) {
                    i2 = i5;
                    if (i2 >= iMin || (cCharAt = string.charAt(i2)) >= 128) {
                        break;
                    }
                    i5 = i2 + 1;
                    bArr[i2 + i4] = (byte) cCharAt;
                }
                int i6 = c7541cM58i.f94264zy;
                int i7 = (i4 + i2) - i6;
                c7541cM58i.f94264zy = i6 + i7;
                vy(size() + ((long) i7));
            } else {
                if (cCharAt2 < 2048) {
                    C7541c c7541cM58i2 = m58i(2);
                    byte[] bArr2 = c7541cM58i2.f43687k;
                    int i8 = c7541cM58i2.f94264zy;
                    bArr2[i8] = (byte) ((cCharAt2 >> 6) | com.google.android.exoplayer2.extractor.ts.wvg.f64653fu4);
                    bArr2[i8 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    c7541cM58i2.f94264zy = i8 + 2;
                    vy(size() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    C7541c c7541cM58i3 = m58i(3);
                    byte[] bArr3 = c7541cM58i3.f43687k;
                    int i9 = c7541cM58i3.f94264zy;
                    bArr3[i9] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i9 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i9 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    c7541cM58i3.f94264zy = i9 + 3;
                    vy(size() + 3);
                } else {
                    int i10 = i2 + 1;
                    char cCharAt3 = i10 < i3 ? string.charAt(i10) : (char) 0;
                    if (cCharAt2 <= 56319) {
                        if (56320 <= cCharAt3 && cCharAt3 < 57344) {
                            int i11 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                            C7541c c7541cM58i4 = m58i(4);
                            byte[] bArr4 = c7541cM58i4.f43687k;
                            int i12 = c7541cM58i4.f94264zy;
                            bArr4[i12] = (byte) ((i11 >> 18) | com.google.android.exoplayer2.extractor.ts.wvg.f64659wvg);
                            bArr4[i12 + 1] = (byte) (((i11 >> 12) & 63) | 128);
                            bArr4[i12 + 2] = (byte) (((i11 >> 6) & 63) | 128);
                            bArr4[i12 + 3] = (byte) ((i11 & 63) | 128);
                            c7541cM58i4.f94264zy = i12 + 4;
                            vy(size() + 4);
                            i2 += 2;
                        }
                    }
                    writeByte(63);
                    i2 = i10;
                }
                i2++;
            }
        }
        return this;
    }

    @Override // okio.n7h
    @InterfaceC7395n
    public String oc() throws EOFException {
        long jIkck = ikck((byte) 10);
        if (jIkck != -1) {
            return C7551k.bf2(this, jIkck);
        }
        if (size() != 0) {
            return mo27610d(size());
        }
        return null;
    }

    @InterfaceC7396q
    public final kja0 oki() {
        if (size() <= 2147483647L) {
            return o05((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    @Override // okio.n7h
    @InterfaceC7396q
    public n7h peek() {
        return d2ok.m27592n(new C7564l(this));
    }

    @Override // okio.n7h
    @InterfaceC7396q
    public InputStream pjz9() {
        return new toq();
    }

    @Override // okio.qrj
    @InterfaceC7396q
    /* JADX INFO: renamed from: ps, reason: merged with bridge method [inline-methods] */
    public x2 o1t(long j2) {
        return writeLong(C7575s.m27852h(j2));
    }

    @Override // okio.n7h
    public boolean py() {
        return this.f43847q == 0;
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "moved to val", replaceWith = @kotlin.hb(expression = "size", imports = {}))
    @InterfaceC6769y(name = "-deprecated_size")
    /* JADX INFO: renamed from: q */
    public final long m27870q() {
        return this.f43847q;
    }

    @Override // okio.n7h
    @InterfaceC7396q
    /* JADX INFO: renamed from: r */
    public String mo27613r(long j2) throws EOFException {
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j2).toString());
        }
        long j3 = j2 != Long.MAX_VALUE ? j2 + 1 : Long.MAX_VALUE;
        long jGvn7 = gvn7((byte) 10, 0L, j3);
        if (jGvn7 != -1) {
            return C7551k.bf2(this, jGvn7);
        }
        if (j3 < size() && g1(j3 - 1) == 13 && g1(j3) == 10) {
            return C7551k.bf2(this, j3);
        }
        x2 x2Var = new x2();
        yz(x2Var, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j2) + " content=" + x2Var.uj2j().hex() + kotlin.text.eqxt.f81897fti);
    }

    @Override // okio.qrj
    @InterfaceC7396q
    /* JADX INFO: renamed from: r25n, reason: merged with bridge method [inline-methods] */
    public x2 write(@InterfaceC7396q byte[] source, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        long j2 = i3;
        C7575s.m27855n(source.length, i2, j2);
        int i4 = i3 + i2;
        while (i2 < i4) {
            C7541c c7541cM58i = m58i(1);
            int iMin = Math.min(i4 - i2, 8192 - c7541cM58i.f94264zy);
            int i5 = i2 + iMin;
            kotlin.collections.kja0.y2(source, c7541cM58i.f43687k, c7541cM58i.f94264zy, i2, i5);
            c7541cM58i.f94264zy += iMin;
            i2 = i5;
        }
        vy(size() + j2);
        return this;
    }

    @Override // okio.n7h
    public long r8s8() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        long j2 = -7;
        int i2 = 0;
        long j3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        do {
            C7541c c7541c = this.f43846k;
            kotlin.jvm.internal.d2ok.qrj(c7541c);
            byte[] bArr = c7541c.f43687k;
            int i3 = c7541c.f94263toq;
            int i4 = c7541c.f94264zy;
            while (i3 < i4) {
                byte b2 = bArr[i3];
                if (b2 >= 48 && b2 <= 57) {
                    int i5 = 48 - b2;
                    if (j3 < C7551k.f94274zy || (j3 == C7551k.f94274zy && i5 < j2)) {
                        x2 x2VarWriteByte = new x2().xwq3(j3).writeByte(b2);
                        if (!z2) {
                            x2VarWriteByte.readByte();
                        }
                        throw new NumberFormatException("Number too large: " + x2VarWriteByte.jbh());
                    }
                    j3 = (j3 * 10) + ((long) i5);
                } else {
                    if (b2 != 45 || i2 != 0) {
                        z3 = true;
                        break;
                    }
                    j2--;
                    z2 = true;
                }
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.f43846k = c7541c.toq();
                lrht.m27786q(c7541c);
            } else {
                c7541c.f94263toq = i3;
            }
            if (z3) {
                break;
            }
        } while (this.f43846k != null);
        vy(size() - ((long) i2));
        if (i2 >= (z2 ? 2 : 1)) {
            return z2 ? j3 : -j3;
        }
        if (size() == 0) {
            throw new EOFException();
        }
        throw new NumberFormatException((z2 ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + C7575s.fn3e(g1(0L)));
    }

    @Override // okio.qrj
    @InterfaceC7396q
    /* JADX INFO: renamed from: ra, reason: merged with bridge method [inline-methods] */
    public x2 cfr(int i2) {
        return writeShort(C7575s.cdj((short) i2));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@InterfaceC7396q ByteBuffer sink) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        C7541c c7541c = this.f43846k;
        if (c7541c == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), c7541c.f94264zy - c7541c.f94263toq);
        sink.put(c7541c.f43687k, c7541c.f94263toq, iMin);
        int i2 = c7541c.f94263toq + iMin;
        c7541c.f94263toq = i2;
        this.f43847q -= (long) iMin;
        if (i2 == c7541c.f94264zy) {
            this.f43846k = c7541c.toq();
            lrht.m27786q(c7541c);
        }
        return iMin;
    }

    @Override // okio.n7h
    public byte readByte() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        C7541c c7541c = this.f43846k;
        kotlin.jvm.internal.d2ok.qrj(c7541c);
        int i2 = c7541c.f94263toq;
        int i3 = c7541c.f94264zy;
        int i4 = i2 + 1;
        byte b2 = c7541c.f43687k[i2];
        vy(size() - 1);
        if (i4 == i3) {
            this.f43846k = c7541c.toq();
            lrht.m27786q(c7541c);
        } else {
            c7541c.f94263toq = i4;
        }
        return b2;
    }

    @Override // okio.n7h
    public void readFully(@InterfaceC7396q byte[] sink) throws EOFException {
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        int i2 = 0;
        while (i2 < sink.length) {
            int i3 = read(sink, i2, sink.length - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
    }

    @Override // okio.n7h
    public int readInt() throws EOFException {
        if (size() < 4) {
            throw new EOFException();
        }
        C7541c c7541c = this.f43846k;
        kotlin.jvm.internal.d2ok.qrj(c7541c);
        int i2 = c7541c.f94263toq;
        int i3 = c7541c.f94264zy;
        if (i3 - i2 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = c7541c.f43687k;
        int i4 = i2 + 1;
        int i5 = i4 + 1;
        int i6 = ((bArr[i2] & 255) << 24) | ((bArr[i4] & 255) << 16);
        int i7 = i5 + 1;
        int i8 = i6 | ((bArr[i5] & 255) << 8);
        int i9 = i7 + 1;
        int i10 = i8 | (bArr[i7] & 255);
        vy(size() - 4);
        if (i9 == i3) {
            this.f43846k = c7541c.toq();
            lrht.m27786q(c7541c);
        } else {
            c7541c.f94263toq = i9;
        }
        return i10;
    }

    @Override // okio.n7h
    public long readLong() throws EOFException {
        if (size() < 8) {
            throw new EOFException();
        }
        C7541c c7541c = this.f43846k;
        kotlin.jvm.internal.d2ok.qrj(c7541c);
        int i2 = c7541c.f94263toq;
        int i3 = c7541c.f94264zy;
        if (i3 - i2 < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = c7541c.f43687k;
        int i4 = i2 + 1;
        long j2 = (((long) bArr[i2]) & 255) << 56;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        long j3 = j2 | ((((long) bArr[i4]) & 255) << 48) | ((((long) bArr[i5]) & 255) << 40);
        int i7 = i6 + 1;
        int i8 = i7 + 1;
        long j4 = j3 | ((((long) bArr[i6]) & 255) << 32) | ((((long) bArr[i7]) & 255) << 24);
        int i9 = i8 + 1;
        long j5 = j4 | ((((long) bArr[i8]) & 255) << 16);
        int i10 = i9 + 1;
        long j6 = j5 | ((((long) bArr[i9]) & 255) << 8);
        int i11 = i10 + 1;
        long j7 = j6 | (((long) bArr[i10]) & 255);
        vy(size() - 8);
        if (i11 == i3) {
            this.f43846k = c7541c.toq();
            lrht.m27786q(c7541c);
        } else {
            c7541c.f94263toq = i11;
        }
        return j7;
    }

    @Override // okio.n7h
    public short readShort() throws EOFException {
        if (size() < 2) {
            throw new EOFException();
        }
        C7541c c7541c = this.f43846k;
        kotlin.jvm.internal.d2ok.qrj(c7541c);
        int i2 = c7541c.f94263toq;
        int i3 = c7541c.f94264zy;
        if (i3 - i2 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = c7541c.f43687k;
        int i4 = i2 + 1;
        int i5 = i4 + 1;
        int i6 = ((bArr[i2] & 255) << 8) | (bArr[i4] & 255);
        vy(size() - 2);
        if (i5 == i3) {
            this.f43846k = c7541c.toq();
            lrht.m27786q(c7541c);
        } else {
            c7541c.f94263toq = i5;
        }
        return (short) i6;
    }

    @Override // okio.n7h
    @InterfaceC7396q
    public String se(@InterfaceC7396q Charset charset) {
        kotlin.jvm.internal.d2ok.m23075h(charset, "charset");
        return yl(this.f43847q, charset);
    }

    @InterfaceC6769y(name = "size")
    public final long size() {
        return this.f43847q;
    }

    @Override // okio.n7h
    public void skip(long j2) throws EOFException {
        while (j2 > 0) {
            C7541c c7541c = this.f43846k;
            if (c7541c == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j2, c7541c.f94264zy - c7541c.f94263toq);
            long j3 = iMin;
            vy(size() - j3);
            j2 -= j3;
            int i2 = c7541c.f94263toq + iMin;
            c7541c.f94263toq = i2;
            if (i2 == c7541c.f94264zy) {
                this.f43846k = c7541c.toq();
                lrht.m27786q(c7541c);
            }
        }
    }

    @InterfaceC6768s
    @InterfaceC7396q
    /* JADX INFO: renamed from: t */
    public final x2 m27871t(@InterfaceC7396q OutputStream out) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(out, "out");
        return y9n(this, out, 0L, 0L, 6, null);
    }

    @Override // okio.qrj
    @InterfaceC7396q
    /* JADX INFO: renamed from: t8iq, reason: merged with bridge method [inline-methods] */
    public x2 eqxt() {
        return this;
    }

    @InterfaceC7396q
    public String toString() {
        return oki().toString();
    }

    @Override // okio.nn86
    @InterfaceC7396q
    public C7560j toq() {
        return C7560j.f43770n;
    }

    @Override // okio.qrj
    @InterfaceC7396q
    /* JADX INFO: renamed from: u38j, reason: merged with bridge method [inline-methods] */
    public x2 writeLong(long j2) {
        C7541c c7541cM58i = m58i(8);
        byte[] bArr = c7541cM58i.f43687k;
        int i2 = c7541cM58i.f94264zy;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j2 >>> 56) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j2 >>> 48) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j2 >>> 40) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j2 >>> 32) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j2 >>> 24) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j2 >>> 16) & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((j2 >>> 8) & 255);
        bArr[i9] = (byte) (j2 & 255);
        c7541cM58i.f94264zy = i9 + 1;
        vy(size() + 8);
        return this;
    }

    @Override // okio.qrj
    @InterfaceC7396q
    /* JADX INFO: renamed from: uf, reason: merged with bridge method [inline-methods] */
    public x2 jz5(@InterfaceC7396q String string, @InterfaceC7396q Charset charset) {
        kotlin.jvm.internal.d2ok.m23075h(string, "string");
        kotlin.jvm.internal.d2ok.m23075h(charset, "charset");
        return c8jq(string, 0, string.length(), charset);
    }

    @Override // okio.n7h
    @InterfaceC7396q
    public kja0 uj2j() {
        return fnq8(size());
    }

    @Override // okio.n7h
    public long ukdy(@InterfaceC7396q vyq sink) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.mo26936j(this, size);
        }
        return size;
    }

    @Override // okio.qrj
    @InterfaceC7396q
    /* JADX INFO: renamed from: v5yj, reason: merged with bridge method [inline-methods] */
    public x2 writeShort(int i2) {
        C7541c c7541cM58i = m58i(2);
        byte[] bArr = c7541cM58i.f43687k;
        int i3 = c7541cM58i.f94264zy;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 8) & 255);
        bArr[i4] = (byte) (i2 & 255);
        c7541cM58i.f94264zy = i4 + 1;
        vy(size() + 2);
        return this;
    }

    public final void vy(long j2) {
        this.f43847q = j2;
    }

    @Override // okio.n7h
    public boolean vyq(long j2, @InterfaceC7396q kja0 bytes) {
        kotlin.jvm.internal.d2ok.m23075h(bytes, "bytes");
        return ch(j2, bytes, 0, bytes.size());
    }

    @Override // okio.qrj
    @InterfaceC7396q
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public x2 writeInt(int i2) {
        C7541c c7541cM58i = m58i(4);
        byte[] bArr = c7541cM58i.f43687k;
        int i3 = c7541cM58i.f94264zy;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 24) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >>> 16) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i2 >>> 8) & 255);
        bArr[i6] = (byte) (i2 & 255);
        c7541cM58i.f94264zy = i6 + 1;
        vy(size() + 4);
        return this;
    }

    @InterfaceC7396q
    public final x2 wvg() {
        x2 x2Var = new x2();
        if (size() != 0) {
            C7541c c7541c = this.f43846k;
            kotlin.jvm.internal.d2ok.qrj(c7541c);
            C7541c c7541cM27584q = c7541c.m27584q();
            x2Var.f43846k = c7541cM27584q;
            c7541cM27584q.f94262f7l8 = c7541cM27584q;
            c7541cM27584q.f43686g = c7541cM27584q;
            for (C7541c c7541c2 = c7541c.f43686g; c7541c2 != c7541c; c7541c2 = c7541c2.f43686g) {
                C7541c c7541c3 = c7541cM27584q.f94262f7l8;
                kotlin.jvm.internal.d2ok.qrj(c7541c3);
                kotlin.jvm.internal.d2ok.qrj(c7541c2);
                c7541c3.zy(c7541c2.m27584q());
            }
            x2Var.vy(size());
        }
        return x2Var;
    }

    @Override // okio.nn86
    public long wx16(@InterfaceC7396q x2 sink, long j2) {
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (j2 > size()) {
            j2 = size();
        }
        sink.mo26936j(this, j2);
        return j2;
    }

    /* JADX INFO: renamed from: y */
    public final void m27873y() throws EOFException {
        skip(size());
    }

    @Override // okio.n7h
    public long y2() throws EOFException {
        return C7575s.m27852h(readLong());
    }

    @Override // okio.n7h
    @InterfaceC7396q
    public String yl(long j2, @InterfaceC7396q Charset charset) throws EOFException {
        kotlin.jvm.internal.d2ok.m23075h(charset, "charset");
        if (!(j2 >= 0 && j2 <= 2147483647L)) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f43847q < j2) {
            throw new EOFException();
        }
        if (j2 == 0) {
            return "";
        }
        C7541c c7541c = this.f43846k;
        kotlin.jvm.internal.d2ok.qrj(c7541c);
        int i2 = c7541c.f94263toq;
        if (((long) i2) + j2 > c7541c.f94264zy) {
            return new String(lv5(j2), charset);
        }
        int i3 = (int) j2;
        String str = new String(c7541c.f43687k, i2, i3, charset);
        int i4 = c7541c.f94263toq + i3;
        c7541c.f94263toq = i4;
        this.f43847q -= j2;
        if (i4 == c7541c.f94264zy) {
            this.f43846k = c7541c.toq();
            lrht.m27786q(c7541c);
        }
        return str;
    }

    @Override // okio.qrj
    @InterfaceC7396q
    /* JADX INFO: renamed from: yw, reason: merged with bridge method [inline-methods] */
    public x2 ni7(int i2) {
        if (i2 < 128) {
            writeByte(i2);
        } else if (i2 < 2048) {
            C7541c c7541cM58i = m58i(2);
            byte[] bArr = c7541cM58i.f43687k;
            int i3 = c7541cM58i.f94264zy;
            bArr[i3] = (byte) ((i2 >> 6) | com.google.android.exoplayer2.extractor.ts.wvg.f64653fu4);
            bArr[i3 + 1] = (byte) ((i2 & 63) | 128);
            c7541cM58i.f94264zy = i3 + 2;
            vy(size() + 2);
        } else {
            boolean z2 = false;
            if (55296 <= i2 && i2 < 57344) {
                z2 = true;
            }
            if (z2) {
                writeByte(63);
            } else if (i2 < 65536) {
                C7541c c7541cM58i2 = m58i(3);
                byte[] bArr2 = c7541cM58i2.f43687k;
                int i4 = c7541cM58i2.f94264zy;
                bArr2[i4] = (byte) ((i2 >> 12) | 224);
                bArr2[i4 + 1] = (byte) (((i2 >> 6) & 63) | 128);
                bArr2[i4 + 2] = (byte) ((i2 & 63) | 128);
                c7541cM58i2.f94264zy = i4 + 3;
                vy(size() + 3);
            } else {
                if (i2 > 1114111) {
                    throw new IllegalArgumentException("Unexpected code point: 0x" + C7575s.zurt(i2));
                }
                C7541c c7541cM58i3 = m58i(4);
                byte[] bArr3 = c7541cM58i3.f43687k;
                int i5 = c7541cM58i3.f94264zy;
                bArr3[i5] = (byte) ((i2 >> 18) | com.google.android.exoplayer2.extractor.ts.wvg.f64659wvg);
                bArr3[i5 + 1] = (byte) (((i2 >> 12) & 63) | 128);
                bArr3[i5 + 2] = (byte) (((i2 >> 6) & 63) | 128);
                bArr3[i5 + 3] = (byte) ((i2 & 63) | 128);
                c7541cM58i3.f94264zy = i5 + 4;
                vy(size() + 4);
            }
        }
        return this;
    }

    @InterfaceC7396q
    public final x2 yz(@InterfaceC7396q x2 out, long j2, long j3) {
        kotlin.jvm.internal.d2ok.m23075h(out, "out");
        C7575s.m27855n(size(), j2, j3);
        if (j3 != 0) {
            out.vy(out.size() + j3);
            C7541c c7541c = this.f43846k;
            while (true) {
                kotlin.jvm.internal.d2ok.qrj(c7541c);
                int i2 = c7541c.f94264zy;
                int i3 = c7541c.f94263toq;
                if (j2 < i2 - i3) {
                    break;
                }
                j2 -= (long) (i2 - i3);
                c7541c = c7541c.f43686g;
            }
            while (j3 > 0) {
                kotlin.jvm.internal.d2ok.qrj(c7541c);
                C7541c c7541cM27584q = c7541c.m27584q();
                int i4 = c7541cM27584q.f94263toq + ((int) j2);
                c7541cM27584q.f94263toq = i4;
                c7541cM27584q.f94264zy = Math.min(i4 + ((int) j3), c7541cM27584q.f94264zy);
                C7541c c7541c2 = out.f43846k;
                if (c7541c2 == null) {
                    c7541cM27584q.f94262f7l8 = c7541cM27584q;
                    c7541cM27584q.f43686g = c7541cM27584q;
                    out.f43846k = c7541cM27584q;
                } else {
                    kotlin.jvm.internal.d2ok.qrj(c7541c2);
                    C7541c c7541c3 = c7541c2.f94262f7l8;
                    kotlin.jvm.internal.d2ok.qrj(c7541c3);
                    c7541c3.zy(c7541cM27584q);
                }
                j3 -= (long) (c7541cM27584q.f94264zy - c7541cM27584q.f94263toq);
                c7541c = c7541c.f43686g;
                j2 = 0;
            }
        }
        return this;
    }

    @InterfaceC6768s
    @InterfaceC7396q
    public final x2 z4t(@InterfaceC7396q OutputStream out, long j2) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(out, "out");
        C7575s.m27855n(this.f43847q, 0L, j2);
        C7541c c7541c = this.f43846k;
        while (j2 > 0) {
            kotlin.jvm.internal.d2ok.qrj(c7541c);
            int iMin = (int) Math.min(j2, c7541c.f94264zy - c7541c.f94263toq);
            out.write(c7541c.f43687k, c7541c.f94263toq, iMin);
            int i2 = c7541c.f94263toq + iMin;
            c7541c.f94263toq = i2;
            long j3 = iMin;
            this.f43847q -= j3;
            j2 -= j3;
            if (i2 == c7541c.f94264zy) {
                C7541c qVar = c7541c.toq();
                this.f43846k = qVar;
                lrht.m27786q(c7541c);
                c7541c = qVar;
            }
        }
        return this;
    }

    @Override // okio.n7h
    public int zkd() throws EOFException {
        int i2;
        int i3;
        int i4;
        if (size() == 0) {
            throw new EOFException();
        }
        byte bG1 = g1(0L);
        boolean z2 = false;
        if ((bG1 & 128) == 0) {
            i2 = bG1 & 127;
            i4 = 0;
            i3 = 1;
        } else if ((bG1 & 224) == 192) {
            i2 = bG1 & com.google.common.base.zy.f68113d3;
            i3 = 2;
            i4 = 128;
        } else if ((bG1 & 240) == 224) {
            i2 = bG1 & com.google.common.base.zy.f68111cdj;
            i3 = 3;
            i4 = 2048;
        } else {
            if ((bG1 & 248) != 240) {
                skip(1L);
                return C7571o.f94299zy;
            }
            i2 = bG1 & 7;
            i3 = 4;
            i4 = 65536;
        }
        long j2 = i3;
        if (size() < j2) {
            throw new EOFException("size < " + i3 + ": " + size() + " (to read code point prefixed 0x" + C7575s.fn3e(bG1) + ')');
        }
        for (int i5 = 1; i5 < i3; i5++) {
            long j3 = i5;
            byte bG12 = g1(j3);
            if ((bG12 & 192) != 128) {
                skip(j3);
                return C7571o.f94299zy;
            }
            i2 = (i2 << 6) | (bG12 & C7571o.f43818k);
        }
        skip(j2);
        if (i2 > 1114111) {
            return C7571o.f94299zy;
        }
        if (55296 <= i2 && i2 < 57344) {
            z2 = true;
        }
        return (!z2 && i2 >= i4) ? i2 : C7571o.f94299zy;
    }

    @Override // okio.n7h
    @InterfaceC7396q
    public String zp() throws EOFException {
        return mo27613r(Long.MAX_VALUE);
    }

    @Override // okio.qrj
    @InterfaceC7396q
    public OutputStream zwy() {
        return new zy();
    }

    /* JADX INFO: compiled from: Buffer.kt */
    @lv5({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer$inputStream$1\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,641:1\n74#2:642\n86#2:643\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer$inputStream$1\n*L\n126#1:642\n136#1:643\n*E\n"})
    public static final class toq extends InputStream {
        toq() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(x2.this.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (x2.this.size() > 0) {
                return x2.this.readByte() & 255;
            }
            return -1;
        }

        @InterfaceC7396q
        public String toString() {
            return x2.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(@InterfaceC7396q byte[] sink, int i2, int i3) {
            kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
            return x2.this.read(sink, i2, i3);
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@InterfaceC7396q ByteBuffer source) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(source, "source");
        int iRemaining = source.remaining();
        int i2 = iRemaining;
        while (i2 > 0) {
            C7541c c7541cM58i = m58i(1);
            int iMin = Math.min(i2, 8192 - c7541cM58i.f94264zy);
            source.get(c7541cM58i.f43687k, c7541cM58i.f94264zy, iMin);
            i2 -= iMin;
            c7541cM58i.f94264zy += iMin;
        }
        this.f43847q += (long) iRemaining;
        return iRemaining;
    }

    @Override // okio.n7h
    public int read(@InterfaceC7396q byte[] sink) {
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        return read(sink, 0, sink.length);
    }

    @Override // okio.n7h
    public int read(@InterfaceC7396q byte[] sink, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(sink, "sink");
        C7575s.m27855n(sink.length, i2, i3);
        C7541c c7541c = this.f43846k;
        if (c7541c == null) {
            return -1;
        }
        int iMin = Math.min(i3, c7541c.f94264zy - c7541c.f94263toq);
        byte[] bArr = c7541c.f43687k;
        int i4 = c7541c.f94263toq;
        kotlin.collections.kja0.y2(bArr, sink, i2, i4, i4 + iMin);
        c7541c.f94263toq += iMin;
        vy(size() - ((long) iMin));
        if (c7541c.f94263toq == c7541c.f94264zy) {
            this.f43846k = c7541c.toq();
            lrht.m27786q(c7541c);
        }
        return iMin;
    }
}
