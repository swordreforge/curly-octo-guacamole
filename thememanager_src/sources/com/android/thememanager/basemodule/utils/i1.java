package com.android.thememanager.basemodule.utils;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: WebAddress.java */
/* JADX INFO: loaded from: classes.dex */
public class i1 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    static final int f57765f7l8 = 2;

    /* JADX INFO: renamed from: g */
    static final int f10336g = 1;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    static Pattern f57766ld6 = Pattern.compile("(?:(http|https|file)\\:\\/\\/)?(?:([-A-Za-z0-9$_.+!*'(),;?&=]+(?:\\:[-A-Za-z0-9$_.+!*'(),;?&=]+)?)@)?([a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef%_-][a-zA-Z0-9 -\ud7ff豈-﷏ﷰ-\uffef%_\\.-]*|\\[[0-9a-fA-F:\\.]+\\])?(?:\\:([0-9]*))?(\\/?[^#]*)?.*", 2);

    /* JADX INFO: renamed from: p */
    static final int f10337p = 5;

    /* JADX INFO: renamed from: s */
    static final int f10338s = 4;

    /* JADX INFO: renamed from: y */
    static final int f10339y = 3;

    /* JADX INFO: renamed from: k */
    private String f10340k;

    /* JADX INFO: renamed from: n */
    private String f10341n;

    /* JADX INFO: renamed from: q */
    private String f10342q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private String f57767toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f57768zy;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.i1$k */
    /* JADX INFO: compiled from: WebAddress.java */
    public static class C1810k extends RuntimeException {
        public String response;

        C1810k(String response) {
            this.response = response;
        }
    }

    public i1(String address) throws C1810k {
        address.getClass();
        this.f10340k = "";
        this.f57767toq = "";
        this.f57768zy = -1;
        this.f10342q = "/";
        this.f10341n = "";
        Matcher matcher = f57766ld6.matcher(address);
        if (!matcher.matches()) {
            throw new C1810k("Bad address");
        }
        String strGroup = matcher.group(1);
        if (strGroup != null) {
            this.f10340k = strGroup.toLowerCase(Locale.ROOT);
        }
        String strGroup2 = matcher.group(2);
        if (strGroup2 != null) {
            this.f10341n = strGroup2;
        }
        String strGroup3 = matcher.group(3);
        if (strGroup3 != null) {
            this.f57767toq = strGroup3;
        }
        String strGroup4 = matcher.group(4);
        if (strGroup4 != null && strGroup4.length() > 0) {
            try {
                this.f57768zy = Integer.parseInt(strGroup4);
            } catch (NumberFormatException unused) {
                throw new C1810k("Bad port");
            }
        }
        String strGroup5 = matcher.group(5);
        if (strGroup5 != null && strGroup5.length() > 0) {
            if (strGroup5.charAt(0) == '/') {
                this.f10342q = strGroup5;
            } else {
                this.f10342q = "/" + strGroup5;
            }
        }
        if (this.f57768zy == 443 && this.f10340k.equals("")) {
            this.f10340k = "https";
        } else if (this.f57768zy == -1) {
            if (this.f10340k.equals("https")) {
                this.f57768zy = 443;
            } else {
                this.f57768zy = 80;
            }
        }
        if (this.f10340k.equals("")) {
            this.f10340k = "http";
        }
    }

    public void f7l8(String host) {
        this.f57767toq = host;
    }

    /* JADX INFO: renamed from: g */
    public void m7095g(String authInfo) {
        this.f10341n = authInfo;
    }

    /* JADX INFO: renamed from: k */
    public String m7096k() {
        return this.f10341n;
    }

    /* JADX INFO: renamed from: n */
    public String m7097n() {
        return this.f10340k;
    }

    /* JADX INFO: renamed from: p */
    public void m7098p(String scheme) {
        this.f10340k = scheme;
    }

    /* JADX INFO: renamed from: q */
    public int m7099q() {
        return this.f57768zy;
    }

    /* JADX INFO: renamed from: s */
    public void m7100s(int port) {
        this.f57768zy = port;
    }

    public String toString() {
        String str;
        String str2 = "";
        if ((this.f57768zy == 443 || !this.f10340k.equals("https")) && (this.f57768zy == 80 || !this.f10340k.equals("http"))) {
            str = "";
        } else {
            str = ":" + Integer.toString(this.f57768zy);
        }
        if (this.f10341n.length() > 0) {
            str2 = this.f10341n + "@";
        }
        return this.f10340k + "://" + str2 + this.f57767toq + str + this.f10342q;
    }

    public String toq() {
        return this.f57767toq;
    }

    /* JADX INFO: renamed from: y */
    public void m7101y(String path) {
        this.f10342q = path;
    }

    public String zy() {
        return this.f10342q;
    }
}
