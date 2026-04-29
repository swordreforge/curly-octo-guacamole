package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.kja0;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.kja0;
import zy.InterfaceC7842s;
import zy.uv6;

/* JADX INFO: compiled from: ComponentActivity.java */
/* JADX INFO: loaded from: classes.dex */
@zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class cdj extends Activity implements InterfaceC0954z, kja0.InterfaceC0703k {
    private androidx.collection.qrj<Class<? extends C0417k>, C0417k> mExtraDataMap = new androidx.collection.qrj<>();
    private androidx.lifecycle.wvg mLifecycleRegistry = new androidx.lifecycle.wvg(this);

    /* JADX INFO: renamed from: androidx.core.app.cdj$k */
    /* JADX INFO: compiled from: ComponentActivity.java */
    @Deprecated
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public static class C0417k {
    }

    private static boolean shouldSkipDump(@zy.dd String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return false;
        }
        String str = strArr[0];
        str.hashCode();
        switch (str) {
            case "--translation":
                if (Build.VERSION.SDK_INT >= 31) {
                    break;
                }
                break;
            case "--contentcapture":
                if (Build.VERSION.SDK_INT >= 29) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !androidx.core.view.kja0.m3361q(decorView, keyEvent)) {
            return androidx.core.view.kja0.m3360n(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !androidx.core.view.kja0.m3361q(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Deprecated
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public <T extends C0417k> T getExtraData(Class<T> cls) {
        return (T) this.mExtraDataMap.get(cls);
    }

    @zy.lvui
    public androidx.lifecycle.kja0 getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    protected void onCreate(@zy.dd Bundle bundle) {
        super.onCreate(bundle);
        androidx.lifecycle.lvui.f7l8(this);
    }

    @Override // android.app.Activity
    @InterfaceC7842s
    protected void onSaveInstanceState(@zy.lvui Bundle bundle) {
        this.mLifecycleRegistry.x2(kja0.zy.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @Deprecated
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void putExtraData(C0417k c0417k) {
        this.mExtraDataMap.put((Class<? extends C0417k>) c0417k.getClass(), c0417k);
    }

    protected final boolean shouldDumpInternalState(@zy.dd String[] strArr) {
        return !shouldSkipDump(strArr);
    }

    @Override // androidx.core.view.kja0.InterfaceC0703k
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public boolean superDispatchKeyEvent(@zy.lvui KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
