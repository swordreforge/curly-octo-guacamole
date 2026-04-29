package com.android.thememanager.view;

import android.util.Log;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: MessengerPoster.java */
/* JADX INFO: loaded from: classes2.dex */
public class ni7 {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f61530toq = "com.android.thememanager.view.ni7";

    /* JADX INFO: renamed from: k */
    private final Set<fn3e> f17654k;

    /* JADX INFO: compiled from: MessengerPoster.java */
    private static final class toq {

        /* JADX INFO: renamed from: k */
        static final ni7 f17655k = new ni7();

        private toq() {
        }
    }

    /* JADX INFO: renamed from: q */
    public static boolean m10416q(C2919i message) {
        return toq().m10417g(message);
    }

    public static ni7 toq() {
        return toq.f17655k;
    }

    public static boolean zy(int messengerTo, int messengerFlag, Object data, boolean isAbortOnHandle) {
        return toq().m10419n(messengerTo, messengerFlag, data, isAbortOnHandle);
    }

    public <T extends fn3e> void f7l8(T messenger) {
        if (messenger == null) {
            return;
        }
        this.f17654k.add(messenger);
    }

    /* JADX INFO: renamed from: g */
    public boolean m10417g(C2919i message) {
        boolean z2 = false;
        if (message == null) {
            Log.w(f61530toq, "postMessenger failed: message == null");
            return false;
        }
        if (message.f17545k == -1) {
            Log.w(f61530toq, "postMessenger failed: unknown messengerTo.");
            return false;
        }
        if (message.f61513toq == -1) {
            Log.w(f61530toq, "postMessenger failed: unknown messengerFlag.");
            return false;
        }
        if (this.f17654k.isEmpty()) {
            Log.w(f61530toq, "postMessenger failed: messenger queue is empty.");
            return false;
        }
        for (fn3e fn3eVar : this.f17654k) {
            if (fn3eVar != null) {
                z2 = true;
                if (fn3eVar.m10356k(message) && message.f17547q) {
                    break;
                }
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: k */
    public void m10418k() {
        if (this.f17654k.isEmpty()) {
            return;
        }
        this.f17654k.clear();
    }

    /* JADX INFO: renamed from: n */
    public boolean m10419n(int messengerTo, int messengerFlag, Object data, boolean isAbortOnHandle) {
        return m10417g(new C2919i(messengerTo, messengerFlag, data, isAbortOnHandle));
    }

    /* JADX INFO: renamed from: y */
    public <T extends fn3e> void m10420y(T messenger) {
        if (messenger != null && this.f17654k.contains(messenger)) {
            this.f17654k.remove(messenger);
        }
    }

    private ni7() {
        this.f17654k = new CopyOnWriteArraySet();
    }
}
