package com.android.thememanager.comment.view.fragment;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.kja0;
import com.android.thememanager.basemodule.views.ItemOrderLayout;
import com.android.thememanager.comment.model.ResourceCommentGroup;
import com.android.thememanager.comment.model.ResourceCommentTags;
import com.android.thememanager.comment.presenter.C1878k;
import com.android.thememanager.comment.util.C1881q;
import com.android.thememanager.router.detail.entity.ResourceCommentItem;
import i1.C6077k;
import java.util.Calendar;
import java.util.List;
import lv5.InterfaceC6781k;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.comment.view.fragment.p */
/* JADX INFO: compiled from: ResourceCommentItemSetter.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1893p {

    /* JADX INFO: renamed from: com.android.thememanager.comment.view.fragment.p$k */
    /* JADX INFO: compiled from: ResourceCommentItemSetter.java */
    public static class k implements InterfaceC6781k.toq {

        /* JADX INFO: renamed from: a */
        private ResourceCommentGroup f10786a;

        /* JADX INFO: renamed from: b */
        private InterfaceC6781k.k f10787b;

        /* JADX INFO: renamed from: bo, reason: collision with root package name */
        private int f57893bo;

        /* JADX INFO: renamed from: c */
        private TextView f10788c;

        /* JADX INFO: renamed from: e */
        private TextView f10789e;

        /* JADX INFO: renamed from: f */
        private LinearLayout f10790f;

        /* JADX INFO: renamed from: g */
        private View f10791g;

        /* JADX INFO: renamed from: h */
        private ItemOrderLayout f10792h;

        /* JADX INFO: renamed from: i */
        private View f10793i;

        /* JADX INFO: renamed from: j */
        private TextView f10794j;

        /* JADX INFO: renamed from: k */
        private LinearLayout f10795k;

        /* JADX INFO: renamed from: l */
        private View f10796l;

        /* JADX INFO: renamed from: m */
        private x2.C1735g f10797m;

        /* JADX INFO: renamed from: n */
        private TextView f10798n;

        /* JADX INFO: renamed from: o */
        private Context f10799o;

        /* JADX INFO: renamed from: p */
        private RatingBar f10800p;

        /* JADX INFO: renamed from: q */
        private ImageView f10801q;

        /* JADX INFO: renamed from: r */
        private TextView f10802r;

        /* JADX INFO: renamed from: s */
        private TextView f10803s;

        /* JADX INFO: renamed from: t */
        private TextView f10804t;

        /* JADX INFO: renamed from: u */
        private int f10805u;

        /* JADX INFO: renamed from: v */
        private int f10806v;

        /* JADX INFO: renamed from: x */
        private Resource f10807x;

        /* JADX INFO: renamed from: y */
        private ImageView f10808y;

        /* JADX INFO: renamed from: z */
        private TextView f10809z;

        public k(@lvui View view, final Resource resource) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.container);
            this.f10795k = linearLayout;
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.comment.view.fragment.f7l8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f10715k.f7l8(view2);
                }
            });
            this.f10801q = (ImageView) view.findViewById(R.id.avatar);
            this.f10798n = (TextView) view.findViewById(R.id.username);
            View viewFindViewById = view.findViewById(R.id.like_container);
            this.f10791g = viewFindViewById;
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.comment.view.fragment.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f10815k.m7444y(resource, view2);
                }
            });
            this.f10808y = (ImageView) view.findViewById(R.id.like_icon);
            this.f10803s = (TextView) view.findViewById(R.id.like_count);
            this.f10802r = (TextView) view.findViewById(R.id.content);
            this.f10800p = (RatingBar) view.findViewById(R.id.ratingbar);
            this.f10792h = (ItemOrderLayout) view.findViewById(R.id.tags);
            this.f10798n = (TextView) view.findViewById(R.id.username);
            this.f10804t = (TextView) view.findViewById(R.id.date);
            this.f10793i = view.findViewById(R.id.version_container);
            this.f10796l = view.findViewById(R.id.star_version_divider);
            this.f10809z = (TextView) view.findViewById(R.id.version);
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.sub_container);
            this.f10790f = linearLayout2;
            linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.comment.view.fragment.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f10812k.m7443s(view2);
                }
            });
            this.f10789e = (TextView) view.findViewById(R.id.first_sub_comment);
            this.f10794j = (TextView) view.findViewById(R.id.second_sub_comment);
            this.f10788c = (TextView) view.findViewById(R.id.more_sub_comment);
            ImageView imageView = (ImageView) view.findViewById(R.id.reply_icon);
            this.f10799o = view.getContext();
            this.f10797m = com.android.thememanager.basemodule.imageloader.x2.fn3e().gvn7(R.drawable.avatar_default).o1t(R.color.user_info_avatar_border_color);
            this.f10807x = resource;
            this.f10805u = this.f10799o.getResources().getColor(R.color.comment_tag_select_color);
            this.f57893bo = this.f10799o.getResources().getColor(R.color.resource_comment_tertiary_text_color);
            this.f10806v = this.f10799o.getResources().getColor(R.color.sub_comment_user_name_color);
            C6077k.m22374s(this.f10791g, imageView);
            C6077k.n7h(this.f10795k);
            C6077k.ni7(this.f10790f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f7l8(View view) {
            this.f10787b.mo7415q(this.f10786a.main);
        }

        /* JADX INFO: renamed from: n */
        private SpannableStringBuilder m7440n(Context context, @lvui ResourceCommentItem subComment, @lvui ResourceCommentItem main) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C1881q.zy(context, subComment.userName));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f10806v), 0, spannableStringBuilder.length(), 33);
            int i2 = subComment.isAuthor.booleanValue() ? R.drawable.comment_id_designer : subComment.isOfficial.booleanValue() ? R.drawable.comment_id_official : -1;
            if (i2 != -1) {
                spannableStringBuilder.append((CharSequence) " i ");
                spannableStringBuilder.setSpan(new com.android.thememanager.comment.view.widget.toq(context, i2), spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 17);
            }
            if (!subComment.toCommentId.equals(main.commentId)) {
                spannableStringBuilder.append((CharSequence) C1881q.m7423q(context));
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) C1881q.zy(context, subComment.toUserName));
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f10806v), length, spannableStringBuilder.length(), 33);
            }
            spannableStringBuilder.append((CharSequence) C1881q.toq()).append((CharSequence) subComment.content);
            return spannableStringBuilder;
        }

        /* JADX INFO: renamed from: p */
        private void m7441p(@lvui ResourceCommentGroup commentGroup) {
            ResourceCommentItem resourceCommentItem = commentGroup.main;
            List<ResourceCommentItem> list = commentGroup.subList;
            if (list == null || list.size() == 0) {
                this.f10790f.setVisibility(8);
                return;
            }
            this.f10790f.setVisibility(0);
            if (list.size() == 1) {
                this.f10789e.setVisibility(0);
                this.f10789e.setText(m7440n(this.f10799o, list.get(0), resourceCommentItem));
                this.f10794j.setVisibility(8);
                this.f10788c.setVisibility(8);
                return;
            }
            if (list.size() == 2) {
                this.f10789e.setVisibility(0);
                this.f10789e.setText(m7440n(this.f10799o, list.get(0), resourceCommentItem));
                this.f10794j.setVisibility(0);
                this.f10794j.setText(m7440n(this.f10799o, list.get(1), resourceCommentItem));
                this.f10788c.setVisibility(8);
                return;
            }
            this.f10789e.setVisibility(0);
            this.f10789e.setText(m7440n(this.f10799o, list.get(0), resourceCommentItem));
            this.f10794j.setVisibility(0);
            this.f10794j.setText(m7440n(this.f10799o, list.get(1), resourceCommentItem));
            this.f10788c.setVisibility(0);
            this.f10788c.setText(this.f10799o.getString(R.string.more_sub_comment, Integer.valueOf(list.size())));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: s */
        public /* synthetic */ void m7443s(View view) {
            this.f10787b.toq(this.f10786a, this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: y */
        public /* synthetic */ void m7444y(Resource resource, View view) {
            this.f10787b.mo7414k(this.f10786a.main, resource);
        }

        @Override // lv5.InterfaceC6781k.toq
        /* JADX INFO: renamed from: g */
        public void mo7434g(@lvui ResourceCommentGroup commentGroup) {
            this.f10786a = commentGroup;
            ResourceCommentItem resourceCommentItem = commentGroup.main;
            if (this.f10799o instanceof Activity) {
                boolean z2 = this.f10801q.getTag() != null && this.f10801q.getTag().equals(resourceCommentItem.userIcon);
                this.f10801q.setTag(resourceCommentItem.userIcon);
                if (!z2) {
                    com.android.thememanager.basemodule.imageloader.x2.m6782y((Activity) this.f10799o, resourceCommentItem.userIcon, this.f10801q, this.f10797m);
                }
            }
            if (TextUtils.isEmpty(resourceCommentItem.content)) {
                this.f10802r.setVisibility(8);
            } else {
                this.f10802r.setVisibility(0);
                this.f10802r.setText(resourceCommentItem.content);
            }
            this.f10800p.setRating(resourceCommentItem.score);
            if (kja0.qrj(resourceCommentItem.tags)) {
                this.f10792h.setVisibility(8);
            } else {
                this.f10792h.setVisibility(0);
                this.f10792h.toq(ResourceCommentTags.generateCommentTags(resourceCommentItem.tags));
            }
            this.f10798n.setText(C1881q.zy(this.f10799o, resourceCommentItem.userName));
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(resourceCommentItem.updateTime);
            this.f10804t.setText(this.f10799o.getString(R.string.resource_comment_date, Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5))));
            String string = resourceCommentItem.miuiVersion;
            Resource resource = this.f10807x;
            if (resource != null && TextUtils.equals(string, resource.getOnlineInfo().getVersion())) {
                string = this.f10799o.getString(R.string.resource_comment_current_version);
            }
            if (TextUtils.isEmpty(string)) {
                this.f10793i.setVisibility(8);
                this.f10796l.setVisibility(8);
            } else {
                this.f10809z.setText(string);
                this.f10793i.setVisibility(0);
                this.f10796l.setVisibility(0);
            }
            toq(resourceCommentItem.like.booleanValue(), resourceCommentItem.likeCount.intValue());
            m7441p(commentGroup);
        }

        @Override // lv5.InterfaceC6781k.toq
        /* JADX INFO: renamed from: h */
        public void mo7436h(@lvui InterfaceC6781k.k presenter) {
            this.f10787b = presenter;
        }

        @Override // lv5.InterfaceC6781k.toq
        public void toq(boolean isLike, int likeCount) {
            this.f10808y.setSelected(isLike);
            this.f10803s.setText(com.android.thememanager.basemodule.utils.x2.zy(likeCount));
            this.f10803s.setTextColor(isLike ? this.f10805u : this.f57893bo);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m7438k(View view, ResourceCommentGroup commentGroup, Resource resource, InterfaceC6781k.k.InterfaceC8092k listener) {
        k kVar;
        if (view.getTag() instanceof k) {
            kVar = (k) view.getTag();
        } else {
            k kVar2 = new k(view, resource);
            C1878k c1878k = new C1878k(kVar2);
            c1878k.zy(listener);
            kVar2.mo7436h(c1878k);
            view.setTag(kVar2);
            kVar = kVar2;
        }
        kVar.mo7434g(commentGroup);
    }
}
