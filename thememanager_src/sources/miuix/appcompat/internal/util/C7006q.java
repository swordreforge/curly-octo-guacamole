package miuix.appcompat.internal.util;

import android.content.Context;
import android.content.res.TypedArray;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC0096k;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.appcompat.internal.app.widget.ActionBarContainer;
import miuix.appcompat.internal.app.widget.ActionBarOverlayLayout;
import miuix.appcompat.internal.app.widget.CollapseTabContainer;
import miuix.appcompat.internal.app.widget.ExpandTabContainer;
import miuix.appcompat.internal.app.widget.SecondaryCollapseTabContainer;
import miuix.appcompat.internal.app.widget.SecondaryExpandTabContainer;
import miuix.springback.view.SpringBackLayout;
import xm.C7752g;
import xm.C7756y;

/* JADX INFO: renamed from: miuix.appcompat.internal.util.q */
/* JADX INFO: compiled from: AppcompatClassPreLoader.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7006q {

    /* JADX INFO: renamed from: k */
    public static boolean f39346k = false;

    /* JADX INFO: renamed from: miuix.appcompat.internal.util.q$k */
    /* JADX INFO: compiled from: AppcompatClassPreLoader.java */
    class k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Context f39347k;

        k(Context context) {
            this.f39347k = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            C7006q.zy(this.f39347k);
            C7006q.m25241k(this.f39347k);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m25241k(Context context) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            Class.forName(ActionBarOverlayLayout.class.getName(), true, classLoader);
            Class.forName(ActionBarContainer.class.getName(), true, classLoader);
            Class.forName(AbstractC0096k.g.class.getName(), true, classLoader);
            Class.forName(AnimState.class.getName(), true, classLoader);
            Class.forName(AnimConfig.class.getName(), true, classLoader);
            Class.forName(C7752g.class.getName(), true, classLoader);
            Class.forName(C7756y.class.getName(), true, classLoader);
            Class.forName(CollapseTabContainer.class.getName(), true, classLoader);
            Class.forName(ExpandTabContainer.class.getName(), true, classLoader);
            Class.forName(SecondaryCollapseTabContainer.class.getName(), true, classLoader);
            Class.forName(SecondaryExpandTabContainer.class.getName(), true, classLoader);
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
        }
    }

    public static void toq(Context context) {
        new Thread(new k(context)).start();
    }

    public static void zy(Context context) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            Class.forName(FrameLayout.class.getName(), true, classLoader);
            Class.forName(LinearLayout.class.getName(), true, classLoader);
            Class.forName(ImageView.class.getName(), true, classLoader);
            Class.forName(TextView.class.getName(), true, classLoader);
            Class.forName(Button.class.getName(), true, classLoader);
            Class.forName(SpringBackLayout.class.getName(), true, classLoader);
            Class.forName(TypedArray.class.getName(), true, classLoader);
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
        }
    }
}
