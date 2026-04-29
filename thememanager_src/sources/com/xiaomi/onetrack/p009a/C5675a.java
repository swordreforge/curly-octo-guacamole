package com.xiaomi.onetrack.p009a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.xiaomi.onetrack.p009a.p010a.C5676a;
import com.xiaomi.onetrack.p009a.p011b.C5678a;
import com.xiaomi.onetrack.p013b.C5726n;
import com.xiaomi.onetrack.p017f.C5756a;
import com.xiaomi.onetrack.p017f.C5757b;
import com.xiaomi.onetrack.util.C5804p;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.xiaomi.onetrack.a.a */
/* JADX INFO: loaded from: classes3.dex */
public class C5675a {

    /* JADX INFO: renamed from: a */
    private static final String f31572a = "AdMonitorManager";

    /* JADX INFO: renamed from: b */
    private static final int f31573b = 204800;

    /* JADX INFO: renamed from: c */
    private static final int f31574c = 100;

    /* JADX INFO: renamed from: d */
    private static final int f31575d = 4;

    /* JADX INFO: renamed from: e */
    private static final int f31576e = 300;

    /* JADX INFO: renamed from: f */
    private static final String f31577f = "_id ASC";

    /* JADX INFO: renamed from: g */
    private static final int f31578g = 7;

    /* JADX INFO: renamed from: h */
    private static C5675a f31579h;

    /* JADX INFO: renamed from: i */
    private final a f31580i = new a(C5756a.m20048a());

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.xiaomi.onetrack.a.a$a */
    static class a extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: a */
        public static final String f31581a = "onetrack_ad";

        /* JADX INFO: renamed from: b */
        public static final String f31582b = "monitor";

        /* JADX INFO: renamed from: c */
        public static final String f31583c = "_id";

        /* JADX INFO: renamed from: d */
        public static final String f31584d = "appid";

        /* JADX INFO: renamed from: e */
        public static final String f31585e = "package";

        /* JADX INFO: renamed from: f */
        public static final String f31586f = "event_name";

        /* JADX INFO: renamed from: g */
        public static final String f31587g = "url";

        /* JADX INFO: renamed from: h */
        public static final String f31588h = "timestamp";

        /* JADX INFO: renamed from: i */
        public static final String f31589i = "send_count";

        /* JADX INFO: renamed from: j */
        private static final int f31590j = 1;

        /* JADX INFO: renamed from: k */
        private static final String f31591k = "CREATE TABLE monitor (_id INTEGER PRIMARY KEY AUTOINCREMENT,appid TEXT,package TEXT,event_name TEXT,url TEXT,send_count INTEGER DEFAULT 0,timestamp INTEGER)";

        public a(Context context) {
            super(context, f31581a, (SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL(f31591k);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        }
    }

    private C5675a() {
        m19657c();
    }

    /* JADX INFO: renamed from: f */
    private void m19651f() {
        try {
            this.f31580i.getWritableDatabase().delete(a.f31582b, null, null);
            C5804p.m20342a(f31572a, "delete table monitor");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Not initialized variable reg: 9, insn: 0x00fa: MOVE (r17 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:47:0x00fa */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3 A[Catch: all -> 0x0102, PHI: r9
      0x00e3: PHI (r9v4 android.database.Cursor) = (r9v3 android.database.Cursor), (r9v5 android.database.Cursor) binds: [B:36:0x00e1, B:42:0x00f4] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:24:0x00cc, B:25:0x00cf, B:37:0x00e3, B:44:0x00f7, B:49:0x00fe, B:50:0x0101), top: B:54:0x0008 }] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.xiaomi.onetrack.p009a.p012c.C5681a m19655b() {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.onetrack.p009a.C5675a.m19655b():com.xiaomi.onetrack.a.c.a");
    }

    /* JADX INFO: renamed from: c */
    public void m19657c() {
        C5676a.m19662a(new RunnableC5680c(this), 1000L);
    }

    /* JADX INFO: renamed from: d */
    public void m19658d() {
        synchronized (this.f31580i) {
            Cursor cursorQuery = null;
            try {
                try {
                    SQLiteDatabase writableDatabase = this.f31580i.getWritableDatabase();
                    String[] strArr = {Long.toString(4L)};
                    cursorQuery = writableDatabase.query(a.f31582b, new String[]{"timestamp"}, "send_count >= ? ", strArr, null, null, f31577f);
                    if (cursorQuery.getCount() != 0) {
                        C5804p.m20342a(f31572a, "*** deleted obsolete ad monitor count=" + writableDatabase.delete(a.f31582b, "send_count >= ? ", strArr));
                    }
                    if (C5804p.f32410a) {
                        C5804p.m20342a(f31572a, "after delete obsolete ad monitor record remains=" + m19659e());
                    }
                } catch (Exception e2) {
                    C5804p.m20353d(f31572a, "remove obsolete ad monitor failed with " + e2);
                    if (cursorQuery != null) {
                    }
                }
                cursorQuery.close();
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public long m19659e() {
        try {
            return DatabaseUtils.queryNumEntries(this.f31580i.getReadableDatabase(), a.f31582b);
        } catch (Exception e2) {
            C5804p.m20347b(f31572a, "getTotalEventsNumberSync failed with " + e2.getMessage());
            return 0L;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C5675a m19649a() {
        if (f31579h == null) {
            m19650a(C5756a.m20048a());
        }
        return f31579h;
    }

    /* JADX INFO: renamed from: a */
    public static void m19650a(Context context) {
        if (f31579h == null) {
            synchronized (C5675a.class) {
                if (f31579h == null) {
                    f31579h = new C5675a();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m19653a(C5757b c5757b) {
        try {
            C5676a.m19661a(new RunnableC5677b(this, c5757b));
        } catch (Throwable th) {
            C5804p.m20342a(f31572a, "filterAdMonitor Throwable：" + th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public long m19647a(C5678a c5678a) {
        synchronized (this.f31580i) {
            try {
                if (!c5678a.m19677h()) {
                    C5804p.m20351c(f31572a, "addAdMonitorToDatabase event is inValid, event:" + c5678a.m19663a());
                    return -1L;
                }
                SQLiteDatabase writableDatabase = this.f31580i.getWritableDatabase();
                ContentValues contentValues = new ContentValues();
                contentValues.put("appid", c5678a.m19674e());
                contentValues.put("package", c5678a.m19675f());
                contentValues.put("event_name", c5678a.m19663a());
                contentValues.put("timestamp", Long.valueOf(c5678a.m19672d()));
                contentValues.put("url", c5678a.m19670c());
                long jInsert = writableDatabase.insert(a.f31582b, null, contentValues);
                C5804p.m20342a(f31572a, "DB-Thread: AdMonitorManager.addAdMonitorToDatabase , row=" + jInsert);
                if (C5804p.f32410a) {
                    C5804p.m20342a(f31572a, "添加后，ad monitor url 中事件个数为 " + m19659e());
                }
                return jInsert;
            } catch (Throwable th) {
                C5804p.m20342a(f31572a, "addAdMonitorToDatabase Throwable：" + th.getMessage());
                return -1L;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public int m19652a(ArrayList<Integer> arrayList) {
        synchronized (this.f31580i) {
            if (arrayList != null) {
                if (arrayList.size() != 0) {
                    try {
                        SQLiteDatabase writableDatabase = this.f31580i.getWritableDatabase();
                        StringBuilder sb = new StringBuilder(((Long.toString(arrayList.get(0).intValue()).length() + 1) * arrayList.size()) + 16);
                        sb.append("_id");
                        sb.append(" in (");
                        sb.append(arrayList.get(0));
                        int size = arrayList.size();
                        for (int i2 = 1; i2 < size; i2++) {
                            sb.append(",");
                            sb.append(arrayList.get(i2));
                        }
                        sb.append(")");
                        int iDelete = writableDatabase.delete(a.f31582b, sb.toString(), null);
                        C5804p.m20342a(f31572a, "*** *** deleted ad monitor count " + iDelete);
                        if (C5804p.f32410a) {
                            C5804p.m20342a(f31572a, "after delete ad monitor record remains=" + m19659e());
                        }
                        return iDelete;
                    } catch (Exception e2) {
                        C5804p.m20347b(f31572a, "e=" + e2);
                        return 0;
                    }
                }
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m19656b(ArrayList<Integer> arrayList) {
        String str;
        String str2;
        synchronized (this.f31580i) {
            if (arrayList != null) {
                try {
                } catch (Throwable th) {
                    C5804p.m20342a(f31572a, "addAdMonitorsRetryCount Throwable:" + th.getMessage());
                }
                if (arrayList.size() > 0) {
                    SQLiteDatabase writableDatabase = null;
                    try {
                        try {
                            writableDatabase = this.f31580i.getWritableDatabase();
                            writableDatabase.beginTransaction();
                            Iterator<Integer> it = arrayList.iterator();
                            while (it.hasNext()) {
                                writableDatabase.execSQL(String.format("update %s set %s = %s + 1 where %s = %s", a.f31582b, a.f31589i, a.f31589i, "_id", Integer.valueOf(it.next().intValue())));
                            }
                            writableDatabase.setTransactionSuccessful();
                            try {
                                writableDatabase.endTransaction();
                                writableDatabase.close();
                            } catch (Exception e2) {
                                str = f31572a;
                                str2 = "addAdMonitorsRetryCount endTransaction error: " + e2.getMessage();
                                C5804p.m20347b(str, str2);
                            }
                        } catch (Exception e3) {
                            C5804p.m20347b(f31572a, "addAdMonitorsRetryCount Exception: " + e3.getMessage());
                            if (writableDatabase != null) {
                                try {
                                    writableDatabase.endTransaction();
                                    writableDatabase.close();
                                } catch (Exception e4) {
                                    str = f31572a;
                                    str2 = "addAdMonitorsRetryCount endTransaction error: " + e4.getMessage();
                                    C5804p.m20347b(str, str2);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m19654a(long j2, long j3, int i2) {
        if (i2 <= 0) {
            return true;
        }
        if (i2 < 4) {
            return Math.abs(j2 - j3) >= ((long) C5726n.m19931a(i2 - 1));
        }
        return false;
    }
}
