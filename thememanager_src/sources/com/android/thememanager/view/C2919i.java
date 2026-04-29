package com.android.thememanager.view;

/* JADX INFO: renamed from: com.android.thememanager.view.i */
/* JADX INFO: compiled from: Message.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2919i {

    /* JADX INFO: renamed from: k */
    public int f17545k;

    /* JADX INFO: renamed from: n */
    public k f17546n;

    /* JADX INFO: renamed from: q */
    public boolean f17547q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public int f61513toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public Object f61514zy;

    /* JADX INFO: renamed from: com.android.thememanager.view.i$k */
    /* JADX INFO: compiled from: Message.java */
    public interface k<T> {
        void onResult(T t2);
    }

    public C2919i() {
        this.f17545k = -1;
        this.f61513toq = -1;
        this.f17547q = true;
    }

    public String toString() {
        return "Message{messengerTo=" + this.f17545k + ", messengerFlag=" + this.f61513toq + ", data=" + this.f61514zy + ", isAbortOnHandle=" + this.f17547q + '}';
    }

    public C2919i(int messengerTo, int messengerFlag, Object data, boolean isAbortOnHandle) {
        this.f17545k = messengerTo;
        this.f61513toq = messengerFlag;
        this.f61514zy = data;
        this.f17547q = isAbortOnHandle;
    }

    public <T> C2919i(int messengerTo, int messengerFlag, Object data, k<T> callback) {
        this.f17547q = true;
        this.f17545k = messengerTo;
        this.f61513toq = messengerFlag;
        this.f61514zy = data;
        this.f17546n = callback;
    }
}
