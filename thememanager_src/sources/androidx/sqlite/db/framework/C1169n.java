package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteStatement;
import androidx.sqlite.db.InterfaceC1176y;

/* JADX INFO: renamed from: androidx.sqlite.db.framework.n */
/* JADX INFO: compiled from: FrameworkSQLiteStatement.java */
/* JADX INFO: loaded from: classes.dex */
class C1169n extends C1170q implements InterfaceC1176y {

    /* JADX INFO: renamed from: q */
    private final SQLiteStatement f6348q;

    C1169n(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f6348q = sQLiteStatement;
    }

    @Override // androidx.sqlite.db.InterfaceC1176y
    public void f7l8() {
        this.f6348q.execute();
    }

    @Override // androidx.sqlite.db.InterfaceC1176y
    public String uv6() {
        return this.f6348q.simpleQueryForString();
    }

    @Override // androidx.sqlite.db.InterfaceC1176y
    /* JADX INFO: renamed from: v */
    public long mo5276v() {
        return this.f6348q.executeInsert();
    }

    @Override // androidx.sqlite.db.InterfaceC1176y
    public long vq() {
        return this.f6348q.simpleQueryForLong();
    }

    @Override // androidx.sqlite.db.InterfaceC1176y
    /* JADX INFO: renamed from: z */
    public int mo5277z() {
        return this.f6348q.executeUpdateDelete();
    }
}
