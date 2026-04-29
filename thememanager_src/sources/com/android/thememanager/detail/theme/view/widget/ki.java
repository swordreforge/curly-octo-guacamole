package com.android.thememanager.detail.theme.view.widget;

import android.app.Activity;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.EditText;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.C1824r;
import com.android.thememanager.basemodule.utils.nn86;
import java.util.Random;

/* JADX INFO: compiled from: RewardUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class ki {

    /* JADX INFO: renamed from: k */
    public static final String f11370k = "show_reward_guide";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f58025toq = 200;

    private ki() {
    }

    /* JADX INFO: renamed from: g */
    public static void m7815g(DetailActionView actionReward, Activity activity) {
        if (actionReward != null) {
            actionReward.setDynamicResource(activity, C1819o.d2ok(activity) ? R.drawable.de_dark_reward : R.drawable.de_light_reward, R.color.de_color_100_fcbb50);
        }
    }

    /* JADX INFO: renamed from: k */
    public static SpannableString m7816k(String wholeStr, String customizedStr) {
        int iIndexOf = wholeStr.indexOf(customizedStr);
        SpannableString spannableString = new SpannableString(wholeStr);
        if (iIndexOf != -1) {
            spannableString.setSpan(new ForegroundColorSpan(bf2.toq.toq().getResources().getColor(R.color.de_detail_reward_times_highlight_color)), iIndexOf, customizedStr.length() + iIndexOf, 18);
        }
        return spannableString;
    }

    /* JADX INFO: renamed from: n */
    public static void m7817n(Editable editable, int beforeDot, int afterDot, EditText editText) {
        String string = editable.toString();
        int iIndexOf = string.indexOf(".");
        if (iIndexOf == 0) {
            editable.insert(0, "0");
            return;
        }
        if (string.equals("00")) {
            editable.delete(1, 2);
            return;
        }
        if (string.startsWith("0") && string.length() > 1 && (iIndexOf == -1 || iIndexOf > 1)) {
            editable.delete(0, 1);
            return;
        }
        if (iIndexOf < 0 && beforeDot != -1) {
            if (string.length() > beforeDot) {
                editable.delete(beforeDot, beforeDot + 1);
            }
            if (TextUtils.isEmpty(string) || Double.parseDouble(string) <= 200.0d) {
                return;
            }
            nn86.m7150k(R.string.detail_reward_exceed_limit, 0);
            editText.setText("200");
            editText.setSelection(editText.getText().length());
            return;
        }
        if ((string.length() - iIndexOf) - 1 > afterDot && afterDot != -1) {
            int i2 = iIndexOf + afterDot;
            editable.delete(i2 + 1, i2 + 2);
        }
        if (TextUtils.isEmpty(string) || Double.parseDouble(string) <= 200.0d) {
            return;
        }
        nn86.m7150k(R.string.detail_reward_exceed_limit, 0);
        editText.setText("200");
        editText.setSelection(editText.getText().length());
    }

    /* JADX INFO: renamed from: q */
    public static void m7818q() {
        C1824r.m7203y().m7206p(f11370k, true).m7204k();
    }

    public static int toq(int maxValue, int saveValue) {
        if (maxValue <= 1) {
            return maxValue;
        }
        int iNextInt = new Random().nextInt(maxValue);
        return iNextInt == saveValue ? (iNextInt + 1) % (maxValue - 1) : iNextInt;
    }

    public static boolean zy() {
        return C1824r.m7203y().zy(f11370k, false);
    }
}
