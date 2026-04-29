package com.xiaomi.onetrack.p009a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.xiaomi.onetrack.p009a.C5675a;
import com.xiaomi.onetrack.util.C5804p;
import java.util.Calendar;

/* JADX INFO: renamed from: com.xiaomi.onetrack.a.c */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5680c implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C5675a f31610a;

    RunnableC5680c(C5675a c5675a) {
        this.f31610a = c5675a;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f31610a.f31580i == null) {
            return;
        }
        synchronized (this.f31610a.f31580i) {
            Cursor cursorQuery = null;
            try {
                try {
                    SQLiteDatabase writableDatabase = this.f31610a.f31580i.getWritableDatabase();
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(System.currentTimeMillis());
                    calendar.set(6, calendar.get(6) - 7);
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    String[] strArr = {Long.toString(calendar.getTimeInMillis())};
                    cursorQuery = writableDatabase.query(C5675a.a.f31582b, new String[]{"timestamp"}, "timestamp < ? ", strArr, null, null, "timestamp ASC");
                    if (cursorQuery.getCount() != 0) {
                        C5804p.m20342a("AdMonitorManager", "*** deleted obsolete ad monitor count=" + writableDatabase.delete(C5675a.a.f31582b, "timestamp < ? ", strArr));
                    }
                    if (C5804p.f32410a) {
                        C5804p.m20342a("AdMonitorManager", "after delete obsolete ad monitor record remains=" + this.f31610a.m19659e());
                    }
                } catch (Exception e2) {
                    C5804p.m20353d("AdMonitorManager", "remove obsolete ad monitor failed with " + e2);
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
