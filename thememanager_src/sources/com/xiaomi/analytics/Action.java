package com.xiaomi.analytics;

import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.analytics.internal.util.C5609k;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Action {
    protected static final String ACTION = "_action_";
    protected static final String CATEGORY = "_category_";
    protected static final String EVENT_ID = "_event_id_";
    protected static final String LABEL = "_label_";
    private static final String TAG = "Action";
    protected static final String VALUE = "_value_";
    private static Set<String> sKeywords;
    private JSONObject mContent = new JSONObject();
    private JSONObject mExtra = new JSONObject();

    static {
        HashSet hashSet = new HashSet();
        sKeywords = hashSet;
        hashSet.add(EVENT_ID);
        sKeywords.add(CATEGORY);
        sKeywords.add(ACTION);
        sKeywords.add(LABEL);
        sKeywords.add(VALUE);
    }

    private void ensureKey(String str) {
        if (TextUtils.isEmpty(str) || !sKeywords.contains(str)) {
            return;
        }
        throw new IllegalArgumentException("this key " + str + " is built-in, please pick another key.");
    }

    void addContent(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.mContent.put(str, i2);
        } catch (Exception e2) {
            Log.e(C5609k.m19240k(TAG), "addContent int value e", e2);
        }
    }

    protected Action addEventId(String str) {
        addContent(EVENT_ID, str);
        return this;
    }

    void addExtra(String str, String str2) {
        try {
            this.mExtra.put(str, str2);
        } catch (Exception e2) {
            Log.e(C5609k.m19240k(TAG), "addExtra e", e2);
        }
    }

    public Action addParam(String str, JSONObject jSONObject) {
        ensureKey(str);
        addContent(str, jSONObject);
        return this;
    }

    final JSONObject getContent() {
        return this.mContent;
    }

    final JSONObject getExtra() {
        return this.mExtra;
    }

    public Action addParam(String str, int i2) {
        ensureKey(str);
        addContent(str, i2);
        return this;
    }

    void addContent(String str, long j2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.mContent.put(str, j2);
        } catch (Exception e2) {
            Log.e(C5609k.m19240k(TAG), "addContent long value e", e2);
        }
    }

    public Action addParam(String str, long j2) {
        ensureKey(str);
        addContent(str, j2);
        return this;
    }

    void addContent(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.mContent.put(str, obj);
        } catch (Exception e2) {
            Log.e(C5609k.m19240k(TAG), "addContent Object value e", e2);
        }
    }

    public Action addParam(String str, String str2) {
        ensureKey(str);
        addContent(str, str2);
        return this;
    }

    void addContent(JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String string = itKeys.next().toString();
                ensureKey(string);
                try {
                    this.mContent.put(string, jSONObject.get(string));
                } catch (Exception e2) {
                    Log.e(C5609k.m19240k(TAG), "addContent e", e2);
                }
            }
        }
    }
}
