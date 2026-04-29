package com.android.thememanager.view;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.model.RecommendItem;

/* JADX INFO: compiled from: RecommendItemCommentTextFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class fti extends a9 {

    /* JADX INFO: renamed from: n */
    private boolean f17536n;

    /* JADX INFO: renamed from: com.android.thememanager.view.fti$k */
    /* JADX INFO: compiled from: RecommendItemCommentTextFactory.java */
    class ViewOnClickListenerC2916k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ RecommendItem f17537k;

        ViewOnClickListenerC2916k(final RecommendItem val$item) {
            this.f17537k = val$item;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (fti.this.f17536n) {
                this.f17537k.setSelect(!r0.isSelect());
                v2.setSelected(this.f17537k.isSelect());
            }
        }
    }

    public fti(Activity activity, com.android.thememanager.fu4 resContext) {
        this(activity, resContext, false);
    }

    @Override // com.android.thememanager.view.a9
    /* JADX INFO: renamed from: n */
    protected View mo10332n(RecommendItem item, ViewGroup parent) {
        View viewInflate = LayoutInflater.from(this.f17505k).inflate(R.layout.resource_recommend_item_comment_text, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.text);
        textView.setText(item.getTitle());
        textView.setSelected(!this.f17536n || item.isSelect());
        return viewInflate;
    }

    @Override // com.android.thememanager.view.a9
    /* JADX INFO: renamed from: q */
    protected View.OnClickListener mo10333q(final RecommendItem item) {
        return new ViewOnClickListenerC2916k(item);
    }

    public fti(Activity activity, com.android.thememanager.fu4 resContext, boolean selectAble) {
        super(activity, resContext);
        this.f17536n = selectAble;
    }
}
