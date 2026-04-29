package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.Notification$BubbleMetadata;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.widget.RemoteViews;
import androidx.core.app.a98o;
import androidx.core.content.C0508s;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.text.C0616k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n7h.C7400k;
import zy.InterfaceC7829h;
import zy.uv6;

/* JADX INFO: compiled from: NotificationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class x9kr {

    /* JADX INFO: renamed from: a */
    public static final int f3256a = 1;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f50130a9 = "android.remoteInputHistory";

    /* JADX INFO: renamed from: a98o, reason: collision with root package name */
    @zy.x2
    public static final int f50131a98o = 0;

    /* JADX INFO: renamed from: b */
    @SuppressLint({"ActionValue"})
    public static final String f3257b = "android.isGroupConversation";

    /* JADX INFO: renamed from: bf2, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f50132bf2 = "android.hiddenConversationTitle";

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    public static final String f50133bo = "promo";

    /* JADX INFO: renamed from: c */
    @SuppressLint({"ActionValue"})
    public static final String f3258c = "android.textLines";

    /* JADX INFO: renamed from: c8jq, reason: collision with root package name */
    public static final String f50134c8jq = "progress";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f50135cdj = 64;

    /* JADX INFO: renamed from: ch, reason: collision with root package name */
    public static final String f50136ch = "call";

    /* JADX INFO: renamed from: d */
    public static final String f3259d = "reminder";

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f50137d2ok = "android.progress";

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f50138d3 = "android.icon";

    /* JADX INFO: renamed from: d8wk, reason: collision with root package name */
    public static final int f50139d8wk = 1;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f50140dd = "android.showChronometer";

    /* JADX INFO: renamed from: dr, reason: collision with root package name */
    public static final String f50141dr = "err";

    /* JADX INFO: renamed from: e */
    @SuppressLint({"ActionValue"})
    public static final String f3260e = "android.people.list";

    /* JADX INFO: renamed from: ek5k, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f50142ek5k = "android.conversationTitle";

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f50143eqxt = "android.largeIcon.big";

    /* JADX INFO: renamed from: f */
    @SuppressLint({"ActionValue"})
    public static final String f3261f = "android.showBigPictureWhenCollapsed";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f50144f7l8 = 1;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final int f50145fn3e = 4096;

    /* JADX INFO: renamed from: fnq8, reason: collision with root package name */
    public static final String f50146fnq8 = "location_sharing";

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f50147fti = "android.infoText";

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final int f50148fu4 = -2;

    /* JADX INFO: renamed from: g */
    public static final int f3262g = -1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final int f50149g1 = 2;

    /* JADX INFO: renamed from: gbni, reason: collision with root package name */
    public static final int f50150gbni = 1;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f50151gvn7 = "android.bigText";

    /* JADX INFO: renamed from: gyi, reason: collision with root package name */
    public static final String f50152gyi = "social";

    /* JADX INFO: renamed from: h */
    public static final int f3263h = 32;

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f50153hb = "android.mediaSession";

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f50154hyr = "android.pictureContentDescription";

    /* JADX INFO: renamed from: i */
    public static final int f3264i = 512;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f50155i1 = "android.audioContents";

    /* JADX INFO: renamed from: i9jn, reason: collision with root package name */
    public static final int f50156i9jn = 0;

    /* JADX INFO: renamed from: ikck, reason: collision with root package name */
    public static final String f50157ikck = "service";

    /* JADX INFO: renamed from: j */
    @SuppressLint({"ActionValue"})
    public static final String f3265j = "android.compactActions";

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f50158jk = "android.subText";

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f50159jp0y = "android.summaryText";

    /* JADX INFO: renamed from: k */
    @SuppressLint({"ActionValue"})
    public static final String f3266k = "android.intent.category.NOTIFICATION_PREFERENCES";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    @Deprecated
    public static final int f50160ki = 128;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f50161kja0 = 16;

    /* JADX INFO: renamed from: l */
    @SuppressLint({"ActionValue"})
    public static final String f3267l = "android.showWhen";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f50162ld6 = 1;

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f50163lrht = "android.template";

    /* JADX INFO: renamed from: ltg8, reason: collision with root package name */
    public static final int f50164ltg8 = 1;

    /* JADX INFO: renamed from: lv5, reason: collision with root package name */
    public static final String f50165lv5 = "msg";

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f50166lvui = "android.progressMax";

    /* JADX INFO: renamed from: m */
    @SuppressLint({"ActionValue"})
    public static final String f3268m = "android.messagingStyleUser";

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f50167mcp = "android.text";

    /* JADX INFO: renamed from: mu, reason: collision with root package name */
    public static final String f50168mu = "recommendation";

    /* JADX INFO: renamed from: n */
    @SuppressLint({"ActionValue"})
    public static final String f3269n = "android.intent.extra.NOTIFICATION_ID";

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f50169n5r1 = "android.picture";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f50170n7h = 8;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f50171ncyb = "android.colorized";

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final int f50172ni7 = -1;

    /* JADX INFO: renamed from: nmn5, reason: collision with root package name */
    public static final String f50173nmn5 = "navigation";

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f50174nn86 = "android.backgroundImageUri";

    /* JADX INFO: renamed from: o */
    @SuppressLint({"ActionValue"})
    public static final String f3270o = "android.selfDisplayName";

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final int f50175o1t = 2;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f50176oc = "android.largeIcon";

    /* JADX INFO: renamed from: p */
    public static final int f3271p = -1;

    /* JADX INFO: renamed from: py, reason: collision with root package name */
    public static final String f50177py = "silent";

    /* JADX INFO: renamed from: q */
    @SuppressLint({"ActionValue"})
    public static final String f3272q = "android.intent.extra.NOTIFICATION_TAG";

    /* JADX INFO: renamed from: qkj8, reason: collision with root package name */
    public static final String f50178qkj8 = "workout";

    /* JADX INFO: renamed from: qo, reason: collision with root package name */
    public static final String f50179qo = "stopwatch";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f50180qrj = 4;

    /* JADX INFO: renamed from: r */
    @SuppressLint({"ActionValue"})
    public static final String f3273r = "android.progressIndeterminate";

    /* JADX INFO: renamed from: r8s8, reason: collision with root package name */
    public static final int f50181r8s8 = 2;

    /* JADX INFO: renamed from: s */
    public static final int f3274s = 4;

    /* JADX INFO: renamed from: t */
    @SuppressLint({"ActionValue"})
    public static final String f3275t = "android.title.big";

    /* JADX INFO: renamed from: t8iq, reason: collision with root package name */
    public static final String f50182t8iq = "email";

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final int f50183t8r = 256;

    /* JADX INFO: renamed from: tfm, reason: collision with root package name */
    public static final String f50184tfm = "missed_call";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f50185toq = "android.intent.extra.CHANNEL_ID";

    /* JADX INFO: renamed from: u */
    public static final String f3276u = "event";

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    public static final String f50186uv6 = "androidx.core.app.extra.COMPAT_TEMPLATE";

    /* JADX INFO: renamed from: v */
    public static final String f3277v = "sys";

    /* JADX INFO: renamed from: vq, reason: collision with root package name */
    public static final String f50187vq = "status";

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    @Deprecated
    public static final String f50188vyq = "android.people";

    /* JADX INFO: renamed from: was, reason: collision with root package name */
    public static final int f50189was = 0;

    /* JADX INFO: renamed from: wo, reason: collision with root package name */
    public static final int f50190wo = 0;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f50191wvg = "android.title";

    /* JADX INFO: renamed from: x */
    public static final int f3278x = -1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f50192x2 = 2;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f50193x9kr = "android.chronometerCountDown";

    /* JADX INFO: renamed from: xwq3, reason: collision with root package name */
    public static final String f50194xwq3 = "transport";

    /* JADX INFO: renamed from: y */
    public static final int f3279y = 2;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public static final String f50195y2 = "alarm";

    /* JADX INFO: renamed from: y9n, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f50196y9n = "android.messages.historic";

    /* JADX INFO: renamed from: yz, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f50197yz = "android.messages";

    /* JADX INFO: renamed from: z */
    public static final int f3280z = 1;

    /* JADX INFO: renamed from: zp, reason: collision with root package name */
    public static final int f50198zp = 0;

    /* JADX INFO: renamed from: zsr0, reason: collision with root package name */
    public static final int f50199zsr0 = 2;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final int f50200zurt = 0;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f50201zy = "android.intent.extra.CHANNEL_GROUP_ID";

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static abstract class cdj {

        /* JADX INFO: renamed from: k */
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        protected f7l8 f3281k;

        /* JADX INFO: renamed from: q */
        boolean f3282q = false;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        CharSequence f50202toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        CharSequence f50203zy;

        private Bitmap cdj(int i2, int i3, int i4, int i5) {
            int i6 = C7400k.q.f42588y;
            if (i5 == 0) {
                i5 = 0;
            }
            Bitmap bitmapN7h = n7h(i6, i5, i3);
            Canvas canvas = new Canvas(bitmapN7h);
            Drawable drawableMutate = this.f3281k.f3288k.getResources().getDrawable(i2).mutate();
            drawableMutate.setFilterBitmap(true);
            int i7 = (i3 - i4) / 2;
            int i8 = i4 + i7;
            drawableMutate.setBounds(i7, i7, i8, i8);
            drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            drawableMutate.draw(canvas);
            return bitmapN7h;
        }

        private void fn3e(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(C7400k.n.f42565u, 8);
            remoteViews.setViewVisibility(C7400k.n.f93257lv5, 8);
            remoteViews.setViewVisibility(C7400k.n.f93264nmn5, 8);
        }

        /* JADX INFO: renamed from: g */
        private int m2018g() {
            Resources resources = this.f3281k.f3288k.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C7400k.zy.f93325fn3e);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C7400k.zy.f93334zurt);
            float fM2022y = (m2022y(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - fM2022y) * dimensionPixelSize) + (fM2022y * dimensionPixelSize2));
        }

        /* JADX INFO: renamed from: h */
        private Bitmap m2019h(@zy.lvui IconCompat iconCompat, int i2, int i3) {
            Drawable drawableA9 = iconCompat.a9(this.f3281k.f3288k);
            int intrinsicWidth = i3 == 0 ? drawableA9.getIntrinsicWidth() : i3;
            if (i3 == 0) {
                i3 = drawableA9.getIntrinsicHeight();
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, i3, Bitmap.Config.ARGB_8888);
            drawableA9.setBounds(0, 0, intrinsicWidth, i3);
            if (i2 != 0) {
                drawableA9.mutate().setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
            }
            drawableA9.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        }

        @zy.dd
        static cdj ld6(@zy.lvui Bundle bundle) {
            cdj cdjVarM2021s = m2021s(bundle.getString(x9kr.f50186uv6));
            return cdjVarM2021s != null ? cdjVarM2021s : (bundle.containsKey(x9kr.f3270o) || bundle.containsKey(x9kr.f3268m)) ? new qrj() : bundle.containsKey(x9kr.f50169n5r1) ? new C0464q() : bundle.containsKey(x9kr.f50151gvn7) ? new C0462n() : bundle.containsKey(x9kr.f3258c) ? new x2() : m2020p(bundle.getString(x9kr.f50163lrht));
        }

        private Bitmap n7h(int i2, int i3, int i4) {
            return m2019h(IconCompat.zurt(this.f3281k.f3288k, i2), i3, i4);
        }

        @zy.dd
        /* JADX INFO: renamed from: p */
        private static cdj m2020p(@zy.dd String str) {
            if (str == null) {
                return null;
            }
            if (str.equals(Notification.BigPictureStyle.class.getName())) {
                return new C0464q();
            }
            if (str.equals(Notification.BigTextStyle.class.getName())) {
                return new C0462n();
            }
            if (str.equals(Notification.InboxStyle.class.getName())) {
                return new x2();
            }
            if (str.equals(Notification.MessagingStyle.class.getName())) {
                return new qrj();
            }
            if (str.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                return new C0466s();
            }
            return null;
        }

        @zy.dd
        /* JADX INFO: renamed from: s */
        static cdj m2021s(@zy.dd String str) {
            if (str == null) {
                return null;
            }
            switch (str) {
                case "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle":
                    return new C0466s();
                case "androidx.core.app.NotificationCompat$BigPictureStyle":
                    return new C0464q();
                case "androidx.core.app.NotificationCompat$InboxStyle":
                    return new x2();
                case "androidx.core.app.NotificationCompat$BigTextStyle":
                    return new C0462n();
                case "androidx.core.app.NotificationCompat$MessagingStyle":
                    return new qrj();
                default:
                    return null;
            }
        }

        @zy.dd
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public static cdj t8r(@zy.lvui Notification notification) {
            Bundle bundleN7h = x9kr.n7h(notification);
            if (bundleN7h == null) {
                return null;
            }
            return x2(bundleN7h);
        }

        @zy.dd
        static cdj x2(@zy.lvui Bundle bundle) {
            cdj cdjVarLd6 = ld6(bundle);
            if (cdjVarLd6 == null) {
                return null;
            }
            try {
                cdjVarLd6.mo2027z(bundle);
                return cdjVarLd6;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: y */
        private static float m2022y(float f2, float f3, float f4) {
            return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
        }

        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        protected void f7l8(@zy.lvui Bundle bundle) {
            bundle.remove(x9kr.f50159jp0y);
            bundle.remove(x9kr.f3275t);
            bundle.remove(x9kr.f50186uv6);
        }

        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public RemoteViews fu4(fu4 fu4Var) {
            return null;
        }

        @zy.dd
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: i */
        protected String mo2023i() {
            return null;
        }

        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: k */
        public void mo2024k(@zy.lvui Bundle bundle) {
            if (this.f3282q) {
                bundle.putCharSequence(x9kr.f50159jp0y, this.f50203zy);
            }
            CharSequence charSequence = this.f50202toq;
            if (charSequence != null) {
                bundle.putCharSequence(x9kr.f3275t, charSequence);
            }
            String strMo2023i = mo2023i();
            if (strMo2023i != null) {
                bundle.putString(x9kr.f50186uv6, strMo2023i);
            }
        }

        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public boolean ki() {
            return false;
        }

        Bitmap kja0(@zy.lvui IconCompat iconCompat, int i2) {
            return m2019h(iconCompat, i2, 0);
        }

        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: n */
        public void m2025n(RemoteViews remoteViews, RemoteViews remoteViews2) {
            fn3e(remoteViews);
            int i2 = C7400k.n.f42549e;
            remoteViews.removeAllViews(i2);
            remoteViews.addView(i2, remoteViews2.clone());
            remoteViews.setViewVisibility(i2, 0);
            remoteViews.setViewPadding(C7400k.n.f93265nn86, 0, m2018g(), 0, 0);
        }

        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public RemoteViews ni7(fu4 fu4Var) {
            return null;
        }

        public void o1t(@zy.dd f7l8 f7l8Var) {
            if (this.f3281k != f7l8Var) {
                this.f3281k = f7l8Var;
                if (f7l8Var != null) {
                    f7l8Var.xwq3(this);
                }
            }
        }

        @zy.dd
        /* JADX INFO: renamed from: q */
        public Notification m2026q() {
            f7l8 f7l8Var = this.f3281k;
            if (f7l8Var != null) {
                return f7l8Var.m2051y();
            }
            return null;
        }

        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public Bitmap qrj(int i2, int i3) {
            return n7h(i2, i3, 0);
        }

        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public void toq(fu4 fu4Var) {
        }

        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: z */
        protected void mo2027z(@zy.lvui Bundle bundle) {
            if (bundle.containsKey(x9kr.f50159jp0y)) {
                this.f50203zy = bundle.getCharSequence(x9kr.f50159jp0y);
                this.f3282q = true;
            }
            this.f50202toq = bundle.getCharSequence(x9kr.f3275t);
        }

        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public RemoteViews zurt(fu4 fu4Var) {
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0116  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0119  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x013d  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x017d  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0182  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0184  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x018d  */
        @zy.lvui
        @zy.uv6({zy.uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.widget.RemoteViews zy(boolean r12, int r13, boolean r14) {
            /*
                Method dump skipped, instruction units count: 402
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.x9kr.cdj.zy(boolean, int, boolean):android.widget.RemoteViews");
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.x9kr$g */
    /* JADX INFO: compiled from: NotificationCompat.java */
    public static final class C0459g {

        /* JADX INFO: renamed from: s */
        private static final int f3298s = 2;

        /* JADX INFO: renamed from: y */
        private static final int f3299y = 1;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private String f50240f7l8;

        /* JADX INFO: renamed from: g */
        private int f3300g;

        /* JADX INFO: renamed from: k */
        private PendingIntent f3301k;

        /* JADX INFO: renamed from: n */
        @InterfaceC7829h
        private int f3302n;

        /* JADX INFO: renamed from: q */
        private int f3303q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private PendingIntent f50241toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private IconCompat f50242zy;

        /* JADX INFO: renamed from: androidx.core.app.x9kr$g$k */
        /* JADX INFO: compiled from: NotificationCompat.java */
        @zy.hyr(29)
        private static class k {
            private k() {
            }

            @zy.hyr(29)
            @zy.dd
            /* JADX INFO: renamed from: k */
            static C0459g m2060k(@zy.dd Notification$BubbleMetadata notification$BubbleMetadata) {
                if (notification$BubbleMetadata == null || notification$BubbleMetadata.getIntent() == null) {
                    return null;
                }
                zy zyVarM2066s = new zy(notification$BubbleMetadata.getIntent(), IconCompat.f7l8(notification$BubbleMetadata.getIcon())).toq(notification$BubbleMetadata.getAutoExpandBubble()).zy(notification$BubbleMetadata.getDeleteIntent()).m2066s(notification$BubbleMetadata.isNotificationSuppressed());
                if (notification$BubbleMetadata.getDesiredHeight() != 0) {
                    zyVarM2066s.m2065q(notification$BubbleMetadata.getDesiredHeight());
                }
                if (notification$BubbleMetadata.getDesiredHeightResId() != 0) {
                    zyVarM2066s.m2064n(notification$BubbleMetadata.getDesiredHeightResId());
                }
                return zyVarM2066s.m2063k();
            }

            @zy.hyr(29)
            @zy.dd
            static Notification$BubbleMetadata toq(@zy.dd C0459g c0459g) {
                if (c0459g == null || c0459g.f7l8() == null) {
                    return null;
                }
                Notification$BubbleMetadata.Builder suppressNotification = new Notification$BubbleMetadata.Builder().setIcon(c0459g.m2054g().eqxt()).setIntent(c0459g.f7l8()).setDeleteIntent(c0459g.zy()).setAutoExpandBubble(c0459g.toq()).setSuppressNotification(c0459g.m2058s());
                if (c0459g.m2057q() != 0) {
                    suppressNotification.setDesiredHeight(c0459g.m2057q());
                }
                if (c0459g.m2055n() != 0) {
                    suppressNotification.setDesiredHeightResId(c0459g.m2055n());
                }
                return suppressNotification.build();
            }
        }

        /* JADX INFO: renamed from: androidx.core.app.x9kr$g$toq */
        /* JADX INFO: compiled from: NotificationCompat.java */
        @zy.hyr(30)
        private static class toq {
            private toq() {
            }

            @zy.hyr(30)
            @zy.dd
            /* JADX INFO: renamed from: k */
            static C0459g m2061k(@zy.dd Notification$BubbleMetadata notification$BubbleMetadata) {
                if (notification$BubbleMetadata == null) {
                    return null;
                }
                zy zyVar = notification$BubbleMetadata.getShortcutId() != null ? new zy(notification$BubbleMetadata.getShortcutId()) : new zy(notification$BubbleMetadata.getIntent(), IconCompat.f7l8(notification$BubbleMetadata.getIcon()));
                zyVar.toq(notification$BubbleMetadata.getAutoExpandBubble()).zy(notification$BubbleMetadata.getDeleteIntent()).m2066s(notification$BubbleMetadata.isNotificationSuppressed());
                if (notification$BubbleMetadata.getDesiredHeight() != 0) {
                    zyVar.m2065q(notification$BubbleMetadata.getDesiredHeight());
                }
                if (notification$BubbleMetadata.getDesiredHeightResId() != 0) {
                    zyVar.m2064n(notification$BubbleMetadata.getDesiredHeightResId());
                }
                return zyVar.m2063k();
            }

            @zy.hyr(30)
            @zy.dd
            static Notification$BubbleMetadata toq(@zy.dd C0459g c0459g) {
                if (c0459g == null) {
                    return null;
                }
                Notification$BubbleMetadata.Builder builder = c0459g.m2059y() != null ? new Notification$BubbleMetadata.Builder(c0459g.m2059y()) : new Notification$BubbleMetadata.Builder(c0459g.f7l8(), c0459g.m2054g().eqxt());
                builder.setDeleteIntent(c0459g.zy()).setAutoExpandBubble(c0459g.toq()).setSuppressNotification(c0459g.m2058s());
                if (c0459g.m2057q() != 0) {
                    builder.setDesiredHeight(c0459g.m2057q());
                }
                if (c0459g.m2055n() != 0) {
                    builder.setDesiredHeightResId(c0459g.m2055n());
                }
                return builder.build();
            }
        }

        /* JADX INFO: renamed from: androidx.core.app.x9kr$g$zy */
        /* JADX INFO: compiled from: NotificationCompat.java */
        public static final class zy {

            /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
            private String f50243f7l8;

            /* JADX INFO: renamed from: g */
            private PendingIntent f3304g;

            /* JADX INFO: renamed from: k */
            private PendingIntent f3305k;

            /* JADX INFO: renamed from: n */
            private int f3306n;

            /* JADX INFO: renamed from: q */
            @InterfaceC7829h
            private int f3307q;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            private IconCompat f50244toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            private int f50245zy;

            @Deprecated
            public zy() {
            }

            @zy.lvui
            /* JADX INFO: renamed from: g */
            private zy m2062g(int i2, boolean z2) {
                if (z2) {
                    this.f3306n = i2 | this.f3306n;
                } else {
                    this.f3306n = (~i2) & this.f3306n;
                }
                return this;
            }

            @zy.lvui
            public zy f7l8(@zy.lvui IconCompat iconCompat) {
                if (this.f50243f7l8 != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                }
                if (iconCompat == null) {
                    throw new NullPointerException("Bubbles require non-null icon");
                }
                this.f50244toq = iconCompat;
                return this;
            }

            @zy.lvui
            @SuppressLint({"SyntheticAccessor"})
            /* JADX INFO: renamed from: k */
            public C0459g m2063k() {
                String str = this.f50243f7l8;
                if (str == null && this.f3305k == null) {
                    throw new NullPointerException("Must supply pending intent or shortcut to bubble");
                }
                if (str == null && this.f50244toq == null) {
                    throw new NullPointerException("Must supply an icon or shortcut for the bubble");
                }
                C0459g c0459g = new C0459g(this.f3305k, this.f3304g, this.f50244toq, this.f50245zy, this.f3307q, this.f3306n, str);
                c0459g.m2056p(this.f3306n);
                return c0459g;
            }

            @zy.lvui
            /* JADX INFO: renamed from: n */
            public zy m2064n(@InterfaceC7829h int i2) {
                this.f3307q = i2;
                this.f50245zy = 0;
                return this;
            }

            @zy.lvui
            /* JADX INFO: renamed from: q */
            public zy m2065q(@zy.cdj(unit = 0) int i2) {
                this.f50245zy = Math.max(i2, 0);
                this.f3307q = 0;
                return this;
            }

            @zy.lvui
            /* JADX INFO: renamed from: s */
            public zy m2066s(boolean z2) {
                m2062g(2, z2);
                return this;
            }

            @zy.lvui
            public zy toq(boolean z2) {
                m2062g(1, z2);
                return this;
            }

            @zy.lvui
            /* JADX INFO: renamed from: y */
            public zy m2067y(@zy.lvui PendingIntent pendingIntent) {
                if (this.f50243f7l8 != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                }
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                this.f3305k = pendingIntent;
                return this;
            }

            @zy.lvui
            public zy zy(@zy.dd PendingIntent pendingIntent) {
                this.f3304g = pendingIntent;
                return this;
            }

            @zy.hyr(30)
            public zy(@zy.lvui String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new NullPointerException("Bubble requires a non-null shortcut id");
                }
                this.f50243f7l8 = str;
            }

            public zy(@zy.lvui PendingIntent pendingIntent, @zy.lvui IconCompat iconCompat) {
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                if (iconCompat != null) {
                    this.f3305k = pendingIntent;
                    this.f50244toq = iconCompat;
                    return;
                }
                throw new NullPointerException("Bubbles require non-null icon");
            }
        }

        @zy.dd
        /* JADX INFO: renamed from: k */
        public static C0459g m2053k(@zy.dd Notification$BubbleMetadata notification$BubbleMetadata) {
            if (notification$BubbleMetadata == null) {
                return null;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                return toq.m2061k(notification$BubbleMetadata);
            }
            if (i2 == 29) {
                return k.m2060k(notification$BubbleMetadata);
            }
            return null;
        }

        @zy.dd
        public static Notification$BubbleMetadata ld6(@zy.dd C0459g c0459g) {
            if (c0459g == null) {
                return null;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                return toq.toq(c0459g);
            }
            if (i2 == 29) {
                return k.toq(c0459g);
            }
            return null;
        }

        @SuppressLint({"InvalidNullConversion"})
        @zy.dd
        public PendingIntent f7l8() {
            return this.f3301k;
        }

        @SuppressLint({"InvalidNullConversion"})
        @zy.dd
        /* JADX INFO: renamed from: g */
        public IconCompat m2054g() {
            return this.f50242zy;
        }

        @InterfaceC7829h
        /* JADX INFO: renamed from: n */
        public int m2055n() {
            return this.f3302n;
        }

        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: p */
        public void m2056p(int i2) {
            this.f3300g = i2;
        }

        @zy.cdj(unit = 0)
        /* JADX INFO: renamed from: q */
        public int m2057q() {
            return this.f3303q;
        }

        /* JADX INFO: renamed from: s */
        public boolean m2058s() {
            return (this.f3300g & 2) != 0;
        }

        public boolean toq() {
            return (this.f3300g & 1) != 0;
        }

        @zy.dd
        /* JADX INFO: renamed from: y */
        public String m2059y() {
            return this.f50240f7l8;
        }

        @zy.dd
        public PendingIntent zy() {
            return this.f50241toq;
        }

        private C0459g(@zy.dd PendingIntent pendingIntent, @zy.dd PendingIntent pendingIntent2, @zy.dd IconCompat iconCompat, int i2, @InterfaceC7829h int i3, int i4, @zy.dd String str) {
            this.f3301k = pendingIntent;
            this.f50242zy = iconCompat;
            this.f3303q = i2;
            this.f3302n = i3;
            this.f50241toq = pendingIntent2;
            this.f3300g = i4;
            this.f50240f7l8 = str;
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.x9kr$h */
    /* JADX INFO: compiled from: NotificationCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface InterfaceC0460h {
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface kja0 {
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface ld6 {
    }

    /* JADX INFO: renamed from: androidx.core.app.x9kr$n */
    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class C0462n extends cdj {

        /* JADX INFO: renamed from: g */
        private static final String f3323g = "androidx.core.app.NotificationCompat$BigTextStyle";

        /* JADX INFO: renamed from: n */
        private CharSequence f3324n;

        public C0462n() {
        }

        @Override // androidx.core.app.x9kr.cdj
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        protected void f7l8(@zy.lvui Bundle bundle) {
            super.f7l8(bundle);
            bundle.remove(x9kr.f50151gvn7);
        }

        @Override // androidx.core.app.x9kr.cdj
        @zy.lvui
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: i */
        protected String mo2023i() {
            return f3323g;
        }

        @Override // androidx.core.app.x9kr.cdj
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: k */
        public void mo2024k(@zy.lvui Bundle bundle) {
            super.mo2024k(bundle);
        }

        @zy.lvui
        public C0462n mcp(@zy.dd CharSequence charSequence) {
            this.f50203zy = f7l8.wvg(charSequence);
            this.f3282q = true;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: t */
        public C0462n m2083t(@zy.dd CharSequence charSequence) {
            this.f50202toq = f7l8.wvg(charSequence);
            return this;
        }

        @Override // androidx.core.app.x9kr.cdj
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public void toq(fu4 fu4Var) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(fu4Var.mo1878k()).setBigContentTitle(this.f50202toq).bigText(this.f3324n);
            if (this.f3282q) {
                bigTextStyleBigText.setSummaryText(this.f50203zy);
            }
        }

        @zy.lvui
        public C0462n wvg(@zy.dd CharSequence charSequence) {
            this.f3324n = f7l8.wvg(charSequence);
            return this;
        }

        @Override // androidx.core.app.x9kr.cdj
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: z */
        protected void mo2027z(@zy.lvui Bundle bundle) {
            super.mo2027z(bundle);
            this.f3324n = bundle.getCharSequence(x9kr.f50151gvn7);
        }

        public C0462n(@zy.dd f7l8 f7l8Var) {
            o1t(f7l8Var);
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface n7h {
    }

    /* JADX INFO: renamed from: androidx.core.app.x9kr$p */
    /* JADX INFO: compiled from: NotificationCompat.java */
    public interface InterfaceC0463p {
        @zy.lvui
        /* JADX INFO: renamed from: k */
        f7l8 mo2075k(@zy.lvui f7l8 f7l8Var);
    }

    /* JADX INFO: renamed from: androidx.core.app.x9kr$q */
    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class C0464q extends cdj {

        /* JADX INFO: renamed from: p */
        private static final String f3325p = "androidx.core.app.NotificationCompat$BigPictureStyle";

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private boolean f50279f7l8;

        /* JADX INFO: renamed from: g */
        private IconCompat f3326g;

        /* JADX INFO: renamed from: n */
        private Bitmap f3327n;

        /* JADX INFO: renamed from: s */
        private boolean f3328s;

        /* JADX INFO: renamed from: y */
        private CharSequence f3329y;

        /* JADX INFO: renamed from: androidx.core.app.x9kr$q$k */
        /* JADX INFO: compiled from: NotificationCompat.java */
        @zy.hyr(16)
        private static class k {
            private k() {
            }

            @zy.hyr(16)
            /* JADX INFO: renamed from: k */
            static void m2085k(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            @zy.hyr(16)
            static void toq(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* JADX INFO: renamed from: androidx.core.app.x9kr$q$toq */
        /* JADX INFO: compiled from: NotificationCompat.java */
        @zy.hyr(23)
        private static class toq {
            private toq() {
            }

            @zy.hyr(23)
            /* JADX INFO: renamed from: k */
            static void m2086k(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* JADX INFO: renamed from: androidx.core.app.x9kr$q$zy */
        /* JADX INFO: compiled from: NotificationCompat.java */
        @zy.hyr(31)
        private static class zy {
            private zy() {
            }

            @zy.hyr(31)
            /* JADX INFO: renamed from: k */
            static void m2087k(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            @zy.hyr(31)
            static void toq(Notification.BigPictureStyle bigPictureStyle, boolean z2) {
                bigPictureStyle.showBigPictureWhenCollapsed(z2);
            }
        }

        public C0464q() {
        }

        @zy.dd
        private static IconCompat wvg(@zy.dd Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (parcelable instanceof Icon) {
                return IconCompat.f7l8((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.ki((Bitmap) parcelable);
            }
            return null;
        }

        @zy.hyr(31)
        @zy.lvui
        public C0464q a9(@zy.dd CharSequence charSequence) {
            this.f3329y = charSequence;
            return this;
        }

        @Override // androidx.core.app.x9kr.cdj
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        protected void f7l8(@zy.lvui Bundle bundle) {
            super.f7l8(bundle);
            bundle.remove(x9kr.f50143eqxt);
            bundle.remove(x9kr.f50169n5r1);
            bundle.remove(x9kr.f3261f);
        }

        @zy.lvui
        public C0464q fti(@zy.dd CharSequence charSequence) {
            this.f50203zy = f7l8.wvg(charSequence);
            this.f3282q = true;
            return this;
        }

        @Override // androidx.core.app.x9kr.cdj
        @zy.lvui
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: i */
        protected String mo2023i() {
            return f3325p;
        }

        @zy.lvui
        public C0464q jk(@zy.dd CharSequence charSequence) {
            this.f50202toq = f7l8.wvg(charSequence);
            return this;
        }

        @zy.hyr(31)
        @zy.lvui
        public C0464q jp0y(boolean z2) {
            this.f3328s = z2;
            return this;
        }

        @zy.lvui
        public C0464q mcp(@zy.dd Bitmap bitmap) {
            this.f3327n = bitmap;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: t */
        public C0464q m2084t(@zy.dd Bitmap bitmap) {
            this.f3326g = bitmap == null ? null : IconCompat.ki(bitmap);
            this.f50279f7l8 = true;
            return this;
        }

        @Override // androidx.core.app.x9kr.cdj
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public void toq(fu4 fu4Var) {
            int i2 = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle bigPictureStyleBigPicture = new Notification.BigPictureStyle(fu4Var.mo1878k()).setBigContentTitle(this.f50202toq).bigPicture(this.f3327n);
            if (this.f50279f7l8) {
                if (this.f3326g == null) {
                    k.m2085k(bigPictureStyleBigPicture, null);
                } else {
                    toq.m2086k(bigPictureStyleBigPicture, this.f3326g.d2ok(fu4Var instanceof C0434j ? ((C0434j) fu4Var).m1901g() : null));
                }
            }
            if (this.f3282q) {
                k.toq(bigPictureStyleBigPicture, this.f50203zy);
            }
            if (i2 >= 31) {
                zy.toq(bigPictureStyleBigPicture, this.f3328s);
                zy.m2087k(bigPictureStyleBigPicture, this.f3329y);
            }
        }

        @Override // androidx.core.app.x9kr.cdj
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: z */
        protected void mo2027z(@zy.lvui Bundle bundle) {
            super.mo2027z(bundle);
            if (bundle.containsKey(x9kr.f50143eqxt)) {
                this.f3326g = wvg(bundle.getParcelable(x9kr.f50143eqxt));
                this.f50279f7l8 = true;
            }
            this.f3327n = (Bitmap) bundle.getParcelable(x9kr.f50169n5r1);
            this.f3328s = bundle.getBoolean(x9kr.f3261f);
        }

        public C0464q(@zy.dd f7l8 f7l8Var) {
            o1t(f7l8Var);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.x9kr$s */
    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class C0466s extends cdj {

        /* JADX INFO: renamed from: g */
        private static final int f3342g = 3;

        /* JADX INFO: renamed from: n */
        private static final String f3343n = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";

        private static List<toq> mcp(List<toq> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (toq toqVar : list) {
                if (!toqVar.x2()) {
                    arrayList.add(toqVar);
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: t */
        private RemoteViews m2097t(toq toqVar) {
            boolean z2 = toqVar.f50300ld6 == null;
            RemoteViews remoteViews = new RemoteViews(this.f3281k.f3288k.getPackageName(), z2 ? C7400k.f7l8.f93223zy : C7400k.f7l8.f93222toq);
            IconCompat iconCompatM2098g = toqVar.m2098g();
            if (iconCompatM2098g != null) {
                remoteViews.setImageViewBitmap(C7400k.n.f93267oc, kja0(iconCompatM2098g, this.f3281k.f3288k.getResources().getColor(C7400k.toq.f93322zy)));
            }
            remoteViews.setTextViewText(C7400k.n.f93242eqxt, toqVar.f3350p);
            if (!z2) {
                remoteViews.setOnClickPendingIntent(C7400k.n.f93247gvn7, toqVar.f50300ld6);
            }
            remoteViews.setContentDescription(C7400k.n.f93247gvn7, toqVar.f3350p);
            return remoteViews;
        }

        private RemoteViews wvg(RemoteViews remoteViews, boolean z2) {
            int iMin;
            boolean z3 = true;
            RemoteViews remoteViewsZy = zy(true, C7400k.f7l8.f42536q, false);
            remoteViewsZy.removeAllViews(C7400k.n.f93238d2ok);
            List<toq> listMcp = mcp(this.f3281k.f50233toq);
            if (!z2 || listMcp == null || (iMin = Math.min(listMcp.size(), 3)) <= 0) {
                z3 = false;
            } else {
                for (int i2 = 0; i2 < iMin; i2++) {
                    remoteViewsZy.addView(C7400k.n.f93238d2ok, m2097t(listMcp.get(i2)));
                }
            }
            int i3 = z3 ? 0 : 8;
            remoteViewsZy.setViewVisibility(C7400k.n.f93238d2ok, i3);
            remoteViewsZy.setViewVisibility(C7400k.n.f93239d3, i3);
            m2025n(remoteViewsZy, remoteViews);
            return remoteViewsZy;
        }

        @Override // androidx.core.app.x9kr.cdj
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public RemoteViews fu4(fu4 fu4Var) {
            return null;
        }

        @Override // androidx.core.app.x9kr.cdj
        @zy.lvui
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: i */
        protected String mo2023i() {
            return f3343n;
        }

        @Override // androidx.core.app.x9kr.cdj
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public boolean ki() {
            return true;
        }

        @Override // androidx.core.app.x9kr.cdj
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public RemoteViews ni7(fu4 fu4Var) {
            return null;
        }

        @Override // androidx.core.app.x9kr.cdj
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public void toq(fu4 fu4Var) {
            fu4Var.mo1878k().setStyle(new Notification.DecoratedCustomViewStyle());
        }

        @Override // androidx.core.app.x9kr.cdj
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public RemoteViews zurt(fu4 fu4Var) {
            return null;
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class toq {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        public static final int f50289cdj = 4;

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        public static final int f50290fn3e = 8;

        /* JADX INFO: renamed from: fu4, reason: collision with root package name */
        static final String f50291fu4 = "android.support.action.showsUserInterface";

        /* JADX INFO: renamed from: h */
        public static final int f3344h = 3;

        /* JADX INFO: renamed from: i */
        public static final int f3345i = 7;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        public static final int f50292ki = 5;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        public static final int f50293kja0 = 2;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        public static final int f50294n7h = 1;

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        public static final int f50295ni7 = 10;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        public static final int f50296qrj = 0;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        public static final int f50297t8r = 6;

        /* JADX INFO: renamed from: z */
        static final String f3346z = "android.support.action.semanticAction";

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        public static final int f50298zurt = 9;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private final int f50299f7l8;

        /* JADX INFO: renamed from: g */
        boolean f3347g;

        /* JADX INFO: renamed from: k */
        final Bundle f3348k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        public PendingIntent f50300ld6;

        /* JADX INFO: renamed from: n */
        private boolean f3349n;

        /* JADX INFO: renamed from: p */
        public CharSequence f3350p;

        /* JADX INFO: renamed from: q */
        private final ch[] f3351q;

        /* JADX INFO: renamed from: s */
        @Deprecated
        public int f3352s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @zy.dd
        private IconCompat f50301toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private boolean f50302x2;

        /* JADX INFO: renamed from: y */
        private final boolean f3353y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final ch[] f50303zy;

        /* JADX INFO: renamed from: androidx.core.app.x9kr$toq$k */
        /* JADX INFO: compiled from: NotificationCompat.java */
        public static final class C0467k {

            /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
            private int f50304f7l8;

            /* JADX INFO: renamed from: g */
            private ArrayList<ch> f3354g;

            /* JADX INFO: renamed from: k */
            private final IconCompat f3355k;

            /* JADX INFO: renamed from: n */
            private final Bundle f3356n;

            /* JADX INFO: renamed from: p */
            private boolean f3357p;

            /* JADX INFO: renamed from: q */
            private boolean f3358q;

            /* JADX INFO: renamed from: s */
            private boolean f3359s;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            private final CharSequence f50305toq;

            /* JADX INFO: renamed from: y */
            private boolean f3360y;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            private final PendingIntent f50306zy;

            public C0467k(@zy.dd IconCompat iconCompat, @zy.dd CharSequence charSequence, @zy.dd PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            @zy.hyr(19)
            @zy.lvui
            @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
            /* JADX INFO: renamed from: g */
            public static C0467k m2105g(@zy.lvui Notification.Action action) {
                C0467k c0467k = action.getIcon() != null ? new C0467k(IconCompat.f7l8(action.getIcon()), action.title, action.actionIntent) : new C0467k(action.icon, action.title, action.actionIntent);
                RemoteInput[] remoteInputs = action.getRemoteInputs();
                if (remoteInputs != null && remoteInputs.length != 0) {
                    for (RemoteInput remoteInput : remoteInputs) {
                        c0467k.toq(ch.m1840n(remoteInput));
                    }
                }
                int i2 = Build.VERSION.SDK_INT;
                c0467k.f3358q = action.getAllowGeneratedReplies();
                if (i2 >= 28) {
                    c0467k.ld6(action.getSemanticAction());
                }
                if (i2 >= 29) {
                    c0467k.m2109p(action.isContextual());
                }
                if (i2 >= 31) {
                    c0467k.m2110s(action.isAuthenticationRequired());
                }
                return c0467k;
            }

            /* JADX INFO: renamed from: q */
            private void m2106q() {
                if (this.f3359s && this.f50306zy == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            @zy.lvui
            public Bundle f7l8() {
                return this.f3356n;
            }

            @zy.lvui
            /* JADX INFO: renamed from: k */
            public C0467k m2107k(@zy.dd Bundle bundle) {
                if (bundle != null) {
                    this.f3356n.putAll(bundle);
                }
                return this;
            }

            @zy.lvui
            public C0467k ld6(int i2) {
                this.f50304f7l8 = i2;
                return this;
            }

            @zy.lvui
            /* JADX INFO: renamed from: n */
            public C0467k m2108n(@zy.lvui InterfaceC7861toq interfaceC7861toq) {
                interfaceC7861toq.mo2113k(this);
                return this;
            }

            @zy.lvui
            /* JADX INFO: renamed from: p */
            public C0467k m2109p(boolean z2) {
                this.f3359s = z2;
                return this;
            }

            @zy.lvui
            /* JADX INFO: renamed from: s */
            public C0467k m2110s(boolean z2) {
                this.f3357p = z2;
                return this;
            }

            @zy.lvui
            public C0467k toq(@zy.dd ch chVar) {
                if (this.f3354g == null) {
                    this.f3354g = new ArrayList<>();
                }
                if (chVar != null) {
                    this.f3354g.add(chVar);
                }
                return this;
            }

            @zy.lvui
            public C0467k x2(boolean z2) {
                this.f3360y = z2;
                return this;
            }

            @zy.lvui
            /* JADX INFO: renamed from: y */
            public C0467k m2111y(boolean z2) {
                this.f3358q = z2;
                return this;
            }

            @zy.lvui
            public toq zy() {
                m2106q();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<ch> arrayList3 = this.f3354g;
                if (arrayList3 != null) {
                    for (ch chVar : arrayList3) {
                        if (chVar.ki()) {
                            arrayList.add(chVar);
                        } else {
                            arrayList2.add(chVar);
                        }
                    }
                }
                ch[] chVarArr = arrayList.isEmpty() ? null : (ch[]) arrayList.toArray(new ch[arrayList.size()]);
                return new toq(this.f3355k, this.f50305toq, this.f50306zy, this.f3356n, arrayList2.isEmpty() ? null : (ch[]) arrayList2.toArray(new ch[arrayList2.size()]), chVarArr, this.f3358q, this.f50304f7l8, this.f3360y, this.f3359s, this.f3357p);
            }

            public C0467k(int i2, @zy.dd CharSequence charSequence, @zy.dd PendingIntent pendingIntent) {
                this(i2 != 0 ? IconCompat.ni7(null, "", i2) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public C0467k(@zy.lvui toq toqVar) {
                this(toqVar.m2098g(), toqVar.f3350p, toqVar.f50300ld6, new Bundle(toqVar.f3348k), toqVar.f7l8(), toqVar.toq(), toqVar.m2104y(), toqVar.f3347g, toqVar.x2(), toqVar.ld6());
            }

            private C0467k(@zy.dd IconCompat iconCompat, @zy.dd CharSequence charSequence, @zy.dd PendingIntent pendingIntent, @zy.lvui Bundle bundle, @zy.dd ch[] chVarArr, boolean z2, int i2, boolean z3, boolean z5, boolean z6) {
                this.f3358q = true;
                this.f3360y = true;
                this.f3355k = iconCompat;
                this.f50305toq = f7l8.wvg(charSequence);
                this.f50306zy = pendingIntent;
                this.f3356n = bundle;
                this.f3354g = chVarArr == null ? null : new ArrayList<>(Arrays.asList(chVarArr));
                this.f3358q = z2;
                this.f50304f7l8 = i2;
                this.f3360y = z3;
                this.f3359s = z5;
                this.f3357p = z6;
            }
        }

        /* JADX INFO: renamed from: androidx.core.app.x9kr$toq$toq, reason: collision with other inner class name */
        /* JADX INFO: compiled from: NotificationCompat.java */
        public interface InterfaceC7861toq {
            @zy.lvui
            /* JADX INFO: renamed from: k */
            C0467k mo2113k(@zy.lvui C0467k c0467k);
        }

        /* JADX INFO: compiled from: NotificationCompat.java */
        @Retention(RetentionPolicy.SOURCE)
        public @interface zy {
        }

        public toq(int i2, @zy.dd CharSequence charSequence, @zy.dd PendingIntent pendingIntent) {
            this(i2 != 0 ? IconCompat.ni7(null, "", i2) : null, charSequence, pendingIntent);
        }

        @zy.dd
        public ch[] f7l8() {
            return this.f50303zy;
        }

        @zy.dd
        /* JADX INFO: renamed from: g */
        public IconCompat m2098g() {
            int i2;
            if (this.f50301toq == null && (i2 = this.f3352s) != 0) {
                this.f50301toq = IconCompat.ni7(null, "", i2);
            }
            return this.f50301toq;
        }

        @zy.dd
        /* JADX INFO: renamed from: k */
        public PendingIntent m2099k() {
            return this.f50300ld6;
        }

        public boolean ld6() {
            return this.f50302x2;
        }

        @Deprecated
        /* JADX INFO: renamed from: n */
        public int m2100n() {
            return this.f3352s;
        }

        @zy.dd
        /* JADX INFO: renamed from: p */
        public CharSequence m2101p() {
            return this.f3350p;
        }

        @zy.lvui
        /* JADX INFO: renamed from: q */
        public Bundle m2102q() {
            return this.f3348k;
        }

        /* JADX INFO: renamed from: s */
        public boolean m2103s() {
            return this.f3347g;
        }

        public boolean toq() {
            return this.f3349n;
        }

        public boolean x2() {
            return this.f3353y;
        }

        /* JADX INFO: renamed from: y */
        public int m2104y() {
            return this.f50299f7l8;
        }

        @zy.dd
        public ch[] zy() {
            return this.f3351q;
        }

        /* JADX INFO: renamed from: androidx.core.app.x9kr$toq$q */
        /* JADX INFO: compiled from: NotificationCompat.java */
        public static final class C0468q implements InterfaceC7861toq {

            /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
            private static final String f50307f7l8 = "inProgressLabel";

            /* JADX INFO: renamed from: g */
            private static final String f3361g = "flags";

            /* JADX INFO: renamed from: ld6, reason: collision with root package name */
            private static final int f50308ld6 = 2;

            /* JADX INFO: renamed from: n */
            private static final String f3362n = "android.wearable.EXTENSIONS";

            /* JADX INFO: renamed from: p */
            private static final int f3363p = 1;

            /* JADX INFO: renamed from: qrj, reason: collision with root package name */
            private static final int f50309qrj = 1;

            /* JADX INFO: renamed from: s */
            private static final String f3364s = "cancelLabel";

            /* JADX INFO: renamed from: x2, reason: collision with root package name */
            private static final int f50310x2 = 4;

            /* JADX INFO: renamed from: y */
            private static final String f3365y = "confirmLabel";

            /* JADX INFO: renamed from: k */
            private int f3366k;

            /* JADX INFO: renamed from: q */
            private CharSequence f3367q;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            private CharSequence f50311toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            private CharSequence f50312zy;

            public C0468q() {
                this.f3366k = 1;
            }

            private void x2(int i2, boolean z2) {
                if (z2) {
                    this.f3366k = i2 | this.f3366k;
                } else {
                    this.f3366k = (~i2) & this.f3366k;
                }
            }

            @Deprecated
            @zy.dd
            public CharSequence f7l8() {
                return this.f50311toq;
            }

            /* JADX INFO: renamed from: g */
            public boolean m2112g() {
                return (this.f3366k & 2) != 0;
            }

            @Override // androidx.core.app.x9kr.toq.InterfaceC7861toq
            @zy.lvui
            /* JADX INFO: renamed from: k */
            public C0467k mo2113k(@zy.lvui C0467k c0467k) {
                Bundle bundle = new Bundle();
                int i2 = this.f3366k;
                if (i2 != 1) {
                    bundle.putInt("flags", i2);
                }
                CharSequence charSequence = this.f50311toq;
                if (charSequence != null) {
                    bundle.putCharSequence(f50307f7l8, charSequence);
                }
                CharSequence charSequence2 = this.f50312zy;
                if (charSequence2 != null) {
                    bundle.putCharSequence(f3365y, charSequence2);
                }
                CharSequence charSequence3 = this.f3367q;
                if (charSequence3 != null) {
                    bundle.putCharSequence(f3364s, charSequence3);
                }
                c0467k.f7l8().putBundle(f3362n, bundle);
                return c0467k;
            }

            @zy.lvui
            @Deprecated
            public C0468q kja0(@zy.dd CharSequence charSequence) {
                this.f50311toq = charSequence;
                return this;
            }

            @zy.lvui
            @Deprecated
            public C0468q ld6(@zy.dd CharSequence charSequence) {
                this.f50312zy = charSequence;
                return this;
            }

            /* JADX INFO: renamed from: n */
            public boolean m2114n() {
                return (this.f3366k & 4) != 0;
            }

            @zy.lvui
            public C0468q n7h(boolean z2) {
                x2(2, z2);
                return this;
            }

            @zy.lvui
            @Deprecated
            /* JADX INFO: renamed from: p */
            public C0468q m2115p(@zy.dd CharSequence charSequence) {
                this.f3367q = charSequence;
                return this;
            }

            @Deprecated
            @zy.dd
            /* JADX INFO: renamed from: q */
            public CharSequence m2116q() {
                return this.f50312zy;
            }

            @zy.lvui
            public C0468q qrj(boolean z2) {
                x2(4, z2);
                return this;
            }

            @zy.lvui
            /* JADX INFO: renamed from: s */
            public C0468q m2117s(boolean z2) {
                x2(1, z2);
                return this;
            }

            @zy.lvui
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public C0468q clone() {
                C0468q c0468q = new C0468q();
                c0468q.f3366k = this.f3366k;
                c0468q.f50311toq = this.f50311toq;
                c0468q.f50312zy = this.f50312zy;
                c0468q.f3367q = this.f3367q;
                return c0468q;
            }

            /* JADX INFO: renamed from: y */
            public boolean m2118y() {
                return (this.f3366k & 1) != 0;
            }

            @Deprecated
            @zy.dd
            public CharSequence zy() {
                return this.f3367q;
            }

            public C0468q(@zy.lvui toq toqVar) {
                this.f3366k = 1;
                Bundle bundle = toqVar.m2102q().getBundle(f3362n);
                if (bundle != null) {
                    this.f3366k = bundle.getInt("flags", 1);
                    this.f50311toq = bundle.getCharSequence(f50307f7l8);
                    this.f50312zy = bundle.getCharSequence(f3365y);
                    this.f3367q = bundle.getCharSequence(f3364s);
                }
            }
        }

        public toq(@zy.dd IconCompat iconCompat, @zy.dd CharSequence charSequence, @zy.dd PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (ch[]) null, (ch[]) null, true, 0, true, false, false);
        }

        toq(int i2, @zy.dd CharSequence charSequence, @zy.dd PendingIntent pendingIntent, @zy.dd Bundle bundle, @zy.dd ch[] chVarArr, @zy.dd ch[] chVarArr2, boolean z2, int i3, boolean z3, boolean z5, boolean z6) {
            this(i2 != 0 ? IconCompat.ni7(null, "", i2) : null, charSequence, pendingIntent, bundle, chVarArr, chVarArr2, z2, i3, z3, z5, z6);
        }

        toq(@zy.dd IconCompat iconCompat, @zy.dd CharSequence charSequence, @zy.dd PendingIntent pendingIntent, @zy.dd Bundle bundle, @zy.dd ch[] chVarArr, @zy.dd ch[] chVarArr2, boolean z2, int i2, boolean z3, boolean z5, boolean z6) {
            this.f3347g = true;
            this.f50301toq = iconCompat;
            if (iconCompat != null && iconCompat.m2404t() == 2) {
                this.f3352s = iconCompat.m2405z();
            }
            this.f3350p = f7l8.wvg(charSequence);
            this.f50300ld6 = pendingIntent;
            this.f3348k = bundle == null ? new Bundle() : bundle;
            this.f50303zy = chVarArr;
            this.f3351q = chVarArr2;
            this.f3349n = z2;
            this.f50299f7l8 = i2;
            this.f3347g = z3;
            this.f3353y = z5;
            this.f50302x2 = z6;
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface zy {
    }

    @Deprecated
    public x9kr() {
    }

    public static long a9(@zy.lvui Notification notification) {
        return notification.getTimeoutAfter();
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    static boolean cdj(@zy.lvui Notification notification) {
        return (notification.flags & 128) != 0;
    }

    @zy.dd
    public static C0459g f7l8(@zy.lvui Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C0459g.m2053k(notification.getBubbleMetadata());
        }
        return null;
    }

    @zy.lvui
    static Notification[] fn3e(@zy.lvui Bundle bundle, @zy.lvui String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
            return (Notification[]) parcelableArray;
        }
        Notification[] notificationArr = new Notification[parcelableArray.length];
        for (int i2 = 0; i2 < parcelableArray.length; i2++) {
            notificationArr[i2] = (Notification) parcelableArray[i2];
        }
        bundle.putParcelableArray(str, notificationArr);
        return notificationArr;
    }

    @zy.hyr(19)
    public static boolean fti(@zy.lvui Notification notification) {
        return notification.extras.getBoolean(f50140dd);
    }

    @zy.lvui
    public static List<a98o> fu4(@zy.lvui Notification notification) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList parcelableArrayList = notification.extras.getParcelableArrayList(f3260e);
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(a98o.m1791k((Person) it.next()));
                }
            }
        } else {
            String[] stringArray = notification.extras.getStringArray(f50188vyq);
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    arrayList.add(new a98o.zy().f7l8(str).m1801k());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static int m2007g(@zy.lvui Notification notification) {
        return notification.getBadgeIconType();
    }

    public static boolean gvn7(@zy.lvui Notification notification) {
        return (notification.flags & 512) != 0;
    }

    /* JADX INFO: renamed from: h */
    public static int m2008h(@zy.lvui Notification notification) {
        return notification.getGroupAlertBehavior();
    }

    @zy.dd
    /* JADX INFO: renamed from: i */
    public static C0508s m2009i(@zy.lvui Notification notification) {
        LocusId locusId;
        if (Build.VERSION.SDK_INT < 29 || (locusId = notification.getLocusId()) == null) {
            return null;
        }
        return C0508s.m2362q(locusId);
    }

    @zy.hyr(19)
    @zy.dd
    public static CharSequence jk(@zy.lvui Notification notification) {
        return notification.extras.getCharSequence(f50158jk);
    }

    public static int jp0y(@zy.lvui Notification notification) {
        return notification.visibility;
    }

    @zy.dd
    /* JADX INFO: renamed from: k */
    public static toq m2010k(@zy.lvui Notification notification, int i2) {
        return toq(notification.actions[i2]);
    }

    @zy.hyr(21)
    @zy.lvui
    public static List<toq> ki(@zy.lvui Notification notification) {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle2 != null && (bundle = bundle2.getBundle("invisible_actions")) != null) {
            for (int i2 = 0; i2 < bundle.size(); i2++) {
                arrayList.add(C0439m.f7l8(bundle.getBundle(Integer.toString(i2))));
            }
        }
        return arrayList;
    }

    @zy.dd
    public static String kja0(@zy.lvui Notification notification) {
        return notification.getGroup();
    }

    @zy.hyr(19)
    @zy.dd
    public static CharSequence ld6(@zy.lvui Notification notification) {
        return notification.extras.getCharSequence(f50147fti);
    }

    @zy.dd
    public static String mcp(@zy.lvui Notification notification) {
        return notification.getSortKey();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m2011n(@zy.lvui Notification notification) {
        return (notification.flags & 16) != 0;
    }

    @zy.dd
    public static Bundle n7h(@zy.lvui Notification notification) {
        return notification.extras;
    }

    public static boolean ni7(@zy.lvui Notification notification) {
        return (notification.flags & 8) != 0;
    }

    @zy.dd
    public static CharSequence o1t(@zy.lvui Notification notification) {
        return notification.getSettingsText();
    }

    /* JADX INFO: renamed from: p */
    public static int m2012p(@zy.lvui Notification notification) {
        return notification.color;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m2013q(@zy.lvui Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return notification.getAllowSystemGeneratedContextualActions();
        }
        return false;
    }

    @zy.hyr(19)
    @zy.dd
    public static CharSequence qrj(@zy.lvui Notification notification) {
        return notification.extras.getCharSequence(f50191wvg);
    }

    @zy.dd
    /* JADX INFO: renamed from: s */
    public static String m2014s(@zy.lvui Notification notification) {
        return notification.getChannelId();
    }

    @zy.hyr(19)
    /* JADX INFO: renamed from: t */
    public static boolean m2015t(@zy.lvui Notification notification) {
        return notification.extras.getBoolean(f3267l);
    }

    public static boolean t8r(@zy.lvui Notification notification) {
        return (notification.flags & 256) != 0;
    }

    @zy.hyr(20)
    @zy.lvui
    static toq toq(@zy.lvui Notification.Action action) {
        ch[] chVarArr;
        int i2;
        RemoteInput[] remoteInputs = action.getRemoteInputs();
        if (remoteInputs == null) {
            chVarArr = null;
        } else {
            ch[] chVarArr2 = new ch[remoteInputs.length];
            for (int i3 = 0; i3 < remoteInputs.length; i3++) {
                RemoteInput remoteInput = remoteInputs[i3];
                chVarArr2[i3] = new ch(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), Build.VERSION.SDK_INT >= 29 ? remoteInput.getEditChoicesBeforeSending() : 0, remoteInput.getExtras(), null);
            }
            chVarArr = chVarArr2;
        }
        int i4 = Build.VERSION.SDK_INT;
        boolean z2 = action.getExtras().getBoolean("android.support.allowGeneratedReplies") || action.getAllowGeneratedReplies();
        boolean z3 = action.getExtras().getBoolean("android.support.action.showsUserInterface", true);
        int semanticAction = i4 >= 28 ? action.getSemanticAction() : action.getExtras().getInt("android.support.action.semanticAction", 0);
        boolean zIsContextual = i4 >= 29 ? action.isContextual() : false;
        boolean zIsAuthenticationRequired = i4 >= 31 ? action.isAuthenticationRequired() : false;
        if (action.getIcon() != null || (i2 = action.icon) == 0) {
            return new toq(action.getIcon() != null ? IconCompat.m2401y(action.getIcon()) : null, action.title, action.actionIntent, action.getExtras(), chVarArr, (ch[]) null, z2, semanticAction, z3, zIsContextual, zIsAuthenticationRequired);
        }
        return new toq(i2, action.title, action.actionIntent, action.getExtras(), chVarArr, (ch[]) null, z2, semanticAction, z3, zIsContextual, zIsAuthenticationRequired);
    }

    @zy.dd
    public static String wvg(@zy.lvui Notification notification) {
        return notification.getShortcutId();
    }

    @zy.hyr(19)
    @zy.dd
    public static CharSequence x2(@zy.lvui Notification notification) {
        return notification.extras.getCharSequence(f50167mcp);
    }

    @zy.dd
    /* JADX INFO: renamed from: y */
    public static String m2016y(@zy.lvui Notification notification) {
        return notification.category;
    }

    @zy.dd
    /* JADX INFO: renamed from: z */
    public static Notification m2017z(@zy.lvui Notification notification) {
        return notification.publicVersion;
    }

    public static boolean zurt(@zy.lvui Notification notification) {
        return (notification.flags & 2) != 0;
    }

    public static int zy(@zy.lvui Notification notification) {
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr.length;
        }
        return 0;
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class x2 extends cdj {

        /* JADX INFO: renamed from: g */
        private static final String f3368g = "androidx.core.app.NotificationCompat$InboxStyle";

        /* JADX INFO: renamed from: n */
        private ArrayList<CharSequence> f3369n = new ArrayList<>();

        public x2() {
        }

        @Override // androidx.core.app.x9kr.cdj
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        protected void f7l8(@zy.lvui Bundle bundle) {
            super.f7l8(bundle);
            bundle.remove(x9kr.f3258c);
        }

        @Override // androidx.core.app.x9kr.cdj
        @zy.lvui
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: i */
        protected String mo2023i() {
            return f3368g;
        }

        @zy.lvui
        public x2 mcp(@zy.dd CharSequence charSequence) {
            this.f50203zy = f7l8.wvg(charSequence);
            this.f3282q = true;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: t */
        public x2 m2119t(@zy.dd CharSequence charSequence) {
            this.f50202toq = f7l8.wvg(charSequence);
            return this;
        }

        @Override // androidx.core.app.x9kr.cdj
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public void toq(fu4 fu4Var) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(fu4Var.mo1878k()).setBigContentTitle(this.f50202toq);
            if (this.f3282q) {
                bigContentTitle.setSummaryText(this.f50203zy);
            }
            Iterator<CharSequence> it = this.f3369n.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine(it.next());
            }
        }

        @zy.lvui
        public x2 wvg(@zy.dd CharSequence charSequence) {
            if (charSequence != null) {
                this.f3369n.add(f7l8.wvg(charSequence));
            }
            return this;
        }

        @Override // androidx.core.app.x9kr.cdj
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: z */
        protected void mo2027z(@zy.lvui Bundle bundle) {
            super.mo2027z(bundle);
            this.f3369n.clear();
            if (bundle.containsKey(x9kr.f3258c)) {
                Collections.addAll(this.f3369n, bundle.getCharSequenceArray(x9kr.f3258c));
            }
        }

        public x2(@zy.dd f7l8 f7l8Var) {
            o1t(f7l8Var);
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.x9kr$y */
    /* JADX INFO: compiled from: NotificationCompat.java */
    public static final class C0469y implements InterfaceC0463p {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final String f50313f7l8 = "app_color";

        /* JADX INFO: renamed from: g */
        private static final String f3370g = "car_conversation";

        /* JADX INFO: renamed from: h */
        private static final String f3371h = "timestamp";

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private static final String f50314kja0 = "participants";

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private static final String f50315ld6 = "messages";

        /* JADX INFO: renamed from: n */
        private static final String f3372n = "large_icon";

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private static final String f50316n7h = "on_read";

        /* JADX INFO: renamed from: p */
        private static final String f3373p = "text";

        /* JADX INFO: renamed from: q */
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        static final String f3374q = "android.car.EXTENSIONS";

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private static final String f50317qrj = "on_reply";

        /* JADX INFO: renamed from: s */
        private static final String f3375s = "author";

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private static final String f50318x2 = "remote_input";

        /* JADX INFO: renamed from: y */
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        static final String f3376y = "invisible_actions";

        /* JADX INFO: renamed from: k */
        private Bitmap f3377k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private k f50319toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f50320zy;

        /* JADX INFO: renamed from: androidx.core.app.x9kr$y$k */
        /* JADX INFO: compiled from: NotificationCompat.java */
        @Deprecated
        public static class k {

            /* JADX INFO: renamed from: g */
            private final long f3378g;

            /* JADX INFO: renamed from: k */
            private final String[] f3379k;

            /* JADX INFO: renamed from: n */
            private final String[] f3380n;

            /* JADX INFO: renamed from: q */
            private final PendingIntent f3381q;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            private final ch f50321toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            private final PendingIntent f50322zy;

            /* JADX INFO: renamed from: androidx.core.app.x9kr$y$k$k, reason: collision with other inner class name */
            /* JADX INFO: compiled from: NotificationCompat.java */
            public static class C7862k {

                /* JADX INFO: renamed from: g */
                private long f3382g;

                /* JADX INFO: renamed from: k */
                private final List<String> f3383k = new ArrayList();

                /* JADX INFO: renamed from: n */
                private PendingIntent f3384n;

                /* JADX INFO: renamed from: q */
                private PendingIntent f3385q;

                /* JADX INFO: renamed from: toq, reason: collision with root package name */
                private final String f50323toq;

                /* JADX INFO: renamed from: zy, reason: collision with root package name */
                private ch f50324zy;

                public C7862k(@zy.lvui String str) {
                    this.f50323toq = str;
                }

                @zy.lvui
                /* JADX INFO: renamed from: k */
                public C7862k m2129k(@zy.dd String str) {
                    if (str != null) {
                        this.f3383k.add(str);
                    }
                    return this;
                }

                @zy.lvui
                /* JADX INFO: renamed from: n */
                public C7862k m2130n(@zy.dd PendingIntent pendingIntent, @zy.dd ch chVar) {
                    this.f50324zy = chVar;
                    this.f3384n = pendingIntent;
                    return this;
                }

                @zy.lvui
                /* JADX INFO: renamed from: q */
                public C7862k m2131q(@zy.dd PendingIntent pendingIntent) {
                    this.f3385q = pendingIntent;
                    return this;
                }

                @zy.lvui
                public k toq() {
                    List<String> list = this.f3383k;
                    return new k((String[]) list.toArray(new String[list.size()]), this.f50324zy, this.f3384n, this.f3385q, new String[]{this.f50323toq}, this.f3382g);
                }

                @zy.lvui
                public C7862k zy(long j2) {
                    this.f3382g = j2;
                    return this;
                }
            }

            k(@zy.dd String[] strArr, @zy.dd ch chVar, @zy.dd PendingIntent pendingIntent, @zy.dd PendingIntent pendingIntent2, @zy.dd String[] strArr2, long j2) {
                this.f3379k = strArr;
                this.f50321toq = chVar;
                this.f3381q = pendingIntent2;
                this.f50322zy = pendingIntent;
                this.f3380n = strArr2;
                this.f3378g = j2;
            }

            @zy.dd
            public PendingIntent f7l8() {
                return this.f50322zy;
            }

            @zy.dd
            /* JADX INFO: renamed from: g */
            public ch m2125g() {
                return this.f50321toq;
            }

            /* JADX INFO: renamed from: k */
            public long m2126k() {
                return this.f3378g;
            }

            @zy.dd
            /* JADX INFO: renamed from: n */
            public PendingIntent m2127n() {
                return this.f3381q;
            }

            @zy.dd
            /* JADX INFO: renamed from: q */
            public String[] m2128q() {
                return this.f3380n;
            }

            @zy.dd
            public String[] toq() {
                return this.f3379k;
            }

            @zy.dd
            public String zy() {
                String[] strArr = this.f3380n;
                if (strArr.length > 0) {
                    return strArr[0];
                }
                return null;
            }
        }

        public C0469y() {
            this.f50320zy = 0;
        }

        @zy.hyr(21)
        /* JADX INFO: renamed from: g */
        private static k m2120g(@zy.dd Bundle bundle) {
            String[] strArr;
            boolean z2;
            if (bundle == null) {
                return null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(f50315ld6);
            if (parcelableArray != null) {
                int length = parcelableArray.length;
                String[] strArr2 = new String[length];
                for (int i2 = 0; i2 < length; i2++) {
                    Parcelable parcelable = parcelableArray[i2];
                    if (parcelable instanceof Bundle) {
                        String string = ((Bundle) parcelable).getString("text");
                        strArr2[i2] = string;
                        if (string != null) {
                        }
                    }
                    z2 = false;
                    break;
                }
                z2 = true;
                if (!z2) {
                    return null;
                }
                strArr = strArr2;
            } else {
                strArr = null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(f50316n7h);
            PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable(f50317qrj);
            RemoteInput remoteInput = (RemoteInput) bundle.getParcelable(f50318x2);
            String[] stringArray = bundle.getStringArray(f50314kja0);
            if (stringArray == null || stringArray.length != 1) {
                return null;
            }
            return new k(strArr, remoteInput != null ? new ch(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), Build.VERSION.SDK_INT >= 29 ? remoteInput.getEditChoicesBeforeSending() : 0, remoteInput.getExtras(), null) : null, pendingIntent2, pendingIntent, stringArray, bundle.getLong("timestamp"));
        }

        @zy.hyr(21)
        private static Bundle toq(@zy.lvui k kVar) {
            Bundle bundle = new Bundle();
            String str = (kVar.m2128q() == null || kVar.m2128q().length <= 1) ? null : kVar.m2128q()[0];
            int length = kVar.toq().length;
            Parcelable[] parcelableArr = new Parcelable[length];
            for (int i2 = 0; i2 < length; i2++) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("text", kVar.toq()[i2]);
                bundle2.putString("author", str);
                parcelableArr[i2] = bundle2;
            }
            bundle.putParcelableArray(f50315ld6, parcelableArr);
            ch chVarM2125g = kVar.m2125g();
            if (chVarM2125g != null) {
                bundle.putParcelable(f50318x2, new RemoteInput.Builder(chVarM2125g.kja0()).setLabel(chVarM2125g.n7h()).setChoices(chVarM2125g.m1845y()).setAllowFreeFormInput(chVarM2125g.m1844g()).addExtras(chVarM2125g.qrj()).build());
            }
            bundle.putParcelable(f50317qrj, kVar.f7l8());
            bundle.putParcelable(f50316n7h, kVar.m2127n());
            bundle.putStringArray(f50314kja0, kVar.m2128q());
            bundle.putLong("timestamp", kVar.m2126k());
            return bundle;
        }

        @zy.lvui
        public C0469y f7l8(@zy.x2 int i2) {
            this.f50320zy = i2;
            return this;
        }

        @Override // androidx.core.app.x9kr.InterfaceC0463p
        @zy.lvui
        /* JADX INFO: renamed from: k */
        public f7l8 mo2075k(@zy.lvui f7l8 f7l8Var) {
            Bundle bundle = new Bundle();
            Bitmap bitmap = this.f3377k;
            if (bitmap != null) {
                bundle.putParcelable(f3372n, bitmap);
            }
            int i2 = this.f50320zy;
            if (i2 != 0) {
                bundle.putInt(f50313f7l8, i2);
            }
            k kVar = this.f50319toq;
            if (kVar != null) {
                bundle.putBundle(f3370g, toq(kVar));
            }
            f7l8Var.m2037i().putBundle(f3374q, bundle);
            return f7l8Var;
        }

        @Deprecated
        @zy.dd
        /* JADX INFO: renamed from: n */
        public k m2121n() {
            return this.f50319toq;
        }

        @zy.dd
        /* JADX INFO: renamed from: q */
        public Bitmap m2122q() {
            return this.f3377k;
        }

        @zy.lvui
        @Deprecated
        /* JADX INFO: renamed from: s */
        public C0469y m2123s(@zy.dd k kVar) {
            this.f50319toq = kVar;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: y */
        public C0469y m2124y(@zy.dd Bitmap bitmap) {
            this.f3377k = bitmap;
            return this;
        }

        @zy.x2
        public int zy() {
            return this.f50320zy;
        }

        public C0469y(@zy.lvui Notification notification) {
            this.f50320zy = 0;
            Bundle bundle = x9kr.n7h(notification) == null ? null : x9kr.n7h(notification).getBundle(f3374q);
            if (bundle != null) {
                this.f3377k = (Bitmap) bundle.getParcelable(f3372n);
                this.f50320zy = bundle.getInt(f50313f7l8, 0);
                this.f50319toq = m2120g(bundle.getBundle(f3370g));
            }
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class qrj extends cdj {

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        public static final int f50280ld6 = 25;

        /* JADX INFO: renamed from: p */
        private static final String f3330p = "androidx.core.app.NotificationCompat$MessagingStyle";

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private a98o f50281f7l8;

        /* JADX INFO: renamed from: s */
        @zy.dd
        private Boolean f3333s;

        /* JADX INFO: renamed from: y */
        @zy.dd
        private CharSequence f3334y;

        /* JADX INFO: renamed from: n */
        private final List<C0465k> f3332n = new ArrayList();

        /* JADX INFO: renamed from: g */
        private final List<C0465k> f3331g = new ArrayList();

        qrj() {
        }

        @zy.dd
        public static qrj a9(@zy.lvui Notification notification) {
            cdj cdjVarT8r = cdj.t8r(notification);
            if (cdjVarT8r instanceof qrj) {
                return (qrj) cdjVarT8r;
            }
            return null;
        }

        private boolean d2ok() {
            for (int size = this.f3332n.size() - 1; size >= 0; size--) {
                C0465k c0465k = this.f3332n.get(size);
                if (c0465k.f7l8() != null && c0465k.f7l8().m1792g() == null) {
                    return true;
                }
            }
            return false;
        }

        private CharSequence dd(@zy.lvui C0465k c0465k) {
            C0616k c0616kZy = C0616k.zy();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int iKi = -16777216;
            CharSequence charSequenceM1792g = c0465k.f7l8() == null ? "" : c0465k.f7l8().m1792g();
            if (TextUtils.isEmpty(charSequenceM1792g)) {
                charSequenceM1792g = this.f50281f7l8.m1792g();
                if (this.f3281k.ki() != 0) {
                    iKi = this.f3281k.ki();
                }
            }
            CharSequence charSequenceQrj = c0616kZy.qrj(charSequenceM1792g);
            spannableStringBuilder.append(charSequenceQrj);
            spannableStringBuilder.setSpan(m2088r(iKi), spannableStringBuilder.length() - charSequenceQrj.length(), spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "  ").append(c0616kZy.qrj(c0465k.m2095s() != null ? c0465k.m2095s() : ""));
            return spannableStringBuilder;
        }

        @zy.dd
        private C0465k fti() {
            for (int size = this.f3332n.size() - 1; size >= 0; size--) {
                C0465k c0465k = this.f3332n.get(size);
                if (c0465k.f7l8() != null && !TextUtils.isEmpty(c0465k.f7l8().m1792g())) {
                    return c0465k;
                }
            }
            if (this.f3332n.isEmpty()) {
                return null;
            }
            return this.f3332n.get(r0.size() - 1);
        }

        @zy.lvui
        /* JADX INFO: renamed from: r */
        private TextAppearanceSpan m2088r(int i2) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i2), null);
        }

        @zy.lvui
        public List<C0465k> d3() {
            return this.f3332n;
        }

        @Deprecated
        @zy.dd
        public CharSequence eqxt() {
            return this.f50281f7l8.m1792g();
        }

        @Override // androidx.core.app.x9kr.cdj
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        protected void f7l8(@zy.lvui Bundle bundle) {
            super.f7l8(bundle);
            bundle.remove(x9kr.f3268m);
            bundle.remove(x9kr.f3270o);
            bundle.remove(x9kr.f50142ek5k);
            bundle.remove(x9kr.f50132bf2);
            bundle.remove(x9kr.f50197yz);
            bundle.remove(x9kr.f50196y9n);
            bundle.remove(x9kr.f3257b);
        }

        @zy.lvui
        public List<C0465k> gvn7() {
            return this.f3331g;
        }

        @Override // androidx.core.app.x9kr.cdj
        @zy.lvui
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: i */
        protected String mo2023i() {
            return f3330p;
        }

        @zy.lvui
        @Deprecated
        public qrj jk(@zy.dd CharSequence charSequence, long j2, @zy.dd CharSequence charSequence2) {
            this.f3332n.add(new C0465k(charSequence, j2, new a98o.zy().m1800g(charSequence2).m1801k()));
            if (this.f3332n.size() > 25) {
                this.f3332n.remove(0);
            }
            return this;
        }

        @zy.dd
        public CharSequence jp0y() {
            return this.f3334y;
        }

        @Override // androidx.core.app.x9kr.cdj
        /* JADX INFO: renamed from: k */
        public void mo2024k(@zy.lvui Bundle bundle) {
            super.mo2024k(bundle);
            bundle.putCharSequence(x9kr.f3270o, this.f50281f7l8.m1792g());
            bundle.putBundle(x9kr.f3268m, this.f50281f7l8.qrj());
            bundle.putCharSequence(x9kr.f50132bf2, this.f3334y);
            if (this.f3334y != null && this.f3333s.booleanValue()) {
                bundle.putCharSequence(x9kr.f50142ek5k, this.f3334y);
            }
            if (!this.f3332n.isEmpty()) {
                bundle.putParcelableArray(x9kr.f50197yz, C0465k.m2091k(this.f3332n));
            }
            if (!this.f3331g.isEmpty()) {
                bundle.putParcelableArray(x9kr.f50196y9n, C0465k.m2091k(this.f3331g));
            }
            Boolean bool = this.f3333s;
            if (bool != null) {
                bundle.putBoolean(x9kr.f3257b, bool.booleanValue());
            }
        }

        public boolean lvui() {
            f7l8 f7l8Var = this.f3281k;
            if (f7l8Var != null && f7l8Var.f3288k.getApplicationInfo().targetSdkVersion < 28 && this.f3333s == null) {
                return this.f3334y != null;
            }
            Boolean bool = this.f3333s;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        @zy.lvui
        public qrj mcp(@zy.dd CharSequence charSequence, long j2, @zy.dd a98o a98oVar) {
            m2089t(new C0465k(charSequence, j2, a98oVar));
            return this;
        }

        @zy.lvui
        public qrj ncyb(boolean z2) {
            this.f3333s = Boolean.valueOf(z2);
            return this;
        }

        @zy.lvui
        public a98o oc() {
            return this.f50281f7l8;
        }

        @zy.lvui
        /* JADX INFO: renamed from: t */
        public qrj m2089t(@zy.dd C0465k c0465k) {
            if (c0465k != null) {
                this.f3332n.add(c0465k);
                if (this.f3332n.size() > 25) {
                    this.f3332n.remove(0);
                }
            }
            return this;
        }

        @Override // androidx.core.app.x9kr.cdj
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public void toq(fu4 fu4Var) {
            ncyb(lvui());
            Notification.MessagingStyle messagingStyle = Build.VERSION.SDK_INT >= 28 ? new Notification.MessagingStyle(this.f50281f7l8.ld6()) : new Notification.MessagingStyle(this.f50281f7l8.m1792g());
            Iterator<C0465k> it = this.f3332n.iterator();
            while (it.hasNext()) {
                messagingStyle.addMessage(it.next().x2());
            }
            Iterator<C0465k> it2 = this.f3331g.iterator();
            while (it2.hasNext()) {
                messagingStyle.addHistoricMessage(it2.next().x2());
            }
            if (this.f3333s.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                messagingStyle.setConversationTitle(this.f3334y);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                messagingStyle.setGroupConversation(this.f3333s.booleanValue());
            }
            messagingStyle.setBuilder(fu4Var.mo1878k());
        }

        @zy.lvui
        public qrj wvg(@zy.dd C0465k c0465k) {
            if (c0465k != null) {
                this.f3331g.add(c0465k);
                if (this.f3331g.size() > 25) {
                    this.f3331g.remove(0);
                }
            }
            return this;
        }

        @zy.lvui
        public qrj x9kr(@zy.dd CharSequence charSequence) {
            this.f3334y = charSequence;
            return this;
        }

        @Override // androidx.core.app.x9kr.cdj
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: z */
        protected void mo2027z(@zy.lvui Bundle bundle) {
            super.mo2027z(bundle);
            this.f3332n.clear();
            if (bundle.containsKey(x9kr.f3268m)) {
                this.f50281f7l8 = a98o.toq(bundle.getBundle(x9kr.f3268m));
            } else {
                this.f50281f7l8 = new a98o.zy().m1800g(bundle.getString(x9kr.f3270o)).m1801k();
            }
            CharSequence charSequence = bundle.getCharSequence(x9kr.f50142ek5k);
            this.f3334y = charSequence;
            if (charSequence == null) {
                this.f3334y = bundle.getCharSequence(x9kr.f50132bf2);
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(x9kr.f50197yz);
            if (parcelableArray != null) {
                this.f3332n.addAll(C0465k.m2090g(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray(x9kr.f50196y9n);
            if (parcelableArray2 != null) {
                this.f3331g.addAll(C0465k.m2090g(parcelableArray2));
            }
            if (bundle.containsKey(x9kr.f3257b)) {
                this.f3333s = Boolean.valueOf(bundle.getBoolean(x9kr.f3257b));
            }
        }

        @Deprecated
        public qrj(@zy.lvui CharSequence charSequence) {
            this.f50281f7l8 = new a98o.zy().m1800g(charSequence).m1801k();
        }

        /* JADX INFO: renamed from: androidx.core.app.x9kr$qrj$k */
        /* JADX INFO: compiled from: NotificationCompat.java */
        public static final class C0465k {

            /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
            static final String f50282f7l8 = "text";

            /* JADX INFO: renamed from: ld6, reason: collision with root package name */
            static final String f50283ld6 = "uri";

            /* JADX INFO: renamed from: n7h, reason: collision with root package name */
            static final String f50284n7h = "sender_person";

            /* JADX INFO: renamed from: p */
            static final String f3335p = "type";

            /* JADX INFO: renamed from: qrj, reason: collision with root package name */
            static final String f50285qrj = "person";

            /* JADX INFO: renamed from: s */
            static final String f3336s = "sender";

            /* JADX INFO: renamed from: x2, reason: collision with root package name */
            static final String f50286x2 = "extras";

            /* JADX INFO: renamed from: y */
            static final String f3337y = "time";

            /* JADX INFO: renamed from: g */
            @zy.dd
            private Uri f3338g;

            /* JADX INFO: renamed from: k */
            private final CharSequence f3339k;

            /* JADX INFO: renamed from: n */
            @zy.dd
            private String f3340n;

            /* JADX INFO: renamed from: q */
            private Bundle f3341q;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            private final long f50287toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            @zy.dd
            private final a98o f50288zy;

            public C0465k(@zy.dd CharSequence charSequence, long j2, @zy.dd a98o a98oVar) {
                this.f3341q = new Bundle();
                this.f3339k = charSequence;
                this.f50287toq = j2;
                this.f50288zy = a98oVar;
            }

            @zy.lvui
            /* JADX INFO: renamed from: g */
            static List<C0465k> m2090g(@zy.lvui Parcelable[] parcelableArr) {
                C0465k c0465kM2092n;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (Parcelable parcelable : parcelableArr) {
                    if ((parcelable instanceof Bundle) && (c0465kM2092n = m2092n((Bundle) parcelable)) != null) {
                        arrayList.add(c0465kM2092n);
                    }
                }
                return arrayList;
            }

            @zy.lvui
            /* JADX INFO: renamed from: k */
            static Bundle[] m2091k(@zy.lvui List<C0465k> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    bundleArr[i2] = list.get(i2).qrj();
                }
                return bundleArr;
            }

            @zy.dd
            /* JADX INFO: renamed from: n */
            static C0465k m2092n(@zy.lvui Bundle bundle) {
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        C0465k c0465k = new C0465k(bundle.getCharSequence("text"), bundle.getLong("time"), bundle.containsKey(f50285qrj) ? a98o.toq(bundle.getBundle(f50285qrj)) : (!bundle.containsKey(f50284n7h) || Build.VERSION.SDK_INT < 28) ? bundle.containsKey("sender") ? new a98o.zy().m1800g(bundle.getCharSequence("sender")).m1801k() : null : a98o.m1791k((Person) bundle.getParcelable(f50284n7h)));
                        if (bundle.containsKey("type") && bundle.containsKey(f50283ld6)) {
                            c0465k.ld6(bundle.getString("type"), (Uri) bundle.getParcelable(f50283ld6));
                        }
                        if (bundle.containsKey("extras")) {
                            c0465k.m2094q().putAll(bundle.getBundle("extras"));
                        }
                        return c0465k;
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            @zy.lvui
            private Bundle qrj() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f3339k;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f50287toq);
                a98o a98oVar = this.f50288zy;
                if (a98oVar != null) {
                    bundle.putCharSequence("sender", a98oVar.m1792g());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable(f50284n7h, this.f50288zy.ld6());
                    } else {
                        bundle.putBundle(f50285qrj, this.f50288zy.qrj());
                    }
                }
                String str = this.f3340n;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f3338g;
                if (uri != null) {
                    bundle.putParcelable(f50283ld6, uri);
                }
                Bundle bundle2 = this.f3341q;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            @zy.dd
            public a98o f7l8() {
                return this.f50288zy;
            }

            @zy.lvui
            public C0465k ld6(@zy.dd String str, @zy.dd Uri uri) {
                this.f3340n = str;
                this.f3338g = uri;
                return this;
            }

            /* JADX INFO: renamed from: p */
            public long m2093p() {
                return this.f50287toq;
            }

            @zy.lvui
            /* JADX INFO: renamed from: q */
            public Bundle m2094q() {
                return this.f3341q;
            }

            @zy.dd
            /* JADX INFO: renamed from: s */
            public CharSequence m2095s() {
                return this.f3339k;
            }

            @zy.dd
            public String toq() {
                return this.f3340n;
            }

            @zy.hyr(24)
            @zy.lvui
            @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
            Notification.MessagingStyle.Message x2() {
                Notification.MessagingStyle.Message message;
                a98o a98oVarF7l8 = f7l8();
                if (Build.VERSION.SDK_INT >= 28) {
                    message = new Notification.MessagingStyle.Message(m2095s(), m2093p(), a98oVarF7l8 != null ? a98oVarF7l8.ld6() : null);
                } else {
                    message = new Notification.MessagingStyle.Message(m2095s(), m2093p(), a98oVarF7l8 != null ? a98oVarF7l8.m1792g() : null);
                }
                if (toq() != null) {
                    message.setData(toq(), zy());
                }
                return message;
            }

            @Deprecated
            @zy.dd
            /* JADX INFO: renamed from: y */
            public CharSequence m2096y() {
                a98o a98oVar = this.f50288zy;
                if (a98oVar == null) {
                    return null;
                }
                return a98oVar.m1792g();
            }

            @zy.dd
            public Uri zy() {
                return this.f3338g;
            }

            @Deprecated
            public C0465k(@zy.dd CharSequence charSequence, long j2, @zy.dd CharSequence charSequence2) {
                this(charSequence, j2, new a98o.zy().m1800g(charSequence2).m1801k());
            }
        }

        public qrj(@zy.lvui a98o a98oVar) {
            if (!TextUtils.isEmpty(a98oVar.m1792g())) {
                this.f50281f7l8 = a98oVar;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static final class ki implements InterfaceC0463p {

        /* JADX INFO: renamed from: a9, reason: collision with root package name */
        private static final String f50246a9 = "contentIconGravity";

        /* JADX INFO: renamed from: c */
        private static final int f3308c = 80;

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        @Deprecated
        public static final int f50247cdj = 1;

        /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
        private static final String f50248d2ok = "bridgeTag";

        /* JADX INFO: renamed from: d3, reason: collision with root package name */
        private static final String f50249d3 = "gravity";

        /* JADX INFO: renamed from: dd, reason: collision with root package name */
        private static final int f50250dd = 4;

        /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
        private static final String f50251eqxt = "dismissalId";

        /* JADX INFO: renamed from: f */
        private static final int f3309f = 8388613;

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        @Deprecated
        public static final int f50252fn3e = 5;

        /* JADX INFO: renamed from: fti, reason: collision with root package name */
        private static final String f50253fti = "contentActionIndex";

        /* JADX INFO: renamed from: fu4, reason: collision with root package name */
        private static final String f50254fu4 = "android.wearable.EXTENSIONS";

        /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
        private static final String f50255gvn7 = "customContentHeight";

        /* JADX INFO: renamed from: h */
        @Deprecated
        public static final int f3310h = 0;

        /* JADX INFO: renamed from: hyr, reason: collision with root package name */
        private static final int f50256hyr = 1;

        /* JADX INFO: renamed from: i */
        @Deprecated
        public static final int f3311i = 4;

        /* JADX INFO: renamed from: jk, reason: collision with root package name */
        private static final String f50257jk = "contentIcon";

        /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
        private static final String f50258jp0y = "customSizePreset";

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        @Deprecated
        public static final int f50259ki = 2;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        public static final int f50260kja0 = -1;

        /* JADX INFO: renamed from: l */
        private static final int f3312l = 32;

        /* JADX INFO: renamed from: lvui, reason: collision with root package name */
        private static final int f50261lvui = 1;

        /* JADX INFO: renamed from: mcp, reason: collision with root package name */
        private static final String f50262mcp = "background";

        /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
        private static final int f50263n5r1 = 64;

        /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
        private static final int f50264ncyb = 16;

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        @Deprecated
        public static final int f50265ni7 = -1;

        /* JADX INFO: renamed from: o1t, reason: collision with root package name */
        private static final String f50266o1t = "flags";

        /* JADX INFO: renamed from: oc, reason: collision with root package name */
        private static final String f50267oc = "hintScreenTimeout";

        /* JADX INFO: renamed from: r */
        private static final int f3313r = 2;

        /* JADX INFO: renamed from: t */
        private static final String f3314t = "pages";

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        @Deprecated
        public static final int f50268t8r = 3;

        /* JADX INFO: renamed from: wvg, reason: collision with root package name */
        private static final String f50269wvg = "displayIntent";

        /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
        private static final int f50270x9kr = 8;

        /* JADX INFO: renamed from: z */
        private static final String f3315z = "actions";

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        @Deprecated
        public static final int f50271zurt = 0;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private int f50272f7l8;

        /* JADX INFO: renamed from: g */
        private int f3316g;

        /* JADX INFO: renamed from: k */
        private ArrayList<toq> f3317k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private int f50273ld6;

        /* JADX INFO: renamed from: n */
        private Bitmap f3318n;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private String f50274n7h;

        /* JADX INFO: renamed from: p */
        private int f3319p;

        /* JADX INFO: renamed from: q */
        private ArrayList<Notification> f3320q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private String f50275qrj;

        /* JADX INFO: renamed from: s */
        private int f3321s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f50276toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private int f50277x2;

        /* JADX INFO: renamed from: y */
        private int f3322y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private PendingIntent f50278zy;

        public ki() {
            this.f3317k = new ArrayList<>();
            this.f50276toq = 1;
            this.f3320q = new ArrayList<>();
            this.f50272f7l8 = 8388613;
            this.f3322y = -1;
            this.f3321s = 0;
            this.f50273ld6 = 80;
        }

        /* JADX INFO: renamed from: r */
        private void m2068r(int i2, boolean z2) {
            if (z2) {
                this.f50276toq = i2 | this.f50276toq;
            } else {
                this.f50276toq = (~i2) & this.f50276toq;
            }
        }

        @zy.hyr(20)
        /* JADX INFO: renamed from: s */
        private static Notification.Action m2069s(toq toqVar) {
            int i2 = Build.VERSION.SDK_INT;
            IconCompat iconCompatM2098g = toqVar.m2098g();
            Notification.Action.Builder builder = new Notification.Action.Builder(iconCompatM2098g == null ? null : iconCompatM2098g.eqxt(), toqVar.m2101p(), toqVar.m2099k());
            Bundle bundle = toqVar.m2102q() != null ? new Bundle(toqVar.m2102q()) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", toqVar.toq());
            builder.setAllowGeneratedReplies(toqVar.toq());
            if (i2 >= 31) {
                builder.setAuthenticationRequired(toqVar.ld6());
            }
            builder.addExtras(bundle);
            ch[] chVarArrF7l8 = toqVar.f7l8();
            if (chVarArrF7l8 != null) {
                for (RemoteInput remoteInput : ch.m1842q(chVarArrF7l8)) {
                    builder.addRemoteInput(remoteInput);
                }
            }
            return builder.build();
        }

        @zy.lvui
        public ki a9(@zy.dd String str) {
            this.f50274n7h = str;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: c */
        public ki m2070c(boolean z2) {
            m2068r(8, z2);
            return this;
        }

        @Deprecated
        public int cdj() {
            return this.f3319p;
        }

        @zy.lvui
        public ki d2ok(@zy.dd String str) {
            this.f50275qrj = str;
            return this;
        }

        @zy.lvui
        public ki d3(boolean z2) {
            m2068r(1, z2);
            return this;
        }

        @zy.lvui
        @Deprecated
        public ki dd(int i2) {
            this.f50273ld6 = i2;
            return this;
        }

        @zy.lvui
        @Deprecated
        public ki eqxt(int i2) {
            this.f3321s = i2;
            return this;
        }

        @zy.lvui
        @Deprecated
        /* JADX INFO: renamed from: f */
        public ki m2071f(boolean z2) {
            m2068r(4, z2);
            return this;
        }

        @zy.lvui
        @Deprecated
        public ki f7l8() {
            this.f3320q.clear();
            return this;
        }

        @Deprecated
        public int fn3e() {
            return this.f50273ld6;
        }

        @zy.lvui
        public ki fti(int i2) {
            this.f3322y = i2;
            return this;
        }

        public boolean fu4() {
            return (this.f50276toq & 64) != 0;
        }

        @zy.lvui
        /* JADX INFO: renamed from: g */
        public ki m2072g() {
            this.f3317k.clear();
            return this;
        }

        @zy.lvui
        @Deprecated
        public ki gvn7(int i2) {
            this.f50272f7l8 = i2;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public boolean m2073h() {
            return (this.f50276toq & 1) != 0;
        }

        @zy.lvui
        @Deprecated
        public ki hyr(int i2) {
            this.f50277x2 = i2;
            return this;
        }

        @Deprecated
        @zy.dd
        /* JADX INFO: renamed from: i */
        public PendingIntent m2074i() {
            return this.f50278zy;
        }

        @zy.lvui
        @Deprecated
        public ki jk(@zy.dd Bitmap bitmap) {
            this.f3318n = bitmap;
            return this;
        }

        @zy.lvui
        @Deprecated
        public ki jp0y(int i2) {
            this.f3316g = i2;
            return this;
        }

        @Override // androidx.core.app.x9kr.InterfaceC0463p
        @zy.lvui
        /* JADX INFO: renamed from: k */
        public f7l8 mo2075k(@zy.lvui f7l8 f7l8Var) {
            Bundle bundle = new Bundle();
            if (!this.f3317k.isEmpty()) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f3317k.size());
                Iterator<toq> it = this.f3317k.iterator();
                while (it.hasNext()) {
                    arrayList.add(m2069s(it.next()));
                }
                bundle.putParcelableArrayList("actions", arrayList);
            }
            int i2 = this.f50276toq;
            if (i2 != 1) {
                bundle.putInt("flags", i2);
            }
            PendingIntent pendingIntent = this.f50278zy;
            if (pendingIntent != null) {
                bundle.putParcelable(f50269wvg, pendingIntent);
            }
            if (!this.f3320q.isEmpty()) {
                ArrayList<Notification> arrayList2 = this.f3320q;
                bundle.putParcelableArray(f3314t, (Parcelable[]) arrayList2.toArray(new Notification[arrayList2.size()]));
            }
            Bitmap bitmap = this.f3318n;
            if (bitmap != null) {
                bundle.putParcelable(f50262mcp, bitmap);
            }
            int i3 = this.f3316g;
            if (i3 != 0) {
                bundle.putInt(f50257jk, i3);
            }
            int i4 = this.f50272f7l8;
            if (i4 != 8388613) {
                bundle.putInt(f50246a9, i4);
            }
            int i5 = this.f3322y;
            if (i5 != -1) {
                bundle.putInt(f50253fti, i5);
            }
            int i6 = this.f3321s;
            if (i6 != 0) {
                bundle.putInt(f50258jp0y, i6);
            }
            int i7 = this.f3319p;
            if (i7 != 0) {
                bundle.putInt(f50255gvn7, i7);
            }
            int i8 = this.f50273ld6;
            if (i8 != 80) {
                bundle.putInt(f50249d3, i8);
            }
            int i9 = this.f50277x2;
            if (i9 != 0) {
                bundle.putInt(f50267oc, i9);
            }
            String str = this.f50275qrj;
            if (str != null) {
                bundle.putString(f50251eqxt, str);
            }
            String str2 = this.f50274n7h;
            if (str2 != null) {
                bundle.putString(f50248d2ok, str2);
            }
            f7l8Var.m2037i().putBundle(f50254fu4, bundle);
            return f7l8Var;
        }

        @Deprecated
        public int ki() {
            return this.f3321s;
        }

        @Deprecated
        public int kja0() {
            return this.f50272f7l8;
        }

        @zy.lvui
        /* JADX INFO: renamed from: l */
        public ki m2076l(boolean z2) {
            m2068r(64, z2);
            return this;
        }

        @Deprecated
        @zy.dd
        public Bitmap ld6() {
            return this.f3318n;
        }

        @zy.lvui
        @Deprecated
        public ki lvui(@zy.dd PendingIntent pendingIntent) {
            this.f50278zy = pendingIntent;
            return this;
        }

        public boolean mcp() {
            return (this.f50276toq & 8) != 0;
        }

        @zy.lvui
        @Deprecated
        /* JADX INFO: renamed from: n */
        public ki m2077n(@zy.lvui List<Notification> list) {
            this.f3320q.addAll(list);
            return this;
        }

        @zy.lvui
        @Deprecated
        public ki n5r1(boolean z2) {
            m2068r(2, z2);
            return this;
        }

        @Deprecated
        public int n7h() {
            return this.f3316g;
        }

        @zy.lvui
        @Deprecated
        public ki ncyb(boolean z2) {
            m2068r(16, z2);
            return this;
        }

        @Deprecated
        public boolean ni7() {
            return (this.f50276toq & 16) != 0;
        }

        @Deprecated
        public int o1t() {
            return this.f50277x2;
        }

        @zy.lvui
        @Deprecated
        public ki oc(int i2) {
            this.f3319p = i2;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: p */
        public List<toq> m2078p() {
            return this.f3317k;
        }

        @zy.lvui
        @Deprecated
        /* JADX INFO: renamed from: q */
        public ki m2079q(@zy.lvui Notification notification) {
            this.f3320q.add(notification);
            return this;
        }

        public int qrj() {
            return this.f3322y;
        }

        @zy.lvui
        @Deprecated
        /* JADX INFO: renamed from: t */
        public List<Notification> m2080t() {
            return this.f3320q;
        }

        @zy.dd
        public String t8r() {
            return this.f50275qrj;
        }

        @zy.lvui
        public ki toq(@zy.lvui toq toqVar) {
            this.f3317k.add(toqVar);
            return this;
        }

        @Deprecated
        public boolean wvg() {
            return (this.f50276toq & 4) != 0;
        }

        @zy.dd
        public String x2() {
            return this.f50274n7h;
        }

        @zy.lvui
        @Deprecated
        public ki x9kr(boolean z2) {
            m2068r(32, z2);
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public ki clone() {
            ki kiVar = new ki();
            kiVar.f3317k = new ArrayList<>(this.f3317k);
            kiVar.f50276toq = this.f50276toq;
            kiVar.f50278zy = this.f50278zy;
            kiVar.f3320q = new ArrayList<>(this.f3320q);
            kiVar.f3318n = this.f3318n;
            kiVar.f3316g = this.f3316g;
            kiVar.f50272f7l8 = this.f50272f7l8;
            kiVar.f3322y = this.f3322y;
            kiVar.f3321s = this.f3321s;
            kiVar.f3319p = this.f3319p;
            kiVar.f50273ld6 = this.f50273ld6;
            kiVar.f50277x2 = this.f50277x2;
            kiVar.f50275qrj = this.f50275qrj;
            kiVar.f50274n7h = this.f50274n7h;
            return kiVar;
        }

        @Deprecated
        /* JADX INFO: renamed from: z */
        public boolean m2082z() {
            return (this.f50276toq & 2) != 0;
        }

        @Deprecated
        public boolean zurt() {
            return (this.f50276toq & 32) != 0;
        }

        @zy.lvui
        public ki zy(@zy.lvui List<toq> list) {
            this.f3317k.addAll(list);
            return this;
        }

        public ki(@zy.lvui Notification notification) {
            this.f3317k = new ArrayList<>();
            this.f50276toq = 1;
            this.f3320q = new ArrayList<>();
            this.f50272f7l8 = 8388613;
            this.f3322y = -1;
            this.f3321s = 0;
            this.f50273ld6 = 80;
            Bundle bundleN7h = x9kr.n7h(notification);
            Bundle bundle = bundleN7h != null ? bundleN7h.getBundle(f50254fu4) : null;
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("actions");
                if (parcelableArrayList != null) {
                    int size = parcelableArrayList.size();
                    toq[] toqVarArr = new toq[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        toqVarArr[i2] = x9kr.toq((Notification.Action) parcelableArrayList.get(i2));
                    }
                    Collections.addAll(this.f3317k, toqVarArr);
                }
                this.f50276toq = bundle.getInt("flags", 1);
                this.f50278zy = (PendingIntent) bundle.getParcelable(f50269wvg);
                Notification[] notificationArrFn3e = x9kr.fn3e(bundle, f3314t);
                if (notificationArrFn3e != null) {
                    Collections.addAll(this.f3320q, notificationArrFn3e);
                }
                this.f3318n = (Bitmap) bundle.getParcelable(f50262mcp);
                this.f3316g = bundle.getInt(f50257jk);
                this.f50272f7l8 = bundle.getInt(f50246a9, 8388613);
                this.f3322y = bundle.getInt(f50253fti, -1);
                this.f3321s = bundle.getInt(f50258jp0y, 0);
                this.f3319p = bundle.getInt(f50255gvn7);
                this.f50273ld6 = bundle.getInt(f50249d3, 80);
                this.f50277x2 = bundle.getInt(f50267oc);
                this.f50275qrj = bundle.getString(f50251eqxt);
                this.f50274n7h = bundle.getString(f50248d2ok);
            }
        }
    }

    /* JADX INFO: compiled from: NotificationCompat.java */
    public static class f7l8 {

        /* JADX INFO: renamed from: vyq, reason: collision with root package name */
        private static final int f50204vyq = 5120;

        /* JADX INFO: renamed from: a9, reason: collision with root package name */
        Bundle f50205a9;

        /* JADX INFO: renamed from: c */
        boolean f3283c;

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        cdj f50206cdj;

        /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
        String f50207d2ok;

        /* JADX INFO: renamed from: d3, reason: collision with root package name */
        RemoteViews f50208d3;

        /* JADX INFO: renamed from: dd, reason: collision with root package name */
        C0508s f50209dd;

        /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
        RemoteViews f50210eqxt;

        /* JADX INFO: renamed from: f */
        Notification f3284f;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        PendingIntent f50211f7l8;

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        int f50212fn3e;

        /* JADX INFO: renamed from: fti, reason: collision with root package name */
        int f50213fti;

        /* JADX INFO: renamed from: fu4, reason: collision with root package name */
        String f50214fu4;

        /* JADX INFO: renamed from: g */
        CharSequence f3285g;

        /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
        Notification f50215gvn7;

        /* JADX INFO: renamed from: h */
        boolean f3286h;

        /* JADX INFO: renamed from: hyr, reason: collision with root package name */
        C0459g f50216hyr;

        /* JADX INFO: renamed from: i */
        CharSequence[] f3287i;

        /* JADX INFO: renamed from: jk, reason: collision with root package name */
        String f50217jk;

        /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
        int f50218jp0y;

        /* JADX INFO: renamed from: k */
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public Context f3288k;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        CharSequence f50219ki;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        boolean f50220kja0;

        /* JADX INFO: renamed from: l */
        int f3289l;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        CharSequence f50221ld6;

        /* JADX INFO: renamed from: lrht, reason: collision with root package name */
        Icon f50222lrht;

        /* JADX INFO: renamed from: lvui, reason: collision with root package name */
        int f50223lvui;

        /* JADX INFO: renamed from: mcp, reason: collision with root package name */
        boolean f50224mcp;

        /* JADX INFO: renamed from: n */
        CharSequence f3290n;

        /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
        boolean f50225n5r1;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        boolean f50226n7h;

        /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
        int f50227ncyb;

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        boolean f50228ni7;

        /* JADX INFO: renamed from: o1t, reason: collision with root package name */
        String f50229o1t;

        /* JADX INFO: renamed from: oc, reason: collision with root package name */
        RemoteViews f50230oc;

        /* JADX INFO: renamed from: p */
        Bitmap f3291p;

        /* JADX INFO: renamed from: q */
        ArrayList<toq> f3292q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        int f50231qrj;

        /* JADX INFO: renamed from: r */
        String f3293r;

        /* JADX INFO: renamed from: s */
        RemoteViews f3294s;

        /* JADX INFO: renamed from: t */
        boolean f3295t;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        CharSequence f50232t8r;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public ArrayList<toq> f50233toq;

        /* JADX INFO: renamed from: uv6, reason: collision with root package name */
        @Deprecated
        public ArrayList<String> f50234uv6;

        /* JADX INFO: renamed from: wvg, reason: collision with root package name */
        boolean f50235wvg;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        int f50236x2;

        /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
        long f50237x9kr;

        /* JADX INFO: renamed from: y */
        PendingIntent f3296y;

        /* JADX INFO: renamed from: z */
        boolean f3297z;

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        int f50238zurt;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @zy.lvui
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public ArrayList<a98o> f50239zy;

        @zy.hyr(19)
        public f7l8(@zy.lvui Context context, @zy.lvui Notification notification) {
            ArrayList parcelableArrayList;
            this(context, x9kr.m2014s(notification));
            Bundle bundle = notification.extras;
            cdj cdjVarT8r = cdj.t8r(notification);
            x9kr(x9kr.qrj(notification)).dd(x9kr.x2(notification)).lvui(x9kr.ld6(notification)).m2049v(x9kr.jk(notification)).m2050x(x9kr.o1t(notification)).xwq3(cdjVarT8r).m2046r(notification.contentIntent).m2033e(x9kr.kja0(notification)).hb(x9kr.gvn7(notification)).ek5k(x9kr.m2009i(notification)).qo(notification.when).lv5(x9kr.m2015t(notification)).vq(x9kr.fti(notification)).jk(x9kr.m2011n(notification)).bf2(x9kr.ni7(notification)).m2030b(x9kr.zurt(notification)).m2041m(x9kr.t8r(notification)).m2038j(notification.largeIcon).a9(x9kr.m2007g(notification)).jp0y(x9kr.m2016y(notification)).fti(x9kr.f7l8(notification)).y9n(notification.number).ikck(notification.tickerText).m2046r(notification.contentIntent).m2034f(notification.deleteIntent).vyq(notification.fullScreenIntent, x9kr.cdj(notification)).dr(notification.sound, notification.audioStreamType).qkj8(notification.vibrate).m2043o(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).hyr(notification.defaults).i1(notification.priority).oc(x9kr.m2012p(notification)).fnq8(x9kr.jp0y(notification)).m2029a(x9kr.m2017z(notification)).c8jq(x9kr.mcp(notification)).mu(x9kr.a9(notification)).ch(x9kr.wvg(notification)).a98o(bundle.getInt(x9kr.f50166lvui), bundle.getInt(x9kr.f50137d2ok), bundle.getBoolean(x9kr.f3273r)).mcp(x9kr.m2013q(notification)).bo(notification.icon, notification.iconLevel).zy(fn3e(notification, cdjVarT8r));
            this.f50222lrht = notification.getSmallIcon();
            Notification.Action[] actionArr = notification.actions;
            if (actionArr != null && actionArr.length != 0) {
                for (Notification.Action action : actionArr) {
                    toq(toq.C0467k.m2105g(action).zy());
                }
            }
            List<toq> listKi = x9kr.ki(notification);
            if (!listKi.isEmpty()) {
                Iterator<toq> it = listKi.iterator();
                while (it.hasNext()) {
                    m2042n(it.next());
                }
            }
            String[] stringArray = notification.extras.getStringArray(x9kr.f50188vyq);
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    f7l8(str);
                }
            }
            if (Build.VERSION.SDK_INT >= 28 && (parcelableArrayList = notification.extras.getParcelableArrayList(x9kr.f3260e)) != null && !parcelableArrayList.isEmpty()) {
                Iterator it2 = parcelableArrayList.iterator();
                while (it2.hasNext()) {
                    m2035g(a98o.m1791k((Person) it2.next()));
                }
            }
            if (bundle.containsKey(x9kr.f50193x9kr)) {
                d3(bundle.getBoolean(x9kr.f50193x9kr));
            }
            if (bundle.containsKey(x9kr.f50171ncyb)) {
                eqxt(bundle.getBoolean(x9kr.f50171ncyb));
            }
        }

        @zy.hyr(19)
        @zy.dd
        private static Bundle fn3e(@zy.lvui Notification notification, @zy.dd cdj cdjVar) {
            if (notification.extras == null) {
                return null;
            }
            Bundle bundle = new Bundle(notification.extras);
            bundle.remove(x9kr.f50191wvg);
            bundle.remove(x9kr.f50167mcp);
            bundle.remove(x9kr.f50147fti);
            bundle.remove(x9kr.f50158jk);
            bundle.remove(x9kr.f50185toq);
            bundle.remove(x9kr.f50201zy);
            bundle.remove(x9kr.f3267l);
            bundle.remove(x9kr.f50137d2ok);
            bundle.remove(x9kr.f50166lvui);
            bundle.remove(x9kr.f3273r);
            bundle.remove(x9kr.f50193x9kr);
            bundle.remove(x9kr.f50171ncyb);
            bundle.remove(x9kr.f3260e);
            bundle.remove(x9kr.f50188vyq);
            bundle.remove(C0443o.f3230q);
            bundle.remove(C0443o.f50120toq);
            bundle.remove(C0443o.f50121zy);
            bundle.remove(C0443o.f3228k);
            bundle.remove(C0443o.f3229n);
            Bundle bundle2 = bundle.getBundle("android.car.EXTENSIONS");
            if (bundle2 != null) {
                Bundle bundle3 = new Bundle(bundle2);
                bundle3.remove("invisible_actions");
                bundle.putBundle("android.car.EXTENSIONS", bundle3);
            }
            if (cdjVar != null) {
                cdjVar.f7l8(bundle);
            }
            return bundle;
        }

        private void lrht(int i2, boolean z2) {
            if (z2) {
                Notification notification = this.f3284f;
                notification.flags = i2 | notification.flags;
            } else {
                Notification notification2 = this.f3284f;
                notification2.flags = (~i2) & notification2.flags;
            }
        }

        @zy.dd
        /* JADX INFO: renamed from: t */
        private Bitmap m2028t(@zy.dd Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f3288k.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C7400k.zy.f93324f7l8);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(C7400k.zy.f42596g);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
        }

        private boolean tfm() {
            cdj cdjVar = this.f50206cdj;
            return cdjVar == null || !cdjVar.ki();
        }

        @zy.dd
        protected static CharSequence wvg(@zy.dd CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > f50204vyq) ? charSequence.subSequence(0, f50204vyq) : charSequence;
        }

        @zy.lvui
        /* JADX INFO: renamed from: a */
        public f7l8 m2029a(@zy.dd Notification notification) {
            this.f50215gvn7 = notification;
            return this;
        }

        @zy.lvui
        public f7l8 a9(int i2) {
            this.f50223lvui = i2;
            return this;
        }

        @zy.lvui
        public f7l8 a98o(int i2, int i3, boolean z2) {
            this.f50212fn3e = i2;
            this.f50238zurt = i3;
            this.f50228ni7 = z2;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: b */
        public f7l8 m2030b(boolean z2) {
            lrht(2, z2);
            return this;
        }

        @zy.lvui
        public f7l8 bf2(boolean z2) {
            lrht(8, z2);
            return this;
        }

        @zy.lvui
        public f7l8 bo(int i2, int i3) {
            Notification notification = this.f3284f;
            notification.icon = i2;
            notification.iconLevel = i3;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: c */
        public f7l8 m2031c(@zy.dd Bundle bundle) {
            this.f50205a9 = bundle;
            return this;
        }

        @zy.lvui
        public f7l8 c8jq(@zy.dd String str) {
            this.f50229o1t = str;
            return this;
        }

        @zy.dd
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public C0459g cdj() {
            return this.f50216hyr;
        }

        @zy.lvui
        public f7l8 ch(@zy.dd String str) {
            this.f3293r = str;
            return this;
        }

        @zy.lvui
        @Deprecated
        /* JADX INFO: renamed from: d */
        public f7l8 m2032d(@zy.dd CharSequence charSequence, @zy.dd RemoteViews remoteViews) {
            this.f3284f.tickerText = wvg(charSequence);
            this.f3294s = remoteViews;
            return this;
        }

        @zy.lvui
        public f7l8 d2ok(@zy.dd RemoteViews remoteViews) {
            this.f3284f.contentView = remoteViews;
            return this;
        }

        @zy.hyr(24)
        @zy.lvui
        public f7l8 d3(boolean z2) {
            this.f3286h = z2;
            m2037i().putBoolean(x9kr.f50193x9kr, z2);
            return this;
        }

        @zy.lvui
        public f7l8 dd(@zy.dd CharSequence charSequence) {
            this.f3285g = wvg(charSequence);
            return this;
        }

        @zy.lvui
        public f7l8 dr(@zy.dd Uri uri, int i2) {
            Notification notification = this.f3284f;
            notification.sound = uri;
            notification.audioStreamType = i2;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(i2).build();
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: e */
        public f7l8 m2033e(@zy.dd String str) {
            this.f50214fu4 = str;
            return this;
        }

        @zy.lvui
        public f7l8 ek5k(@zy.dd C0508s c0508s) {
            this.f50209dd = c0508s;
            return this;
        }

        @zy.lvui
        public f7l8 eqxt(boolean z2) {
            this.f3295t = z2;
            this.f50224mcp = true;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: f */
        public f7l8 m2034f(@zy.dd PendingIntent pendingIntent) {
            this.f3284f.deleteIntent = pendingIntent;
            return this;
        }

        @zy.lvui
        @Deprecated
        public f7l8 f7l8(@zy.dd String str) {
            if (str != null && !str.isEmpty()) {
                this.f50234uv6.add(str);
            }
            return this;
        }

        @zy.lvui
        public f7l8 fnq8(int i2) {
            this.f50218jp0y = i2;
            return this;
        }

        @zy.lvui
        public f7l8 fti(@zy.dd C0459g c0459g) {
            this.f50216hyr = c0459g;
            return this;
        }

        @zy.lvui
        @Deprecated
        public Notification fu4() {
            return m2051y();
        }

        @zy.lvui
        /* JADX INFO: renamed from: g */
        public f7l8 m2035g(@zy.dd a98o a98oVar) {
            if (a98oVar != null) {
                this.f50239zy.add(a98oVar);
            }
            return this;
        }

        @zy.lvui
        public f7l8 gvn7(@zy.lvui String str) {
            this.f50207d2ok = str;
            return this;
        }

        @zy.lvui
        public f7l8 gyi(@zy.dd Uri uri) {
            Notification notification = this.f3284f;
            notification.sound = uri;
            notification.audioStreamType = -1;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            return this;
        }

        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: h */
        public RemoteViews m2036h() {
            return this.f50230oc;
        }

        @zy.lvui
        public f7l8 hb(boolean z2) {
            this.f3297z = z2;
            return this;
        }

        @zy.lvui
        public f7l8 hyr(int i2) {
            Notification notification = this.f3284f;
            notification.defaults = i2;
            if ((i2 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: i */
        public Bundle m2037i() {
            if (this.f50205a9 == null) {
                this.f50205a9 = new Bundle();
            }
            return this.f50205a9;
        }

        @zy.lvui
        public f7l8 i1(int i2) {
            this.f50231qrj = i2;
            return this;
        }

        @zy.lvui
        public f7l8 ikck(@zy.dd CharSequence charSequence) {
            this.f3284f.tickerText = wvg(charSequence);
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: j */
        public f7l8 m2038j(@zy.dd Bitmap bitmap) {
            this.f3291p = m2028t(bitmap);
            return this;
        }

        @zy.lvui
        public f7l8 jk(boolean z2) {
            lrht(16, z2);
            return this;
        }

        @zy.lvui
        public f7l8 jp0y(@zy.dd String str) {
            this.f50217jk = str;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: k */
        public f7l8 m2039k(int i2, @zy.dd CharSequence charSequence, @zy.dd PendingIntent pendingIntent) {
            this.f50233toq.add(new toq(i2, charSequence, pendingIntent));
            return this;
        }

        @zy.x2
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public int ki() {
            return this.f50213fti;
        }

        @zy.lvui
        public f7l8 kja0(@zy.lvui InterfaceC0463p interfaceC0463p) {
            interfaceC0463p.mo2075k(this);
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: l */
        public f7l8 m2040l(@zy.dd RemoteViews remoteViews) {
            this.f50208d3 = remoteViews;
            return this;
        }

        @zy.lvui
        public f7l8 ld6() {
            this.f50239zy.clear();
            this.f50234uv6.clear();
            return this;
        }

        @zy.lvui
        public f7l8 lv5(boolean z2) {
            this.f50226n7h = z2;
            return this;
        }

        @zy.lvui
        public f7l8 lvui(@zy.dd CharSequence charSequence) {
            this.f50221ld6 = wvg(charSequence);
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: m */
        public f7l8 m2041m(boolean z2) {
            this.f50235wvg = z2;
            return this;
        }

        @zy.lvui
        public f7l8 mcp(boolean z2) {
            this.f50225n5r1 = z2;
            return this;
        }

        @zy.lvui
        public f7l8 mu(long j2) {
            this.f50237x9kr = j2;
            return this;
        }

        @zy.hyr(21)
        @zy.lvui
        /* JADX INFO: renamed from: n */
        public f7l8 m2042n(@zy.dd toq toqVar) {
            if (toqVar != null) {
                this.f3292q.add(toqVar);
            }
            return this;
        }

        @zy.lvui
        public f7l8 n5r1(@zy.dd RemoteViews remoteViews) {
            this.f50210eqxt = remoteViews;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @zy.dd
        public RemoteViews n7h() {
            RemoteViews remoteViewsFu4;
            if (this.f50210eqxt != null && tfm()) {
                return this.f50210eqxt;
            }
            C0434j c0434j = new C0434j(this);
            cdj cdjVar = this.f50206cdj;
            return (cdjVar == null || (remoteViewsFu4 = cdjVar.fu4(c0434j)) == null) ? Notification.Builder.recoverBuilder(this.f3288k, c0434j.zy()).createHeadsUpContentView() : remoteViewsFu4;
        }

        @zy.lvui
        public f7l8 ncyb(@zy.dd RemoteViews remoteViews) {
            this.f50230oc = remoteViews;
            return this;
        }

        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public RemoteViews ni7() {
            return this.f50210eqxt;
        }

        @zy.lvui
        public f7l8 nmn5(@zy.dd androidx.core.content.pm.kja0 kja0Var) {
            if (kja0Var == null) {
                return this;
            }
            this.f3293r = kja0Var.ld6();
            if (this.f50209dd == null) {
                if (kja0Var.kja0() != null) {
                    this.f50209dd = kja0Var.kja0();
                } else if (kja0Var.ld6() != null) {
                    this.f50209dd = new C0508s(kja0Var.ld6());
                }
            }
            if (this.f3290n == null) {
                x9kr(kja0Var.ni7());
            }
            return this;
        }

        @zy.lvui
        public f7l8 nn86(int i2) {
            this.f50227ncyb = i2;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: o */
        public f7l8 m2043o(@zy.x2 int i2, int i3, int i4) {
            Notification notification = this.f3284f;
            notification.ledARGB = i2;
            notification.ledOnMS = i3;
            notification.ledOffMS = i4;
            notification.flags = ((i3 == 0 || i4 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public long o1t() {
            if (this.f50226n7h) {
                return this.f3284f.when;
            }
            return 0L;
        }

        @zy.lvui
        public f7l8 oc(@zy.x2 int i2) {
            this.f50213fti = i2;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: p */
        public f7l8 m2044p() {
            this.f3292q.clear();
            Bundle bundle = this.f50205a9.getBundle("android.car.EXTENSIONS");
            if (bundle != null) {
                Bundle bundle2 = new Bundle(bundle);
                bundle2.remove("invisible_actions");
                this.f50205a9.putBundle("android.car.EXTENSIONS", bundle2);
            }
            return this;
        }

        @zy.hyr(21)
        @zy.lvui
        /* JADX INFO: renamed from: q */
        public f7l8 m2045q(int i2, @zy.dd CharSequence charSequence, @zy.dd PendingIntent pendingIntent) {
            this.f3292q.add(new toq(i2, charSequence, pendingIntent));
            return this;
        }

        @zy.lvui
        public f7l8 qkj8(@zy.dd long[] jArr) {
            this.f3284f.vibrate = jArr;
            return this;
        }

        @zy.lvui
        public f7l8 qo(long j2) {
            this.f3284f.when = j2;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @zy.dd
        public RemoteViews qrj() {
            RemoteViews remoteViewsNi7;
            if (this.f50208d3 != null && tfm()) {
                return this.f50208d3;
            }
            C0434j c0434j = new C0434j(this);
            cdj cdjVar = this.f50206cdj;
            return (cdjVar == null || (remoteViewsNi7 = cdjVar.ni7(c0434j)) == null) ? Notification.Builder.recoverBuilder(this.f3288k, c0434j.zy()).createContentView() : remoteViewsNi7;
        }

        @zy.lvui
        /* JADX INFO: renamed from: r */
        public f7l8 m2046r(@zy.dd PendingIntent pendingIntent) {
            this.f50211f7l8 = pendingIntent;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: s */
        public f7l8 m2047s() {
            this.f50233toq.clear();
            return this;
        }

        @zy.lvui
        public f7l8 t8iq(boolean z2) {
            this.f3283c = z2;
            return this;
        }

        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public RemoteViews t8r() {
            return this.f50208d3;
        }

        @zy.lvui
        public f7l8 toq(@zy.dd toq toqVar) {
            if (toqVar != null) {
                this.f50233toq.add(toqVar);
            }
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: u */
        public f7l8 m2048u(int i2) {
            this.f3284f.icon = i2;
            return this;
        }

        @zy.lvui
        public f7l8 uv6(int i2) {
            this.f3289l = i2;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: v */
        public f7l8 m2049v(@zy.dd CharSequence charSequence) {
            this.f50219ki = wvg(charSequence);
            return this;
        }

        @zy.lvui
        public f7l8 vq(boolean z2) {
            this.f50220kja0 = z2;
            return this;
        }

        @zy.lvui
        public f7l8 vyq(@zy.dd PendingIntent pendingIntent, boolean z2) {
            this.f3296y = pendingIntent;
            lrht(128, z2);
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: x */
        public f7l8 m2050x(@zy.dd CharSequence charSequence) {
            this.f50232t8r = wvg(charSequence);
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @zy.dd
        public RemoteViews x2() {
            RemoteViews remoteViewsZurt;
            if (this.f50230oc != null && tfm()) {
                return this.f50230oc;
            }
            C0434j c0434j = new C0434j(this);
            cdj cdjVar = this.f50206cdj;
            return (cdjVar == null || (remoteViewsZurt = cdjVar.zurt(c0434j)) == null) ? Notification.Builder.recoverBuilder(this.f3288k, c0434j.zy()).createBigContentView() : remoteViewsZurt;
        }

        @zy.lvui
        public f7l8 x9kr(@zy.dd CharSequence charSequence) {
            this.f3290n = wvg(charSequence);
            return this;
        }

        @zy.lvui
        public f7l8 xwq3(@zy.dd cdj cdjVar) {
            if (this.f50206cdj != cdjVar) {
                this.f50206cdj = cdjVar;
                if (cdjVar != null) {
                    cdjVar.o1t(this);
                }
            }
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: y */
        public Notification m2051y() {
            return new C0434j(this).zy();
        }

        @zy.hyr(23)
        @zy.lvui
        public f7l8 y2(@zy.lvui IconCompat iconCompat) {
            this.f50222lrht = iconCompat.d2ok(this.f3288k);
            return this;
        }

        @zy.lvui
        public f7l8 y9n(int i2) {
            this.f50236x2 = i2;
            return this;
        }

        @zy.lvui
        @Deprecated
        public f7l8 yz() {
            this.f3283c = true;
            return this;
        }

        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: z */
        public int m2052z() {
            return this.f50231qrj;
        }

        @zy.lvui
        public f7l8 zp(@zy.dd CharSequence[] charSequenceArr) {
            this.f3287i = charSequenceArr;
            return this;
        }

        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        public int zurt() {
            return this.f3289l;
        }

        @zy.lvui
        public f7l8 zy(@zy.dd Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.f50205a9;
                if (bundle2 == null) {
                    this.f50205a9 = new Bundle(bundle);
                } else {
                    bundle2.putAll(bundle);
                }
            }
            return this;
        }

        public f7l8(@zy.lvui Context context, @zy.lvui String str) {
            this.f50233toq = new ArrayList<>();
            this.f50239zy = new ArrayList<>();
            this.f3292q = new ArrayList<>();
            this.f50226n7h = true;
            this.f50235wvg = false;
            this.f50213fti = 0;
            this.f50218jp0y = 0;
            this.f50223lvui = 0;
            this.f50227ncyb = 0;
            this.f3289l = 0;
            Notification notification = new Notification();
            this.f3284f = notification;
            this.f3288k = context;
            this.f50207d2ok = str;
            notification.when = System.currentTimeMillis();
            this.f3284f.audioStreamType = -1;
            this.f50231qrj = 0;
            this.f50234uv6 = new ArrayList<>();
            this.f50225n5r1 = true;
        }

        @Deprecated
        public f7l8(@zy.lvui Context context) {
            this(context, (String) null);
        }
    }
}
