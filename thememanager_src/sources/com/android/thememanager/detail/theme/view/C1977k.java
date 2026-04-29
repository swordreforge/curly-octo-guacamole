package com.android.thememanager.detail.theme.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.thememanager.R;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.k */
/* JADX INFO: compiled from: ResourceDetailImmersionAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1977k extends BaseAdapter {

    /* JADX INFO: renamed from: k */
    List<String> f11192k;

    /* JADX INFO: renamed from: q */
    private LayoutInflater f11193q;

    public C1977k(Context context) {
        this.f11192k = Arrays.asList(context.getString(R.string.resource_delete));
        this.f11193q = LayoutInflater.from(context);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f11192k.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int position) {
        return position;
    }

    @Override // android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = this.f11193q.inflate(R.layout.de_detail_popup_menu_item, parent, false);
        }
        ((TextView) convertView.findViewById(R.id.title)).setText(getItem(position));
        return convertView;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public String getItem(int position) {
        return this.f11192k.get(position);
    }
}
