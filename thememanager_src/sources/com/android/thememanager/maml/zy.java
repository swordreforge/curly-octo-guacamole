package com.android.thememanager.maml;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.controller.online.C1922n;
import com.android.thememanager.controller.online.zurt;
import com.android.thememanager.util.C2789j;
import java.io.File;
import java.io.IOException;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: GetDataProducer.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy implements InterfaceC2148q {

    /* JADX INFO: renamed from: k */
    static final String f12692k = "get";

    /* JADX INFO: renamed from: q */
    private static final String f12693q = "GetDataProducer";

    @Override // com.android.thememanager.maml.InterfaceC2148q
    public String toq(@lvui Uri uri) {
        return "vnd.android.cursor.item/api-get";
    }

    @Override // com.android.thememanager.maml.InterfaceC2148q
    public Cursor zy(@lvui Uri uri, @dd String[] projection, @dd String selection, @dd String[] selectionArgs, @dd String sortOrder) {
        String path = uri.getPath();
        if (path == null) {
            return null;
        }
        try {
            String str = f12692k + File.separator;
            String strSubstring = path.substring(path.indexOf(str) + str.length());
            if (MamlDataProvider.toq(strSubstring)) {
                String strF7l8 = C1915g.f7l8(new zurt(strSubstring, 32, zurt.EnumC1946k.API_PROXY));
                MatrixCursor matrixCursor = new MatrixCursor(projection);
                matrixCursor.addRow(new Object[]{strF7l8});
                return matrixCursor;
            }
        } catch (C1922n | IOException e2) {
            C2789j.x2(f12693q, "API_GET throw an exception - " + e2, new Object[0]);
        }
        return null;
    }
}
