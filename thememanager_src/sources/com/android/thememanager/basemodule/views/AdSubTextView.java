package com.android.thememanager.basemodule.views;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.core.view.qrj;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.basemodule.analysis.C1708s;
import java.util.Collections;
import java.util.HashSet;
import y9n.C7780k;
import yz.C7794k;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
public class AdSubTextView extends TextView {

    /* JADX INFO: renamed from: k */
    public static final String f10457k = "AdSubTextView";

    /* JADX INFO: renamed from: q */
    public static String f10458q;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.views.AdSubTextView$k */
    class ViewTreeObserverOnPreDrawListenerC1838k implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Boolean f10459k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ int f10461q;

        ViewTreeObserverOnPreDrawListenerC1838k(final Boolean val$custom, final int val$gravity) {
            this.f10459k = val$custom;
            this.f10461q = val$gravity;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            int lineCount = AdSubTextView.this.getLineCount();
            if (this.f10459k.booleanValue() && lineCount > 1) {
                AdSubTextView.this.setGravity(this.f10461q);
            }
            AdSubTextView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            return false;
        }
    }

    class toq extends ClickableSpan {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f10463k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ String f10464n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ AdInfo f10465q;

        toq(final String val$uri, final AdInfo val$adInfo, final String val$trackType) {
            this.f10463k = val$uri;
            this.f10465q = val$adInfo;
            this.f10464n = val$trackType;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@lvui View widget) {
            AdSubTextView.this.f7l8(this.f10463k);
            AdInfo adInfo = this.f10465q;
            if (adInfo != null) {
                AdSubTextView.this.m7272g(this.f10464n, adInfo);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@lvui TextPaint ds) {
            ds.setUnderlineText(false);
        }
    }

    private static class zy {

        /* JADX INFO: renamed from: k */
        final int f10466k;

        /* JADX INFO: renamed from: q */
        final int f10467q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final int f57827toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final int f57828zy;

        zy(int totalElements, int introductionPosition, int privacyPosition, int permissionPosition) {
            this.f10467q = totalElements;
            this.f10466k = introductionPosition;
            this.f57827toq = privacyPosition;
            this.f57828zy = permissionPosition;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static zy toq(int introductionPosition, int privacyPosition, int permissionPosition, int totalElements) {
            int[] iArr = {introductionPosition, privacyPosition, permissionPosition};
            HashSet hashSet = new HashSet();
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i3 == 0 || hashSet.contains(Integer.valueOf(i3))) {
                    C7794k.toq(AdSubTextView.f10457k, "Position parameter cannot be zero or equal!");
                    return null;
                }
                hashSet.add(Integer.valueOf(i3));
            }
            for (int i4 = 0; i4 < 3; i4++) {
                totalElements++;
                if (iArr[i4] > totalElements) {
                    C7794k.toq(AdSubTextView.f10457k, "Positions exceeds the total number of elements!");
                    return null;
                }
            }
            return new zy(totalElements, iArr[0], iArr[1], iArr[2]);
        }
    }

    public AdSubTextView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f7l8(String string) {
        getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(string)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m7272g(String type, AdInfo adInfo) {
        C1708s.f7l8().x2(4001).jk(adInfo, Collections.singletonMap(C7780k.f100595y9n, type));
    }

    /* JADX INFO: renamed from: n */
    private ClickableSpan m7274n(String uri, String trackType, AdInfo adInfo) {
        return new toq(uri, adInfo, trackType);
    }

    private boolean n7h(AdInfo adInfo) {
        String[] strArr = {"packageName", "appName", "appDeveloper", "appVersion", "appPrivacy", "appPermission", "appIntroduction"};
        boolean z2 = true;
        String[] strArr2 = {adInfo.packageName, adInfo.appName, adInfo.appDeveloper, adInfo.appVersion, adInfo.appPrivacy, adInfo.appPermission, adInfo.appIntroduction};
        for (int i2 = 0; i2 < 7; i2++) {
            if (TextUtils.isEmpty(strArr2[i2])) {
                C7794k.m28196p(f10457k, "initializeView: AdSubTextView is GONE because " + strArr[i2] + " is empty");
                z2 = false;
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: q */
    private SpannableStringBuilder m7275q(zy positionInfo, AdInfo adInfo, String[] stringParts) {
        String str;
        String string = getResources().getString(R.string.ad_sub_textview_divider);
        String string2 = getResources().getString(R.string.ad_sub_textview_privacy);
        String string3 = getResources().getString(R.string.ad_sub_textview_permission);
        String string4 = getResources().getString(R.string.ad_sub_textview_introduction);
        int i2 = positionInfo.f10467q;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i3 = i2 - 1;
        int[] iArr = new int[i3];
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = 0;
        int length = 0;
        int i8 = 0;
        while (i7 < i2) {
            int i9 = i7 + 1;
            int i10 = i2;
            if (i9 == positionInfo.f10466k) {
                str = string4;
                i4 = length;
            } else if (i9 == positionInfo.f57827toq) {
                str = string2;
                i5 = length;
            } else if (i9 == positionInfo.f57828zy) {
                str = string3;
                i6 = length;
            } else {
                str = stringParts[i8];
                i8++;
            }
            if (str != null) {
                spannableStringBuilder.append((CharSequence) str);
                if (i7 != i3) {
                    spannableStringBuilder.append((CharSequence) string);
                    int length2 = length + str.length();
                    iArr[i7] = length2;
                    length = length2 + string.length();
                }
            }
            i7 = i9;
            i2 = i10;
        }
        Drawable drawable = getResources().getDrawable(R.drawable.ad_text_division);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        qrj(spannableStringBuilder, drawable, iArr);
        if (i4 >= 0 && !TextUtils.isEmpty(string4)) {
            spannableStringBuilder.setSpan(m7274n(adInfo.appIntroduction, C7780k.f100577i1, adInfo), i4, string4.length() + i4, 33);
        }
        if (i5 >= 0 && !TextUtils.isEmpty(string2)) {
            spannableStringBuilder.setSpan(m7274n(adInfo.appPrivacy, C7780k.f45918b, adInfo), i5, string2.length() + i5, 33);
        }
        if (i6 >= 0 && !TextUtils.isEmpty(string3)) {
            spannableStringBuilder.setSpan(m7274n(adInfo.appPermission, C7780k.f100566bf2, adInfo), i6, string3.length() + i6, 33);
        }
        return spannableStringBuilder;
    }

    private void qrj(SpannableStringBuilder spannable, Drawable drawable, int[] arr) {
        for (int i2 : arr) {
            spannable.setSpan(new C1854n(drawable, 16, 16), i2, i2 + 1, 1);
        }
    }

    private void x2(AdInfo adInfo, String[] stringParts, int introductionPosition, int privacyPosition, int permissionPosition) {
        zy qVar = zy.toq(introductionPosition, privacyPosition, permissionPosition, stringParts.length);
        if (qVar != null && n7h(adInfo)) {
            SpannableStringBuilder spannableStringBuilderM7275q = m7275q(qVar, adInfo, stringParts);
            setMovementMethod(LinkMovementMethod.getInstance());
            setText(spannableStringBuilderM7275q);
        }
    }

    private void zy(Boolean custom, int gravity) {
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC1838k(custom, gravity));
    }

    public void ld6(AdInfo adInfo, Boolean custom) {
        x2(adInfo, new String[]{adInfo.appDeveloper, adInfo.appVersion, getResources().getString(R.string.ad_sub_textview_ad)}, 3, 4, 5);
        zy(custom, qrj.f50865toq);
    }

    /* JADX INFO: renamed from: p */
    public void m7276p(AdInfo adInfo, Boolean custom) {
        x2(adInfo, new String[]{f10458q + adInfo.appVersion, adInfo.appDeveloper}, 2, 3, 4);
        zy(custom, qrj.f50865toq);
    }

    /* JADX INFO: renamed from: s */
    public void m7277s(AdInfo adInfo, Boolean custom) {
        m7278y(adInfo);
        zy(custom, qrj.f50865toq);
    }

    /* JADX INFO: renamed from: y */
    public void m7278y(AdInfo adInfo) {
        if (adInfo == null) {
            C7794k.toq(f10457k, "AdInfo is NULL!");
        } else {
            x2(adInfo, new String[]{adInfo.appName, adInfo.appDeveloper, adInfo.appVersion}, 4, 5, 6);
        }
    }

    public AdSubTextView(Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AdSubTextView(Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        f10458q = getResources().getString(R.string.ad_sub_textview_version_with_colon);
    }
}
