package com.xiaomi.accountsdk.request;

import com.xiaomi.accountsdk.request.wvg;
import java.io.IOException;

/* JADX INFO: compiled from: PassportSimpleRequest.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zurt extends t8r {

    /* JADX INFO: renamed from: k */
    protected final C5538i f30999k;

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.request.zurt$k */
    /* JADX INFO: compiled from: PassportSimpleRequest.java */
    public static class C5558k extends zurt {
        public C5558k(C5538i c5538i) {
            super(c5538i);
        }

        @Override // com.xiaomi.accountsdk.request.t8r
        /* JADX INFO: renamed from: k */
        public wvg.C5555y mo18922k() throws fn3e, IOException {
            try {
                C5538i c5538i = this.f30999k;
                return C5550t.m19002y(c5538i.f30938g, c5538i.f30939k, c5538i.f72928zy, c5538i.f72927toq, c5538i.f30940n, c5538i.f72926f7l8);
            } catch (C5539k e2) {
                throw new fn3e(e2);
            } catch (zy e3) {
                throw new fn3e(e3);
            }
        }

        @Override // com.xiaomi.accountsdk.request.zurt
        /* JADX INFO: renamed from: q */
        public String mo19043q() {
            return "GET";
        }
    }

    /* JADX INFO: compiled from: PassportSimpleRequest.java */
    public static class toq extends zurt {
        public toq(C5538i c5538i) {
            super(c5538i);
        }

        @Override // com.xiaomi.accountsdk.request.t8r
        /* JADX INFO: renamed from: k */
        public wvg.C5555y mo18922k() throws fn3e, IOException {
            try {
                C5538i c5538i = this.f30999k;
                return C5550t.ld6(c5538i.f30938g, c5538i.f30939k, c5538i.f72927toq, c5538i.f72928zy, c5538i.f30941q, c5538i.f30940n, c5538i.f72926f7l8);
            } catch (C5539k e2) {
                throw new fn3e(e2);
            } catch (zy e3) {
                throw new fn3e(e3);
            }
        }

        @Override // com.xiaomi.accountsdk.request.zurt
        /* JADX INFO: renamed from: q */
        public String mo19043q() {
            return "POST";
        }
    }

    protected zurt(C5538i c5538i) {
        if (c5538i == null) {
            throw new IllegalArgumentException("arguments can't be null");
        }
        this.f30999k = c5538i;
    }

    /* JADX INFO: renamed from: n */
    public boolean m19042n() {
        String str = this.f30999k.f30938g;
        return str != null && str.toLowerCase().startsWith("https");
    }

    /* JADX INFO: renamed from: q */
    public abstract String mo19043q();

    public zurt zy() {
        C5538i c5538iM18940k = this.f30999k.m18940k();
        if (this instanceof C5558k) {
            return new C5558k(c5538iM18940k);
        }
        if (this instanceof toq) {
            return new toq(c5538iM18940k);
        }
        throw new IllegalStateException("");
    }
}
