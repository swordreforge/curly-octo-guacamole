package okhttp3.internal.platform.android;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: okhttp3.internal.platform.android.q */
/* JADX INFO: compiled from: AndroidLog.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class C7490q extends Handler {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C7490q f43349k = new C7490q();

    private C7490q() {
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(@InterfaceC7396q LogRecord record) {
        d2ok.m23075h(record, "record");
        zy zyVar = zy.f43357k;
        String loggerName = record.getLoggerName();
        d2ok.kja0(loggerName, "record.loggerName");
        int qVar = C7488n.toq(record);
        String message = record.getMessage();
        d2ok.kja0(message, "record.message");
        zyVar.m27228k(loggerName, qVar, message, record.getThrown());
    }
}
