package com.xiaomi.onetrack.util;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.xiaomi.onetrack.p015d.C5747a;
import com.xiaomi.onetrack.p017f.C5756a;
import java.util.UUID;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.o */
/* JADX INFO: loaded from: classes3.dex */
public class C5782o {

    /* JADX INFO: renamed from: a */
    private static final String f32324a = "o";

    /* JADX INFO: renamed from: b */
    private static final String f32325b = "content://com.miui.analytics.OneTrackProvider/insId";

    /* JADX INFO: renamed from: c */
    private static final String f32326c = "insId";

    /* JADX INFO: renamed from: d */
    private static final String f32327d = "pkg";

    /* JADX INFO: renamed from: e */
    private static final String f32328e = "sign";

    /* JADX INFO: renamed from: f */
    private static volatile C5782o f32329f;

    /* JADX INFO: renamed from: g */
    private static String f32330g;

    /* JADX INFO: renamed from: j */
    private static String f32331j;

    /* JADX INFO: renamed from: k */
    private boolean f32334k = false;

    /* JADX INFO: renamed from: h */
    private final Context f32332h = C5756a.m20048a();

    /* JADX INFO: renamed from: i */
    private final Context f32333i = C5756a.m20053b();

    private C5782o() {
        f32331j = C5756a.m20058e();
    }

    /* JADX INFO: renamed from: a */
    public static C5782o m20286a() {
        if (f32329f == null) {
            synchronized (C5782o.class) {
                if (f32329f == null) {
                    f32329f = new C5782o();
                }
            }
        }
        return f32329f;
    }

    /* JADX INFO: renamed from: c */
    private String m20288c() {
        String string = null;
        try {
            Uri.Builder builderBuildUpon = Uri.parse(f32325b).buildUpon();
            builderBuildUpon.appendQueryParameter(f32327d, f32331j);
            builderBuildUpon.appendQueryParameter("sign", C5747a.m19994a(f32326c + f32331j));
            Cursor cursorQuery = this.f32333i.getContentResolver().query(builderBuildUpon.build(), null, null, null, null);
            if (cursorQuery != null) {
                while (cursorQuery.moveToNext()) {
                    string = cursorQuery.getString(0);
                }
                cursorQuery.close();
            }
        } catch (Exception e2) {
            C5804p.m20344a(f32324a, "getRemoteCacheInstanceId e", e2);
        }
        return string;
    }

    /* JADX INFO: renamed from: d */
    private String m20289d() {
        String strM20152a = aa.m20152a(this.f32332h);
        if (TextUtils.isEmpty(strM20152a)) {
            return aa.m20200m();
        }
        aa.m20178e(strM20152a);
        return strM20152a;
    }

    /* JADX INFO: renamed from: b */
    public String m20292b() {
        String strM20289d;
        if (!TextUtils.isEmpty(f32330g)) {
            return f32330g;
        }
        if (this.f32334k) {
            strM20289d = m20288c();
            String strM20289d2 = m20289d();
            if (TextUtils.isEmpty(strM20289d) && !TextUtils.isEmpty(strM20289d2)) {
                m20287b(strM20289d2);
                strM20289d = strM20289d2;
            } else if (!TextUtils.isEmpty(strM20289d) && TextUtils.isEmpty(strM20289d2)) {
                aa.m20178e(strM20289d);
            }
        } else {
            strM20289d = m20289d();
        }
        if (TextUtils.isEmpty(strM20289d)) {
            String string = UUID.randomUUID().toString();
            f32330g = string;
            if (this.f32334k) {
                m20287b(string);
            }
            aa.m20178e(f32330g);
        } else {
            f32330g = strM20289d;
        }
        return f32330g;
    }

    /* JADX INFO: renamed from: a */
    public void m20290a(Boolean bool) {
        this.f32334k = bool.booleanValue();
    }

    /* JADX INFO: renamed from: a */
    public void m20291a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f32330g = str;
        if (this.f32334k) {
            m20287b(str);
        }
        aa.m20178e(f32330g);
    }

    /* JADX INFO: renamed from: b */
    private void m20287b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Uri uri = Uri.parse(f32325b);
            ContentValues contentValues = new ContentValues();
            contentValues.put(f32331j, str);
            this.f32333i.getContentResolver().insert(uri, contentValues);
        } catch (Exception e2) {
            aa.m20178e(str);
            C5804p.m20344a(f32324a, "setRemoteCacheInstanceId e", e2);
        }
    }
}
