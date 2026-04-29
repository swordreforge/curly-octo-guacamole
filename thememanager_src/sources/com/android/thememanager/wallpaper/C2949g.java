package com.android.thememanager.wallpaper;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.graphics.ColorSpace;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.android.thememanager.basemodule.utils.y9n;
import com.miui.maml.util.SystemProperties;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.d2ok;
import l05.qrj;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: com.android.thememanager.wallpaper.g */
/* JADX INFO: compiled from: WideColorGamutManager.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2949g {

    /* JADX INFO: renamed from: g */
    @InterfaceC7395n
    private static ContentObserver f17746g = null;

    /* JADX INFO: renamed from: n */
    @InterfaceC7395n
    private static ContentObserver f17748n = null;

    /* JADX INFO: renamed from: q */
    private static final int f17749q = 1;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f61569toq = 3;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f61570zy = 4;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final C2949g f17747k = new C2949g();

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static int f61568f7l8 = -1;

    /* JADX INFO: renamed from: y */
    private static int f17751y = -1;

    /* JADX INFO: renamed from: s */
    @InterfaceC7396q
    private static final CopyOnWriteArrayList<WeakReference<InterfaceC2950k>> f17750s = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: com.android.thememanager.wallpaper.g$k */
    /* JADX INFO: compiled from: WideColorGamutManager.kt */
    public static final class k extends ContentObserver {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Context f17752k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Context context, Handler handler) {
            super(handler);
            this.f17752k = context;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z2) {
            C2949g c2949g = C2949g.f17747k;
            C2949g.f61568f7l8 = Settings.System.getInt(this.f17752k.getContentResolver(), "screen_optimize_mode", 0);
            c2949g.m10466y();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.wallpaper.g$toq */
    /* JADX INFO: compiled from: WideColorGamutManager.kt */
    public static final class toq extends ContentObserver {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Context f17753k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        toq(Context context, Handler handler) {
            super(handler);
            this.f17753k = context;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z2) {
            C2949g c2949g = C2949g.f17747k;
            C2949g.f17751y = Settings.System.getInt(this.f17753k.getContentResolver(), "color_space_mode", 0);
            c2949g.m10466y();
        }
    }

    private C2949g() {
    }

    @qrj
    public static final boolean f7l8(@InterfaceC7395n ColorSpace colorSpace) {
        if (colorSpace != null) {
            return colorSpace.isWideGamut();
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    private final boolean m10462g() {
        return SystemProperties.getBoolean("ro.vendor.display.is_standard_mode", true);
    }

    /* JADX INFO: renamed from: n */
    private final boolean m10464n(InterfaceC2950k interfaceC2950k) {
        Iterator<WeakReference<InterfaceC2950k>> it = f17750s.iterator();
        while (it.hasNext()) {
            if (d2ok.f7l8(it.next().get(), interfaceC2950k)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    private final boolean m10465p(InterfaceC2950k interfaceC2950k) {
        for (WeakReference<InterfaceC2950k> weakReference : f17750s) {
            if (d2ok.f7l8(weakReference.get(), interfaceC2950k)) {
                return f17750s.remove(weakReference);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public final void m10466y() {
        Iterator<WeakReference<InterfaceC2950k>> it = f17750s.iterator();
        while (it.hasNext()) {
            InterfaceC2950k interfaceC2950k = it.next().get();
            if (interfaceC2950k != null) {
                interfaceC2950k.mo6375g();
            }
        }
    }

    public final boolean ld6() {
        Context qVar = bf2.toq.toq();
        if (!y9n.toq(33)) {
            return false;
        }
        f61568f7l8 = Settings.System.getInt(qVar.getContentResolver(), "screen_optimize_mode", 0);
        f17751y = Settings.System.getInt(qVar.getContentResolver(), "color_space_mode", -1);
        if (f17748n == null) {
            f17748n = new k(qVar, new Handler(Looper.getMainLooper()));
            ContentResolver contentResolver = qVar.getContentResolver();
            Uri uriFor = Settings.System.getUriFor("screen_optimize_mode");
            ContentObserver contentObserver = f17748n;
            d2ok.n7h(contentObserver, "null cannot be cast to non-null type android.database.ContentObserver");
            contentResolver.registerContentObserver(uriFor, false, contentObserver);
        }
        if (f17746g == null) {
            f17746g = new toq(qVar, new Handler(Looper.getMainLooper()));
            ContentResolver contentResolver2 = qVar.getContentResolver();
            Uri uriFor2 = Settings.System.getUriFor("color_space_mode");
            ContentObserver contentObserver2 = f17746g;
            d2ok.n7h(contentObserver2, "null cannot be cast to non-null type android.database.ContentObserver");
            contentResolver2.registerContentObserver(uriFor2, false, contentObserver2);
        }
        if (qVar.getResources().getConfiguration().isScreenWideColorGamut()) {
            return (f61568f7l8 == 3 && m10462g()) || (f61568f7l8 == 4 && f17751y == 1);
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final void m10467q(@InterfaceC7395n InterfaceC2950k interfaceC2950k) {
        if (interfaceC2950k == null || m10464n(interfaceC2950k)) {
            return;
        }
        f17750s.add(new WeakReference<>(interfaceC2950k));
    }

    /* JADX INFO: renamed from: s */
    public final void m10468s(@InterfaceC7395n InterfaceC2950k interfaceC2950k) {
        if (interfaceC2950k == null) {
            return;
        }
        m10465p(interfaceC2950k);
    }
}
