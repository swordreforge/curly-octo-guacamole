package com.android.thememanager.ad.download.controller;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.ad.C1653q;
import com.android.thememanager.basemodule.ad.AdDislikeManager;
import com.android.thememanager.basemodule.ad.InterfaceC1694q;
import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.basemodule.utils.a9;
import com.android.thememanager.basemodule.views.AdSubTextView;
import com.android.thememanager.basemodule.views.InterfaceC1852k;
import hb.C6072k;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import y9n.C7780k;

/* JADX INFO: compiled from: DetailPageAdDownloadButtonController.java */
/* JADX INFO: loaded from: classes.dex */
public class toq implements InterfaceC1852k, InterfaceC1694q {

    /* JADX INFO: renamed from: g */
    private boolean f9500g;

    /* JADX INFO: renamed from: k */
    private WeakReference<TextView> f9501k;

    /* JADX INFO: renamed from: n */
    private AdInfo f9502n;

    /* JADX INFO: renamed from: q */
    private WeakReference<AdSubTextView> f9503q;

    /* JADX INFO: renamed from: s */
    private int f9504s;

    /* JADX INFO: renamed from: y */
    private boolean f9505y;

    /* JADX INFO: renamed from: com.android.thememanager.ad.download.controller.toq$k */
    /* JADX INFO: compiled from: DetailPageAdDownloadButtonController.java */
    class ViewOnClickListenerC1647k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ TextView f9506k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ AdInfo f9508q;

        ViewOnClickListenerC1647k(final TextView val$downloadView, final AdInfo val$adInfo) {
            this.f9506k = val$downloadView;
            this.f9508q = val$adInfo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            Map mapSingletonMap = toq.this.f9500g ? Collections.singletonMap(C7780k.f100595y9n, C7780k.f100596yz) : null;
            if (this.f9506k.getTag() != null) {
                C1653q.f7l8(this.f9506k.getContext(), this.f9508q, mapSingletonMap);
            } else {
                C1653q.m6524g(toq.this.f9501k.get() != null ? ((TextView) toq.this.f9501k.get()).getContext() : null, toq.this.f9502n, true, mapSingletonMap);
            }
        }
    }

    public toq(TextView downloadView, AdInfo info, boolean isDetailPage) {
        this(downloadView, null, info, isDetailPage);
    }

    /* JADX INFO: renamed from: g */
    private void m6511g(TextView downloadView, AdSubTextView adSubTextView, AdInfo adInfo) {
        if (AdDislikeManager.m6595g().f7l8(adInfo.tagId)) {
            downloadView.setVisibility(8);
            if (adSubTextView != null) {
                adSubTextView.setVisibility(8);
                return;
            }
            return;
        }
        if (!C1653q.kja0(adInfo)) {
            if (!this.f9500g || C1653q.m6525h(adInfo.dspName)) {
                downloadView.setVisibility(8);
            } else {
                downloadView.setVisibility(0);
                downloadView.setText(R.string.ad_experience_now);
            }
            if (adSubTextView != null) {
                adSubTextView.setVisibility(8);
            }
        } else if (a9.m6999s(adInfo.packageName)) {
            downloadView.setText(R.string.ad_experience_now);
            if (adSubTextView != null) {
                adSubTextView.ld6(adInfo, Boolean.TRUE);
            }
            downloadView.setVisibility(0);
        } else {
            if (adSubTextView != null) {
                adSubTextView.setVisibility(0);
                if (this.f9505y) {
                    adSubTextView.ld6(adInfo, Boolean.TRUE);
                } else {
                    adSubTextView.m7277s(adInfo, Boolean.TRUE);
                }
            }
            downloadView.setText(R.string.ad_download_now);
            downloadView.setVisibility(0);
        }
        downloadView.setOnClickListener(new ViewOnClickListenerC1647k(downloadView, adInfo));
    }

    /* JADX INFO: renamed from: n */
    public void m6513n(String packageName, int state) {
        C6072k c6072kM6521y;
        int i2;
        TextView textView = this.f9501k.get();
        if (state == -8 || state == -2) {
            if (textView != null) {
                textView.setText(R.string.ad_download_now);
                textView.setTextColor(textView.getContext().getColorStateList(R.color.ad_card_download_button_text_color));
                textView.setEnabled(true);
                return;
            }
            return;
        }
        if (state == 1) {
            if (textView != null) {
                textView.setText(R.string.ad_in_downloading);
                textView.setTextColor(textView.getContext().getColor(R.color.new_ad_download_btn_text_pressed_color));
                textView.setEnabled(false);
                return;
            }
            return;
        }
        if (state == 3) {
            if (textView != null) {
                textView.setText(R.string.ad_in_installing);
                return;
            }
            return;
        }
        if (state == 4) {
            if (textView != null) {
                textView.setText(R.string.ad_experience_now);
                textView.setEnabled(true);
                textView.setTextColor(textView.getContext().getColorStateList(R.color.ad_card_download_button_text_color));
                return;
            }
            return;
        }
        if (state != 5 || (c6072kM6521y = com.android.thememanager.ad.download.toq.m6518s().m6521y(packageName)) == null || c6072kM6521y.f35087k != 5 || this.f9504s == (i2 = c6072kM6521y.f35088n) || textView == null) {
            return;
        }
        textView.setText(R.string.ad_in_downloading);
        textView.setTextColor(textView.getContext().getColor(R.color.new_ad_download_btn_text_pressed_color));
        textView.setEnabled(false);
        this.f9504s = i2;
    }

    @Override // com.android.thememanager.basemodule.views.InterfaceC1852k
    /* JADX INFO: renamed from: q */
    public void mo6499q(String packageName, int state) {
        WeakReference<TextView> weakReference;
        if (!TextUtils.equals(packageName, this.f9502n.packageName) || (weakReference = this.f9501k) == null || weakReference.get() == null) {
            return;
        }
        if (this.f9505y) {
            m6513n(packageName, state);
            return;
        }
        TextView textView = this.f9501k.get();
        WeakReference<AdSubTextView> weakReference2 = this.f9503q;
        AdSubTextView adSubTextView = weakReference2 != null ? weakReference2.get() : null;
        if (state != -8 && state != -2) {
            if (state == 4) {
                if (textView != null) {
                    textView.setText(R.string.ad_experience_now);
                    return;
                }
                return;
            } else if (state != 5) {
                return;
            }
        }
        if (adSubTextView != null) {
            adSubTextView.setVisibility(0);
        }
        if (textView != null) {
            textView.setText(R.string.ad_download_now);
        }
    }

    @Override // com.android.thememanager.basemodule.ad.InterfaceC1694q
    /* JADX INFO: renamed from: s */
    public void mo6510s(String tagId) {
        WeakReference<TextView> weakReference;
        AdInfo adInfo = this.f9502n;
        if (adInfo == null || !TextUtils.equals(tagId, adInfo.tagId) || (weakReference = this.f9501k) == null || weakReference.get() == null) {
            return;
        }
        this.f9501k.get().setVisibility(8);
    }

    public toq(TextView downloadView, AdSubTextView adSubTextView, AdInfo info, boolean isDetailPage) {
        this.f9501k = new WeakReference<>(downloadView);
        if (adSubTextView != null) {
            this.f9503q = new WeakReference<>(adSubTextView);
        }
        this.f9502n = info;
        this.f9500g = isDetailPage;
        if (downloadView == null || info == null) {
            return;
        }
        m6511g(downloadView, adSubTextView, info);
    }

    public toq(TextView downloadView, AdSubTextView adSubTextView, AdInfo info, boolean isDetailPage, boolean isNewAdCard) {
        this.f9505y = isNewAdCard;
        this.f9501k = new WeakReference<>(downloadView);
        if (adSubTextView != null) {
            this.f9503q = new WeakReference<>(adSubTextView);
        }
        this.f9502n = info;
        this.f9500g = isDetailPage;
        if (downloadView == null || info == null) {
            return;
        }
        m6511g(downloadView, adSubTextView, info);
    }
}
