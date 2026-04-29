package androidx.sqlite.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: androidx.sqlite.db.q */
/* JADX INFO: compiled from: SupportSQLiteOpenHelper.java */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1175q {

    /* JADX INFO: renamed from: androidx.sqlite.db.q$k */
    /* JADX INFO: compiled from: SupportSQLiteOpenHelper.java */
    public static abstract class k {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static final String f52461toq = "SupportSQLite";

        /* JADX INFO: renamed from: k */
        public final int f6355k;

        public k(int i2) {
            this.f6355k = i2;
        }

        /* JADX INFO: renamed from: k */
        private void m5281k(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            Log.w(f52461toq, "deleting the database file: " + str);
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e2) {
                Log.w(f52461toq, "delete failed: ", e2);
            }
        }

        public abstract void f7l8(androidx.sqlite.db.zy zyVar, int i2, int i3);

        /* JADX INFO: renamed from: g */
        public void mo5155g(androidx.sqlite.db.zy zyVar) {
        }

        /* JADX INFO: renamed from: n */
        public void mo5156n(androidx.sqlite.db.zy zyVar, int i2, int i3) {
            throw new SQLiteException("Can't downgrade database from version " + i2 + " to " + i3);
        }

        /* JADX INFO: renamed from: q */
        public abstract void mo5157q(androidx.sqlite.db.zy zyVar);

        public void toq(androidx.sqlite.db.zy zyVar) {
        }

        public void zy(androidx.sqlite.db.zy zyVar) {
            Log.e(f52461toq, "Corruption reported by sqlite on database: " + zyVar.getPath());
            if (!zyVar.isOpen()) {
                m5281k(zyVar.getPath());
                return;
            }
            List<Pair<String, String>> listCdj = null;
            try {
                try {
                    listCdj = zyVar.cdj();
                } catch (SQLiteException unused) {
                }
                try {
                    zyVar.close();
                } catch (IOException unused2) {
                }
            } finally {
                if (listCdj != null) {
                    Iterator<Pair<String, String>> it = listCdj.iterator();
                    while (it.hasNext()) {
                        m5281k((String) it.next().second);
                    }
                } else {
                    m5281k(zyVar.getPath());
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.sqlite.db.q$toq */
    /* JADX INFO: compiled from: SupportSQLiteOpenHelper.java */
    public static class toq {

        /* JADX INFO: renamed from: k */
        @lvui
        public final Context f6356k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @dd
        public final String f52462toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @lvui
        public final k f52463zy;

        /* JADX INFO: renamed from: androidx.sqlite.db.q$toq$k */
        /* JADX INFO: compiled from: SupportSQLiteOpenHelper.java */
        public static class k {

            /* JADX INFO: renamed from: k */
            Context f6357k;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            String f52464toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            k f52465zy;

            k(@lvui Context context) {
                this.f6357k = context;
            }

            /* JADX INFO: renamed from: k */
            public toq m5283k() {
                k kVar = this.f52465zy;
                if (kVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                Context context = this.f6357k;
                if (context != null) {
                    return new toq(context, this.f52464toq, kVar);
                }
                throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
            }

            public k toq(@lvui k kVar) {
                this.f52465zy = kVar;
                return this;
            }

            public k zy(@dd String str) {
                this.f52464toq = str;
                return this;
            }
        }

        toq(@lvui Context context, @dd String str, @lvui k kVar) {
            this.f6356k = context;
            this.f52462toq = str;
            this.f52463zy = kVar;
        }

        /* JADX INFO: renamed from: k */
        public static k m5282k(Context context) {
            return new k(context);
        }
    }

    /* JADX INFO: renamed from: androidx.sqlite.db.q$zy */
    /* JADX INFO: compiled from: SupportSQLiteOpenHelper.java */
    public interface zy {
        /* JADX INFO: renamed from: k */
        InterfaceC1175q mo5148k(toq toqVar);
    }

    void close();

    androidx.sqlite.db.zy getReadableDatabase();

    androidx.sqlite.db.zy getWritableDatabase();

    @hyr(api = 16)
    /* JADX INFO: renamed from: k */
    void mo5150k(boolean z2);

    String toq();
}
