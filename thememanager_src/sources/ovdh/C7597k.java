package ovdh;

import android.content.ContentResolver;
import android.content.Context;
import android.os.UserHandle;

/* JADX INFO: renamed from: ovdh.k */
/* JADX INFO: compiled from: ContextCompat.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7597k {
    /* JADX INFO: renamed from: k */
    public static ContentResolver m27905k(Context context, UserHandle userHandle) {
        return context.getContentResolverForUser(userHandle);
    }
}
