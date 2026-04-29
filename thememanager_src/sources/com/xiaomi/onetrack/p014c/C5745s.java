package com.xiaomi.onetrack.p014c;

import android.os.HandlerThread;
import android.text.TextUtils;
import com.xiaomi.onetrack.p013b.C5713a;
import com.xiaomi.onetrack.p015d.C5747a;
import com.xiaomi.onetrack.p015d.C5749c;
import com.xiaomi.onetrack.p015d.C5752f;
import com.xiaomi.onetrack.p018g.C5765b;
import com.xiaomi.onetrack.util.C5780m;
import com.xiaomi.onetrack.util.C5804p;
import com.xiaomi.onetrack.util.C5812x;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.xiaomi.onetrack.c.s */
/* JADX INFO: loaded from: classes3.dex */
public class C5745s {

    /* JADX INFO: renamed from: a */
    public static final String f32062a = "config";

    /* JADX INFO: renamed from: b */
    public static final String f32063b = "appId";

    /* JADX INFO: renamed from: c */
    public static final String f32064c = "version";

    /* JADX INFO: renamed from: d */
    private static final String f32065d = "UploaderEngine";

    /* JADX INFO: renamed from: e */
    private static final String f32066e = "code";

    /* JADX INFO: renamed from: f */
    private static final String f32067f = "UTF-8";

    /* JADX INFO: renamed from: g */
    private HandlerC5742p f32068g;

    /* JADX INFO: renamed from: com.xiaomi.onetrack.c.s$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        private static final C5745s f32069a = new C5745s();

        private a() {
        }
    }

    /* JADX INFO: renamed from: a */
    public static C5745s m19984a() {
        return a.f32069a;
    }

    /* JADX INFO: renamed from: b */
    private void m19988b() {
        HandlerThread handlerThread = new HandlerThread("onetrack_uploader_worker");
        handlerThread.start();
        this.f32068g = new HandlerC5742p(handlerThread.getLooper());
    }

    private C5745s() {
        m19988b();
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m19990a(int i2, boolean z2) {
        HandlerC5742p handlerC5742p = this.f32068g;
        if (handlerC5742p != null) {
            handlerC5742p.m19982a(i2, z2);
        } else {
            C5804p.m20347b(f32065d, "*** impossible, upload timer should not be null");
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m19989b(String str) {
        boolean z2 = false;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("code");
            if (iOptInt == 0) {
                C5804p.m20342a(f32065d, "成功发送数据到服务端");
                C5713a.m19872a().m19895a(jSONObject);
                z2 = true;
            } else if (iOptInt == -3) {
                C5804p.m20347b(f32065d, "signature expired, will update");
                C5752f.m20039a().m20044c();
            } else {
                C5804p.m20347b(f32065d, "Error: status code=" + iOptInt);
            }
        } catch (Exception e2) {
            C5804p.m20348b(f32065d, "parseUploadingResult exception ", e2);
        }
        return z2;
    }

    /* JADX INFO: renamed from: a */
    public void m19991a(boolean z2) {
        HandlerC5742p handlerC5742p = this.f32068g;
        if (handlerC5742p != null) {
            handlerC5742p.m19983a(z2);
        } else {
            C5804p.m20347b(f32065d, "*** impossible, upload timer should not be null");
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m19992a(int i2) throws Throwable {
        C5804p.m20342a(f32065d, "即将读取数据库并上传数据");
        while (true) {
            C5734h c5734hM19952a = C5729c.m19943a().m19952a(i2);
            if (c5734hM19952a == null) {
                C5804p.m20342a(f32065d, "满足条件的记录为空，即将返回, priority=" + i2);
                return true;
            }
            ArrayList<Long> arrayList = c5734hM19952a.f32015c;
            boolean zM19985a = m19985a(c5734hM19952a.f32013a);
            C5804p.m20342a(f32065d, "upload success:" + zM19985a);
            if (!zM19985a) {
                return false;
            }
            if (C5729c.m19943a().m19951a(arrayList) == 0) {
                C5804p.m20348b(f32065d, "delete DB failed!", new Throwable());
                break;
            }
            if (c5734hM19952a.f32016d) {
                C5804p.m20342a(f32065d, "No more records for prio=" + i2);
                break;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    private boolean m19985a(JSONArray jSONArray) {
        try {
            String strM20413b = C5812x.m20403a().m20413b();
            String string = jSONArray.toString();
            C5804p.m20342a(f32065d, " payload:" + string);
            byte[] bArrM19987a = m19987a(m19986a(string));
            C5804p.m20342a(f32065d, "before zip and encrypt, len=" + string.length() + ", after=" + bArrM19987a.length);
            String strM20103a = C5765b.m20103a(strM20413b, bArrM19987a);
            StringBuilder sb = new StringBuilder();
            sb.append("sendDataToServer response: ");
            sb.append(strM20103a);
            C5804p.m20342a(f32065d, sb.toString());
            if (TextUtils.isEmpty(strM20103a)) {
                return false;
            }
            return m19989b(strM20103a);
        } catch (Exception e2) {
            C5804p.m20348b(f32065d, "Exception while uploading ", e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m19986a(String str) throws Throwable {
        GZIPOutputStream gZIPOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        byte[] byteArray = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream(str.getBytes("UTF-8").length);
            } catch (Throwable th) {
                th = th;
            }
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(str.getBytes("UTF-8"));
                    gZIPOutputStream.finish();
                    byteArray = byteArrayOutputStream.toByteArray();
                } catch (Exception e2) {
                    e = e2;
                    C5804p.m20347b(f32065d, " zipData failed! " + e.toString());
                }
            } catch (Exception e3) {
                e = e3;
                gZIPOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream = null;
                byteArrayOutputStream2 = byteArrayOutputStream;
                C5780m.m20279a((OutputStream) byteArrayOutputStream2);
                C5780m.m20279a((OutputStream) gZIPOutputStream);
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            byteArrayOutputStream = null;
            gZIPOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            gZIPOutputStream = null;
            C5780m.m20279a((OutputStream) byteArrayOutputStream2);
            C5780m.m20279a((OutputStream) gZIPOutputStream);
            throw th;
        }
        C5780m.m20279a((OutputStream) byteArrayOutputStream);
        C5780m.m20279a((OutputStream) gZIPOutputStream);
        return byteArray;
    }

    /* JADX INFO: renamed from: a */
    private byte[] m19987a(byte[] bArr) {
        if (bArr == null) {
            C5804p.m20347b(f32065d, "content is null");
            return null;
        }
        return C5747a.m19998a(bArr, C5749c.m20014a(C5752f.m20039a().m20043b()[0]));
    }
}
