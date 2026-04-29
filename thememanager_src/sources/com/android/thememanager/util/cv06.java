package com.android.thememanager.util;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.Stack;

/* JADX INFO: compiled from: ViewMemoHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class cv06 {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f61221toq = "ViewMemoHelper";

    /* JADX INFO: renamed from: k */
    private HashMap<String, Stack<toq>> f16385k = new HashMap<>();

    /* JADX INFO: compiled from: ViewMemoHelper.java */
    private static class toq {

        /* JADX INFO: renamed from: k */
        ViewGroup f16386k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f61222toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        ViewGroup.LayoutParams f61223zy;

        private toq() {
        }
    }

    /* JADX INFO: renamed from: k */
    private String m9688k(View v2, String tag) {
        return v2.hashCode() + tag;
    }

    public void toq(View v2, String tag) {
        if (v2 == null) {
            Log.d(f61221toq, "restore fail because view is null.");
            return;
        }
        String strM9688k = m9688k(v2, tag);
        Stack<toq> stack = this.f16385k.get(strM9688k);
        if (stack == null || stack.isEmpty()) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) v2.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(v2);
        }
        toq toqVarPop = stack.pop();
        toqVarPop.f16386k.addView(v2, toqVarPop.f61222toq, toqVarPop.f61223zy);
        if (stack.isEmpty()) {
            this.f16385k.remove(strM9688k);
        }
    }

    public void zy(View v2, String tag) {
        if (v2 == null || !(v2.getParent() instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) v2.getParent();
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            if (viewGroup.getChildAt(i2) == v2) {
                toq toqVar = new toq();
                toqVar.f16386k = viewGroup;
                toqVar.f61222toq = i2;
                toqVar.f61223zy = v2.getLayoutParams();
                viewGroup.removeViewAt(i2);
                String strM9688k = m9688k(v2, tag);
                Stack<toq> stack = this.f16385k.get(strM9688k);
                if (stack == null) {
                    stack = new Stack<>();
                    this.f16385k.put(strM9688k, stack);
                }
                stack.push(toqVar);
                return;
            }
        }
    }
}
