package com.android.thememanager.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.android.thememanager.R;
import com.android.thememanager.activity.AuthorAttentionActivity;
import com.android.thememanager.activity.ThemePreferenceActivity;
import com.android.thememanager.basemodule.account.C1685g;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.guideview.InterfaceC1727k;
import com.android.thememanager.basemodule.guideview.RestoreHomeIconHelper;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.util.C2763c;
import com.android.thememanager.util.C2782h;
import com.android.thememanager.v9.model.UserMessage;
import i1.C6077k;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"SetTextI18n"})
public class AccountInfoView extends ConstraintLayout implements C2782h.zy, View.OnClickListener, InterfaceC1727k.k {
    private static final String ay = "AccountInfoView";
    private boolean ac;
    private WeakReference<Fragment> ad;
    private final androidx.lifecycle.jp0y<Intent> am;
    private ImageView as;
    private ViewStub ax;
    private TextView az;
    private View ba;
    private TextView bg;
    private ImageView bl;
    private String bq;

    /* JADX INFO: renamed from: com.android.thememanager.view.AccountInfoView$k */
    class C2878k implements androidx.lifecycle.jp0y<Intent> {
        C2878k() {
        }

        @Override // androidx.lifecycle.jp0y
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void toq(Intent intent) {
            if (AccountInfoView.this.ax != null) {
                AccountInfoView.this.ax.setVisibility(8);
            }
        }
    }

    public AccountInfoView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: o */
    private void m10218o() {
        if (this.ax != null) {
            RestoreHomeIconHelper.m6731g();
            this.ax.setVisibility(8);
        }
    }

    private void yz() {
        ViewStub viewStub = this.ax;
        if (viewStub != null) {
            View viewInflate = viewStub.inflate();
            androidx.core.graphics.drawable.x2 x2VarM2430k = androidx.core.graphics.drawable.qrj.m2430k(this.ax.getContext().getResources(), ((BitmapDrawable) this.ax.getContext().getDrawable(R.drawable.icon)).getBitmap());
            x2VarM2430k.qrj(this.ax.getContext().getResources().getDimensionPixelSize(R.dimen.top_tab_text_size));
            x2VarM2430k.ld6(true);
            ((ImageView) viewInflate.findViewById(R.id.icon)).setImageDrawable(x2VarM2430k);
            viewInflate.findViewById(R.id.close).setOnClickListener(this);
        }
    }

    @Override // com.android.thememanager.util.C2782h.zy
    public void a9() {
        C2782h.f16520p++;
        this.az.setText(C2782h.f16520p + this.bq);
    }

    public void ek5k() {
        C2782h.m9792y(this);
    }

    public boolean getHasUpdateFeed() {
        return this.ac;
    }

    @Override // com.android.thememanager.util.C2782h.zy
    /* JADX INFO: renamed from: i */
    public void mo9793i() {
        long j2 = C2782h.f16520p;
        if (j2 == 0) {
            return;
        }
        C2782h.f16520p = j2 - 1;
        this.az.setText(C2782h.f16520p + this.bq);
    }

    /* JADX INFO: renamed from: j */
    public void m10219j() {
        View view = this.ba;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // com.android.thememanager.basemodule.guideview.InterfaceC1727k.k
    public void ki(boolean need) {
        if (!need || getParent() == null) {
            return;
        }
        yz();
    }

    /* JADX INFO: renamed from: m */
    public void m10220m() {
        C2782h.f7l8(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.android.thememanager.basemodule.utils.ni7.m7146k().toq(RestoreHomeIconHelper.f9903l, this.am);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        if (v2.getId() == R.id.close) {
            m10218o();
            return;
        }
        if (v2.getId() == R.id.settings) {
            m10218o();
            C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.lm5));
            Intent intent = new Intent();
            intent.setClass(v2.getContext(), ThemePreferenceActivity.class);
            v2.getContext().startActivity(intent);
            return;
        }
        if (v2.getId() == R.id.author_message_container) {
            Context context = v2.getContext();
            Intent intent2 = new Intent(context, (Class<?>) AuthorAttentionActivity.class);
            intent2.putExtra(AuthorAttentionActivity.f8763u, getHasUpdateFeed());
            intent2.putExtra("REQUEST_RESOURCE_CODE", "theme");
            WeakReference<Fragment> weakReference = this.ad;
            if (weakReference == null || weakReference.get() == null) {
                ((Activity) context).startActivityForResult(intent2, 1);
            } else {
                this.ad.get().startActivityForResult(intent2, 1);
            }
            setDotIvVisible(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        com.android.thememanager.basemodule.utils.ni7.m7146k().m7147n(RestoreHomeIconHelper.f9903l, this.am);
        super.onDetachedFromWindow();
    }

    public void setDotIvVisible(int visible) {
        this.as.setVisibility(visible);
    }

    public void setFollowNum(long followNum) {
        if (followNum < 0) {
            followNum = 0;
        }
        this.az.setText(followNum + this.bq);
    }

    public void setFragment(WeakReference<Fragment> fragment) {
        this.ad = fragment;
    }

    public void setHasUpdateFeed(boolean hasUpdateFeed) {
        this.ac = hasUpdateFeed;
    }

    public void setInfo(UserMessage userMessage) {
        if (C1688q.cdj().m6590z() == null) {
            return;
        }
        this.ba.setVisibility(0);
        long j2 = userMessage.followNum;
        if (j2 < 0) {
            j2 = 0;
        }
        C2782h.f16520p = j2;
        this.az.setText(j2 + this.bq);
        this.az.setVisibility(0);
        boolean z2 = userMessage.hasFeed;
        this.ac = z2;
        if (z2) {
            this.as.setVisibility(0);
        } else {
            this.as.setVisibility(8);
        }
    }

    public void y9n() {
        Log.i(ay, "Start updateUserInfoView");
        C1685g c1685gM6590z = C1688q.cdj().m6590z();
        if (c1685gM6590z == null) {
            this.bg.setText(R.string.account_name_not_login);
            C2763c.m9647i(getContext(), this.bl);
            this.bl.setImageResource(R.drawable.avatar_default);
            Log.w(ay, "updateUserInfoView: info is null");
            return;
        }
        if (TextUtils.isEmpty(c1685gM6590z.f57421toq)) {
            Log.w(ay, "updateUserInfoView: userName is empty");
        } else {
            this.bg.setText(c1685gM6590z.f57421toq);
        }
        if (!(getContext() instanceof Activity)) {
            Log.w(ay, "updateUserInfoView: getContext() is not instanceof Activity");
            C2763c.m9647i(getContext(), this.bl);
            this.bl.setImageResource(R.drawable.avatar_default);
        } else {
            com.android.thememanager.basemodule.imageloader.x2.m6782y((Activity) getContext(), c1685gM6590z.f9639q, this.bl, com.android.thememanager.basemodule.imageloader.x2.fn3e().gvn7(R.drawable.avatar_default).o1t(R.color.user_info_avatar_border_color));
            if (TextUtils.isEmpty(c1685gM6590z.f9639q)) {
                Log.w(ay, "updateUserInfoView: avatarAddress is empty");
            }
        }
    }

    public AccountInfoView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AccountInfoView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.am = new C2878k();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.user_info_view_layout, (ViewGroup) this, true);
        this.bl = (ImageView) viewInflate.findViewById(R.id.avatar);
        this.bg = (TextView) viewInflate.findViewById(R.id.name);
        this.as = (ImageView) viewInflate.findViewById(R.id.attention_message_iv);
        this.az = (TextView) viewInflate.findViewById(R.id.author_attention_amount);
        View viewFindViewById = viewInflate.findViewById(R.id.author_message_container);
        this.ba = viewFindViewById;
        viewFindViewById.setOnClickListener(this);
        this.ax = (ViewStub) viewInflate.findViewById(R.id.restore_home_icon);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.settings);
        imageView.setOnClickListener(this);
        this.bq = getContext().getResources().getString(R.string.author_attention);
        y9n();
        this.ba.setVisibility(8);
        this.as.setVisibility(8);
        if (!y9n.vyq()) {
            new RestoreHomeIconHelper.AsyncTaskC1726k(this).toq(RestoreHomeIconHelper.f9907r);
        }
        C6077k.f7l8(imageView);
        C6077k.m22369i(this.bl);
        C6077k.fn3e(this.bl, this.bg);
        C6077k.f7l8(this.bg);
        C6077k.m22376y(this.bg, this.bl);
        C6077k.f7l8(this.ba);
    }
}
