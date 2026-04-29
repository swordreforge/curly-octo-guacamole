package com.android.thememanager.maml;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.maml.q */
/* JADX INFO: compiled from: IDataProducer.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2148q {
    /* JADX INFO: renamed from: k */
    default Bundle mo8176k(@lvui String method, @dd String arg, @dd Bundle extras) {
        return null;
    }

    String toq(@lvui Uri uri);

    Cursor zy(@lvui Uri uri, @dd String[] projection, @dd String selection, @dd String[] selectionArgs, @dd String sortOrder);
}
