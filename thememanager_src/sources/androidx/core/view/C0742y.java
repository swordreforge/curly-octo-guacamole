package androidx.core.view;

import android.app.Activity;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import zy.InterfaceC7830i;
import zy.uv6;

/* JADX INFO: renamed from: androidx.core.view.y */
/* JADX INFO: compiled from: DragAndDropPermissionsCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0742y {

    /* JADX INFO: renamed from: k */
    private final DragAndDropPermissions f4198k;

    /* JADX INFO: renamed from: androidx.core.view.y$k */
    /* JADX INFO: compiled from: DragAndDropPermissionsCompat.java */
    @zy.hyr(24)
    static class k {
        private k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m3565k(DragAndDropPermissions dragAndDropPermissions) {
            dragAndDropPermissions.release();
        }

        @InterfaceC7830i
        static DragAndDropPermissions toq(Activity activity, DragEvent dragEvent) {
            return activity.requestDragAndDropPermissions(dragEvent);
        }
    }

    private C0742y(DragAndDropPermissions dragAndDropPermissions) {
        this.f4198k = dragAndDropPermissions;
    }

    @zy.dd
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public static C0742y toq(@zy.lvui Activity activity, @zy.lvui DragEvent dragEvent) {
        DragAndDropPermissions qVar = k.toq(activity, dragEvent);
        if (qVar != null) {
            return new C0742y(qVar);
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public void m3564k() {
        k.m3565k(this.f4198k);
    }
}
