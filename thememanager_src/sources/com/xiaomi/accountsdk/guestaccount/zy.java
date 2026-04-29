package com.xiaomi.accountsdk.guestaccount;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.xiaomi.accountsdk.guestaccount.data.EnumC5515n;
import com.xiaomi.accountsdk.guestaccount.data.GuestAccount;
import com.xiaomi.accountsdk.utils.AbstractC5574n;

/* JADX INFO: compiled from: GuestAccountDatabaseHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class zy extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: c */
    private static final int f30905c = 2;

    /* JADX INFO: renamed from: e */
    private static final String f30906e = "GuestAccountDatabaseHe";

    /* JADX INFO: renamed from: f */
    private static final String f30907f = "guest_account.db";

    /* JADX INFO: renamed from: g */
    private static final String f30908g = "userType";

    /* JADX INFO: renamed from: k */
    private static final String f30912k = "userId";

    /* JADX INFO: renamed from: n */
    private static final String f30914n = "passToken";

    /* JADX INFO: renamed from: q */
    private static final String f30916q = "cUserId";

    /* JADX INFO: renamed from: s */
    private static final String f30918s = "serviceToken";

    /* JADX INFO: renamed from: z */
    private static final String f30921z = "account";

    /* JADX INFO: renamed from: r */
    private static final String f30917r = String.format("CREATE TABLE IF NOT EXISTS %s (%s INTEGER PRIMARY KEY, %s TEXT, %s TEXT,%s TEXT, %s INTEGER DEFAULT 0)", "account", "_id", "userId", "cUserId", "passToken", "userType");

    /* JADX INFO: renamed from: t */
    private static final String f30919t = "service_token";

    /* JADX INFO: renamed from: y */
    private static final String f30920y = "sid";

    /* JADX INFO: renamed from: p */
    private static final String f30915p = "security";

    /* JADX INFO: renamed from: h */
    private static final String f30909h = "slh";

    /* JADX INFO: renamed from: i */
    private static final String f30910i = "ph";

    /* JADX INFO: renamed from: l */
    private static final String f30913l = String.format("CREATE TABLE IF NOT EXISTS %s (%s INTEGER PRIMARY KEY, %s TEXT, %s TEXT, %s TEXT,  %s TEXT, %s TEXT, %s TEXT)", f30919t, "_id", "userId", f30920y, "serviceToken", f30915p, f30909h, f30910i);

    /* JADX INFO: renamed from: j */
    private static volatile zy f30911j = null;

    public zy(Context context) {
        super(context, f30907f, (SQLiteDatabase.CursorFactory) null, 2);
    }

    /* JADX INFO: renamed from: k */
    public static synchronized zy m18899k(Context context) {
        if (f30911j == null) {
            f30911j = new zy(context.getApplicationContext());
        }
        return f30911j;
    }

    public synchronized void ld6(GuestAccount guestAccount) {
        if (guestAccount == null) {
            throw new IllegalArgumentException("ga == null");
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(f30920y, guestAccount.f30831n);
        contentValues.put("serviceToken", guestAccount.f30827g);
        contentValues.put(f30915p, guestAccount.f30835y);
        contentValues.put(f30909h, guestAccount.f30828h);
        contentValues.put(f30910i, guestAccount.f30829i);
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (writableDatabase.update(f30919t, contentValues, "sid=?", new String[]{guestAccount.f30831n}) > 0) {
            AbstractC5574n.m19115y(f30906e, "1 entry updated in guest_account/serviceToken database");
        } else {
            writableDatabase.insert(f30919t, null, contentValues);
            AbstractC5574n.m19115y(f30906e, "1 entry inserted in guest_account/serviceToken database");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(f30917r);
        sQLiteDatabase.execSQL(f30913l);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        AbstractC5574n.zurt(f30906e, "downgrade ignore");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        AbstractC5574n.zurt(f30906e, "upgrade from version " + i2 + " to version" + i3);
        if (i3 == 2 && i2 == 1) {
            try {
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.execSQL("ALTER TABLE account ADD COLUMN cUserId TEXT");
                sQLiteDatabase.setTransactionSuccessful();
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public synchronized void m18900p(GuestAccount guestAccount) {
        if (guestAccount == null) {
            throw new IllegalArgumentException("ga == null");
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("userId", guestAccount.f30830k);
        contentValues.put("cUserId", guestAccount.f30833q);
        contentValues.put("passToken", guestAccount.f30834s);
        EnumC5515n enumC5515n = guestAccount.f30836z;
        contentValues.put("userType", Integer.valueOf(enumC5515n != null ? enumC5515n.serverValue : -1));
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (writableDatabase.update("account", contentValues, null, null) > 0) {
            AbstractC5574n.m19115y(f30906e, "1 entry updated in guest_account/account database");
        } else {
            writableDatabase.insert("account", null, contentValues);
            AbstractC5574n.m19115y(f30906e, "1 entry inserted in guest_account/account database");
        }
    }

    /* JADX INFO: renamed from: q */
    public void m18901q() {
        getWritableDatabase().delete("account", null, null);
        getWritableDatabase().delete(f30919t, null, null);
    }

    /* JADX INFO: renamed from: y */
    public void m18902y(String str) {
        ld6(new GuestAccount.C5512k().ki(str).cdj("").m18855h("").t8r("").kja0("").ld6());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.xiaomi.accountsdk.guestaccount.data.GuestAccount zy(java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.accountsdk.guestaccount.zy.zy(java.lang.String):com.xiaomi.accountsdk.guestaccount.data.GuestAccount");
    }
}
