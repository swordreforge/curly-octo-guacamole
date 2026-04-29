package com.bumptech.glide.load.model;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.model.y */
/* JADX INFO: compiled from: GlideUrl.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3084y implements com.bumptech.glide.load.f7l8 {

    /* JADX INFO: renamed from: p */
    private static final String f18653p = "@#&=*+-_.,:!?()/~'%;$";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @dd
    private URL f62860f7l8;

    /* JADX INFO: renamed from: g */
    @dd
    private String f18654g;

    /* JADX INFO: renamed from: n */
    @dd
    private final String f18655n;

    /* JADX INFO: renamed from: q */
    @dd
    private final URL f18656q;

    /* JADX INFO: renamed from: s */
    private int f18657s;

    /* JADX INFO: renamed from: y */
    @dd
    private volatile byte[] f18658y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final InterfaceC3071s f62861zy;

    public C3084y(URL url) {
        this(url, InterfaceC3071s.f62850toq);
    }

    private URL f7l8() throws MalformedURLException {
        if (this.f62860f7l8 == null) {
            this.f62860f7l8 = new URL(m10919g());
        }
        return this.f62860f7l8;
    }

    /* JADX INFO: renamed from: g */
    private String m10919g() {
        if (TextUtils.isEmpty(this.f18654g)) {
            String string = this.f18655n;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) com.bumptech.glide.util.qrj.m11262q(this.f18656q)).toString();
            }
            this.f18654g = Uri.encode(string, f18653p);
        }
        return this.f18654g;
    }

    /* JADX INFO: renamed from: q */
    private byte[] m10920q() {
        if (this.f18658y == null) {
            this.f18658y = zy().getBytes(com.bumptech.glide.load.f7l8.f62824toq);
        }
        return this.f18658y;
    }

    @Override // com.bumptech.glide.load.f7l8
    public boolean equals(Object obj) {
        if (!(obj instanceof C3084y)) {
            return false;
        }
        C3084y c3084y = (C3084y) obj;
        return zy().equals(c3084y.zy()) && this.f62861zy.equals(c3084y.f62861zy);
    }

    @Override // com.bumptech.glide.load.f7l8
    public int hashCode() {
        if (this.f18657s == 0) {
            int iHashCode = zy().hashCode();
            this.f18657s = iHashCode;
            this.f18657s = (iHashCode * 31) + this.f62861zy.hashCode();
        }
        return this.f18657s;
    }

    /* JADX INFO: renamed from: n */
    public Map<String, String> m10921n() {
        return this.f62861zy.mo10875k();
    }

    /* JADX INFO: renamed from: s */
    public URL m10922s() throws MalformedURLException {
        return f7l8();
    }

    public String toString() {
        return zy();
    }

    @Override // com.bumptech.glide.load.f7l8
    public void toq(@lvui MessageDigest messageDigest) {
        messageDigest.update(m10920q());
    }

    /* JADX INFO: renamed from: y */
    public String m10923y() {
        return m10919g();
    }

    public String zy() {
        String str = this.f18655n;
        return str != null ? str : ((URL) com.bumptech.glide.util.qrj.m11262q(this.f18656q)).toString();
    }

    public C3084y(String str) {
        this(str, InterfaceC3071s.f62850toq);
    }

    public C3084y(URL url, InterfaceC3071s interfaceC3071s) {
        this.f18656q = (URL) com.bumptech.glide.util.qrj.m11262q(url);
        this.f18655n = null;
        this.f62861zy = (InterfaceC3071s) com.bumptech.glide.util.qrj.m11262q(interfaceC3071s);
    }

    public C3084y(String str, InterfaceC3071s interfaceC3071s) {
        this.f18656q = null;
        this.f18655n = com.bumptech.glide.util.qrj.toq(str);
        this.f62861zy = (InterfaceC3071s) com.bumptech.glide.util.qrj.m11262q(interfaceC3071s);
    }
}
