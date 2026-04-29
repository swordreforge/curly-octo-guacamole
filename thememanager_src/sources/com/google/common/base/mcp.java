package com.google.common.base;

import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: Platform.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
final class mcp {

    /* JADX INFO: renamed from: k */
    private static final Logger f25682k = Logger.getLogger(mcp.class.getName());

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final InterfaceC4273t f68104toq = m15408n();

    /* JADX INFO: compiled from: Platform.java */
    private static final class toq implements InterfaceC4273t {
        private toq() {
        }

        @Override // com.google.common.base.InterfaceC4273t
        /* JADX INFO: renamed from: k */
        public AbstractC4279y mo15413k(String str) {
            return new zurt(Pattern.compile(str));
        }

        @Override // com.google.common.base.InterfaceC4273t
        public boolean toq() {
            return true;
        }
    }

    private mcp() {
    }

    static String f7l8(@NullableDecl String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: g */
    private static void m15406g(ServiceConfigurationError serviceConfigurationError) {
        f25682k.log(Level.WARNING, "Error loading regex compiler, falling back to next option", (Throwable) serviceConfigurationError);
    }

    /* JADX INFO: renamed from: k */
    static AbstractC4279y m15407k(String str) {
        jk.a9(str);
        return f68104toq.mo15413k(str);
    }

    static long ld6() {
        return System.nanoTime();
    }

    /* JADX INFO: renamed from: n */
    private static InterfaceC4273t m15408n() {
        return new toq();
    }

    /* JADX INFO: renamed from: p */
    static boolean m15409p(@NullableDecl String str) {
        return str == null || str.isEmpty();
    }

    /* JADX INFO: renamed from: q */
    static <T extends Enum<T>> o1t<T> m15410q(Class<T> cls, String str) {
        WeakReference<? extends Enum<?>> weakReference = ld6.m15403k(cls).get(str);
        return weakReference == null ? o1t.absent() : o1t.of(cls.cast(weakReference.get()));
    }

    /* JADX INFO: renamed from: s */
    static AbstractC4265n m15411s(AbstractC4265n abstractC4265n) {
        return abstractC4265n.eqxt();
    }

    static String toq(@NullableDecl String str) {
        if (m15409p(str)) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: y */
    static boolean m15412y() {
        return f68104toq.toq();
    }

    static String zy(double d2) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d2));
    }
}
