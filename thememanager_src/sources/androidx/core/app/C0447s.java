package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.core.util.C0639p;
import zy.InterfaceC7830i;

/* JADX INFO: renamed from: androidx.core.app.s */
/* JADX INFO: compiled from: ActivityOptionsCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class C0447s {

    /* JADX INFO: renamed from: k */
    public static final String f3249k = "android.activity.usage_time";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f50126toq = "android.usage_time_packages";

    /* JADX INFO: renamed from: androidx.core.app.s$k */
    /* JADX INFO: compiled from: ActivityOptionsCompat.java */
    @zy.hyr(16)
    private static class k extends C0447s {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final ActivityOptions f50127zy;

        k(ActivityOptions activityOptions) {
            this.f50127zy = activityOptions;
        }

        @Override // androidx.core.app.C0447s
        /* JADX INFO: renamed from: k */
        public Rect mo1974k() {
            return n.m1976k(this.f50127zy);
        }

        @Override // androidx.core.app.C0447s
        @zy.lvui
        public C0447s ld6(@zy.dd Rect rect) {
            return new k(n.toq(this.f50127zy, rect));
        }

        @Override // androidx.core.app.C0447s
        /* JADX INFO: renamed from: p */
        public void mo1975p(@zy.lvui PendingIntent pendingIntent) {
            q.zy(this.f50127zy, pendingIntent);
        }

        @Override // androidx.core.app.C0447s
        public void qrj(@zy.lvui C0447s c0447s) {
            if (c0447s instanceof k) {
                this.f50127zy.update(((k) c0447s).f50127zy);
            }
        }

        @Override // androidx.core.app.C0447s
        public Bundle x2() {
            return this.f50127zy.toBundle();
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.s$n */
    /* JADX INFO: compiled from: ActivityOptionsCompat.java */
    @zy.hyr(24)
    static class n {
        private n() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static Rect m1976k(ActivityOptions activityOptions) {
            return activityOptions.getLaunchBounds();
        }

        @InterfaceC7830i
        static ActivityOptions toq(ActivityOptions activityOptions, Rect rect) {
            return activityOptions.setLaunchBounds(rect);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.s$q */
    /* JADX INFO: compiled from: ActivityOptionsCompat.java */
    @zy.hyr(23)
    static class q {
        private q() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static ActivityOptions m1977k() {
            return ActivityOptions.makeBasic();
        }

        @InterfaceC7830i
        static ActivityOptions toq(View view, int i2, int i3, int i4, int i5) {
            return ActivityOptions.makeClipRevealAnimation(view, i2, i3, i4, i5);
        }

        @InterfaceC7830i
        static void zy(ActivityOptions activityOptions, PendingIntent pendingIntent) {
            activityOptions.requestUsageTimeReport(pendingIntent);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.s$toq */
    /* JADX INFO: compiled from: ActivityOptionsCompat.java */
    @zy.hyr(16)
    static class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static ActivityOptions m1978k(Context context, int i2, int i3) {
            return ActivityOptions.makeCustomAnimation(context, i2, i3);
        }

        @InterfaceC7830i
        static ActivityOptions toq(View view, int i2, int i3, int i4, int i5) {
            return ActivityOptions.makeScaleUpAnimation(view, i2, i3, i4, i5);
        }

        @InterfaceC7830i
        static ActivityOptions zy(View view, Bitmap bitmap, int i2, int i3) {
            return ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i2, i3);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.s$zy */
    /* JADX INFO: compiled from: ActivityOptionsCompat.java */
    @zy.hyr(21)
    static class zy {
        private zy() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static ActivityOptions m1979k(Activity activity, View view, String str) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, view, str);
        }

        @SafeVarargs
        @InterfaceC7830i
        static ActivityOptions toq(Activity activity, Pair<View, String>... pairArr) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, pairArr);
        }

        @InterfaceC7830i
        static ActivityOptions zy() {
            return ActivityOptions.makeTaskLaunchBehind();
        }
    }

    protected C0447s() {
    }

    @zy.lvui
    public static C0447s f7l8(@zy.lvui Activity activity, @zy.dd C0639p<View, String>... c0639pArr) {
        Pair[] pairArr = null;
        if (c0639pArr != null) {
            pairArr = new Pair[c0639pArr.length];
            for (int i2 = 0; i2 < c0639pArr.length; i2++) {
                C0639p<View, String> c0639p = c0639pArr[i2];
                pairArr[i2] = Pair.create(c0639p.f3889k, c0639p.f50633toq);
            }
        }
        return new k(zy.toq(activity, pairArr));
    }

    @zy.lvui
    /* JADX INFO: renamed from: g */
    public static C0447s m1969g(@zy.lvui Activity activity, @zy.lvui View view, @zy.lvui String str) {
        return new k(zy.m1979k(activity, view, str));
    }

    @zy.lvui
    /* JADX INFO: renamed from: n */
    public static C0447s m1970n(@zy.lvui View view, int i2, int i3, int i4, int i5) {
        return new k(toq.toq(view, i2, i3, i4, i5));
    }

    @zy.lvui
    /* JADX INFO: renamed from: q */
    public static C0447s m1971q(@zy.lvui Context context, int i2, int i3) {
        return new k(toq.m1978k(context, i2, i3));
    }

    @zy.lvui
    /* JADX INFO: renamed from: s */
    public static C0447s m1972s(@zy.lvui View view, @zy.lvui Bitmap bitmap, int i2, int i3) {
        return new k(toq.zy(view, bitmap, i2, i3));
    }

    @zy.lvui
    public static C0447s toq() {
        return new k(q.m1977k());
    }

    @zy.lvui
    /* JADX INFO: renamed from: y */
    public static C0447s m1973y() {
        return new k(zy.zy());
    }

    @zy.lvui
    public static C0447s zy(@zy.lvui View view, int i2, int i3, int i4, int i5) {
        return new k(q.toq(view, i2, i3, i4, i5));
    }

    @zy.dd
    /* JADX INFO: renamed from: k */
    public Rect mo1974k() {
        return null;
    }

    @zy.lvui
    public C0447s ld6(@zy.dd Rect rect) {
        return this;
    }

    /* JADX INFO: renamed from: p */
    public void mo1975p(@zy.lvui PendingIntent pendingIntent) {
    }

    public void qrj(@zy.lvui C0447s c0447s) {
    }

    @zy.dd
    public Bundle x2() {
        return null;
    }
}
