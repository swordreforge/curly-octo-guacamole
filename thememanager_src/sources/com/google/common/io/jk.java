package com.google.common.io;

import com.google.common.collect.wlev;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: Resources.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
@wlev.zy
public final class jk {

    /* JADX INFO: renamed from: com.google.common.io.jk$k */
    /* JADX INFO: compiled from: Resources.java */
    static class C4691k implements zurt<List<String>> {

        /* JADX INFO: renamed from: k */
        final List<String> f27067k = wlev.cdj();

        C4691k() {
        }

        @Override // com.google.common.io.zurt
        /* JADX INFO: renamed from: k */
        public boolean mo16408k(String str) {
            this.f27067k.add(str);
            return true;
        }

        @Override // com.google.common.io.zurt
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public List<String> getResult() {
            return this.f27067k;
        }
    }

    /* JADX INFO: compiled from: Resources.java */
    private static final class toq extends f7l8 {

        /* JADX INFO: renamed from: k */
        private final URL f27068k;

        /* synthetic */ toq(URL url, C4691k c4691k) {
            this(url);
        }

        @Override // com.google.common.io.f7l8
        public InputStream qrj() throws IOException {
            return this.f27068k.openStream();
        }

        public String toString() {
            return "Resources.asByteSource(" + this.f27068k + ")";
        }

        private toq(URL url) {
            this.f27068k = (URL) com.google.common.base.jk.a9(url);
        }
    }

    private jk() {
    }

    public static List<String> f7l8(URL url, Charset charset) throws IOException {
        return (List) m16402g(url, charset, new C4691k());
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: g */
    public static <T> T m16402g(URL url, Charset charset, zurt<T> zurtVar) throws IOException {
        return (T) toq(url, charset).cdj(zurtVar);
    }

    /* JADX INFO: renamed from: k */
    public static f7l8 m16403k(URL url) {
        return new toq(url, null);
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: n */
    public static URL m16404n(String str) {
        URL resource = ((ClassLoader) com.google.common.base.fu4.m15351k(Thread.currentThread().getContextClassLoader(), jk.class.getClassLoader())).getResource(str);
        com.google.common.base.jk.fn3e(resource != null, "resource %s not found.", str);
        return resource;
    }

    /* JADX INFO: renamed from: q */
    public static URL m16405q(Class<?> cls, String str) {
        URL resource = cls.getResource(str);
        com.google.common.base.jk.m15391z(resource != null, "resource %s relative to %s not found.", str, cls.getName());
        return resource;
    }

    /* JADX INFO: renamed from: s */
    public static String m16406s(URL url, Charset charset) throws IOException {
        return toq(url, charset).n7h();
    }

    public static ld6 toq(URL url, Charset charset) {
        return m16403k(url).mo16389k(charset);
    }

    /* JADX INFO: renamed from: y */
    public static byte[] m16407y(URL url) throws IOException {
        return m16403k(url).kja0();
    }

    public static void zy(URL url, OutputStream outputStream) throws Throwable {
        m16403k(url).f7l8(outputStream);
    }
}
