package com.android.thememanager.allfree;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.thememanager.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
public class AllFreeView extends RelativeLayout {

    /* JADX INFO: renamed from: c */
    public static final int f9547c = 3;

    /* JADX INFO: renamed from: e */
    public static final int f9548e = 4;

    /* JADX INFO: renamed from: f */
    public static final int f9549f = 2;

    /* JADX INFO: renamed from: j */
    private static final int f9550j = 800;

    /* JADX INFO: renamed from: l */
    public static final int f9551l = 1;

    /* JADX INFO: renamed from: m */
    private static final int f9552m = 200;

    /* JADX INFO: renamed from: o */
    private static final int f9553o = 800;

    /* JADX INFO: renamed from: r */
    public static final int f9554r = 0;

    /* JADX INFO: renamed from: g */
    private ImageView f9555g;

    /* JADX INFO: renamed from: h */
    private String f9556h;

    /* JADX INFO: renamed from: i */
    private ViewGroup f9557i;

    /* JADX INFO: renamed from: k */
    private Interpolator f9558k;

    /* JADX INFO: renamed from: n */
    private FrameLayout f9559n;

    /* JADX INFO: renamed from: p */
    private ImageView f9560p;

    /* JADX INFO: renamed from: q */
    private FrameLayout f9561q;

    /* JADX INFO: renamed from: s */
    private TextView f9562s;

    /* JADX INFO: renamed from: t */
    private int f9563t;

    /* JADX INFO: renamed from: y */
    private ImageView f9564y;

    /* JADX INFO: renamed from: z */
    private FrameLayout.LayoutParams f9565z;

    /* JADX INFO: renamed from: com.android.thememanager.allfree.AllFreeView$k */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC1657k {
    }

    public AllFreeView(@lvui Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: k */
    private void m6538k() {
        setBackground(new ColorDrawable(getResources().getColor(R.color.all_free_mask)));
        this.f9565z = new FrameLayout.LayoutParams(-1, -1);
    }

    public AllFreeView(@lvui Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AllFreeView(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f9558k = new AnticipateOvershootInterpolator();
        this.f9557i = (ViewGroup) ((Activity) context).findViewById(android.R.id.content);
        m6538k();
    }
}
