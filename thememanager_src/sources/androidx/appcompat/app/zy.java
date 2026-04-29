package androidx.appcompat.app;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: ActionBarDrawerToggleHoneycomb.java */
/* JADX INFO: loaded from: classes.dex */
class zy {

    /* JADX INFO: renamed from: k */
    private static final String f338k = "ActionBarDrawerToggleHC";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int[] f46626toq = {R.attr.homeAsUpIndicator};

    /* JADX INFO: renamed from: androidx.appcompat.app.zy$k */
    /* JADX INFO: compiled from: ActionBarDrawerToggleHoneycomb.java */
    static class C0108k {

        /* JADX INFO: renamed from: k */
        public Method f339k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public Method f46627toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public ImageView f46628zy;

        C0108k(Activity activity) {
            try {
                this.f339k = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", Drawable.class);
                this.f46627toq = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                View viewFindViewById = activity.findViewById(R.id.home);
                if (viewFindViewById == null) {
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
                if (viewGroup.getChildCount() != 2) {
                    return;
                }
                View childAt = viewGroup.getChildAt(0);
                childAt = childAt.getId() == 16908332 ? viewGroup.getChildAt(1) : childAt;
                if (childAt instanceof ImageView) {
                    this.f46628zy = (ImageView) childAt;
                }
            }
        }
    }

    private zy() {
    }

    /* JADX INFO: renamed from: k */
    public static Drawable m255k(Activity activity) {
        TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(f46626toq);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        return drawable;
    }

    public static C0108k toq(C0108k c0108k, Activity activity, int i2) {
        if (c0108k == null) {
            c0108k = new C0108k(activity);
        }
        if (c0108k.f339k != null) {
            try {
                c0108k.f46627toq.invoke(activity.getActionBar(), Integer.valueOf(i2));
            } catch (Exception e2) {
                Log.w(f338k, "Couldn't set content description via JB-MR2 API", e2);
            }
        }
        return c0108k;
    }

    public static C0108k zy(Activity activity, Drawable drawable, int i2) {
        C0108k c0108k = new C0108k(activity);
        if (c0108k.f339k != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                c0108k.f339k.invoke(actionBar, drawable);
                c0108k.f46627toq.invoke(actionBar, Integer.valueOf(i2));
            } catch (Exception e2) {
                Log.w(f338k, "Couldn't set home-as-up indicator via JB-MR2 API", e2);
            }
        } else {
            ImageView imageView = c0108k.f46628zy;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            } else {
                Log.w(f338k, "Couldn't set home-as-up indicator");
            }
        }
        return c0108k;
    }
}
