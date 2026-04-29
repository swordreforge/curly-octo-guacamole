package gyi;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.basemodule.resource.C1793p;
import yz.C7794k;
import zy.dd;

/* JADX INFO: renamed from: gyi.k */
/* JADX INFO: compiled from: IncallShowDBHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class C6068k extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: g */
    public static final String f35056g = "phone";

    /* JADX INFO: renamed from: h */
    private static final String f35057h = "IncallShowDBHelper";

    /* JADX INFO: renamed from: i */
    private static final int f35058i = 2;

    /* JADX INFO: renamed from: n */
    public static final String f35059n = "incall_table";

    /* JADX INFO: renamed from: p */
    public static final String f35060p = "-1";

    /* JADX INFO: renamed from: q */
    public static final String f35061q = "incall.db";

    /* JADX INFO: renamed from: s */
    public static final String f35062s = "path";

    /* JADX INFO: renamed from: y */
    public static final String f35063y = "isSpecific";

    /* JADX INFO: renamed from: k */
    private boolean f35064k;

    public C6068k(Context context) {
        super(context, f35061q, (SQLiteDatabase.CursorFactory) null, 2);
        this.f35064k = false;
    }

    /* JADX INFO: renamed from: k */
    public static void m22354k(String phone) {
        if (TextUtils.isEmpty(phone)) {
            return;
        }
        try {
            bf2.toq.toq().openOrCreateDatabase(f35061q, 0, null).delete(f35059n, "phone = ?", new String[]{phone});
        } catch (Exception e2) {
            C7794k.m28195n(f35057h, "delete failed: " + e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: p */
    public static Cursor m22355p(@dd Context context, String phone, String pkg) {
        if (TextUtils.isEmpty(phone)) {
            phone = f35060p;
        }
        Cursor cursorQuery = null;
        if (context == null) {
            try {
                context = bf2.toq.toq();
            } catch (Exception e2) {
                C7794k.m28195n(f35057h, "query failed: " + e2.getMessage());
            }
        }
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = context.openOrCreateDatabase(f35061q, 0, null);
        cursorQuery = sQLiteDatabaseOpenOrCreateDatabase.query(f35059n, null, "phone = ?", new String[]{phone}, null, null, null);
        if ((cursorQuery == null || cursorQuery.getCount() == 0) && !f35060p.equals(phone)) {
            cursorQuery = sQLiteDatabaseOpenOrCreateDatabase.query(f35059n, null, "phone = ?", new String[]{f35060p}, null, null, null);
        }
        if (pkg != null) {
            C1793p.m6954k(context, pkg);
        }
        return cursorQuery;
    }

    /* JADX INFO: renamed from: q */
    public static void m22356q(String phone, String path) {
        if (TextUtils.isEmpty(path)) {
            return;
        }
        if (TextUtils.isEmpty(phone)) {
            phone = f35060p;
        }
        try {
            SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = bf2.toq.toq().openOrCreateDatabase(f35061q, 0, null);
            ContentValues contentValues = new ContentValues(3);
            Cursor cursorM22355p = m22355p(null, phone, null);
            if (cursorM22355p == null || !cursorM22355p.moveToFirst()) {
                contentValues.put("phone", phone);
                contentValues.put(f35063y, Boolean.valueOf(f35060p.equals(phone) ? false : true));
                contentValues.put("path", path);
                sQLiteDatabaseOpenOrCreateDatabase.insert(f35059n, null, contentValues);
            } else {
                contentValues.put("path", path);
                sQLiteDatabaseOpenOrCreateDatabase.update(f35059n, contentValues, "phone = ?", new String[]{phone});
            }
        } catch (Exception e2) {
            C7794k.m28195n(f35057h, "insertOrUpdate failed: " + e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: y */
    public static boolean m22357y() {
        Cursor cursorM22355p = m22355p(null, f35060p, null);
        if (cursorM22355p != null) {
            z = cursorM22355p.getCount() > 0;
            cursorM22355p.close();
        }
        return z;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table if not exists incall_table(id INTEGER PRIMARY KEY AUTOINCREMENT, phone TEXT, isSpecific INTEGER, path TEXT)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (newVersion == 2) {
            db.delete(f35059n, null, null);
            Log.i(f35057h, "onUpgrade. version. 2");
        }
    }

    public void zy() {
        if (this.f35064k) {
            return;
        }
        try {
            getReadableDatabase().close();
            this.f35064k = true;
        } catch (Exception unused) {
        }
    }
}
