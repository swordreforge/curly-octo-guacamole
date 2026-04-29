package com.android.thememanager.settings.subsettings;

import android.os.AsyncTask;
import android.util.Log;
import androidx.lifecycle.fti;
import androidx.lifecycle.lrht;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIPage;
import com.android.thememanager.router.recommend.entity.UIProduct;
import ek5k.C6002g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import retrofit2.C7639i;
import zy.dd;
import zy.y9n;

/* JADX INFO: compiled from: WidgetListViewModel.java */
/* JADX INFO: loaded from: classes2.dex */
public class cdj extends lrht {

    /* JADX INFO: renamed from: h */
    public static final Integer f15442h = 0;

    /* JADX INFO: renamed from: i */
    public static final Integer f15443i = 1;

    /* JADX INFO: renamed from: p */
    private static final String f15444p = "WidgetViewModel";

    /* JADX INFO: renamed from: s */
    private AsyncTaskC2613k f15446s;

    /* JADX INFO: renamed from: g */
    private final fti<ArrayList<C2615h>> f15445g = new fti<>(new ArrayList());

    /* JADX INFO: renamed from: y */
    private final fti<Integer> f15447y = new fti<>();

    /* JADX INFO: renamed from: com.android.thememanager.settings.subsettings.cdj$k */
    /* JADX INFO: compiled from: WidgetListViewModel.java */
    public static class AsyncTaskC2613k extends AsyncTask<Void, Object, ArrayList> {

        /* JADX INFO: renamed from: k */
        private cdj f15448k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f60856toq;

        public AsyncTaskC2613k(String uuid, cdj vm) {
            this.f60856toq = uuid;
            this.f15448k = vm;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ArrayList doInBackground(Void... voids) {
            if (isCancelled()) {
                return null;
            }
            return cdj.n5r1(cdj.uv6(this.f60856toq, 0));
        }

        @Override // android.os.AsyncTask
        protected void onCancelled() {
            this.f15448k = null;
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            this.f15448k.hyr().cdj(cdj.f15442h);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(ArrayList list) {
            super.onPostExecute(list);
            if (list == null) {
                this.f15448k.hyr().cdj(cdj.f15443i);
            }
            this.f15448k.m9171c().cdj(list);
        }
    }

    /* JADX INFO: renamed from: f */
    private static <T> T m9170f(retrofit2.toq<CommonResponse<T>> call) {
        C7639i<CommonResponse<T>> c7639iF7l8;
        try {
            c7639iF7l8 = call.f7l8();
        } catch (IOException e2) {
            Log.w(f15444p, "toUIWidget() :" + e2);
            c7639iF7l8 = null;
        }
        if (c7639iF7l8 == null) {
            Log.i(f15444p, "toUIWidget() response null.");
        } else if (c7639iF7l8.f7l8()) {
            CommonResponse<T> commonResponseM27986k = c7639iF7l8.m27986k();
            if (commonResponseM27986k != null) {
                return commonResponseM27986k.apiData;
            }
            Log.d(f15444p, "toUIWidget() CommonResponse null.");
        } else {
            Log.d(f15444p, "toUIWidget() res fail." + c7639iF7l8);
        }
        return null;
    }

    @dd
    public static ArrayList<C2615h> n5r1(UIPage uipage) {
        List<UICard> list;
        int size;
        if (uipage == null || (list = uipage.cards) == null || list.size() <= 0) {
            return null;
        }
        ArrayList<C2615h> arrayList = new ArrayList<>();
        for (UICard uICard : uipage.cards) {
            for (UIProduct uIProduct : uICard.products) {
                C2615h c2615h = new C2615h();
                c2615h.f15463n = uIProduct.darkModeImageUrl;
                c2615h.f15462k = uIProduct.uuid;
                c2615h.f60875toq = uIProduct.productUuid;
                c2615h.f60876zy = uIProduct.name;
                c2615h.f15465q = uIProduct.imageUrl;
                c2615h.f60874f7l8 = uIProduct.snapshotAspectRatio;
                c2615h.f15467y = uIProduct.widgetSizeCount;
                c2615h.f15466s = uIProduct.widgetSize;
                c2615h.f15464p = uICard.cardTypeOrdinal;
                arrayList.add(c2615h);
            }
            int i2 = uICard.cardTypeOrdinal;
            int i3 = ((i2 == 119 || i2 == 121 || i2 == 122 || i2 == 120) && (size = uICard.products.size() % 2) > 0) ? 2 - size : 0;
            if (i3 > 0) {
                for (int i4 = 0; i4 < i3; i4++) {
                    C2615h c2615h2 = new C2615h();
                    c2615h2.f15464p = 0;
                    arrayList.add(c2615h2);
                }
            }
        }
        return arrayList;
    }

    @dd
    @y9n
    public static UIPage uv6(String uuid, int cardStart) {
        return (UIPage) m9170f(((bz2.zy) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().toq(bz2.zy.class)).zy(uuid, cardStart, 50));
    }

    /* JADX INFO: renamed from: c */
    public fti<ArrayList<C2615h>> m9171c() {
        return this.f15445g;
    }

    public fti<Integer> hyr() {
        return this.f15447y;
    }

    public void lrht(String uuid, cdj vm) {
        AsyncTaskC2613k asyncTaskC2613k = new AsyncTaskC2613k(uuid, vm);
        this.f15446s = asyncTaskC2613k;
        asyncTaskC2613k.executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    @Override // androidx.lifecycle.lrht
    protected void ncyb() {
        super.ncyb();
        AsyncTaskC2613k asyncTaskC2613k = this.f15446s;
        if (asyncTaskC2613k != null) {
            asyncTaskC2613k.cancel(true);
        }
    }
}
