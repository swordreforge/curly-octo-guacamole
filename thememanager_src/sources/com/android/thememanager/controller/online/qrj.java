package com.android.thememanager.controller.online;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.mine.setting.view.activity.ResourceExchangeActivity;
import com.android.thememanager.model.PageItem;
import com.android.thememanager.model.RecommendItem;
import com.android.thememanager.util.cfr;
import com.android.thememanager.util.ch;
import com.android.thememanager.view.RecommendItemGridLayout;
import com.android.thememanager.view.RecommendItemOrderLayout;
import com.android.thememanager.view.ResourceAutoScrollScreenView;
import com.android.thememanager.view.a9;
import com.android.thememanager.view.d3;
import com.android.thememanager.view.gvn7;
import com.android.thememanager.view.jk;
import com.android.thememanager.view.jp0y;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: PageItemViewConverter.java */
/* JADX INFO: loaded from: classes2.dex */
public class qrj implements InterfaceC1357q, InterfaceC1925p {

    /* JADX INFO: renamed from: g */
    private LayoutInflater f10976g;

    /* JADX INFO: renamed from: k */
    protected Activity f10977k;

    /* JADX INFO: renamed from: n */
    private InterfaceC1927g f10978n;

    /* JADX INFO: renamed from: q */
    protected com.android.thememanager.fu4 f10979q;

    /* JADX INFO: renamed from: s */
    private int f10980s = ch.fn3e();

    /* JADX INFO: renamed from: y */
    private int f10981y;

    /* JADX INFO: compiled from: PageItemViewConverter.java */
    public static class f7l8 {

        /* JADX INFO: renamed from: k */
        public EnumC1929n f10982k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public EnumC1929n f57959toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public View f57960zy;

        public f7l8() {
            EnumC1929n enumC1929n = EnumC1929n.NORMAL;
            this.f10982k = enumC1929n;
            this.f57959toq = enumC1929n;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.controller.online.qrj$g */
    /* JADX INFO: compiled from: PageItemViewConverter.java */
    public interface InterfaceC1927g {
        /* JADX INFO: renamed from: k */
        void m7617k(f7l8 pageViewWrapper, PageItem pageItem, boolean isFirst);
    }

    /* JADX INFO: renamed from: com.android.thememanager.controller.online.qrj$k */
    /* JADX INFO: compiled from: PageItemViewConverter.java */
    class C1928k implements Comparator<PageItem> {
        C1928k() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compare(PageItem lhs, PageItem rhs) {
            return lhs.getIndex() - rhs.getIndex();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.controller.online.qrj$n */
    /* JADX INFO: compiled from: PageItemViewConverter.java */
    public enum EnumC1929n {
        NONE,
        NORMAL,
        LARGE,
        FIRST
    }

    /* JADX INFO: renamed from: com.android.thememanager.controller.online.qrj$q */
    /* JADX INFO: compiled from: PageItemViewConverter.java */
    static /* synthetic */ class C1930q {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f10984k;

        static {
            int[] iArr = new int[PageItem.ItemType.values().length];
            f10984k = iArr;
            try {
                iArr[PageItem.ItemType.SHOPWINDOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10984k[PageItem.ItemType.SHOPWINDOWNEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10984k[PageItem.ItemType.BUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10984k[PageItem.ItemType.MESSAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10984k[PageItem.ItemType.TITLENEW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10984k[PageItem.ItemType.PICTURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10984k[PageItem.ItemType.EXCHANGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10984k[PageItem.ItemType.HOTWORDS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10984k[PageItem.ItemType.HOTCOLORS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10984k[PageItem.ItemType.MULTIPLEBUTTON.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10984k[PageItem.ItemType.MULTIPLESUBJECT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10984k[PageItem.ItemType.ADTAG.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: compiled from: PageItemViewConverter.java */
    class toq implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ RecommendItem f10985k;

        toq(final RecommendItem val$itemData) {
            this.f10985k = val$itemData;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            Intent intent = new Intent();
            String resourceStamp = this.f10985k.getResourceStamp();
            if (TextUtils.equals(resourceStamp, qrj.this.f10979q.getResourceStamp())) {
                intent.setClassName(qrj.this.f10979q.getTabActivityPackage(), qrj.this.f10979q.getTabActivityClass());
            } else {
                com.android.thememanager.fu4 fu4VarF7l8 = C2082k.zy().m8001n().f7l8(resourceStamp);
                intent.putExtra("REQUEST_RESOURCE_CODE", fu4VarF7l8.getResourceCode());
                intent.setClassName(fu4VarF7l8.getTabActivityPackage(), fu4VarF7l8.getTabActivityClass());
            }
            intent.putExtra(InterfaceC1357q.f53927oc, this.f10985k.getContentId());
            intent.putExtra(InterfaceC1357q.f53866eqxt, this.f10985k.getTitle());
            intent.putExtra(InterfaceC1357q.f53865ek5k, (Serializable) this.f10985k.getPageGroups());
            qrj.this.f10977k.startActivityForResult(intent, 1);
        }
    }

    /* JADX INFO: compiled from: PageItemViewConverter.java */
    class zy implements View.OnClickListener {

        /* JADX INFO: renamed from: com.android.thememanager.controller.online.qrj$zy$k */
        /* JADX INFO: compiled from: PageItemViewConverter.java */
        class C1931k implements C1688q.n {
            C1931k() {
            }

            @Override // com.android.thememanager.basemodule.account.C1688q.n
            public void loginFail(C1688q.g loginError) {
            }

            @Override // com.android.thememanager.basemodule.account.C1688q.n
            public void loginSuccess() {
                qrj.this.f10977k.startActivity(new Intent(qrj.this.f10977k, (Class<?>) ResourceExchangeActivity.class));
            }
        }

        zy() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            C1688q.cdj().fti(qrj.this.f10977k, new C1931k());
        }
    }

    public qrj(Activity context, com.android.thememanager.fu4 resContext) {
        this.f10977k = context;
        this.f10979q = resContext;
        this.f10976g = LayoutInflater.from(context);
        this.f10981y = ch.ni7(context);
    }

    public static cfr<List<PageItem>, List<PageItem>, PageItem> cdj(List<PageItem> items) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m7610h(items);
        PageItem pageItem = null;
        if (items != null && !items.isEmpty()) {
            boolean z2 = false;
            for (PageItem pageItem2 : items) {
                if (pageItem2.getType() == PageItem.ItemType.MULTIPLESUBJECT) {
                    z2 = true;
                    pageItem = pageItem2;
                } else if (z2) {
                    arrayList2.add(pageItem2);
                } else {
                    arrayList.add(pageItem2);
                }
            }
        }
        return new cfr<>(arrayList, arrayList2, pageItem);
    }

    private View f7l8(PageItem item) {
        int recommendMaxCol = item.getRecommendMaxCol();
        if (recommendMaxCol <= 0 || recommendMaxCol > ch.t8r()) {
            recommendMaxCol = ch.t8r();
        }
        int size = item.getRecommendItems().size();
        int iKi = ch.ki(this.f10977k, size);
        int iCdj = ch.cdj(this.f10977k);
        a9 a9VarQrj = qrj();
        ArrayList arrayList = new ArrayList();
        ViewGroup viewGroup = null;
        int i2 = 0;
        boolean z2 = true;
        while (i2 < size) {
            if (i2 % recommendMaxCol == 0) {
                viewGroup = (ViewGroup) this.f10976g.inflate(R.layout.resource_page_item_multiple_button_container, (ViewGroup) null);
                arrayList.add(viewGroup);
                z2 = true;
            }
            View viewMo7319k = a9VarQrj.mo7319k(item.getRecommendItems().get(i2), viewGroup);
            if (!z2) {
                viewMo7319k.setPaddingRelative(iKi, iCdj, 0, 0);
            }
            viewGroup.addView(viewMo7319k);
            i2++;
            z2 = false;
        }
        if (arrayList.size() == 0) {
            return null;
        }
        if (arrayList.size() == 1) {
            return (View) arrayList.get(0);
        }
        LinearLayout linearLayout = new LinearLayout(this.f10977k);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linearLayout.addView((ViewGroup) it.next());
        }
        return linearLayout;
    }

    /* JADX INFO: renamed from: g */
    private View m7609g(PageItem item) {
        TextView textView = (TextView) this.f10976g.inflate(R.layout.resource_page_item_message, (ViewGroup) null);
        textView.setText(item.getValue());
        return textView;
    }

    /* JADX INFO: renamed from: h */
    public static void m7610h(List<PageItem> items) {
        if (items == null || items.isEmpty()) {
            return;
        }
        Collections.sort(items, new C1928k());
    }

    /* JADX INFO: renamed from: k */
    private View m7611k(PageItem item) {
        FrameLayout frameLayout = new FrameLayout(this.f10977k);
        frameLayout.setTag(item.getValue());
        frameLayout.setVisibility(8);
        return frameLayout;
    }

    /* JADX INFO: renamed from: n */
    private View m7612n(PageItem pageItem) {
        View viewInflate = this.f10976g.inflate(R.layout.resource_page_item_title, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.item_title)).setText(pageItem.getValue());
        List<RecommendItem> recommendItems = pageItem.getRecommendItems();
        if (!recommendItems.isEmpty()) {
            LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.button_container);
            d3 d3Var = new d3(this.f10977k, this.f10979q);
            Iterator<RecommendItem> it = recommendItems.iterator();
            while (it.hasNext()) {
                linearLayout.addView(d3Var.mo7319k(it.next(), linearLayout));
            }
        }
        return viewInflate;
    }

    /* JADX INFO: renamed from: p */
    private View m7613p(PageItem item) {
        RecommendItemOrderLayout recommendItemOrderLayout = new RecommendItemOrderLayout(this.f10977k);
        recommendItemOrderLayout.setRecommendItemFactory(new gvn7(this.f10977k, this.f10979q));
        recommendItemOrderLayout.setGap(this.f10977k.getResources().getDimensionPixelSize(R.dimen.hot_recommend_text_gap));
        recommendItemOrderLayout.toq(item.getRecommendItems());
        return recommendItemOrderLayout;
    }

    /* JADX INFO: renamed from: q */
    private View m7614q(PageItem item) {
        View viewInflate = this.f10976g.inflate(R.layout.resource_exchange_account, (ViewGroup) null);
        viewInflate.findViewById(R.id.presentBtn).setVisibility(8);
        viewInflate.findViewById(R.id.exchangeBtn).setOnClickListener(new zy());
        return viewInflate;
    }

    /* JADX INFO: renamed from: s */
    private View m7615s(PageItem item) {
        ImageView imageView = new ImageView(this.f10977k);
        imageView.setAdjustViewBounds(true);
        imageView.setBackgroundResource(R.drawable.resource_preview_bg);
        com.android.thememanager.basemodule.imageloader.x2.zy(this.f10977k, String.format(item.getValue(), Integer.valueOf(y9n.zurt().x), 90), imageView);
        return imageView;
    }

    private View toq(PageItem item) {
        if ((item.getShowType() & PageItem.ItemShowType.SHOW_TYPE_SCROLL_BIT) == 0) {
            RecommendItemGridLayout recommendItemGridLayout = new RecommendItemGridLayout(this.f10977k);
            recommendItemGridLayout.setRecommendItemFactory(new jk(this.f10977k, this.f10979q));
            recommendItemGridLayout.setGridItemRatio(218, 132);
            recommendItemGridLayout.setGridItemGap(this.f10981y);
            if (item.getRecommendMaxCol() > 0) {
                recommendItemGridLayout.setColumnCount(item.getRecommendMaxCol());
            } else {
                recommendItemGridLayout.setColumnCount(this.f10980s);
            }
            recommendItemGridLayout.setIndex(item.getIndex());
            recommendItemGridLayout.qrj(item.getRecommendItems());
            return recommendItemGridLayout;
        }
        ResourceAutoScrollScreenView resourceAutoScrollScreenView = new ResourceAutoScrollScreenView(this.f10977k);
        resourceAutoScrollScreenView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 81);
        layoutParams.setMargins(0, 0, 0, this.f10977k.getResources().getDimensionPixelSize(R.dimen.resource_page_item_scroll_shop_window_seek_bar_bottom_margin));
        resourceAutoScrollScreenView.setSeekBarPosition(layoutParams);
        resourceAutoScrollScreenView.setSlideBarVisibility(8);
        resourceAutoScrollScreenView.setSeekPointResource(R.drawable.resource_seek_point);
        resourceAutoScrollScreenView.setOverScrollRatio(0.0f);
        resourceAutoScrollScreenView.setOvershootTension(0.0f);
        resourceAutoScrollScreenView.setClickable(true);
        resourceAutoScrollScreenView.setRecommendItemFactory(new jk(this.f10977k, this.f10979q));
        resourceAutoScrollScreenView.m10289x(item.getRecommendItems());
        return resourceAutoScrollScreenView;
    }

    /* JADX INFO: renamed from: y */
    private View m7616y(PageItem item) {
        return this.f10976g.inflate(R.layout.resource_page_item_multiple_subject, (ViewGroup) null);
    }

    private View zy(PageItem item) {
        LinearLayout linearLayout = (LinearLayout) this.f10976g.inflate(R.layout.resource_page_item_button, (ViewGroup) null);
        for (RecommendItem recommendItem : item.getRecommendItems()) {
            Button button = new Button(this.f10977k);
            button.setText(recommendItem.getTitle());
            button.setOnClickListener(new toq(recommendItem));
            linearLayout.addView(button, new LinearLayout.LayoutParams(-1, -2, 1.0f));
        }
        return linearLayout;
    }

    public void kja0(int columnCount, int itemPadding) {
        this.f10980s = columnCount;
        this.f10981y = itemPadding;
    }

    public f7l8 ld6(PageItem item, boolean isFirst) {
        InterfaceC1927g interfaceC1927g;
        f7l8 f7l8Var = new f7l8();
        switch (C1930q.f10984k[item.getType().ordinal()]) {
            case 1:
            case 2:
                f7l8Var.f57960zy = toq(item);
                if ((item.getShowType() & PageItem.ItemShowType.SHOW_TYPE_SCROLL_BIT) != 0) {
                    EnumC1929n enumC1929n = EnumC1929n.NONE;
                    f7l8Var.f10982k = enumC1929n;
                    f7l8Var.f57959toq = enumC1929n;
                }
                break;
            case 3:
                f7l8Var.f57960zy = zy(item);
                break;
            case 4:
                f7l8Var.f57960zy = m7609g(item);
                break;
            case 5:
                f7l8Var.f57960zy = m7612n(item);
                f7l8Var.f57959toq = EnumC1929n.NONE;
                break;
            case 6:
                f7l8Var.f57960zy = m7615s(item);
                f7l8Var.f10982k = EnumC1929n.NONE;
                break;
            case 7:
                f7l8Var.f57960zy = m7614q(item);
                break;
            case 8:
                f7l8Var.f57960zy = m7613p(item);
                break;
            case 10:
                f7l8Var.f57960zy = f7l8(item);
                break;
            case 11:
                f7l8Var.f57960zy = m7616y(item);
                EnumC1929n enumC1929n2 = EnumC1929n.NONE;
                f7l8Var.f10982k = enumC1929n2;
                f7l8Var.f57959toq = enumC1929n2;
                break;
            case 12:
                f7l8Var.f57960zy = m7611k(item);
                f7l8Var.f57959toq = EnumC1929n.NONE;
                break;
        }
        if (f7l8Var.f57960zy != null && (interfaceC1927g = this.f10978n) != null) {
            interfaceC1927g.m7617k(f7l8Var, item, isFirst);
        }
        return f7l8Var;
    }

    public void n7h(InterfaceC1927g pageItemCallback) {
        this.f10978n = pageItemCallback;
    }

    protected a9 qrj() {
        return new jp0y(this.f10977k, this.f10979q);
    }

    public List<f7l8> x2(List<PageItem> pageItems) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < pageItems.size()) {
            f7l8 f7l8VarLd6 = ld6(pageItems.get(i2), i2 == 0);
            if (f7l8VarLd6.f57960zy != null) {
                arrayList.add(f7l8VarLd6);
            }
            i2++;
        }
        return arrayList;
    }
}
