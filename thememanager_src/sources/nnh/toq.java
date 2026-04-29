package nnh;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.xiaomi.channel.commonutils.logger.zy;

/* JADX INFO: loaded from: classes3.dex */
public class toq extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: k */
    private static int f42747k = 1;

    /* JADX INFO: renamed from: q */
    public static final Object f42749q = new Object();

    /* JADX INFO: renamed from: n */
    private static final String[] f42748n = {"package_name", "TEXT", "message_ts", " LONG DEFAULT 0 ", "bytes", " LONG DEFAULT 0 ", "network_type", " INT DEFAULT -1 ", "rcv", " INT DEFAULT -1 ", "imsi", "TEXT"};

    public toq(Context context) {
        super(context, "traffic.db", (SQLiteDatabase.CursorFactory) null, f42747k);
    }

    /* JADX INFO: renamed from: k */
    private void m26809k(SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder("CREATE TABLE traffic(_id INTEGER  PRIMARY KEY ,");
        int i2 = 0;
        while (true) {
            String[] strArr = f42748n;
            if (i2 >= strArr.length - 1) {
                sb.append(");");
                sQLiteDatabase.execSQL(sb.toString());
                return;
            }
            if (i2 != 0) {
                sb.append(",");
            }
            sb.append(strArr[i2]);
            sb.append(" ");
            sb.append(strArr[i2 + 1]);
            i2 += 2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        synchronized (f42749q) {
            try {
                m26809k(sQLiteDatabase);
            } catch (SQLException e2) {
                zy.t8r(e2);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
    }
}
