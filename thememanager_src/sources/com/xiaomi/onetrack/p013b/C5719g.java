package com.xiaomi.onetrack.p013b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/* JADX INFO: renamed from: com.xiaomi.onetrack.b.g */
/* JADX INFO: loaded from: classes3.dex */
public class C5719g extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a */
    public static final String f31936a = "one_track_cloud";

    /* JADX INFO: renamed from: b */
    public static final String f31937b = "events_cloud";

    /* JADX INFO: renamed from: c */
    public static final String f31938c = "_id";

    /* JADX INFO: renamed from: d */
    public static final String f31939d = "app_id";

    /* JADX INFO: renamed from: e */
    public static final String f31940e = "cloud_data";

    /* JADX INFO: renamed from: f */
    public static final String f31941f = "data_hash";

    /* JADX INFO: renamed from: g */
    public static final String f31942g = "timestamp";

    /* JADX INFO: renamed from: h */
    static final String f31943h = "CREATE TABLE events_cloud (_id  INTEGER PRIMARY KEY AUTOINCREMENT,app_id TEXT,cloud_data TEXT,timestamp INTEGER,data_hash TEXT)";

    /* JADX INFO: renamed from: i */
    private static final String f31944i = "ConfigDatabaseHelper";

    /* JADX INFO: renamed from: j */
    private static final int f31945j = 1;

    public C5719g(Context context) {
        super(context, f31936a, (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(f31943h);
        Log.d(f31944i, "onCreate: ");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }
}
