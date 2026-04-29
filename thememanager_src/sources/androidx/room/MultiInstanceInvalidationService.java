package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.IMultiInstanceInvalidationService;
import java.util.HashMap;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: k */
    int f6143k = 0;

    /* JADX INFO: renamed from: q */
    final HashMap<Integer, String> f6145q = new HashMap<>();

    /* JADX INFO: renamed from: n */
    final RemoteCallbackList<IMultiInstanceInvalidationCallback> f6144n = new RemoteCallbackListC1124k();

    /* JADX INFO: renamed from: g */
    private final IMultiInstanceInvalidationService.Stub f6142g = new IMultiInstanceInvalidationService.Stub() { // from class: androidx.room.MultiInstanceInvalidationService.2
        @Override // androidx.room.IMultiInstanceInvalidationService
        public void broadcastInvalidation(int i2, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f6144n) {
                String str = MultiInstanceInvalidationService.this.f6145q.get(Integer.valueOf(i2));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = MultiInstanceInvalidationService.this.f6144n.beginBroadcast();
                for (int i3 = 0; i3 < iBeginBroadcast; i3++) {
                    try {
                        int iIntValue = ((Integer) MultiInstanceInvalidationService.this.f6144n.getBroadcastCookie(i3)).intValue();
                        String str2 = MultiInstanceInvalidationService.this.f6145q.get(Integer.valueOf(iIntValue));
                        if (i2 != iIntValue && str.equals(str2)) {
                            try {
                                ((IMultiInstanceInvalidationCallback) MultiInstanceInvalidationService.this.f6144n.getBroadcastItem(i3)).onInvalidation(strArr);
                            } catch (RemoteException e2) {
                                Log.w("ROOM", "Error invoking a remote callback", e2);
                            }
                        }
                    } finally {
                        MultiInstanceInvalidationService.this.f6144n.finishBroadcast();
                    }
                }
            }
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public int registerCallback(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f6144n) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i2 = multiInstanceInvalidationService.f6143k + 1;
                multiInstanceInvalidationService.f6143k = i2;
                if (multiInstanceInvalidationService.f6144n.register(iMultiInstanceInvalidationCallback, Integer.valueOf(i2))) {
                    MultiInstanceInvalidationService.this.f6145q.put(Integer.valueOf(i2), str);
                    return i2;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f6143k--;
                return 0;
            }
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public void unregisterCallback(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, int i2) {
            synchronized (MultiInstanceInvalidationService.this.f6144n) {
                MultiInstanceInvalidationService.this.f6144n.unregister(iMultiInstanceInvalidationCallback);
                MultiInstanceInvalidationService.this.f6145q.remove(Integer.valueOf(i2));
            }
        }
    };

    /* JADX INFO: renamed from: androidx.room.MultiInstanceInvalidationService$k */
    class RemoteCallbackListC1124k extends RemoteCallbackList<IMultiInstanceInvalidationCallback> {
        RemoteCallbackListC1124k() {
        }

        @Override // android.os.RemoteCallbackList
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback, Object obj) {
            MultiInstanceInvalidationService.this.f6145q.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    @Override // android.app.Service
    @zy.dd
    public IBinder onBind(Intent intent) {
        return this.f6142g;
    }
}
