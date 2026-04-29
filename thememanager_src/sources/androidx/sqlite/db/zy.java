package androidx.sqlite.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;
import java.util.Locale;
import zy.hyr;

/* JADX INFO: compiled from: SupportSQLiteDatabase.java */
/* JADX INFO: loaded from: classes.dex */
public interface zy extends Closeable {
    /* JADX INFO: renamed from: a */
    Cursor mo5270a(InterfaceC1172g interfaceC1172g);

    @hyr(api = 16)
    Cursor a9(InterfaceC1172g interfaceC1172g, CancellationSignal cancellationSignal);

    /* JADX INFO: renamed from: b */
    boolean mo5271b(int i2);

    List<Pair<String, String>> cdj();

    InterfaceC1176y d8wk(String str);

    boolean dd();

    /* JADX INFO: renamed from: do */
    void mo28249do(int i2);

    /* JADX INFO: renamed from: e */
    void mo5272e(SQLiteTransactionListener sQLiteTransactionListener);

    void ebn(long j2);

    long etdu();

    long gc3c(String str, int i2, ContentValues contentValues) throws SQLException;

    String getPath();

    int getVersion();

    void hb();

    /* JADX INFO: renamed from: i */
    void mo5273i(String str) throws SQLException;

    boolean i9jn();

    boolean isOpen();

    @hyr(api = 16)
    boolean ixz();

    Cursor kcsr(String str);

    /* JADX INFO: renamed from: l */
    void mo5275l();

    long lvui();

    @hyr(api = 16)
    void m4(boolean z2);

    boolean mbx();

    boolean mu(long j2);

    long n5r1(long j2);

    void n7h();

    void ncyb(String str, Object[] objArr) throws SQLException;

    boolean nn86();

    Cursor qkj8(String str, Object[] objArr);

    void qo(int i2);

    int qrj(String str, String str2, Object[] objArr);

    void setLocale(Locale locale);

    int sok(String str, int i2, ContentValues contentValues, String str2, Object[] objArr);

    @hyr(api = 16)
    void t8r();

    void vep5(SQLiteTransactionListener sQLiteTransactionListener);

    void x9kr();

    boolean z4();

    boolean zurt();
}
