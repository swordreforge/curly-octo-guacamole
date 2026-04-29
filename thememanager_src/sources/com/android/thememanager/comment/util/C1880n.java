package com.android.thememanager.comment.util;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.resource.model.ResourceInfo;
import com.android.thememanager.basemodule.utils.kja0;
import com.android.thememanager.basemodule.views.ItemOrderLayout;
import com.android.thememanager.router.detail.entity.ResourceCommentItem;
import java.util.Calendar;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.comment.util.n */
/* JADX INFO: compiled from: ResourceDetailCommentSetter.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1880n {

    /* JADX INFO: renamed from: com.android.thememanager.comment.util.n$k */
    /* JADX INFO: compiled from: ResourceDetailCommentSetter.java */
    private static class k {

        /* JADX INFO: renamed from: g */
        private TextView f10678g;

        /* JADX INFO: renamed from: k */
        private TextView f10679k;

        /* JADX INFO: renamed from: n */
        private TextView f10680n;

        /* JADX INFO: renamed from: q */
        private TextView f10681q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private RatingBar f57876toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private ItemOrderLayout f57877zy;

        public k(@lvui View view) {
            this.f10679k = (TextView) view.findViewById(R.id.content);
            this.f57876toq = (RatingBar) view.findViewById(R.id.ratingbar);
            this.f57877zy = (ItemOrderLayout) view.findViewById(R.id.tags);
            this.f10681q = (TextView) view.findViewById(R.id.username);
            this.f10680n = (TextView) view.findViewById(R.id.date);
            this.f10678g = (TextView) view.findViewById(R.id.version);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m7417k(View view, ResourceCommentItem item, ResourceInfo onlineInfo) {
        k kVar;
        Context qVar = bf2.toq.toq();
        if (view.getTag() instanceof k) {
            kVar = (k) view.getTag();
        } else {
            k kVar2 = new k(view);
            view.setTag(kVar2);
            kVar = kVar2;
        }
        if (TextUtils.isEmpty(item.content)) {
            kVar.f10679k.setVisibility(8);
        } else {
            kVar.f10679k.setVisibility(0);
            kVar.f10679k.setText(item.content);
        }
        kVar.f57876toq.setRating(item.score);
        if (kja0.qrj(item.tags)) {
            kVar.f57877zy.setVisibility(8);
        } else {
            kVar.f57877zy.setVisibility(0);
            kVar.f57877zy.toq(item.tags);
        }
        kVar.f10681q.setText(TextUtils.isEmpty(item.userName) ? qVar.getString(R.string.resource_comment_name_default) : item.userName);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(item.updateTime);
        kVar.f10680n.setText(qVar.getString(R.string.resource_comment_date, Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5))));
        String string = item.miuiVersion;
        if (onlineInfo != null && TextUtils.equals(string, onlineInfo.getVersion())) {
            string = qVar.getString(R.string.resource_comment_current_version);
        }
        kVar.f10678g.setText(string);
    }
}
