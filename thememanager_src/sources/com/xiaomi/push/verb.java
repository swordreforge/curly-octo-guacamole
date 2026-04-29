package com.xiaomi.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes3.dex */
public class verb {

    /* JADX INFO: renamed from: k */
    private static volatile Handler f34030k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static volatile Handler f73707toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final Object f73708zy = new Object();

    /* JADX INFO: renamed from: g */
    private static Handler m21899g() {
        if (f34030k == null) {
            synchronized (verb.class) {
                if (f34030k == null) {
                    HandlerThread handlerThread = new HandlerThread("handle_receiver");
                    handlerThread.start();
                    f34030k = new Handler(handlerThread.getLooper());
                }
            }
        }
        return f34030k;
    }

    /* JADX INFO: renamed from: k */
    public static Intent m21900k(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i2) {
        return toq(context, broadcastReceiver, intentFilter, null, i2);
    }

    /* JADX INFO: renamed from: n */
    public static Handler m21901n() {
        if (f73707toq == null) {
            synchronized (f73708zy) {
                if (f73707toq == null) {
                    HandlerThread handlerThread = new HandlerThread("receiver_task");
                    handlerThread.start();
                    f73707toq = new Handler(handlerThread.getLooper());
                }
            }
        }
        return f73707toq;
    }

    /* JADX INFO: renamed from: q */
    public static Intent m21902q(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i2) {
        if (context == null || broadcastReceiver == null || intentFilter == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i2) : context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }

    public static Intent toq(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, int i2) {
        return m21902q(context, broadcastReceiver, intentFilter, str, m21899g(), i2);
    }

    public static Intent zy(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
        return m21902q(context, broadcastReceiver, intentFilter, str, handler, 2);
    }
}
