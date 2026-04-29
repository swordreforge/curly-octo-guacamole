package com.xiaomi.push;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
class fti implements InterfaceC5868i {

    /* JADX INFO: renamed from: k */
    private Context f32945k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static String f73335toq = "content://com.vivo.vms.IdProvider/IdentifierId/";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static String f73336zy = f73335toq + "OAID";

    /* JADX INFO: renamed from: q */
    private static String f32944q = f73335toq + "VAID_";

    /* JADX INFO: renamed from: n */
    private static String f32943n = f73335toq + "AAID_";

    /* JADX INFO: renamed from: g */
    private static String f32942g = f73335toq + "OAIDSTATUS";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static String f73334f7l8 = "persist.sys.identifierid.supported";

    public fti(Context context) {
        this.f32945k = context;
    }

    /* JADX INFO: renamed from: k */
    private String m20881k(String str) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        String string = null;
        try {
            cursorQuery = this.f32945k.getContentResolver().query(Uri.parse(str), null, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToNext()) {
                        string = cursorQuery.getString(cursorQuery.getColumnIndex("value"));
                    }
                } catch (Exception unused) {
                    if (cursorQuery != null) {
                    }
                    return string;
                } catch (Throwable th2) {
                    th = th2;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            }
        } catch (Exception unused2) {
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            cursorQuery = null;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return string;
    }

    public static boolean toq(Context context) {
        try {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(Uri.parse(f73335toq).getAuthority(), 128);
            if (providerInfoResolveContentProvider != null) {
                if ((providerInfoResolveContentProvider.applicationInfo.flags & 1) != 0) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // com.xiaomi.push.InterfaceC5868i
    /* JADX INFO: renamed from: a */
    public boolean mo20573a() {
        return "1".equals(mla.m21289k(f73334f7l8, "0"));
    }

    @Override // com.xiaomi.push.InterfaceC5868i
    /* JADX INFO: renamed from: a */
    public String mo20572a() {
        return m20881k(f73336zy);
    }
}
