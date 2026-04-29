package com.android.thememanager.basemodule.views.pad;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.ActivityC0891q;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC0954z;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.basemodule.base.InterfaceC1719p;
import com.android.thememanager.basemodule.base.InterfaceC1721s;
import com.android.thememanager.basemodule.views.pad.BasePadAdapter.ViewHolder;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
public abstract class BasePadAdapter<T, K extends ViewHolder> extends RecyclerView.AbstractC1060y<K> implements InterfaceC1721s {

    /* JADX INFO: renamed from: k */
    private InterfaceC1719p f10610k;

    /* JADX INFO: renamed from: q */
    protected zy<T> f10611q;

    public static abstract class ViewHolder<T> extends RecyclerView.fti implements InterfaceC1721s {

        /* JADX INFO: renamed from: k */
        protected BasePadAdapter f10612k;

        /* JADX INFO: renamed from: n */
        protected int f10613n;

        /* JADX INFO: renamed from: q */
        protected T f10614q;

        public ViewHolder(@lvui View itemView, @lvui BasePadAdapter adapter) {
            super(itemView);
            this.f10612k = adapter;
            adapter.fu4().bf2(this);
        }

        public Context fn3e() {
            return this.f10612k.ki();
        }

        protected T fu4() {
            return this.f10614q;
        }

        public ActivityC0891q ki() {
            return this.f10612k.cdj();
        }

        @dd
        public Fragment ni7() {
            return this.f10612k.ni7();
        }

        public void o1t(T item, int position) {
            this.f10614q = item;
            this.f10613n = position;
        }

        /* JADX INFO: renamed from: z */
        protected InterfaceC1719p m7346z() {
            return this.f10612k.fu4();
        }
    }

    public BasePadAdapter(@lvui InterfaceC1719p viewContainer) {
        this.f10610k = viewContainer;
        viewContainer.bf2(this);
    }

    public ActivityC0891q cdj() {
        Object obj = this.f10610k;
        return obj instanceof Fragment ? ((Fragment) obj).getActivity() : (ActivityC0891q) obj;
    }

    public zy<T> fn3e() {
        return this.f10611q;
    }

    public InterfaceC1719p fu4() {
        return this.f10610k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemCount() {
        zy<T> zyVar = this.f10611q;
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
        Object obj = this.f10610k;
        if (obj instanceof Fragment) {
            return (Fragment) obj;
        }
        return null;
    }

    public void o1t(zy<T> list) {
        this.f10611q = list;
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onDestroy(@lvui InterfaceC0954z owner) {
        this.f10611q.toq();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@lvui K holder, int position) {
        holder.o1t(this.f10611q.getItem(position), position);
    }
}
