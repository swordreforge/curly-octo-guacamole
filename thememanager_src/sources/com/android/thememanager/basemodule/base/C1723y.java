package com.android.thememanager.basemodule.base;

import zy.dd;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.base.y */
/* JADX INFO: compiled from: Event.java */
/* JADX INFO: loaded from: classes.dex */
public class C1723y<T> {

    /* JADX INFO: renamed from: k */
    private final T f9884k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f57509toq = false;

    public C1723y(T content) {
        if (content == null) {
            throw new IllegalArgumentException("null values in Event are not allowed.");
        }
        this.f9884k = content;
    }

    @dd
    /* JADX INFO: renamed from: k */
    public T m6720k() {
        if (this.f57509toq) {
            return null;
        }
        this.f57509toq = true;
        return this.f9884k;
    }

    public boolean toq() {
        return this.f57509toq;
    }

    public T zy() {
        return this.f9884k;
    }
}
