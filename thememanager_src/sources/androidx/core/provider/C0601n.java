package androidx.core.provider;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.core.content.res.C0500g;
import androidx.core.provider.C0605y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.yz;

/* JADX INFO: renamed from: androidx.core.provider.n */
/* JADX INFO: compiled from: FontProvider.java */
/* JADX INFO: loaded from: classes.dex */
class C0601n {

    /* JADX INFO: renamed from: k */
    private static final Comparator<byte[]> f3746k = new Comparator() { // from class: androidx.core.provider.q
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C0601n.f7l8((byte[]) obj, (byte[]) obj2);
        }
    };

    /* JADX INFO: renamed from: androidx.core.provider.n$k */
    /* JADX INFO: compiled from: FontProvider.java */
    @hyr(16)
    static class k {
        private k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static Cursor m2804k(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    private C0601n() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int f7l8(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2];
            byte b3 = bArr2[i2];
            if (b2 != b3) {
                return b2 - b3;
            }
        }
        return 0;
    }

    @dd
    @yz
    /* JADX INFO: renamed from: g */
    static ProviderInfo m2799g(@lvui PackageManager packageManager, @lvui C0599g c0599g, @dd Resources resources) throws PackageManager.NameNotFoundException {
        String strM2794g = c0599g.m2794g();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strM2794g, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + strM2794g);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(c0599g.f7l8())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + strM2794g + ", but package was not " + c0599g.f7l8());
        }
        List<byte[]> qVar = toq(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        Collections.sort(qVar, f3746k);
        List<List<byte[]>> listM2802q = m2802q(c0599g, resources);
        for (int i2 = 0; i2 < listM2802q.size(); i2++) {
            ArrayList arrayList = new ArrayList(listM2802q.get(i2));
            Collections.sort(arrayList, f3746k);
            if (zy(qVar, arrayList)) {
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }

    @lvui
    /* JADX INFO: renamed from: n */
    static C0605y.toq m2801n(@lvui Context context, @lvui C0599g c0599g, @dd CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfoM2799g = m2799g(context.getPackageManager(), c0599g, context.getResources());
        return providerInfoM2799g == null ? C0605y.toq.m2819k(1, null) : C0605y.toq.m2819k(0, m2803y(context, c0599g, providerInfoM2799g.authority, cancellationSignal));
    }

    /* JADX INFO: renamed from: q */
    private static List<List<byte[]>> m2802q(C0599g c0599g, Resources resources) {
        return c0599g.toq() != null ? c0599g.toq() : C0500g.zy(resources, c0599g.zy());
    }

    private static List<byte[]> toq(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    @lvui
    @yz
    /* JADX INFO: renamed from: y */
    static C0605y.zy[] m2803y(Context context, C0599g c0599g, String str, CancellationSignal cancellationSignal) {
        int i2;
        Uri uriWithAppendedId;
        int i3;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursorM2804k = null;
        try {
            int i4 = 0;
            cursorM2804k = k.m2804k(context.getContentResolver(), uriBuild, new String[]{"_id", C0605y.k.f3778k, C0605y.k.f50565toq, C0605y.k.f50566zy, C0605y.k.f3781q, C0605y.k.f3779n, C0605y.k.f3777g}, "query = ?", new String[]{c0599g.m2797y()}, null, cancellationSignal);
            if (cursorM2804k != null && cursorM2804k.getCount() > 0) {
                int columnIndex = cursorM2804k.getColumnIndex(C0605y.k.f3777g);
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursorM2804k.getColumnIndex("_id");
                int columnIndex3 = cursorM2804k.getColumnIndex(C0605y.k.f3778k);
                int columnIndex4 = cursorM2804k.getColumnIndex(C0605y.k.f50565toq);
                int columnIndex5 = cursorM2804k.getColumnIndex(C0605y.k.f3781q);
                int columnIndex6 = cursorM2804k.getColumnIndex(C0605y.k.f3779n);
                while (cursorM2804k.moveToNext()) {
                    int i5 = columnIndex != -1 ? cursorM2804k.getInt(columnIndex) : i4;
                    int i6 = columnIndex4 != -1 ? cursorM2804k.getInt(columnIndex4) : i4;
                    if (columnIndex3 == -1) {
                        i2 = i5;
                        uriWithAppendedId = ContentUris.withAppendedId(uriBuild, cursorM2804k.getLong(columnIndex2));
                    } else {
                        i2 = i5;
                        uriWithAppendedId = ContentUris.withAppendedId(uriBuild2, cursorM2804k.getLong(columnIndex3));
                    }
                    int i7 = columnIndex5 != -1 ? cursorM2804k.getInt(columnIndex5) : 400;
                    if (columnIndex6 == -1 || cursorM2804k.getInt(columnIndex6) != 1) {
                        i3 = i2;
                        z2 = false;
                    } else {
                        i3 = i2;
                        z2 = true;
                    }
                    arrayList2.add(C0605y.zy.m2820k(uriWithAppendedId, i6, i7, z2, i3));
                    i4 = 0;
                }
                arrayList = arrayList2;
            }
            return (C0605y.zy[]) arrayList.toArray(new C0605y.zy[0]);
        } finally {
            if (cursorM2804k != null) {
                cursorM2804k.close();
            }
        }
    }

    private static boolean zy(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!Arrays.equals(list.get(i2), list2.get(i2))) {
                return false;
            }
        }
        return true;
    }
}
