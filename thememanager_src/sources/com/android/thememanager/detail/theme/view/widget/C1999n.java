package com.android.thememanager.detail.theme.view.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.thememanager.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.widget.n */
/* JADX INFO: compiled from: DetailTagAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1999n extends BaseAdapter {

    /* JADX INFO: renamed from: k */
    private final Context f11372k;

    /* JADX INFO: renamed from: q */
    private final List<String> f11373q = new ArrayList();

    public C1999n(Context context) {
        this.f11372k = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f11373q.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int position) {
        return position;
    }

    @Override // android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewInflate = LayoutInflater.from(this.f11372k).inflate(R.layout.de_detail_tag, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.tv_tag)).setText(this.f11373q.get(position));
        return viewInflate;
    }

    /* JADX INFO: renamed from: k */
    public void m7819k(List<String> tags) {
        this.f11373q.addAll(tags);
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public String getItem(int position) {
        return this.f11373q.get(position);
    }
}
