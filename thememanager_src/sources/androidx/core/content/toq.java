package androidx.core.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: ContentResolverCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class toq {

    /* JADX INFO: renamed from: androidx.core.content.toq$k */
    /* JADX INFO: compiled from: ContentResolverCompat.java */
    @hyr(16)
    static class C0509k {
        private C0509k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static Cursor m2367k(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, cancellationSignal);
        }
    }

    private toq() {
    }

    @dd
    /* JADX INFO: renamed from: k */
    public static Cursor m2366k(@lvui ContentResolver contentResolver, @lvui Uri uri, @dd String[] strArr, @dd String str, @dd String[] strArr2, @dd String str2, @dd androidx.core.os.zy zyVar) throws Exception {
        Object qVar;
        if (zyVar != null) {
            try {
                qVar = zyVar.toq();
            } catch (Exception e2) {
                if (e2 instanceof OperationCanceledException) {
                    throw new androidx.core.os.cdj();
                }
                throw e2;
            }
        } else {
            qVar = null;
        }
        return C0509k.m2367k(contentResolver, uri, strArr, str, strArr2, str2, (CancellationSignal) qVar);
    }
}
