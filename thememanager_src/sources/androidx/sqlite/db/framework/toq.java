package androidx.sqlite.db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.sqlite.db.InterfaceC1175q;
import zy.hyr;

/* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.java */
/* JADX INFO: loaded from: classes.dex */
class toq implements InterfaceC1175q {

    /* JADX INFO: renamed from: k */
    private final C1171k f6350k;

    /* JADX INFO: renamed from: androidx.sqlite.db.framework.toq$k */
    /* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.java */
    static class C1171k extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: k */
        final C1168k[] f6351k;

        /* JADX INFO: renamed from: n */
        private boolean f6352n;

        /* JADX INFO: renamed from: q */
        final InterfaceC1175q.k f6353q;

        /* JADX INFO: renamed from: androidx.sqlite.db.framework.toq$k$k */
        /* JADX INFO: compiled from: FrameworkSQLiteOpenHelper.java */
        class k implements DatabaseErrorHandler {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ InterfaceC1175q.k f6354k;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            final /* synthetic */ C1168k[] f52460toq;

            k(InterfaceC1175q.k kVar, C1168k[] c1168kArr) {
                this.f6354k = kVar;
                this.f52460toq = c1168kArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f6354k.zy(C1171k.m5278q(this.f52460toq, sQLiteDatabase));
            }
        }

        C1171k(Context context, String str, C1168k[] c1168kArr, InterfaceC1175q.k kVar) {
            super(context, str, null, kVar.f6355k, new k(kVar, c1168kArr));
            this.f6353q = kVar;
            this.f6351k = c1168kArr;
        }

        /* JADX INFO: renamed from: q */
        static C1168k m5278q(C1168k[] c1168kArr, SQLiteDatabase sQLiteDatabase) {
            C1168k c1168k = c1168kArr[0];
            if (c1168k == null || !c1168k.m5274k(sQLiteDatabase)) {
                c1168kArr[0] = new C1168k(sQLiteDatabase);
            }
            return c1168kArr[0];
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.f6351k[0] = null;
        }

        /* JADX INFO: renamed from: k */
        synchronized androidx.sqlite.db.zy m5279k() {
            this.f6352n = false;
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            if (!this.f6352n) {
                return zy(readableDatabase);
            }
            close();
            return m5279k();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f6353q.toq(zy(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f6353q.mo5157q(zy(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            this.f6352n = true;
            this.f6353q.mo5156n(zy(sQLiteDatabase), i2, i3);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.f6352n) {
                return;
            }
            this.f6353q.mo5155g(zy(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            this.f6352n = true;
            this.f6353q.f7l8(zy(sQLiteDatabase), i2, i3);
        }

        /* JADX INFO: renamed from: y */
        synchronized androidx.sqlite.db.zy m5280y() {
            this.f6352n = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (!this.f6352n) {
                return zy(writableDatabase);
            }
            close();
            return m5280y();
        }

        C1168k zy(SQLiteDatabase sQLiteDatabase) {
            return m5278q(this.f6351k, sQLiteDatabase);
        }
    }

    toq(Context context, String str, InterfaceC1175q.k kVar) {
        this.f6350k = zy(context, str, kVar);
    }

    private C1171k zy(Context context, String str, InterfaceC1175q.k kVar) {
        return new C1171k(context, str, new C1168k[1], kVar);
    }

    @Override // androidx.sqlite.db.InterfaceC1175q
    public void close() {
        this.f6350k.close();
    }

    @Override // androidx.sqlite.db.InterfaceC1175q
    public androidx.sqlite.db.zy getReadableDatabase() {
        return this.f6350k.m5279k();
    }

    @Override // androidx.sqlite.db.InterfaceC1175q
    public androidx.sqlite.db.zy getWritableDatabase() {
        return this.f6350k.m5280y();
    }

    @Override // androidx.sqlite.db.InterfaceC1175q
    @hyr(api = 16)
    /* JADX INFO: renamed from: k */
    public void mo5150k(boolean z2) {
        this.f6350k.setWriteAheadLoggingEnabled(z2);
    }

    @Override // androidx.sqlite.db.InterfaceC1175q
    public String toq() {
        return this.f6350k.getDatabaseName();
    }
}
