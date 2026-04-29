package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.yqrt;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: UdpDataSource.java */
/* JADX INFO: loaded from: classes2.dex */
public final class vyq extends AbstractC3795g {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f66918cdj = -1;

    /* JADX INFO: renamed from: h */
    public static final int f23116h = 8000;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f66919kja0 = 2000;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final byte[] f66920f7l8;

    /* JADX INFO: renamed from: g */
    private final int f23117g;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @zy.dd
    private MulticastSocket f66921ld6;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private int f66922n7h;

    /* JADX INFO: renamed from: p */
    @zy.dd
    private DatagramSocket f23118p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private boolean f66923qrj;

    /* JADX INFO: renamed from: s */
    @zy.dd
    private Uri f23119s;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @zy.dd
    private InetAddress f66924x2;

    /* JADX INFO: renamed from: y */
    private final DatagramPacket f23120y;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.vyq$k */
    /* JADX INFO: compiled from: UdpDataSource.java */
    public static final class C3824k extends C3796h {
        public C3824k(Throwable th, int i2) {
            super(th, i2);
        }
    }

    public vyq() {
        this(2000);
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    public void close() {
        this.f23119s = null;
        MulticastSocket multicastSocket = this.f66921ld6;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) C3844k.f7l8(this.f66924x2));
            } catch (IOException unused) {
            }
            this.f66921ld6 = null;
        }
        DatagramSocket datagramSocket = this.f23118p;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f23118p = null;
        }
        this.f66924x2 = null;
        this.f66922n7h = 0;
        if (this.f66923qrj) {
            this.f66923qrj = false;
            ni7();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    @zy.dd
    public Uri getUri() {
        return this.f23119s;
    }

    @Override // com.google.android.exoplayer2.upstream.kja0
    /* JADX INFO: renamed from: k */
    public long mo7270k(t8r t8rVar) throws C3824k {
        Uri uri = t8rVar.f23103k;
        this.f23119s = uri;
        String str = (String) C3844k.f7l8(uri.getHost());
        int port = this.f23119s.getPort();
        fu4(t8rVar);
        try {
            this.f66924x2 = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f66924x2, port);
            if (this.f66924x2.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f66921ld6 = multicastSocket;
                multicastSocket.joinGroup(this.f66924x2);
                this.f23118p = this.f66921ld6;
            } else {
                this.f23118p = new DatagramSocket(inetSocketAddress);
            }
            this.f23118p.setSoTimeout(this.f23117g);
            this.f66923qrj = true;
            m13463z(t8rVar);
            return -1L;
        } catch (IOException e2) {
            throw new C3824k(e2, 2001);
        } catch (SecurityException e3) {
            throw new C3824k(e3, yqrt.ERROR_CODE_IO_NO_PERMISSION);
        }
    }

    public int o1t() {
        DatagramSocket datagramSocket = this.f23118p;
        if (datagramSocket == null) {
            return -1;
        }
        return datagramSocket.getLocalPort();
    }

    @Override // com.google.android.exoplayer2.upstream.x2
    public int read(byte[] bArr, int i2, int i3) throws C3824k {
        if (i3 == 0) {
            return 0;
        }
        if (this.f66922n7h == 0) {
            try {
                ((DatagramSocket) C3844k.f7l8(this.f23118p)).receive(this.f23120y);
                int length = this.f23120y.getLength();
                this.f66922n7h = length;
                zurt(length);
            } catch (SocketTimeoutException e2) {
                throw new C3824k(e2, yqrt.ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT);
            } catch (IOException e3) {
                throw new C3824k(e3, 2001);
            }
        }
        int length2 = this.f23120y.getLength();
        int i4 = this.f66922n7h;
        int iMin = Math.min(i4, i3);
        System.arraycopy(this.f66920f7l8, length2 - i4, bArr, i2, iMin);
        this.f66922n7h -= iMin;
        return iMin;
    }

    public vyq(int i2) {
        this(i2, 8000);
    }

    public vyq(int i2, int i3) {
        super(true);
        this.f23117g = i3;
        byte[] bArr = new byte[i2];
        this.f66920f7l8 = bArr;
        this.f23120y = new DatagramPacket(bArr, 0, i2);
    }
}
