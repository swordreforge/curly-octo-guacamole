package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.content.C0498q;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: androidx.fragment.app.s */
/* JADX INFO: compiled from: FragmentHostCallback.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0893s<E> extends AbstractC0879g {

    /* JADX INFO: renamed from: g */
    private final int f4866g;

    /* JADX INFO: renamed from: k */
    @dd
    private final Activity f4867k;

    /* JADX INFO: renamed from: n */
    @lvui
    private final Handler f4868n;

    /* JADX INFO: renamed from: q */
    @lvui
    private final Context f4869q;

    /* JADX INFO: renamed from: y */
    final FragmentManager f4870y;

    public AbstractC0893s(@lvui Context context, @lvui Handler handler, int i2) {
        this(context instanceof Activity ? (Activity) context : null, context, handler, i2);
    }

    public void cdj(@lvui Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2, @dd Bundle bundle) {
        if (i2 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        C0498q.m2254i(this.f4869q, intent, bundle);
    }

    @lvui
    Handler f7l8() {
        return this.f4868n;
    }

    @lvui
    /* JADX INFO: renamed from: g */
    Context m4330g() {
        return this.f4869q;
    }

    /* JADX INFO: renamed from: h */
    public void m4331h(@lvui Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        cdj(fragment, intent, i2, null);
    }

    @Deprecated
    public void ki(@lvui Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, @dd Intent intent, int i3, int i4, int i5, @dd Bundle bundle) throws IntentSender.SendIntentException {
        if (i2 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        androidx.core.app.toq.dd(this.f4867k, intentSender, i2, intent, i3, i4, i5, bundle);
    }

    public boolean kja0(@lvui String str) {
        return false;
    }

    public int ld6() {
        return this.f4866g;
    }

    @dd
    /* JADX INFO: renamed from: n */
    Activity m4332n() {
        return this.f4867k;
    }

    public boolean n7h(@lvui Fragment fragment) {
        return true;
    }

    @lvui
    /* JADX INFO: renamed from: p */
    public LayoutInflater mo4319p() {
        return LayoutInflater.from(this.f4869q);
    }

    @Override // androidx.fragment.app.AbstractC0879g
    /* JADX INFO: renamed from: q */
    public boolean mo4180q() {
        return true;
    }

    @Deprecated
    public void qrj(@lvui Fragment fragment, @lvui String[] strArr, int i2) {
    }

    @dd
    /* JADX INFO: renamed from: s */
    public abstract E mo4320s();

    public void t8r() {
    }

    public boolean x2() {
        return true;
    }

    /* JADX INFO: renamed from: y */
    public void mo4321y(@lvui String str, @dd FileDescriptor fileDescriptor, @lvui PrintWriter printWriter, @dd String[] strArr) {
    }

    @Override // androidx.fragment.app.AbstractC0879g
    @dd
    public View zy(int i2) {
        return null;
    }

    AbstractC0893s(@lvui ActivityC0891q activityC0891q) {
        this(activityC0891q, activityC0891q, new Handler(), 0);
    }

    AbstractC0893s(@dd Activity activity, @lvui Context context, @lvui Handler handler, int i2) {
        this.f4870y = new n7h();
        this.f4867k = activity;
        this.f4869q = (Context) androidx.core.util.n7h.qrj(context, "context == null");
        this.f4868n = (Handler) androidx.core.util.n7h.qrj(handler, "handler == null");
        this.f4866g = i2;
    }
}
