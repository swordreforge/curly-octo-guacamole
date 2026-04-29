package com.android.thememanager.basemodule.utils;

import android.content.Context;
import android.view.MotionEvent;
import com.miui.maml.component.MamlView;

/* JADX INFO: loaded from: classes.dex */
public class MamlAodFactory {

    /* JADX INFO: renamed from: k */
    public static final int f10254k = y9n.fn3e().x;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f57706toq = "content/";

    public static class NoTouchMamlView extends MamlView {
        public NoTouchMamlView(Context context, MamlView.Config config) {
            super(context, config);
        }

        @Override // com.miui.maml.component.MamlView, android.view.View
        public boolean onTouchEvent(MotionEvent event) {
            return false;
        }
    }

    private MamlAodFactory() {
    }

    /* JADX INFO: renamed from: k */
    public static MamlView m6986k(@zy.lvui Context context, @zy.lvui String aodPath, boolean disableTouch, float resizeScale) {
        MamlView.Config config = new MamlView.Config();
        config.path = aodPath;
        config.innerPath = "content/";
        config.mode = 1;
        config.resizeScale = resizeScale;
        return disableTouch ? new NoTouchMamlView(context.getApplicationContext(), config) : new MamlView(context.getApplicationContext(), config);
    }
}
