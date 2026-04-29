package com.theme.loopwallpaper.activity;

import android.net.Uri;
import com.android.thememanager.basemodule.async.AbstractAsyncTaskC1714q;
import com.theme.loopwallpaper.model.LoopWallpaper;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.theme.loopwallpaper.activity.k */
/* JADX INFO: compiled from: AddLoopWallpaperAsyncTask.java */
/* JADX INFO: loaded from: classes3.dex */
public class AsyncTaskC5437k extends AbstractAsyncTaskC1714q<Void, Void, ArrayList<LoopWallpaper>> {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private ArrayList<Uri> f72531toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f72532zy;

    public AsyncTaskC5437k(com.android.thememanager.basemodule.async.toq observer, ArrayList<Uri> uriList, int type) {
        this.f72531toq = uriList;
        this.f72532zy = type;
        m6700k(observer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public ArrayList<LoopWallpaper> doInBackground(Void... voids) {
        ArrayList<LoopWallpaper> arrayList = new ArrayList<>();
        Iterator<Uri> it = this.f72531toq.iterator();
        while (it.hasNext()) {
            arrayList.add(com.theme.loopwallpaper.controller.toq.m18511k(it.next(), this.f72532zy));
        }
        return arrayList;
    }
}
