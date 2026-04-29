package com.android.thememanager.activity;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.FileObserver;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.ThemeResourceProxyTabActivity;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.resource.constants.C1788k;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.views.C1858p;
import com.android.thememanager.v9.adapter.toq;
import ek5k.C6002g;
import i1.C6077k;
import java.io.File;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import miuix.core.util.C7083n;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: LocalVideoListFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class ktq extends C1582h implements com.android.thememanager.basemodule.analysis.toq, toq.InterfaceC7941toq {

    /* JADX INFO: renamed from: a */
    private ValueAnimator f9138a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private boolean f57321ab;

    /* JADX INFO: renamed from: b */
    private boolean f9139b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private PopupWindow f57322bo;

    /* JADX INFO: renamed from: c */
    private TextView f9140c;

    /* JADX INFO: renamed from: d */
    private Intent f9141d;

    /* JADX INFO: renamed from: e */
    private View f9142e;

    /* JADX INFO: renamed from: f */
    private View f9143f;

    /* JADX INFO: renamed from: j */
    private View f9144j;

    /* JADX INFO: renamed from: m */
    private com.android.thememanager.v9.adapter.toq f9145m;

    /* JADX INFO: renamed from: o */
    private RecyclerView f9146o;

    /* JADX INFO: renamed from: u */
    private boolean f9147u;

    /* JADX INFO: renamed from: v */
    private ArrayList<ResolveInfo> f9148v;

    /* JADX INFO: renamed from: w */
    private FileObserver f9149w;

    /* JADX INFO: renamed from: x */
    private toq.zy f9150x = new C1596k();
    private p000a.zy bb = new C1597n();
    private p000a.zy bp = new f7l8();

    /* JADX INFO: compiled from: LocalVideoListFragment.java */
    class f7l8 implements p000a.zy {
        f7l8() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
            ktq.this.kbj();
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                com.android.thememanager.basemodule.utils.lvui.ki(ktq.this.getContext(), false);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.ktq$g */
    /* JADX INFO: compiled from: LocalVideoListFragment.java */
    class RunnableC1595g implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f9152k;

        /* JADX INFO: renamed from: com.android.thememanager.activity.ktq$g$k */
        /* JADX INFO: compiled from: LocalVideoListFragment.java */
        class k implements PopupWindow.OnDismissListener {
            k() {
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                com.android.thememanager.util.g1.gyi(com.android.thememanager.util.g1.f16471r, true);
                ktq.this.f9138a.cancel();
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.activity.ktq$g$toq */
        /* JADX INFO: compiled from: LocalVideoListFragment.java */
        class toq implements View.OnClickListener {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ PopupWindow f9155k;

            toq(final PopupWindow val$maskPopupWindow) {
                this.f9155k = val$maskPopupWindow;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View v2) {
                this.f9155k.dismiss();
            }
        }

        RunnableC1595g(final View val$view) {
            this.f9152k = val$view;
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewInflate = LayoutInflater.from(ktq.this.getActivity()).inflate(R.layout.video_wallpaper_import_guide, (ViewGroup) null, false);
            int iM7247h = com.android.thememanager.basemodule.utils.y9n.m7247h();
            if (iM7247h > 0) {
                viewInflate.setPadding(0, 0, 0, iM7247h);
            }
            PopupWindow popupWindow = new PopupWindow(viewInflate, -1, -1);
            popupWindow.setClippingEnabled(false);
            popupWindow.showAtLocation(this.f9152k, androidx.core.view.qrj.f50865toq, 0, 0);
            View viewFindViewById = viewInflate.findViewById(R.id.finger);
            ktq.this.f9138a = ValueAnimator.ofInt(0, C1819o.qrj(10.0f));
            ktq.this.f9138a.setDuration(800L);
            ktq.this.f9138a.setRepeatCount(-1);
            ktq.this.f9138a.setRepeatMode(1);
            ktq.this.f9138a.start();
            ktq.this.f9138a.addUpdateListener(new C1600y(viewFindViewById));
            popupWindow.setOnDismissListener(new k());
            viewInflate.setOnClickListener(new toq(popupWindow));
            ktq.this.f57322bo = popupWindow;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.ktq$k */
    /* JADX INFO: compiled from: LocalVideoListFragment.java */
    class C1596k implements toq.zy {
        C1596k() {
        }

        @Override // com.android.thememanager.v9.adapter.toq.zy
        /* JADX INFO: renamed from: k */
        public void mo6430k(boolean isEmpty) {
            ktq.this.f9140c.setVisibility(isEmpty ? 0 : 8);
            ktq.this.f9143f.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.ktq$n */
    /* JADX INFO: compiled from: LocalVideoListFragment.java */
    class C1597n implements p000a.zy {
        C1597n() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
            ktq.this.f9145m.mcp();
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                com.android.thememanager.basemodule.utils.lvui.ki(ktq.this.getContext(), false);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.ktq$q */
    /* JADX INFO: compiled from: LocalVideoListFragment.java */
    class ViewOnClickListenerC1598q implements View.OnClickListener {
        ViewOnClickListenerC1598q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.zalf));
            Intent intent = new Intent();
            intent.setAction(ThemeResourceProxyTabActivity.bl);
            intent.setPackage(bf2.toq.toq().getPackageName());
            intent.putExtra("EXTRA_TAB_ID", "videowallpaper");
            ktq.this.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.ktq$s */
    /* JADX INFO: compiled from: LocalVideoListFragment.java */
    private static class AsyncTaskC1599s extends AsyncTask<Void, Void, String> {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final String f57323zy = "ImportResourceAsyncTask";

        /* JADX INFO: renamed from: k */
        private WeakReference<ktq> f9160k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private Uri f57324toq;

        public AsyncTaskC1599s(ktq fragment, Uri uri) {
            this.f9160k = new WeakReference<>(fragment);
            this.f57324toq = uri;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v3, types: [android.content.Context, com.android.thememanager.ThemeApplication] */
        /* JADX WARN: Type inference failed for: r7v5 */
        /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.AutoCloseable] */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public String doInBackground(Void... params) throws Throwable {
            Throwable th;
            InputStream inputStreamOpenInputStream;
            if (isCancelled()) {
                return null;
            }
            ?? qVar = C2082k.zy().toq();
            String str = C1788k.f10167c + "LocalImport_" + com.android.thememanager.util.o1t.x2(String.valueOf(System.currentTimeMillis()));
            File file = new File(str);
            File file2 = new File(str + com.android.thememanager.basemodule.resource.constants.toq.lb);
            try {
                try {
                    inputStreamOpenInputStream = qVar.getContentResolver().openInputStream(this.f57324toq);
                    try {
                        File parentFile = file.getParentFile();
                        if (!parentFile.exists()) {
                            parentFile.mkdirs();
                        }
                        C7083n.m25589q(inputStreamOpenInputStream, file2);
                        file2.renameTo(file);
                        com.android.thememanager.basemodule.utils.y9n.m7246g(inputStreamOpenInputStream);
                        return file.getAbsolutePath();
                    } catch (Exception unused) {
                        if (file2.exists()) {
                            file2.delete();
                        }
                        com.android.thememanager.basemodule.utils.y9n.m7246g(inputStreamOpenInputStream);
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    com.android.thememanager.basemodule.utils.y9n.m7246g(qVar);
                    throw th;
                }
            } catch (Exception unused2) {
                inputStreamOpenInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                qVar = 0;
                com.android.thememanager.basemodule.utils.y9n.m7246g(qVar);
                throw th;
            }
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            ktq ktqVar = this.f9160k.get();
            if (ktqVar == null || !C1819o.eqxt(ktqVar.getActivity())) {
                return;
            }
            ktqVar.f9143f.setVisibility(0);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String result) {
            super.onPostExecute(result);
            ktq ktqVar = this.f9160k.get();
            if (ktqVar == null || !C1819o.eqxt(ktqVar.getActivity())) {
                return;
            }
            ktqVar.f9143f.setVisibility(8);
            if (TextUtils.isEmpty(result)) {
                com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.add_resource_detail_fail, 0);
            } else {
                ktqVar.f9145m.mcp();
            }
        }
    }

    /* JADX INFO: compiled from: LocalVideoListFragment.java */
    class toq extends FileObserver {
        toq(String path, int mask) {
            super(path, mask);
        }

        @Override // android.os.FileObserver
        public void onEvent(int event, @zy.dd String path) {
            ktq.this.f57321ab = true;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.ktq$y */
    /* JADX INFO: compiled from: LocalVideoListFragment.java */
    private static class C1600y implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: k */
        private WeakReference<View> f9162k;

        C1600y(View view) {
            this.f9162k = new WeakReference<>(view);
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@zy.lvui ValueAnimator animation) {
            WeakReference<View> weakReference = this.f9162k;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f9162k.get().setTranslationY(((Integer) animation.getAnimatedValue()).intValue());
        }
    }

    /* JADX INFO: compiled from: LocalVideoListFragment.java */
    class zy extends RecyclerView.kja0 {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ GridLayoutManager f9163k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ int f57325toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ int f57326zy;

        zy(final GridLayoutManager val$layoutManager, final int val$girdSpace, final int val$firstLineTopPadding) {
            this.f9163k = val$layoutManager;
            this.f57325toq = val$girdSpace;
            this.f57326zy = val$firstLineTopPadding;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.kja0
        /* JADX INFO: renamed from: n */
        public void mo4711n(Rect outRect, View view, RecyclerView parent, RecyclerView.mcp state) {
            C1858p.m7344k(outRect, parent, ktq.this.f9145m.getItemCount(), this.f9163k.ld6(), this.f57325toq, 0, this.f57326zy, 0, ((GridLayoutManager.toq) view.getLayoutParams()).zy(), 0);
        }
    }

    private void f1bi(View view) {
        if (com.android.thememanager.util.g1.x2(com.android.thememanager.util.g1.f16471r, false)) {
            return;
        }
        view.post(new RunnableC1595g(view));
    }

    private boolean gb() {
        return (this.f9147u || this.f9139b) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ob(View view) {
        if (com.android.thememanager.basemodule.utils.lvui.kja0(this, this.bp)) {
            return;
        }
        this.bp.mo0k();
    }

    private void tww7(View view) {
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.select_others_fab_stub);
        if (viewStub.getParent() != null) {
            viewStub.inflate();
        }
        View viewFindViewById = view.findViewById(R.id.select_others_fab);
        this.f9144j = viewFindViewById;
        viewFindViewById.setVisibility(0);
        C1812k.m7106k(this.f9144j, R.string.accessibiliy_description_content_add_resource);
        C6077k.a9(this.f9144j);
        this.f9144j.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.activity.uj2j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f9342k.ob(view2);
            }
        });
    }

    @Override // com.android.thememanager.v9.adapter.toq.InterfaceC7941toq
    /* JADX INFO: renamed from: h */
    public void mo6429h() {
        View view = this.f9144j;
        if (view != null) {
            view.setEnabled(true);
            C6077k.zy(this.f9144j);
        }
        View view2 = this.f9142e;
        if (view2 != null) {
            C6077k.zy(view2);
        }
    }

    public void kbj() {
        if (this.f9148v == null) {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            this.f9141d = intent;
            intent.addCategory("android.intent.category.OPENABLE");
            this.f9141d.setType("video/*");
            this.f9141d.putExtra("pick-need-origin", true);
            this.f9148v = com.android.thememanager.basemodule.utils.y9n.m7244c(this.f9141d);
        }
        C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.aq2a));
        Intent intent2 = new Intent(getActivity(), (Class<?>) ThirdPartyPickersActivity.class);
        intent2.setAction("android.intent.action.MAIN");
        intent2.putExtra("android.intent.extra.INTENT", this.f9141d);
        intent2.putExtra(ThirdPartyPickersActivity.f8901q, "videowallpaper");
        intent2.putParcelableArrayListExtra("extra_resolve_info_list", this.f9148v);
        startActivityForResult(intent2, 107);
    }

    @Override // com.android.thememanager.basemodule.base.toq
    public String m2t() {
        return this.f9147u ? com.android.thememanager.basemodule.analysis.toq.azz1 : com.android.thememanager.basemodule.analysis.toq.f1w3;
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (107 == requestCode && resultCode == -1 && data != null) {
            new AsyncTaskC1599s(this, data.getData()).executeOnExecutor(C6002g.ld6(), new Void[0]);
        }
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (kiv() != null) {
            this.f9139b = kiv().getBoolean(InterfaceC1357q.f53954vy, false);
        }
        toq toqVar = new toq(C1788k.f10167c, 768);
        this.f9149w = toqVar;
        toqVar.startWatching();
        com.android.thememanager.basemodule.utils.lvui.kja0(this, this.bb);
    }

    @Override // androidx.fragment.app.Fragment
    @zy.dd
    public View onCreateView(LayoutInflater inflater, @zy.dd ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragement_local_video_wallpaper_list, container, false);
    }

    @Override // com.android.thememanager.activity.C1582h, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onDestroy() {
        ValueAnimator valueAnimator = this.f9138a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        FileObserver fileObserver = this.f9149w;
        if (fileObserver != null) {
            fileObserver.stopWatching();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        com.android.thememanager.v9.adapter.toq toqVar = this.f9145m;
        if (toqVar != null) {
            toqVar.oc();
        }
        PopupWindow popupWindow = this.f57322bo;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        this.f57322bo.dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f57321ab) {
            this.f57321ab = false;
            this.f9145m.mcp();
        } else {
            this.f9145m.notifyDataSetChanged();
        }
        ArrayMap arrayMap = new ArrayMap(4);
        arrayMap.put("resourceType", this.f9059l.getResourceCode());
        C1708s.f7l8().ld6().cdj(C1706p.n7h(com.android.thememanager.basemodule.analysis.toq.tn, null, arrayMap));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@zy.lvui View view, @zy.dd Bundle savedInstanceState) {
        FrameLayout.LayoutParams layoutParams;
        super.onViewCreated(view, savedInstanceState);
        this.f9146o = (RecyclerView) view.findViewById(R.id.recycler_view);
        TextView textView = (TextView) view.findViewById(R.id.text_view);
        this.f9140c = textView;
        textView.setOnClickListener(new jz5());
        this.f9143f = view.findViewById(R.id.loading);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 3);
        this.f9146o.setLayoutManager(gridLayoutManager);
        this.f9146o.addItemDecoration(new zy(gridLayoutManager, getResources().getDimensionPixelSize(R.dimen.itemview_horizontal_padding_from_screen) / 2, getResources().getDimensionPixelSize(R.dimen.wallpaper_settings_category_recycler_view_padding_vertical)));
        this.f9147u = p001b.f7l8.f53794le7.equals(getActivity().getIntent().getAction());
        boolean booleanExtra = getActivity().getIntent().getBooleanExtra(p001b.f7l8.nc, true);
        com.android.thememanager.v9.adapter.toq toqVar = new com.android.thememanager.v9.adapter.toq(this, this.f9150x, this.f9147u ? 2 : 1, this.f9139b);
        this.f9145m = toqVar;
        toqVar.m10141t(this);
        this.f9146o.setAdapter(this.f9145m);
        this.f9145m.mcp();
        this.f9143f.setVisibility(0);
        if (this.f9147u && booleanExtra) {
            this.f9142e = view.findViewById(R.id.find_more_button);
            if (C1819o.d3() && com.android.thememanager.basemodule.utils.y9n.m7258z() && (layoutParams = (FrameLayout.LayoutParams) this.f9142e.getLayoutParams()) != null) {
                layoutParams.bottomMargin += com.android.thememanager.basemodule.utils.y9n.m7247h();
                this.f9142e.setLayoutParams(layoutParams);
            }
            C6077k.m22369i(this.f9142e);
            this.f9142e.setOnClickListener(new ViewOnClickListenerC1598q());
            this.f9142e.setVisibility(0);
        }
        if (gb()) {
            tww7(view);
            f1bi(view);
        }
    }

    @Override // com.android.thememanager.v9.adapter.toq.InterfaceC7941toq
    public void x2() {
        View view = this.f9144j;
        if (view != null) {
            view.setEnabled(false);
            C6077k.m22370k(this.f9144j);
        }
        View view2 = this.f9142e;
        if (view2 != null) {
            C6077k.m22370k(view2);
        }
    }
}
