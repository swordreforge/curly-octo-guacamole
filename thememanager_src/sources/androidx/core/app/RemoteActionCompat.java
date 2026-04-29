package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.InterfaceC1269y;
import zy.InterfaceC7830i;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
public final class RemoteActionCompat implements InterfaceC1269y {

    /* JADX INFO: renamed from: g */
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public boolean f3108g;

    /* JADX INFO: renamed from: k */
    @zy.lvui
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public IconCompat f3109k;

    /* JADX INFO: renamed from: n */
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public boolean f3110n;

    /* JADX INFO: renamed from: q */
    @zy.lvui
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public PendingIntent f3111q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @zy.lvui
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public CharSequence f50032toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @zy.lvui
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public CharSequence f50033zy;

    /* JADX INFO: renamed from: androidx.core.app.RemoteActionCompat$k */
    @zy.hyr(26)
    static class C0410k {
        private C0410k() {
        }

        @InterfaceC7830i
        static void f7l8(RemoteAction remoteAction, boolean z2) {
            remoteAction.setEnabled(z2);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: g */
        static boolean m1784g(RemoteAction remoteAction) {
            return remoteAction.isEnabled();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static RemoteAction m1785k(Icon icon, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
            return new RemoteAction(icon, charSequence, charSequence2, pendingIntent);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: n */
        static CharSequence m1786n(RemoteAction remoteAction) {
            return remoteAction.getTitle();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static Icon m1787q(RemoteAction remoteAction) {
            return remoteAction.getIcon();
        }

        @InterfaceC7830i
        static PendingIntent toq(RemoteAction remoteAction) {
            return remoteAction.getActionIntent();
        }

        @InterfaceC7830i
        static CharSequence zy(RemoteAction remoteAction) {
            return remoteAction.getContentDescription();
        }
    }

    @zy.hyr(28)
    static class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m1788k(RemoteAction remoteAction, boolean z2) {
            remoteAction.setShouldShowIcon(z2);
        }

        @InterfaceC7830i
        static boolean toq(RemoteAction remoteAction) {
            return remoteAction.shouldShowIcon();
        }
    }

    public RemoteActionCompat(@zy.lvui IconCompat iconCompat, @zy.lvui CharSequence charSequence, @zy.lvui CharSequence charSequence2, @zy.lvui PendingIntent pendingIntent) {
        this.f3109k = (IconCompat) androidx.core.util.n7h.x2(iconCompat);
        this.f50032toq = (CharSequence) androidx.core.util.n7h.x2(charSequence);
        this.f50033zy = (CharSequence) androidx.core.util.n7h.x2(charSequence2);
        this.f3111q = (PendingIntent) androidx.core.util.n7h.x2(pendingIntent);
        this.f3110n = true;
        this.f3108g = true;
    }

    @zy.hyr(26)
    @zy.lvui
    /* JADX INFO: renamed from: k */
    public static RemoteActionCompat m1779k(@zy.lvui RemoteAction remoteAction) {
        androidx.core.util.n7h.x2(remoteAction);
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat(IconCompat.f7l8(C0410k.m1787q(remoteAction)), C0410k.m1786n(remoteAction), C0410k.zy(remoteAction), C0410k.toq(remoteAction));
        remoteActionCompat.f7l8(C0410k.m1784g(remoteAction));
        if (Build.VERSION.SDK_INT >= 28) {
            remoteActionCompat.m1783y(toq.toq(remoteAction));
        }
        return remoteActionCompat;
    }

    public void f7l8(boolean z2) {
        this.f3110n = z2;
    }

    /* JADX INFO: renamed from: g */
    public boolean m1780g() {
        return this.f3110n;
    }

    @zy.hyr(26)
    @zy.lvui
    public RemoteAction kja0() {
        RemoteAction remoteActionM1785k = C0410k.m1785k(this.f3109k.eqxt(), this.f50032toq, this.f50033zy, this.f3111q);
        C0410k.f7l8(remoteActionM1785k, m1780g());
        if (Build.VERSION.SDK_INT >= 28) {
            toq.m1788k(remoteActionM1785k, n7h());
        }
        return remoteActionM1785k;
    }

    @zy.lvui
    /* JADX INFO: renamed from: n */
    public CharSequence m1781n() {
        return this.f50032toq;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public boolean n7h() {
        return this.f3108g;
    }

    @zy.lvui
    /* JADX INFO: renamed from: q */
    public IconCompat m1782q() {
        return this.f3109k;
    }

    @zy.lvui
    public PendingIntent toq() {
        return this.f3111q;
    }

    /* JADX INFO: renamed from: y */
    public void m1783y(boolean z2) {
        this.f3108g = z2;
    }

    @zy.lvui
    public CharSequence zy() {
        return this.f50033zy;
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public RemoteActionCompat() {
    }

    public RemoteActionCompat(@zy.lvui RemoteActionCompat remoteActionCompat) {
        androidx.core.util.n7h.x2(remoteActionCompat);
        this.f3109k = remoteActionCompat.f3109k;
        this.f50032toq = remoteActionCompat.f50032toq;
        this.f50033zy = remoteActionCompat.f50033zy;
        this.f3111q = remoteActionCompat.f3111q;
        this.f3110n = remoteActionCompat.f3110n;
        this.f3108g = remoteActionCompat.f3108g;
    }
}
