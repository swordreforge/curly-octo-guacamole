package com.android.thememanager.detail.theme.view.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.qrj;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.detail.theme.view.widget.C2001q;
import com.android.thememanager.detail.theme.view.widget.ResourceDetailPreview;
import com.android.thememanager.detail.theme.view.zy;
import com.android.thememanager.miuixcompat.C2206g;
import com.miui.maml.folme.AnimatedProperty;
import ek5k.C6002g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import miuix.recyclerview.widget.RecyclerView;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceDetailPreview extends RecyclerView {

    /* JADX INFO: renamed from: d */
    public static final String f11260d = "_v_";

    /* JADX INFO: renamed from: v */
    private static final String f11261v = "ResourceDetailPreview";

    /* JADX INFO: renamed from: w */
    public static final String f11262w = "_h_";

    /* JADX INFO: renamed from: a */
    private C2001q f11263a;

    /* JADX INFO: renamed from: b */
    private View f11264b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private int f58019bo;

    /* JADX INFO: renamed from: u */
    private androidx.activity.zy f11265u;

    /* JADX INFO: renamed from: x */
    private zy.InterfaceC2004k f11266x;

    private static class toq extends RecyclerView.kja0 {

        /* JADX INFO: renamed from: k */
        private int f11267k;

        public toq(int horizontalOffset) {
            this.f11267k = horizontalOffset;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        /* JADX INFO: renamed from: n */
        public void mo4711n(@lvui Rect outRect, @lvui View view, @lvui androidx.recyclerview.widget.RecyclerView parent, @lvui RecyclerView.mcp state) {
            int i2 = this.f11267k;
            outRect.set(i2, 0, i2, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class zy extends AsyncTask<Void, Void, List<String>> {

        /* JADX INFO: renamed from: k */
        private final WeakReference<com.android.thememanager.detail.theme.view.zy> f11268k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final String f58020toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int f58021zy;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean zy(LinkedList linkedList, String str) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                if (str.contains((String) it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        @SuppressLint({"NotifyDataSetChanged"})
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(List<String> result) {
            super.onPostExecute(result);
            if (result == null || this.f11268k.get() == null) {
                return;
            }
            this.f11268k.get().m7831z(result);
            this.f11268k.get().notifyDataSetChanged();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public List<String> doInBackground(Void... voids) {
            if (this.f11268k.get() == null) {
                return null;
            }
            List<String> listKi = this.f11268k.get().ki();
            if (y9n.mcp(listKi)) {
                return null;
            }
            float f2 = -1.0f;
            try {
                f2 = Float.parseFloat(this.f58020toq);
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
            }
            final LinkedList linkedList = new LinkedList();
            for (String str : C2206g.n7h()) {
                String qVar = p001b.toq.toq(str);
                if (!C1792n.m6947t(this.f58021zy, qVar)) {
                    Log.i(ResourceDetailPreview.f11261v, "RemoveUnsupportPreviewTask: resourceCode = " + qVar + ",mResourcePlatformVersion = " + this.f58021zy + ",miuixVersionNumber = " + f2 + ",packageName = " + str);
                    if (qVar != null) {
                        linkedList.add(qVar);
                    }
                }
            }
            if (linkedList.size() > 0) {
                return (List) listKi.stream().filter(new Predicate() { // from class: com.android.thememanager.detail.theme.view.widget.kja0
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ResourceDetailPreview.zy.zy(linkedList, (String) obj);
                    }
                }).collect(Collectors.toList());
            }
            return null;
        }

        private zy(com.android.thememanager.detail.theme.view.zy adapter, String resourceMiuixVersion, int resourcePlatformVersion) {
            this.f11268k = new WeakReference<>(adapter);
            this.f58020toq = resourceMiuixVersion;
            this.f58021zy = resourcePlatformVersion;
        }
    }

    public ResourceDetailPreview(@lvui Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean d2ok(String str) {
        return str.contains(f11260d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d3(String str, List list, int i2, int i3, int i4) {
        if (this.f11263a == null) {
            View viewInflate = View.inflate(getContext(), R.layout.de_full_preview, null);
            this.f11264b = viewInflate;
            this.f11263a = new C2001q(this, viewInflate, str, new C2001q.n() { // from class: com.android.thememanager.detail.theme.view.widget.s
                @Override // com.android.thememanager.detail.theme.view.widget.C2001q.n
                /* JADX INFO: renamed from: k */
                public final void mo7829k(int i5) {
                    this.f11402k.gvn7(i5);
                }
            }, list, i2 / i3);
        }
        View viewFindViewByPosition = getLayoutManager().findViewByPosition(i4);
        if (viewFindViewByPosition == null) {
            Log.e(f11261v, "show fail because view == null.");
            return;
        }
        int[] iArr = new int[2];
        if (C1807g.lvui() && C1819o.m7164r(getContext())) {
            viewFindViewByPosition.getLocationInWindow(iArr);
        } else {
            viewFindViewByPosition.getLocationOnScreen(iArr);
        }
        this.f11263a.m7828h(this.f11264b, i4, iArr[0] - 5, iArr[1] - 10, viewFindViewByPosition.getWidth(), viewFindViewByPosition.getHeight());
        androidx.activity.zy zyVar = this.f11265u;
        if (zyVar != null) {
            zyVar.m89s(true);
        }
        zy.InterfaceC2004k interfaceC2004k = this.f11266x;
        if (interfaceC2004k != null) {
            interfaceC2004k.mo7820k(i4);
        }
    }

    @hyr(30)
    private static Pair<List<String>, List<String>> dd(@lvui List<String> all) {
        int size = all.size() / 2;
        return all.get(0).startsWith("http") ? Pair.create(all.subList(0, size), all.subList(size, all.size())) : C1807g.zurt() ? Pair.create((List) all.stream().filter(new Predicate() { // from class: com.android.thememanager.detail.theme.view.widget.ld6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ResourceDetailPreview.oc((String) obj);
            }
        }).collect(Collectors.toList()), (List) all.stream().filter(new Predicate() { // from class: com.android.thememanager.detail.theme.view.widget.x2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ResourceDetailPreview.eqxt((String) obj);
            }
        }).collect(Collectors.toList())) : Pair.create((List) all.stream().filter(new Predicate() { // from class: com.android.thememanager.detail.theme.view.widget.qrj
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ResourceDetailPreview.d2ok((String) obj);
            }
        }).collect(Collectors.toList()), (List) all.stream().filter(new Predicate() { // from class: com.android.thememanager.detail.theme.view.widget.n7h
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ResourceDetailPreview.lvui((String) obj);
            }
        }).collect(Collectors.toList()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean eqxt(String str) {
        return str.contains(com.android.thememanager.basemodule.analysis.toq.mo) && !str.contains("lockstyle_outer");
    }

    private void fti() {
        setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        addItemDecoration(new toq(getResources().getDimensionPixelOffset(C1807g.m7081r() ? R.dimen.pad_detail_preview_half_offset : R.dimen.de_detail_preview_half_offset)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void gvn7(int i2) {
        getLayoutManager().scrollToPosition(i2);
    }

    private void jk(@lvui List<String> urls) {
        Point pointFn3e = y9n.fn3e();
        for (int i2 = 0; i2 < urls.size(); i2++) {
            String str = urls.get(i2);
            if (str != null) {
                urls.set(i2, str.replaceFirst("w\\d+", AnimatedProperty.PROPERTY_NAME_W + pointFn3e.x).replaceFirst("q\\d+", "q100"));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lvui(String str) {
        return str.contains(f11262w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean oc(String str) {
        return str.contains(com.android.thememanager.basemodule.analysis.toq.bp0b) && !str.contains("lockstyle_inner");
    }

    /* JADX INFO: renamed from: r */
    private static List<String> m7777r(List<String> previewUrls) {
        if (previewUrls != null) {
            ArrayList arrayList = null;
            for (String str : previewUrls) {
                if (str.contains("spwallpaper")) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(str);
                }
            }
            if (arrayList != null) {
                previewUrls.removeAll(arrayList);
            }
        }
        return previewUrls;
    }

    public boolean a9() {
        View view;
        if (this.f11263a == null || (view = this.f11264b) == null || view.getParent() == null) {
            return false;
        }
        boolean zN7h = this.f11263a.n7h();
        if (zN7h) {
            this.f11263a = null;
            androidx.activity.zy zyVar = this.f11265u;
            if (zyVar != null) {
                zyVar.m89s(false);
            }
        }
        return zN7h;
    }

    public int getFullPreviewCurrentIndex() {
        C2001q c2001q = this.f11263a;
        if (c2001q != null) {
            return c2001q.qrj();
        }
        return -1;
    }

    public boolean jp0y() {
        return this.f11263a != null;
    }

    public void setBackCallback(androidx.activity.zy backCallback) {
        this.f11265u = backCallback;
    }

    public void setData(@lvui List<String> previewUrlsAll, final int previewWidth, final int previewHeight, final String resourceCode, String resourceVersion, String resourceMiuiVersion, int resourcePlatformVersion) {
        if (C1807g.m7081r() && Build.VERSION.SDK_INT >= 30 && "theme".equals(resourceCode)) {
            Pair<List<String>, List<String>> pairDd = dd(previewUrlsAll);
            if (C1807g.zurt()) {
                previewUrlsAll = (List) (C1807g.m7083t(getContext()) ? pairDd.first : pairDd.second);
            } else {
                previewUrlsAll = (List) (C1819o.ncyb(getContext()) ? pairDd.second : pairDd.first);
            }
            jk(previewUrlsAll);
        }
        final List<String> list = previewUrlsAll;
        if (list == null || list.size() == 0) {
            return;
        }
        com.android.thememanager.detail.theme.view.zy zyVar = new com.android.thememanager.detail.theme.view.zy(m7777r(list), previewWidth, previewHeight, resourceVersion);
        zy.InterfaceC2004k interfaceC2004k = new zy.InterfaceC2004k() { // from class: com.android.thememanager.detail.theme.view.widget.p
            @Override // com.android.thememanager.detail.theme.view.zy.InterfaceC2004k
            /* JADX INFO: renamed from: k */
            public final void mo7820k(int i2) {
                this.f11374k.d3(resourceCode, list, previewHeight, previewWidth, i2);
            }
        };
        if (com.android.thememanager.basemodule.utils.qrj.m7199q(qrj.toq.THEME_DETAIL) || !"theme".equals(resourceCode)) {
            zyVar.o1t(interfaceC2004k);
        }
        setAdapter(zyVar);
        if (!C1807g.m7081r() && "theme".equals(resourceCode) && resourceMiuiVersion != null) {
            new zy(zyVar, resourceMiuiVersion, resourcePlatformVersion).executeOnExecutor(C6002g.ld6(), new Void[0]);
        }
        if (this.f58019bo > -1) {
            measure(0, 1073741824);
            interfaceC2004k.mo7820k(this.f58019bo);
        }
    }

    public void setFullViewIndex(int mFullViewIndex) {
        this.f58019bo = mFullViewIndex;
    }

    public void setOnItemClickListener(zy.InterfaceC2004k listener) {
        this.f11266x = listener;
    }

    public ResourceDetailPreview(@lvui Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ResourceDetailPreview(@lvui Context context, @dd AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f58019bo = -1;
        fti();
    }
}
