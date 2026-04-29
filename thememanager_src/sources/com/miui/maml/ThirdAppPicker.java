package com.miui.maml;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C0924e;
import androidx.lifecycle.uv6;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.activity.C1561b;
import com.android.thememanager.activity.bek6;
import com.android.thememanager.basemodule.imageloader.x2;
import cyoe.InterfaceC5979h;
import ek5k.f7l8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.C6318m;
import kotlin.coroutines.InterfaceC6216q;
import kotlin.coroutines.intrinsics.C6199q;
import kotlin.coroutines.jvm.internal.InterfaceC6205g;
import kotlin.coroutines.jvm.internal.kja0;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import kotlinx.coroutines.C6708p;
import kotlinx.coroutines.InterfaceC6556f;
import kotlinx.coroutines.dd;
import miuix.appcompat.app.AbstractC6946k;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ThirdAppPicker.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ThirdAppPicker extends bek6 implements View.OnClickListener {

    @InterfaceC7395n
    private List<AppData> mAllApps;

    @InterfaceC7395n
    private PackageManager mPackageManager;

    @InterfaceC7396q
    private List<ResolveInfo> mResolveInfoList = new ArrayList();
    private C1561b mVm;

    /* JADX INFO: compiled from: ThirdAppPicker.kt */
    public static final class AppData extends ResolveInfo {

        @InterfaceC7395n
        private final Drawable image;

        @InterfaceC7395n
        private final ResolveInfo info;

        @InterfaceC7395n
        private final String label;

        public AppData(@InterfaceC7395n String str, @InterfaceC7395n Drawable drawable, @InterfaceC7395n ResolveInfo resolveInfo) {
            super(resolveInfo);
            this.label = str;
            this.image = drawable;
            this.info = resolveInfo;
        }

        public static /* synthetic */ AppData copy$default(AppData appData, String str, Drawable drawable, ResolveInfo resolveInfo, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = appData.label;
            }
            if ((i2 & 2) != 0) {
                drawable = appData.image;
            }
            if ((i2 & 4) != 0) {
                resolveInfo = appData.info;
            }
            return appData.copy(str, drawable, resolveInfo);
        }

        @InterfaceC7395n
        public final String component1() {
            return this.label;
        }

        @InterfaceC7395n
        public final Drawable component2() {
            return this.image;
        }

        @InterfaceC7395n
        public final ResolveInfo component3() {
            return this.info;
        }

        @InterfaceC7396q
        public final AppData copy(@InterfaceC7395n String str, @InterfaceC7395n Drawable drawable, @InterfaceC7395n ResolveInfo resolveInfo) {
            return new AppData(str, drawable, resolveInfo);
        }

        public boolean equals(@InterfaceC7395n Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppData)) {
                return false;
            }
            AppData appData = (AppData) obj;
            return d2ok.f7l8(this.label, appData.label) && d2ok.f7l8(this.image, appData.image) && d2ok.f7l8(this.info, appData.info);
        }

        @InterfaceC7395n
        public final Drawable getImage() {
            return this.image;
        }

        @InterfaceC7395n
        public final ResolveInfo getInfo() {
            return this.info;
        }

        @InterfaceC7395n
        public final String getLabel() {
            return this.label;
        }

        public int hashCode() {
            String str = this.label;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Drawable drawable = this.image;
            int iHashCode2 = (iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
            ResolveInfo resolveInfo = this.info;
            return iHashCode2 + (resolveInfo != null ? resolveInfo.hashCode() : 0);
        }

        @Override // android.content.pm.ResolveInfo
        @InterfaceC7396q
        public String toString() {
            return "AppData(label=" + this.label + ", image=" + this.image + ", info=" + this.info + ')';
        }
    }

    /* JADX INFO: compiled from: ThirdAppPicker.kt */
    private final class FileListAdapter extends RecyclerView.AbstractC1060y<VH> {

        @InterfaceC7396q
        private final Activity mActivity;

        @InterfaceC7396q
        private final View.OnClickListener mClickListener;

        @InterfaceC7396q
        private final LayoutInflater mInflater;
        final /* synthetic */ ThirdAppPicker this$0;

        public FileListAdapter(@InterfaceC7396q ThirdAppPicker thirdAppPicker, @InterfaceC7396q Activity activity, View.OnClickListener listener) {
            d2ok.m23075h(activity, "activity");
            d2ok.m23075h(listener, "listener");
            this.this$0 = thirdAppPicker;
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(activity);
            d2ok.kja0(layoutInflaterFrom, "from(...)");
            this.mInflater = layoutInflaterFrom;
            this.mClickListener = listener;
            this.mActivity = activity;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        public int getItemCount() {
            if (this.this$0.mAllApps != null) {
                List list = this.this$0.mAllApps;
                d2ok.qrj(list);
                if (list.size() > 0) {
                    List list2 = this.this$0.mAllApps;
                    d2ok.qrj(list2);
                    return list2.size();
                }
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        public void onBindViewHolder(@InterfaceC7396q VH vh, int i2) {
            d2ok.m23075h(vh, "vh");
            List list = this.this$0.mAllApps;
            AppData appData = list != null ? (AppData) list.get(i2) : null;
            x2.zy(this.mActivity, appData != null ? appData.getImage() : null, vh.getIcon());
            vh.getName().setText(appData != null ? appData.getLabel() : null);
            vh.itemView.setTag(Integer.valueOf(i2));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
        @InterfaceC7396q
        public VH onCreateViewHolder(@InterfaceC7396q ViewGroup parent, int i2) {
            d2ok.m23075h(parent, "parent");
            View.OnClickListener onClickListener = this.mClickListener;
            View viewInflate = this.mInflater.inflate(com.android.thememanager.R.layout.app_list_item, parent, false);
            d2ok.kja0(viewInflate, "inflate(...)");
            return new VH(onClickListener, viewInflate);
        }
    }

    /* JADX INFO: compiled from: ThirdAppPicker.kt */
    private static final class VH extends RecyclerView.fti {

        @InterfaceC7396q
        private final ImageView icon;

        @InterfaceC7396q
        private final TextView name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VH(@InterfaceC7395n View.OnClickListener onClickListener, @InterfaceC7396q View view) {
            super(view);
            d2ok.m23075h(view, "view");
            View viewFindViewById = view.findViewById(com.android.thememanager.R.id.app_icon);
            d2ok.kja0(viewFindViewById, "findViewById(...)");
            this.icon = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(com.android.thememanager.R.id.app_name);
            d2ok.kja0(viewFindViewById2, "findViewById(...)");
            this.name = (TextView) viewFindViewById2;
            view.setOnClickListener(onClickListener);
        }

        @InterfaceC7396q
        public final ImageView getIcon() {
            return this.icon;
        }

        @InterfaceC7396q
        public final TextView getName() {
            return this.name;
        }
    }

    /* JADX INFO: renamed from: com.miui.maml.ThirdAppPicker$onCreate$1 */
    /* JADX INFO: compiled from: ThirdAppPicker.kt */
    @InterfaceC6205g(m22755c = "com.miui.maml.ThirdAppPicker$onCreate$1", m22756f = "ThirdAppPicker.kt", m22757i = {}, m22758l = {56}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
    static final class C51461 extends kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super was>, Object> {
        final /* synthetic */ FileListAdapter $adapter;
        final /* synthetic */ Intent $intent;
        Object L$0;
        int label;

        /* JADX INFO: renamed from: com.miui.maml.ThirdAppPicker$onCreate$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: ThirdAppPicker.kt */
        @InterfaceC6205g(m22755c = "com.miui.maml.ThirdAppPicker$onCreate$1$1", m22756f = "ThirdAppPicker.kt", m22757i = {}, m22758l = {}, m22759m = "invokeSuspend", m22760n = {}, m22761s = {})
        static final class AnonymousClass1 extends kja0 implements InterfaceC5979h<InterfaceC6556f, InterfaceC6216q<? super List<AppData>>, Object> {
            final /* synthetic */ Intent $intent;
            int label;
            final /* synthetic */ ThirdAppPicker this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ThirdAppPicker thirdAppPicker, Intent intent, InterfaceC6216q<? super AnonymousClass1> interfaceC6216q) {
                super(2, interfaceC6216q);
                this.this$0 = thirdAppPicker;
                this.$intent = intent;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7396q
            public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
                return new AnonymousClass1(this.this$0, this.$intent, interfaceC6216q);
            }

            @Override // cyoe.InterfaceC5979h
            @InterfaceC7395n
            public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super List<AppData>> interfaceC6216q) {
                return ((AnonymousClass1) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
            @InterfaceC7395n
            public final Object invokeSuspend(@InterfaceC7396q Object obj) {
                C6199q.x2();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6318m.n7h(obj);
                ThirdAppPicker thirdAppPicker = this.this$0;
                PackageManager packageManager = thirdAppPicker.mPackageManager;
                List<ResolveInfo> listQueryIntentActivities = packageManager != null ? packageManager.queryIntentActivities(this.$intent, 0) : null;
                if (listQueryIntentActivities == null) {
                    return this.this$0.mAllApps;
                }
                thirdAppPicker.mResolveInfoList = listQueryIntentActivities;
                ArrayList arrayList = new ArrayList();
                Collections.sort(this.this$0.mResolveInfoList, new ResolveInfo.DisplayNameComparator(this.this$0.mPackageManager));
                for (ResolveInfo resolveInfo : this.this$0.mResolveInfoList) {
                    arrayList.add(new AppData(resolveInfo.loadLabel(this.this$0.mPackageManager).toString(), resolveInfo.loadIcon(this.this$0.mPackageManager), resolveInfo));
                }
                return arrayList;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C51461(FileListAdapter fileListAdapter, Intent intent, InterfaceC6216q<? super C51461> interfaceC6216q) {
            super(2, interfaceC6216q);
            this.$adapter = fileListAdapter;
            this.$intent = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7396q
        public final InterfaceC6216q<was> create(@InterfaceC7395n Object obj, @InterfaceC7396q InterfaceC6216q<?> interfaceC6216q) {
            return ThirdAppPicker.this.new C51461(this.$adapter, this.$intent, interfaceC6216q);
        }

        @Override // cyoe.InterfaceC5979h
        @InterfaceC7395n
        public final Object invoke(@InterfaceC7396q InterfaceC6556f interfaceC6556f, @InterfaceC7395n InterfaceC6216q<? super was> interfaceC6216q) {
            return ((C51461) create(interfaceC6556f, interfaceC6216q)).invokeSuspend(was.f36763k);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6206k
        @InterfaceC7395n
        public final Object invokeSuspend(@InterfaceC7396q Object obj) throws Throwable {
            ThirdAppPicker thirdAppPicker;
            Object objX2 = C6199q.x2();
            int i2 = this.label;
            if (i2 == 0) {
                C6318m.n7h(obj);
                ThirdAppPicker thirdAppPicker2 = ThirdAppPicker.this;
                dd ddVarM22238k = f7l8.m22238k();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ThirdAppPicker.this, this.$intent, null);
                this.L$0 = thirdAppPicker2;
                this.label = 1;
                Object objM24523y = C6708p.m24523y(ddVarM22238k, anonymousClass1, this);
                if (objM24523y == objX2) {
                    return objX2;
                }
                thirdAppPicker = thirdAppPicker2;
                obj = objM24523y;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                thirdAppPicker = (ThirdAppPicker) this.L$0;
                C6318m.n7h(obj);
            }
            thirdAppPicker.mAllApps = (List) obj;
            this.$adapter.notifyDataSetChanged();
            return was.f36763k;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@InterfaceC7396q View v2) {
        int iIntValue;
        d2ok.m23075h(v2, "v");
        if (v2.getTag() instanceof Integer) {
            Object tag = v2.getTag();
            d2ok.n7h(tag, "null cannot be cast to non-null type kotlin.Int");
            iIntValue = ((Integer) tag).intValue();
        } else {
            iIntValue = -1;
        }
        if (iIntValue >= 0) {
            List<AppData> list = this.mAllApps;
            d2ok.qrj(list);
            if (iIntValue >= list.size()) {
                return;
            }
            List<AppData> list2 = this.mAllApps;
            d2ok.qrj(list2);
            AppData appData = list2.get(iIntValue);
            Intent intent = new Intent();
            intent.putExtra("name", appData.getLabel());
            ActivityInfo activityInfo = ((ResolveInfo) appData).activityInfo;
            intent.setClassName(activityInfo.packageName, activityInfo.name);
            if (((ResolveInfo) appData).activityInfo == null) {
                intent = null;
            }
            setResult(-1, intent);
            finish();
        }
    }

    @Override // miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onCreate(@InterfaceC7395n Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.android.thememanager.R.layout.app_picker);
        this.mPackageManager = getPackageManager();
        AbstractC6946k appCompatActionBar = getAppCompatActionBar();
        if (appCompatActionBar != null) {
            appCompatActionBar.xwq3(com.android.thememanager.R.string.resource_select);
            appCompatActionBar.mo152a(true);
        }
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        this.mVm = (C1561b) new C0924e(this).m4420k(C1561b.class);
        RecyclerView recyclerView = (RecyclerView) findViewById(com.android.thememanager.R.id.list);
        FileListAdapter fileListAdapter = new FileListAdapter(this, this, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(fileListAdapter);
        C1561b c1561b = this.mVm;
        if (c1561b == null) {
            d2ok.n5r1("mVm");
            c1561b = null;
        }
        kotlinx.coroutines.x2.m24649g(uv6.m4473k(c1561b), null, null, new C51461(fileListAdapter, intent, null), 3, null);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@InterfaceC7396q MenuItem item) {
        d2ok.m23075h(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
