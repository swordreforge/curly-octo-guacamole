package miuix.animation.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import com.market.sdk.reflect.toq;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public class LogUtils {
    private static final String COMMA = ", ";
    public static final boolean MORE_LOG_ENABLE = false;
    private static volatile boolean sIsLogEnabled;
    private static final Handler sLogHandler;
    private static final Map<Integer, String> sTag;
    private static final HandlerThread sThread;

    static {
        HandlerThread handlerThread = new HandlerThread("LogThread");
        sThread = handlerThread;
        sTag = new ConcurrentHashMap();
        handlerThread.start();
        sLogHandler = new Handler(handlerThread.getLooper()) { // from class: miuix.animation.utils.LogUtils.1
            @Override // android.os.Handler
            public void handleMessage(@lvui Message message) {
                if (message.what == 0) {
                    Log.d((String) LogUtils.sTag.get(Integer.valueOf(message.arg1)), "thread log, " + ((String) message.obj));
                }
                message.obj = null;
            }
        };
    }

    private LogUtils() {
    }

    public static void debug(String str, Object... objArr) {
        if (sIsLogEnabled) {
            if (objArr.length <= 0) {
                Log.i(CommonUtils.TAG, str);
                return;
            }
            StringBuilder sb = new StringBuilder(COMMA);
            int length = sb.length();
            for (Object obj : objArr) {
                if (sb.length() > length) {
                    sb.append(COMMA);
                }
                sb.append(obj);
            }
            Log.i(CommonUtils.TAG, str + sb.toString());
        }
    }

    public static void getLogEnableInfo() {
        String str = "";
        try {
            String prop = CommonUtils.readProp("log.tag.folme.level");
            if (prop != null) {
                str = prop;
            }
        } catch (Exception e2) {
            Log.i(CommonUtils.TAG, "can not access property log.tag.folme.level, no log", e2);
        }
        sIsLogEnabled = str.equals(toq.f28135s);
    }

    public static String getStackTrace(int i2) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        return Arrays.toString(Arrays.asList(stackTrace).subList(3, Math.min(stackTrace.length, i2 + 4)).toArray());
    }

    public static boolean isLogEnabled() {
        return sIsLogEnabled;
    }

    public static void logThread(String str, String str2) {
        Message messageObtainMessage = sLogHandler.obtainMessage(0);
        messageObtainMessage.obj = str2;
        int iHashCode = str.hashCode();
        messageObtainMessage.arg1 = iHashCode;
        sTag.put(Integer.valueOf(iHashCode), str);
        messageObtainMessage.sendToTarget();
    }
}
