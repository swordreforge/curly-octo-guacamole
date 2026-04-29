package com.android.thememanager.comment.util;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.views.ItemOrderLayout;
import com.android.thememanager.comment.model.ResourceCommentTags;

/* JADX INFO: compiled from: CommentItemTagFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq implements ItemOrderLayout.InterfaceC1845k<ResourceCommentTags.Tag> {

    /* JADX INFO: renamed from: k */
    private Activity f10682k;

    /* JADX INFO: renamed from: q */
    private boolean f10683q;

    public toq(Activity activity) {
        this(activity, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m7424n(ResourceCommentTags.Tag tag, View view) {
        if (this.f10683q) {
            boolean z2 = !tag.selected;
            tag.selected = z2;
            view.setSelected(z2);
            ((TextView) view).setTextColor(tag.selected ? this.f10682k.getResources().getColor(R.color.comment_tag_select_color) : this.f10682k.getResources().getColor(R.color.comment_tag_unselect_color));
        }
    }

    /* JADX INFO: renamed from: q */
    private View.OnClickListener m7425q(final ResourceCommentTags.Tag tag) {
        return new View.OnClickListener() { // from class: com.android.thememanager.comment.util.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10676k.m7424n(tag, view);
            }
        };
    }

    @Override // com.android.thememanager.basemodule.views.ItemOrderLayout.InterfaceC1845k
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public View mo7319k(ResourceCommentTags.Tag data, ViewGroup parent) {
        View viewInflate = LayoutInflater.from(this.f10682k).inflate(R.layout.resource_recommend_item_comment_text, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.text);
        textView.setText(data.content);
        textView.setSelected(!this.f10683q || data.selected);
        textView.setTextColor((!this.f10683q || data.selected) ? this.f10682k.getResources().getColor(R.color.comment_tag_select_color) : this.f10682k.getResources().getColor(R.color.comment_tag_unselect_color));
        textView.setOnClickListener(m7425q(data));
        return viewInflate;
    }

    public toq(Activity activity, boolean selectAble) {
        this.f10682k = activity;
        this.f10683q = selectAble;
    }
}
