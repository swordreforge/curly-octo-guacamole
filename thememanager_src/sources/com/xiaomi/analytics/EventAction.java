package com.xiaomi.analytics;

import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.analytics.internal.util.C5609k;

/* JADX INFO: loaded from: classes3.dex */
public class EventAction extends Action {
    protected static final String EVENT_DEFAULT_PARAM = "_event_default_param_";
    private String mEventName;

    public EventAction(String str) {
        this(str, null);
    }

    public EventAction(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            Log.w(C5609k.m19240k("EventAction"), "eventName is null when constructing EventAction!");
        }
        this.mEventName = str;
        addEventId(str);
        if (str2 == null || TextUtils.isEmpty(str2)) {
            return;
        }
        addParam(EVENT_DEFAULT_PARAM, str2);
    }
}
