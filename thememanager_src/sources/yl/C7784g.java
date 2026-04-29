package yl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: yl.g */
/* JADX INFO: compiled from: GestureSlideUpHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C7784g extends BroadcastReceiver {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f100615f7l8 = 5;

    /* JADX INFO: renamed from: g */
    public static final int f45943g = 4;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f100616ld6 = 9;

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    public static final String f45944n = "actionUpSpeedAndDirection";

    /* JADX INFO: renamed from: p */
    public static final int f45945p = 8;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    public static final String f45946q = "com.miui.home.fullScreenGesture.actionUp";

    /* JADX INFO: renamed from: s */
    public static final int f45947s = 7;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    public static final k f100617toq = new k(null);

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f100618x2 = 10;

    /* JADX INFO: renamed from: y */
    public static final int f45948y = 6;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    public static final String f100619zy = "GestureSlideUpHelper";

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private final InterfaceC7786n f45949k;

    /* JADX INFO: renamed from: yl.g$k */
    /* JADX INFO: compiled from: GestureSlideUpHelper.kt */
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(ni7 ni7Var) {
            this();
        }
    }

    public C7784g(@InterfaceC7395n InterfaceC7786n interfaceC7786n) {
        this.f45949k = interfaceC7786n;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public final InterfaceC7786n m28169k() {
        return this.f45949k;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@InterfaceC7395n Context context, @InterfaceC7395n Intent intent) {
        InterfaceC7786n interfaceC7786n;
        if (intent == null) {
            Log.w(f100619zy, "intent is null");
            return;
        }
        String action = intent.getAction();
        Log.i(f100619zy, "action: " + action);
        if (TextUtils.equals(f45946q, action)) {
            int intExtra = intent.getIntExtra(f45944n, -1);
            Log.i(f100619zy, "extraMsgUp: " + intExtra);
            if ((intExtra == 5 || intExtra == 10) && (interfaceC7786n = this.f45949k) != null) {
                interfaceC7786n.mo6347l();
            }
        }
    }

    public final void toq(@InterfaceC7396q Context applicationContext) {
        d2ok.m23075h(applicationContext, "applicationContext");
        applicationContext.registerReceiver(this, new IntentFilter(f45946q));
    }

    public final void zy(@InterfaceC7396q Context applicationContext) {
        d2ok.m23075h(applicationContext, "applicationContext");
        applicationContext.unregisterReceiver(this);
    }
}
