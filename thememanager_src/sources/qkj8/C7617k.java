package qkj8;

import android.content.Context;
import android.text.TextUtils;
import bf2.toq;
import com.android.thememanager.controller.online.InterfaceC1925p;
import miuix.provider.C7317k;

/* JADX INFO: renamed from: qkj8.k */
/* JADX INFO: compiled from: PushLockscreenManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class C7617k implements InterfaceC1925p {

    /* JADX INFO: renamed from: q */
    private static volatile C7617k f43979q;

    /* JADX INFO: renamed from: k */
    private final Context f43980k = toq.toq().getApplicationContext();

    private C7617k() {
    }

    public static C7617k toq() {
        if (f43979q == null) {
            synchronized (C7617k.class) {
                if (f43979q == null) {
                    f43979q = new C7617k();
                }
            }
        }
        return f43979q;
    }

    /* JADX INFO: renamed from: k */
    public void m27925k(String newAuthority) {
        if (TextUtils.equals(newAuthority, zy())) {
            return;
        }
        C7317k.toq.m26513h(this.f43980k.getContentResolver(), "lock_wallpaper_provider_authority", newAuthority);
    }

    public String zy() {
        return C7317k.toq.m26518s(this.f43980k.getContentResolver(), "lock_wallpaper_provider_authority");
    }
}
