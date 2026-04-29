package com.xiaomi.onetrack.p014c;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.xiaomi.onetrack.p013b.C5726n;
import com.xiaomi.onetrack.util.C5804p;
import java.util.Calendar;

/* JADX INFO: renamed from: com.xiaomi.onetrack.c.g */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5733g implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C5729c f32012a;

    RunnableC5733g(C5729c c5729c) {
        this.f32012a = c5729c;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f32012a.f31996j == null) {
            return;
        }
        synchronized (this.f32012a.f31996j) {
            Cursor cursorQuery = null;
            try {
                try {
                    SQLiteDatabase writableDatabase = this.f32012a.f31996j.getWritableDatabase();
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(System.currentTimeMillis());
                    calendar.set(6, calendar.get(6) - 7);
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    String[] strArr = {Long.toString(calendar.getTimeInMillis())};
                    cursorQuery = writableDatabase.query("events", new String[]{"timestamp"}, "timestamp < ? ", strArr, null, null, "timestamp ASC");
                    if (cursorQuery.getCount() != 0) {
                        C5804p.m20342a("EventManager", "*** deleted obsolete item count=" + writableDatabase.delete("events", "timestamp < ? ", strArr));
                    }
                    long jM19955c = C5729c.m19943a().m19955c();
                    C5726n.m19932a(jM19955c == 0);
                    C5804p.m20342a("EventManager", "after delete obsolete record remains=" + jM19955c);
                } catch (Exception e2) {
                    C5804p.m20353d("EventManager", "remove obsolete events failed with " + e2);
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
}
