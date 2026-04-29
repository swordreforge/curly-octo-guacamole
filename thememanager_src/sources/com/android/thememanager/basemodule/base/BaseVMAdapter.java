package com.android.thememanager.basemodule.base;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.ActivityC0891q;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC0954z;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.basemodule.base.BaseVMAdapter.ViewHolder;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseVMAdapter<T, K extends ViewHolder> extends RecyclerView.AbstractC1060y<K> implements InterfaceC1721s {

    /* JADX INFO: renamed from: k */
    private InterfaceC1719p f9850k;

    /* JADX INFO: renamed from: q */
    protected com.android.thememanager.basemodule.views.pad.zy<T> f9851q;

    public static abstract class ViewHolder<T> extends RecyclerView.fti implements InterfaceC1721s {

        /* JADX INFO: renamed from: k */
        protected BaseVMAdapter f9852k;

        /* JADX INFO: renamed from: n */
        protected int f9853n;

        /* JADX INFO: renamed from: q */
        protected T f9854q;

        public ViewHolder(@lvui View itemView, @lvui BaseVMAdapter adapter) {
            super(itemView);
            this.f9852k = adapter;
            if (adapter.mo6719o()) {
                this.f9852k.fu4().bf2(this);
            }
        }

        public Context fn3e() {
            return this.f9852k.ki();
        }

        protected T fu4() {
            return this.f9854q;
        }

        public ActivityC0891q ki() {
            return this.f9852k.cdj();
        }

        @dd
        public Fragment ni7() {
            return this.f9852k.ni7();
        }

        public void o1t(T item, int position) {
            this.f9854q = item;
            this.f9853n = position;
        }

        /* JADX INFO: renamed from: z */
        protected InterfaceC1719p m6708z() {
            return this.f9852k.fu4();
        }
    }

    public BaseVMAdapter(@lvui InterfaceC1719p viewContainer) {
        this.f9850k = viewContainer;
        viewContainer.bf2(this);
    }

    public ActivityC0891q cdj() {
        Object obj = this.f9850k;
        return obj instanceof Fragment ? ((Fragment) obj).getActivity() : (ActivityC0891q) obj;
    }

    public com.android.thememanager.basemodule.views.pad.zy<T> fn3e() {
        return this.f9851q;
    }

    public InterfaceC1719p fu4() {
        return this.f9850k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemCount() {
        com.android.thememanager.basemodule.views.pad.zy<T> zyVar = this.f9851q;
        if (zyVar == null) {
            return 0;
        }
        return zyVar.getItemCount();
    }

    public Context ki() {
        return cdj();
    }

    @dd
    public Fragment ni7() {
        Object obj = this.f9850k;
        if (obj instanceof Fragment) {
            return (Fragment) obj;
        }
        return null;
    }

    public void o1t(com.android.thememanager.basemodule.views.pad.zy<T> list) {
        this.f9851q = list;
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onDestroy(@lvui InterfaceC0954z owner) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@lvui K holder, int position) {
        holder.o1t(this.f9851q.getItem(position), position);
    }
}
