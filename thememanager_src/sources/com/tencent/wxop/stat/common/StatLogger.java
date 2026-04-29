package com.tencent.wxop.stat.common;

import android.util.Log;
import com.tencent.wxop.stat.InterfaceC5413g;
import com.tencent.wxop.stat.StatConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class StatLogger {

    /* JADX INFO: renamed from: a */
    private String f30089a;

    /* JADX INFO: renamed from: b */
    private boolean f30090b;

    /* JADX INFO: renamed from: c */
    private int f30091c;

    public StatLogger() {
        this.f30089a = "default";
        this.f30090b = true;
        this.f30091c = 2;
    }

    public StatLogger(String str) {
        this.f30090b = true;
        this.f30091c = 2;
        this.f30089a = str;
    }

    /* JADX INFO: renamed from: a */
    private String m18373a() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null) {
            return null;
        }
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!stackTraceElement.isNativeMethod() && !stackTraceElement.getClassName().equals(Thread.class.getName()) && !stackTraceElement.getClassName().equals(StatLogger.class.getName())) {
                return "[" + Thread.currentThread().getName() + "(" + Thread.currentThread().getId() + "): " + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + "]";
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m18374d(Object obj) {
        if (isDebugEnable()) {
            debug(obj);
        }
    }

    public final void debug(Object obj) {
        String string;
        if (this.f30091c <= 3) {
            String strM18373a = m18373a();
            if (strM18373a == null) {
                string = obj.toString();
            } else {
                string = strM18373a + " - " + obj;
            }
            Log.d(this.f30089a, string);
            InterfaceC5413g customLogger = StatConfig.getCustomLogger();
            if (customLogger != null) {
                customLogger.m18497e(string);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m18375e(Object obj) {
        if (isDebugEnable()) {
            error(obj);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m18376e(Throwable th) {
        if (isDebugEnable()) {
            error(th);
        }
    }

    public final void error(Object obj) {
        String string;
        if (this.f30091c <= 6) {
            String strM18373a = m18373a();
            if (strM18373a == null) {
                string = obj.toString();
            } else {
                string = strM18373a + " - " + obj;
            }
            Log.e(this.f30089a, string);
            InterfaceC5413g customLogger = StatConfig.getCustomLogger();
            if (customLogger != null) {
                customLogger.m18496d(string);
            }
        }
    }

    public final void error(Throwable th) {
        if (this.f30091c <= 6) {
            Log.e(this.f30089a, "", th);
            InterfaceC5413g customLogger = StatConfig.getCustomLogger();
            if (customLogger != null) {
                customLogger.m18496d(th);
            }
        }
    }

    public final int getLogLevel() {
        return this.f30091c;
    }

    /* JADX INFO: renamed from: i */
    public final void m18377i(Object obj) {
        if (isDebugEnable()) {
            info(obj);
        }
    }

    public final void info(Object obj) {
        String string;
        if (this.f30091c <= 4) {
            String strM18373a = m18373a();
            if (strM18373a == null) {
                string = obj.toString();
            } else {
                string = strM18373a + " - " + obj;
            }
            Log.i(this.f30089a, string);
            InterfaceC5413g customLogger = StatConfig.getCustomLogger();
            if (customLogger != null) {
                customLogger.m18493a(string);
            }
        }
    }

    public final boolean isDebugEnable() {
        return this.f30090b;
    }

    public final void setDebugEnable(boolean z2) {
        this.f30090b = z2;
    }

    public final void setLogLevel(int i2) {
        this.f30091c = i2;
    }

    public final void setTag(String str) {
        this.f30089a = str;
    }

    /* JADX INFO: renamed from: v */
    public final void m18378v(Object obj) {
        if (isDebugEnable()) {
            verbose(obj);
        }
    }

    public final void verbose(Object obj) {
        String string;
        if (this.f30091c <= 2) {
            String strM18373a = m18373a();
            if (strM18373a == null) {
                string = obj.toString();
            } else {
                string = strM18373a + " - " + obj;
            }
            Log.v(this.f30089a, string);
            InterfaceC5413g customLogger = StatConfig.getCustomLogger();
            if (customLogger != null) {
                customLogger.m18494b(string);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m18379w(Object obj) {
        if (isDebugEnable()) {
            warn(obj);
        }
    }

    public final void warn(Object obj) {
        String string;
        if (this.f30091c <= 5) {
            String strM18373a = m18373a();
            if (strM18373a == null) {
                string = obj.toString();
            } else {
                string = strM18373a + " - " + obj;
            }
            Log.w(this.f30089a, string);
            InterfaceC5413g customLogger = StatConfig.getCustomLogger();
            if (customLogger != null) {
                customLogger.m18495c(string);
            }
        }
    }
}
