package okhttp3.internal.platform.android;

import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: renamed from: okhttp3.internal.platform.android.n */
/* JADX INFO: compiled from: AndroidLog.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class C7488n {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int toq(LogRecord logRecord) {
        if (logRecord.getLevel().intValue() > Level.INFO.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
    }
}
