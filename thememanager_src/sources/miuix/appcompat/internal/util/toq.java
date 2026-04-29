package miuix.appcompat.internal.util;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import gb.toq;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.base.AnimConfig;
import miuix.internal.util.C7164n;
import xm.C7752g;
import xm.C7756y;

/* JADX INFO: compiled from: ActionBarViewFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m25243n(AppCompatImageView appCompatImageView, Context context) {
        appCompatImageView.setImageDrawable(C7164n.m25952s(context, R.attr.homeAsUpIndicator));
        Folme.useAt(appCompatImageView).hover().setFeedbackRadius(60.0f);
        Folme.useAt(appCompatImageView).hover().setEffect(IHoverStyle.HoverEffect.FLOATED_WRAPPED).handleHoverOf((View) appCompatImageView.getParent(), new AnimConfig[0]);
    }

    /* JADX INFO: renamed from: q */
    public static View m25244q(final Context context, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(toq.C6054p.bv);
        frameLayout.setVisibility(8);
        frameLayout.setContentDescription(context.getResources().getString(toq.C6051h.f34802t));
        frameLayout.setClipChildren(false);
        final AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setDuplicateParentStateEnabled(true);
        appCompatImageView.post(new Runnable() { // from class: miuix.appcompat.internal.util.k
            @Override // java.lang.Runnable
            public final void run() {
                toq.m25243n(appCompatImageView, context);
            }
        });
        frameLayout.addView(appCompatImageView, new FrameLayout.LayoutParams(-2, -2));
        if (viewGroup != null) {
            viewGroup.addView(frameLayout);
        }
        return frameLayout;
    }

    public static C7752g toq(Context context, int i2, int i3) {
        C7752g c7752g = new C7752g(context, i2, i3);
        c7752g.n7h();
        return c7752g;
    }

    public static C7756y zy(Context context) {
        C7756y c7756y = new C7756y(context);
        c7756y.m28142n();
        return c7756y;
    }
}
