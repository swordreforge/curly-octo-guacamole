package com.android.thememanager.basemodule.video;

import java.io.IOException;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.video.n */
/* JADX INFO: compiled from: NetworkSniffer.java */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1836n {

    /* JADX INFO: renamed from: k */
    public static final InterfaceC1836n f10454k = new k();

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.video.n$k */
    /* JADX INFO: compiled from: NetworkSniffer.java */
    class k implements InterfaceC1836n {
        k() {
        }

        @Override // com.android.thememanager.basemodule.video.InterfaceC1836n
        /* JADX INFO: renamed from: k */
        public boolean mo6439k() {
            return true;
        }

        @Override // com.android.thememanager.basemodule.video.InterfaceC1836n
        public boolean toq() {
            return true;
        }

        @Override // com.android.thememanager.basemodule.video.InterfaceC1836n
        public boolean zy() {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.video.n$toq */
    /* JADX INFO: compiled from: NetworkSniffer.java */
    public static class toq extends IOException {
        public static final int NETWORK_DISCONNECTED = 0;
        public static final int NETWORK_REJECT_USE_MOBILE = 1;
        private final int mRejectType;

        public toq(int rejectType, String message) {
            super(message);
            this.mRejectType = rejectType;
        }

        static toq createDisconnectedException() {
            return new toq(0, "network disconnected.");
        }

        static toq createRejectMobileNetworkException() {
            return new toq(1, "reject use mobile network.");
        }

        public int getRejectType() {
            return this.mRejectType;
        }
    }

    /* JADX INFO: renamed from: k */
    boolean mo6439k();

    boolean toq();

    boolean zy();
}
