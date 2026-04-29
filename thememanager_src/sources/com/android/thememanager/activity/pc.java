package com.android.thememanager.activity;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.async.AbstractC1712k;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.model.PathEntry;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.model.CleanMessage;
import com.android.thememanager.model.ResourceResolver;
import java.lang.ref.WeakReference;
import java.util.List;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: ResourceAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class pc extends AbstractC1712k<Resource> implements InterfaceC1357q, com.android.thememanager.basemodule.resource.constants.toq, CleanMessage {
    private static final ViewGroup.LayoutParams bp = new ViewGroup.LayoutParams(-1, -2);

    /* JADX INFO: renamed from: a */
    protected int f9307a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    protected String f57346ab;

    /* JADX INFO: renamed from: b */
    protected com.android.thememanager.basemodule.async.toq<Object, List<Resource>, List<Resource>> f9308b;
    private final boolean bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    protected int f57347bo;

    /* JADX INFO: renamed from: d */
    protected int f9309d;

    /* JADX INFO: renamed from: e */
    protected com.android.thememanager.fu4 f9310e;

    /* JADX INFO: renamed from: j */
    protected com.android.thememanager.controller.x2 f9311j;

    /* JADX INFO: renamed from: m */
    protected WeakReference<C1582h> f9312m;

    /* JADX INFO: renamed from: o */
    public WeakReference<Activity> f9313o;

    /* JADX INFO: renamed from: u */
    protected int f9314u;

    /* JADX INFO: renamed from: v */
    protected int f9315v;

    /* JADX INFO: renamed from: w */
    protected com.android.thememanager.util.t8r f9316w;

    /* JADX INFO: renamed from: x */
    protected int f9317x;

    public pc(C1582h fragment, com.android.thememanager.fu4 resContext) {
        this(fragment, fragment.getActivity(), resContext);
    }

    private boolean bf2(View view, int resId) {
        if (view == null) {
            return false;
        }
        if (resId == 0) {
            view.setVisibility(8);
            return false;
        }
        view.setVisibility(0);
        if (view instanceof ImageView) {
            ((ImageView) view).setImageResource(resId);
            return true;
        }
        view.setBackgroundResource(resId);
        return true;
    }

    private void dd(Context context, View itemView) {
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.ring_list_content_padding_start);
        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.ring_list_content_padding_top);
        int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(R.dimen.ring_list_content_padding_bottom);
        int dimensionPixelOffset4 = context.getResources().getDimensionPixelOffset(R.dimen.ring_list_content_padding_end);
        itemView.setBackground(null);
        itemView.setPaddingRelative(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset4, dimensionPixelOffset3);
    }

    /* JADX INFO: renamed from: m */
    private boolean m6458m() {
        return this.f9310e.getDisplayType() == 2;
    }

    /* JADX INFO: renamed from: x */
    private void m6459x(View view, Resource resource, int group) {
        View viewFindViewById = view.findViewById(R.id.update_flag);
        if (viewFindViewById != null) {
            if (m6467o(resource)) {
                viewFindViewById.setVisibility(0);
            } else {
                viewFindViewById.setVisibility(8);
            }
        }
        if (com.android.thememanager.util.bwp.fn3e(com.android.thememanager.util.bwp.n7h(this.f9310e)) || !this.f9316w.mo9554q() || this.f9316w.mo9552k(resource)) {
            view.findViewById(R.id.root_flag).setBackgroundColor(bf2.toq.toq().getResources().getColor(android.R.color.transparent));
        } else {
            view.findViewById(R.id.root_flag).setBackgroundColor(bf2.toq.toq().getResources().getColor(R.color.resource_detail_over));
        }
        bf2((ImageView) view.findViewById(R.id.center_flag), ncyb(resource, group));
        bf2((ImageView) view.findViewById(R.id.bottom_flag), x9kr(resource, group));
        if (com.android.thememanager.util.bwp.ni7(this.f9310e.getResourceCode())) {
            boolean zBf2 = bf2((TextView) view.findViewById(R.id.top_flag_desktop), m6462c(resource, "wallpaper")) | bf2((TextView) view.findViewById(R.id.top_flag_lockscreen), m6462c(resource, "lockscreen")) | false;
            View viewFindViewById2 = view.findViewById(R.id.wallpaper_bg_container);
            if (viewFindViewById2 != null) {
                if (zBf2) {
                    viewFindViewById2.setVisibility(0);
                } else {
                    viewFindViewById2.setVisibility(8);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m6460a(com.android.thememanager.fu4 resContext) {
        this.f9310e = resContext;
        gvn7(com.android.thememanager.util.ch.x2(resContext.getDisplayType()));
    }

    public void a98o(com.android.thememanager.util.t8r handler) {
        this.f9316w = handler;
    }

    /* JADX INFO: renamed from: b */
    protected void mo6461b(View view, Resource resource) {
        TextView textView = (TextView) view.findViewById(R.id.current_using);
        if (textView == null) {
            if (zsr0.toq.m28221n(m6465l(), resource, com.android.thememanager.util.bwp.n7h(this.f9310e))) {
                C1812k.toq(view, com.android.thememanager.basemodule.utils.kja0.ld6(R.string.current_using));
                return;
            } else {
                C1812k.toq(view, resource.getTitle());
                return;
            }
        }
        String metaPath = new ResourceResolver(resource, this.f9310e).getMetaPath();
        if (metaPath == null || !metaPath.equals(this.f57346ab)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(R.string.current_using);
        }
    }

    /* JADX INFO: renamed from: c */
    protected int m6462c(Resource resource, String code) {
        if (com.android.thememanager.util.uc.oc(this.f9310e)) {
            return 0;
        }
        String metaPath = new ResourceResolver(resource, this.f9310e).getMetaPath();
        String strM9634s = com.android.thememanager.util.bwp.m9634s(this.f9313o.get(), code);
        if (metaPath == null || !metaPath.equals(strM9634s)) {
            return 0;
        }
        return R.drawable.me_current_using_flag;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void ch(android.widget.TextView r5, com.android.thememanager.basemodule.resource.model.Resource r6, int r7) {
        /*
            r4 = this;
            boolean r7 = r4.ek5k(r7)
            if (r7 == 0) goto L21
            com.android.thememanager.basemodule.resource.model.ResourceInfo r7 = r6.getOnlineInfo()
            long r0 = r7.getSize()
            r2 = 0
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L3a
            com.android.thememanager.basemodule.resource.model.ResourceInfo r6 = r6.getOnlineInfo()
            long r6 = r6.getSize()
            java.lang.String r6 = com.android.thememanager.util.ch.f7l8(r6)
            goto L3b
        L21:
            com.android.thememanager.basemodule.resource.model.ResourceInfo r6 = r6.getLocalInfo()
            java.lang.String r7 = "duration"
            java.lang.String r6 = r6.getExtraMeta(r7)
            if (r6 == 0) goto L32
            int r6 = java.lang.Integer.parseInt(r6)
            goto L33
        L32:
            r6 = -1
        L33:
            if (r6 <= 0) goto L3a
            java.lang.String r6 = com.android.thememanager.util.ch.m9670g(r6)
            goto L3b
        L3a:
            r6 = 0
        L3b:
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L44
            r7 = 8
            goto L45
        L44:
            r7 = 0
        L45:
            r5.setVisibility(r7)
            r5.setText(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.activity.pc.ch(android.widget.TextView, com.android.thememanager.basemodule.resource.model.Resource, int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.basemodule.async.AbstractC1712k
    /* JADX INFO: renamed from: d2ok, reason: merged with bridge method [inline-methods] */
    public void zy(View view, Resource data, int offset, int group) {
        if (m6458m()) {
            return;
        }
        List<PathEntry> listM6463e = m6463e(data, group);
        nmn5((ImageView) ((LinearLayout) ((LinearLayout) view).getChildAt(1)).getChildAt(offset).findViewById(R.id.thumbnail), data, listM6463e.isEmpty() ? null : listM6463e.get(0), group);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.util.List<com.android.thememanager.basemodule.resource.model.PathEntry> m6463e(com.android.thememanager.basemodule.resource.model.Resource r6, int r7) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.android.thememanager.model.ResourceResolver r1 = new com.android.thememanager.model.ResourceResolver
            com.android.thememanager.fu4 r2 = r5.f9310e
            r1.<init>(r6, r2)
            boolean r7 = r5.ek5k(r7)
            r2 = 0
            r3 = 0
            if (r7 != 0) goto L8e
            com.android.thememanager.fu4 r7 = r5.f9310e
            java.lang.String r7 = r7.getResourceCode()
            java.lang.String r4 = "statusbar"
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L3e
            java.util.List r6 = r1.getBuildInPreviews()
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L2e
        L2c:
            r6 = r3
            goto L75
        L2e:
            int r7 = r6.size()
            r4 = 1
            if (r7 <= r4) goto L36
            goto L37
        L36:
            r4 = r2
        L37:
            java.lang.Object r6 = r6.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            goto L75
        L3e:
            com.android.thememanager.fu4 r7 = r5.f9310e
            java.lang.String r7 = r7.getResourceCode()
            java.lang.String r4 = "theme"
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L51
            java.lang.String r6 = com.android.thememanager.basemodule.resource.C1792n.t8r(r6)
            goto L75
        L51:
            com.android.thememanager.fu4 r7 = r5.f9310e
            java.lang.String r7 = r7.getResourceCode()
            java.lang.String r4 = "icons"
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L64
            java.lang.String r6 = com.android.thememanager.basemodule.resource.C1792n.ld6(r6)
            goto L75
        L64:
            java.util.List r6 = r1.getBuildInThumbnails()
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L6f
            goto L2c
        L6f:
            java.lang.Object r6 = r6.get(r2)
            java.lang.String r6 = (java.lang.String) r6
        L75:
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L8e
            java.io.File r7 = new java.io.File
            r7.<init>(r6)
            boolean r7 = r7.isFile()
            if (r7 == 0) goto L8e
            com.android.thememanager.basemodule.resource.model.PathEntry r7 = new com.android.thememanager.basemodule.resource.model.PathEntry
            r7.<init>(r6, r3)
            r0.add(r7)
        L8e:
            boolean r6 = r0.isEmpty()
            if (r6 == 0) goto Lb1
            java.util.List r6 = r1.getThumbnails()
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L9f
            goto La6
        L9f:
            java.lang.Object r6 = r6.get(r2)
            r3 = r6
            com.android.thememanager.basemodule.resource.model.PathEntry r3 = (com.android.thememanager.basemodule.resource.model.PathEntry) r3
        La6:
            if (r3 == 0) goto Lb1
            java.lang.String r6 = r3.getLocalPath()
            if (r6 == 0) goto Lb1
            r0.add(r3)
        Lb1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.activity.pc.m6463e(com.android.thememanager.basemodule.resource.model.Resource, int):java.util.List");
    }

    protected abstract boolean ek5k(int group);

    /* JADX INFO: renamed from: f */
    protected String mo6386f(int group) {
        return null;
    }

    protected int hb(Resource resource, int group) {
        if ((com.android.thememanager.util.ch.dd(this.f9310e.getDisplayType()) || this.f9310e.getDisplayType() == 4) && this.f9310e.isVersionSupported()) {
            return m6464j(resource, group);
        }
        return 0;
    }

    protected int hyr(Resource resource, int group) {
        if (resource == null || !this.f9311j.m7690k().mo7478t(resource) || this.f9316w.mo9554q()) {
            return 0;
        }
        String metaPath = new ResourceResolver(resource, this.f9310e).getMetaPath();
        String strN7h = com.android.thememanager.util.bwp.n7h(this.f9310e);
        if (metaPath == null || !metaPath.equals(com.android.thememanager.util.bwp.m9634s(this.f9313o.get(), strN7h))) {
            return R.drawable.flag_downloaded;
        }
        if (com.android.thememanager.util.bwp.fn3e(strN7h)) {
            return R.drawable.rc_flag_using;
        }
        return 0;
    }

    protected void i1(View view, ViewGroup.LayoutParams params) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || params == null || layoutParams.height != params.height || layoutParams.width != params.width) {
            view.setLayoutParams(params);
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int position) {
        return false;
    }

    /* JADX INFO: renamed from: j */
    protected int m6464j(Resource resource, int group) {
        if (resource == null || !this.f9311j.m7690k().mcp(resource)) {
            return 0;
        }
        return R.drawable.flag_update_auto_mirrored;
    }

    /* JADX INFO: renamed from: l */
    public Activity m6465l() {
        WeakReference<Activity> weakReference = this.f9313o;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    protected final com.android.thememanager.basemodule.async.toq<Object, List<Resource>, List<Resource>> lrht() {
        Object obj = (Fragment) this.f9312m.get();
        Object obj2 = this.f9308b;
        if (obj2 != null) {
            obj = obj2;
        } else if (obj == null) {
            obj = (ComponentCallbacks) this.f9313o.get();
        }
        return (com.android.thememanager.basemodule.async.toq) obj;
    }

    protected void lvui(View view, int id, Resource resource, String text) {
        TextView textView = (TextView) view.findViewById(id);
        if (textView != null) {
            textView.setText(text + '\r');
            String metaPath = new ResourceResolver(resource, this.f9310e).getMetaPath();
            if (metaPath == null || !metaPath.equals(this.f57346ab)) {
                textView.setTextColor(bf2.toq.toq().getResources().getColor(R.color.resource_primary_color));
            } else {
                textView.setTextColor(bf2.toq.toq().getResources().getColor(R.color.setting_find_more_text));
            }
        }
    }

    @Override // com.android.thememanager.basemodule.async.AbstractC1712k
    /* JADX INFO: renamed from: n */
    public void mo6466n() {
        super.mo6466n();
        onClean(0);
    }

    protected int n5r1() {
        return com.android.thememanager.util.ch.m9687z(this.f9313o.get());
    }

    protected int ncyb(Resource resource, int group) {
        if (com.android.thememanager.util.ch.m9667c(this.f9310e.getDisplayType())) {
            return hyr(resource, group);
        }
        return 0;
    }

    protected void nmn5(ImageView view, Resource data, PathEntry thumbnailPath, int group) {
        if (view == null) {
            return;
        }
        String onlinePath = thumbnailPath != null ? ek5k(group) ? thumbnailPath.getOnlinePath() : thumbnailPath.getAbsoluteLocalPath() : "";
        if (com.android.thememanager.util.bwp.fn3e(this.f9310e.getResourceCode())) {
            x2.C1735g c1735gFn3e = com.android.thememanager.basemodule.imageloader.x2.fn3e();
            c1735gFn3e.m6793r(com.android.thememanager.basemodule.imageloader.x2.ki(C1819o.t8r(), 0.0f)).a9(false).fti(this.bb);
            if (C1807g.zurt()) {
                view.setScaleType(ImageView.ScaleType.FIT_START);
            }
            com.android.thememanager.basemodule.imageloader.x2.m6782y(this.f9313o.get(), onlinePath, view, c1735gFn3e);
            return;
        }
        x2.C1735g c1735gM6793r = com.android.thememanager.basemodule.imageloader.x2.fn3e().m6793r(com.android.thememanager.basemodule.imageloader.x2.ki(C1819o.t8r(), 0.0f));
        if (this.f9310e.getDisplayType() == 10 && this.bb) {
            c1735gM6793r.wvg(0);
        } else {
            c1735gM6793r.wvg(2);
        }
        if (this.f9310e.getDisplayType() == 5 && C1792n.n5r1(onlinePath)) {
            c1735gM6793r.jk(4);
            c1735gM6793r.mcp(new Rect(0, view.getResources().getDimensionPixelSize(R.dimen.local_icon_old_thumbnail_crop_top), this.f9307a, view.getResources().getDimensionPixelSize(R.dimen.local_icon_old_thumbnail_crop_bottom)));
        }
        com.android.thememanager.basemodule.imageloader.x2.m6782y(this.f9313o.get(), onlinePath, view, c1735gM6793r);
    }

    protected ViewGroup.LayoutParams nn86() {
        return new FrameLayout.LayoutParams(this.f9307a, this.f9317x);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        this.f57346ab = C1792n.toq(this.f9313o.get(), com.android.thememanager.util.bwp.n7h(this.f9310e));
        super.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: o */
    protected boolean m6467o(Resource resource) {
        return resource != null && this.f9311j.m7690k().mcp(resource);
    }

    @Override // com.android.thememanager.model.CleanMessage
    public void onClean(int cleanMsg) {
        com.android.thememanager.util.t8r t8rVar = this.f9316w;
        if (t8rVar != null) {
            t8rVar.toq();
        }
    }

    /* JADX INFO: renamed from: r */
    protected void mo6401r(View view, Resource resource, int groupIndex, int group) {
        if (resource == null) {
            return;
        }
        C1812k.toq(view, resource.getTitle());
        if (m6458m()) {
            lvui(view, android.R.id.title, resource, resource.getTitle());
            ch((TextView) view.findViewById(R.id.subTitle), resource, group);
            return;
        }
        i1(view.findViewById(R.id.thumbnail), nn86());
        i1(view.findViewById(R.id.root_flag), nn86());
        lvui(view, android.R.id.title, resource, resource.getTitle());
        mo6461b(view, resource);
        if (this.f9316w == null) {
            return;
        }
        m6459x(view, resource, group);
    }

    @Override // com.android.thememanager.basemodule.async.AbstractC1712k
    protected View toq(View view, List<Resource> data, int position, int groupPos, int group) {
        String strMo6386f;
        Activity activity = this.f9313o.get();
        LinearLayout linearLayout = (LinearLayout) view;
        int iX2 = x2();
        if (linearLayout == null) {
            if (activity == null) {
                return linearLayout;
            }
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(activity);
            LinearLayout linearLayout2 = new LinearLayout(activity);
            linearLayout2.setOrientation(1);
            View viewInflate = layoutInflaterFrom.inflate(R.layout.resource_page_item_title, (ViewGroup) null);
            viewInflate.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = bp;
            linearLayout2.addView(viewInflate, layoutParams);
            LinearLayout linearLayout3 = new LinearLayout(activity);
            linearLayout3.setOrientation(0);
            linearLayout3.setGravity(17);
            linearLayout2.addView(linearLayout3, layoutParams);
            int i2 = 0;
            while (i2 < iX2) {
                View viewOc = com.android.thememanager.util.ch.oc(this.f9310e.getDisplayType(), layoutInflaterFrom);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
                i2++;
                if (i2 < iX2) {
                    layoutParams2.setMarginEnd(this.f9314u);
                }
                if (com.android.thememanager.basemodule.utils.o1t.n7h() && com.android.thememanager.util.bwp.ki(this.f9310e.getResourceCode())) {
                    dd(activity, viewOc);
                }
                linearLayout3.addView(viewOc, layoutParams2);
            }
            linearLayout3.setEnabled(iX2 <= 1);
            linearLayout2.setDrawingCacheEnabled(true);
            linearLayout = linearLayout2;
        }
        View childAt = linearLayout.getChildAt(0);
        childAt.setVisibility(8);
        LinearLayout linearLayout4 = (LinearLayout) linearLayout.getChildAt(1);
        if (iX2 != 1) {
            int i3 = groupPos != 0 ? this.f9314u : this.f9315v;
            int i4 = ((com.android.thememanager.util.bwp.ni7(this.f9310e.getResourceCode()) || com.android.thememanager.util.bwp.t8r(this.f9310e.getResourceCode())) && groupPos == (((m6688s(group) + iX2) - 1) / iX2) - 1) ? this.f9309d : 0;
            int i5 = this.f57347bo;
            linearLayout4.setPaddingRelative(i5, i3, i5, i4);
        }
        for (int i6 = 0; i6 < iX2; i6++) {
            View childAt2 = linearLayout4.getChildAt(i6);
            int i7 = (groupPos * iX2) + i6;
            if (i6 < data.size()) {
                childAt2.setVisibility(0);
                mo6401r(childAt2, data.get(i6), i7, group);
                com.android.thememanager.util.t8r t8rVar = this.f9316w;
                if (t8rVar != null) {
                    t8rVar.zy(childAt2, new Pair<>(Integer.valueOf(i7), Integer.valueOf(group)));
                }
            } else {
                childAt2.setVisibility(4);
            }
        }
        if (groupPos == 0 && (strMo6386f = mo6386f(group)) != null) {
            childAt.setVisibility(0);
            TextView textView = (TextView) childAt.findViewById(R.id.item_title);
            textView.setText(strMo6386f);
            Resources resources = textView.getContext().getResources();
            View viewFindViewById = childAt.findViewById(R.id.item_layout);
            if (!ek5k(group)) {
                if (com.android.thememanager.util.bwp.ki(this.f9310e.getResourceCode())) {
                    if (com.android.thememanager.basemodule.utils.o1t.n7h()) {
                        childAt.findViewById(R.id.item_divider).setVisibility(0);
                        viewFindViewById.setBackground(null);
                        viewFindViewById.setPaddingRelative(activity.getResources().getDimensionPixelOffset(R.dimen.ring_list_content_padding_start), 0, 0, 0);
                    } else {
                        viewFindViewById.setBackground(resources.getDrawable(R.drawable.list_small_item_single_bg_n));
                    }
                    viewFindViewById.setMinimumHeight(resources.getDimensionPixelSize(R.dimen.resource_page_group_item_title_height));
                } else {
                    viewFindViewById.setBackgroundColor(resources.getColor(R.color.cards_bg_color));
                    textView.setPaddingRelative(this.f57347bo, textView.getPaddingTop(), textView.getPaddingEnd(), textView.getPaddingBottom());
                }
            }
            if (group <= 0) {
                childAt.findViewById(R.id.item_divider).setVisibility(8);
                childAt.findViewById(R.id.cards_divider).setVisibility(8);
            } else if (com.android.thememanager.util.bwp.ki(this.f9310e.getResourceCode()) && com.android.thememanager.basemodule.utils.o1t.n7h()) {
                childAt.findViewById(R.id.cards_divider).setVisibility(8);
            } else if (com.android.thememanager.util.bwp.ki(this.f9310e.getResourceCode())) {
                childAt.findViewById(R.id.cards_divider).setVisibility(0);
            } else {
                childAt.findViewById(R.id.item_divider).setVisibility(0);
            }
        }
        return linearLayout;
    }

    public com.android.thememanager.controller.x2 uv6() {
        return this.f9311j;
    }

    public com.android.thememanager.fu4 vyq() {
        return this.f9310e;
    }

    protected int x9kr(Resource resource, int group) {
        if (com.android.thememanager.util.ch.dd(this.f9310e.getDisplayType())) {
            return hyr(resource, group);
        }
        return 0;
    }

    protected void y9n() {
        Activity activity = this.f9313o.get();
        this.f57347bo = (int) activity.getResources().getDimension(R.dimen.default_horizontal_offset_from_screen_new);
        this.f9314u = (int) activity.getResources().getDimension(R.dimen.list_thumbnail_gap_new);
        if (this.f9310e.getDisplayType() == 10) {
            this.f9314u = ((int) activity.getResources().getDimension(R.dimen.stagger_divider)) * 2;
        } else if (this.f9310e.getDisplayType() == 5) {
            this.f57347bo = (int) activity.getResources().getDimension(R.dimen.horizontal_offset_from_screen_icon);
            this.f9314u = (int) activity.getResources().getDimension(R.dimen.list_thumbnail_gap_icon);
        }
        this.f9315v = com.android.thememanager.util.ch.m9671h(activity);
        this.f9309d = com.android.thememanager.util.ch.kja0(activity);
        Pair<Integer, Integer> pairD3 = com.android.thememanager.util.ch.d3(activity, this.f9310e.getDisplayType(), this.f57347bo, this.f9314u);
        this.f9307a = ((Integer) pairD3.first).intValue();
        this.f9317x = ((Integer) pairD3.second).intValue();
    }

    public void yz(com.android.thememanager.basemodule.async.toq<Object, List<Resource>, List<Resource>> observer) {
        this.f9308b = observer;
    }

    public void zp(com.android.thememanager.controller.x2 resController) {
        this.f9311j = resController;
    }

    public pc(Context context, com.android.thememanager.fu4 resContext) {
        this(null, context, resContext);
    }

    private pc(C1582h fragment, Context context, com.android.thememanager.fu4 resContext) {
        this.f9312m = new WeakReference<>(fragment);
        this.f9313o = new WeakReference<>((Activity) context);
        this.f9310e = resContext;
        if (context != null) {
            m6460a(resContext);
            fti(2);
            eqxt(30 / (x2() * 2));
            y9n();
            this.f57346ab = C1792n.toq(context, com.android.thememanager.util.bwp.n7h(resContext));
            this.bb = C1819o.d2ok(bf2.toq.toq());
            return;
        }
        throw new RuntimeException("invalid parameters: context can not both be null in ResourceAdapter.");
    }
}
