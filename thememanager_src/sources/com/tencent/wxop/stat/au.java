package com.tencent.wxop.stat;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.tencent.wxop.stat.common.C5381a;
import com.tencent.wxop.stat.common.C5385e;
import com.tencent.wxop.stat.common.C5392l;
import com.tencent.wxop.stat.common.C5398r;
import com.tencent.wxop.stat.common.StatLogger;
import com.tencent.wxop.stat.event.AbstractC5405e;
import com.xiaomi.onetrack.p009a.C5675a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class au {

    /* JADX INFO: renamed from: h */
    private static StatLogger f30045h = C5392l.m18418b();

    /* JADX INFO: renamed from: i */
    private static Context f30046i = null;

    /* JADX INFO: renamed from: j */
    private static au f30047j = null;

    /* JADX INFO: renamed from: c */
    private bc f30050c;

    /* JADX INFO: renamed from: d */
    private bc f30051d;

    /* JADX INFO: renamed from: e */
    private C5385e f30052e;

    /* JADX INFO: renamed from: f */
    private String f30053f;

    /* JADX INFO: renamed from: g */
    private String f30054g;

    /* JADX INFO: renamed from: l */
    private ConcurrentHashMap<AbstractC5405e, String> f30056l;

    /* JADX INFO: renamed from: a */
    volatile int f30048a = 0;

    /* JADX INFO: renamed from: b */
    C5381a f30049b = null;

    /* JADX INFO: renamed from: k */
    private int f30055k = 0;

    /* JADX INFO: renamed from: m */
    private boolean f30057m = false;

    /* JADX INFO: renamed from: n */
    private HashMap<String, String> f30058n = new HashMap<>();

    private au(Context context) {
        this.f30050c = null;
        this.f30051d = null;
        this.f30052e = null;
        this.f30053f = "";
        this.f30054g = "";
        this.f30056l = null;
        try {
            this.f30052e = new C5385e();
            f30046i = context.getApplicationContext();
            this.f30056l = new ConcurrentHashMap<>();
            this.f30053f = C5392l.m18440p(context);
            this.f30054g = "pri_" + C5392l.m18440p(context);
            this.f30050c = new bc(f30046i, this.f30053f);
            this.f30051d = new bc(f30046i, this.f30054g);
            m18347a(true);
            m18347a(false);
            m18357f();
            m18368b(f30046i);
            m18370d();
            m18361j();
        } catch (Throwable th) {
            f30045h.m18376e(th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static au m18335a(Context context) {
        if (f30047j == null) {
            synchronized (au.class) {
                if (f30047j == null) {
                    f30047j = new au(context);
                }
            }
        }
        return f30047j;
    }

    /* JADX INFO: renamed from: a */
    private String m18336a(List<bd> list) {
        StringBuilder sb = new StringBuilder(list.size() * 3);
        sb.append("event_id in (");
        int size = list.size();
        Iterator<bd> it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            sb.append(it.next().f30084a);
            if (i2 != size - 1) {
                sb.append(",");
            }
            i2++;
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m18337a(int i2, boolean z2) {
        try {
            if (this.f30048a > 0 && i2 > 0 && !StatServiceImpl.m18286a()) {
                if (StatConfig.isDebugEnable()) {
                    f30045h.m18377i("Load " + this.f30048a + " unsent events");
                }
                ArrayList arrayList = new ArrayList(i2);
                m18353b(arrayList, i2, z2);
                if (arrayList.size() > 0) {
                    if (StatConfig.isDebugEnable()) {
                        f30045h.m18377i("Peek " + arrayList.size() + " unsent events.");
                    }
                    m18345a(arrayList, 2, z2);
                    C5415i.m18501b(f30046i).m18504b(arrayList, new ba(this, arrayList, z2));
                }
            }
        } catch (Throwable th) {
            f30045h.m18376e(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m18344a(com.tencent.wxop.stat.event.AbstractC5405e r9, com.tencent.wxop.stat.InterfaceC5414h r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wxop.stat.au.m18344a(com.tencent.wxop.stat.event.e, com.tencent.wxop.stat.h, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public synchronized void m18345a(List<bd> list, int i2, boolean z2) {
        SQLiteDatabase sQLiteDatabaseM18354c;
        String str;
        if (list.size() == 0) {
            return;
        }
        int iM18348b = m18348b(z2);
        SQLiteDatabase sQLiteDatabase = null;
        str = null;
        String str2 = null;
        try {
            sQLiteDatabaseM18354c = m18354c(z2);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (i2 == 2) {
                str = "update events set status=" + i2 + ", send_count=send_count+1  where " + m18336a(list);
            } else {
                str = "update events set status=" + i2 + " where " + m18336a(list);
                if (this.f30055k % 3 == 0) {
                    str2 = "delete from events where send_count>" + iM18348b;
                }
                this.f30055k++;
            }
            if (StatConfig.isDebugEnable()) {
                f30045h.m18377i("update sql:" + str);
            }
            sQLiteDatabaseM18354c.beginTransaction();
            sQLiteDatabaseM18354c.execSQL(str);
            if (str2 != null) {
                f30045h.m18377i("update for delete sql:" + str2);
                sQLiteDatabaseM18354c.execSQL(str2);
                m18357f();
            }
            sQLiteDatabaseM18354c.setTransactionSuccessful();
            try {
                sQLiteDatabaseM18354c.endTransaction();
            } catch (Throwable th2) {
                f30045h.m18376e(th2);
            }
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase = sQLiteDatabaseM18354c;
            try {
                f30045h.m18376e(th);
            } finally {
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable th4) {
                        f30045h.m18376e(th4);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public synchronized void m18346a(List<bd> list, boolean z2) {
        SQLiteDatabase sQLiteDatabaseM18354c;
        Throwable th;
        if (list.size() == 0) {
            return;
        }
        if (StatConfig.isDebugEnable()) {
            f30045h.m18377i("Delete " + list.size() + " events, important:" + z2);
        }
        StringBuilder sb = new StringBuilder(list.size() * 3);
        sb.append("event_id in (");
        int i2 = 0;
        int size = list.size();
        Iterator<bd> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next().f30084a);
            if (i2 != size - 1) {
                sb.append(",");
            }
            i2++;
        }
        sb.append(")");
        try {
            sQLiteDatabaseM18354c = m18354c(z2);
            try {
                sQLiteDatabaseM18354c.beginTransaction();
                int iDelete = sQLiteDatabaseM18354c.delete("events", sb.toString(), null);
                if (StatConfig.isDebugEnable()) {
                    f30045h.m18377i("delete " + size + " event " + sb.toString() + ", success delete:" + iDelete);
                }
                this.f30048a -= iDelete;
                sQLiteDatabaseM18354c.setTransactionSuccessful();
                m18357f();
                try {
                    sQLiteDatabaseM18354c.endTransaction();
                } catch (Throwable th2) {
                    f30045h.m18376e(th2);
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    f30045h.m18376e(th);
                } finally {
                    if (sQLiteDatabaseM18354c != null) {
                        try {
                            sQLiteDatabaseM18354c.endTransaction();
                        } catch (Throwable th4) {
                            f30045h.m18376e(th4);
                        }
                    }
                }
            }
        } catch (Throwable th5) {
            sQLiteDatabaseM18354c = null;
            th = th5;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m18347a(boolean z2) {
        SQLiteDatabase sQLiteDatabaseM18354c;
        try {
            try {
                sQLiteDatabaseM18354c = m18354c(z2);
                try {
                    sQLiteDatabaseM18354c.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("status", (Integer) 1);
                    int iUpdate = sQLiteDatabaseM18354c.update("events", contentValues, "status=?", new String[]{Long.toString(2L)});
                    if (StatConfig.isDebugEnable()) {
                        f30045h.m18377i("update " + iUpdate + " unsent events.");
                    }
                    sQLiteDatabaseM18354c.setTransactionSuccessful();
                    sQLiteDatabaseM18354c.endTransaction();
                } catch (Throwable th) {
                    th = th;
                    try {
                        f30045h.m18376e(th);
                        if (sQLiteDatabaseM18354c != null) {
                            sQLiteDatabaseM18354c.endTransaction();
                        }
                    } catch (Throwable th2) {
                        if (sQLiteDatabaseM18354c != null) {
                            try {
                                sQLiteDatabaseM18354c.endTransaction();
                            } catch (Throwable th3) {
                                f30045h.m18376e(th3);
                            }
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                sQLiteDatabaseM18354c = null;
            }
        } catch (Throwable th5) {
            f30045h.m18376e(th5);
        }
    }

    /* JADX INFO: renamed from: b */
    private int m18348b(boolean z2) {
        return !z2 ? StatConfig.getMaxSendRetryCount() : StatConfig.getMaxImportantDataSendRetryCount();
    }

    /* JADX INFO: renamed from: b */
    public static au m18349b() {
        return f30047j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m18350b(int i2, boolean z2) {
        if (i2 == -1) {
            i2 = !z2 ? m18358g() : m18359h();
        }
        if (i2 > 0) {
            int sendPeriodMinutes = StatConfig.getSendPeriodMinutes() * 60 * StatConfig.getNumEventsCommitPerSec();
            if (i2 > sendPeriodMinutes && sendPeriodMinutes > 0) {
                i2 = sendPeriodMinutes;
            }
            int iM18263a = StatConfig.m18263a();
            int i3 = i2 / iM18263a;
            int i4 = i2 % iM18263a;
            if (StatConfig.isDebugEnable()) {
                f30045h.m18377i("sentStoreEventsByDb sendNumbers=" + i2 + ",important=" + z2 + ",maxSendNumPerFor1Period=" + sendPeriodMinutes + ",maxCount=" + i3 + ",restNumbers=" + i4);
            }
            for (int i5 = 0; i5 < i3; i5++) {
                m18337a(iM18263a, z2);
            }
            if (i4 > 0) {
                m18337a(i4, z2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public synchronized void m18351b(AbstractC5405e abstractC5405e, InterfaceC5414h interfaceC5414h, boolean z2, boolean z3) {
        if (StatConfig.getMaxStoreEventCount() > 0) {
            int i2 = StatConfig.f29948m;
            if (i2 > 0 && !z2 && !z3) {
                if (i2 > 0) {
                    if (StatConfig.isDebugEnable()) {
                        f30045h.m18377i("cacheEventsInMemory.size():" + this.f30056l.size() + ",numEventsCachedInMemory:" + StatConfig.f29948m + ",numStoredEvents:" + this.f30048a);
                        StatLogger statLogger = f30045h;
                        StringBuilder sb = new StringBuilder("cache event:");
                        sb.append(abstractC5405e.m18490g());
                        statLogger.m18377i(sb.toString());
                    }
                    this.f30056l.put(abstractC5405e, "");
                    if (this.f30056l.size() >= StatConfig.f29948m) {
                        m18360i();
                    }
                    if (interfaceC5414h != null) {
                        if (this.f30056l.size() > 0) {
                            m18360i();
                        }
                        interfaceC5414h.mo18333a();
                    }
                }
            }
            m18344a(abstractC5405e, interfaceC5414h, z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public synchronized void m18352b(C5412f c5412f) {
        boolean z2;
        long jInsert;
        Cursor cursor = null;
        try {
            String strM18492a = c5412f.m18492a();
            String strM18412a = C5392l.m18412a(strM18492a);
            ContentValues contentValues = new ContentValues();
            contentValues.put("content", c5412f.f30216b.toString());
            contentValues.put("md5sum", strM18412a);
            c5412f.f30217c = strM18412a;
            contentValues.put("version", Integer.valueOf(c5412f.f30218d));
            Cursor cursorQuery = this.f30050c.getReadableDatabase().query("config", null, null, null, null, null, null);
            while (true) {
                try {
                    if (!cursorQuery.moveToNext()) {
                        z2 = false;
                        break;
                    } else if (cursorQuery.getInt(0) == c5412f.f30215a) {
                        z2 = true;
                        break;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    try {
                        f30045h.m18376e(th);
                        try {
                            this.f30050c.getWritableDatabase().endTransaction();
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    } finally {
                        if (cursor != null) {
                            cursor.close();
                        }
                        try {
                            this.f30050c.getWritableDatabase().endTransaction();
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
            this.f30050c.getWritableDatabase().beginTransaction();
            if (true == z2) {
                jInsert = this.f30050c.getWritableDatabase().update("config", contentValues, "type=?", new String[]{Integer.toString(c5412f.f30215a)});
            } else {
                contentValues.put("type", Integer.valueOf(c5412f.f30215a));
                jInsert = this.f30050c.getWritableDatabase().insert("config", null, contentValues);
            }
            if (jInsert == -1) {
                f30045h.m18375e("Failed to store cfg:" + strM18492a);
            } else {
                f30045h.m18374d("Sucessed to store cfg:" + strM18492a);
            }
            this.f30050c.getWritableDatabase().setTransactionSuccessful();
            cursorQuery.close();
            try {
                this.f30050c.getWritableDatabase().endTransaction();
            } catch (Exception unused3) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m18353b(List<bd> list, int i2, boolean z2) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = m18355d(z2).query("events", null, "status=?", new String[]{Integer.toString(1)}, null, null, null, Integer.toString(i2));
            while (cursorQuery.moveToNext()) {
                long j2 = cursorQuery.getLong(0);
                String string = cursorQuery.getString(1);
                if (!StatConfig.f29942g) {
                    string = C5398r.m18464a(string);
                }
                String str = string;
                int i3 = cursorQuery.getInt(2);
                int i4 = cursorQuery.getInt(3);
                bd bdVar = new bd(j2, str, i3, i4);
                if (StatConfig.isDebugEnable()) {
                    f30045h.m18377i("peek event, id=" + j2 + ",send_count=" + i4 + ",timestamp=" + cursorQuery.getLong(4));
                }
                list.add(bdVar);
            }
            cursorQuery.close();
        } catch (Throwable th) {
            try {
                f30045h.m18376e(th);
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private SQLiteDatabase m18354c(boolean z2) {
        return (!z2 ? this.f30050c : this.f30051d).getWritableDatabase();
    }

    /* JADX INFO: renamed from: d */
    private SQLiteDatabase m18355d(boolean z2) {
        return (!z2 ? this.f30050c : this.f30051d).getReadableDatabase();
    }

    /* JADX INFO: renamed from: f */
    private void m18357f() {
        this.f30048a = m18358g() + m18359h();
    }

    /* JADX INFO: renamed from: g */
    private int m18358g() {
        return (int) DatabaseUtils.queryNumEntries(this.f30050c.getReadableDatabase(), "events");
    }

    /* JADX INFO: renamed from: h */
    private int m18359h() {
        return (int) DatabaseUtils.queryNumEntries(this.f30051d.getReadableDatabase(), "events");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m18360i() {
        StatLogger statLogger;
        if (this.f30057m) {
            return;
        }
        synchronized (this.f30056l) {
            if (this.f30056l.size() == 0) {
                return;
            }
            this.f30057m = true;
            if (StatConfig.isDebugEnable()) {
                f30045h.m18377i("insert " + this.f30056l.size() + " events ,numEventsCachedInMemory:" + StatConfig.f29948m + ",numStoredEvents:" + this.f30048a);
            }
            SQLiteDatabase sQLiteDatabase = null;
            try {
                SQLiteDatabase writableDatabase = this.f30050c.getWritableDatabase();
                try {
                    writableDatabase.beginTransaction();
                    Iterator<Map.Entry<AbstractC5405e, String>> it = this.f30056l.entrySet().iterator();
                    while (it.hasNext()) {
                        AbstractC5405e key = it.next().getKey();
                        ContentValues contentValues = new ContentValues();
                        String strM18490g = key.m18490g();
                        if (StatConfig.isDebugEnable()) {
                            f30045h.m18377i("insert content:" + strM18490g);
                        }
                        contentValues.put("content", C5398r.m18469b(strM18490g));
                        contentValues.put(C5675a.a.f31589i, "0");
                        contentValues.put("status", Integer.toString(1));
                        contentValues.put("timestamp", Long.valueOf(key.m18486c()));
                        writableDatabase.insert("events", null, contentValues);
                        it.remove();
                    }
                    writableDatabase.setTransactionSuccessful();
                    try {
                        writableDatabase.endTransaction();
                        m18357f();
                    } catch (Throwable th) {
                        th = th;
                        statLogger = f30045h;
                        statLogger.m18376e(th);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase = writableDatabase;
                    try {
                        f30045h.m18376e(th);
                        if (sQLiteDatabase != null) {
                            try {
                                sQLiteDatabase.endTransaction();
                                m18357f();
                            } catch (Throwable th3) {
                                th = th3;
                                statLogger = f30045h;
                                statLogger.m18376e(th);
                            }
                        }
                    } finally {
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
            this.f30057m = false;
            if (StatConfig.isDebugEnable()) {
                f30045h.m18377i("after insert, cacheEventsInMemory.size():" + this.f30056l.size() + ",numEventsCachedInMemory:" + StatConfig.f29948m + ",numStoredEvents:" + this.f30048a);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    private void m18361j() {
        Cursor cursorQuery = null;
        try {
            cursorQuery = this.f30050c.getReadableDatabase().query("keyvalues", null, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                this.f30058n.put(cursorQuery.getString(0), cursorQuery.getString(1));
            }
            cursorQuery.close();
        } catch (Throwable th) {
            try {
                f30045h.m18376e(th);
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public int m18362a() {
        return this.f30048a;
    }

    /* JADX INFO: renamed from: a */
    void m18363a(int i2) {
        this.f30052e.m18389a(new bb(this, i2));
    }

    /* JADX INFO: renamed from: a */
    void m18364a(AbstractC5405e abstractC5405e, InterfaceC5414h interfaceC5414h, boolean z2, boolean z3) {
        C5385e c5385e = this.f30052e;
        if (c5385e != null) {
            c5385e.m18389a(new ay(this, abstractC5405e, interfaceC5414h, z2, z3));
        }
    }

    /* JADX INFO: renamed from: a */
    void m18365a(C5412f c5412f) {
        if (c5412f == null) {
            return;
        }
        this.f30052e.m18389a(new az(this, c5412f));
    }

    /* JADX INFO: renamed from: a */
    void m18366a(List<bd> list, int i2, boolean z2, boolean z3) {
        C5385e c5385e = this.f30052e;
        if (c5385e != null) {
            c5385e.m18389a(new av(this, list, i2, z2, z3));
        }
    }

    /* JADX INFO: renamed from: a */
    void m18367a(List<bd> list, boolean z2, boolean z3) {
        C5385e c5385e = this.f30052e;
        if (c5385e != null) {
            c5385e.m18389a(new aw(this, list, z2, z3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[Catch: all -> 0x01c7, TryCatch #4 {all -> 0x01c7, blocks: (B:15:0x0037, B:17:0x0041, B:19:0x005e, B:23:0x0072, B:25:0x007c, B:26:0x007e, B:28:0x0086, B:30:0x0089, B:32:0x008d, B:43:0x00b1, B:45:0x00b4, B:51:0x00ec, B:53:0x011e, B:55:0x0131, B:58:0x0141, B:60:0x014b, B:62:0x0151, B:64:0x0167, B:65:0x01aa, B:46:0x00cb, B:48:0x00d1, B:50:0x00d7, B:36:0x0098, B:38:0x009e, B:41:0x00a9), top: B:105:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0141 A[Catch: all -> 0x01c7, TryCatch #4 {all -> 0x01c7, blocks: (B:15:0x0037, B:17:0x0041, B:19:0x005e, B:23:0x0072, B:25:0x007c, B:26:0x007e, B:28:0x0086, B:30:0x0089, B:32:0x008d, B:43:0x00b1, B:45:0x00b4, B:51:0x00ec, B:53:0x011e, B:55:0x0131, B:58:0x0141, B:60:0x014b, B:62:0x0151, B:64:0x0167, B:65:0x01aa, B:46:0x00cb, B:48:0x00d1, B:50:0x00d7, B:36:0x0098, B:38:0x009e, B:41:0x00a9), top: B:105:0x0037 }] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized com.tencent.wxop.stat.common.C5381a m18368b(android.content.Context r19) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wxop.stat.au.m18368b(android.content.Context):com.tencent.wxop.stat.common.a");
    }

    /* JADX INFO: renamed from: c */
    void m18369c() {
        if (StatConfig.isEnableStatService()) {
            try {
                this.f30052e.m18389a(new ax(this));
            } catch (Throwable th) {
                f30045h.m18376e(th);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    void m18370d() {
        Cursor cursorQuery = null;
        try {
            cursorQuery = this.f30050c.getReadableDatabase().query("config", null, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                int i2 = cursorQuery.getInt(0);
                String string = cursorQuery.getString(1);
                String string2 = cursorQuery.getString(2);
                int i3 = cursorQuery.getInt(3);
                C5412f c5412f = new C5412f(i2);
                c5412f.f30215a = i2;
                c5412f.f30216b = new JSONObject(string);
                c5412f.f30217c = string2;
                c5412f.f30218d = i3;
                StatConfig.m18267a(f30046i, c5412f);
            }
            cursorQuery.close();
        } catch (Throwable th) {
            try {
                f30045h.m18376e(th);
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        }
    }
}
