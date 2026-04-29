package fnq8;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.android.thememanager.maml.model.db.C2139k;
import com.android.thememanager.util.C2789j;
import java.util.List;
import miuix.core.util.f7l8;
import qo.C7618k;
import tfm.C7674k;
import zy.lvui;

/* JADX INFO: compiled from: InformationDao.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq implements InterfaceC6042k {

    /* JADX INFO: renamed from: q */
    private static final String f34695q = "rowid as _id";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f75163zy = "toq";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private C2139k f75164toq = C2139k.m8177k();

    /* JADX INFO: renamed from: k */
    private String[] f34696k = {f34695q, "*"};

    /* JADX INFO: renamed from: p */
    private static C7618k m22272p(@lvui Cursor cursor) {
        C7618k c7618k = new C7618k();
        c7618k.title = cursor.getString(cursor.getColumnIndex("_title"));
        c7618k.content = cursor.getString(cursor.getColumnIndex("_content"));
        c7618k.imageId = cursor.getString(cursor.getColumnIndex("_imgId"));
        c7618k.imageLocalPath = cursor.getString(cursor.getColumnIndex("_image"));
        c7618k.imageOnlineUrl = cursor.getString(cursor.getColumnIndex("_image_online_url"));
        c7618k.detail = cursor.getString(cursor.getColumnIndex("_detail"));
        c7618k.url = cursor.getString(cursor.getColumnIndex("_url"));
        c7618k.isLiked = cursor.getInt(cursor.getColumnIndex(C7618k.IS_LIKED)) == 1;
        c7618k.likeNumber = cursor.getInt(cursor.getColumnIndex(C7618k.LIKE_NUMBER));
        return c7618k;
    }

    /* JADX INFO: renamed from: s */
    public static C7618k m22273s(@lvui Cursor cursor) {
        C7618k c7618kM22272p = m22272p(cursor);
        c7618kM22272p.cmUrl = cursor.getString(cursor.getColumnIndex("_cmUrl"));
        c7618kM22272p.tvmUrl = cursor.getString(cursor.getColumnIndex("_tvmUrl"));
        c7618kM22272p.likeUrl = cursor.getString(cursor.getColumnIndex("_likeUrl"));
        c7618kM22272p.dislikeUrl = cursor.getString(cursor.getColumnIndex("_dislikeUrl"));
        c7618kM22272p.trackId = cursor.getString(cursor.getColumnIndex(C7618k.TRACK_ID));
        c7618kM22272p.createTime = cursor.getInt(cursor.getColumnIndex(C7618k.CREATE_TIME));
        c7618kM22272p.updateTime = cursor.getInt(cursor.getColumnIndex(C7618k.UPDATE_TIME));
        return c7618kM22272p;
    }

    @Override // fnq8.InterfaceC6042k
    public Cursor f7l8(@lvui String imageId) {
        return this.f75164toq.getWritableDatabase().query("information", this.f34696k, "_imgId=" + imageId, null, null, null, null);
    }

    @Override // fnq8.InterfaceC6042k
    /* JADX INFO: renamed from: g */
    public void mo22267g(@lvui List<C7674k> informationList) {
        SQLiteDatabase writableDatabase = this.f75164toq.getWritableDatabase();
        writableDatabase.beginTransaction();
        for (C7674k c7674k : informationList) {
            String str = com.android.thememanager.maml.model.toq.f12616s + c7674k.imageId;
            String str2 = c7674k.imageUrl;
            ContentValues contentValues = new ContentValues();
            contentValues.put("_imgId", c7674k.imageId);
            contentValues.put("_title", c7674k.title);
            contentValues.put("_content", c7674k.content);
            contentValues.put("_cmUrl", c7674k.cmUrl);
            contentValues.put("_tvmUrl", c7674k.tvmUrl);
            contentValues.put("_likeUrl", c7674k.likeUrl);
            contentValues.put("_dislikeUrl", c7674k.dislikeUrl);
            contentValues.put("_image", str);
            contentValues.put("_image_online_url", str2);
            contentValues.put(C7618k.IS_LIKED, Boolean.valueOf(c7674k.isLiked));
            contentValues.put(C7618k.LIKE_NUMBER, Integer.valueOf(c7674k.likeNumber));
            contentValues.put(C7618k.UPDATE_TIME, Long.valueOf(System.currentTimeMillis()));
            C7674k.k kVar = c7674k.link;
            if (kVar != null) {
                contentValues.put("_detail", kVar.title);
                contentValues.put("_url", c7674k.link.link);
                contentValues.put(C7618k.TRACK_ID, c7674k.link.trackId);
            }
            if (writableDatabase.updateWithOnConflict("information", contentValues, "_imgId = ?", new String[]{c7674k.imageId}, 5) <= 0) {
                contentValues.put(C7618k.CREATE_TIME, Long.valueOf(System.currentTimeMillis()));
                writableDatabase.insertWithOnConflict("information", null, contentValues, 5);
            }
        }
        writableDatabase.setTransactionSuccessful();
        writableDatabase.endTransaction();
    }

    @Override // fnq8.InterfaceC6042k
    public int getCount() {
        Cursor cursorQuery = null;
        try {
            cursorQuery = this.f75164toq.getWritableDatabase().query("information", null, null, null, null, null, null);
            return cursorQuery.getCount();
        } catch (Exception e2) {
            C2789j.qrj(f75163zy, e2);
            return 0;
        } finally {
            f7l8.m25531k(cursorQuery);
        }
    }

    @Override // fnq8.InterfaceC6042k
    /* JADX INFO: renamed from: k */
    public void mo22268k(@lvui C7618k informationModel) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_imgId", informationModel.imageId);
        contentValues.put("_title", informationModel.title);
        contentValues.put("_content", informationModel.content);
        contentValues.put("_cmUrl", informationModel.cmUrl);
        contentValues.put("_tvmUrl", informationModel.tvmUrl);
        contentValues.put("_likeUrl", informationModel.likeUrl);
        contentValues.put("_dislikeUrl", informationModel.dislikeUrl);
        contentValues.put(C7618k.TRACK_ID, informationModel.trackId);
        contentValues.put("_image", informationModel.imageLocalPath);
        contentValues.put("_image_online_url", informationModel.imageOnlineUrl);
        contentValues.put(C7618k.LIKE_NUMBER, Integer.valueOf(informationModel.likeNumber));
        contentValues.put(C7618k.IS_LIKED, Boolean.valueOf(informationModel.isLiked));
        contentValues.put("_detail", informationModel.detail);
        contentValues.put("_url", informationModel.url);
        contentValues.put(C7618k.UPDATE_TIME, Long.valueOf(System.currentTimeMillis()));
        this.f75164toq.getWritableDatabase().update("information", contentValues, "_imgId = ?", new String[]{informationModel.imageId});
    }

    @Override // fnq8.InterfaceC6042k
    /* JADX INFO: renamed from: n */
    public Cursor mo22269n(int id, int number) {
        return this.f75164toq.getWritableDatabase().query("information", this.f34696k, null, null, null, null, null, id + "," + number);
    }

    @Override // fnq8.InterfaceC6042k
    /* JADX INFO: renamed from: q */
    public Cursor mo22270q(int id) {
        return mo22269n(id - 2, 3);
    }

    @Override // fnq8.InterfaceC6042k
    public void toq(@lvui List<C7618k> informationList) {
        SQLiteDatabase writableDatabase = this.f75164toq.getWritableDatabase();
        writableDatabase.beginTransaction();
        for (C7618k c7618k : informationList) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_imgId", c7618k.imageId);
            contentValues.put("_title", c7618k.title);
            contentValues.put("_content", c7618k.content);
            contentValues.put("_cmUrl", c7618k.cmUrl);
            contentValues.put("_tvmUrl", c7618k.tvmUrl);
            contentValues.put("_likeUrl", c7618k.likeUrl);
            contentValues.put("_dislikeUrl", c7618k.dislikeUrl);
            contentValues.put(C7618k.TRACK_ID, c7618k.trackId);
            contentValues.put("_image", c7618k.imageLocalPath);
            contentValues.put("_image_online_url", c7618k.imageOnlineUrl);
            contentValues.put(C7618k.IS_LIKED, Boolean.valueOf(c7618k.isLiked));
            contentValues.put(C7618k.LIKE_NUMBER, Integer.valueOf(c7618k.likeNumber));
            contentValues.put(C7618k.UPDATE_TIME, Long.valueOf(System.currentTimeMillis()));
            contentValues.put("_detail", c7618k.title);
            contentValues.put("_url", c7618k.url);
            writableDatabase.updateWithOnConflict("information", contentValues, "_imgId = ?", new String[]{c7618k.imageId}, 5);
        }
        writableDatabase.setTransactionSuccessful();
        writableDatabase.endTransaction();
    }

    @Override // fnq8.InterfaceC6042k
    /* JADX INFO: renamed from: y */
    public C7618k mo22271y(@lvui String imageId) throws Throwable {
        Throwable th;
        Cursor cursorF7l8;
        try {
            cursorF7l8 = f7l8(imageId);
            try {
                if (!cursorF7l8.moveToNext()) {
                    f7l8.m25531k(cursorF7l8);
                    return null;
                }
                C7618k c7618kM22273s = m22273s(cursorF7l8);
                f7l8.m25531k(cursorF7l8);
                return c7618kM22273s;
            } catch (Throwable th2) {
                th = th2;
                f7l8.m25531k(cursorF7l8);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            cursorF7l8 = null;
        }
    }

    @Override // fnq8.InterfaceC6042k
    public C7618k zy(int id) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        try {
            cursorQuery = this.f75164toq.getWritableDatabase().query("information", this.f34696k, null, null, null, null, null, (id - 1) + ",1");
            try {
                if (!cursorQuery.moveToNext()) {
                    f7l8.m25531k(cursorQuery);
                    return null;
                }
                C7618k c7618kM22273s = m22273s(cursorQuery);
                f7l8.m25531k(cursorQuery);
                return c7618kM22273s;
            } catch (Throwable th2) {
                th = th2;
                f7l8.m25531k(cursorQuery);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            cursorQuery = null;
        }
    }
}
