package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Display;
import android.view.DragEvent;
import android.view.View;
import androidx.core.app.toq;
import androidx.core.app.y2;
import androidx.core.content.C0498q;
import androidx.core.content.C0508s;
import androidx.core.view.C0742y;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import zy.InterfaceC7830i;
import zy.InterfaceC7843t;
import zy.uv6;

/* JADX INFO: compiled from: ActivityCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class toq extends C0498q {

    /* JADX INFO: renamed from: n */
    private static InterfaceC0453p f3250n;

    /* JADX INFO: compiled from: ActivityCompat.java */
    @zy.hyr(30)
    static class f7l8 {
        private f7l8() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static Display m1987k(ContextWrapper contextWrapper) {
            return contextWrapper.getDisplay();
        }

        @InterfaceC7830i
        static void toq(@zy.lvui Activity activity, @zy.dd C0508s c0508s, @zy.dd Bundle bundle) {
            activity.setLocusContext(c0508s == null ? null : c0508s.zy(), bundle);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.toq$g */
    /* JADX INFO: compiled from: ActivityCompat.java */
    @zy.hyr(28)
    static class C0450g {
        private C0450g() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static <T> T m1988k(Activity activity, int i2) {
            return (T) activity.requireViewById(i2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.toq$k */
    /* JADX INFO: compiled from: ActivityCompat.java */
    class RunnableC0451k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String[] f3251k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ int f3252n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Activity f3253q;

        RunnableC0451k(String[] strArr, Activity activity, int i2) {
            this.f3251k = strArr;
            this.f3253q = activity;
            this.f3252n = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f3251k.length];
            PackageManager packageManager = this.f3253q.getPackageManager();
            String packageName = this.f3253q.getPackageName();
            int length = this.f3251k.length;
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = packageManager.checkPermission(this.f3251k[i2], packageName);
            }
            ((InterfaceC0455s) this.f3253q).onRequestPermissionsResult(this.f3252n, this.f3251k, iArr);
        }
    }

    /* JADX INFO: compiled from: ActivityCompat.java */
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public interface ld6 {
        void validateRequestPermissionsRequestCode(int i2);
    }

    /* JADX INFO: renamed from: androidx.core.app.toq$n */
    /* JADX INFO: compiled from: ActivityCompat.java */
    @zy.hyr(23)
    static class C0452n {
        private C0452n() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        public static void m1989k(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        @InterfaceC7830i
        static void toq(Activity activity, String[] strArr, int i2) {
            activity.requestPermissions(strArr, i2);
        }

        @InterfaceC7830i
        static boolean zy(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.toq$p */
    /* JADX INFO: compiled from: ActivityCompat.java */
    public interface InterfaceC0453p {
        /* JADX INFO: renamed from: k */
        boolean m1990k(@zy.lvui Activity activity, @zy.a9(from = 0) int i2, int i3, @zy.dd Intent intent);

        boolean toq(@zy.lvui Activity activity, @zy.lvui String[] strArr, @zy.a9(from = 0) int i2);
    }

    /* JADX INFO: renamed from: androidx.core.app.toq$q */
    /* JADX INFO: compiled from: ActivityCompat.java */
    @zy.hyr(22)
    static class C0454q {
        private C0454q() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static Uri m1991k(Activity activity) {
            return activity.getReferrer();
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.toq$s */
    /* JADX INFO: compiled from: ActivityCompat.java */
    public interface InterfaceC0455s {
        void onRequestPermissionsResult(int i2, @zy.lvui String[] strArr, @zy.lvui int[] iArr);
    }

    /* JADX INFO: renamed from: androidx.core.app.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActivityCompat.java */
    @zy.hyr(16)
    static class C7860toq {
        private C7860toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m1992k(Activity activity) {
            activity.finishAffinity();
        }

        @InterfaceC7830i
        static void toq(Activity activity, Intent intent, int i2, Bundle bundle) {
            activity.startActivityForResult(intent, i2, bundle);
        }

        @InterfaceC7830i
        static void zy(Activity activity, IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
            activity.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
        }
    }

    /* JADX INFO: compiled from: ActivityCompat.java */
    @zy.hyr(21)
    static class x2 extends SharedElementCallback {

        /* JADX INFO: renamed from: k */
        private final y2 f3254k;

        x2(y2 y2Var) {
            this.f3254k = y2Var;
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f3254k.toq(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f3254k.zy(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f3254k.m2136q(list, map);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            this.f3254k.m2135n(list);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f3254k.m2134g(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f3254k.f7l8(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        @zy.hyr(23)
        public void onSharedElementsArrived(List<String> list, List<View> list2, final SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f3254k.m2137y(list, list2, new y2.InterfaceC0471k() { // from class: androidx.core.app.f7l8
                @Override // androidx.core.app.y2.InterfaceC0471k
                public final void onSharedElementsReady() {
                    toq.C0452n.m1989k(onSharedElementsReadyListener);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.toq$y */
    /* JADX INFO: compiled from: ActivityCompat.java */
    @zy.hyr(31)
    static class C0456y {
        private C0456y() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static boolean m1994k(@zy.lvui Activity activity) {
            return activity.isLaunchedFromBubble();
        }
    }

    /* JADX INFO: compiled from: ActivityCompat.java */
    @zy.hyr(21)
    static class zy {
        private zy() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m1995k(Activity activity) {
            activity.finishAfterTransition();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: n */
        static void m1996n(Activity activity) {
            activity.startPostponedEnterTransition();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static void m1997q(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        @InterfaceC7830i
        static void toq(Activity activity) {
            activity.postponeEnterTransition();
        }

        @InterfaceC7830i
        static void zy(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }
    }

    protected toq() {
    }

    public static void a9(@zy.lvui final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: androidx.core.app.k
                @Override // java.lang.Runnable
                public final void run() {
                    toq.mcp(activity);
                }
            });
        }
    }

    public static void d2ok(@zy.dd InterfaceC0453p interfaceC0453p) {
        f3250n = interfaceC0453p;
    }

    public static void d3(@zy.lvui Activity activity, @zy.dd y2 y2Var) {
        zy.zy(activity, y2Var != null ? new x2(y2Var) : null);
    }

    public static void dd(@zy.lvui Activity activity, @zy.lvui IntentSender intentSender, int i2, @zy.dd Intent intent, int i3, int i4, int i5, @zy.dd Bundle bundle) throws IntentSender.SendIntentException {
        C7860toq.zy(activity, intentSender, i2, intent, i3, i4, i5, bundle);
    }

    public static void eqxt(@zy.lvui Activity activity, @zy.dd C0508s c0508s, @zy.dd Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 30) {
            f7l8.toq(activity, c0508s, bundle);
        }
    }

    @zy.dd
    public static C0742y fti(@zy.lvui Activity activity, @zy.lvui DragEvent dragEvent) {
        return C0742y.toq(activity, dragEvent);
    }

    public static void fu4(@zy.lvui Activity activity) {
        zy.m1995k(activity);
    }

    @zy.lvui
    public static <T extends View> T gvn7(@zy.lvui Activity activity, @InterfaceC7843t int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) C0450g.m1988k(activity, i2);
        }
        T t2 = (T) activity.findViewById(i2);
        if (t2 != null) {
            return t2;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static void jk(@zy.lvui Activity activity) {
        zy.toq(activity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void jp0y(@zy.lvui Activity activity, @zy.lvui String[] strArr, @zy.a9(from = 0) int i2) {
        InterfaceC0453p interfaceC0453p = f3250n;
        if (interfaceC0453p == null || !interfaceC0453p.toq(activity, strArr, i2)) {
            for (String str : strArr) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            if (activity instanceof ld6) {
                ((ld6) activity).validateRequestPermissionsRequestCode(i2);
            }
            C0452n.toq(activity, strArr, i2);
        }
    }

    public static boolean lvui(@zy.lvui Activity activity, @zy.lvui String str) {
        return C0452n.zy(activity, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void mcp(Activity activity) {
        if (activity.isFinishing() || C0444p.m1964s(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void ni7(@zy.lvui Activity activity) {
        C7860toq.m1992k(activity);
    }

    @zy.dd
    public static Uri o1t(@zy.lvui Activity activity) {
        return C0454q.m1991k(activity);
    }

    public static void oc(@zy.lvui Activity activity, @zy.dd y2 y2Var) {
        zy.m1997q(activity, y2Var != null ? new x2(y2Var) : null);
    }

    /* JADX INFO: renamed from: r */
    public static void m1984r(@zy.lvui Activity activity, @zy.lvui Intent intent, int i2, @zy.dd Bundle bundle) {
        C7860toq.toq(activity, intent, i2, bundle);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m1985t(@zy.lvui Activity activity) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            return C0456y.m1994k(activity);
        }
        if (i2 == 30) {
            return (f7l8.m1987k(activity) == null || f7l8.m1987k(activity).getDisplayId() == 0) ? false : true;
        }
        if (i2 == 29) {
            return (activity.getWindowManager().getDefaultDisplay() == null || activity.getWindowManager().getDefaultDisplay().getDisplayId() == 0) ? false : true;
        }
        return false;
    }

    @Deprecated
    public static boolean wvg(Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }

    public static void x9kr(@zy.lvui Activity activity) {
        zy.m1996n(activity);
    }

    @zy.dd
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: z */
    public static InterfaceC0453p m1986z() {
        return f3250n;
    }
}
