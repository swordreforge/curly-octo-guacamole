package com.android.thememanager.comment.view.fragment;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
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

/* JADX INFO: renamed from: com.android.thememanager.comment.view.fragment.k */
/* JADX INFO: compiled from: CommentDetailAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1889k extends RecyclerView.AbstractC1060y<RecyclerView.fti> {

    /* JADX INFO: renamed from: g */
    private static final int f10731g = 0;

    /* JADX INFO: renamed from: p */
    private static final int f10732p = 3;

    /* JADX INFO: renamed from: s */
    private static final int f10733s = 2;

    /* JADX INFO: renamed from: y */
    private static final int f10734y = 1;

    /* JADX INFO: renamed from: k */
    private List<ResourceCommentGroup> f10735k;

    /* JADX INFO: renamed from: n */
    private InterfaceC6781k.k.InterfaceC8092k f10736n;

    /* JADX INFO: renamed from: q */
    private Resource f10737q;

    /* JADX INFO: renamed from: com.android.thememanager.comment.view.fragment.k$k */
    /* JADX INFO: compiled from: CommentDetailAdapter.java */
    class k extends RecyclerView.fti {
        k(View itemView) {
            super(itemView);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.comment.view.fragment.k$q */
    /* JADX INFO: compiled from: CommentDetailAdapter.java */
    private static class q extends zy {
        public q(@lvui View view, Resource resource, ResourceCommentItem main) {
            super(view, resource, main);
        }

        @Override // com.android.thememanager.comment.view.fragment.C1889k.zy, lv5.InterfaceC6781k.toq
        /* JADX INFO: renamed from: g */
        public void mo7434g(@lvui ResourceCommentGroup commentGroup) {
            super.mo7434g(commentGroup);
            this.f10751n.getLayoutParams().width = -2;
            this.f10745h.setVisibility(0);
            this.f10754q.setVisibility(0);
            this.f10746i.setPadding(0, 0, 0, 0);
            this.f10756s.setVisibility(0);
            if (this.f10745h.getVisibility() == 0 && this.f10761y.getVisibility() == 0) {
                this.f10744g.setVisibility(0);
            } else {
                this.f10744g.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.comment.view.fragment.k$toq */
    /* JADX INFO: compiled from: CommentDetailAdapter.java */
    private static class toq extends zy {
        public toq(@lvui View view, Resource resource, ResourceCommentItem main) {
            super(view, resource, main);
        }

        @Override // com.android.thememanager.comment.view.fragment.C1889k.zy, lv5.InterfaceC6781k.toq
        /* JADX INFO: renamed from: g */
        public void mo7434g(@lvui ResourceCommentGroup commentGroup) {
            super.mo7434g(commentGroup);
            this.f10753p.setText(this.f10748k.getString(R.string.theme_comment_detail_sub_comment_title));
            this.f10753p.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.comment.view.fragment.k$zy */
    /* JADX INFO: compiled from: CommentDetailAdapter.java */
    static class zy extends RecyclerView.fti implements InterfaceC6781k.toq {

        /* JADX INFO: renamed from: a */
        private Resource f10739a;

        /* JADX INFO: renamed from: b */
        private ResourceCommentGroup f10740b;

        /* JADX INFO: renamed from: bo, reason: collision with root package name */
        private int f57889bo;

        /* JADX INFO: renamed from: c */
        private TextView f10741c;

        /* JADX INFO: renamed from: e */
        private TextView f10742e;

        /* JADX INFO: renamed from: f */
        private ItemOrderLayout f10743f;

        /* JADX INFO: renamed from: g */
        protected View f10744g;

        /* JADX INFO: renamed from: h */
        protected RatingBar f10745h;

        /* JADX INFO: renamed from: i */
        protected LinearLayout f10746i;

        /* JADX INFO: renamed from: j */
        private TextView f10747j;

        /* JADX INFO: renamed from: k */
        protected Context f10748k;

        /* JADX INFO: renamed from: l */
        private TextView f10749l;

        /* JADX INFO: renamed from: m */
        private InterfaceC6781k.k f10750m;

        /* JADX INFO: renamed from: n */
        protected ImageView f10751n;

        /* JADX INFO: renamed from: o */
        private x2.C1735g f10752o;

        /* JADX INFO: renamed from: p */
        protected TextView f10753p;

        /* JADX INFO: renamed from: q */
        protected View f10754q;

        /* JADX INFO: renamed from: r */
        private ImageView f10755r;

        /* JADX INFO: renamed from: s */
        protected View f10756s;

        /* JADX INFO: renamed from: t */
        private TextView f10757t;

        /* JADX INFO: renamed from: u */
        private int f10758u;

        /* JADX INFO: renamed from: v */
        private int f10759v;

        /* JADX INFO: renamed from: x */
        private ResourceCommentItem f10760x;

        /* JADX INFO: renamed from: y */
        protected View f10761y;

        /* JADX INFO: renamed from: z */
        private ImageView f10762z;

        public zy(@lvui View view, final Resource resource, ResourceCommentItem main) {
            super(view);
            this.f10748k = view.getContext();
            this.f10760x = main;
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.container);
            this.f10746i = linearLayout;
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.comment.view.fragment.toq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f10813k.fu4(view2);
                }
            });
            this.f10762z = (ImageView) view.findViewById(R.id.avatar);
            this.f10757t = (TextView) view.findViewById(R.id.username);
            ImageView imageView = (ImageView) view.findViewById(R.id.like_icon);
            this.f10755r = imageView;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.comment.view.fragment.zy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f10817k.m7435z(resource, view2);
                }
            });
            this.f10749l = (TextView) view.findViewById(R.id.like_count);
            ImageView imageView2 = (ImageView) view.findViewById(R.id.reply_icon);
            this.f10751n = imageView2;
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.comment.view.fragment.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f10810k.o1t(view2);
                }
            });
            this.f10747j = (TextView) view.findViewById(R.id.content);
            this.f10745h = (RatingBar) view.findViewById(R.id.ratingbar);
            this.f10743f = (ItemOrderLayout) view.findViewById(R.id.tags);
            this.f10757t = (TextView) view.findViewById(R.id.username);
            this.f10742e = (TextView) view.findViewById(R.id.date);
            this.f10741c = (TextView) view.findViewById(R.id.version);
            this.f10756s = view.findViewById(R.id.divider);
            this.f10753p = (TextView) view.findViewById(R.id.title);
            this.f10761y = view.findViewById(R.id.version_container);
            this.f10744g = view.findViewById(R.id.star_version_divider);
            this.f10754q = view.findViewById(R.id.like_container);
            this.f10752o = com.android.thememanager.basemodule.imageloader.x2.fn3e().gvn7(R.drawable.avatar_default).o1t(R.color.user_info_avatar_border_color);
            Context context = this.f10748k;
            if (context instanceof Activity) {
                this.f10743f.setItemFactory(new com.android.thememanager.comment.util.toq((Activity) context, false));
                this.f10743f.setGap(this.f10748k.getResources().getDimensionPixelSize(R.dimen.de_hot_recommend_text_gap));
            }
            this.f10739a = resource;
            this.f10758u = this.f10748k.getResources().getColor(R.color.comment_tag_select_color);
            this.f57889bo = this.f10748k.getResources().getColor(R.color.resource_comment_tertiary_text_color);
            this.f10759v = this.f10748k.getResources().getColor(R.color.sub_comment_user_name_color);
            C6077k.ld6(this.f10746i);
            C6077k.m22374s(this.f10755r, this.f10751n);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void fu4(View view) {
            this.f10750m.mo7415q(this.f10740b.main);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o1t(View view) {
            this.f10750m.mo7415q(this.f10740b.main);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: z */
        public /* synthetic */ void m7435z(Resource resource, View view) {
            this.f10750m.mo7414k(this.f10740b.main, resource);
        }

        /* JADX INFO: renamed from: g */
        public void mo7434g(@lvui ResourceCommentGroup commentGroup) {
            this.f10740b = commentGroup;
            ResourceCommentItem resourceCommentItem = commentGroup.main;
            Context context = this.f10748k;
            if (context instanceof Activity) {
                com.bumptech.glide.zy.a9(context).mo6748i(resourceCommentItem.userIcon).ixz(this.f10762z);
                com.android.thememanager.basemodule.imageloader.x2.m6782y((Activity) this.f10748k, resourceCommentItem.userIcon, this.f10762z, this.f10752o);
            }
            if (TextUtils.isEmpty(resourceCommentItem.content)) {
                this.f10747j.setVisibility(8);
            } else {
                this.f10747j.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (!resourceCommentItem.toUserKey.equals(this.f10760x.userKey) && resourceCommentItem.toUserKey.longValue() > 0) {
                    spannableStringBuilder.append((CharSequence) C1881q.m7423q(this.f10748k));
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) (TextUtils.isEmpty(resourceCommentItem.toUserName) ? this.f10748k.getString(R.string.resource_comment_name_default) : resourceCommentItem.toUserName));
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f10759v), length, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.append((CharSequence) C1881q.toq());
                }
                spannableStringBuilder.append((CharSequence) resourceCommentItem.content);
                this.f10747j.setText(spannableStringBuilder);
            }
            this.f10745h.setRating(resourceCommentItem.score);
            if (kja0.qrj(resourceCommentItem.tags)) {
                this.f10743f.setVisibility(8);
            } else {
                this.f10743f.setVisibility(0);
                this.f10743f.toq(ResourceCommentTags.generateCommentTags(resourceCommentItem.tags));
            }
            this.f10757t.setText(TextUtils.isEmpty(resourceCommentItem.userName) ? this.f10748k.getString(R.string.resource_comment_name_default) : resourceCommentItem.userName);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(resourceCommentItem.updateTime);
            this.f10742e.setText(this.f10748k.getString(R.string.resource_comment_date, Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5))));
            String string = resourceCommentItem.miuiVersion;
            if (TextUtils.equals(string, this.f10739a.getOnlineInfo().getVersion())) {
                string = this.f10748k.getString(R.string.resource_comment_current_version);
            }
            if (TextUtils.isEmpty(string)) {
                this.f10761y.setVisibility(8);
            } else {
                this.f10741c.setText(string);
                this.f10761y.setVisibility(0);
            }
            toq(resourceCommentItem.like.booleanValue(), resourceCommentItem.likeCount.intValue());
            this.f10751n.getLayoutParams().width = 0;
            this.f10756s.setVisibility(8);
            this.f10753p.setVisibility(8);
            this.f10745h.setVisibility(8);
            this.f10754q.setVisibility(8);
            this.f10744g.setVisibility(8);
            this.f10746i.setPadding(0, 0, 0, kja0.m7111p().getDimensionPixelSize(R.dimen.de_comment_list_padding_bottom));
        }

        @Override // lv5.InterfaceC6781k.toq
        /* JADX INFO: renamed from: h */
        public void mo7436h(@lvui InterfaceC6781k.k presenter) {
            this.f10750m = presenter;
        }

        @Override // lv5.InterfaceC6781k.toq
        public void toq(boolean isLike, int likeCount) {
            this.f10755r.setSelected(isLike);
            this.f10749l.setText(com.android.thememanager.basemodule.utils.x2.zy(likeCount));
            this.f10749l.setTextColor(isLike ? this.f10758u : this.f57889bo);
        }
    }

    public C1889k(@lvui List<ResourceCommentGroup> comments, Resource resource, InterfaceC6781k.k.InterfaceC8092k listener) {
        this.f10735k = comments;
        this.f10737q = resource;
        this.f10736n = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemCount() {
        List<ResourceCommentGroup> list = this.f10735k;
        if (list == null) {
            return 0;
        }
        return list.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemViewType(int position) {
        if (position == 0) {
            return 1;
        }
        if (position != 1) {
            return position == this.f10735k.size() ? 3 : 0;
        }
        return 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void onBindViewHolder(@lvui RecyclerView.fti holder, int i2) {
        if (holder instanceof zy) {
            ((zy) holder).mo7434g(this.f10735k.get(i2));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @lvui
    public RecyclerView.fti onCreateViewHolder(@lvui ViewGroup viewGroup, int i2) {
        if (i2 == 3) {
            return new k(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.comment_detail_no_more, viewGroup, false));
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.resource_comment_list_item, viewGroup, false);
        zy zyVar = i2 != 1 ? i2 != 2 ? new zy(viewInflate, this.f10737q, this.f10735k.get(0).main) : new toq(viewInflate, this.f10737q, this.f10735k.get(0).main) : new q(viewInflate, this.f10737q, this.f10735k.get(0).main);
        InterfaceC6781k.k c1878k = new C1878k(zyVar);
        c1878k.zy(this.f10736n);
        zyVar.mo7436h(c1878k);
        return zyVar;
    }
}
