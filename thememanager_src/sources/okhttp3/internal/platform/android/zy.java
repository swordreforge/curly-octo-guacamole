package okhttp3.internal.platform.android;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.nn86;
import kotlin.jvm.internal.d2ok;
import kotlin.text.fti;
import kotlin.text.gvn7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okhttp3.C7529t;
import okhttp3.internal.concurrent.C7445q;
import okhttp3.internal.http2.C7474n;

/* JADX INFO: compiled from: AndroidLog.kt */
/* JADX INFO: loaded from: classes4.dex */
@b7.zy
public final class zy {

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private static final Map<String, String> f43358q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f93999toq = 4000;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final zy f43357k = new zy();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private static final CopyOnWriteArraySet<Logger> f94000zy = new CopyOnWriteArraySet<>();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r1 = C7529t.class.getPackage();
        String name = r1 != null ? r1.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = C7529t.class.getName();
        d2ok.kja0(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = C7474n.class.getName();
        d2ok.kja0(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = C7445q.class.getName();
        d2ok.kja0(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f43358q = nn86.mu(linkedHashMap);
    }

    private zy() {
    }

    /* JADX INFO: renamed from: q */
    private final String m27227q(String str) {
        String str2 = f43358q.get(str);
        return str2 == null ? gvn7.fjxh(str, 23) : str2;
    }

    private final void zy(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (f94000zy.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(C7490q.f43349k);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m27228k(@InterfaceC7396q String loggerName, int i2, @InterfaceC7396q String message, @InterfaceC7395n Throwable th) {
        int iMin;
        d2ok.m23075h(loggerName, "loggerName");
        d2ok.m23075h(message, "message");
        String strM27227q = m27227q(loggerName);
        if (Log.isLoggable(strM27227q, i2)) {
            if (th != null) {
                message = message + '\n' + Log.getStackTraceString(th);
            }
            int i3 = 0;
            int length = message.length();
            while (i3 < length) {
                int iSc = fti.sc(message, '\n', i3, false, 4, null);
                if (iSc == -1) {
                    iSc = length;
                }
                while (true) {
                    iMin = Math.min(iSc, i3 + 4000);
                    String strSubstring = message.substring(i3, iMin);
                    d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i2, strM27227q, strSubstring);
                    if (iMin >= iSc) {
                        break;
                    } else {
                        i3 = iMin;
                    }
                }
                i3 = iMin + 1;
            }
        }
    }

    public final void toq() {
        for (Map.Entry<String, String> entry : f43358q.entrySet()) {
            zy(entry.getKey(), entry.getValue());
        }
    }
}
