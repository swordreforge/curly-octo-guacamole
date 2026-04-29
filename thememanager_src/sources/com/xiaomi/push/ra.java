package com.xiaomi.push;

import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes3.dex */
final class ra {

    /* JADX INFO: renamed from: com.xiaomi.push.ra$k */
    static class C5893k {

        /* JADX INFO: renamed from: k */
        kx3 f33587k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        String f73548toq;

        C5893k() {
        }
    }

    /* JADX INFO: renamed from: k */
    static C5893k m21427k(Exception exc) {
        toq(exc);
        boolean z2 = exc instanceof ovdh;
        Throwable thM21371a = exc;
        if (z2) {
            ovdh ovdhVar = (ovdh) exc;
            thM21371a = exc;
            if (ovdhVar.m21371a() != null) {
                thM21371a = ovdhVar.m21371a();
            }
        }
        C5893k c5893k = new C5893k();
        String message = thM21371a.getMessage();
        if (thM21371a.getCause() != null) {
            message = thM21371a.getCause().getMessage();
        }
        String str = thM21371a.getClass().getSimpleName() + ":" + message;
        int iM20827k = f1bi.m20827k(thM21371a);
        if (iM20827k != 0) {
            c5893k.f33587k = kx3.m21147a(kx3.GSLB_REQUEST_SUCCESS.m21148a() + iM20827k);
        }
        if (c5893k.f33587k == null) {
            c5893k.f33587k = kx3.GSLB_TCP_ERR_OTHER;
        }
        if (c5893k.f33587k == kx3.GSLB_TCP_ERR_OTHER) {
            c5893k.f73548toq = str;
        }
        return c5893k;
    }

    /* JADX INFO: renamed from: n */
    static C5893k m21428n(Exception exc) {
        toq(exc);
        boolean z2 = exc instanceof ovdh;
        Throwable thM21371a = exc;
        if (z2) {
            ovdh ovdhVar = (ovdh) exc;
            thM21371a = exc;
            if (ovdhVar.m21371a() != null) {
                thM21371a = ovdhVar.m21371a();
            }
        }
        C5893k c5893k = new C5893k();
        String message = thM21371a.getMessage();
        int iM20827k = f1bi.m20827k(thM21371a);
        String str = thM21371a.getClass().getSimpleName() + ":" + message;
        if (iM20827k == 105) {
            c5893k.f33587k = kx3.CHANNEL_TCP_READTIMEOUT;
        } else if (iM20827k == 199) {
            c5893k.f33587k = kx3.CHANNEL_TCP_ERR;
        } else if (iM20827k == 499) {
            c5893k.f33587k = kx3.CHANNEL_BOSH_EXCEPTION;
            if (message.startsWith("Terminal binding condition encountered: item-not-found")) {
                c5893k.f33587k = kx3.CHANNEL_BOSH_ITEMNOTFIND;
            }
        } else if (iM20827k == 109) {
            c5893k.f33587k = kx3.CHANNEL_TCP_CONNRESET;
        } else if (iM20827k != 110) {
            c5893k.f33587k = kx3.CHANNEL_XMPPEXCEPTION;
        } else {
            c5893k.f33587k = kx3.CHANNEL_TCP_BROKEN_PIPE;
        }
        kx3 kx3Var = c5893k.f33587k;
        if (kx3Var == kx3.CHANNEL_TCP_ERR || kx3Var == kx3.CHANNEL_XMPPEXCEPTION || kx3Var == kx3.CHANNEL_BOSH_EXCEPTION) {
            c5893k.f73548toq = str;
        }
        return c5893k;
    }

    /* JADX INFO: renamed from: q */
    static C5893k m21429q(Exception exc) {
        toq(exc);
        boolean z2 = exc instanceof ovdh;
        Throwable thM21371a = exc;
        if (z2) {
            ovdh ovdhVar = (ovdh) exc;
            thM21371a = exc;
            if (ovdhVar.m21371a() != null) {
                thM21371a = ovdhVar.m21371a();
            }
        }
        C5893k c5893k = new C5893k();
        String message = thM21371a.getMessage();
        if (thM21371a.getCause() != null) {
            message = thM21371a.getCause().getMessage();
        }
        int iM20827k = f1bi.m20827k(thM21371a);
        String str = thM21371a.getClass().getSimpleName() + ":" + message;
        if (iM20827k == 105) {
            c5893k.f33587k = kx3.BIND_TCP_READ_TIMEOUT;
        } else if (iM20827k == 199) {
            c5893k.f33587k = kx3.BIND_TCP_ERR;
        } else if (iM20827k == 499) {
            c5893k.f33587k = kx3.BIND_BOSH_ERR;
            if (message.startsWith("Terminal binding condition encountered: item-not-found")) {
                c5893k.f33587k = kx3.BIND_BOSH_ITEM_NOT_FOUND;
            }
        } else if (iM20827k == 109) {
            c5893k.f33587k = kx3.BIND_TCP_CONNRESET;
        } else if (iM20827k != 110) {
            c5893k.f33587k = kx3.BIND_XMPP_ERR;
        } else {
            c5893k.f33587k = kx3.BIND_TCP_BROKEN_PIPE;
        }
        kx3 kx3Var = c5893k.f33587k;
        if (kx3Var == kx3.BIND_TCP_ERR || kx3Var == kx3.BIND_XMPP_ERR || kx3Var == kx3.BIND_BOSH_ERR) {
            c5893k.f73548toq = str;
        }
        return c5893k;
    }

    private static void toq(Exception exc) {
        exc.getClass();
    }

    static C5893k zy(Exception exc) {
        Throwable cause;
        toq(exc);
        boolean z2 = exc instanceof ovdh;
        Throwable thM21371a = exc;
        if (z2) {
            ovdh ovdhVar = (ovdh) exc;
            thM21371a = exc;
            if (ovdhVar.m21371a() != null) {
                thM21371a = ovdhVar.m21371a();
            }
        }
        C5893k c5893k = new C5893k();
        String message = thM21371a.getMessage();
        if (thM21371a.getCause() != null) {
            message = thM21371a.getCause().getMessage();
        }
        int iM20827k = f1bi.m20827k(thM21371a);
        String str = thM21371a.getClass().getSimpleName() + ":" + message;
        if (iM20827k != 0) {
            kx3 kx3VarM21147a = kx3.m21147a(kx3.CONN_SUCCESS.m21148a() + iM20827k);
            c5893k.f33587k = kx3VarM21147a;
            if (kx3VarM21147a == kx3.CONN_BOSH_ERR && (cause = thM21371a.getCause()) != null && (cause instanceof UnknownHostException)) {
                c5893k.f33587k = kx3.CONN_BOSH_UNKNOWNHOST;
            }
        } else {
            c5893k.f33587k = kx3.CONN_XMPP_ERR;
        }
        kx3 kx3Var = c5893k.f33587k;
        if (kx3Var == kx3.CONN_TCP_ERR_OTHER || kx3Var == kx3.CONN_XMPP_ERR || kx3Var == kx3.CONN_BOSH_ERR) {
            c5893k.f73548toq = str;
        }
        return c5893k;
    }
}
