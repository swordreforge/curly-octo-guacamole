package com.android.thememanager.author.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.activity.C1582h;
import com.android.thememanager.activity.cv06;
import com.android.thememanager.basemodule.imageloader.NinePatchImageView;
import com.android.thememanager.basemodule.resource.model.PathEntry;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1815m;
import com.android.thememanager.fu4;
import com.android.thememanager.util.bek6;
import java.util.List;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;

/* JADX INFO: renamed from: com.android.thememanager.author.adapter.k */
/* JADX INFO: compiled from: AuthorLargeIconAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1659k extends cv06 {
    public C1659k(@InterfaceC7395n Context context, @InterfaceC7395n fu4 fu4Var) {
        super(context, fu4Var);
    }

    @Override // com.android.thememanager.activity.cv06, com.android.thememanager.activity.pc
    /* JADX INFO: renamed from: r */
    protected void mo6401r(@InterfaceC7395n View view, @InterfaceC7395n Resource resource, int i2, int i3) {
        if (view == null || resource == null) {
            return;
        }
        ImageView imageView = (NinePatchImageView) view.findViewById(R.id.preview_image);
        TextView textView = (TextView) view.findViewById(R.id.title);
        TextView textView2 = (TextView) view.findViewById(R.id.brief);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.designer_container);
        d2ok.qrj(linearLayout);
        bek6.m9613g(linearLayout);
        textView.setText(resource.getTitle());
        textView2.setText(String.valueOf(resource.getProductPrice()));
        textView2.setText(C1815m.toq(m6465l(), resource.getProductPrice()));
        List<PathEntry> listM6463e = m6463e(resource, i3);
        PathEntry pathEntry = listM6463e.isEmpty() ? null : listM6463e.get(0);
        i1(imageView, nn86());
        nmn5(imageView, resource, pathEntry, i3);
    }

    public C1659k(@InterfaceC7395n C1582h c1582h, @InterfaceC7395n fu4 fu4Var) {
        super(c1582h, fu4Var);
    }
}
