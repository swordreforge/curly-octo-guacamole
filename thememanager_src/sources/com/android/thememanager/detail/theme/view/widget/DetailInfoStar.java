package com.android.thememanager.detail.theme.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1819o;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public class DetailInfoStar extends DetailCommentStar {
    public DetailInfoStar(Context context) {
        this(context, null);
    }

    @Override // com.android.thememanager.detail.theme.view.widget.DetailCommentStar
    /* JADX INFO: renamed from: k */
    protected ImageView mo7757k() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.de_select_icon_theme_detail_comment_star);
        int iQrj = C1819o.qrj(1.0f);
        imageView.setPadding(iQrj, iQrj, iQrj, iQrj);
        return imageView;
    }

    public DetailInfoStar(Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DetailInfoStar(Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
