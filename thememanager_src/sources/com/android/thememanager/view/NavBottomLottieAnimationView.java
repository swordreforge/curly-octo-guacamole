package com.android.thememanager.view;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;

/* JADX INFO: loaded from: classes2.dex */
public class NavBottomLottieAnimationView extends LottieAnimationView {
    public NavBottomLottieAnimationView(Context context) {
        super(context);
    }

    @Override // com.airbnb.lottie.LottieAnimationView, android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        super.onRestoreInstanceState(null);
    }

    public NavBottomLottieAnimationView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NavBottomLottieAnimationView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
