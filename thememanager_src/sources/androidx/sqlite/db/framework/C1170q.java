package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteProgram;
import androidx.sqlite.db.InterfaceC1174n;

/* JADX INFO: renamed from: androidx.sqlite.db.framework.q */
/* JADX INFO: compiled from: FrameworkSQLiteProgram.java */
/* JADX INFO: loaded from: classes.dex */
class C1170q implements InterfaceC1174n {

    /* JADX INFO: renamed from: k */
    private final SQLiteProgram f6349k;

    C1170q(SQLiteProgram sQLiteProgram) {
        this.f6349k = sQLiteProgram;
    }

    @Override // androidx.sqlite.db.InterfaceC1174n
    public void b3e(int i2) {
        this.f6349k.bindNull(i2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f6349k.close();
    }

    @Override // androidx.sqlite.db.InterfaceC1174n
    public void mcp(int i2, double d2) {
        this.f6349k.bindDouble(i2, d2);
    }

    @Override // androidx.sqlite.db.InterfaceC1174n
    public void pc() {
        this.f6349k.clearBindings();
    }

    @Override // androidx.sqlite.db.InterfaceC1174n
    public void tfm(int i2, String str) {
        this.f6349k.bindString(i2, str);
    }

    @Override // androidx.sqlite.db.InterfaceC1174n
    public void v0af(int i2, long j2) {
        this.f6349k.bindLong(i2, j2);
    }

    @Override // androidx.sqlite.db.InterfaceC1174n
    public void w831(int i2, byte[] bArr) {
        this.f6349k.bindBlob(i2, bArr);
    }
}
