package androidx.activity.result.contract;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: androidx.activity.result.contract.k */
/* JADX INFO: compiled from: ActivityResultContract.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0059k<I, O> {

    /* JADX INFO: renamed from: androidx.activity.result.contract.k$k */
    /* JADX INFO: compiled from: ActivityResultContract.java */
    public static final class k<T> {

        /* JADX INFO: renamed from: k */
        @SuppressLint({"UnknownNullness"})
        private final T f127k;

        public k(@SuppressLint({"UnknownNullness"}) T t2) {
            this.f127k = t2;
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: k */
        public T m37k() {
            return this.f127k;
        }
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public abstract Intent mo36k(@lvui Context context, @SuppressLint({"UnknownNullness"}) I i2);

    @dd
    public k<O> toq(@lvui Context context, @SuppressLint({"UnknownNullness"}) I i2) {
        return null;
    }

    @SuppressLint({"UnknownNullness"})
    public abstract O zy(int i2, @dd Intent intent);
}
