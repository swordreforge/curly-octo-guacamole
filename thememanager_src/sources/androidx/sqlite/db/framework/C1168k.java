package androidx.sqlite.db.framework;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import androidx.sqlite.db.InterfaceC1172g;
import androidx.sqlite.db.InterfaceC1176y;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import zy.hyr;

/* JADX INFO: renamed from: androidx.sqlite.db.framework.k */
/* JADX INFO: compiled from: FrameworkSQLiteDatabase.java */
/* JADX INFO: loaded from: classes.dex */
class C1168k implements androidx.sqlite.db.zy {

    /* JADX INFO: renamed from: k */
    private final SQLiteDatabase f6345k;

    /* JADX INFO: renamed from: q */
    private static final String[] f6344q = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: n */
    private static final String[] f6343n = new String[0];

    /* JADX INFO: renamed from: androidx.sqlite.db.framework.k$k */
    /* JADX INFO: compiled from: FrameworkSQLiteDatabase.java */
    class k implements SQLiteDatabase.CursorFactory {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC1172g f6346k;

        k(InterfaceC1172g interfaceC1172g) {
            this.f6346k = interfaceC1172g;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f6346k.mo5147q(new C1170q(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* JADX INFO: renamed from: androidx.sqlite.db.framework.k$toq */
    /* JADX INFO: compiled from: FrameworkSQLiteDatabase.java */
    class toq implements SQLiteDatabase.CursorFactory {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC1172g f6347k;

        toq(InterfaceC1172g interfaceC1172g) {
            this.f6347k = interfaceC1172g;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f6347k.mo5147q(new C1170q(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    C1168k(SQLiteDatabase sQLiteDatabase) {
        this.f6345k = sQLiteDatabase;
    }

    @Override // androidx.sqlite.db.zy
    /* JADX INFO: renamed from: a */
    public Cursor mo5270a(InterfaceC1172g interfaceC1172g) {
        return this.f6345k.rawQueryWithFactory(new k(interfaceC1172g), interfaceC1172g.zy(), f6343n, null);
    }

    @Override // androidx.sqlite.db.zy
    @hyr(api = 16)
    public Cursor a9(InterfaceC1172g interfaceC1172g, CancellationSignal cancellationSignal) {
        return this.f6345k.rawQueryWithFactory(new toq(interfaceC1172g), interfaceC1172g.zy(), f6343n, null, cancellationSignal);
    }

    @Override // androidx.sqlite.db.zy
    /* JADX INFO: renamed from: b */
    public boolean mo5271b(int i2) {
        return this.f6345k.needUpgrade(i2);
    }

    @Override // androidx.sqlite.db.zy
    public List<Pair<String, String>> cdj() {
        return this.f6345k.getAttachedDbs();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f6345k.close();
    }

    @Override // androidx.sqlite.db.zy
    public InterfaceC1176y d8wk(String str) {
        return new C1169n(this.f6345k.compileStatement(str));
    }

    @Override // androidx.sqlite.db.zy
    public boolean dd() {
        return this.f6345k.enableWriteAheadLogging();
    }

    @Override // androidx.sqlite.db.zy
    /* JADX INFO: renamed from: do, reason: not valid java name */
    public void mo28249do(int i2) {
        this.f6345k.setMaxSqlCacheSize(i2);
    }

    @Override // androidx.sqlite.db.zy
    /* JADX INFO: renamed from: e */
    public void mo5272e(SQLiteTransactionListener sQLiteTransactionListener) {
        this.f6345k.beginTransactionWithListener(sQLiteTransactionListener);
    }

    @Override // androidx.sqlite.db.zy
    public void ebn(long j2) {
        this.f6345k.setPageSize(j2);
    }

    @Override // androidx.sqlite.db.zy
    public long etdu() {
        return this.f6345k.getMaximumSize();
    }

    @Override // androidx.sqlite.db.zy
    public long gc3c(String str, int i2, ContentValues contentValues) throws SQLException {
        return this.f6345k.insertWithOnConflict(str, null, contentValues, i2);
    }

    @Override // androidx.sqlite.db.zy
    public String getPath() {
        return this.f6345k.getPath();
    }

    @Override // androidx.sqlite.db.zy
    public int getVersion() {
        return this.f6345k.getVersion();
    }

    @Override // androidx.sqlite.db.zy
    public void hb() {
        this.f6345k.endTransaction();
    }

    @Override // androidx.sqlite.db.zy
    /* JADX INFO: renamed from: i */
    public void mo5273i(String str) throws SQLException {
        this.f6345k.execSQL(str);
    }

    @Override // androidx.sqlite.db.zy
    public boolean i9jn() {
        return this.f6345k.isReadOnly();
    }

    @Override // androidx.sqlite.db.zy
    public boolean isOpen() {
        return this.f6345k.isOpen();
    }

    @Override // androidx.sqlite.db.zy
    @hyr(api = 16)
    public boolean ixz() {
        return this.f6345k.isWriteAheadLoggingEnabled();
    }

    /* JADX INFO: renamed from: k */
    boolean m5274k(SQLiteDatabase sQLiteDatabase) {
        return this.f6345k == sQLiteDatabase;
    }

    @Override // androidx.sqlite.db.zy
    public Cursor kcsr(String str) {
        return mo5270a(new androidx.sqlite.db.toq(str));
    }

    @Override // androidx.sqlite.db.zy
    /* JADX INFO: renamed from: l */
    public void mo5275l() {
        this.f6345k.beginTransactionNonExclusive();
    }

    @Override // androidx.sqlite.db.zy
    public long lvui() {
        return this.f6345k.getPageSize();
    }

    @Override // androidx.sqlite.db.zy
    @hyr(api = 16)
    public void m4(boolean z2) {
        this.f6345k.setForeignKeyConstraintsEnabled(z2);
    }

    @Override // androidx.sqlite.db.zy
    public boolean mbx() {
        return this.f6345k.inTransaction();
    }

    @Override // androidx.sqlite.db.zy
    public boolean mu(long j2) {
        return this.f6345k.yieldIfContendedSafely(j2);
    }

    @Override // androidx.sqlite.db.zy
    public long n5r1(long j2) {
        return this.f6345k.setMaximumSize(j2);
    }

    @Override // androidx.sqlite.db.zy
    public void n7h() {
        this.f6345k.beginTransaction();
    }

    @Override // androidx.sqlite.db.zy
    public void ncyb(String str, Object[] objArr) throws SQLException {
        this.f6345k.execSQL(str, objArr);
    }

    @Override // androidx.sqlite.db.zy
    public boolean nn86() {
        return this.f6345k.isDbLockedByCurrentThread();
    }

    @Override // androidx.sqlite.db.zy
    public Cursor qkj8(String str, Object[] objArr) {
        return mo5270a(new androidx.sqlite.db.toq(str, objArr));
    }

    @Override // androidx.sqlite.db.zy
    public void qo(int i2) {
        this.f6345k.setVersion(i2);
    }

    @Override // androidx.sqlite.db.zy
    public int qrj(String str, String str2, Object[] objArr) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM ");
        sb.append(str);
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = " WHERE " + str2;
        }
        sb.append(str3);
        InterfaceC1176y interfaceC1176yD8wk = d8wk(sb.toString());
        androidx.sqlite.db.toq.m5284n(interfaceC1176yD8wk, objArr);
        return interfaceC1176yD8wk.mo5277z();
    }

    @Override // androidx.sqlite.db.zy
    public void setLocale(Locale locale) {
        this.f6345k.setLocale(locale);
    }

    @Override // androidx.sqlite.db.zy
    public int sok(String str, int i2, ContentValues contentValues, String str2, Object[] objArr) {
        if (contentValues == null || contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        StringBuilder sb = new StringBuilder(120);
        sb.append("UPDATE ");
        sb.append(f6344q[i2]);
        sb.append(str);
        sb.append(" SET ");
        int size = contentValues.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        int i3 = 0;
        for (String str3 : contentValues.keySet()) {
            sb.append(i3 > 0 ? "," : "");
            sb.append(str3);
            objArr2[i3] = contentValues.get(str3);
            sb.append("=?");
            i3++;
        }
        if (objArr != null) {
            for (int i4 = size; i4 < length; i4++) {
                objArr2[i4] = objArr[i4 - size];
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(" WHERE ");
            sb.append(str2);
        }
        InterfaceC1176y interfaceC1176yD8wk = d8wk(sb.toString());
        androidx.sqlite.db.toq.m5284n(interfaceC1176yD8wk, objArr2);
        return interfaceC1176yD8wk.mo5277z();
    }

    @Override // androidx.sqlite.db.zy
    @hyr(api = 16)
    public void t8r() {
        this.f6345k.disableWriteAheadLogging();
    }

    @Override // androidx.sqlite.db.zy
    public void vep5(SQLiteTransactionListener sQLiteTransactionListener) {
        this.f6345k.beginTransactionWithListenerNonExclusive(sQLiteTransactionListener);
    }

    @Override // androidx.sqlite.db.zy
    public void x9kr() {
        this.f6345k.setTransactionSuccessful();
    }

    @Override // androidx.sqlite.db.zy
    public boolean z4() {
        return this.f6345k.yieldIfContendedSafely();
    }

    @Override // androidx.sqlite.db.zy
    public boolean zurt() {
        return this.f6345k.isDatabaseIntegrityOk();
    }
}
