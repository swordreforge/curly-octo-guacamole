package com.miui.maml.data;

import android.text.TextUtils;
import com.miui.maml.ScreenElementRoot;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class VariableUpdaterManager {
    public static final String USE_TAG_NONE = "none";
    private WeakReference<ScreenElementRoot> mRootRef;
    private ArrayList<VariableUpdater> mUpdaters = new ArrayList<>();

    public VariableUpdaterManager(ScreenElementRoot screenElementRoot) {
        this.mRootRef = new WeakReference<>(screenElementRoot);
    }

    public void add(VariableUpdater variableUpdater) {
        this.mUpdaters.add(variableUpdater);
    }

    public void addFromTag(String str) {
        if (TextUtils.isEmpty(str) || "none".equalsIgnoreCase(str)) {
            return;
        }
        for (String str2 : str.split(",")) {
            String strTrim = str2.trim();
            String strSubstring = null;
            int iIndexOf = strTrim.indexOf(46);
            if (iIndexOf != -1) {
                String strSubstring2 = strTrim.substring(0, iIndexOf);
                strSubstring = strTrim.substring(iIndexOf + 1);
                strTrim = strSubstring2;
            }
            if (strTrim.equals("DateTime")) {
                add(new DateTimeVariableUpdater(this, strSubstring));
            } else if (strTrim.equals(BatteryVariableUpdater.USE_TAG)) {
                add(new BatteryVariableUpdater(this));
            }
        }
    }

    public void finish() {
        Iterator<VariableUpdater> it = this.mUpdaters.iterator();
        while (it.hasNext()) {
            it.next().finish();
        }
    }

    public ScreenElementRoot getRoot() {
        WeakReference<ScreenElementRoot> weakReference = this.mRootRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void init() {
        Iterator<VariableUpdater> it = this.mUpdaters.iterator();
        while (it.hasNext()) {
            it.next().init();
        }
    }

    public void pause() {
        Iterator<VariableUpdater> it = this.mUpdaters.iterator();
        while (it.hasNext()) {
            it.next().pause();
        }
    }

    public void remove(VariableUpdater variableUpdater) {
        this.mUpdaters.remove(variableUpdater);
    }

    public void resume() {
        Iterator<VariableUpdater> it = this.mUpdaters.iterator();
        while (it.hasNext()) {
            it.next().resume();
        }
    }

    public void tick(long j2) {
        Iterator<VariableUpdater> it = this.mUpdaters.iterator();
        while (it.hasNext()) {
            it.next().tick(j2);
        }
    }
}
