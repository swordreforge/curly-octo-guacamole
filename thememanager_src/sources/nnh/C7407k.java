package nnh;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import com.xiaomi.push.z4j7;

/* JADX INFO: renamed from: nnh.k */
/* JADX INFO: loaded from: classes3.dex */
public class C7407k extends ContentProvider {

    /* JADX INFO: renamed from: n */
    private static final UriMatcher f42744n;

    /* JADX INFO: renamed from: q */
    public static final Uri f42745q = Uri.parse("content://com.xiaomi.push.providers.TrafficProvider/traffic");

    /* JADX INFO: renamed from: k */
    private SQLiteOpenHelper f42746k;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f42744n = uriMatcher;
        uriMatcher.addURI("com.xiaomi.push.providers.TrafficProvider", "traffic", 1);
        uriMatcher.addURI("com.xiaomi.push.providers.TrafficProvider", "update_imsi", 2);
    }

    @Override // android.content.ContentProvider
    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        if (f42744n.match(uri) == 1) {
            return "vnd.android.cursor.dir/vnd.xiaomi.push.traffic";
        }
        throw new IllegalArgumentException("Unknown URI " + uri);
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f42746k = new toq(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor cursorQuery;
        synchronized (toq.f42749q) {
            if (f42744n.match(uri) != 1) {
                throw new IllegalArgumentException("Unknown URI " + uri);
            }
            cursorQuery = this.f42746k.getReadableDatabase().query("traffic", strArr, str, strArr2, null, null, str2);
        }
        return cursorQuery;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (f42744n.match(uri) != 2 || contentValues == null || !contentValues.containsKey("imsi")) {
            return 0;
        }
        z4j7.qrj(contentValues.getAsString("imsi"));
        return 0;
    }
}
