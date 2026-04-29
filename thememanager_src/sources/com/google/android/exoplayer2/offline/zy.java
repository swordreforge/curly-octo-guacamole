package com.google.android.exoplayer2.offline;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.database.C3288y;
import com.google.android.exoplayer2.offline.DownloadRequest;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import com.xiaomi.onetrack.util.C5814z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zy.dd;
import zy.yz;

/* JADX INFO: compiled from: DefaultDownloadIndex.java */
/* JADX INFO: loaded from: classes2.dex */
public final class zy implements fti {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private static final int f65093a9 = 8;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private static final String f65095d2ok = "id = ?";

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private static final int f65096d3 = 12;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private static final int f65098eqxt = 14;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @yz
    static final int f65099f7l8 = 3;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private static final int f65101fti = 9;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final int f65102fu4 = 1;

    /* JADX INFO: renamed from: g */
    private static final String f21073g = "ExoPlayerDownloads";

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private static final int f65103gvn7 = 11;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private static final int f65104jk = 7;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static final int f65105jp0y = 10;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final String f65106ki = "stop_reason";

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private static final String f65109lvui = "state = 2";

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final int f65110mcp = 6;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final String f65111n7h = "state";

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private static final String f65112ncyb = "1";

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final int f65113ni7 = 0;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final int f65114o1t = 3;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private static final int f65115oc = 13;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f65116qrj = "data";

    /* JADX INFO: renamed from: t */
    private static final int f21079t = 5;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final int f65118wvg = 4;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private static final String f65120x9kr = "(id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)";

    /* JADX INFO: renamed from: y */
    private static final String f21080y = "id";

    /* JADX INFO: renamed from: z */
    private static final int f21081z = 2;

    /* JADX INFO: renamed from: k */
    private final String f21082k;

    /* JADX INFO: renamed from: n */
    @zy.o1t("initializationLock")
    private boolean f21083n;

    /* JADX INFO: renamed from: q */
    private final Object f21084q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final String f65122toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final com.google.android.exoplayer2.database.zy f65123zy;

    /* JADX INFO: renamed from: r */
    private static final String f21077r = m12474h(3, 4);

    /* JADX INFO: renamed from: s */
    private static final String f21078s = "mime_type";

    /* JADX INFO: renamed from: p */
    private static final String f21076p = "uri";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f65108ld6 = "stream_keys";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f65119x2 = "custom_cache_key";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final String f65107kja0 = "start_time_ms";

    /* JADX INFO: renamed from: h */
    private static final String f21074h = "update_time_ms";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final String f65094cdj = "content_length";

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final String f65117t8r = "failure_reason";

    /* JADX INFO: renamed from: i */
    private static final String f21075i = "percent_downloaded";

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final String f65100fn3e = "bytes_downloaded";

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final String f65121zurt = "key_set_id";

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private static final String[] f65097dd = {"id", f21078s, f21076p, f65108ld6, f65119x2, "data", "state", f65107kja0, f21074h, f65094cdj, "stop_reason", f65117t8r, f21075i, f65100fn3e, f65121zurt};

    /* JADX INFO: compiled from: DefaultDownloadIndex.java */
    private static final class toq implements InterfaceC3526g {

        /* JADX INFO: renamed from: k */
        private final Cursor f21085k;

        @Override // com.google.android.exoplayer2.offline.InterfaceC3526g, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f21085k.close();
        }

        @Override // com.google.android.exoplayer2.offline.InterfaceC3526g
        public int getCount() {
            return this.f21085k.getCount();
        }

        @Override // com.google.android.exoplayer2.offline.InterfaceC3526g
        public int getPosition() {
            return this.f21085k.getPosition();
        }

        @Override // com.google.android.exoplayer2.offline.InterfaceC3526g
        public boolean isClosed() {
            return this.f21085k.isClosed();
        }

        @Override // com.google.android.exoplayer2.offline.InterfaceC3526g
        public boolean moveToPosition(int i2) {
            return this.f21085k.moveToPosition(i2);
        }

        @Override // com.google.android.exoplayer2.offline.InterfaceC3526g
        /* JADX INFO: renamed from: u */
        public C3531n mo12382u() {
            return zy.n7h(this.f21085k);
        }

        private toq(Cursor cursor) {
            this.f21085k = cursor;
        }
    }

    public zy(com.google.android.exoplayer2.database.zy zyVar) {
        this(zyVar, "");
    }

    private static String cdj(@dd String str) {
        return "dash".equals(str) ? com.google.android.exoplayer2.util.wvg.f23295a : "hls".equals(str) ? com.google.android.exoplayer2.util.wvg.f67149zp : "ss".equals(str) ? com.google.android.exoplayer2.util.wvg.f23317x : com.google.android.exoplayer2.util.wvg.f23319z;
    }

    /* JADX INFO: renamed from: h */
    private static String m12474h(int... iArr) {
        if (iArr.length == 0) {
            return "1";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state");
        sb.append(" IN (");
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (i2 > 0) {
                sb.append(',');
            }
            sb.append(iArr[i2]);
        }
        sb.append(')');
        return sb.toString();
    }

    private List<C3531n> ki(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!lrht.ixz(sQLiteDatabase, this.f65122toq)) {
            return arrayList;
        }
        Cursor cursorQuery = sQLiteDatabase.query(this.f65122toq, new String[]{"id", "title", f21076p, f65108ld6, f65119x2, "data", "state", f65107kja0, f21074h, f65094cdj, "stop_reason", f65117t8r, f21075i, f65100fn3e}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(kja0(cursorQuery));
            } finally {
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    private static C3531n kja0(Cursor cursor) {
        DownloadRequest downloadRequestM12362k = new DownloadRequest.C3522k((String) C3844k.f7l8(cursor.getString(0)), Uri.parse((String) C3844k.f7l8(cursor.getString(2)))).m12363n(cdj(cursor.getString(1))).m12361g(m12475p(cursor.getString(3))).toq(cursor.getString(4)).zy(cursor.getBlob(5)).m12362k();
        fn3e fn3eVar = new fn3e();
        fn3eVar.f20954k = cursor.getLong(13);
        fn3eVar.f65025toq = cursor.getFloat(12);
        int i2 = cursor.getInt(6);
        return new C3531n(downloadRequestM12362k, i2, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i2 == 4 ? cursor.getInt(11) : 0, fn3eVar);
    }

    @yz
    static String ld6(List<StreamKey> list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            StreamKey streamKey = list.get(i2);
            sb.append(streamKey.f20930k);
            sb.append('.');
            sb.append(streamKey.f20932q);
            sb.append('.');
            sb.append(streamKey.f20931n);
            sb.append(',');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C3531n n7h(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        DownloadRequest.C3522k c3522kM12361g = new DownloadRequest.C3522k((String) C3844k.f7l8(cursor.getString(0)), Uri.parse((String) C3844k.f7l8(cursor.getString(2)))).m12363n(cursor.getString(1)).m12361g(m12475p(cursor.getString(3)));
        if (blob.length <= 0) {
            blob = null;
        }
        DownloadRequest downloadRequestM12362k = c3522kM12361g.m12364q(blob).toq(cursor.getString(4)).zy(cursor.getBlob(5)).m12362k();
        fn3e fn3eVar = new fn3e();
        fn3eVar.f20954k = cursor.getLong(13);
        fn3eVar.f65025toq = cursor.getFloat(12);
        int i2 = cursor.getInt(6);
        return new C3531n(downloadRequestM12362k, i2, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i2 == 4 ? cursor.getInt(11) : 0, fn3eVar);
    }

    /* JADX INFO: renamed from: p */
    private static List<StreamKey> m12475p(@dd String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        for (String str2 : lrht.mbx(str, ",")) {
            String[] strArrMbx = lrht.mbx(str2, C5814z.f32495a);
            C3844k.m13633s(strArrMbx.length == 3);
            arrayList.add(new StreamKey(Integer.parseInt(strArrMbx[0]), Integer.parseInt(strArrMbx[1]), Integer.parseInt(strArrMbx[2])));
        }
        return arrayList;
    }

    private Cursor qrj(String str, @dd String[] strArr) throws com.google.android.exoplayer2.database.toq {
        try {
            return this.f65123zy.getReadableDatabase().query(this.f65122toq, f65097dd, str, strArr, null, null, "start_time_ms ASC");
        } catch (SQLiteException e2) {
            throw new com.google.android.exoplayer2.database.toq(e2);
        }
    }

    private void t8r(C3531n c3531n, SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = c3531n.f20973k.f20924y;
        if (bArr == null) {
            bArr = lrht.f23228g;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", c3531n.f20973k.f20919k);
        contentValues.put(f21078s, c3531n.f20973k.f20920n);
        contentValues.put(f21076p, c3531n.f20973k.f20922q.toString());
        contentValues.put(f65108ld6, ld6(c3531n.f20973k.f20918g));
        contentValues.put(f65119x2, c3531n.f20973k.f20923s);
        contentValues.put("data", c3531n.f20973k.f20921p);
        contentValues.put("state", Integer.valueOf(c3531n.f65039toq));
        contentValues.put(f65107kja0, Long.valueOf(c3531n.f65040zy));
        contentValues.put(f21074h, Long.valueOf(c3531n.f20975q));
        contentValues.put(f65094cdj, Long.valueOf(c3531n.f20974n));
        contentValues.put("stop_reason", Integer.valueOf(c3531n.f20972g));
        contentValues.put(f65117t8r, Integer.valueOf(c3531n.f65038f7l8));
        contentValues.put(f21075i, Float.valueOf(c3531n.toq()));
        contentValues.put(f65100fn3e, Long.valueOf(c3531n.m12391k()));
        contentValues.put(f65121zurt, bArr);
        sQLiteDatabase.replaceOrThrow(this.f65122toq, null, contentValues);
    }

    private void x2() throws com.google.android.exoplayer2.database.toq {
        synchronized (this.f21084q) {
            if (this.f21083n) {
                return;
            }
            try {
                int qVar = C3288y.toq(this.f65123zy.getReadableDatabase(), 0, this.f21082k);
                if (qVar != 3) {
                    SQLiteDatabase writableDatabase = this.f65123zy.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        C3288y.m11561q(writableDatabase, 0, this.f21082k, 3);
                        List<C3531n> listKi = qVar == 2 ? ki(writableDatabase) : new ArrayList<>();
                        String strValueOf = String.valueOf(this.f65122toq);
                        writableDatabase.execSQL(strValueOf.length() != 0 ? "DROP TABLE IF EXISTS ".concat(strValueOf) : new String("DROP TABLE IF EXISTS "));
                        String str = this.f65122toq;
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 415);
                        sb.append("CREATE TABLE ");
                        sb.append(str);
                        sb.append(" ");
                        sb.append(f65120x9kr);
                        writableDatabase.execSQL(sb.toString());
                        Iterator<C3531n> it = listKi.iterator();
                        while (it.hasNext()) {
                            t8r(it.next(), writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                this.f21083n = true;
            } catch (SQLException e2) {
                throw new com.google.android.exoplayer2.database.toq(e2);
            }
        }
    }

    @Override // com.google.android.exoplayer2.offline.InterfaceC3527h
    @dd
    public C3531n f7l8(String str) throws com.google.android.exoplayer2.database.toq {
        x2();
        try {
            Cursor cursorQrj = qrj(f65095d2ok, new String[]{str});
            try {
                if (cursorQrj.getCount() == 0) {
                    cursorQrj.close();
                    return null;
                }
                cursorQrj.moveToNext();
                C3531n c3531nN7h = n7h(cursorQrj);
                cursorQrj.close();
                return c3531nN7h;
            } finally {
            }
        } catch (SQLiteException e2) {
            throw new com.google.android.exoplayer2.database.toq(e2);
        }
        throw new com.google.android.exoplayer2.database.toq(e2);
    }

    @Override // com.google.android.exoplayer2.offline.fti
    /* JADX INFO: renamed from: g */
    public void mo12378g() throws com.google.android.exoplayer2.database.toq {
        x2();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            this.f65123zy.getWritableDatabase().update(this.f65122toq, contentValues, f65109lvui, null);
        } catch (SQLException e2) {
            throw new com.google.android.exoplayer2.database.toq(e2);
        }
    }

    @Override // com.google.android.exoplayer2.offline.fti
    /* JADX INFO: renamed from: k */
    public void mo12379k(String str, int i2) throws com.google.android.exoplayer2.database.toq {
        x2();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i2));
            SQLiteDatabase writableDatabase = this.f65123zy.getWritableDatabase();
            String str2 = this.f65122toq;
            String str3 = f21077r;
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 11);
            sb.append(str3);
            sb.append(" AND ");
            sb.append(f65095d2ok);
            writableDatabase.update(str2, contentValues, sb.toString(), new String[]{str});
        } catch (SQLException e2) {
            throw new com.google.android.exoplayer2.database.toq(e2);
        }
    }

    @Override // com.google.android.exoplayer2.offline.fti
    /* JADX INFO: renamed from: n */
    public void mo12380n() throws com.google.android.exoplayer2.database.toq {
        x2();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 5);
            contentValues.put(f65117t8r, (Integer) 0);
            this.f65123zy.getWritableDatabase().update(this.f65122toq, contentValues, null, null);
        } catch (SQLException e2) {
            throw new com.google.android.exoplayer2.database.toq(e2);
        }
    }

    @Override // com.google.android.exoplayer2.offline.InterfaceC3527h
    /* JADX INFO: renamed from: q */
    public InterfaceC3526g mo12383q(int... iArr) throws com.google.android.exoplayer2.database.toq {
        x2();
        return new toq(qrj(m12474h(iArr), null));
    }

    @Override // com.google.android.exoplayer2.offline.fti
    public void toq(String str) throws com.google.android.exoplayer2.database.toq {
        x2();
        try {
            this.f65123zy.getWritableDatabase().delete(this.f65122toq, f65095d2ok, new String[]{str});
        } catch (SQLiteException e2) {
            throw new com.google.android.exoplayer2.database.toq(e2);
        }
    }

    @Override // com.google.android.exoplayer2.offline.fti
    /* JADX INFO: renamed from: y */
    public void mo12381y(C3531n c3531n) throws com.google.android.exoplayer2.database.toq {
        x2();
        try {
            t8r(c3531n, this.f65123zy.getWritableDatabase());
        } catch (SQLiteException e2) {
            throw new com.google.android.exoplayer2.database.toq(e2);
        }
    }

    @Override // com.google.android.exoplayer2.offline.fti
    public void zy(int i2) throws com.google.android.exoplayer2.database.toq {
        x2();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i2));
            this.f65123zy.getWritableDatabase().update(this.f65122toq, contentValues, f21077r, null);
        } catch (SQLException e2) {
            throw new com.google.android.exoplayer2.database.toq(e2);
        }
    }

    public zy(com.google.android.exoplayer2.database.zy zyVar, String str) {
        this.f21082k = str;
        this.f65123zy = zyVar;
        String strValueOf = String.valueOf(str);
        this.f65122toq = strValueOf.length() != 0 ? f21073g.concat(strValueOf) : new String(f21073g);
        this.f21084q = new Object();
    }
}
