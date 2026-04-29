package androidx.documentfile.provider;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.controller.online.InterfaceC1925p;
import zy.dd;
import zy.hyr;

/* JADX INFO: compiled from: DocumentsContractApi19.java */
/* JADX INFO: loaded from: classes.dex */
@hyr(19)
class toq {

    /* JADX INFO: renamed from: k */
    private static final String f4352k = "DocumentFile";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f51023toq = 512;

    private toq() {
    }

    @dd
    private static String f7l8(Context context, Uri uri) {
        return m3774h(context, uri, "mime_type", null);
    }

    @dd
    /* JADX INFO: renamed from: g */
    public static String m3773g(Context context, Uri uri) {
        return m3774h(context, uri, "_display_name", null);
    }

    @dd
    /* JADX INFO: renamed from: h */
    private static String m3774h(Context context, Uri uri, String str, @dd String str2) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            return (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) ? str2 : cursorQuery.getString(0);
        } catch (Exception e2) {
            Log.w(f4352k, "Failed query: " + e2);
            return str2;
        } finally {
            zy(cursorQuery);
        }
        zy(cursorQuery);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m3775k(Context context, Uri uri) {
        return context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(f7l8(context, uri));
    }

    private static long kja0(Context context, Uri uri, String str, long j2) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            return (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) ? j2 : cursorQuery.getLong(0);
        } catch (Exception e2) {
            Log.w(f4352k, "Failed query: " + e2);
            return j2;
        } finally {
            zy(cursorQuery);
        }
        zy(cursorQuery);
    }

    public static boolean ld6(Context context, Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri) && (m3776n(context, uri) & 512) != 0;
    }

    /* JADX INFO: renamed from: n */
    public static long m3776n(Context context, Uri uri) {
        return kja0(context, uri, InterfaceC1925p.pwo, 0L);
    }

    private static int n7h(Context context, Uri uri, String str, int i2) {
        return (int) kja0(context, uri, str, i2);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m3777p(Context context, Uri uri) {
        String strF7l8 = f7l8(context, uri);
        return ("vnd.android.document/directory".equals(strF7l8) || TextUtils.isEmpty(strF7l8)) ? false : true;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m3778q(Context context, Uri uri) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(uri, new String[]{"document_id"}, null, null, null);
            return cursorQuery.getCount() > 0;
        } catch (Exception e2) {
            Log.w(f4352k, "Failed query: " + e2);
            return false;
        } finally {
            zy(cursorQuery);
        }
    }

    public static long qrj(Context context, Uri uri) {
        return kja0(context, uri, "_size", 0L);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m3779s(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(f7l8(context, uri));
    }

    public static boolean toq(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String strF7l8 = f7l8(context, uri);
        int iN7h = n7h(context, uri, InterfaceC1925p.pwo, 0);
        if (TextUtils.isEmpty(strF7l8)) {
            return false;
        }
        if ((iN7h & 4) != 0) {
            return true;
        }
        if (!"vnd.android.document/directory".equals(strF7l8) || (iN7h & 8) == 0) {
            return (TextUtils.isEmpty(strF7l8) || (iN7h & 2) == 0) ? false : true;
        }
        return true;
    }

    public static long x2(Context context, Uri uri) {
        return kja0(context, uri, "last_modified", 0L);
    }

    @dd
    /* JADX INFO: renamed from: y */
    public static String m3780y(Context context, Uri uri) {
        String strF7l8 = f7l8(context, uri);
        if ("vnd.android.document/directory".equals(strF7l8)) {
            return null;
        }
        return strF7l8;
    }

    private static void zy(@dd AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }
}
