package com.android.thememanager.basemodule.base;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.ActivityC0891q;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.InterfaceC0954z;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder;
import java.util.ArrayList;
import java.util.List;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseThemeAdapter<T, K extends ViewHolder> extends RecyclerView.AbstractC1060y<K> implements InterfaceC1721s {

    /* JADX INFO: renamed from: k */
    private InterfaceC1719p f9844k;

    /* JADX INFO: renamed from: n */
    protected RecyclerView.AbstractC1060y f9845n;

    /* JADX INFO: renamed from: q */
    protected final List<T> f9846q = new ArrayList();

    public static abstract class ViewHolder<T> extends RecyclerView.fti implements InterfaceC1721s {

        /* JADX INFO: renamed from: k */
        protected BaseThemeAdapter f9847k;

        /* JADX INFO: renamed from: n */
        protected int f9848n;

        /* JADX INFO: renamed from: q */
        protected T f9849q;

        public ViewHolder(@lvui View itemView, @lvui BaseThemeAdapter adapter) {
            super(itemView);
            this.f9847k = adapter;
            if (adapter.mo6719o()) {
                this.f9847k.m6705z().bf2(this);
            }
        }

        public Context fn3e() {
            return this.f9847k.fn3e();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public T fu4() {
            return this.f9849q;
        }

        public ActivityC0891q ki() {
            return this.f9847k.ki();
        }

        @dd
        public Fragment ni7() {
            return this.f9847k.fu4();
        }

        public void o1t(T item, int position) {
            this.f9849q = item;
            this.f9848n = position;
        }

        /* JADX INFO: renamed from: z */
        protected InterfaceC1719p m6706z() {
            return this.f9847k.m6705z();
        }
    }

    public BaseThemeAdapter(@lvui InterfaceC1719p viewContainer) {
        this.f9844k = viewContainer;
        viewContainer.bf2(this);
    }

    public void cdj(int position, boolean isLoading) {
    }

    public Context fn3e() {
        return ki();
    }

    @dd
    public Fragment fu4() {
        Object obj = this.f9844k;
        if (obj instanceof Fragment) {
            return (Fragment) obj;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemCount() {
        return this.f9846q.size();
    }

    public void jk(int position) {
    }

    public ActivityC0891q ki() {
        Object obj = this.f9844k;
        return obj instanceof Fragment ? ((Fragment) obj).getActivity() : (ActivityC0891q) obj;
    }

    public void mcp(int position, boolean isLoading) {
    }

    public List<T> ni7() {
        return this.f9846q;
    }

    public boolean o1t(int position) {
        return false;
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onDestroy(@lvui InterfaceC0954z owner) {
        this.f9846q.clear();
    }

    /* JADX INFO: renamed from: p */
    public void m6703p(RecyclerView.AbstractC1060y outAdapter) {
        this.f9845n = outAdapter;
    }

    /* JADX INFO: renamed from: t */
    public void m6704t(int position) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: wvg, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@lvui K holder, int position) {
        holder.o1t(this.f9846q.get(position), position);
    }

    /* JADX INFO: renamed from: z */
    public InterfaceC1719p m6705z() {
        return this.f9844k;
    }
}
