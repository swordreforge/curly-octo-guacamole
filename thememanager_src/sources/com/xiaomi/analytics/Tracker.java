package com.xiaomi.analytics;

import android.text.TextUtils;
import com.xiaomi.analytics.LogEvent;

/* JADX INFO: loaded from: classes3.dex */
public class Tracker extends BaseLogger {
    Tracker(String str) {
        super(str);
    }

    @Override // com.xiaomi.analytics.BaseLogger
    public /* bridge */ /* synthetic */ void endSession() {
        super.endSession();
    }

    @Override // com.xiaomi.analytics.BaseLogger
    public /* bridge */ /* synthetic */ void startSession() {
        super.startSession();
    }

    public void track(Action action) {
        if (action != null) {
            if (action instanceof AdAction) {
                log(LogEvent.create(LogEvent.LogType.TYPE_AD).setLogContent(action.getContent()).setExtraInfo(action.getExtra()));
            } else {
                log(LogEvent.create().setLogContent(action.getContent()).setExtraInfo(action.getExtra()));
            }
        }
    }

    public void track(Action action, LogEvent.IdType idType) {
        if (action != null) {
            if (action instanceof AdAction) {
                log(LogEvent.create(LogEvent.LogType.TYPE_AD, idType).setLogContent(action.getContent()).setExtraInfo(action.getExtra()));
            } else {
                log(LogEvent.create(idType).setLogContent(action.getContent()).setExtraInfo(action.getExtra()));
            }
        }
    }

    public void track(String str, Action action) {
        if (action == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (action instanceof AdAction) {
            log(str, LogEvent.create(LogEvent.LogType.TYPE_AD).setLogContent(action.getContent()).setExtraInfo(action.getExtra()));
        } else {
            log(str, LogEvent.create().setLogContent(action.getContent()).setExtraInfo(action.getExtra()));
        }
    }

    public void track(String str, Action action, LogEvent.IdType idType) {
        if (action == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (action instanceof AdAction) {
            log(str, LogEvent.create(LogEvent.LogType.TYPE_AD, idType).setLogContent(action.getContent()).setExtraInfo(action.getExtra()));
        } else {
            log(str, LogEvent.create(idType).setLogContent(action.getContent()).setExtraInfo(action.getExtra()));
        }
    }
}
