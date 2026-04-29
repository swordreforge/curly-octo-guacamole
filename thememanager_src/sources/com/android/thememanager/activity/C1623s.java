package com.android.thememanager.activity;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.model.ResourceResolver;

/* JADX INFO: renamed from: com.android.thememanager.activity.s */
/* JADX INFO: compiled from: AodAndIconOnlineResourceAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class C1623s extends cv06 {
    public C1623s(C1582h fragment, com.android.thememanager.fu4 resContext) {
        super(fragment, resContext);
    }

    @Override // com.android.thememanager.activity.pc
    /* JADX INFO: renamed from: b */
    protected void mo6461b(View view, Resource resource) {
        TextView textView = (TextView) view.findViewById(R.id.current_using);
        if (textView == null) {
            return;
        }
        String metaPath = new ResourceResolver(resource, this.f9310e).getMetaPath();
        if (metaPath == null || !metaPath.equals(this.f57346ab)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    @Override // com.android.thememanager.activity.cv06, com.android.thememanager.activity.pc
    /* JADX INFO: renamed from: r */
    protected void mo6401r(View view, Resource resource, int groupIndex, int group) {
        super.mo6401r(view, resource, groupIndex, group);
        String metaPath = new ResourceResolver(resource, this.f9310e).getMetaPath();
        if (metaPath == null || !metaPath.equals(this.f57346ab)) {
            return;
        }
        TextView textView = (TextView) view.findViewById(R.id.origin_price);
        if (textView != null) {
            textView.setVisibility(8);
        }
        TextView textView2 = (TextView) view.findViewById(R.id.discounted_price);
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
    }

    public C1623s(Context activity, com.android.thememanager.fu4 resContext) {
        super(activity, resContext);
    }
}
