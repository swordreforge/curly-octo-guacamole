package com.android.thememanager.util;

import android.util.Pair;
import android.view.View;
import com.android.thememanager.basemodule.resource.model.Resource;

/* JADX INFO: compiled from: BaseBatchHandler.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class t8r {

    /* JADX INFO: renamed from: k */
    private View.OnClickListener f16804k = new ViewOnClickListenerC2809k();

    /* JADX INFO: renamed from: q */
    private View.OnLongClickListener f16805q = new toq();

    /* JADX INFO: renamed from: com.android.thememanager.util.t8r$k */
    /* JADX INFO: compiled from: BaseBatchHandler.java */
    class ViewOnClickListenerC2809k implements View.OnClickListener {
        ViewOnClickListenerC2809k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            t8r.this.mo9371g(v2);
        }
    }

    /* JADX INFO: compiled from: BaseBatchHandler.java */
    class toq implements View.OnLongClickListener {
        toq() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View v2) {
            return t8r.this.mo9373y(v2);
        }
    }

    /* JADX INFO: compiled from: BaseBatchHandler.java */
    public interface zy {
        /* JADX INFO: renamed from: k */
        void mo9559k(Resource r2);
    }

    /* JADX INFO: renamed from: g */
    protected void mo9371g(View v2) {
    }

    /* JADX INFO: renamed from: k */
    public boolean mo9552k(Resource resource) {
        return true;
    }

    /* JADX INFO: renamed from: n */
    public void mo9553n(zy callback) {
    }

    /* JADX INFO: renamed from: q */
    public boolean mo9554q() {
        return false;
    }

    /* JADX INFO: renamed from: s */
    public void mo9372s() {
    }

    public void toq() {
    }

    /* JADX INFO: renamed from: y */
    protected boolean mo9373y(View v2) {
        return false;
    }

    public void zy(View v2, Pair<Integer, Integer> position) {
        v2.setTag(position);
        v2.setOnClickListener(this.f16804k);
        v2.setOnLongClickListener(this.f16805q);
    }
}
