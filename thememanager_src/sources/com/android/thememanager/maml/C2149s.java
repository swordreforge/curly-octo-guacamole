package com.android.thememanager.maml;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.util.Log;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.controller.online.C1922n;
import com.android.thememanager.controller.online.zurt;
import java.io.File;
import java.io.IOException;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.maml.s */
/* JADX INFO: compiled from: PostDataProducer.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2149s implements InterfaceC2148q {

    /* JADX INFO: renamed from: k */
    public static final String f12653k = "post";

    /* JADX INFO: renamed from: q */
    private static final String f12654q = "PostDataProducer";

    @Override // com.android.thememanager.maml.InterfaceC2148q
    public String toq(@lvui Uri uri) {
        return "vnd.android.cursor.item/api-post";
    }

    @Override // com.android.thememanager.maml.InterfaceC2148q
    public Cursor zy(@lvui Uri uri, @dd String[] projection, @dd String selection, @dd String[] selectionArgs, @dd String sortOrder) {
        String path = uri.getPath();
        if (path != null && !path.isEmpty()) {
            try {
                String str = "post" + File.separator;
                String strSubstring = path.substring(path.indexOf(str) + str.length());
                Uri uri2 = Uri.parse(strSubstring);
                String strSubstring2 = strSubstring.substring(0, strSubstring.indexOf("?"));
                if (MamlDataProvider.toq(strSubstring2)) {
                    zurt zurtVar = new zurt(strSubstring2, 32, zurt.EnumC1946k.API_PROXY);
                    for (String str2 : uri2.getQueryParameterNames()) {
                        zurtVar.addParameter(str2, uri2.getQueryParameter(str2));
                    }
                    zurtVar.setHttpMethod(zurt.toq.POST);
                    String strF7l8 = C1915g.f7l8(zurtVar);
                    MatrixCursor matrixCursor = new MatrixCursor(projection);
                    matrixCursor.addRow(new Object[]{strF7l8});
                    return matrixCursor;
                }
            } catch (C1922n | IOException e2) {
                Log.e(f12654q, "API_POST throw an exception - " + e2);
            }
        }
        return null;
    }
}
