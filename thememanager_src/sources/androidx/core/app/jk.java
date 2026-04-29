package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

/* JADX INFO: compiled from: NotificationChannelCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class jk {

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final int f50090fn3e = 0;

    /* JADX INFO: renamed from: i */
    private static final boolean f3203i = true;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final String f50091t8r = "miscellaneous";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private boolean f50092cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    Uri f50093f7l8;

    /* JADX INFO: renamed from: g */
    boolean f3204g;

    /* JADX INFO: renamed from: h */
    private int f3205h;

    /* JADX INFO: renamed from: k */
    @zy.lvui
    final String f3206k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private boolean f50094ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private boolean f50095kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    boolean f50096ld6;

    /* JADX INFO: renamed from: n */
    String f3207n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    String f50097n7h;

    /* JADX INFO: renamed from: p */
    int f3208p;

    /* JADX INFO: renamed from: q */
    String f3209q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    String f50098qrj;

    /* JADX INFO: renamed from: s */
    boolean f3210s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    CharSequence f50099toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    long[] f50100x2;

    /* JADX INFO: renamed from: y */
    AudioAttributes f3211y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    int f50101zy;

    /* JADX INFO: renamed from: androidx.core.app.jk$k */
    /* JADX INFO: compiled from: NotificationChannelCompat.java */
    public static class C0435k {

        /* JADX INFO: renamed from: k */
        private final jk f3212k;

        public C0435k(@zy.lvui String str, int i2) {
            this.f3212k = new jk(str, i2);
        }

        @zy.lvui
        public C0435k f7l8(boolean z2) {
            this.f3212k.f3210s = z2;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: g */
        public C0435k m1912g(int i2) {
            this.f3212k.f3208p = i2;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: k */
        public jk m1913k() {
            return this.f3212k;
        }

        @zy.lvui
        public C0435k ld6(boolean z2) {
            this.f3212k.f50096ld6 = z2;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: n */
        public C0435k m1914n(int i2) {
            this.f3212k.f50101zy = i2;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: p */
        public C0435k m1915p(@zy.dd Uri uri, @zy.dd AudioAttributes audioAttributes) {
            jk jkVar = this.f3212k;
            jkVar.f50093f7l8 = uri;
            jkVar.f3211y = audioAttributes;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: q */
        public C0435k m1916q(@zy.dd String str) {
            this.f3212k.f3207n = str;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: s */
        public C0435k m1917s(boolean z2) {
            this.f3212k.f3204g = z2;
            return this;
        }

        @zy.lvui
        public C0435k toq(@zy.lvui String str, @zy.lvui String str2) {
            if (Build.VERSION.SDK_INT >= 30) {
                jk jkVar = this.f3212k;
                jkVar.f50098qrj = str;
                jkVar.f50097n7h = str2;
            }
            return this;
        }

        @zy.lvui
        public C0435k x2(@zy.dd long[] jArr) {
            jk jkVar = this.f3212k;
            jkVar.f50096ld6 = jArr != null && jArr.length > 0;
            jkVar.f50100x2 = jArr;
            return this;
        }

        @zy.lvui
        /* JADX INFO: renamed from: y */
        public C0435k m1918y(@zy.dd CharSequence charSequence) {
            this.f3212k.f50099toq = charSequence;
            return this;
        }

        @zy.lvui
        public C0435k zy(@zy.dd String str) {
            this.f3212k.f3209q = str;
            return this;
        }
    }

    jk(@zy.lvui String str, int i2) {
        this.f3204g = true;
        this.f50093f7l8 = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.f3208p = 0;
        this.f3206k = (String) androidx.core.util.n7h.x2(str);
        this.f50101zy = i2;
        this.f3211y = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    public boolean cdj() {
        return this.f50094ki;
    }

    @zy.dd
    public String f7l8() {
        return this.f3207n;
    }

    @zy.dd
    /* JADX INFO: renamed from: g */
    public String m1903g() {
        return this.f3209q;
    }

    @zy.dd
    /* JADX INFO: renamed from: h */
    public long[] m1904h() {
        return this.f50100x2;
    }

    @zy.lvui
    /* JADX INFO: renamed from: i */
    public C0435k m1905i() {
        return new C0435k(this.f3206k, this.f50101zy).m1918y(this.f50099toq).zy(this.f3209q).m1916q(this.f3207n).m1917s(this.f3204g).m1915p(this.f50093f7l8, this.f3211y).f7l8(this.f3210s).m1912g(this.f3208p).ld6(this.f50096ld6).x2(this.f50100x2).toq(this.f50098qrj, this.f50097n7h);
    }

    /* JADX INFO: renamed from: k */
    public boolean m1906k() {
        return this.f50092cdj;
    }

    public boolean ki() {
        return this.f3210s;
    }

    @zy.dd
    public Uri kja0() {
        return this.f50093f7l8;
    }

    public int ld6() {
        return this.f3205h;
    }

    @zy.dd
    /* JADX INFO: renamed from: n */
    public String m1907n() {
        return this.f50097n7h;
    }

    @zy.dd
    public String n7h() {
        return this.f50098qrj;
    }

    /* JADX INFO: renamed from: p */
    public int m1908p() {
        return this.f3208p;
    }

    @zy.dd
    /* JADX INFO: renamed from: q */
    public AudioAttributes m1909q() {
        return this.f3211y;
    }

    NotificationChannel qrj() {
        String str;
        String str2;
        int i2 = Build.VERSION.SDK_INT;
        NotificationChannel notificationChannel = new NotificationChannel(this.f3206k, this.f50099toq, this.f50101zy);
        notificationChannel.setDescription(this.f3209q);
        notificationChannel.setGroup(this.f3207n);
        notificationChannel.setShowBadge(this.f3204g);
        notificationChannel.setSound(this.f50093f7l8, this.f3211y);
        notificationChannel.enableLights(this.f3210s);
        notificationChannel.setLightColor(this.f3208p);
        notificationChannel.setVibrationPattern(this.f50100x2);
        notificationChannel.enableVibration(this.f50096ld6);
        if (i2 >= 30 && (str = this.f50098qrj) != null && (str2 = this.f50097n7h) != null) {
            notificationChannel.setConversationId(str, str2);
        }
        return notificationChannel;
    }

    /* JADX INFO: renamed from: s */
    public int m1910s() {
        return this.f50101zy;
    }

    public boolean t8r() {
        return this.f50096ld6;
    }

    public boolean toq() {
        return this.f50095kja0;
    }

    @zy.dd
    public CharSequence x2() {
        return this.f50099toq;
    }

    @zy.lvui
    /* JADX INFO: renamed from: y */
    public String m1911y() {
        return this.f3206k;
    }

    public boolean zy() {
        return this.f3204g;
    }

    @zy.hyr(26)
    jk(@zy.lvui NotificationChannel notificationChannel) {
        this(notificationChannel.getId(), notificationChannel.getImportance());
        this.f50099toq = notificationChannel.getName();
        this.f3209q = notificationChannel.getDescription();
        this.f3207n = notificationChannel.getGroup();
        this.f3204g = notificationChannel.canShowBadge();
        this.f50093f7l8 = notificationChannel.getSound();
        this.f3211y = notificationChannel.getAudioAttributes();
        this.f3210s = notificationChannel.shouldShowLights();
        this.f3208p = notificationChannel.getLightColor();
        this.f50096ld6 = notificationChannel.shouldVibrate();
        this.f50100x2 = notificationChannel.getVibrationPattern();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f50098qrj = notificationChannel.getParentChannelId();
            this.f50097n7h = notificationChannel.getConversationId();
        }
        this.f50095kja0 = notificationChannel.canBypassDnd();
        this.f3205h = notificationChannel.getLockscreenVisibility();
        if (i2 >= 29) {
            this.f50092cdj = notificationChannel.canBubble();
        }
        if (i2 >= 30) {
            this.f50094ki = notificationChannel.isImportantConversation();
        }
    }
}
