package com.android.thememanager.v10.viewholder;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.InterfaceC0928g;
import androidx.lifecycle.InterfaceC0954z;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.analysis.kja0;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.basemodule.utils.lvui;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.controller.online.ld6;
import com.android.thememanager.controller.online.zurt;
import com.android.thememanager.fu4;
import com.android.thememanager.model.Page;
import com.android.thememanager.model.PageGroup;
import com.android.thememanager.model.WallpaperHistoryItem;
import com.android.thememanager.recommend.model.entity.element.CoverElement;
import com.android.thememanager.recommend.view.activity.RecommendActivity;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder;
import com.android.thememanager.settings.AlbumLoader;
import com.android.thememanager.settings.C2687z;
import com.android.thememanager.settings.WallpaperSettingsActivity;
import com.android.thememanager.settings.eqxt;
import com.android.thememanager.util.sok;
import com.android.thememanager.v9.model.PurchasedOrFavoritedCategory;
import com.google.gson.C4871g;
import ek5k.C6002g;
import i1.C6077k;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import miuix.appcompat.app.ki;
import miuix.smooth.SmoothFrameLayout2;
import p001b.InterfaceC1357q;
import yz.C7794k;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public class CoverViewHolder extends BaseViewHolder<CoverElement> implements InterfaceC1357q, com.android.thememanager.basemodule.analysis.toq {
    private static final String an = "super_wallpaper_list_page_action";
    private static final int as = 2;
    private static final int bl = 1;
    private static final String bp = "CoverViewHolder";
    private static final String bv = "support_super_wallpaper";
    private static final String id = "0";
    private static final int in = 0;

    /* JADX INFO: renamed from: a */
    @dd
    private AbstractC2831q f16944a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private ki f61446ab;

    /* JADX INFO: renamed from: b */
    private final fu4 f16945b;
    private p000a.zy bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private AsyncTaskC2833y f61447bo;

    /* JADX INFO: renamed from: c */
    private final String f16946c;

    /* JADX INFO: renamed from: d */
    private f7l8 f16947d;

    /* JADX INFO: renamed from: e */
    private final String f16948e;

    /* JADX INFO: renamed from: f */
    private final String f16949f;

    /* JADX INFO: renamed from: g */
    private AbstractActivityC1717k f16950g;

    /* JADX INFO: renamed from: h */
    private int f16951h;

    /* JADX INFO: renamed from: i */
    private boolean f16952i;

    /* JADX INFO: renamed from: j */
    private final String f16953j;

    /* JADX INFO: renamed from: l */
    private final String f16954l;

    /* JADX INFO: renamed from: m */
    private final String f16955m;

    /* JADX INFO: renamed from: o */
    private final String f16956o;

    /* JADX INFO: renamed from: p */
    private final ImageView f16957p;

    /* JADX INFO: renamed from: r */
    private final String f16958r;

    /* JADX INFO: renamed from: s */
    private final TextView f16959s;

    /* JADX INFO: renamed from: t */
    private final x2.C1735g f16960t;

    /* JADX INFO: renamed from: u */
    private AsyncTaskC2827g f16961u;

    /* JADX INFO: renamed from: v */
    private AsyncTaskC2829n f16962v;

    /* JADX INFO: renamed from: w */
    private final AlbumLoader f16963w;

    /* JADX INFO: renamed from: x */
    private AsyncTask<Context, Void, AbstractC2831q> f16964x;

    /* JADX INFO: renamed from: y */
    private final TextView f16965y;

    /* JADX INFO: renamed from: z */
    private boolean f16966z;

    private static class f7l8 extends AsyncTask<Void, sok<Integer, String, Integer>, Pair<Integer, String>> {

        /* JADX INFO: renamed from: k */
        private WeakReference<CoverViewHolder> f16968k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private boolean f61448toq = false;

        f7l8(CoverViewHolder holder) {
            this.f16968k = new WeakReference<>(holder);
        }

        private boolean toq(CommonResponse<PurchasedOrFavoritedCategory> response) {
            PurchasedOrFavoritedCategory purchasedOrFavoritedCategory;
            return (response == null || (purchasedOrFavoritedCategory = response.apiData) == null || purchasedOrFavoritedCategory.products == null) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Pair<Integer, String> doInBackground(Void... voidArr) {
            if (isCancelled() || !lvui.m7134z()) {
                return null;
            }
            Pair<Integer, WallpaperHistoryItem> pairM9381p = C2687z.m9381p();
            String path = ((WallpaperHistoryItem) pairM9381p.second).getPath();
            boolean zIsVideo = ((WallpaperHistoryItem) pairM9381p.second).isVideo();
            int iIntValue = ((Integer) pairM9381p.first).intValue();
            if (iIntValue != 0 && !TextUtils.isEmpty(path)) {
                path = com.android.thememanager.h5.f7l8.f12010h + path;
                publishProgress(new sok(Integer.valueOf(iIntValue), path, Integer.valueOf(zIsVideo ? 1 : 0)));
            }
            if (!C1688q.cdj().wvg()) {
                publishProgress(new sok(Integer.valueOf(iIntValue), path, Integer.valueOf(zIsVideo ? 1 : 0)));
                return null;
            }
            CommonResponse<PurchasedOrFavoritedCategory> commonResponseM9013p = com.android.thememanager.settings.fu4.m9011y().m9013p(1);
            if (toq(commonResponseM9013p)) {
                publishProgress(new sok(Integer.valueOf(commonResponseM9013p.apiData.total + iIntValue), commonResponseM9013p.apiData.products.size() > 0 ? commonResponseM9013p.apiData.products.get(0).imageUrl : null, 2));
            }
            zurt zurtVarD2ok = ld6.d2ok("wallpaper");
            zurtVarD2ok.addParameter("cardCount", "1");
            zurtVarD2ok.addParameter(InterfaceC1925p.a7on, String.valueOf(false));
            zurtVarD2ok.addParameter(InterfaceC1925p.ae9n, "1");
            try {
                File file = new File(com.android.thememanager.settings.fu4.m9011y().m9012g());
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                String strF7l8 = C1915g.f7l8(zurtVarD2ok);
                if (!TextUtils.isEmpty(strF7l8)) {
                    CommonResponse<PurchasedOrFavoritedCategory> commonResponse = (CommonResponse) new C4871g().kja0(strF7l8, CommonResponse.type(CommonResponse.class, PurchasedOrFavoritedCategory.class));
                    if (toq(commonResponse)) {
                        publishProgress(new sok(Integer.valueOf(commonResponse.apiData.total + iIntValue), commonResponse.apiData.products.size() > 0 ? commonResponse.apiData.products.get(0).imageUrl : null, 2));
                        C1821p.m7185i(file.getAbsolutePath(), strF7l8);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(sok<Integer, String, Integer>... values) {
            CoverViewHolder coverViewHolder = this.f16968k.get();
            if (coverViewHolder == null || !C1819o.eqxt(coverViewHolder.f16950g) || values == null || isCancelled()) {
                return;
            }
            if (!this.f61448toq) {
                String str = values[0].f61413toq;
                if (TextUtils.isEmpty(str)) {
                    coverViewHolder.f16957p.setImageResource(0);
                    coverViewHolder.f16957p.setTag(null);
                } else {
                    coverViewHolder.f16957p.setTag(values[0].f61414zy);
                    x2.m6781s(coverViewHolder.f16950g, str, coverViewHolder.f16957p, coverViewHolder.f16960t, this);
                    if (str.startsWith("file")) {
                        this.f61448toq = true;
                    }
                }
            }
            coverViewHolder.f16959s.setText(String.valueOf(values[0].f16799k));
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.v10.viewholder.CoverViewHolder$g */
    private static class AsyncTaskC2827g extends AsyncTask<Void, Void, Pair<Integer, WallpaperHistoryItem>> {

        /* JADX INFO: renamed from: k */
        private WeakReference<CoverViewHolder> f16969k;

        AsyncTaskC2827g(CoverViewHolder holder) {
            this.f16969k = new WeakReference<>(holder);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Pair<Integer, WallpaperHistoryItem> doInBackground(Void... params) {
            if (isCancelled()) {
                return null;
            }
            return C2687z.m9381p();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Pair<Integer, WallpaperHistoryItem> pair) {
            CoverViewHolder coverViewHolder = this.f16969k.get();
            if (coverViewHolder == null || !C1819o.eqxt(coverViewHolder.f16950g) || isCancelled()) {
                return;
            }
            coverViewHolder.f16957p.setTag(Integer.valueOf(((WallpaperHistoryItem) pair.second).isVideo() ? 1 : 0));
            if (TextUtils.isEmpty(((WallpaperHistoryItem) pair.second).getPath())) {
                coverViewHolder.f16957p.setImageResource(0);
            } else {
                x2.m6782y(coverViewHolder.f16950g, com.android.thememanager.h5.f7l8.f12010h + ((WallpaperHistoryItem) pair.second).getPath(), coverViewHolder.f16957p, coverViewHolder.f16960t);
            }
            coverViewHolder.f16959s.setText(String.valueOf(pair.first));
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.v10.viewholder.CoverViewHolder$k */
    class AsyncTaskC2828k extends AsyncTask<Context, Void, AbstractC2831q> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f16970k;

        AsyncTaskC2828k(final View val$itemView) {
            this.f16970k = val$itemView;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public AbstractC2831q doInBackground(Context... contexts) {
            return CoverViewHolder.this.zp(contexts[0]);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(AbstractC2831q info) {
            if (isCancelled()) {
                return;
            }
            CoverViewHolder.this.f16944a = info;
            CoverViewHolder.this.f16965y.setText(CoverViewHolder.this.f16944a.mo10117n());
            C1812k.zy(CoverViewHolder.this.f16944a.mo10117n(), CoverViewHolder.this.f16957p, this.f16970k);
            if (CoverViewHolder.this.f16944a instanceof C2832s) {
                CoverViewHolder.this.f16957p.setImageDrawable(CoverViewHolder.this.f16944a.zy());
            } else {
                CoverViewHolder.this.f16957p.setImageResource(CoverViewHolder.this.f16944a.mo10116k());
            }
            CoverViewHolder.this.f16959s.setText(CoverViewHolder.this.f16944a.toq());
            CoverViewHolder.this.f16959s.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.v10.viewholder.CoverViewHolder$n */
    private static class AsyncTaskC2829n extends AsyncTask<Void, Pair<Integer, String>, Void> {

        /* JADX INFO: renamed from: k */
        private WeakReference<CoverViewHolder> f16971k;

        AsyncTaskC2829n(CoverViewHolder holder) {
            this.f16971k = new WeakReference<>(holder);
        }

        private boolean toq(CommonResponse<PurchasedOrFavoritedCategory> response) {
            PurchasedOrFavoritedCategory purchasedOrFavoritedCategory;
            return (response == null || (purchasedOrFavoritedCategory = response.apiData) == null || purchasedOrFavoritedCategory.products == null) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voids) {
            if (!C1688q.cdj().wvg()) {
                publishProgress(new Pair[0]);
                return null;
            }
            CommonResponse<PurchasedOrFavoritedCategory> commonResponseM9013p = com.android.thememanager.settings.fu4.m9011y().m9013p(1);
            if (toq(commonResponseM9013p)) {
                publishProgress(new Pair(Integer.valueOf(commonResponseM9013p.apiData.total), commonResponseM9013p.apiData.products.size() > 0 ? commonResponseM9013p.apiData.products.get(0).imageUrl : null));
            }
            zurt zurtVarD2ok = ld6.d2ok("wallpaper");
            zurtVarD2ok.addParameter("cardCount", "1");
            zurtVarD2ok.addParameter(InterfaceC1925p.a7on, String.valueOf(false));
            zurtVarD2ok.addParameter(InterfaceC1925p.ae9n, "1");
            try {
                File file = new File(com.android.thememanager.settings.fu4.m9011y().m9012g());
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                String strF7l8 = C1915g.f7l8(zurtVarD2ok);
                if (!TextUtils.isEmpty(strF7l8)) {
                    CommonResponse<PurchasedOrFavoritedCategory> commonResponse = (CommonResponse) new C4871g().kja0(strF7l8, CommonResponse.type(CommonResponse.class, PurchasedOrFavoritedCategory.class));
                    if (toq(commonResponse)) {
                        publishProgress(new Pair(Integer.valueOf(commonResponse.apiData.total), commonResponse.apiData.products.size() > 0 ? commonResponse.apiData.products.get(0).imageUrl : null));
                        C1821p.m7185i(file.getAbsolutePath(), strF7l8);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Pair<Integer, String>... values) {
            CoverViewHolder coverViewHolder = this.f16971k.get();
            if (coverViewHolder == null || !C1819o.eqxt(coverViewHolder.f16950g)) {
                return;
            }
            if (values == null || values.length == 0) {
                if (C1688q.cdj().wvg()) {
                    return;
                }
                coverViewHolder.f16959s.setVisibility(4);
                coverViewHolder.f16957p.setImageResource(0);
                return;
            }
            coverViewHolder.f16959s.setVisibility(0);
            coverViewHolder.f16959s.setText(String.valueOf(values[0].first));
            if (TextUtils.isEmpty((CharSequence) values[0].second)) {
                coverViewHolder.f16957p.setImageResource(0);
            } else {
                x2.m6782y(coverViewHolder.f16950g, values[0].second, coverViewHolder.f16957p, coverViewHolder.f16960t);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.v10.viewholder.CoverViewHolder$p */
    private class C2830p extends AbstractC2831q {
        public C2830p(Context context) {
            super(context);
        }

        @Override // com.android.thememanager.v10.viewholder.CoverViewHolder.AbstractC2831q
        /* JADX INFO: renamed from: k */
        public int mo10116k() {
            return R.drawable.wallpaper_setting_tile_theme_bg;
        }

        @Override // com.android.thememanager.v10.viewholder.CoverViewHolder.AbstractC2831q
        /* JADX INFO: renamed from: n */
        public String mo10117n() {
            return this.f16973k.getResources().getString(R.string.gallery_wallpaper_theme);
        }

        @Override // com.android.thememanager.v10.viewholder.CoverViewHolder.AbstractC2831q
        /* JADX INFO: renamed from: q */
        public Intent mo10118q() {
            return RecommendActivity.etdu(this.f16973k, mo10117n(), z4.toq.m28204y(InterfaceC1357q.f53889ix), "wallpaper", false, false, false, false);
        }

        @Override // com.android.thememanager.v10.viewholder.CoverViewHolder.AbstractC2831q
        public Drawable zy() {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.v10.viewholder.CoverViewHolder$q */
    private abstract class AbstractC2831q {

        /* JADX INFO: renamed from: k */
        protected Context f16973k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        protected String f61450toq;

        AbstractC2831q(Context context) {
            this.f16973k = context;
        }

        /* JADX INFO: renamed from: g */
        public void m10119g(String params) {
            this.f61450toq = params;
        }

        /* JADX INFO: renamed from: k */
        public abstract int mo10116k();

        /* JADX INFO: renamed from: n */
        public abstract String mo10117n();

        /* JADX INFO: renamed from: q */
        public abstract Intent mo10118q();

        public String toq() {
            return (!Locale.getDefault().getLanguage().startsWith("zh") || Locale.getDefault().getCountry().equals("CN")) ? this.f16973k.getResources().getString(R.string.gallery_wallpaper_count) : this.f16973k.getResources().getString(R.string.gallery_wallpaper_count_tw);
        }

        public abstract Drawable zy();
    }

    /* JADX INFO: renamed from: com.android.thememanager.v10.viewholder.CoverViewHolder$s */
    private class C2832s extends AbstractC2831q {
        public C2832s(Context context) {
            super(context);
        }

        @Override // com.android.thememanager.v10.viewholder.CoverViewHolder.AbstractC2831q
        /* JADX INFO: renamed from: k */
        public int mo10116k() {
            return R.drawable.wallpaper_setting_tile_super_bg;
        }

        @Override // com.android.thememanager.v10.viewholder.CoverViewHolder.AbstractC2831q
        /* JADX INFO: renamed from: n */
        public String mo10117n() {
            return this.f16973k.getResources().getString(R.string.super_wallpaper);
        }

        @Override // com.android.thememanager.v10.viewholder.CoverViewHolder.AbstractC2831q
        /* JADX INFO: renamed from: q */
        public Intent mo10118q() {
            Intent intent = new Intent();
            intent.setAction(this.f61450toq);
            intent.setPackage("com.miui.miwallpaper");
            return intent;
        }

        @Override // com.android.thememanager.v10.viewholder.CoverViewHolder.AbstractC2831q
        public String toq() {
            Pair<Drawable, Integer> pairZkd;
            Context context = this.f16973k;
            return (!(context instanceof WallpaperSettingsActivity) || (pairZkd = ((WallpaperSettingsActivity) context).zkd()) == null) ? "0" : String.valueOf(pairZkd.second);
        }

        @Override // com.android.thememanager.v10.viewholder.CoverViewHolder.AbstractC2831q
        public Drawable zy() {
            Pair<Drawable, Integer> pairZkd;
            Context context = this.f16973k;
            if (!(context instanceof WallpaperSettingsActivity) || (pairZkd = ((WallpaperSettingsActivity) context).zkd()) == null) {
                return null;
            }
            return (Drawable) pairZkd.first;
        }
    }

    class toq implements p000a.zy {
        toq() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.v10.viewholder.CoverViewHolder$y */
    private static class AsyncTaskC2833y extends AsyncTask<Void, Void, k> {

        /* JADX INFO: renamed from: k */
        private final WeakReference<CoverViewHolder> f16976k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final fu4 f61452toq;

        /* JADX INFO: renamed from: com.android.thememanager.v10.viewholder.CoverViewHolder$y$k */
        private static class k {

            /* JADX INFO: renamed from: k */
            public int f16977k;

            /* JADX INFO: renamed from: q */
            public boolean f16978q;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            public String f61453toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            public boolean f61454zy;

            private k() {
            }
        }

        AsyncTaskC2833y(CoverViewHolder holder) {
            this.f16976k = new WeakReference<>(holder);
            this.f61452toq = holder.f16945b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public k doInBackground(Void... voidArr) {
            int size;
            int i2;
            int i3;
            List<Resource> list;
            Resource resource = null;
            Object[] objArr = 0;
            if (isCancelled()) {
                return null;
            }
            k kVar = new k();
            if (o1t.kja0()) {
                size = 0;
                for (com.android.thememanager.settings.subsettings.f7l8 f7l8Var : eqxt.t8r(true, false)) {
                    size += f7l8Var.f15456y;
                    if (resource == null && (list = f7l8Var.f60866zy) != null && list.size() > 0) {
                        resource = f7l8Var.f60866zy.get(0);
                        kVar.f61453toq = resource.getContentPath();
                    }
                }
            } else {
                List<Resource> listM8999i = eqxt.m8999i(false, this.f61452toq);
                int size2 = listM8999i.size();
                if (size2 > 0) {
                    String contentPath = listM8999i.get(0).getContentPath();
                    BitmapFactory.Options qVar = com.android.thememanager.basemodule.utils.ki.toq(contentPath);
                    kVar.f16978q = qVar != null && (i2 = qVar.outWidth) > 0 && (i3 = qVar.outHeight) > 0 && (i2 == i3 || (((float) i3) * 1.0f) / ((float) i2) < 1.1f);
                    kVar.f61453toq = contentPath;
                }
                List<Resource> listM8999i2 = eqxt.m8999i(true, null);
                kVar.f61454zy = listM8999i2.size() > 0;
                size = size2 + listM8999i2.size();
            }
            kVar.f16977k = size;
            return kVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(k result) {
            CoverViewHolder coverViewHolder;
            if (result == null || (coverViewHolder = this.f16976k.get()) == null || !C1819o.eqxt(coverViewHolder.f16950g) || isCancelled()) {
                return;
            }
            coverViewHolder.f16952i = result.f16978q;
            coverViewHolder.f16966z = result.f61454zy;
            x2.m6782y(coverViewHolder.f16950g, com.android.thememanager.h5.f7l8.f12010h + result.f61453toq, coverViewHolder.f16957p, coverViewHolder.f16960t);
            coverViewHolder.f16959s.setText(String.valueOf(result.f16977k));
        }
    }

    private static class zy implements AlbumLoader.InterfaceC2501k {

        /* JADX INFO: renamed from: k */
        private final WeakReference<CoverViewHolder> f16979k;

        zy(CoverViewHolder holder) {
            this.f16979k = new WeakReference<>(holder);
        }

        @Override // com.android.thememanager.settings.AlbumLoader.InterfaceC2501k
        /* JADX INFO: renamed from: k */
        public void mo8966k(AlbumLoader.toq info) {
            CoverViewHolder coverViewHolder = this.f16979k.get();
            if (coverViewHolder == null || !C1819o.eqxt(coverViewHolder.f16950g)) {
                return;
            }
            String str = null;
            int iM8967k = 0;
            if (info != null) {
                iM8967k = info.m8967k();
                str = com.android.thememanager.h5.f7l8.f12010h + info.toq();
            }
            if (lvui.m7134z()) {
                x2.m6782y(coverViewHolder.f16950g, str, coverViewHolder.f16957p, coverViewHolder.f16960t);
                coverViewHolder.f16959s.setText(String.valueOf(iM8967k));
            }
        }
    }

    public CoverViewHolder(View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.bb = new toq();
        this.f16965y = (TextView) itemView.findViewById(R.id.name);
        this.f16959s = (TextView) itemView.findViewById(R.id.count);
        this.f16957p = (ImageView) itemView.findViewById(R.id.cover);
        SmoothFrameLayout2 smoothFrameLayout2 = (SmoothFrameLayout2) itemView.findViewById(R.id.card_item_content);
        this.f16945b = C2082k.zy().m8001n().m10535g("wallpaper");
        this.f16960t = m10103a();
        this.f16963w = new AlbumLoader(itemView.getContext(), new zy(this));
        Resources resources = itemView.getResources();
        this.f16958r = resources.getString(R.string.local_photos);
        this.f16954l = resources.getString(R.string.recently_used);
        this.f16949f = resources.getString(R.string.title_system_wallpaper_resource);
        this.f16946c = resources.getString(R.string.favorite_list);
        this.f16948e = resources.getString(R.string.title_my_wallpaper);
        this.f16953j = resources.getString(R.string.wallpaper_static);
        this.f16956o = resources.getString(R.string.wallpaper_dynamic);
        this.f16955m = resources.getString(R.string.de_icon_text_favorite);
        if (itemView.getContext() instanceof AbstractActivityC1717k) {
            this.f16950g = (AbstractActivityC1717k) itemView.getContext();
            this.f16950g.bf2(new InterfaceC0928g() { // from class: com.android.thememanager.v10.viewholder.CoverViewHolder.1
                @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
                public void t8r(@zy.lvui InterfaceC0954z owner) {
                    CoverViewHolder.this.lv5();
                }
            });
        }
        AsyncTaskC2828k asyncTaskC2828k = new AsyncTaskC2828k(itemView);
        this.f16964x = asyncTaskC2828k;
        asyncTaskC2828k.executeOnExecutor(C6002g.ld6(), this.f16950g);
        smoothFrameLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.v10.viewholder.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16984k.ch(view);
            }
        });
        C6077k.o1t(smoothFrameLayout2);
    }

    /* JADX INFO: renamed from: a */
    private static x2.C1735g m10103a() {
        return x2.fn3e().jk(0).m6795z(true);
    }

    private void a98o() {
        AsyncTaskC2827g asyncTaskC2827g = this.f16961u;
        if (asyncTaskC2827g != null) {
            asyncTaskC2827g.cancel(true);
            this.f16961u = null;
        }
        AsyncTaskC2833y asyncTaskC2833y = this.f61447bo;
        if (asyncTaskC2833y != null) {
            asyncTaskC2833y.cancel(true);
            this.f61447bo = null;
        }
        AsyncTaskC2829n asyncTaskC2829n = this.f16962v;
        if (asyncTaskC2829n != null) {
            asyncTaskC2829n.cancel(true);
            this.f16962v = null;
        }
        f7l8 f7l8Var = this.f16947d;
        if (f7l8Var != null) {
            f7l8Var.cancel(true);
            this.f16947d = null;
        }
        AsyncTask<Context, Void, AbstractC2831q> asyncTask = this.f16964x;
        if (asyncTask != null) {
            asyncTask.cancel(false);
            this.f16964x = null;
        }
    }

    private Pair<Integer, List<PageGroup>> bf2(int thumbCategory) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m10111x(8, this.f16953j));
        arrayList.add(m10111x(9, this.f16956o));
        arrayList.add(m10111x(12, this.f16955m));
        int i2 = 1;
        if (thumbCategory == 0) {
            i2 = 0;
        } else if (thumbCategory != 1) {
            i2 = 2;
        }
        return new Pair<>(Integer.valueOf(i2), arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void bo() {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.v10.viewholder.CoverViewHolder.bo():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void ch(android.view.View r4) {
        /*
            r3 = this;
            int r4 = r3.f16951h
            r0 = 2
            r1 = 0
            if (r4 == r0) goto L30
            r0 = 3
            if (r4 == r0) goto L2c
            r0 = 4
            if (r4 == r0) goto L2c
            switch(r4) {
                case 8: goto L14;
                case 9: goto L2c;
                case 10: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L71
        L10:
            r3.m10110u()
            goto L71
        L14:
            com.android.thememanager.basemodule.account.q r4 = com.android.thememanager.basemodule.account.C1688q.cdj()
            boolean r4 = r4.wvg()
            if (r4 == 0) goto L22
            r3.bo()
            goto L71
        L22:
            com.android.thememanager.basemodule.account.q r4 = com.android.thememanager.basemodule.account.C1688q.cdj()
            com.android.thememanager.basemodule.base.k r0 = r3.f16950g
            r4.fti(r0, r1)
            goto L71
        L2c:
            r3.bo()
            goto L71
        L30:
            androidx.fragment.app.q r4 = r3.ki()
            com.android.thememanager.basemodule.base.k r4 = (com.android.thememanager.basemodule.base.AbstractActivityC1717k) r4
            a.zy r0 = r3.bb
            boolean r4 = com.android.thememanager.basemodule.utils.lvui.qrj(r4, r0)
            if (r4 != 0) goto L71
            com.android.thememanager.basemodule.base.k r4 = r3.f16950g
            r0 = 0
            boolean r4 = com.android.thememanager.basemodule.utils.C1803e.qrj(r4, r0)
            if (r4 != 0) goto L71
            miuix.appcompat.app.ki r4 = r3.f61446ab
            if (r4 != 0) goto L53
            com.android.thememanager.basemodule.base.k r4 = r3.f16950g
            miuix.appcompat.app.ki r4 = com.android.thememanager.basemodule.utils.C1819o.x2(r4)
            r3.f61446ab = r4
        L53:
            com.android.thememanager.basemodule.base.k r4 = r3.f16950g
            java.lang.String r4 = r4.mo6345a()
            java.lang.String r0 = "install_gallery_popup"
            java.lang.String r2 = ""
            android.util.ArrayMap r4 = com.android.thememanager.basemodule.analysis.C1706p.kja0(r0, r4, r2)
            com.android.thememanager.basemodule.analysis.s r0 = com.android.thememanager.basemodule.analysis.C1708s.f7l8()
            com.android.thememanager.basemodule.analysis.s$toq r0 = r0.ld6()
            r0.cdj(r4)
            miuix.appcompat.app.ki r4 = r3.f61446ab
            r4.show()
        L71:
            android.widget.TextView r4 = r3.f16965y
            java.lang.CharSequence r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "click_wallpaper_settings_page_category"
            com.android.thememanager.basemodule.analysis.kja0.f7l8(r0, r4, r1)
            com.android.thememanager.basemodule.analysis.s r4 = com.android.thememanager.basemodule.analysis.C1708s.f7l8()
            com.android.thememanager.basemodule.analysis.s$toq r4 = r4.ld6()
            android.widget.TextView r2 = r3.f16965y
            java.lang.CharSequence r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            android.util.ArrayMap r0 = com.android.thememanager.basemodule.analysis.C1706p.m6654q(r0, r2, r1)
            r4.ni7(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.v10.viewholder.CoverViewHolder.ch(android.view.View):void");
    }

    private List<PageGroup> i1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m10111x((this.f16952i ? 2 : 0) | 4, this.f16953j));
        if (this.f16966z) {
            arrayList.add(m10111x((this.f16952i ? 2 : 0) | 5, this.f16956o));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lv5() {
        a98o();
        int i2 = this.f16951h;
        if (i2 == 2) {
            this.f16963w.zy();
            return;
        }
        if (i2 == 3) {
            AsyncTaskC2827g asyncTaskC2827g = new AsyncTaskC2827g(this);
            this.f16961u = asyncTaskC2827g;
            asyncTaskC2827g.executeOnExecutor(C6002g.ld6(), new Void[0]);
            return;
        }
        if (i2 == 4) {
            AsyncTaskC2833y asyncTaskC2833y = new AsyncTaskC2833y(this);
            this.f61447bo = asyncTaskC2833y;
            asyncTaskC2833y.executeOnExecutor(C6002g.ld6(), new Void[0]);
        } else if (i2 == 8) {
            AsyncTaskC2829n asyncTaskC2829n = new AsyncTaskC2829n(this);
            this.f16962v = asyncTaskC2829n;
            asyncTaskC2829n.executeOnExecutor(C6002g.n7h(), new Void[0]);
        } else {
            if (i2 != 9) {
                return;
            }
            f7l8 f7l8Var = new f7l8(this);
            this.f16947d = f7l8Var;
            f7l8Var.executeOnExecutor(C6002g.ld6(), new Void[0]);
        }
    }

    public static CoverViewHolder nmn5(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new CoverViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.wallpaper_setting_cover_item, parent, false), adapter);
    }

    /* JADX INFO: renamed from: u */
    private void m10110u() {
        AbstractC2831q abstractC2831q = this.f16944a;
        if (abstractC2831q == null) {
            return;
        }
        try {
            this.f16950g.startActivityForResult(abstractC2831q.mo10118q(), 1);
        } catch (ActivityNotFoundException unused) {
            C7794k.toq(bp, "not found activity for startExternalActivity");
        }
    }

    /* JADX INFO: renamed from: x */
    private PageGroup m10111x(int flag, String title) {
        PageGroup pageGroup = new PageGroup();
        Page page = new Page();
        page.setFlag(flag);
        pageGroup.addPage(page);
        pageGroup.setTitle(title);
        return pageGroup;
    }

    private Pair<Integer, List<PageGroup>> y9n(int thumbCategory) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m10111x(8, this.f16953j));
        arrayList.add(m10111x(9, this.f16956o));
        return new Pair<>(Integer.valueOf(thumbCategory == 0 ? 0 : 1), arrayList);
    }

    private List<PageGroup> yz() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m10111x(12, this.f16953j));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC2831q zp(Context context) {
        try {
            Bundle bundleBwp = null;
            if (!C1807g.m7081r()) {
                bundleBwp = WallpaperSettingsActivity.bwp(context, Uri.parse(eqxt.f60779toq), eqxt.f60780zy, null, null);
            }
            if (bundleBwp != null) {
                boolean z2 = bundleBwp.getBoolean(bv, false);
                String string = bundleBwp.getString(an);
                if (z2 && string != null) {
                    C2832s c2832s = new C2832s(context);
                    c2832s.m10119g(string);
                    if (context instanceof WallpaperSettingsActivity) {
                        WallpaperSettingsActivity wallpaperSettingsActivity = (WallpaperSettingsActivity) context;
                        if (!wallpaperSettingsActivity.se().contains(com.android.thememanager.basemodule.analysis.toq.lx)) {
                            kja0.m6641s("T_EXPOSE", com.android.thememanager.basemodule.analysis.toq.mho, com.android.thememanager.basemodule.analysis.toq.lx, String.valueOf(0));
                            C1708s.f7l8().ld6().cdj(C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.mho, com.android.thememanager.basemodule.analysis.toq.lx, String.valueOf(0)));
                            wallpaperSettingsActivity.se().add(com.android.thememanager.basemodule.analysis.toq.lx);
                        }
                    }
                    return c2832s;
                }
            }
            C2830p c2830p = new C2830p(context);
            if (context instanceof WallpaperSettingsActivity) {
                WallpaperSettingsActivity wallpaperSettingsActivity2 = (WallpaperSettingsActivity) context;
                if (!wallpaperSettingsActivity2.se().contains(com.android.thememanager.basemodule.analysis.toq.lx)) {
                    kja0.m6641s("T_EXPOSE", com.android.thememanager.basemodule.analysis.toq.mho, com.android.thememanager.basemodule.analysis.toq.lx, String.valueOf(2));
                    C1708s.f7l8().ld6().cdj(C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.mho, com.android.thememanager.basemodule.analysis.toq.lx, String.valueOf(2)));
                    wallpaperSettingsActivity2.se().add(com.android.thememanager.basemodule.analysis.toq.lx);
                }
            }
            return c2830p;
        } catch (Throwable th) {
            if (context instanceof WallpaperSettingsActivity) {
                WallpaperSettingsActivity wallpaperSettingsActivity3 = (WallpaperSettingsActivity) context;
                if (!wallpaperSettingsActivity3.se().contains(com.android.thememanager.basemodule.analysis.toq.lx)) {
                    kja0.m6641s("T_EXPOSE", com.android.thememanager.basemodule.analysis.toq.mho, com.android.thememanager.basemodule.analysis.toq.lx, String.valueOf(-1));
                    C1708s.f7l8().ld6().cdj(C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.mho, com.android.thememanager.basemodule.analysis.toq.lx, String.valueOf(-1)));
                    wallpaperSettingsActivity3.se().add(com.android.thememanager.basemodule.analysis.toq.lx);
                }
            }
            throw th;
        }
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onDestroy(@zy.lvui InterfaceC0954z owner) {
        this.f16963w.m8965g();
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: t8iq, reason: merged with bridge method [inline-methods] */
    public void o1t(CoverElement item, int position) {
        int i2 = item.subType;
        this.f16951h = i2;
        if (i2 == 2) {
            this.f16965y.setText(this.f16958r);
            this.f16957p.setBackgroundResource(R.drawable.wallpaper_setting_tile_local_bg);
        } else if (i2 == 3) {
            this.f16965y.setText(this.f16954l);
            this.f16957p.setBackgroundResource(R.drawable.wallpaper_setting_tile_history_bg);
        } else if (i2 != 4) {
            switch (i2) {
                case 8:
                    this.f16965y.setText(this.f16946c);
                    this.f16957p.setBackgroundResource(R.drawable.wallpaper_setting_tile_favorite_bg);
                    break;
                case 9:
                    this.f16965y.setText(this.f16948e);
                    this.f16957p.setBackgroundResource(R.drawable.wallpaper_setting_tile_my_bg);
                    break;
                case 10:
                    AbstractC2831q abstractC2831q = this.f16944a;
                    if (abstractC2831q == null) {
                        return;
                    }
                    this.f16965y.setText(abstractC2831q.mo10117n());
                    AbstractC2831q abstractC2831q2 = this.f16944a;
                    if (abstractC2831q2 instanceof C2832s) {
                        this.f16957p.setImageDrawable(abstractC2831q2.zy());
                    } else {
                        this.f16957p.setImageResource(abstractC2831q2.mo10116k());
                    }
                    this.f16959s.setText(this.f16944a.toq());
                    this.f16959s.setVisibility(4);
                    break;
            }
        } else {
            this.f16965y.setText(this.f16949f);
            this.f16957p.setBackgroundResource(R.drawable.wallpaper_setting_tile_system_bg);
        }
        TextView textView = this.f16965y;
        if (textView != null && textView.getText() != null) {
            C1812k.zy(this.f16965y.getText().toString(), this.f16957p, this.itemView);
        }
        lv5();
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    public void zy() {
        super.zy();
        a98o();
    }
}
