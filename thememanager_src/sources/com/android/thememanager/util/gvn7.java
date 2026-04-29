package com.android.thememanager.util;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.android.thememanager.R;
import com.android.thememanager.ThemeResourceProxyTabActivity;
import com.android.thememanager.view.ResourceEmptyView;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: EmptyViewUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class gvn7 {

    /* JADX INFO: renamed from: g */
    public static final int f16512g = 7;

    /* JADX INFO: renamed from: k */
    public static final int f16513k = -1;

    /* JADX INFO: renamed from: n */
    public static final int f16514n = 6;

    /* JADX INFO: renamed from: q */
    public static final int f16515q = 2;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f61250toq = 0;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f61251zy = 1;

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m9785k(com.android.thememanager.view.ResourceEmptyView r2, int r3, int r4, boolean r5, boolean r6, android.view.View.OnClickListener r7) {
        /*
            r1 = this;
            if (r5 == 0) goto L8
            r3 = 8
            r2.setVisibility(r3)
            return
        L8:
            r5 = 1
            r0 = 0
            if (r6 == 0) goto L16
            r3 = -1
            if (r4 != r3) goto L11
            r3 = r5
            goto L12
        L11:
            r3 = r0
        L12:
            r1.toq(r2, r3, r7)
            goto L5e
        L16:
            if (r3 == 0) goto L54
            if (r3 == r5) goto L4a
            r4 = 2131887796(0x7f1206b4, float:1.941021E38)
            r6 = 2
            if (r3 == r6) goto L34
            r5 = 6
            if (r3 == r5) goto L54
            r5 = 7
            if (r3 == r5) goto L27
            goto L5d
        L27:
            r2.setViewStyle(r6)
            r2.setText(r4)
            r3 = 2131232795(0x7f08081b, float:1.808171E38)
            r2.setImage(r3)
            goto L5d
        L34:
            r2.setViewStyle(r5)
            r3 = 2131887802(0x7f1206ba, float:1.9410221E38)
            r2.setText(r3)
            r3 = 2131231234(0x7f080202, float:1.8078543E38)
            r2.setImage(r3)
            r2.setButtonTitle(r4)
            r2.setButtonOnClickListener(r7)
            goto L5d
        L4a:
            r2.setViewStyle(r0)
            r3 = 2131887483(0x7f12057b, float:1.9409574E38)
            r2.setText(r3)
            goto L5d
        L54:
            r2.setViewStyle(r0)
            r3 = 2131887363(0x7f120503, float:1.940933E38)
            r2.setText(r3)
        L5d:
            r5 = r0
        L5e:
            r2.setVisibility(r0)
            r2.toq(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.util.gvn7.m9785k(com.android.thememanager.view.ResourceEmptyView, int, int, boolean, boolean, android.view.View$OnClickListener):void");
    }

    protected void toq(ResourceEmptyView view, boolean hasNoNetwork, View.OnClickListener listener) {
        view.setViewStyle(1);
        view.setText(hasNoNetwork ? R.string.resource_no_network_text : R.string.resource_failed_to_load_list);
        view.setImage(R.drawable.resource_no_network);
        view.setButtonTitle(R.string.resource_menu_refresh);
        view.setButtonOnClickListener(listener);
    }

    public void zy(Context context) {
        Intent intent = new Intent();
        intent.setAction(ThemeResourceProxyTabActivity.bl);
        intent.setPackage(bf2.toq.toq().getPackageName());
        intent.putExtra("REQUEST_RESOURCE_CODE", "theme");
        intent.putExtra("EXTRA_TAB_ID", "theme");
        intent.addFlags(67108864);
        intent.putExtra(InterfaceC1357q.f53967yl, "homepage");
        context.startActivity(intent);
    }
}
