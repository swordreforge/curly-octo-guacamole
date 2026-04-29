package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: NotificationChannelGroupCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class gvn7 {

    /* JADX INFO: renamed from: k */
    final String f3175k;

    /* JADX INFO: renamed from: n */
    private List<jk> f3176n;

    /* JADX INFO: renamed from: q */
    private boolean f3177q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    CharSequence f50068toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    String f50069zy;

    /* JADX INFO: renamed from: androidx.core.app.gvn7$k */
    /* JADX INFO: compiled from: NotificationChannelGroupCompat.java */
    public static class C0431k {

        /* JADX INFO: renamed from: k */
        final gvn7 f3178k;

        public C0431k(@zy.lvui String str) {
            this.f3178k = new gvn7(str);
        }

        @zy.lvui
        /* JADX INFO: renamed from: k */
        public gvn7 m1885k() {
            return this.f3178k;
        }

        @zy.lvui
        public C0431k toq(@zy.dd String str) {
            this.f3178k.f50069zy = str;
            return this;
        }

        @zy.lvui
        public C0431k zy(@zy.dd CharSequence charSequence) {
            this.f3178k.f50068toq = charSequence;
            return this;
        }
    }

    gvn7(@zy.lvui String str) {
        this.f3176n = Collections.emptyList();
        this.f3175k = (String) androidx.core.util.n7h.x2(str);
    }

    @zy.hyr(26)
    private List<jk> toq(List<NotificationChannel> list) {
        ArrayList arrayList = new ArrayList();
        for (NotificationChannel notificationChannel : list) {
            if (this.f3175k.equals(notificationChannel.getGroup())) {
                arrayList.add(new jk(notificationChannel));
            }
        }
        return arrayList;
    }

    public boolean f7l8() {
        return this.f3177q;
    }

    /* JADX INFO: renamed from: g */
    NotificationChannelGroup m1880g() {
        int i2 = Build.VERSION.SDK_INT;
        NotificationChannelGroup notificationChannelGroup = new NotificationChannelGroup(this.f3175k, this.f50068toq);
        if (i2 >= 28) {
            notificationChannelGroup.setDescription(this.f50069zy);
        }
        return notificationChannelGroup;
    }

    @zy.lvui
    /* JADX INFO: renamed from: k */
    public List<jk> m1881k() {
        return this.f3176n;
    }

    @zy.dd
    /* JADX INFO: renamed from: n */
    public CharSequence m1882n() {
        return this.f50068toq;
    }

    @zy.lvui
    /* JADX INFO: renamed from: q */
    public String m1883q() {
        return this.f3175k;
    }

    @zy.lvui
    /* JADX INFO: renamed from: y */
    public C0431k m1884y() {
        return new C0431k(this.f3175k).zy(this.f50068toq).toq(this.f50069zy);
    }

    @zy.dd
    public String zy() {
        return this.f50069zy;
    }

    @zy.hyr(28)
    gvn7(@zy.lvui NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.emptyList());
    }

    @zy.hyr(26)
    gvn7(@zy.lvui NotificationChannelGroup notificationChannelGroup, @zy.lvui List<NotificationChannel> list) {
        this(notificationChannelGroup.getId());
        this.f50068toq = notificationChannelGroup.getName();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            this.f50069zy = notificationChannelGroup.getDescription();
        }
        if (i2 >= 28) {
            this.f3177q = notificationChannelGroup.isBlocked();
            this.f3176n = toq(notificationChannelGroup.getChannels());
        } else {
            this.f3176n = toq(list);
        }
    }
}
