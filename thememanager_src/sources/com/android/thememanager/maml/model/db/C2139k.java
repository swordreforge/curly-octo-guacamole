package com.android.thememanager.maml.model.db;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.android.thememanager.C2082k;

/* JADX INFO: renamed from: com.android.thememanager.maml.model.db.k */
/* JADX INFO: compiled from: MamlDBHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2139k extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: g */
    @Deprecated
    public static final String f12599g = "newsInfo";

    /* JADX INFO: renamed from: k */
    private static final String f12600k = "maml.db";

    /* JADX INFO: renamed from: n */
    public static final String f12601n = "userAction";

    /* JADX INFO: renamed from: q */
    private static final int f12602q = 5;

    /* JADX INFO: renamed from: y */
    public static final String f12603y = "information";

    /* JADX INFO: renamed from: com.android.thememanager.maml.model.db.k$toq */
    /* JADX INFO: compiled from: MamlDBHelper.java */
    private static class toq {

        /* JADX INFO: renamed from: k */
        private static C2139k f12604k = new C2139k();

        private toq() {
        }
    }

    /* JADX INFO: renamed from: k */
    public static C2139k m8177k() {
        return toq.f12604k;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS userAction(_id INTEGER PRIMARY KEY AUTOINCREMENT, _action TEXT, _content TEXT, _guid TEXT, _moduleId TEXT)");
        db.execSQL("CREATE TABLE IF NOT EXISTS newsInfo(_id INTEGER PRIMARY KEY AUTOINCREMENT, _title TEXT, _content TEXT, _detail TEXT, _imgId TEXT, _image TEXT, _cmUrl TEXT, _tvmUrl TEXT, _likeUrl TEXT, _favoriteUrl TEXT, _dislikeUrl TEXT, _shareUrl TEXT, _url TEXT, _version TEXT, _image_online_url TEXT)");
        db.execSQL("CREATE TABLE IF NOT EXISTS information(_imgId TEXT PRIMARY KEY, _title TEXT, _content TEXT, _detail TEXT, _url TEXT, _is_liked INTEGER, _like_number INTEGER, _create_time INTEGER, _update_time INTEGER, _tvmUrl TEXT, _cmUrl TEXT, _likeUrl TEXT, _dislikeUrl TEXT, _track_id TEXT, _image TEXT, _image_online_url TEXT)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.beginTransaction();
        try {
            db.execSQL("DROP TABLE IF EXISTS userAction");
            db.execSQL("DROP TABLE IF EXISTS newsInfo");
            db.execSQL("DROP TABLE IF EXISTS information");
            onCreate(db);
            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        try {
            db.beginTransaction();
            while (oldVersion < newVersion) {
                if (oldVersion == 0 || oldVersion == 1 || oldVersion == 2 || oldVersion == 3) {
                    db.execSQL("DROP TABLE IF EXISTS newsInfo");
                }
                oldVersion++;
            }
            onCreate(db);
            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
        }
    }

    private C2139k() {
        super(C2082k.m7998k(), f12600k, (SQLiteDatabase.CursorFactory) null, 5);
    }
}
