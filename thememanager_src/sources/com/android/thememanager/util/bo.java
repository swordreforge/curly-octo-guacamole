package com.android.thememanager.util;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.media.ExtraRingtoneManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.util.Log;
import com.miui.maml.folme.AnimatedProperty;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: RingtoneCompat.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class bo {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final bo f16317k = new bo();

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private static final Map<Long, String> f16318q = new ConcurrentHashMap();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final String f61199toq = "RingtoneCompat";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private static final String f61200zy = "Ringtones/ThemeManager";

    private bo() {
    }

    private final void f7l8(long j2, String str) {
        f16318q.put(Long.valueOf(j2), kotlin.text.a9.uf(str, "/product/", "/system/", false, 4, null));
    }

    @InterfaceC7396q
    @l05.qrj
    /* JADX INFO: renamed from: g */
    public static final String m9620g(@InterfaceC7396q String filePath) {
        kotlin.jvm.internal.d2ok.m23075h(filePath, "filePath");
        String strSubstring = filePath.substring(kotlin.text.fti.x7o(filePath, '/', 0, false, 6, null) + 1);
        kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String).substring(startIndex)");
        int iB7 = kotlin.text.fti.b7(strSubstring, com.android.thememanager.basemodule.resource.constants.toq.n96, 0, false, 6, null);
        int iB72 = kotlin.text.fti.b7(strSubstring, ".", 0, false, 6, null);
        if (iB7 > 0) {
            String strSubstring2 = strSubstring.substring(0, iB7);
            kotlin.jvm.internal.d2ok.kja0(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring2;
        }
        if (iB72 <= 0) {
            return strSubstring;
        }
        String strSubstring3 = strSubstring.substring(0, iB72);
        kotlin.jvm.internal.d2ok.kja0(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring3;
    }

    @zy.y9n
    /* JADX INFO: renamed from: k */
    private final Uri m9621k(Context context, Uri uri) {
        if (uri != null && com.android.thememanager.basemodule.utils.y9n.zy() && kotlin.jvm.internal.d2ok.f7l8("file", uri.getScheme())) {
            String path = uri.getPath();
            kotlin.jvm.internal.d2ok.qrj(path);
            boolean z2 = kotlin.text.a9.r6ty(path, "/system/media/audio", false, 2, null) || kotlin.text.a9.r6ty(path, "/product/media/audio", false, 2, null);
            Uri contentUri = z2 ? MediaStore.Audio.Media.INTERNAL_CONTENT_URI : MediaStore.Audio.Media.getContentUri("external_primary");
            ContentResolver contentResolver = context.getContentResolver();
            long jZy = zy(path);
            if (jZy > -1) {
                return contentResolver.canonicalize(ContentUris.withAppendedId(contentUri, jZy));
            }
            kotlin.jvm.internal.d2ok.qrj(contentUri);
            Uri uriM9625y = m9625y(context, uri, path, contentUri);
            if (uriM9625y != null) {
                return uriM9625y;
            }
            if (!z2) {
                return toq(context, uri, path);
            }
        }
        return uri;
    }

    /* JADX INFO: renamed from: n */
    private final String m9622n(long j2) {
        return f16318q.get(Long.valueOf(j2));
    }

    @InterfaceC7396q
    @l05.qrj
    @zy.y9n
    /* JADX INFO: renamed from: q */
    public static final String m9623q(@InterfaceC7396q Context context, @InterfaceC7395n Uri uri) {
        kotlin.jvm.internal.d2ok.m23075h(context, "context");
        if (uri != null && com.android.thememanager.basemodule.utils.y9n.zy() && kotlin.jvm.internal.d2ok.f7l8(uri.getAuthority(), "media")) {
            String lastPathSegment = uri.getLastPathSegment();
            kotlin.jvm.internal.d2ok.qrj(lastPathSegment);
            long j2 = Long.parseLong(lastPathSegment);
            bo boVar = f16317k;
            String strM9622n = boVar.m9622n(j2);
            if (strM9622n != null) {
                return strM9622n;
            }
            try {
                Cursor cursorQuery = context.getContentResolver().query(MediaStore.Audio.Media.INTERNAL_CONTENT_URI, new String[]{"_data", "title"}, "_id=?", new String[]{lastPathSegment}, null);
                try {
                    kotlin.jvm.internal.d2ok.qrj(cursorQuery);
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(0);
                        Log.i(f61199toq, "getPathByUri " + uri + ": title=" + cursorQuery.getString(1) + " filePath=" + string);
                        kotlin.jvm.internal.d2ok.qrj(string);
                        boVar.f7l8(j2, string);
                        String strUf = kotlin.text.a9.uf(string, "product", "system", false, 4, null);
                        kotlin.io.zy.m23032k(cursorQuery, null);
                        return strUf;
                    }
                    kotlin.was wasVar = kotlin.was.f36763k;
                    kotlin.io.zy.m23032k(cursorQuery, null);
                } finally {
                }
            } catch (Exception e2) {
                Log.w(f61199toq, "error in query audio. " + uri, e2);
            }
        }
        String qVar = com.android.thememanager.basemodule.utils.ek5k.toq(uri);
        kotlin.jvm.internal.d2ok.kja0(qVar, "getPathByUri(...)");
        return qVar;
    }

    @l05.qrj
    /* JADX INFO: renamed from: s */
    public static final void m9624s(@InterfaceC7396q Context context, int i2, @InterfaceC7395n Uri uri) {
        kotlin.jvm.internal.d2ok.m23075h(context, "context");
        ExtraRingtoneManager.saveDefaultSound(context, i2, f16317k.m9621k(context, uri));
    }

    @zy.hyr(api = 33)
    private final Uri toq(Context context, Uri uri, String str) {
        String strSubstring;
        String strSubstring2 = str.substring(kotlin.text.fti.x7o(str, '/', 0, false, 6, null) + 1);
        kotlin.jvm.internal.d2ok.kja0(strSubstring2, "this as java.lang.String).substring(startIndex)");
        Uri contentUri = MediaStore.Audio.Media.getContentUri("external_primary");
        ContentResolver contentResolver = context.getContentResolver();
        String path = uri.getPath();
        int iX7o = kotlin.text.fti.x7o(strSubstring2, '.', 0, false, 6, null);
        if (iX7o > 0) {
            strSubstring = strSubstring2.substring(iX7o + 1, strSubstring2.length());
            kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            strSubstring = "mp3";
        }
        String str2 = strSubstring;
        int iB7 = kotlin.text.fti.b7(strSubstring2, com.android.thememanager.basemodule.resource.constants.toq.n96, 0, false, 6, null);
        if (iB7 > 0) {
            strSubstring2 = strSubstring2.substring(0, iB7);
            kotlin.jvm.internal.d2ok.kja0(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("mime_type", "audio/" + str2);
        contentValues.put("_display_name", strSubstring2);
        contentValues.put("title", strSubstring2);
        contentValues.put("is_pending", (Integer) 1);
        contentValues.put("relative_path", f61200zy);
        contentValues.put("owner_package_name", context.getPackageName());
        Uri uriInsert = contentResolver.insert(contentUri, contentValues);
        if (path != null && new File(path).exists()) {
            try {
                kotlin.jvm.internal.d2ok.qrj(uriInsert);
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uriInsert, AnimatedProperty.PROPERTY_NAME_W);
                try {
                    Log.i(f61199toq, "copy done " + kotlin.io.toq.x2(new FileInputStream(new File(path)), new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorOpenFileDescriptor), 0, 2, null));
                    kotlin.io.zy.m23032k(parcelFileDescriptorOpenFileDescriptor, null);
                    contentValues.clear();
                    contentValues.put("is_pending", (Integer) 0);
                    Log.i(f61199toq, "update pending statue! " + uriInsert + ", with title  " + strSubstring2);
                    contentResolver.update(uriInsert, contentValues, null, null);
                    return uriInsert;
                } finally {
                }
            } catch (Exception e2) {
                Log.w(f61199toq, "copy " + uri + " fail " + e2);
                kotlin.jvm.internal.d2ok.qrj(uriInsert);
                contentResolver.delete(uriInsert, null);
            }
        }
        return uri;
    }

    @zy.hyr(api = 33)
    /* JADX INFO: renamed from: y */
    private final Uri m9625y(Context context, Uri uri, String str, Uri uri2) {
        ContentResolver contentResolver = context.getContentResolver();
        String strM9620g = m9620g(str);
        String strSubstring = str.substring(kotlin.text.fti.z8(str, ".", 0, false, 6, null));
        kotlin.jvm.internal.d2ok.kja0(strSubstring, "this as java.lang.String).substring(startIndex)");
        try {
            boolean z2 = true;
            Cursor cursorQuery = contentResolver.query(uri2, new String[]{"_id"}, "_display_name=?", new String[]{strM9620g + strSubstring}, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j2 = cursorQuery.getLong(0);
                        Uri uriCanonicalize = contentResolver.canonicalize(ContentUris.withAppendedId(uri2, j2));
                        bo boVar = f16317k;
                        String path = uri.getPath();
                        kotlin.jvm.internal.d2ok.qrj(path);
                        boVar.f7l8(j2, path);
                        Log.i(f61199toq, "convert audio " + str + ": id= " + j2 + ", uri=" + uriCanonicalize);
                        kotlin.io.zy.m23032k(cursorQuery, null);
                        return uriCanonicalize;
                    }
                } finally {
                }
            }
            if (context.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") != 0) {
                z2 = false;
            }
            Log.i(f61199toq, "has READ_AUDIO permission? " + z2 + ", not found audio id for " + uri);
            kotlin.io.zy.m23032k(cursorQuery, null);
        } catch (Exception e2) {
            Log.w(f61199toq, "fail query audio . " + uri, e2);
        }
        return null;
    }

    private final long zy(String str) {
        String strUf = kotlin.text.a9.uf(str, "/product/", "/system/", false, 4, null);
        Iterator<Long> it = f16318q.keySet().iterator();
        while (it.hasNext()) {
            long jLongValue = it.next().longValue();
            if (kotlin.jvm.internal.d2ok.f7l8(strUf, f16318q.get(Long.valueOf(jLongValue)))) {
                return jLongValue;
            }
        }
        return -1L;
    }
}
