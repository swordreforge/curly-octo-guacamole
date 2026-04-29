package com.android.thememanager.recommend.view.listview.viewholder;

import android.os.Looper;
import android.os.MessageQueue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.ActivityC0891q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.scorewall.C1797k;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.recommend.model.entity.element.IconGroupsElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.C2452q;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIIcon;
import com.android.thememanager.router.recommend.entity.UILink;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementIconGroupsViewHolder extends BaseViewHolder<IconGroupsElement> implements com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: g */
    private LinearLayout f13917g;

    /* JADX INFO: renamed from: y */
    private LayoutInflater f13918y;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.ElementIconGroupsViewHolder$k */
    class C2387k implements MessageQueue.IdleHandler {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ IconGroupsElement f13919k;

        /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.ElementIconGroupsViewHolder$k$k */
        class k implements View.OnClickListener {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ ActivityC0891q f13921k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ UIIcon f13923q;

            k(final ActivityC0891q val$activity, final UIIcon val$icon) {
                this.f13921k = val$activity;
                this.f13923q = val$icon;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View v2) {
                C2451n.m8802s(this.f13921k, ElementIconGroupsViewHolder.this.ni7(), this.f13923q.link, ElementIconGroupsViewHolder.this.wvg());
                if (this.f13923q.link != null) {
                    ElementIconGroupsViewHolder.this.m6706z().d8wk(this.f13923q.link.trackId, null);
                    if (C1797k.m6981q(this.f13923q.link.link)) {
                        C1708s.f7l8().ld6().n5r1(com.android.thememanager.basemodule.analysis.toq.cjaj, C1706p.m6653p(com.android.thememanager.basemodule.analysis.toq.i8gn, com.android.thememanager.basemodule.analysis.toq.f7));
                    }
                }
            }
        }

        C2387k(final IconGroupsElement val$item) {
            this.f13919k = val$item;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            ElementIconGroupsViewHolder.this.f13917g.removeAllViews();
            if (this.f13919k.getIconGroups() != null && this.f13919k.getIconGroups().size() > 0) {
                ElementIconGroupsViewHolder.this.f13917g.setWeightSum(this.f13919k.getIconGroups().size());
                ActivityC0891q activityC0891qKi = ElementIconGroupsViewHolder.this.ki();
                for (int i2 = 0; i2 < this.f13919k.getIconGroups().size(); i2++) {
                    UIIcon uIIcon = this.f13919k.getIconGroups().get(i2).get(0);
                    View viewInflate = ElementIconGroupsViewHolder.this.f13918y.inflate(R.layout.rc_recommend_item_layout, (ViewGroup) ElementIconGroupsViewHolder.this.f13917g, false);
                    com.android.thememanager.basemodule.imageloader.x2.m6782y(ElementIconGroupsViewHolder.this.ki(), uIIcon.getImageUrl(activityC0891qKi), (ImageView) viewInflate.findViewById(R.id.image), com.android.thememanager.basemodule.imageloader.x2.fn3e().gvn7(R.drawable.recommend_default).a9(false));
                    ElementIconGroupsViewHolder.this.f13917g.addView(viewInflate, layoutParams);
                    C6077k.f7l8(viewInflate);
                    viewInflate.setOnClickListener(new k(activityC0891qKi, uIIcon));
                    C1812k.toq(viewInflate, uIIcon.link.title);
                    if (i2 == 1 && "小部件".equals(uIIcon.link.title)) {
                        C2452q.f7l8(activityC0891qKi, viewInflate);
                    }
                }
            }
            return false;
        }
    }

    public ElementIconGroupsViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f13917g = (LinearLayout) itemView.findViewById(R.id.recommend_options_container);
        this.f13918y = LayoutInflater.from(itemView.getContext());
        x9kr();
    }

    /* JADX INFO: renamed from: f */
    public static ElementIconGroupsViewHolder m8619f(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementIconGroupsViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_icon_group, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void o1t(IconGroupsElement item, int position) {
        super.o1t(item, position);
        Looper.myQueue().addIdleHandler(new C2387k(item));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        if (((IconGroupsElement) this.f9849q).getIconGroups() != null) {
            for (int i2 = 0; i2 < ((IconGroupsElement) this.f9849q).getIconGroups().size(); i2++) {
                UILink uILink = ((IconGroupsElement) this.f9849q).getIconGroups().get(i2).get(0).link;
                if (uILink != null) {
                    arrayList.add(uILink.trackId);
                }
            }
        }
        return arrayList;
    }
}
