package com.xiaomi.onetrack.p013b;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.onetrack.p014c.C5728b;
import com.xiaomi.onetrack.p017f.C5756a;
import com.xiaomi.onetrack.util.C5804p;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.xiaomi.onetrack.b.h */
/* JADX INFO: loaded from: classes3.dex */
public class C5720h {

    /* JADX INFO: renamed from: a */
    private static final String f31946a = "ConfigDbManager";

    /* JADX INFO: renamed from: e */
    private static final int f31947e = 100;

    /* JADX INFO: renamed from: b */
    private C5719g f31948b;

    /* JADX INFO: renamed from: c */
    private ConcurrentHashMap<String, C5724l> f31949c;

    /* JADX INFO: renamed from: d */
    private ConcurrentHashMap<String, Boolean> f31950d;

    /* JADX INFO: renamed from: com.xiaomi.onetrack.b.h$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        private static final C5720h f31951a = new C5720h(null);

        private a() {
        }
    }

    /* synthetic */ C5720h(RunnableC5721i runnableC5721i) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m19913b(ArrayList<C5724l> arrayList) throws Throwable {
        StringBuilder sb;
        SQLiteDatabase writableDatabase;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                writableDatabase = this.f31948b.getWritableDatabase();
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            writableDatabase.beginTransaction();
            for (C5724l c5724l : arrayList) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", c5724l.f31958a);
                contentValues.put("timestamp", Long.valueOf(c5724l.f31960c));
                JSONObject jSONObject = c5724l.f31962e;
                if (jSONObject != null) {
                    contentValues.put(C5719g.f31940e, jSONObject.toString());
                }
                String str = c5724l.f31961d;
                if (str != null) {
                    contentValues.put(C5719g.f31941f, str);
                }
                if (DatabaseUtils.queryNumEntries(writableDatabase, C5719g.f31937b, "app_id=?", new String[]{c5724l.f31958a}) > 0) {
                    C5804p.m20342a(f31946a, "database updated, row: " + writableDatabase.update(C5719g.f31937b, contentValues, "app_id=?", new String[]{c5724l.f31958a}));
                } else {
                    C5804p.m20342a(f31946a, "database inserted, row: " + writableDatabase.insert(C5719g.f31937b, null, contentValues));
                }
                this.f31950d.put(c5724l.f31958a, Boolean.TRUE);
            }
            writableDatabase.setTransactionSuccessful();
            try {
                writableDatabase.endTransaction();
            } catch (Exception e3) {
                e = e3;
                sb = new StringBuilder();
                sb.append("Exception while endTransaction:");
                sb.append(e);
                C5804p.m20347b(f31946a, sb.toString());
            }
        } catch (Exception e4) {
            e = e4;
            sQLiteDatabase = writableDatabase;
            C5804p.m20348b(f31946a, "updateToDb error: ", e);
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Exception e6) {
                    e = e6;
                    sb = new StringBuilder();
                    sb.append("Exception while endTransaction:");
                    sb.append(e);
                    C5804p.m20347b(f31946a, sb.toString());
                }
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = writableDatabase;
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Exception e7) {
                    C5804p.m20347b(f31946a, "Exception while endTransaction:" + e7);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    private JSONObject m19914c(String str, String str2) {
        JSONObject jSONObject;
        JSONArray jSONArrayOptJSONArray;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                if (this.f31949c.get(str) == null || (this.f31950d.containsKey(str) && this.f31950d.get(str).booleanValue())) {
                    m19924b(str);
                }
                C5724l c5724l = this.f31949c.get(str);
                if (c5724l != null && (jSONObject = c5724l.f31962e) != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray("events")) != null) {
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
                        if (TextUtils.equals(str2, jSONObject2.optString("event"))) {
                            if (C5804p.f32410a) {
                                C5804p.m20342a(f31946a, "getEventConfig:" + jSONObject2.toString());
                            }
                            return jSONObject2;
                        }
                    }
                }
            } catch (Exception e2) {
                Log.e(f31946a, "getEventConfig error: " + e2.toString());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public String m19926d(String str) {
        C5724l c5724lM19928f = m19928f(str);
        return c5724lM19928f != null ? c5724lM19928f.f31961d : "";
    }

    /* JADX INFO: renamed from: e */
    public int m19927e(String str) {
        JSONObject jSONObject;
        C5724l c5724lM19928f = m19928f(str);
        if (c5724lM19928f == null || (jSONObject = c5724lM19928f.f31962e) == null) {
            return 0;
        }
        return jSONObject.optInt("version");
    }

    /* JADX INFO: renamed from: f */
    public C5724l m19928f(String str) {
        C5804p.m20342a(f31946a, "getAppConfigData start, appId: " + str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            if (this.f31949c.get(str) == null || (this.f31950d.containsKey(str) && this.f31950d.get(str).booleanValue())) {
                m19924b(str);
            }
        } catch (Exception e2) {
            C5804p.m20347b(f31946a, "getConfig error: " + e2.getMessage());
        }
        return this.f31949c.get(str);
    }

    private C5720h() {
        this.f31949c = new ConcurrentHashMap<>();
        this.f31950d = new ConcurrentHashMap<>();
        this.f31948b = new C5719g(C5756a.m20048a());
    }

    /* JADX INFO: renamed from: a */
    public static C5720h m19910a() {
        return a.f31951a;
    }

    /* JADX INFO: renamed from: a */
    public void m19920a(ArrayList<C5724l> arrayList) {
        C5728b.m19940a(new RunnableC5721i(this, arrayList));
    }

    /* JADX INFO: renamed from: a */
    public void m19919a(String str) {
        FutureTask futureTask = new FutureTask(new RunnableC5722j(this, str), null);
        C5728b.m19940a(futureTask);
        try {
            futureTask.get();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m19922a(String str, String str2, String str3, boolean z2) {
        try {
            JSONObject jSONObjectM19914c = m19914c(str, str2);
            if (jSONObjectM19914c == null) {
                C5804p.m20342a(f31946a, "config not available, use default value");
                return z2;
            }
            return jSONObjectM19914c.getBoolean(str3);
        } catch (Exception e2) {
            C5804p.m20347b(f31946a, "getBoolean: " + e2.toString());
            return z2;
        }
    }

    /* JADX INFO: renamed from: c */
    public String m19925c(String str) {
        JSONObject jSONObject;
        C5724l c5724lM19928f = m19928f(str);
        return (c5724lM19928f == null || (jSONObject = c5724lM19928f.f31962e) == null) ? "" : jSONObject.optString(C5713a.f31902g);
    }

    /* JADX INFO: renamed from: a */
    public String m19918a(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObjectM19914c = m19914c(str, str2);
            if (jSONObjectM19914c == null) {
                C5804p.m20342a(f31946a, "config not available, use default value");
                return str4;
            }
            return jSONObjectM19914c.getString(str3);
        } catch (Exception e2) {
            C5804p.m20347b(f31946a, "getString: " + e2.toString());
            return str4;
        }
    }

    /* JADX INFO: renamed from: a */
    public int m19916a(String str, String str2, String str3, int i2) {
        try {
            JSONObject jSONObjectM19914c = m19914c(str, str2);
            if (jSONObjectM19914c == null) {
                C5804p.m20342a(f31946a, "config not available, use default value");
                return i2;
            }
            return jSONObjectM19914c.getInt(str3);
        } catch (Exception e2) {
            C5804p.m20347b(f31946a, "getInt: " + e2.toString());
            return i2;
        }
    }

    /* JADX INFO: renamed from: a */
    public long m19917a(String str, String str2, String str3, long j2) {
        try {
            JSONObject jSONObjectM19914c = m19914c(str, str2);
            if (jSONObjectM19914c == null) {
                C5804p.m20342a(f31946a, "config not available, use default value");
                return j2;
            }
            return jSONObjectM19914c.getLong(str3);
        } catch (Exception e2) {
            C5804p.m20347b(f31946a, "getLong: " + e2.toString());
            return j2;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m19924b(String str) {
        FutureTask futureTask = new FutureTask(new CallableC5723k(this, str));
        C5728b.m19940a(futureTask);
        try {
            C5724l c5724l = (C5724l) futureTask.get(5L, TimeUnit.SECONDS);
            if (c5724l != null) {
                this.f31949c.put(str, c5724l);
                this.f31950d.put(str, Boolean.FALSE);
            }
        } catch (Exception e2) {
            C5804p.m20347b(f31946a, "getConfig error: " + e2.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public double m19915a(String str, String str2, String str3, double d2) {
        try {
            JSONObject jSONObjectM19914c = m19914c(str, str2);
            if (jSONObjectM19914c == null) {
                C5804p.m20342a(f31946a, "config not available, use default value");
                return d2;
            }
            return jSONObjectM19914c.getDouble(str3);
        } catch (Exception e2) {
            C5804p.m20347b(f31946a, "getDouble: " + e2.toString());
            return d2;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m19921a(String str, String str2) {
        JSONObject jSONObject;
        try {
            C5724l c5724lM19928f = m19928f(str);
            if (c5724lM19928f == null || (jSONObject = c5724lM19928f.f31962e) == null || !jSONObject.has(str2)) {
                return false;
            }
            return c5724lM19928f.f31962e.optBoolean(str2);
        } catch (Exception e2) {
            C5804p.m20347b(f31946a, "getAppLevelBoolean" + e2.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static int m19912b(JSONObject jSONObject) {
        try {
            int iOptInt = jSONObject.optInt(C5713a.f31900e, 100);
            if (iOptInt < 0 || iOptInt > 100) {
                return 100;
            }
            return iOptInt;
        } catch (Exception e2) {
            C5804p.m20342a(f31946a, "getCommonSample Exception:" + e2.getMessage());
            return 100;
        }
    }

    /* JADX INFO: renamed from: b */
    public long m19923b(String str, String str2) {
        C5724l c5724l;
        if (TextUtils.isEmpty(str)) {
            return 100L;
        }
        try {
            if (this.f31949c.get(str) == null) {
                m19924b(str);
            }
            if (this.f31949c.get(str) != null) {
                int iM19916a = m19916a(str, str2, C5713a.f31900e, -1);
                if (iM19916a == -1 && (c5724l = this.f31949c.get(str)) != null) {
                    C5804p.m20342a(f31946a, "will return common sample " + c5724l.f31959b);
                    return c5724l.f31959b;
                }
                C5804p.m20342a(f31946a, "will return event sample " + iM19916a);
                return iM19916a;
            }
        } catch (Exception e2) {
            C5804p.m20347b(f31946a, "getAppEventSample" + e2.toString());
        }
        C5804p.m20342a(f31946a, "will return def sample");
        return 100L;
    }
}
