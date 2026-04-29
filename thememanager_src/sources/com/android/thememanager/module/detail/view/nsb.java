package com.android.thememanager.module.detail.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0924e;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.settings.subsettings.C2615h;
import com.android.thememanager.settings.subsettings.WidgetAdapter;
import com.android.thememanager.view.ResourceEmptyView;
import java.util.ArrayList;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: WidgetListFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public class nsb extends com.android.thememanager.basemodule.base.toq implements c8jq.toq {

    /* JADX INFO: renamed from: c */
    private ViewGroup f13319c;

    /* JADX INFO: renamed from: e */
    private View f13320e;

    /* JADX INFO: renamed from: f */
    private ViewGroup f13321f;

    /* JADX INFO: renamed from: j */
    private String f13322j;

    /* JADX INFO: renamed from: l */
    private com.android.thememanager.settings.subsettings.cdj f13323l;

    /* JADX INFO: renamed from: r */
    private RecyclerView f13324r;

    /* JADX INFO: renamed from: t */
    private WidgetAdapter f13325t;

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.view.nsb$k */
    /* JADX INFO: compiled from: WidgetListFragment.java */
    class C2284k extends GridLayoutManager.zy {
        C2284k() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.zy
        /* JADX INFO: renamed from: g */
        public int mo4760g(int position) {
            C2615h c2615h = nsb.this.f13323l.m9171c().m4388g().get(position);
            if (c2615h == null) {
                return 1;
            }
            return nsb.this.zff0(c2615h.f15464p);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void cyoe(ArrayList arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        el();
        this.f13325t.m9168r(-1, arrayList, false);
    }

    private void el() {
        this.f13320e.setVisibility(8);
        this.f13319c.setVisibility(8);
        this.f13324r.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l05(View view) {
        yp31();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r6ty(Integer num) {
        if (num.equals(com.android.thememanager.settings.subsettings.cdj.f15442h)) {
            qkj8();
        } else if (num.equals(com.android.thememanager.settings.subsettings.cdj.f15443i)) {
            mo5860d();
        }
    }

    private void rp() {
        ResourceEmptyView resourceEmptyView = (ResourceEmptyView) this.f13321f.findViewById(R.id.empty_view);
        this.f13319c = resourceEmptyView;
        resourceEmptyView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.module.detail.view.ebn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13243k.l05(view);
            }
        });
        this.f13320e = this.f13321f.findViewById(R.id.loading);
        this.f13324r = (RecyclerView) this.f13321f.findViewById(R.id.widget_list_recyclerview);
        this.f13325t = new WidgetAdapter(this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        this.f13324r.setLayoutManager(gridLayoutManager);
        gridLayoutManager.fn3e(new C2284k());
        this.f13324r.addItemDecoration(yw());
        this.f13324r.setAdapter(this.f13325t);
        this.f13323l.m9171c().m4391p(getViewLifecycleOwner(), new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.module.detail.view.pc
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f13332k.cyoe((ArrayList) obj);
            }
        });
        this.f13323l.hyr().m4391p(getViewLifecycleOwner(), new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.module.detail.view.ij
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f13268k.r6ty((Integer) obj);
            }
        });
        yp31();
    }

    private RecyclerView.kja0 yw() {
        return new ukdy(getActivity(), 2, (int) getResources().getDimension(R.dimen.widget_2_1_width));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int zff0(int type) {
        return (type == 123 || type == 124) ? 2 : 1;
    }

    @Override // c8jq.toq
    /* JADX INFO: renamed from: d */
    public void mo5860d() {
        this.f13320e.setVisibility(8);
        this.f13319c.setVisibility(0);
        this.f13324r.setVisibility(8);
    }

    @Override // com.android.thememanager.basemodule.base.toq
    public String kx3() {
        return this.f13322j;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@zy.lvui Context context) {
        super.onAttach(context);
        this.f13323l = (com.android.thememanager.settings.subsettings.cdj) new C0924e(this).m4420k(com.android.thememanager.settings.subsettings.cdj.class);
    }

    @Override // androidx.fragment.app.Fragment
    @zy.dd
    public View onCreateView(@zy.lvui LayoutInflater inflater, @zy.dd ViewGroup container, @zy.dd Bundle savedInstanceState) {
        this.f13321f = (ViewGroup) inflater.inflate(R.layout.fragment_widget_detail, container, false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f13322j = arguments.getString("uuid");
        }
        rp();
        return this.f13321f;
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        nnh(true);
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        nnh(false);
    }

    @Override // c8jq.toq
    public void qkj8() {
        this.f13320e.setVisibility(0);
        this.f13319c.setVisibility(8);
        this.f13324r.setVisibility(8);
    }

    public void yp31() {
        com.android.thememanager.settings.subsettings.cdj cdjVar = this.f13323l;
        cdjVar.lrht(this.f13322j, cdjVar);
    }
}
