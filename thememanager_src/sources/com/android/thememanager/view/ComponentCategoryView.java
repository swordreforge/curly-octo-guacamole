package com.android.thememanager.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.android.thememanager.C2082k;
import com.android.thememanager.C2965z;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.vyq;
import com.android.thememanager.controller.C1902k;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.mine.local.view.recyclerview.adapter.LocalLargeIconAdapter;
import com.android.thememanager.mine.remote.view.activity.MineResourceTabActivity;
import com.android.thememanager.model.RecommendItem;
import com.android.thememanager.model.RecommendItemResolver;
import com.android.thememanager.router.detail.entity.VideoInfo;
import com.android.thememanager.router.detail.entity.VideoInfoUtils;
import com.android.thememanager.util.bwp;
import com.android.thememanager.util.gc3c;
import com.android.thememanager.view.FixedHeightGridView;
import com.google.gson.C4871g;
import ek5k.C6002g;
import i1.C6077k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p001b.InterfaceC1357q;

/* JADX INFO: loaded from: classes2.dex */
public class ComponentCategoryView extends LinearLayout implements p001b.f7l8, com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: g */
    public static final String f17223g = "CCV";

    /* JADX INFO: renamed from: p */
    public static final String f17224p = "category_type";

    /* JADX INFO: renamed from: s */
    public static final int f17225s = 1;

    /* JADX INFO: renamed from: y */
    public static final int f17226y = 0;

    /* JADX INFO: renamed from: k */
    private FixedHeightGridView f17227k;

    /* JADX INFO: renamed from: n */
    private Context f17228n;

    /* JADX INFO: renamed from: q */
    private int f17229q;

    /* JADX INFO: renamed from: com.android.thememanager.view.ComponentCategoryView$k */
    class C2881k implements AdapterView.OnItemClickListener {
        C2881k() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String str = (String) ComponentCategoryView.this.f17227k.getItemAtPosition(position);
            if (str == null) {
                return;
            }
            if (ComponentCategoryView.this.f17229q == 0) {
                ArrayMap<String, Object> arrayMapZy = C1706p.zy(com.android.thememanager.basemodule.analysis.toq.z4jl);
                arrayMapZy.put("resourceType", str);
                C1708s.f7l8().ld6().ni7(arrayMapZy);
                Intent intent = new Intent();
                com.android.thememanager.fu4 fu4VarM10535g = C2082k.zy().m8001n().m10535g(str);
                intent.putExtra("REQUEST_RESOURCE_CODE", fu4VarM10535g.getResourceCode());
                intent.putExtra("category_type", 0);
                intent.setClassName(fu4VarM10535g.getTabActivityPackage(), fu4VarM10535g.getTabActivityClass());
                if ("bootaudio".equals(str)) {
                    String qVar = C1792n.toq(view.getContext(), str);
                    if (qVar == null) {
                        qVar = "";
                    }
                    intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", Uri.parse(qVar));
                }
                ComponentCategoryView.this.getContext().startActivity(intent);
                return;
            }
            if (ComponentCategoryView.this.f17229q == 1) {
                ArrayMap<String, Object> arrayMapZy2 = C1706p.zy(com.android.thememanager.basemodule.analysis.toq.fm);
                arrayMapZy2.put("resourceType", str);
                com.android.thememanager.basemodule.analysis.kja0.f7l8(com.android.thememanager.basemodule.analysis.toq.x85, com.android.thememanager.basemodule.analysis.toq.fm, new C4871g().o1t(arrayMapZy2));
                C1708s.f7l8().ld6().ni7(C1706p.n7h(com.android.thememanager.basemodule.analysis.toq.x85, com.android.thememanager.basemodule.analysis.toq.fm, arrayMapZy2));
                Intent intentSok = MineResourceTabActivity.sok(ComponentCategoryView.this.getContext(), str);
                if (intentSok != null) {
                    int iKja0 = p001b.toq.kja0(str);
                    if (iKja0 != 0) {
                        intentSok.putExtra(InterfaceC1357q.f53857d2ok, iKja0);
                    } else {
                        intentSok.putExtra(InterfaceC1357q.f53857d2ok, R.string.app_name);
                    }
                    ((Activity) ComponentCategoryView.this.getContext()).startActivityForResult(intentSok, 1);
                    return;
                }
                RecommendItem recommendItem = new RecommendItem();
                recommendItem.setItemType(RecommendItem.RecommendType.LOCAL);
                recommendItem.setTitle(str);
                Intent forwardIntent = new RecommendItemResolver(recommendItem, C2082k.zy().m8001n().m10535g(str)).getForwardIntent();
                forwardIntent.putExtra("REQUEST_RESOURCE_CODE", str);
                int iKja02 = p001b.toq.kja0(str);
                if (iKja02 != 0) {
                    forwardIntent.putExtra(InterfaceC1357q.f53866eqxt, ComponentCategoryView.this.getContext().getString(iKja02));
                } else {
                    forwardIntent.putExtra(InterfaceC1357q.f53866eqxt, ComponentCategoryView.this.getContext().getString(R.string.app_name));
                }
                ((Activity) ComponentCategoryView.this.getContext()).startActivityForResult(forwardIntent, 1);
            }
        }
    }

    private static class toq extends AsyncTask<Void, Integer, Void> {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private WeakReference<ComponentCategoryView> f61491f7l8;

        /* JADX INFO: renamed from: g */
        private List<C2882q> f17232g;

        /* JADX INFO: renamed from: k */
        private final int f17233k;

        /* JADX INFO: renamed from: n */
        private List<String> f17234n;

        /* JADX INFO: renamed from: q */
        ArrayList<Integer> f17235q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f61492toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        ArrayList<Integer> f61493zy;

        /* synthetic */ toq(ComponentCategoryView componentCategoryView, List list, List list2, C2881k c2881k) {
            this(componentCategoryView, list, list2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... params) {
            for (int i2 = 0; i2 < this.f17234n.size(); i2++) {
                if (isCancelled()) {
                    return null;
                }
                String str = this.f17234n.get(i2);
                ArrayList<Resource> arrayList = new ArrayList();
                if ("videowallpaper".equals(str)) {
                    arrayList.addAll(ComponentCategoryView.m10224g());
                } else {
                    arrayList.addAll(ComponentCategoryView.f7l8(str).kja0());
                }
                if (bwp.ni7(str)) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (zsr0.toq.f7l8(((Resource) it.next()).getContentPath())) {
                            it.remove();
                        }
                    }
                } else if (bwp.ki(str)) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Resource resource = (Resource) it2.next();
                        if (C1902k.bq.equals(resource.getLocalId())) {
                            arrayList.remove(resource);
                            break;
                        }
                    }
                }
                if ("largeicons".equals(str)) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Resource resource2 : arrayList) {
                        String largeIconPackageName = resource2.getLocalInfo().getLargeIconPackageName();
                        if (largeIconPackageName == null) {
                            Log.w(ComponentCategoryView.f17223g, "CheckLocalResourceTask: " + resource2.getLocalInfo().getTitle() + " : " + resource2.getOnlineId());
                        } else if (linkedHashMap.containsKey(largeIconPackageName)) {
                            ((List) linkedHashMap.get(largeIconPackageName)).add(resource2);
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(resource2);
                            linkedHashMap.put(largeIconPackageName, arrayList2);
                        }
                    }
                    int size = 0;
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        if (LocalLargeIconAdapter.qo((String) entry.getKey()) != null) {
                            Iterator it3 = ((List) entry.getValue()).iterator();
                            int i3 = 0;
                            while (it3.hasNext()) {
                                if (!((Resource) it3.next()).getLocalInfo().isOfficial()) {
                                    i3++;
                                }
                            }
                            size += ((List) entry.getValue()).size();
                            if (i3 == ((List) entry.getValue()).size()) {
                                size++;
                            }
                        }
                    }
                    this.f61493zy.add(Integer.valueOf(size));
                } else {
                    this.f61493zy.add(Integer.valueOf(arrayList.size()));
                }
            }
            if (isCancelled()) {
                return null;
            }
            publishProgress(0);
            if (C1915g.m7550n()) {
                for (int i4 = 0; i4 < this.f17234n.size(); i4++) {
                    if (isCancelled()) {
                        return null;
                    }
                    com.android.thememanager.controller.ld6 ld6VarF7l8 = ComponentCategoryView.f7l8(this.f17234n.get(i4));
                    ld6VarF7l8.cdj(true, false);
                    this.f17235q.add(Integer.valueOf(ld6VarF7l8.x2()));
                }
                if (isCancelled()) {
                    return null;
                }
                publishProgress(1);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... values) {
            ComponentCategoryView componentCategoryView = this.f61491f7l8.get();
            if (componentCategoryView == null || isCancelled() || componentCategoryView.f17228n == null || !gc3c.cdj((Activity) componentCategoryView.f17228n)) {
                return;
            }
            int i2 = 0;
            if (values[0].intValue() == 0) {
                while (i2 < this.f17234n.size()) {
                    this.f17232g.get(i2).f17231k = this.f61493zy.get(i2).intValue();
                    i2++;
                }
            } else {
                while (i2 < this.f17234n.size()) {
                    this.f17232g.get(i2).f61490toq = this.f17235q.get(i2).intValue();
                    i2++;
                }
            }
            ((BaseAdapter) componentCategoryView.f17227k.getAdapter()).notifyDataSetChanged();
        }

        private toq(ComponentCategoryView view, List<String> moduleCodes, List<C2882q> localResList) {
            this.f17233k = 0;
            this.f61492toq = 1;
            this.f61493zy = new ArrayList<>();
            this.f17235q = new ArrayList<>();
            this.f61491f7l8 = new WeakReference<>(view);
            this.f17234n = moduleCodes;
            this.f17232g = localResList;
        }
    }

    private static class zy extends FixedHeightGridView.AbstractC2884k {

        /* JADX INFO: renamed from: g */
        private List<Integer> f17236g;

        /* JADX INFO: renamed from: h */
        private final int f17237h;

        /* JADX INFO: renamed from: i */
        private final int f17238i;

        /* JADX INFO: renamed from: l */
        private boolean f17239l;

        /* JADX INFO: renamed from: n */
        private List<Integer> f17240n;

        /* JADX INFO: renamed from: p */
        private final int f17241p;

        /* JADX INFO: renamed from: q */
        private List<String> f17242q;

        /* JADX INFO: renamed from: r */
        private Context f17243r;

        /* JADX INFO: renamed from: s */
        private toq f17244s;

        /* JADX INFO: renamed from: t */
        private int f17245t;

        /* JADX INFO: renamed from: y */
        private List<C2882q> f17246y;

        /* JADX INFO: renamed from: z */
        private WeakReference<ComponentCategoryView> f17247z;

        public zy(ComponentCategoryView view, List<String> flags, List<Integer> titleIds, List<Integer> icons, FixedHeightGridView fg) {
            super(fg);
            this.f17247z = new WeakReference<>(view);
            this.f17245t = view.getCategoryType();
            this.f17242q = flags;
            this.f17240n = titleIds;
            this.f17236g = icons;
            this.f17246y = new ArrayList();
            Context context = view.getContext();
            this.f17243r = context;
            this.f17238i = Math.round(context.getResources().getDimension(R.dimen.local_grid_margin_inner));
            this.f17237h = Math.round(this.f17243r.getResources().getDimension(R.dimen.local_grid_margin_bottom));
            this.f17241p = Math.round(this.f17243r.getResources().getDimension(R.dimen.component_list_grid_item_horizontal_side_margin));
            for (int i2 = 0; i2 < flags.size(); i2++) {
                this.f17246y.add(new C2882q(null));
            }
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f17242q.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int position) {
            return this.f17242q.get(position);
        }

        @Override // android.widget.Adapter
        public long getItemId(int position) {
            return position;
        }

        @Override // com.android.thememanager.view.FixedHeightGridView.AbstractC2884k
        /* JADX INFO: renamed from: k */
        public View mo10232k(int position, View convertView, ViewGroup parent) {
            C2882q c2882q;
            int i2;
            if (this.f17239l) {
                convertView = null;
            }
            if (convertView == null) {
                if (1 == this.f17245t) {
                    convertView = LayoutInflater.from(this.f17243r).inflate(com.android.thememanager.basemodule.utils.zurt.m7261k(R.layout.local_resource_category_view, R.layout.local_resource_category_view_elder), (ViewGroup) null);
                } else {
                    convertView = LayoutInflater.from(this.f17243r).inflate(com.android.thememanager.basemodule.utils.zurt.m7261k(R.layout.component_list_grid_item, R.layout.component_list_grid_item_elder), (ViewGroup) null);
                    LinearLayout linearLayout = (LinearLayout) convertView.findViewById(R.id.item_layout);
                    if (position % 2 == 0) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                        layoutParams.setMargins(this.f17241p, 0, this.f17238i, this.f17237h);
                        linearLayout.setLayoutParams(layoutParams);
                    } else {
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                        layoutParams2.setMargins(this.f17238i, 0, this.f17241p, this.f17237h);
                        linearLayout.setLayoutParams(layoutParams2);
                    }
                }
                C6077k.o1t(convertView);
            }
            if (position < this.f17242q.size()) {
                String str = this.f17242q.get(position);
                TextView textView = (TextView) convertView.findViewById(R.id.title);
                if (this.f17240n != null) {
                    textView.setText(this.f17243r.getResources().getString(this.f17240n.get(position).intValue()));
                } else {
                    int iKja0 = p001b.toq.kja0(str);
                    if (iKja0 != 0) {
                        textView.setText(iKja0);
                    }
                }
                ((ImageView) convertView.findViewById(R.id.icon)).setImageResource(this.f17236g.get(position).intValue());
                TextView textView2 = (TextView) convertView.findViewById(R.id.summary);
                int i3 = this.f17245t;
                if (i3 == 0) {
                    String strFu4 = vyq.fu4(str);
                    if (TextUtils.isEmpty(strFu4)) {
                        strFu4 = this.f17243r.getString(R.string.theme_description_title_default);
                    }
                    textView2.setText(strFu4);
                } else if (i3 == 1 && (i2 = (c2882q = this.f17246y.get(position)).f17231k) != -1) {
                    textView2.setText(String.valueOf(i2));
                    View viewFindViewById = convertView.findViewById(R.id.updatable_icon);
                    if (c2882q.f61490toq == 0) {
                        viewFindViewById.setVisibility(8);
                    } else {
                        viewFindViewById.setVisibility(0);
                    }
                }
            } else {
                convertView.setEnabled(false);
                convertView.findViewById(R.id.icon).setEnabled(false);
            }
            return convertView;
        }

        public void toq() {
            toq toqVar = this.f17244s;
            if (toqVar != null) {
                toqVar.cancel(false);
            }
            if (this.f17247z.get() == null) {
                Log.d(ComponentCategoryView.f17223g, "loadData mViewRef.get() == null");
                return;
            }
            toq toqVar2 = new toq(this.f17247z.get(), this.f17242q, this.f17246y, null);
            this.f17244s = toqVar2;
            toqVar2.executeOnExecutor(C6002g.ld6(), new Void[0]);
        }

        public void zy(boolean needRefreshView) {
            this.f17239l = needRefreshView;
        }
    }

    public ComponentCategoryView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.android.thememanager.controller.ld6 f7l8(String componentCode) {
        C2965z c2965zM8001n = C2082k.zy().m8001n();
        return c2965zM8001n.ld6(c2965zM8001n.m10535g(componentCode)).m7690k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static List<Resource> m10224g() {
        ArrayList arrayList = new ArrayList();
        List<VideoInfo> listFetchVideoInfo = VideoInfoUtils.fetchVideoInfo(true, true);
        if (!com.android.thememanager.basemodule.utils.kja0.qrj(listFetchVideoInfo)) {
            for (VideoInfo videoInfo : listFetchVideoInfo) {
                Resource resource = videoInfo.mSuperWallpaperResource;
                if (resource != null) {
                    arrayList.add(resource);
                } else {
                    Resource resource2 = new Resource();
                    resource2.getLocalInfo().setTitle(videoInfo.name);
                    resource2.setContentPath(videoInfo.path);
                    arrayList.add(resource2);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    private void m10228y() {
        this.f17227k = (FixedHeightGridView) findViewById(R.id.grid);
        this.f17228n = getContext();
    }

    public int getCategoryType() {
        return this.f17229q;
    }

    /* JADX INFO: renamed from: p */
    public void m10229p() {
        this.f17227k.m10239k();
        ((zy) this.f17227k.getAdapter()).zy(true);
        invalidate();
    }

    /* JADX INFO: renamed from: s */
    public void m10230s() {
        zy zyVar = (zy) this.f17227k.getAdapter();
        if (this.f17229q == 1) {
            zyVar.toq();
        } else {
            zyVar.notifyDataSetChanged();
        }
    }

    public void setComponentItems(List<String> componentFlags, List<Integer> componentTitles, List<Integer> componentIcons, int categoryType) {
        m10228y();
        this.f17229q = categoryType;
        if (this.f17227k.getAdapter() != null) {
            throw new RuntimeException("GridView has been set adater.");
        }
        if (this.f17229q == 1) {
            int dimensionPixelOffset = this.f17228n.getResources().getDimensionPixelOffset(R.dimen.me_category_gap);
            this.f17227k.setHorizontalSpacing(dimensionPixelOffset);
            this.f17227k.setVerticalSpacing(dimensionPixelOffset);
        }
        this.f17227k.setAdapter((ListAdapter) new zy(this, componentFlags, componentTitles, componentIcons, this.f17227k));
        this.f17227k.setSelector(new ColorDrawable(0));
        this.f17227k.setVisibility(0);
        this.f17227k.setOnItemClickListener(new C2881k());
    }

    public void setNeedRefreshView(boolean needRefreshView) {
        zy zyVar = (zy) this.f17227k.getAdapter();
        if (zyVar != null) {
            zyVar.zy(needRefreshView);
        }
    }

    public ComponentCategoryView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    /* JADX INFO: renamed from: com.android.thememanager.view.ComponentCategoryView$q */
    private static class C2882q {

        /* JADX INFO: renamed from: k */
        public int f17231k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public int f61490toq;

        private C2882q() {
            this.f17231k = -1;
            this.f61490toq = 0;
        }

        /* synthetic */ C2882q(C2881k c2881k) {
            this();
        }
    }

    public ComponentCategoryView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
