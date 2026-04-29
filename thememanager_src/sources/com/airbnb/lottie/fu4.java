package com.airbnb.lottie;

import com.airbnb.lottie.network.InterfaceC1477g;
import com.airbnb.lottie.network.InterfaceC1479n;
import java.io.File;

/* JADX INFO: compiled from: LottieConfig.java */
/* JADX INFO: loaded from: classes.dex */
public class fu4 {

    /* JADX INFO: renamed from: k */
    @zy.dd
    final InterfaceC1477g f7941k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @zy.dd
    final InterfaceC1479n f55949toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    final boolean f55950zy;

    /* JADX INFO: compiled from: LottieConfig.java */
    public static final class toq {

        /* JADX INFO: renamed from: k */
        @zy.dd
        private InterfaceC1477g f7942k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @zy.dd
        private InterfaceC1479n f55951toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f55952zy = false;

        /* JADX INFO: renamed from: com.airbnb.lottie.fu4$toq$k */
        /* JADX INFO: compiled from: LottieConfig.java */
        class C1433k implements InterfaceC1479n {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ File f7943k;

            C1433k(File file) {
                this.f7943k = file;
            }

            @Override // com.airbnb.lottie.network.InterfaceC1479n
            @zy.lvui
            /* JADX INFO: renamed from: k */
            public File mo5962k() {
                if (this.f7943k.isDirectory()) {
                    return this.f7943k;
                }
                throw new IllegalArgumentException("cache file must be a directory");
            }
        }

        /* JADX INFO: renamed from: com.airbnb.lottie.fu4$toq$toq, reason: collision with other inner class name */
        /* JADX INFO: compiled from: LottieConfig.java */
        class C7902toq implements InterfaceC1479n {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ InterfaceC1479n f7944k;

            C7902toq(InterfaceC1479n interfaceC1479n) {
                this.f7944k = interfaceC1479n;
            }

            @Override // com.airbnb.lottie.network.InterfaceC1479n
            @zy.lvui
            /* JADX INFO: renamed from: k */
            public File mo5962k() {
                File fileMo5962k = this.f7944k.mo5962k();
                if (fileMo5962k.isDirectory()) {
                    return fileMo5962k;
                }
                throw new IllegalArgumentException("cache file must be a directory");
            }
        }

        @zy.lvui
        /* JADX INFO: renamed from: k */
        public fu4 m5959k() {
            return new fu4(this.f7942k, this.f55951toq, this.f55952zy);
        }

        @zy.lvui
        /* JADX INFO: renamed from: n */
        public toq m5960n(@zy.lvui InterfaceC1477g interfaceC1477g) {
            this.f7942k = interfaceC1477g;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: q */
        public toq m5961q(@zy.lvui InterfaceC1479n interfaceC1479n) {
            if (this.f55951toq != null) {
                throw new IllegalStateException("There is already a cache provider!");
            }
            this.f55951toq = new C7902toq(interfaceC1479n);
            return this;
        }

        @zy.lvui
        public toq toq(boolean z2) {
            this.f55952zy = z2;
            return this;
        }

        @zy.lvui
        public toq zy(@zy.lvui File file) {
            if (this.f55951toq != null) {
                throw new IllegalStateException("There is already a cache provider!");
            }
            this.f55951toq = new C1433k(file);
            return this;
        }
    }

    private fu4(@zy.dd InterfaceC1477g interfaceC1477g, @zy.dd InterfaceC1479n interfaceC1479n, boolean z2) {
        this.f7941k = interfaceC1477g;
        this.f55949toq = interfaceC1479n;
        this.f55950zy = z2;
    }
}
