package com.google.android.exoplayer2.util;

import android.os.SystemClock;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.upstream.oc;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: SntpClient.java */
/* JADX INFO: loaded from: classes2.dex */
public final class lvui {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f67044f7l8 = 123;

    /* JADX INFO: renamed from: g */
    private static final int f23236g = 48;

    /* JADX INFO: renamed from: i */
    @zy.o1t("valueLock")
    private static String f23238i = "time.android.com";

    /* JADX INFO: renamed from: k */
    public static final String f23239k = "time.android.com";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    @zy.o1t("valueLock")
    private static boolean f67045ki = false;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final long f67046kja0 = 2208988800L;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f67047ld6 = 3;

    /* JADX INFO: renamed from: n */
    private static final int f23240n = 40;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f67048n7h = 15;

    /* JADX INFO: renamed from: p */
    private static final int f23241p = 5;

    /* JADX INFO: renamed from: q */
    private static final int f23242q = 32;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f67049qrj = 0;

    /* JADX INFO: renamed from: s */
    private static final int f23243s = 4;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    @zy.o1t("valueLock")
    private static long f67050t8r = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f67051toq = 10000;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f67052x2 = 3;

    /* JADX INFO: renamed from: y */
    private static final int f23244y = 3;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f67053zy = 24;

    /* JADX INFO: renamed from: h */
    private static final Object f23237h = new Object();

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final Object f67043cdj = new Object();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.lvui$q */
    /* JADX INFO: compiled from: SntpClient.java */
    private static final class C3849q implements oc.InterfaceC3814n {
        private C3849q() {
        }

        @Override // com.google.android.exoplayer2.upstream.oc.InterfaceC3814n
        /* JADX INFO: renamed from: k */
        public void mo12654k() throws IOException {
            synchronized (lvui.f23237h) {
                synchronized (lvui.f67043cdj) {
                    if (lvui.f67045ki) {
                        return;
                    }
                    long jX2 = lvui.x2();
                    synchronized (lvui.f67043cdj) {
                        long unused = lvui.f67050t8r = jX2;
                        boolean unused2 = lvui.f67045ki = true;
                    }
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.oc.InterfaceC3814n
        public void zy() {
        }
    }

    /* JADX INFO: compiled from: SntpClient.java */
    public interface toq {
        /* JADX INFO: renamed from: k */
        void m13685k(IOException iOException);

        void toq();
    }

    /* JADX INFO: compiled from: SntpClient.java */
    private static final class zy implements oc.toq<oc.InterfaceC3814n> {

        /* JADX INFO: renamed from: k */
        @zy.dd
        private final toq f23245k;

        public zy(@zy.dd toq toqVar) {
            this.f23245k = toqVar;
        }

        @Override // com.google.android.exoplayer2.upstream.oc.toq
        /* JADX INFO: renamed from: h */
        public oc.zy mo12667h(oc.InterfaceC3814n interfaceC3814n, long j2, long j3, IOException iOException, int i2) {
            toq toqVar = this.f23245k;
            if (toqVar != null) {
                toqVar.m13685k(iOException);
            }
            return com.google.android.exoplayer2.upstream.oc.f66891ld6;
        }

        @Override // com.google.android.exoplayer2.upstream.oc.toq
        public void ld6(oc.InterfaceC3814n interfaceC3814n, long j2, long j3) {
            if (this.f23245k != null) {
                if (lvui.ld6()) {
                    this.f23245k.toq();
                } else {
                    this.f23245k.m13685k(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.oc.toq
        /* JADX INFO: renamed from: y */
        public void mo12670y(oc.InterfaceC3814n interfaceC3814n, long j2, long j3, boolean z2) {
        }
    }

    private lvui() {
    }

    private static void f7l8(byte b2, byte b3, int i2, long j2) throws IOException {
        if (b2 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b3 != 4 && b3 != 5) {
            StringBuilder sb = new StringBuilder(26);
            sb.append("SNTP: Untrusted mode: ");
            sb.append((int) b3);
            throw new IOException(sb.toString());
        }
        if (i2 != 0 && i2 <= 15) {
            if (j2 == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            StringBuilder sb2 = new StringBuilder(36);
            sb2.append("SNTP: Untrusted stratum: ");
            sb2.append(i2);
            throw new IOException(sb2.toString());
        }
    }

    /* JADX INFO: renamed from: h */
    private static void m13678h(byte[] bArr, int i2, long j2) {
        if (j2 == 0) {
            Arrays.fill(bArr, i2, i2 + 8, (byte) 0);
            return;
        }
        long j3 = j2 / 1000;
        long j4 = j2 - (j3 * 1000);
        long j5 = j3 + f67046kja0;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (j5 >> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (j5 >> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (j5 >> 8);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (j5 >> 0);
        long j6 = (j4 * 4294967296L) / 1000;
        int i7 = i6 + 1;
        bArr[i6] = (byte) (j6 >> 24);
        int i8 = i7 + 1;
        bArr[i7] = (byte) (j6 >> 16);
        bArr[i8] = (byte) (j6 >> 8);
        bArr[i8 + 1] = (byte) (Math.random() * 255.0d);
    }

    public static void kja0(String str) {
        synchronized (f67043cdj) {
            if (!f23238i.equals(str)) {
                f23238i = str;
                f67045ki = false;
            }
        }
    }

    public static boolean ld6() {
        boolean z2;
        synchronized (f67043cdj) {
            z2 = f67045ki;
        }
        return z2;
    }

    private static long n7h(byte[] bArr, int i2) {
        long jQrj = qrj(bArr, i2);
        long jQrj2 = qrj(bArr, i2 + 4);
        if (jQrj == 0 && jQrj2 == 0) {
            return 0L;
        }
        return ((jQrj - f67046kja0) * 1000) + ((jQrj2 * 1000) / 4294967296L);
    }

    /* JADX INFO: renamed from: p */
    public static void m13681p(@zy.dd com.google.android.exoplayer2.upstream.oc ocVar, @zy.dd toq toqVar) {
        if (ld6()) {
            if (toqVar != null) {
                toqVar.toq();
            }
        } else {
            if (ocVar == null) {
                ocVar = new com.google.android.exoplayer2.upstream.oc("SntpClient");
            }
            ocVar.n7h(new C3849q(), new zy(toqVar), 1);
        }
    }

    private static long qrj(byte[] bArr, int i2) {
        int i3 = bArr[i2];
        int i4 = bArr[i2 + 1];
        int i5 = bArr[i2 + 2];
        int i6 = bArr[i2 + 3];
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        if ((i6 & 128) == 128) {
            i6 = (i6 & 127) + 128;
        }
        return (((long) i3) << 24) + (((long) i4) << 16) + (((long) i5) << 8) + ((long) i6);
    }

    /* JADX INFO: renamed from: s */
    public static String m13683s() {
        String str;
        synchronized (f67043cdj) {
            str = f23238i;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long x2() throws IOException {
        InetAddress byName = InetAddress.getByName(m13683s());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = com.google.common.base.zy.f68110a9;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            m13678h(bArr, 40, jCurrentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j2 = jCurrentTimeMillis + (jElapsedRealtime2 - jElapsedRealtime);
            byte b2 = bArr[0];
            int i2 = bArr[1] & 255;
            long jN7h = n7h(bArr, 24);
            long jN7h2 = n7h(bArr, 32);
            long jN7h3 = n7h(bArr, 40);
            f7l8((byte) ((b2 >> 6) & 3), (byte) (b2 & 7), i2, jN7h3);
            long j3 = (j2 + (((jN7h2 - jN7h) + (jN7h3 - j2)) / 2)) - jElapsedRealtime2;
            datagramSocket.close();
            return j3;
        } catch (Throwable th) {
            try {
                datagramSocket.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: y */
    public static long m13684y() {
        long j2;
        synchronized (f67043cdj) {
            j2 = f67045ki ? f67050t8r : C3548p.f65257toq;
        }
        return j2;
    }
}
