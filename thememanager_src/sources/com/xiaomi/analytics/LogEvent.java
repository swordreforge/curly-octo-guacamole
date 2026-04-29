package com.xiaomi.analytics;

import android.util.Log;
import com.xiaomi.analytics.internal.util.C5609k;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class LogEvent {
    private static final int JSON_VERSION = 2;
    private static final String KEY_APPID = "appId";
    private static final String KEY_CONFIG_KEY = "configKey";
    private static final String KEY_EVENT_TIME = "eventTime";
    private static final String KEY_ID_TYPE = "idType";
    private static final String KEY_JSON_VER = "v";
    private static final String KEY_LOG_CONTENT = "content";
    private static final String KEY_LOG_EXTRA = "extra";
    private static final String KEY_LOG_TYPE = "logType";
    private static final String KEY_MODE_TYPE = "isBasicMode";
    private static final String KEY_SESSIONID = "sessionId";
    private static final String TAG = "LogEvent";
    private long mEventTime;
    private JSONObject mExtra;
    private IdType mIdType;
    private JSONObject mLogContent;
    private LogType mLogType;

    public enum IdType {
        TYPE_DEFAULT(0),
        TYPE_IMEI(1),
        TYPE_MAC(2),
        TYPE_ANDROID_ID(3),
        TYPE_AAID(4),
        TYPE_GAID(5),
        TYPE_GUID(6);

        private int mValue;

        IdType(int i2) {
            this.mValue = i2;
        }

        public int value() {
            return this.mValue;
        }
    }

    public enum LogType {
        TYPE_EVENT(0),
        TYPE_AD(1);

        private int mValue;

        LogType(int i2) {
            this.mValue = i2;
        }

        public int value() {
            return this.mValue;
        }

        public static LogType valueOf(int i2) {
            return i2 != 1 ? TYPE_EVENT : TYPE_AD;
        }
    }

    public LogEvent() {
        this.mLogType = LogType.TYPE_EVENT;
        this.mLogContent = new JSONObject();
        this.mExtra = new JSONObject();
        this.mIdType = IdType.TYPE_DEFAULT;
        this.mEventTime = System.currentTimeMillis();
    }

    public static LogEvent create() {
        return new LogEvent();
    }

    public String pack(String str, String str2, String str3, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(KEY_JSON_VER, 2);
            jSONObject.put("appId", str);
            jSONObject.put(KEY_SESSIONID, str3);
            jSONObject.put(KEY_CONFIG_KEY, str2);
            jSONObject.put("content", this.mLogContent.toString());
            jSONObject.put(KEY_EVENT_TIME, this.mEventTime);
            jSONObject.put(KEY_LOG_TYPE, this.mLogType.value());
            jSONObject.put("extra", this.mExtra.toString());
            jSONObject.put(KEY_ID_TYPE, this.mIdType.value());
            jSONObject.put(KEY_MODE_TYPE, z2);
        } catch (Exception e2) {
            Log.e(C5609k.m19240k(TAG), "pack e", e2);
        }
        return jSONObject.toString();
    }

    LogEvent setExtraInfo(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.mExtra = jSONObject;
        }
        return this;
    }

    LogEvent setLogContent(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.mLogContent = jSONObject;
        }
        return this;
    }

    public static LogEvent create(IdType idType) {
        return new LogEvent(idType);
    }

    public static LogEvent create(LogType logType) {
        return new LogEvent(logType);
    }

    public static LogEvent create(LogType logType, IdType idType) {
        return new LogEvent(logType, idType);
    }

    public LogEvent(LogType logType) {
        this.mLogType = LogType.TYPE_EVENT;
        this.mLogContent = new JSONObject();
        this.mExtra = new JSONObject();
        this.mIdType = IdType.TYPE_DEFAULT;
        this.mEventTime = System.currentTimeMillis();
        if (logType != null) {
            this.mLogType = logType;
        }
    }

    public LogEvent(IdType idType) {
        this.mLogType = LogType.TYPE_EVENT;
        this.mLogContent = new JSONObject();
        this.mExtra = new JSONObject();
        this.mIdType = IdType.TYPE_DEFAULT;
        this.mEventTime = System.currentTimeMillis();
        if (idType != null) {
            this.mIdType = idType;
        }
    }

    public LogEvent(LogType logType, IdType idType) {
        this.mLogType = LogType.TYPE_EVENT;
        this.mLogContent = new JSONObject();
        this.mExtra = new JSONObject();
        this.mIdType = IdType.TYPE_DEFAULT;
        this.mEventTime = System.currentTimeMillis();
        if (logType != null) {
            this.mLogType = logType;
        }
        if (idType != null) {
            this.mIdType = idType;
        }
    }
}
