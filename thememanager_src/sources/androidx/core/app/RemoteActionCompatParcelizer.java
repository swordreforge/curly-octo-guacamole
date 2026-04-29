package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.AbstractC1266n;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
@zy.uv6({uv6.EnumC7844k.LIBRARY})
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC1266n abstractC1266n) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f3109k = (IconCompat) abstractC1266n.y9n(remoteActionCompat.f3109k, 1);
        remoteActionCompat.f50032toq = abstractC1266n.ni7(remoteActionCompat.f50032toq, 2);
        remoteActionCompat.f50033zy = abstractC1266n.ni7(remoteActionCompat.f50033zy, 3);
        remoteActionCompat.f3111q = (PendingIntent) abstractC1266n.lrht(remoteActionCompat.f3111q, 4);
        remoteActionCompat.f3110n = abstractC1266n.qrj(remoteActionCompat.f3110n, 5);
        remoteActionCompat.f3108g = abstractC1266n.qrj(remoteActionCompat.f3108g, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC1266n abstractC1266n) {
        abstractC1266n.bf2(false, false);
        abstractC1266n.cv06(remoteActionCompat.f3109k, 1);
        abstractC1266n.xwq3(remoteActionCompat.f50032toq, 2);
        abstractC1266n.xwq3(remoteActionCompat.f50033zy, 3);
        abstractC1266n.cfr(remoteActionCompat.f3111q, 4);
        abstractC1266n.zp(remoteActionCompat.f3110n, 5);
        abstractC1266n.zp(remoteActionCompat.f3108g, 6);
    }
}
