package androidx.core.net;

import android.net.TrafficStats;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;
import zy.InterfaceC7830i;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: androidx.core.net.n */
/* JADX INFO: compiled from: TrafficStatsCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0575n {

    /* JADX INFO: renamed from: androidx.core.net.n$k */
    /* JADX INFO: compiled from: TrafficStatsCompat.java */
    @hyr(24)
    static class k {
        private k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m2706k(DatagramSocket datagramSocket) throws SocketException {
            TrafficStats.tagDatagramSocket(datagramSocket);
        }

        @InterfaceC7830i
        static void toq(DatagramSocket datagramSocket) throws SocketException {
            TrafficStats.untagDatagramSocket(datagramSocket);
        }
    }

    private C0575n() {
    }

    @Deprecated
    public static void f7l8(Socket socket) throws SocketException {
        TrafficStats.tagSocket(socket);
    }

    /* JADX INFO: renamed from: g */
    public static void m2700g(@lvui DatagramSocket datagramSocket) throws SocketException {
        k.m2706k(datagramSocket);
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    public static void m2701k() {
        TrafficStats.clearThreadStatsTag();
    }

    @Deprecated
    /* JADX INFO: renamed from: n */
    public static void m2702n(int i2) {
        TrafficStats.setThreadStatsTag(i2);
    }

    @Deprecated
    /* JADX INFO: renamed from: q */
    public static void m2703q(int i2, int i3) {
        TrafficStats.incrementOperationCount(i2, i3);
    }

    @Deprecated
    /* JADX INFO: renamed from: s */
    public static void m2704s(Socket socket) throws SocketException {
        TrafficStats.untagSocket(socket);
    }

    @Deprecated
    public static int toq() {
        return TrafficStats.getThreadStatsTag();
    }

    /* JADX INFO: renamed from: y */
    public static void m2705y(@lvui DatagramSocket datagramSocket) throws SocketException {
        k.toq(datagramSocket);
    }

    @Deprecated
    public static void zy(int i2) {
        TrafficStats.incrementOperationCount(i2);
    }
}
