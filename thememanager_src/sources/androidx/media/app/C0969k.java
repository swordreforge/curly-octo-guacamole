package androidx.media.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.core.app.fu4;
import androidx.core.app.x9kr;
import androidx.media.x2;
import zy.InterfaceC7830i;
import zy.hyr;
import zy.uv6;

/* JADX INFO: renamed from: androidx.media.app.k */
/* JADX INFO: compiled from: NotificationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class C0969k {

    /* JADX INFO: renamed from: androidx.media.app.k$k */
    /* JADX INFO: compiled from: NotificationCompat.java */
    @hyr(15)
    private static class k {
        private k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m4563k(RemoteViews remoteViews, int viewId, CharSequence contentDescription) {
            remoteViews.setContentDescription(viewId, contentDescription);
        }
    }

    /* JADX INFO: renamed from: androidx.media.app.k$q */
    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class q extends n {
        private void eqxt(RemoteViews views) {
            views.setInt(x2.toq.f51749kja0, "setBackgroundColor", this.f3281k.ki() != 0 ? this.f3281k.ki() : this.f3281k.f3288k.getResources().getColor(x2.C0982k.f5377k));
        }

        @Override // androidx.media.app.C0969k.n
        int a9() {
            return this.f3281k.t8r() != null ? x2.C0984q.f5385s : super.a9();
        }

        @Override // androidx.core.app.x9kr.cdj
        @uv6({uv6.EnumC7844k.LIBRARY})
        public RemoteViews fu4(fu4 builder) {
            return null;
        }

        @Override // androidx.media.app.C0969k.n
        int jk(int actionCount) {
            return actionCount <= 3 ? x2.C0984q.f5381g : x2.C0984q.f5384q;
        }

        @Override // androidx.media.app.C0969k.n, androidx.core.app.x9kr.cdj
        @uv6({uv6.EnumC7844k.LIBRARY})
        public RemoteViews ni7(fu4 builder) {
            return null;
        }

        @Override // androidx.media.app.C0969k.n, androidx.core.app.x9kr.cdj
        @uv6({uv6.EnumC7844k.LIBRARY})
        public void toq(fu4 builder) {
            toq.m4567q(builder.mo1878k(), toq.toq(zy.m4568k(), this.f5220n, this.f5219g));
        }

        @Override // androidx.media.app.C0969k.n, androidx.core.app.x9kr.cdj
        @uv6({uv6.EnumC7844k.LIBRARY})
        public RemoteViews zurt(fu4 builder) {
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.media.app.k$toq */
    /* JADX INFO: compiled from: NotificationCompat.java */
    @hyr(21)
    private static class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static Notification.MediaStyle m4565k() {
            return new Notification.MediaStyle();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: n */
        static void m4566n(Notification.MediaStyle style, int... actions) {
            style.setShowActionsInCompactView(actions);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static void m4567q(Notification.Builder builder, Notification.MediaStyle style) {
            builder.setStyle(style);
        }

        @InterfaceC7830i
        static Notification.MediaStyle toq(Notification.MediaStyle style, int[] actionsToShowInCompact, MediaSessionCompat.Token token) {
            if (actionsToShowInCompact != null) {
                m4566n(style, actionsToShowInCompact);
            }
            if (token != null) {
                zy(style, (MediaSession.Token) token.getToken());
            }
            return style;
        }

        @InterfaceC7830i
        static void zy(Notification.MediaStyle style, MediaSession.Token token) {
            style.setMediaSession(token);
        }
    }

    /* JADX INFO: renamed from: androidx.media.app.k$zy */
    /* JADX INFO: compiled from: NotificationCompat.java */
    @hyr(24)
    private static class zy {
        private zy() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static Notification.DecoratedMediaCustomViewStyle m4568k() {
            return new Notification.DecoratedMediaCustomViewStyle();
        }
    }

    private C0969k() {
    }

    /* JADX INFO: renamed from: androidx.media.app.k$n */
    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class n extends x9kr.cdj {

        /* JADX INFO: renamed from: p */
        private static final int f5217p = 5;

        /* JADX INFO: renamed from: s */
        private static final int f5218s = 3;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        boolean f51676f7l8;

        /* JADX INFO: renamed from: g */
        MediaSessionCompat.Token f5219g;

        /* JADX INFO: renamed from: n */
        int[] f5220n = null;

        /* JADX INFO: renamed from: y */
        PendingIntent f5221y;

        public n() {
        }

        public static MediaSessionCompat.Token fti(Notification notification) {
            Parcelable parcelable;
            Bundle bundleN7h = x9kr.n7h(notification);
            if (bundleN7h == null || (parcelable = bundleN7h.getParcelable(x9kr.f50153hb)) == null) {
                return null;
            }
            return MediaSessionCompat.Token.fromToken(parcelable);
        }

        private RemoteViews mcp(x9kr.toq action) {
            boolean z2 = action.m2099k() == null;
            RemoteViews remoteViews = new RemoteViews(this.f3281k.f3288k.getPackageName(), x2.C0984q.f5382k);
            int i2 = x2.toq.f5389k;
            remoteViews.setImageViewResource(i2, action.m2100n());
            if (!z2) {
                remoteViews.setOnClickPendingIntent(i2, action.m2099k());
            }
            k.m4563k(remoteViews, i2, action.m2101p());
            return remoteViews;
        }

        int a9() {
            return x2.C0984q.f5386y;
        }

        public n d3(int... actions) {
            this.f5220n = actions;
            return this;
        }

        public n gvn7(MediaSessionCompat.Token token) {
            this.f5219g = token;
            return this;
        }

        int jk(int actionCount) {
            return actionCount <= 3 ? x2.C0984q.f5383n : x2.C0984q.f51745zy;
        }

        public n jp0y(PendingIntent pendingIntent) {
            this.f5221y = pendingIntent;
            return this;
        }

        @Override // androidx.core.app.x9kr.cdj
        @uv6({uv6.EnumC7844k.LIBRARY})
        public RemoteViews ni7(fu4 builder) {
            return null;
        }

        public n oc(boolean show) {
            return this;
        }

        /* JADX INFO: renamed from: t */
        RemoteViews m4564t() {
            RemoteViews remoteViewsZy = zy(false, a9(), true);
            int size = this.f3281k.f50233toq.size();
            int[] iArr = this.f5220n;
            int iMin = iArr == null ? 0 : Math.min(iArr.length, 3);
            remoteViewsZy.removeAllViews(x2.toq.f5391p);
            if (iMin > 0) {
                for (int i2 = 0; i2 < iMin; i2++) {
                    if (i2 >= size) {
                        throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", Integer.valueOf(i2), Integer.valueOf(size - 1)));
                    }
                    remoteViewsZy.addView(x2.toq.f5391p, mcp(this.f3281k.f50233toq.get(this.f5220n[i2])));
                }
            }
            if (this.f51676f7l8) {
                remoteViewsZy.setViewVisibility(x2.toq.f5390n, 8);
                int i3 = x2.toq.f51756zy;
                remoteViewsZy.setViewVisibility(i3, 0);
                remoteViewsZy.setOnClickPendingIntent(i3, this.f5221y);
                remoteViewsZy.setInt(i3, "setAlpha", this.f3281k.f3288k.getResources().getInteger(x2.zy.f5395k));
            } else {
                remoteViewsZy.setViewVisibility(x2.toq.f5390n, 0);
                remoteViewsZy.setViewVisibility(x2.toq.f51756zy, 8);
            }
            return remoteViewsZy;
        }

        @Override // androidx.core.app.x9kr.cdj
        @uv6({uv6.EnumC7844k.LIBRARY})
        public void toq(fu4 builder) {
            toq.m4567q(builder.mo1878k(), toq.toq(toq.m4565k(), this.f5220n, this.f5219g));
        }

        RemoteViews wvg() {
            int iMin = Math.min(this.f3281k.f50233toq.size(), 5);
            RemoteViews remoteViewsZy = zy(false, jk(iMin), false);
            remoteViewsZy.removeAllViews(x2.toq.f5391p);
            if (iMin > 0) {
                for (int i2 = 0; i2 < iMin; i2++) {
                    remoteViewsZy.addView(x2.toq.f5391p, mcp(this.f3281k.f50233toq.get(i2)));
                }
            }
            if (this.f51676f7l8) {
                int i3 = x2.toq.f51756zy;
                remoteViewsZy.setViewVisibility(i3, 0);
                remoteViewsZy.setInt(i3, "setAlpha", this.f3281k.f3288k.getResources().getInteger(x2.zy.f5395k));
                remoteViewsZy.setOnClickPendingIntent(i3, this.f5221y);
            } else {
                remoteViewsZy.setViewVisibility(x2.toq.f51756zy, 8);
            }
            return remoteViewsZy;
        }

        @Override // androidx.core.app.x9kr.cdj
        @uv6({uv6.EnumC7844k.LIBRARY})
        public RemoteViews zurt(fu4 builder) {
            return null;
        }

        public n(x9kr.f7l8 builder) {
            o1t(builder);
        }
    }
}
