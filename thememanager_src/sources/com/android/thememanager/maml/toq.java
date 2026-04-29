package com.android.thememanager.maml;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.android.thememanager.basemodule.analysis.C1704n;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: AnonymousIdDataProducer.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq implements InterfaceC2148q {

    /* JADX INFO: renamed from: k */
    static final String f12655k = "anonymousId";

    @Override // com.android.thememanager.maml.InterfaceC2148q
    public String toq(@lvui Uri uri) {
        return "vnd.android.cursor.item/api-anonymous-id";
    }

    @Override // com.android.thememanager.maml.InterfaceC2148q
    public Cursor zy(@lvui Uri uri, @dd String[] projection, @dd String selection, @dd String[] selectionArgs, @dd String sortOrder) {
        String strM6646k = C1704n.toq().m6646k();
        MatrixCursor matrixCursor = new MatrixCursor(projection);
        matrixCursor.addRow(new Object[]{strM6646k});
        return matrixCursor;
    }
}
