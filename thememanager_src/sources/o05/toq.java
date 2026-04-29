package o05;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.UserHandle;

/* JADX INFO: loaded from: classes3.dex */
public class toq {
    /* JADX INFO: renamed from: k */
    public static void m26818k(ContentResolver contentResolver, Uri uri, boolean z2, ContentObserver contentObserver, UserHandle userHandle) {
        com.miui.lockscreeninfo.toq.zy(ContentResolver.class, contentResolver, "registerContentObserverAsUser", Void.TYPE, new Class[]{Uri.class, Boolean.TYPE, ContentObserver.class, UserHandle.class}, uri, Boolean.valueOf(z2), contentObserver, userHandle);
    }
}
