package com.xiaomi.onetrack.p014c;

import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.IntentFilter;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.xiaomi.onetrack.p013b.C5726n;
import com.xiaomi.onetrack.p015d.C5747a;
import com.xiaomi.onetrack.p015d.C5749c;
import com.xiaomi.onetrack.p015d.C5750d;
import com.xiaomi.onetrack.p017f.C5756a;
import com.xiaomi.onetrack.p017f.C5757b;
import com.xiaomi.onetrack.util.C5768a;
import com.xiaomi.onetrack.util.C5804p;
import com.xiaomi.onetrack.util.aa;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.xiaomi.onetrack.c.c */
/* JADX INFO: loaded from: classes3.dex */
public class C5729c {

    /* JADX INFO: renamed from: a */
    private static final String f31986a = "EventManager";

    /* JADX INFO: renamed from: b */
    private static final boolean f31987b = false;

    /* JADX INFO: renamed from: c */
    private static final int f31988c = 204800;

    /* JADX INFO: renamed from: d */
    private static final int f31989d = 307200;

    /* JADX INFO: renamed from: e */
    private static final int f31990e = 300;

    /* JADX INFO: renamed from: f */
    private static final int f31991f = 300;

    /* JADX INFO: renamed from: g */
    private static final String f31992g = "priority ASC, _id ASC";

    /* JADX INFO: renamed from: h */
    private static final int f31993h = 7;

    /* JADX INFO: renamed from: i */
    private static C5729c f31994i;

    /* JADX INFO: renamed from: k */
    private static BroadcastReceiver f31995k = new C5730d();

    /* JADX INFO: renamed from: j */
    private a f31996j;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.xiaomi.onetrack.c.c$a */
    static class a extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: a */
        public static final String f31997a = "onetrack";

        /* JADX INFO: renamed from: b */
        public static final String f31998b = "events";

        /* JADX INFO: renamed from: c */
        public static final String f31999c = "_id";

        /* JADX INFO: renamed from: d */
        public static final String f32000d = "appid";

        /* JADX INFO: renamed from: e */
        public static final String f32001e = "package";

        /* JADX INFO: renamed from: f */
        public static final String f32002f = "event_name";

        /* JADX INFO: renamed from: g */
        public static final String f32003g = "priority";

        /* JADX INFO: renamed from: h */
        public static final String f32004h = "data";

        /* JADX INFO: renamed from: i */
        public static final String f32005i = "timestamp";

        /* JADX INFO: renamed from: j */
        private static final int f32006j = 1;

        /* JADX INFO: renamed from: k */
        private static final String f32007k = "CREATE TABLE events (_id INTEGER PRIMARY KEY AUTOINCREMENT,appid TEXT,package TEXT,event_name TEXT,priority INTEGER,data BLOB,timestamp INTEGER)";

        public a(Context context) {
            super(context, f31997a, (SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(f32007k);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        }
    }

    private C5729c() {
        Context contextM20048a = C5756a.m20048a();
        this.f31996j = new a(contextM20048a);
        m19954b();
        m19948b(contextM20048a);
    }

    /* JADX INFO: renamed from: b */
    private static void m19948b(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.registerReceiver(f31995k, intentFilter);
    }

    /* JADX INFO: renamed from: d */
    private void m19950d() {
        try {
            this.f31996j.getWritableDatabase().delete("events", null, null);
            C5804p.m20342a(f31986a, "delete table events");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: c */
    public long m19955c() {
        try {
            return DatabaseUtils.queryNumEntries(this.f31996j.getReadableDatabase(), "events");
        } catch (Exception e2) {
            C5804p.m20347b(f31986a, "getTotalEventsNumberSync failed with " + e2.getMessage());
            return 0L;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C5729c m19943a() {
        if (f31994i == null) {
            m19945a(C5756a.m20053b());
        }
        return f31994i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m19949b(C5757b c5757b) {
        synchronized (this.f31996j) {
            if (!c5757b.m20080i()) {
                C5804p.m20351c(f31986a, "addEventToDatabase event is inValid, event:" + c5757b.m20076e());
                return;
            }
            SQLiteDatabase writableDatabase = this.f31996j.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("appid", c5757b.m20073c());
            contentValues.put("package", c5757b.m20075d());
            contentValues.put("event_name", c5757b.m20076e());
            contentValues.put(a.f32003g, Integer.valueOf(c5757b.m20077f()));
            contentValues.put("timestamp", Long.valueOf(System.currentTimeMillis()));
            byte[] bArrM19947a = m19947a(c5757b.m20078g().toString());
            if (bArrM19947a.length > f31988c) {
                C5804p.m20347b(f31986a, "Too large data, discard ***");
                return;
            }
            contentValues.put("data", bArrM19947a);
            long jInsert = writableDatabase.insert("events", null, contentValues);
            C5804p.m20342a(f31986a, "DB-Thread: EventManager.addEventToDatabase , row=" + jInsert);
            if (jInsert != -1) {
                if (C5804p.f32410a) {
                    C5804p.m20342a(f31986a, "添加后，DB 中事件个数为 " + m19955c());
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (C5768a.f32224c.equals(c5757b.m20076e())) {
                    aa.m20154a(jCurrentTimeMillis);
                }
                C5726n.m19932a(false);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m19945a(Context context) {
        if (f31994i == null) {
            synchronized (C5729c.class) {
                if (f31994i == null) {
                    f31994i = new C5729c();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m19953a(C5757b c5757b) {
        C5728b.m19940a(new RunnableC5732f(this, c5757b));
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0130: MOVE (r12 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:61:0x0130 */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0133  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.xiaomi.onetrack.p014c.C5734h m19952a(int r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.onetrack.p014c.C5729c.m19952a(int):com.xiaomi.onetrack.c.h");
    }

    /* JADX INFO: renamed from: b */
    public void m19954b() {
        C5728b.m19941a(new RunnableC5733g(this), 1000L);
    }

    /* JADX INFO: renamed from: a */
    public int m19951a(ArrayList<Long> arrayList) {
        synchronized (this.f31996j) {
            if (arrayList != null) {
                if (arrayList.size() != 0) {
                    try {
                        SQLiteDatabase writableDatabase = this.f31996j.getWritableDatabase();
                        boolean z2 = true;
                        StringBuilder sb = new StringBuilder(((Long.toString(arrayList.get(0).longValue()).length() + 1) * arrayList.size()) + 16);
                        sb.append("_id");
                        sb.append(" in (");
                        sb.append(arrayList.get(0));
                        int size = arrayList.size();
                        for (int i2 = 1; i2 < size; i2++) {
                            sb.append(",");
                            sb.append(arrayList.get(i2));
                        }
                        sb.append(")");
                        int iDelete = writableDatabase.delete("events", sb.toString(), null);
                        C5804p.m20342a(f31986a, "deleted events count " + iDelete);
                        long jM19955c = m19943a().m19955c();
                        if (jM19955c != 0) {
                            z2 = false;
                        }
                        C5726n.m19932a(z2);
                        C5804p.m20342a(f31986a, "after delete DB record remains=" + jM19955c);
                        return iDelete;
                    } catch (Exception e2) {
                        C5804p.m20347b(f31986a, "e=" + e2);
                        return 0;
                    }
                }
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m19947a(String str) {
        return C5747a.m19998a(str.getBytes(), C5750d.m20016a(C5749c.m20013a(), true).getBytes());
    }

    /* JADX INFO: renamed from: a */
    public static String m19944a(byte[] bArr) {
        return new String(C5747a.m20001b(bArr, C5750d.m20016a(C5749c.m20013a(), true).getBytes()));
    }
}
