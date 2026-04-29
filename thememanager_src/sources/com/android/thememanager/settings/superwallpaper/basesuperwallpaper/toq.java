package com.android.thememanager.settings.superwallpaper.basesuperwallpaper;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import android.provider.MiuiSettings;
import android.provider.Settings;
import android.util.Log;
import com.android.thememanager.settings.superwallpaper.C2656k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: UINightModeHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq {

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f60899qrj = "dark_wallpaper_mode_enable";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f60900x2 = "UINightModeHelper";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final List<WeakReference<InterfaceC2654n>> f60901f7l8;

    /* JADX INFO: renamed from: g */
    private Handler f15695g;

    /* JADX INFO: renamed from: k */
    private Context f15696k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private Runnable f60902ld6;

    /* JADX INFO: renamed from: n */
    private Calendar f15697n;

    /* JADX INFO: renamed from: p */
    private final BroadcastReceiver f15698p;

    /* JADX INFO: renamed from: q */
    private boolean f15699q;

    /* JADX INFO: renamed from: s */
    private ContentObserver f15700s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f60903toq;

    /* JADX INFO: renamed from: y */
    private ContentObserver f15701y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f60904zy;

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.basesuperwallpaper.toq$g */
    /* JADX INFO: compiled from: UINightModeHelper.java */
    private static class C2652g {

        /* JADX INFO: renamed from: k */
        public static final toq f15702k = new toq(null);

        private C2652g() {
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.basesuperwallpaper.toq$k */
    /* JADX INFO: compiled from: UINightModeHelper.java */
    class C2653k extends ContentObserver {
        C2653k(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange) {
            toq toqVar = toq.this;
            toqVar.f60903toq = MiuiSettings.System.getBoolean(toqVar.f15696k.getContentResolver(), toq.f60899qrj, true);
            Log.d(toq.f60900x2, "mDarkWallpaperModeObserver " + toq.this.f60903toq);
            toq.this.cdj();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.basesuperwallpaper.toq$n */
    /* JADX INFO: compiled from: UINightModeHelper.java */
    public interface InterfaceC2654n {
        /* JADX INFO: renamed from: k */
        default void mo9211k(boolean isSuperWallpaperDark) {
        }

        default void toq(boolean isDarkMode) {
        }

        default void zy(boolean isDarkenWallpaper) {
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.basesuperwallpaper.toq$q */
    /* JADX INFO: compiled from: UINightModeHelper.java */
    class RunnableC2655q implements Runnable {
        RunnableC2655q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            toq.this.fn3e();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.basesuperwallpaper.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: UINightModeHelper.java */
    class C7934toq extends ContentObserver {
        C7934toq(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange) {
            toq toqVar = toq.this;
            toqVar.f60904zy = com.android.thememanager.settings.superwallpaper.utils.zy.m9317y(toqVar.f15696k);
            Log.d(toq.f60900x2, "mDarkModeObserver " + toq.this.f60904zy);
            toq.this.m9232h();
        }
    }

    /* JADX INFO: compiled from: UINightModeHelper.java */
    class zy extends BroadcastReceiver {
        zy() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.intent.action.TIME_TICK")) {
                toq.this.f15695g.post(toq.this.f60902ld6);
            }
        }
    }

    /* synthetic */ toq(C2653k c2653k) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cdj() {
        for (int i2 = 0; i2 < this.f60901f7l8.size(); i2++) {
            InterfaceC2654n interfaceC2654n = this.f60901f7l8.get(i2).get();
            if (interfaceC2654n != null) {
                interfaceC2654n.zy(this.f60903toq);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fn3e() {
        boolean zT8r = t8r();
        if (zT8r != this.f15699q) {
            this.f15699q = zT8r;
            Log.d(f60900x2, "mTimeTickRunnable hour =  mSuperWallpaperDark = " + this.f15699q);
            ki();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m9232h() {
        Log.d(f60900x2, "notifyDarkModeChanged mCallBacks size = " + this.f60901f7l8.size());
        for (int i2 = 0; i2 < this.f60901f7l8.size(); i2++) {
            InterfaceC2654n interfaceC2654n = this.f60901f7l8.get(i2).get();
            Log.d(f60900x2, "notifyDarkModeChanged mCallBacks cb = " + interfaceC2654n);
            if (interfaceC2654n != null) {
                interfaceC2654n.toq(this.f60904zy);
            }
        }
    }

    private void ki() {
        for (int i2 = 0; i2 < this.f60901f7l8.size(); i2++) {
            InterfaceC2654n interfaceC2654n = this.f60901f7l8.get(i2).get();
            if (interfaceC2654n != null) {
                interfaceC2654n.mo9211k(this.f15699q);
            }
        }
    }

    public static toq x2() {
        return C2652g.f15702k;
    }

    /* JADX INFO: renamed from: i */
    public void m9239i(InterfaceC2654n callback) {
        Log.d(f60900x2, "removeCallback callback = " + callback);
        for (int size = this.f60901f7l8.size() + (-1); size >= 0; size--) {
            if (this.f60901f7l8.get(size).get() == callback) {
                this.f60901f7l8.remove(size);
            }
        }
    }

    public boolean kja0() {
        return this.f15699q;
    }

    public void ld6(InterfaceC2654n callback, boolean notify) {
        Log.d(f60900x2, "addCallback callback = " + callback);
        for (int i2 = 0; i2 < this.f60901f7l8.size(); i2++) {
            if (this.f60901f7l8.get(i2).get() == callback) {
                Log.e(f60900x2, "Object tried to add another callback", new Exception("Called by"));
                return;
            }
        }
        this.f60901f7l8.add(new WeakReference<>(callback));
        m9239i(null);
        if (notify) {
            callback.toq(this.f60904zy);
            callback.mo9211k(this.f15699q);
            callback.zy(this.f60903toq);
        }
    }

    public boolean n7h() {
        return this.f60903toq;
    }

    public boolean qrj() {
        return this.f60904zy;
    }

    public boolean t8r() {
        this.f15697n.setTimeInMillis(System.currentTimeMillis());
        long j2 = (this.f15697n.get(11) * 60 * 60) + (this.f15697n.get(12) * 60);
        return j2 < Settings.Global.getLong(bf2.toq.toq().getContentResolver(), C2656k.f60925n5r1, 18000L) || j2 >= Settings.Global.getLong(bf2.toq.toq().getContentResolver(), C2656k.f60916hyr, 72000L);
    }

    private toq() {
        this.f15695g = new Handler(Looper.getMainLooper());
        this.f60901f7l8 = Collections.synchronizedList(new ArrayList());
        this.f15701y = new C2653k(this.f15695g);
        this.f15700s = new C7934toq(this.f15695g);
        zy zyVar = new zy();
        this.f15698p = zyVar;
        this.f60902ld6 = new RunnableC2655q();
        Context qVar = bf2.toq.toq();
        this.f15696k = qVar;
        qVar.getContentResolver().registerContentObserver(Settings.Secure.getUriFor("ui_night_mode"), false, this.f15700s);
        this.f15700s.onChange(true);
        this.f15696k.getContentResolver().registerContentObserver(Settings.System.getUriFor(f60899qrj), false, this.f15701y);
        this.f15701y.onChange(true);
        this.f15697n = Calendar.getInstance();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_TICK");
        this.f15696k.registerReceiver(zyVar, intentFilter);
        fn3e();
    }
}
