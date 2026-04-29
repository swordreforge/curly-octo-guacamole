package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.push.qrj;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class h7am {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static volatile h7am f73350zy;

    /* JADX INFO: renamed from: k */
    private final ConcurrentLinkedQueue<toq> f32999k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private Context f73351toq;

    /* JADX INFO: renamed from: com.xiaomi.push.h7am$k */
    class C5867k extends toq {
        C5867k() {
            super();
        }

        @Override // com.xiaomi.push.h7am.toq, com.xiaomi.push.qrj.toq
        public void toq() {
            h7am.this.m20951s();
        }
    }

    class toq extends qrj.toq {

        /* JADX INFO: renamed from: k */
        long f33000k = System.currentTimeMillis();

        toq() {
        }

        /* JADX INFO: renamed from: n */
        final boolean m20954n() {
            return System.currentTimeMillis() - this.f33000k > 172800000;
        }

        /* JADX INFO: renamed from: q */
        public boolean mo20955q() {
            return true;
        }

        @Override // com.xiaomi.push.qrj.toq
        public void toq() {
        }
    }

    class zy extends toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        boolean f73354f7l8;

        /* JADX INFO: renamed from: g */
        int f33001g;

        /* JADX INFO: renamed from: n */
        File f33002n;

        /* JADX INFO: renamed from: q */
        String f33003q;

        /* JADX INFO: renamed from: y */
        boolean f33005y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        String f73355zy;

        zy(String str, String str2, File file, boolean z2) {
            super();
            this.f73355zy = str;
            this.f33003q = str2;
            this.f33002n = file;
            this.f33005y = z2;
        }

        /* JADX INFO: renamed from: g */
        private boolean m20956g() {
            int i2;
            int i3 = 0;
            SharedPreferences sharedPreferences = h7am.this.f73351toq.getSharedPreferences("log.timestamp", 0);
            String string = sharedPreferences.getString("log.requst", "");
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                JSONObject jSONObject = new JSONObject(string);
                jCurrentTimeMillis = jSONObject.getLong("time");
                i2 = jSONObject.getInt("times");
            } catch (JSONException unused) {
                i2 = 0;
            }
            if (System.currentTimeMillis() - jCurrentTimeMillis >= 86400000) {
                jCurrentTimeMillis = System.currentTimeMillis();
            } else {
                if (i2 > 10) {
                    return false;
                }
                i3 = i2;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("time", jCurrentTimeMillis);
                jSONObject2.put("times", i3 + 1);
                sharedPreferences.edit().putString("log.requst", jSONObject2.toString()).commit();
            } catch (JSONException e2) {
                com.xiaomi.channel.commonutils.logger.zy.m19300t("JSONException on put " + e2.getMessage());
            }
            return true;
        }

        @Override // com.xiaomi.push.h7am.toq
        /* JADX INFO: renamed from: q */
        public boolean mo20955q() {
            return oc.m21365z(h7am.this.f73351toq) || (this.f33005y && oc.zurt(h7am.this.f73351toq));
        }

        @Override // com.xiaomi.push.h7am.toq, com.xiaomi.push.qrj.toq
        public void toq() {
            try {
                if (m20956g()) {
                    HashMap map = new HashMap();
                    map.put("uid", com.xiaomi.push.service.nn86.f7l8());
                    map.put("token", this.f33003q);
                    map.put("net", oc.m21360p(h7am.this.f73351toq));
                    oc.n7h(this.f73355zy, map, this.f33002n, "file");
                }
                this.f73354f7l8 = true;
            } catch (IOException unused) {
            }
        }

        @Override // com.xiaomi.push.qrj.toq
        public void zy() {
            if (!this.f73354f7l8) {
                int i2 = this.f33001g + 1;
                this.f33001g = i2;
                if (i2 < 3) {
                    h7am.this.f32999k.add(this);
                }
            }
            if (this.f73354f7l8 || this.f33001g >= 3) {
                this.f33002n.delete();
            }
            h7am.this.m20949n((1 << this.f33001g) * 1000);
        }
    }

    private h7am(Context context) {
        ConcurrentLinkedQueue<toq> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        this.f32999k = concurrentLinkedQueue;
        this.f73351toq = context;
        concurrentLinkedQueue.add(new C5867k());
        m20950p(0L);
    }

    private void ld6() {
        while (!this.f32999k.isEmpty()) {
            toq toqVarPeek = this.f32999k.peek();
            if (toqVarPeek != null) {
                if (!toqVarPeek.m20954n() && this.f32999k.size() <= 6) {
                    return;
                }
                com.xiaomi.channel.commonutils.logger.zy.m19300t("remove Expired task");
                this.f32999k.remove(toqVarPeek);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m20949n(long j2) {
        toq toqVarPeek = this.f32999k.peek();
        if (toqVarPeek == null || !toqVarPeek.mo20955q()) {
            return;
        }
        m20950p(j2);
    }

    /* JADX INFO: renamed from: p */
    private void m20950p(long j2) {
        if (this.f32999k.isEmpty()) {
            return;
        }
        nyj.toq(new mbx(this), j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public void m20951s() {
        try {
            File file = new File(this.f73351toq.getFilesDir() + "/.logcache");
            if (file.exists() && file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    file2.delete();
                }
            }
        } catch (NullPointerException unused) {
        }
    }

    public static h7am toq(Context context) {
        if (f73350zy == null) {
            synchronized (h7am.class) {
                if (f73350zy == null) {
                    f73350zy = new h7am(context);
                }
            }
        }
        f73350zy.f73351toq = context;
        return f73350zy;
    }

    /* JADX INFO: renamed from: q */
    public void m20952q() {
        ld6();
        m20949n(0L);
    }

    /* JADX INFO: renamed from: y */
    public void m20953y(String str, String str2, Date date, Date date2, int i2, boolean z2) {
        this.f32999k.add(new vep5(this, i2, date, date2, str, str2, z2));
        m20950p(0L);
    }
}
