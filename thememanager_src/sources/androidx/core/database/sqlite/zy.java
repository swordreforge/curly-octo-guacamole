package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteDatabase;
import androidx.exifinterface.media.C0846k;
import com.google.android.exoplayer2.text.ttml.C3678q;
import cyoe.x2;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: SQLiteDatabase.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\b\u0005H\u0086\b¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {C0846k.zaso, "Landroid/database/sqlite/SQLiteDatabase;", "", "exclusive", "Lkotlin/Function1;", "Lkotlin/fn3e;", C3678q.f22041h, "k", "(Landroid/database/sqlite/SQLiteDatabase;ZLcyoe/x2;)Ljava/lang/Object;", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class zy {
    /* JADX INFO: renamed from: k */
    public static final <T> T m2379k(@InterfaceC7396q SQLiteDatabase transaction, boolean z2, @InterfaceC7396q x2<? super SQLiteDatabase, ? extends T> body) {
        d2ok.cdj(transaction, "$this$transaction");
        d2ok.cdj(body, "body");
        if (z2) {
            transaction.beginTransaction();
        } else {
            transaction.beginTransactionNonExclusive();
        }
        try {
            T tInvoke = body.invoke(transaction);
            transaction.setTransactionSuccessful();
            return tInvoke;
        } finally {
            kotlin.jvm.internal.d3.m23090q(1);
            transaction.endTransaction();
            kotlin.jvm.internal.d3.zy(1);
        }
    }

    public static /* synthetic */ Object toq(SQLiteDatabase transaction, boolean z2, x2 body, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        d2ok.cdj(transaction, "$this$transaction");
        d2ok.cdj(body, "body");
        if (z2) {
            transaction.beginTransaction();
        } else {
            transaction.beginTransactionNonExclusive();
        }
        try {
            Object objInvoke = body.invoke(transaction);
            transaction.setTransactionSuccessful();
            return objInvoke;
        } finally {
            kotlin.jvm.internal.d3.m23090q(1);
            transaction.endTransaction();
            kotlin.jvm.internal.d3.zy(1);
        }
    }
}
