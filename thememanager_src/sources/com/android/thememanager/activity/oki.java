package com.android.thememanager.activity;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.view.ThemePreferenceView;
import java.util.List;

/* JADX INFO: compiled from: ThirdPartyPickersAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class oki extends RecyclerView.AbstractC1060y<toq> {

    /* JADX INFO: renamed from: g */
    Intent f9298g;

    /* JADX INFO: renamed from: k */
    List<ResolveInfo> f9299k;

    /* JADX INFO: renamed from: n */
    PackageManager f9300n;

    /* JADX INFO: renamed from: q */
    boolean f9301q;

    /* JADX INFO: renamed from: s */
    public InterfaceC1619k f9302s;

    /* JADX INFO: renamed from: y */
    private final Activity f9303y;

    /* JADX INFO: renamed from: com.android.thememanager.activity.oki$k */
    /* JADX INFO: compiled from: ThirdPartyPickersAdapter.java */
    public interface InterfaceC1619k {
        /* JADX INFO: renamed from: k */
        void mo6443k(View v2, int position, Intent intent);
    }

    /* JADX INFO: compiled from: ThirdPartyPickersAdapter.java */
    static class toq extends RecyclerView.fti {

        /* JADX INFO: renamed from: k */
        TextView f9304k;

        /* JADX INFO: renamed from: q */
        ImageView f9305q;

        public toq(View itemView) {
            super(itemView);
            ThemePreferenceView themePreferenceView = (ThemePreferenceView) itemView;
            this.f9304k = themePreferenceView.getTitleView();
            this.f9305q = (ImageView) themePreferenceView.getMoreArrow();
        }
    }

    public oki(List<ResolveInfo> resolveList, boolean mIsFromSettings, PackageManager pm, Intent targetIntent, Activity context, InterfaceC1619k thirdPickerItemOnClick) {
        this.f9299k = resolveList;
        this.f9301q = mIsFromSettings;
        this.f9300n = pm;
        this.f9298g = targetIntent;
        this.f9303y = context;
        this.f9302s = thirdPickerItemOnClick;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ki(int i2, Intent intent, View view) {
        this.f9302s.mo6443k(view, i2, intent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: fn3e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@zy.lvui toq holder, final int position) {
        ResolveInfo resolveInfo = this.f9299k.get(position);
        final Intent intent = new Intent(this.f9298g);
        if (this.f9301q) {
            intent.addFlags(16777216);
        } else {
            intent.addFlags(50331648);
        }
        ActivityInfo activityInfo = this.f9299k.get(position).activityInfo;
        intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
        ((ThemePreferenceView) holder.itemView).setIcon(resolveInfo.loadIcon(this.f9300n));
        holder.f9304k.setText(resolveInfo.loadLabel(this.f9300n));
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.activity.gcp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9055k.ki(position, intent, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemCount() {
        return this.f9299k.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @zy.lvui
    /* JADX INFO: renamed from: ni7, reason: merged with bridge method [inline-methods] */
    public toq onCreateViewHolder(ViewGroup parent, int viewType) {
        return new toq(LayoutInflater.from(parent.getContext()).inflate(R.layout.third_party_pickers_item, parent, false));
    }
}
