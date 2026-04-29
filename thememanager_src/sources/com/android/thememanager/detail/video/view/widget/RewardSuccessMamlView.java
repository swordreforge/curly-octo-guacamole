package com.android.thememanager.detail.video.view.widget;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.android.thememanager.R;
import com.google.android.exoplayer2.C3548p;
import com.miui.maml.component.MamlView;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class RewardSuccessMamlView extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: p */
    private static Handler f11516p = new Handler();

    /* JADX INFO: renamed from: s */
    private static final int f11517s = 3000;

    /* JADX INFO: renamed from: y */
    private static final String f11518y = "rewardsuccess";

    /* JADX INFO: renamed from: g */
    private Runnable f11519g;

    /* JADX INFO: renamed from: k */
    private Button f11520k;

    /* JADX INFO: renamed from: n */
    private MamlView f11521n;

    /* JADX INFO: renamed from: q */
    private View f11522q;

    /* JADX INFO: renamed from: com.android.thememanager.detail.video.view.widget.RewardSuccessMamlView$k */
    class RunnableC2021k implements Runnable {
        RunnableC2021k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSuccessMamlView.this.toq();
        }
    }

    class toq implements View.OnClickListener {
        toq() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            RewardSuccessMamlView.this.toq();
        }
    }

    public RewardSuccessMamlView(@lvui Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toq() {
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).removeView(this);
        }
        MamlView mamlView = this.f11521n;
        if (mamlView != null) {
            mamlView.onDestroy();
        }
        Runnable runnable = this.f11519g;
        if (runnable != null) {
            f11516p.removeCallbacks(runnable);
        }
        MamlView mamlView2 = this.f11521n;
        if (mamlView2 != null) {
            mamlView2.onDestroy();
        }
    }

    private void zy() {
        setOnClickListener(this);
        View view = new View(getContext());
        this.f11522q = view;
        view.setBackgroundResource(R.color.de_detail_reward_success_mask_bg_color);
        addView(this.f11522q, new FrameLayout.LayoutParams(-1, -1));
        this.f11521n = new MamlView(getContext(), f11518y, 2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.de_detail_reward_success_mamlview_size));
        layoutParams.gravity = 1;
        layoutParams.setMargins(0, getResources().getDimensionPixelOffset(R.dimen.de_detail_reward_success_mamlview_margin_top), 0, 0);
        this.f11519g = new RunnableC2021k();
        addView(this.f11521n, layoutParams);
        f11516p.postDelayed(this.f11519g, C3548p.f65176gcp);
        Button button = (Button) LayoutInflater.from(getContext()).inflate(R.layout.de_reward_success, (ViewGroup) this, true).findViewById(R.id.reward_success_ok);
        this.f11520k = button;
        button.setOnClickListener(new toq());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        toq();
    }

    public RewardSuccessMamlView(@lvui Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RewardSuccessMamlView(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        zy();
    }
}
