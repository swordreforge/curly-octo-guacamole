package miuix.hybrid.internal.webkit;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import mi1u.C6814k;

/* JADX INFO: compiled from: WebViewClientDelegate.java */
/* JADX INFO: loaded from: classes3.dex */
public class kja0 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f87737f7l8 = -1;

    /* JADX INFO: renamed from: g */
    public static final int f40307g = 2;

    /* JADX INFO: renamed from: n */
    public static final int f40308n = 1;

    /* JADX INFO: renamed from: k */
    private final boolean f40309k;

    /* JADX INFO: renamed from: q */
    private EnumC7139k f40310q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final boolean f87738toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private C7143q f87739zy;

    /* JADX INFO: renamed from: miuix.hybrid.internal.webkit.kja0$k */
    /* JADX INFO: compiled from: WebViewClientDelegate.java */
    private enum EnumC7139k {
        LOGIN_START,
        LOGIN_INPROGRESS,
        LOGIN_FINISHED
    }

    public kja0() {
        this(-1);
    }

    /* JADX INFO: renamed from: k */
    public void m25879k(miuix.hybrid.internal.provider.zy view, String url) {
        if (this.f87738toq && this.f40310q == EnumC7139k.LOGIN_INPROGRESS) {
            this.f40310q = EnumC7139k.LOGIN_FINISHED;
            this.f87739zy.mo25886q();
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m25880q(miuix.hybrid.internal.provider.zy view, String url) {
        if (!this.f40309k || !mi1u.toq.m24747g(url)) {
            return false;
        }
        Context contextMo25857p = view.mo25857p();
        PackageManager packageManager = contextMo25857p.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
        intent.addCategory("android.intent.category.BROWSABLE");
        ResolveInfo resolveInfoM26765k = miuix.util.zy.m26765k(contextMo25857p, packageManager, intent);
        if (resolveInfoM26765k == null) {
            return false;
        }
        if (resolveInfoM26765k.activityInfo == null) {
            return true;
        }
        contextMo25857p.startActivity(intent);
        return true;
    }

    public void toq(miuix.hybrid.internal.provider.zy view, String url, Bitmap favicon) {
        if (this.f87738toq && this.f40310q == EnumC7139k.LOGIN_START) {
            this.f40310q = EnumC7139k.LOGIN_INPROGRESS;
        }
    }

    public void zy(miuix.hybrid.internal.provider.zy view, String realm, String account, String args) {
        if (this.f87738toq) {
            Activity activityM24746k = C6814k.m24746k(view.ld6());
            if (this.f87739zy == null) {
                this.f87739zy = new zy(activityM24746k, view);
            }
            if (!view.zy()) {
                this.f40310q = EnumC7139k.LOGIN_START;
                view.mo25854i(4);
                this.f87739zy.m25884k(realm, account, args);
            } else if (view.toq()) {
                view.mo25853h();
            } else {
                activityM24746k.finish();
            }
        }
    }

    public kja0(int features) {
        this(features, -1);
    }

    public kja0(int features, int mask) {
        this.f40310q = EnumC7139k.LOGIN_FINISHED;
        int i2 = (features & mask) | ((~mask) & (-1));
        this.f40309k = (i2 & 1) != 0;
        this.f87738toq = (i2 & 2) != 0;
    }
}
