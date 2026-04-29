package com.android.thememanager.basemodule.utils;

import android.content.Intent;
import java.util.HashMap;

/* JADX INFO: compiled from: LocalBus.java */
/* JADX INFO: loaded from: classes.dex */
public class ni7 {

    /* JADX INFO: renamed from: k */
    private HashMap<String, androidx.lifecycle.fti<Intent>> f10367k;

    /* JADX INFO: compiled from: LocalBus.java */
    private static class toq {

        /* JADX INFO: renamed from: k */
        private static final ni7 f10368k = new ni7();

        private toq() {
        }
    }

    /* JADX INFO: renamed from: g */
    private androidx.lifecycle.fti<Intent> m7145g(String action) {
        if (!this.f10367k.containsKey(action)) {
            this.f10367k.put(action, new androidx.lifecycle.fti<>());
        }
        return this.f10367k.get(action);
    }

    /* JADX INFO: renamed from: k */
    public static ni7 m7146k() {
        return toq.f10368k;
    }

    @zy.oc
    /* JADX INFO: renamed from: n */
    public void m7147n(String action, androidx.lifecycle.jp0y<Intent> observer) {
        androidx.lifecycle.fti<Intent> ftiVar = this.f10367k.get(action);
        if (ftiVar != null) {
            ftiVar.kja0(observer);
            if (ftiVar.m4392s()) {
                return;
            }
            this.f10367k.remove(action);
        }
    }

    @zy.oc
    /* JADX INFO: renamed from: q */
    public void m7148q(String action, Intent value) {
        if (this.f10367k.containsKey(action)) {
            zy(action, value);
        }
    }

    @zy.oc
    public void toq(String action, androidx.lifecycle.jp0y<Intent> observer) {
        m7145g(action).ld6(observer);
    }

    @zy.oc
    public void zy(String action, Intent value) {
        m7145g(action).n7h(value);
    }

    private ni7() {
        this.f10367k = new HashMap<>();
    }
}
