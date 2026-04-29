package com.android.thememanager.detail.theme.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.android.thememanager.R;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public class DetailCommentStar extends LinearLayout {

    /* JADX INFO: renamed from: g */
    private ImageView f11213g;

    /* JADX INFO: renamed from: k */
    private ImageView f11214k;

    /* JADX INFO: renamed from: n */
    private ImageView f11215n;

    /* JADX INFO: renamed from: q */
    private ImageView f11216q;

    /* JADX INFO: renamed from: y */
    private ImageView f11217y;

    public DetailCommentStar(Context context) {
        this(context, null);
    }

    private void toq() {
        if (this.f11214k == null) {
            this.f11214k = mo7757k();
            this.f11216q = mo7757k();
            this.f11215n = mo7757k();
            this.f11213g = mo7757k();
            this.f11217y = mo7757k();
            addView(this.f11214k);
            addView(this.f11216q);
            addView(this.f11215n);
            addView(this.f11213g);
            addView(this.f11217y);
        }
        this.f11214k.setSelected(false);
        this.f11216q.setSelected(false);
        this.f11215n.setSelected(false);
        this.f11213g.setSelected(false);
        this.f11217y.setSelected(false);
    }

    /* JADX INFO: renamed from: k */
    protected ImageView mo7757k() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.de_select_icon_theme_detail_comment_star);
        return imageView;
    }

    public void setScore(int score) {
        toq();
        if (score != 1) {
            if (score != 2) {
                if (score != 3) {
                    if (score != 4) {
                        if (score != 5) {
                            return;
                        } else {
                            this.f11217y.setSelected(true);
                        }
                    }
                    this.f11213g.setSelected(true);
                }
                this.f11215n.setSelected(true);
            }
            this.f11216q.setSelected(true);
        }
        this.f11214k.setSelected(true);
    }

    public DetailCommentStar(Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DetailCommentStar(Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setOrientation(0);
        toq();
    }
}
