package com.android.thememanager.util;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.model.Page;
import com.android.thememanager.model.PageGroup;
import com.android.thememanager.model.RecommendItem;
import com.android.thememanager.model.RecommendItemResolver;
import java.util.ArrayList;
import java.util.List;
import miui.os.Build;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: ThemeDefaultMultipleButtonsBuilder.java */
/* JADX INFO: loaded from: classes2.dex */
public class wo implements InterfaceC1357q, InterfaceC1789q {

    /* JADX INFO: renamed from: k */
    protected Activity f16872k;

    /* JADX INFO: renamed from: n */
    protected com.android.thememanager.controller.online.ld6 f16873n;

    /* JADX INFO: renamed from: q */
    protected com.android.thememanager.fu4 f16874q;

    /* JADX INFO: renamed from: com.android.thememanager.util.wo$k */
    /* JADX INFO: compiled from: ThemeDefaultMultipleButtonsBuilder.java */
    class ViewOnClickListenerC2815k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ RecommendItem f16875k;

        ViewOnClickListenerC2815k(final RecommendItem val$componentItem) {
            this.f16875k = val$componentItem;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            wo.this.f16872k.startActivityForResult(new RecommendItemResolver(this.f16875k, wo.this.f16874q).getForwardIntent(), 1);
        }
    }

    /* JADX INFO: compiled from: ThemeDefaultMultipleButtonsBuilder.java */
    class toq implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ RecommendItem f16877k;

        toq(final RecommendItem val$contentItem) {
            this.f16877k = val$contentItem;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            wo.this.f16872k.startActivityForResult(new RecommendItemResolver(this.f16877k, wo.this.f16874q).getForwardIntent(), 1);
        }
    }

    public wo(Activity activity, com.android.thememanager.fu4 resContext) {
        this.f16872k = activity;
        this.f16874q = resContext;
        this.f16873n = new com.android.thememanager.controller.online.ld6(resContext);
    }

    /* JADX INFO: renamed from: q */
    private List<View> m10062q() {
        ArrayList arrayList = new ArrayList();
        if (C2792m.m9862q()) {
            arrayList.addAll(m10065n());
        }
        arrayList.addAll(toq());
        return arrayList;
    }

    protected PageGroup f7l8() {
        PageGroup pageGroup = new PageGroup();
        pageGroup.setTitle(this.f16872k.getString(R.string.resource_title_hot_subject));
        Page page = new Page();
        page.setTitle(this.f16872k.getString(R.string.resource_title_hot_subject));
        page.setKey(C2792m.m9861k(this.f16874q.getResourceStamp()));
        page.setItemUrl(C2792m.toq(this.f16874q.getResourceStamp()));
        pageGroup.addPage(page);
        return pageGroup;
    }

    /* JADX INFO: renamed from: g */
    protected PageGroup m10063g() {
        PageGroup pageGroup = new PageGroup();
        pageGroup.setTitle(this.f16872k.getString(R.string.resource_ranking));
        if (this.f16874q.isPurchaseSupported()) {
            Page page = new Page();
            page.setTitle(this.f16872k.getString(R.string.resource_ranking_purchase));
            page.setItemUrl(this.f16873n.m7581a());
            page.setKey(this.f16873n.m7586x());
            pageGroup.addPage(page);
        }
        Page page2 = new Page();
        page2.setTitle(this.f16872k.getString(R.string.resource_ranking_free));
        page2.setItemUrl(this.f16873n.lvui());
        page2.setKey(this.f16873n.dd());
        pageGroup.addPage(page2);
        return pageGroup;
    }

    /* JADX INFO: renamed from: k */
    protected PageGroup m10064k() {
        if (!this.f16874q.isCategorySupported()) {
            return null;
        }
        if (Build.IS_TABLET && bwp.ni7(this.f16874q.getResourceCode())) {
            return null;
        }
        PageGroup pageGroup = new PageGroup();
        pageGroup.setTitle(this.f16872k.getString(R.string.resource_category));
        Page page = new Page();
        page.setTitle(this.f16872k.getString(R.string.resource_category));
        page.setKey(this.f16873n.m7583h());
        page.setItemUrl(this.f16873n.kja0());
        pageGroup.addPage(page);
        return pageGroup;
    }

    /* JADX INFO: renamed from: n */
    protected List<View> m10065n() {
        ArrayList arrayList = new ArrayList();
        RecommendItem recommendItem = new RecommendItem();
        recommendItem.setResourceStamp(this.f16874q.getResourceStamp());
        PageGroup pageGroupM10063g = m10063g();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(pageGroupM10063g);
        recommendItem.setPageGroups(arrayList2);
        RecommendItem.RecommendType recommendType = RecommendItem.RecommendType.PAGE;
        recommendItem.setItemType(recommendType);
        recommendItem.setTitle(this.f16872k.getString(R.string.resource_title_rank));
        View viewM10066y = m10066y(R.string.resource_title_rank, R.drawable.resource_multiple_button_rank, recommendItem);
        PageGroup pageGroupM10064k = m10064k();
        RecommendItem recommendItem2 = new RecommendItem();
        recommendItem2.setResourceStamp(this.f16874q.getResourceStamp());
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(pageGroupM10064k);
        recommendItem2.setPageGroups(arrayList3);
        recommendItem2.setItemType(recommendType);
        recommendItem2.setTitle(this.f16872k.getString(R.string.resource_title_category));
        View viewM10066y2 = m10066y(R.string.resource_title_category, R.drawable.resource_multiple_button_clazz, recommendItem2);
        arrayList.add(viewM10066y);
        if (pageGroupM10064k != null) {
            arrayList.add(viewM10066y2);
        }
        if ("theme".equals(this.f16874q.getResourceCode())) {
            RecommendItem recommendItem3 = new RecommendItem();
            recommendItem3.setResourceStamp(this.f16874q.getResourceStamp());
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(f7l8());
            recommendItem3.setPageGroups(arrayList4);
            recommendItem3.setItemType(recommendType);
            recommendItem3.setTitle(this.f16872k.getString(R.string.resource_title_subject));
            arrayList.add(m10066y(R.string.resource_title_subject, R.drawable.resource_multiple_button_subject, recommendItem3));
        }
        return arrayList;
    }

    protected List<View> toq() {
        ArrayList arrayList = new ArrayList();
        RecommendItem recommendItem = new RecommendItem();
        recommendItem.setResourceStamp(this.f16874q.getResourceStamp());
        recommendItem.setItemType(RecommendItem.RecommendType.LOCAL);
        arrayList.add(m10066y(R.string.resource_title_local, R.drawable.resource_multiple_button_local, recommendItem));
        if ("theme".equals(this.f16874q.getResourceCode())) {
            View viewInflate = LayoutInflater.from(this.f16872k).inflate(R.layout.resource_page_item_multiple_button_view_default, (ViewGroup) null);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.multiple_button_icon);
            TextView textView = (TextView) viewInflate.findViewById(R.id.multiple_button_text);
            imageView.setImageResource(R.drawable.resource_multiple_button_customize);
            textView.setText(R.string.theme_multiple_button_title_customize);
            RecommendItem recommendItem2 = new RecommendItem();
            recommendItem2.setItemType(RecommendItem.RecommendType.CUSTOMIZE);
            recommendItem2.setResourceStamp(this.f16874q.getResourceStamp());
            viewInflate.setOnClickListener(new ViewOnClickListenerC2815k(recommendItem2));
            arrayList.add(0, viewInflate);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    protected View m10066y(int titleId, int imageId, final RecommendItem contentItem) {
        View viewInflate = LayoutInflater.from(this.f16872k).inflate(R.layout.resource_page_item_multiple_button_view_default, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.multiple_button_icon);
        ((TextView) viewInflate.findViewById(R.id.multiple_button_text)).setText(titleId);
        imageView.setImageResource(imageId);
        viewInflate.setOnClickListener(new toq(contentItem));
        return viewInflate;
    }

    public View zy() {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f16872k).inflate(R.layout.resource_page_item_multiple_button_container, (ViewGroup) null);
        List<View> listM10062q = m10062q();
        if (listM10062q != null) {
            boolean z2 = true;
            int iKi = ch.ki(this.f16872k, listM10062q.size());
            int iCdj = ch.cdj(this.f16872k);
            for (View view : listM10062q) {
                viewGroup.addView(view);
                if (!z2) {
                    view.setPaddingRelative(iKi, iCdj, 0, 0);
                }
                z2 = false;
            }
        }
        int iFu4 = ch.fu4(this.f16872k);
        int iM9687z = ch.m9687z(this.f16872k);
        if (C2792m.m9862q()) {
            iFu4 += C2792m.zy(this.f16872k);
        }
        viewGroup.setPaddingRelative(iM9687z, iFu4, iM9687z, 0);
        return viewGroup;
    }
}
