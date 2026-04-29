package com.android.thememanager.detail.theme.view.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c8jq.InterfaceC1392k;
import com.android.thememanager.R;
import com.android.thememanager.activity.ThemeTabActivity;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.basemodule.views.x2;
import com.android.thememanager.controller.online.t8r;
import com.android.thememanager.detail.video.view.widget.RewardSuccessMamlView;
import com.android.thememanager.router.detail.entity.RewardData;
import com.android.thememanager.router.detail.entity.UserBounty;
import com.android.thememanager.util.C2755a;
import com.android.thememanager.util.dd;
import com.miui.maml.component.MamlView;
import com.xiaomi.mipush.sdk.C5658n;
import i1.C6077k;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import miuix.springback.view.SpringBackLayout;
import vy.C7718q;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class RewardDialog extends FrameLayout implements View.OnClickListener, com.android.thememanager.controller.online.n7h {
    private static final int ac = 100;
    private static final int ad = 20;
    private static final int aj = 3;
    private static final int am = 400;
    private static final String as = "rewardgoldrebound";
    private static final String ax = "rotation";
    private static final int ay = 400;
    private static final String az = "translationY";
    private static final String ba = "alpha";
    private static final int be = 100;
    private static final String bg = "rewardgoldrebounddarkmode";
    private static final String bl = "RewardDialog";
    private static final int bq = 8;
    private static final int bs = 2;

    /* JADX INFO: renamed from: a */
    private com.android.thememanager.basemodule.views.x2 f11272a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private long[] f58022ab;
    private boolean an;

    /* JADX INFO: renamed from: b */
    private RewardAvatarContainer f11273b;
    private int bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private String f58023bo;
    private int bp;
    private int bv;

    /* JADX INFO: renamed from: c */
    private ProgressBar f11274c;

    /* JADX INFO: renamed from: d */
    private String f11275d;

    /* JADX INFO: renamed from: e */
    private Button f11276e;

    /* JADX INFO: renamed from: f */
    private TextView f11277f;

    /* JADX INFO: renamed from: g */
    private LinearLayout f11278g;

    /* JADX INFO: renamed from: h */
    private TextView f11279h;

    /* JADX INFO: renamed from: i */
    private TextView f11280i;
    private boolean id;
    private String in;

    /* JADX INFO: renamed from: j */
    private ImageView f11281j;

    /* JADX INFO: renamed from: k */
    private View f11282k;

    /* JADX INFO: renamed from: l */
    private TextView f11283l;

    /* JADX INFO: renamed from: m */
    private ImageView f11284m;

    /* JADX INFO: renamed from: n */
    private LinearLayout f11285n;

    /* JADX INFO: renamed from: o */
    private ImageView f11286o;

    /* JADX INFO: renamed from: p */
    private EditText f11287p;

    /* JADX INFO: renamed from: q */
    private FrameLayout f11288q;

    /* JADX INFO: renamed from: r */
    private TextView f11289r;

    /* JADX INFO: renamed from: s */
    private RecyclerView f11290s;

    /* JADX INFO: renamed from: t */
    private TextView f11291t;

    /* JADX INFO: renamed from: u */
    private MamlView f11292u;

    /* JADX INFO: renamed from: v */
    private String f11293v;

    /* JADX INFO: renamed from: w */
    private InterfaceC1392k.toq f11294w;

    /* JADX INFO: renamed from: x */
    private C1985h f11295x;

    /* JADX INFO: renamed from: y */
    private FrameLayout f11296y;

    /* JADX INFO: renamed from: z */
    private TextView f11297z;

    class f7l8 implements View.OnClickListener {
        f7l8() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            RewardDialog.this.f11280i.setVisibility(8);
            RewardDialog.this.f11281j.setVisibility(8);
            RewardDialog.this.f11297z.setVisibility(4);
            RewardDialog.this.f11287p.setVisibility(0);
            RewardDialog.this.f11287p.requestFocus();
            RewardDialog.this.m7792o();
            RewardDialog.this.f11286o.setVisibility(0);
            if (RewardDialog.this.f11287p.getText().length() <= 0 || Double.parseDouble(RewardDialog.this.f11287p.getText().toString()) <= 0.0d) {
                RewardDialog.this.f11276e.setEnabled(false);
            } else {
                RewardDialog.this.f11276e.setEnabled(true);
            }
            RewardDialog.this.f11284m.setPaddingRelative(RewardDialog.this.bv, 0, 0, 0);
            C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.p1t5));
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.widget.RewardDialog$g */
    class RunnableC1984g implements Runnable {
        RunnableC1984g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardDialog.this.f11285n.addView(RewardDialog.this.f11292u, 0);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.widget.RewardDialog$h */
    private class C1985h extends RecyclerView.AbstractC1060y<RecyclerView.fti> {

        /* JADX INFO: renamed from: c */
        public static final int f11300c = 2;

        /* JADX INFO: renamed from: f */
        public static final int f11301f = 1;

        /* JADX INFO: renamed from: h */
        private int f11303h;

        /* JADX INFO: renamed from: i */
        private int f11304i;

        /* JADX INFO: renamed from: k */
        private List<UserBounty> f11305k;

        /* JADX INFO: renamed from: n */
        private boolean f11307n;

        /* JADX INFO: renamed from: p */
        private int f11308p;

        /* JADX INFO: renamed from: q */
        private UserBounty f11309q;

        /* JADX INFO: renamed from: s */
        private Drawable f11311s;

        /* JADX INFO: renamed from: t */
        private int f11312t;

        /* JADX INFO: renamed from: y */
        private Drawable f11313y;

        /* JADX INFO: renamed from: z */
        private int f11314z;

        /* JADX INFO: renamed from: r */
        private Map<Integer, Integer> f11310r = new k();

        /* JADX INFO: renamed from: g */
        private boolean f11302g = fn3e();

        /* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.widget.RewardDialog$h$k */
        class k extends HashMap<Integer, Integer> {
            k() {
                put(1, Integer.valueOf(R.drawable.de_reward_rank_one));
                put(2, Integer.valueOf(R.drawable.de_reward_rank_two));
                put(3, Integer.valueOf(R.drawable.de_reward_rank_three));
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.widget.RewardDialog$h$toq */
        private class toq extends RecyclerView.fti {

            /* JADX INFO: renamed from: k */
            private View f11315k;

            /* JADX INFO: renamed from: q */
            private TextView f11317q;

            /* synthetic */ toq(C1985h c1985h, View view, RunnableC1984g runnableC1984g) {
                this(view);
            }

            private toq(@lvui View itemView) {
                super(itemView);
                this.f11315k = itemView.findViewById(R.id.reward_rank_list_footer_placeholder);
                this.f11317q = (TextView) itemView.findViewById(R.id.reward_rank_list_footer_alert);
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.widget.RewardDialog$h$zy */
        private class zy extends RecyclerView.fti {

            /* JADX INFO: renamed from: g */
            private TextView f11318g;

            /* JADX INFO: renamed from: k */
            private ImageView f11319k;

            /* JADX INFO: renamed from: n */
            private TextView f11320n;

            /* JADX INFO: renamed from: q */
            private ImageView f11321q;

            /* JADX INFO: renamed from: y */
            private TextView f11323y;

            /* synthetic */ zy(C1985h c1985h, View view, RunnableC1984g runnableC1984g) {
                this(view);
            }

            private zy(@lvui View itemView) {
                super(itemView);
                this.f11319k = (ImageView) itemView.findViewById(R.id.reward_rank_list_rank);
                this.f11320n = (TextView) itemView.findViewById(R.id.reward_rank_list_order);
                this.f11321q = (ImageView) itemView.findViewById(R.id.reward_rank_list_portrait);
                this.f11318g = (TextView) itemView.findViewById(R.id.reward_rank_list_user_name);
                this.f11323y = (TextView) itemView.findViewById(R.id.reward_rank_list_reward_amount);
            }
        }

        public C1985h(List<UserBounty> bountyList, UserBounty currentRewardUserBounty) {
            this.f11305k = bountyList;
            this.f11309q = currentRewardUserBounty;
            this.f11313y = RewardDialog.this.getResources().getDrawable(R.drawable.de_rank_list_money_icon_select);
            this.f11311s = RewardDialog.this.getResources().getDrawable(R.drawable.de_rank_list_money_icon_unselect);
            Drawable drawable = this.f11313y;
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f11313y.getIntrinsicHeight());
            Drawable drawable2 = this.f11311s;
            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.f11311s.getIntrinsicHeight());
            this.f11308p = RewardDialog.this.getResources().getColor(R.color.de_detail_reward_rank_list_head_itemview_color);
            this.f11303h = RewardDialog.this.getResources().getColor(R.color.de_detail_reward_rank_list_item_bg);
            this.f11304i = RewardDialog.this.getResources().getColor(R.color.de_detail_reward_rank_list_head_color);
            this.f11314z = RewardDialog.this.getResources().getColor(R.color.de_detail_reward_rank_list_user_name_color);
            this.f11312t = RewardDialog.this.getResources().getColor(R.color.de_detail_reward_rank_list_order_color);
        }

        private boolean fn3e() {
            UserBounty userBounty = this.f11309q;
            return userBounty != null && userBounty.rank >= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ni7(boolean hasFooterView) {
            this.f11307n = hasFooterView;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        public int getItemCount() {
            return this.f11302g ? this.f11305k.size() + (this.f11307n ? 1 : 0) + 1 : this.f11305k.size() + (this.f11307n ? 1 : 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        public int getItemViewType(int position) {
            return (position == getItemCount() - 1 && this.f11307n) ? 2 : 1;
        }

        public void ki(List<UserBounty> bountyList) {
            List<UserBounty> list = this.f11305k;
            if (list == null || bountyList == null) {
                return;
            }
            list.addAll(bountyList);
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        public void onBindViewHolder(@lvui RecyclerView.fti holder, int position) {
            String strZy;
            if (getItemViewType(position) != 1) {
                if (getItemViewType(position) == 2) {
                    toq toqVar = (toq) holder;
                    if (getItemCount() < 9) {
                        toqVar.f11317q.setVisibility(8);
                        toqVar.f11315k.setVisibility(0);
                        return;
                    } else {
                        toqVar.f11317q.setVisibility(0);
                        toqVar.f11315k.setVisibility(8);
                        return;
                    }
                }
                return;
            }
            if (holder instanceof zy) {
                zy zyVar = (zy) holder;
                UserBounty userBounty = this.f11302g ? position == 0 ? this.f11309q : this.f11305k.get(position - 1) : this.f11305k.get(position);
                int i2 = userBounty.rank;
                if (i2 > 0 && i2 < 4) {
                    zyVar.f11319k.setVisibility(0);
                    zyVar.f11319k.setBackgroundResource(this.f11310r.get(Integer.valueOf(i2)).intValue());
                    zyVar.f11320n.setVisibility(8);
                } else if (i2 >= 4) {
                    zyVar.f11319k.setVisibility(8);
                    zyVar.f11320n.setVisibility(0);
                    zyVar.f11320n.setText(i2 + "");
                } else {
                    zyVar.f11319k.setVisibility(8);
                    zyVar.f11320n.setVisibility(0);
                    zyVar.f11320n.setText(C5658n.f73185t8r);
                }
                UserBounty userBounty2 = this.f11309q;
                if (userBounty2 == null || !TextUtils.equals(userBounty2.userId, userBounty.userId)) {
                    zyVar.itemView.setBackgroundColor(this.f11303h);
                    zyVar.f11318g.setTextColor(this.f11314z);
                    zyVar.f11323y.setTextColor(this.f11314z);
                    zyVar.f11323y.setCompoundDrawablesRelative(this.f11311s, null, null, null);
                    zyVar.f11320n.setTextColor(this.f11312t);
                } else {
                    zyVar.itemView.setBackgroundColor(this.f11308p);
                    zyVar.f11318g.setTextColor(this.f11304i);
                    zyVar.f11323y.setTextColor(this.f11304i);
                    zyVar.f11323y.setCompoundDrawablesRelative(this.f11313y, null, null, null);
                    zyVar.f11320n.setTextColor(this.f11304i);
                }
                com.android.thememanager.basemodule.imageloader.x2.m6782y((Activity) RewardDialog.this.getContext(), userBounty.profilePic, zyVar.f11321q, com.android.thememanager.basemodule.imageloader.x2.fn3e().gvn7(R.drawable.avatar_default));
                if (TextUtils.isEmpty(userBounty.userName) || TextUtils.equals(userBounty.userName, userBounty.userId)) {
                    String str = userBounty.userId;
                    zyVar.f11318g.setText(userBounty.userId.replace(str.substring(2, str.length() - 2), "***"));
                } else {
                    zyVar.f11318g.setText(userBounty.userName);
                }
                long j2 = userBounty.bounty;
                if (j2 / 100.0f < 10000.0f) {
                    strZy = (userBounty.bounty / 100.0f) + "";
                } else {
                    strZy = com.android.thememanager.basemodule.utils.x2.zy((int) (j2 / 100));
                }
                zyVar.f11323y.setText(strZy);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        @lvui
        public RecyclerView.fti onCreateViewHolder(@lvui ViewGroup parent, int viewType) {
            RunnableC1984g runnableC1984g = null;
            return viewType == 2 ? new toq(this, LayoutInflater.from(RewardDialog.this.getContext()).inflate(R.layout.de_reward_rank_list_footer, parent, false), runnableC1984g) : new zy(this, LayoutInflater.from(RewardDialog.this.getContext()).inflate(R.layout.de_reward_rank_list, parent, false), runnableC1984g);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.widget.RewardDialog$k */
    class ViewOnClickListenerC1986k implements View.OnClickListener {

        /* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.widget.RewardDialog$k$k */
        class k extends AnimatorListenerAdapter {
            k() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                RewardDialog.this.f11278g.setVisibility(8);
            }
        }

        ViewOnClickListenerC1986k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            RewardDialog rewardDialog = RewardDialog.this;
            Animator animatorN5r1 = rewardDialog.n5r1(rewardDialog.f11278g, "translationY", 400, 0.0f, y9n.zurt().y);
            animatorN5r1.addListener(new k());
            RewardDialog.this.f11285n.setVisibility(0);
            RewardDialog rewardDialog2 = RewardDialog.this;
            Animator animatorN5r12 = rewardDialog2.n5r1(rewardDialog2.f11285n, "alpha", 400, 0.0f, 1.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(animatorN5r1, animatorN5r12);
            animatorSet.start();
            RewardDialog.this.f11287p.setFocusableInTouchMode(true);
        }
    }

    public interface kja0 {
        /* JADX INFO: renamed from: k */
        void mo7802k(RewardData rewardData);

        void toq(int apiCode);
    }

    class ld6 implements View.OnClickListener {
        ld6() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            RewardDialog.this.f11280i.setVisibility(0);
            RewardDialog.this.f11281j.setVisibility(0);
            RewardDialog.this.f11297z.setVisibility(0);
            RewardDialog.this.f11287p.setVisibility(8);
            RewardDialog.this.f11286o.setVisibility(4);
            RewardDialog.this.f11276e.setEnabled(true);
            RewardDialog.this.f11284m.setPaddingRelative(0, 0, 0, 0);
            RewardDialog.this.m7783c();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.widget.RewardDialog$n */
    class C1987n extends AnimatorListenerAdapter {
        C1987n() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            if (RewardDialog.this.getParent() != null) {
                RewardDialog.this.f11292u.onDestroy();
                RewardDialog rewardDialog = RewardDialog.this;
                rewardDialog.removeView(rewardDialog.f11292u);
                ((ViewGroup) RewardDialog.this.getParent()).removeView(RewardDialog.this);
            }
        }
    }

    class n7h implements TextWatcher {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Typeface f11328k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Typeface f11330q;

        n7h(final Typeface val$normalType, final Typeface val$hintType) {
            this.f11328k = val$normalType;
            this.f11330q = val$hintType;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s2) {
            ki.m7817n(s2, 3, 2, RewardDialog.this.f11287p);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s2, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s2, int start, int before, int count) {
            if (s2.length() <= 0 || TextUtils.equals(".", s2) || Double.parseDouble(s2.toString()) <= 0.0d) {
                RewardDialog.this.f11276e.setEnabled(false);
            } else {
                RewardDialog.this.f11276e.setEnabled(true);
            }
            if (s2.length() > 0) {
                RewardDialog.this.f11287p.setHint("");
                RewardDialog.this.f11287p.setTextSize(0, RewardDialog.this.getResources().getDimensionPixelOffset(R.dimen.de_detail_reward_edittext_size));
                RewardDialog.this.f11287p.setTypeface(this.f11328k);
            } else {
                RewardDialog.this.f11287p.setHint(RewardDialog.this.getResources().getString(R.string.detail_reward_limited_to_200));
                RewardDialog.this.f11287p.setTextSize(0, RewardDialog.this.getResources().getDimensionPixelOffset(Locale.getDefault().getLanguage().startsWith("zh") ? R.dimen.de_detail_reward_edittext_hint_size_zh : R.dimen.de_detail_reward_edittext_hint_size));
                RewardDialog.this.f11287p.setTypeface(this.f11330q);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.widget.RewardDialog$p */
    class ViewOnClickListenerC1988p implements View.OnClickListener {

        /* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.widget.RewardDialog$p$k */
        class k implements kja0 {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ View f11332k;

            k(final View val$v) {
                this.f11332k = val$v;
            }

            @Override // com.android.thememanager.detail.theme.view.widget.RewardDialog.kja0
            /* JADX INFO: renamed from: k */
            public void mo7802k(RewardData rewardData) {
                if (rewardData.errCode != 1010 || !C1688q.cdj().jk()) {
                    RewardDialog.this.an = false;
                    RewardDialog rewardDialog = RewardDialog.this;
                    rewardDialog.n5r1(rewardDialog.f11285n, "translationY", 400, 0.0f, y9n.zurt().y).start();
                    RewardDialog.this.m7783c();
                    t8r.m7626z((AbstractActivityC1717k) RewardDialog.this.getContext(), rewardData.toString(), RewardDialog.this);
                    return;
                }
                Log.d(C2755a.f16307g, "go to reward child account webview");
                if ((this.f11332k.getContext() instanceof Activity) && C1819o.eqxt((Activity) this.f11332k.getContext()) && !TextUtils.isEmpty(rewardData.identityUrl)) {
                    RewardDialog.this.an = false;
                    Activity activity = (Activity) this.f11332k.getContext();
                    Intent intentM9541i = com.android.thememanager.toq.m9541i(activity, null, rewardData.identityUrl);
                    intentM9541i.putExtra(ThemeTabActivity.az, ThemeTabActivity.bq);
                    activity.startActivityForResult(intentM9541i, 111);
                }
            }

            @Override // com.android.thememanager.detail.theme.view.widget.RewardDialog.kja0
            public void toq(int errorCode) {
                RewardDialog.this.an = false;
                if (errorCode == -1) {
                    nn86.m7150k(R.string.detail_reward_server_error, 0);
                    return;
                }
                if (errorCode == 408) {
                    RewardDialog.this.f11276e.setEnabled(false);
                    nn86.m7150k(R.string.detail_reward_resource_error, 0);
                } else {
                    if (errorCode == 1001) {
                        nn86.m7150k(R.string.detail_reward_duplicate_order_error, 0);
                        return;
                    }
                    if (errorCode == 1007) {
                        nn86.m7150k(R.string.detail_reward_build_order_error, 0);
                    } else {
                        if (errorCode != 1009) {
                            return;
                        }
                        RewardDialog.this.f11276e.setEnabled(false);
                        nn86.m7150k(R.string.detail_reward_reached_upper_limit, 0);
                    }
                }
            }
        }

        ViewOnClickListenerC1988p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (RewardDialog.this.an) {
                return;
            }
            RewardDialog.this.an = true;
            if (RewardDialog.this.f11287p.getVisibility() == 0) {
                RewardDialog.this.f11275d = ((int) (Double.parseDouble(RewardDialog.this.f11287p.getText().toString()) * 100.0d)) + "";
            } else {
                RewardDialog.this.f11275d = ((int) (Double.parseDouble(RewardDialog.this.f11280i.getText().toString()) * 100.0d)) + "";
            }
            RewardDialog.this.f11294w.wvg(RewardDialog.this.f58023bo, RewardDialog.this.f11275d, RewardDialog.this.in, new k(v2));
            RewardDialog.this.in = null;
            ArrayMap<String, Object> arrayMapZy = C1706p.zy(com.android.thememanager.basemodule.analysis.toq.c4);
            arrayMapZy.put("price", Integer.valueOf((int) ((RewardDialog.this.f11287p.getVisibility() == 0 ? Double.parseDouble(RewardDialog.this.f11287p.getText().toString()) : Double.parseDouble(RewardDialog.this.f11280i.getText().toString())) * 100.0d)));
            C1708s.f7l8().ld6().ni7(arrayMapZy);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.widget.RewardDialog$q */
    class C1989q implements kja0 {
        C1989q() {
        }

        @Override // com.android.thememanager.detail.theme.view.widget.RewardDialog.kja0
        /* JADX INFO: renamed from: k */
        public void mo7802k(RewardData rewardData) {
            RewardDialog.this.f58022ab = rewardData.randBounties;
            RewardDialog.this.f11296y.setVisibility(8);
            if (RewardDialog.this.f58022ab != null) {
                RewardDialog.this.m7790m();
            }
        }

        @Override // com.android.thememanager.detail.theme.view.widget.RewardDialog.kja0
        public void toq(int errorCode) {
        }
    }

    class qrj implements View.OnClickListener {
        qrj() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            RewardDialog.this.m7792o();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.widget.RewardDialog$s */
    class ViewOnClickListenerC1990s implements View.OnClickListener {
        ViewOnClickListenerC1990s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            RewardDialog.this.f11287p.setFocusable(false);
            RewardDialog.this.f11278g.setVisibility(0);
            RewardDialog.this.f11285n.setVisibility(8);
            RewardDialog rewardDialog = RewardDialog.this;
            Animator animatorN5r1 = rewardDialog.n5r1(rewardDialog.f11278g, "translationY", 400, y9n.zurt().y, 0.0f);
            RewardDialog rewardDialog2 = RewardDialog.this;
            Animator animatorN5r12 = rewardDialog2.n5r1(rewardDialog2.f11285n, "alpha", 100, 1.0f, 0.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(animatorN5r1, animatorN5r12);
            animatorSet.start();
            C1708s.f7l8().ld6().cdj(C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.ek, null, ""));
        }
    }

    class toq implements x2.InterfaceC1868n {

        /* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.widget.RewardDialog$toq$k */
        class C1991k implements kja0 {
            C1991k() {
            }

            @Override // com.android.thememanager.detail.theme.view.widget.RewardDialog.kja0
            /* JADX INFO: renamed from: k */
            public void mo7802k(RewardData rewardData) {
                RewardDialog.this.f11272a.m7374q(true, rewardData.hasMore);
                RewardDialog.this.f11295x.ki(rewardData.bountyList);
                RewardDialog.this.ncyb();
            }

            @Override // com.android.thememanager.detail.theme.view.widget.RewardDialog.kja0
            public void toq(int errorCode) {
                RewardDialog.this.f11272a.m7374q(false, true);
            }
        }

        toq() {
        }

        @Override // com.android.thememanager.basemodule.views.x2.InterfaceC1868n
        public void toq() {
            RewardDialog.this.f11294w.kja0(RewardDialog.this.f58023bo, RewardDialog.m7793p(RewardDialog.this), 20, new C1991k());
        }
    }

    class x2 implements View.OnClickListener {

        /* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.widget.RewardDialog$x2$k */
        class C1992k extends AnimatorListenerAdapter {
            C1992k() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                if (RewardDialog.this.f58022ab != null) {
                    RewardDialog.this.m7790m();
                }
            }
        }

        x2() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            RewardDialog rewardDialog = RewardDialog.this;
            Animator animatorN5r1 = rewardDialog.n5r1(rewardDialog.f11281j, "rotation", 400, 360.0f, 0.0f);
            animatorN5r1.addListener(new C1992k());
            animatorN5r1.start();
            C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.mn));
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.widget.RewardDialog$y */
    class ViewOnClickListenerC1993y implements View.OnClickListener {
        ViewOnClickListenerC1993y() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            RewardDialog.this.f11274c.setVisibility(0);
            RewardDialog.this.f11283l.setVisibility(0);
            RewardDialog.this.f11277f.setVisibility(8);
            RewardDialog.this.f11294w.kja0(RewardDialog.this.f58023bo, RewardDialog.m7793p(RewardDialog.this), 20, RewardDialog.this.getFirstRequestRankResponseCallback());
            RewardDialog.this.f11294w.cdj(RewardDialog.this.m7789j());
        }
    }

    class zy implements kja0 {
        zy() {
        }

        @Override // com.android.thememanager.detail.theme.view.widget.RewardDialog.kja0
        /* JADX INFO: renamed from: k */
        public void mo7802k(RewardData rewardData) {
            RewardDialog.this.f11296y.setVisibility(8);
            RewardDialog.this.f11272a.m7373p(rewardData.hasMore);
            RewardDialog.this.f11272a.m7374q(true, rewardData.hasMore);
            List<UserBounty> list = rewardData.bountyList;
            if (list == null || list.size() == 0) {
                RewardDialog.this.f11289r.setVisibility(0);
                RewardDialog.this.f11291t.setVisibility(8);
                RewardDialog.this.f11273b.setVisibility(8);
                return;
            }
            RewardDialog rewardDialog = RewardDialog.this;
            rewardDialog.f11295x = rewardDialog.new C1985h(rewardData.bountyList, rewardData.curUserBounty);
            RewardDialog.this.f11290s.setAdapter(RewardDialog.this.f11295x);
            RewardDialog.this.f11290s.setLayoutManager(new LinearLayoutManager(RewardDialog.this.getContext()));
            if (rewardData.bountyList.size() > 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) RewardDialog.this.f11278g.getLayoutParams();
                layoutParams.height = RewardDialog.this.getResources().getDimensionPixelOffset(R.dimen.de_detail_reward_rank_list_max_height);
                RewardDialog.this.f11278g.setLayoutParams(layoutParams);
            } else {
                RewardDialog.this.f11272a.m7376y(false);
            }
            RewardDialog.this.f11273b.m7782k(rewardData.bountyList, rewardData.curUserBounty, 8);
            String strZy = com.android.thememanager.basemodule.utils.x2.zy((int) rewardData.bountyCount);
            if (rewardData.bountyList.size() <= 8) {
                RewardDialog.this.f11291t.setText(ki.m7816k(RewardDialog.this.getResources().getQuantityString(R.plurals.detail_reward_few_times, (int) rewardData.bountyCount, strZy), strZy));
                RewardDialog.this.f11289r.setVisibility(8);
            } else if (rewardData.bountyList.size() > 8) {
                RewardDialog.this.f11291t.setText(ki.m7816k(RewardDialog.this.getResources().getQuantityString(R.plurals.detail_reward_times, (int) rewardData.bountyCount, strZy), strZy));
                RewardDialog.this.f11289r.setVisibility(8);
            }
            RewardDialog.this.ncyb();
        }

        @Override // com.android.thememanager.detail.theme.view.widget.RewardDialog.kja0
        public void toq(int errorCode) {
            RewardDialog.this.bb = 0;
            RewardDialog.this.f11274c.setVisibility(8);
            RewardDialog.this.f11283l.setVisibility(8);
            RewardDialog.this.f11277f.setVisibility(0);
            RewardDialog.this.f11291t.setVisibility(8);
        }
    }

    public RewardDialog(@lvui Context context, String onlineId, String designerName, InterfaceC1392k.toq presenter) {
        this(context, null, onlineId, designerName, presenter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m7783c() {
        ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f11287p.getWindowToken(), 0);
    }

    /* JADX INFO: renamed from: e */
    private void m7784e(View root) {
        this.f11278g = (LinearLayout) root.findViewById(R.id.reward_rank_list_root);
        this.f11290s = (RecyclerView) root.findViewById(R.id.reward_list);
        ((ImageView) root.findViewById(R.id.reward_rank_list_head_back)).setOnClickListener(new ViewOnClickListenerC1986k());
        this.f11272a = new com.android.thememanager.basemodule.views.x2((SpringBackLayout) findViewById(R.id.refreshLayout), new toq(), false, true);
    }

    /* JADX INFO: renamed from: f */
    private void m7785f() {
        if (this.id) {
            return;
        }
        this.id = true;
        m7783c();
        Animator animatorN5r1 = n5r1(this.f11285n, "translationY", 400, 0.0f, y9n.zurt().y);
        Animator animatorN5r12 = n5r1(this.f11278g, "translationY", 400, 0.0f, y9n.zurt().y);
        Animator animatorN5r13 = n5r1(this.f11282k, "alpha", 400, 1.0f, 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorN5r1, animatorN5r12, animatorN5r13);
        animatorSet.addListener(new C1987n());
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @lvui
    public kja0 getFirstRequestRankResponseCallback() {
        return new zy();
    }

    private void hyr() {
        Animator animatorN5r1 = n5r1(this.f11285n, "translationY", 400, y9n.zurt().y, 0.0f);
        Animator animatorN5r12 = n5r1(this.f11282k, "alpha", 400, 0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorN5r1, animatorN5r12);
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @lvui
    /* JADX INFO: renamed from: j */
    public kja0 m7789j() {
        return new C1989q();
    }

    private void lrht() {
        this.bv = getResources().getDimensionPixelOffset(R.dimen.de_detail_reward_edittex_padding);
        setOnClickListener(this);
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.de_reward_root, (ViewGroup) this, true);
        this.f11288q = (FrameLayout) viewInflate.findViewById(R.id.reward_content);
        if (y9n.m7258z() && !C1819o.d3()) {
            this.f11288q.setPadding(0, 0, 0, C1819o.zurt(getContext().getApplicationContext()));
        }
        vyq(viewInflate);
        uv6();
        nn86(viewInflate);
        m7784e(viewInflate);
        InterfaceC1392k.toq toqVar = this.f11294w;
        String str = this.f58023bo;
        int i2 = this.bb;
        this.bb = i2 + 1;
        toqVar.kja0(str, i2, 20, getFirstRequestRankResponseCallback());
        this.f11294w.cdj(m7789j());
        hyr();
        C1708s.f7l8().ld6().cdj(C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.ngvg, null, ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public void m7790m() {
        this.bp = ki.toq(this.f58022ab.length, this.bp);
        this.f11280i.setText((this.f58022ab[this.bp] / 100.0f) + "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Animator n5r1(View animatorView, String animateStyle, int duration, float startValue, float endValue) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(animatorView, animateStyle, startValue, endValue);
        objectAnimatorOfFloat.setDuration(duration);
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ncyb() {
        if (this.f11295x.getItemCount() < 8 || this.f11295x.getItemCount() >= 100) {
            this.f11295x.ni7(true);
            this.f11295x.notifyDataSetChanged();
            this.f11272a.m7376y(false);
        }
    }

    private void nn86(View root) {
        LinearLayout linearLayout = (LinearLayout) root.findViewById(R.id.reward_root);
        this.f11285n = linearLayout;
        linearLayout.post(new RunnableC1984g());
        this.f11296y = (FrameLayout) root.findViewById(R.id.reward_loading);
        TextView textView = (TextView) root.findViewById(R.id.reward_designer_name);
        this.f11279h = textView;
        textView.setText(getResources().getString(R.string.de_icon_text_reward) + " " + this.f11293v);
        this.f11280i = (TextView) root.findViewById(R.id.reward_amount);
        TextView textView2 = (TextView) root.findViewById(R.id.reward_customize);
        this.f11297z = textView2;
        C6077k.o1t(textView2);
        this.f11297z.setOnClickListener(new f7l8());
        this.f11284m = (ImageView) root.findViewById(R.id.reward_money_icon);
        this.f11283l = (TextView) root.findViewById(R.id.reward_loading_tv);
        TextView textView3 = (TextView) root.findViewById(R.id.reward_retry);
        this.f11277f = textView3;
        textView3.setOnClickListener(new ViewOnClickListenerC1993y());
        TextView textView4 = (TextView) root.findViewById(R.id.reward_times);
        this.f11291t = textView4;
        C6077k.o1t(textView4);
        this.f11291t.setOnClickListener(new ViewOnClickListenerC1990s());
        this.f11274c = (ProgressBar) root.findViewById(R.id.reward_progress);
        Button button = (Button) root.findViewById(R.id.reward_btn);
        this.f11276e = button;
        C6077k.o1t(button);
        this.f11276e.setOnClickListener(new ViewOnClickListenerC1988p());
        TextView textView5 = (TextView) root.findViewById(R.id.reward_no_one);
        this.f11289r = textView5;
        textView5.setVisibility(8);
        ImageView imageView = (ImageView) root.findViewById(R.id.reward_back);
        this.f11286o = imageView;
        imageView.setOnClickListener(new ld6());
        ImageView imageView2 = (ImageView) root.findViewById(R.id.reward_fresh);
        this.f11281j = imageView2;
        C1812k.m7106k(imageView2, R.string.resource_menu_refresh);
        this.f11281j.setOnClickListener(new x2());
        this.f11287p = (EditText) root.findViewById(R.id.reward_edit);
        this.f11287p.setTextSize(0, getResources().getDimensionPixelOffset(Locale.getDefault().getLanguage().startsWith("zh") ? R.dimen.de_detail_reward_edittext_hint_size_zh : R.dimen.de_detail_reward_edittext_hint_size));
        C1819o.m7163q(this.f11287p, root, (Activity) getContext(), getResources().getDimensionPixelOffset(R.dimen.de_detail_reward_dialog_drift_height));
        Typeface typefaceCreate = Typeface.create(dd.f61229zy, 0);
        Typeface typefaceCreate2 = Typeface.create("mitype-semibold", 0);
        this.f11287p.setOnClickListener(new qrj());
        this.f11287p.addTextChangedListener(new n7h(typefaceCreate2, typefaceCreate));
        this.f11273b = (RewardAvatarContainer) root.findViewById(R.id.reward_avatar_container);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public void m7792o() {
        ((InputMethodManager) this.f11287p.getContext().getSystemService("input_method")).showSoftInput(this.f11287p, 0);
    }

    /* JADX INFO: renamed from: p */
    static /* synthetic */ int m7793p(RewardDialog rewardDialog) {
        int i2 = rewardDialog.bb;
        rewardDialog.bb = i2 + 1;
        return i2;
    }

    private void uv6() {
        this.f11292u = new MamlView(getContext(), C1819o.d2ok(getContext()) ? bg : as, 2);
        this.f11292u.setLayoutParams(new FrameLayout.LayoutParams(-2, getResources().getDimensionPixelOffset(R.dimen.de_detail_reward_gold_height)));
    }

    private void vyq(View root) {
        this.f11282k = root.findViewById(R.id.de_reward_mask);
    }

    public boolean hb() {
        if (getWindowToken() == null) {
            return false;
        }
        m7785f();
        return true;
    }

    @Override // com.android.thememanager.controller.online.n7h
    /* JADX INFO: renamed from: k */
    public void mo7597k(int resultCode, @zy.dd Intent data) {
        int i2;
        String string;
        Bundle bundleExtra;
        C7718q.m28120k(bf2.toq.toq()).release();
        if (data == null || (bundleExtra = data.getBundleExtra("result")) == null) {
            i2 = 0;
            string = null;
        } else {
            string = bundleExtra.getString("message");
            i2 = bundleExtra.getInt("code");
        }
        if (resultCode == -1) {
            C1708s.f7l8().ld6().cdj(C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.ivs, null, ""));
            RewardSuccessMamlView rewardSuccessMamlView = new RewardSuccessMamlView(getContext());
            if (getParent() != null) {
                ((ViewGroup) getParent()).addView(rewardSuccessMamlView);
                this.f11292u.onDestroy();
                removeView(this.f11292u);
                ((ViewGroup) getParent()).removeView(this);
                return;
            }
            return;
        }
        Log.i(bl, "reward failed code is :" + i2 + ", message is :" + string);
        this.an = false;
        n5r1(this.f11285n, "translationY", 400, (float) y9n.zurt().y, 0.0f).start();
    }

    /* JADX INFO: renamed from: l */
    public void m7800l() {
        Button button = this.f11276e;
        if (button != null) {
            button.callOnClick();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        m7785f();
    }

    public void setVerifyResult(String verifyResult) {
        this.in = verifyResult;
    }

    public RewardDialog(@lvui Context context, @zy.dd AttributeSet attrs, String onlineId, String designerName, InterfaceC1392k.toq presenter) {
        super(context, attrs);
        this.bp = -1;
        this.f58023bo = onlineId;
        this.f11293v = designerName;
        this.f11294w = presenter;
        lrht();
    }
}
