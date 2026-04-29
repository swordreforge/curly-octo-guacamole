package com.android.thememanager.v9.data;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.jp0y;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIProduct;
import com.android.thememanager.router.recommend.entity.UISubject;
import com.android.thememanager.router.recommend.entity.WallpaperRecommendItem;
import com.android.thememanager.v9.fu4;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001b.InterfaceC1357q;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.v9.data.p */
/* JADX INFO: compiled from: WallpaperSubjectDataLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2853p implements InterfaceC1925p {

    /* JADX INFO: renamed from: c */
    private static final String f17071c = "TopPageIndex";

    /* JADX INFO: renamed from: e */
    private static final String f17072e = "CurrentItem";

    /* JADX INFO: renamed from: f */
    private static final String f17073f = "TopRecommendList";

    /* JADX INFO: renamed from: h */
    private Pair<Integer, Resource> f17075h;

    /* JADX INFO: renamed from: i */
    private final String f17076i;

    /* JADX INFO: renamed from: l */
    private fu4 f17078l;

    /* JADX INFO: renamed from: n */
    private final k f17079n;

    /* JADX INFO: renamed from: p */
    private Pair<Integer, UIProduct> f17080p;

    /* JADX INFO: renamed from: r */
    private boolean f17082r;

    /* JADX INFO: renamed from: t */
    private String f17084t;

    /* JADX INFO: renamed from: z */
    private String f17086z;

    /* JADX INFO: renamed from: k */
    private WallpaperRecommendItem f17077k = null;

    /* JADX INFO: renamed from: q */
    private ArrayList<WallpaperRecommendItem> f17081q = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    private int f17074g = 0;

    /* JADX INFO: renamed from: y */
    private int f17085y = 0;

    /* JADX INFO: renamed from: s */
    private int f17083s = 0;

    /* JADX INFO: renamed from: com.android.thememanager.v9.data.p$k */
    /* JADX INFO: compiled from: WallpaperSubjectDataLoader.java */
    public interface k {
        /* JADX INFO: renamed from: k */
        void mo10136k();

        /* JADX INFO: renamed from: n */
        void mo10137n(String uuid, boolean isSubject);

        /* JADX INFO: renamed from: q */
        void mo10138q();

        void toq(boolean isFirstLoad, String pageUuid);

        void zy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2853p(Activity activity, String uuid, boolean isSubject, fu4 vm, com.android.thememanager.fu4 resourceContext, k listener, String trackId) {
        this.f17076i = activity.getIntent().getStringExtra(InterfaceC1357q.f53862dxef);
        this.f17084t = uuid;
        this.f17082r = isSubject;
        this.f17078l = vm;
        this.f17079n = listener;
        this.f17086z = trackId;
        vm.uv6().m4391p((InterfaceC0954z) activity, new jp0y() { // from class: com.android.thememanager.v9.data.s
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f17090k.zy((UICard) obj);
            }
        });
    }

    private static boolean cdj(UISubject subject, boolean isFirstSubject) {
        List<UIProduct> list;
        return isFirstSubject ? (subject != null && (list = subject.products) != null && !list.isEmpty()) && !(subject.subjectUuid == null && subject.products.get(0).uuid == null) : (subject == null || subject.subjectUuid == null) ? false : true;
    }

    /* JADX INFO: renamed from: q */
    private WallpaperRecommendItem m10152q(int productPos) {
        WallpaperRecommendItem wallpaperRecommendItem;
        WallpaperRecommendItem wallpaperRecommendItem2;
        if (this.f17081q.size() <= 0 || productPos < 0) {
            return null;
        }
        WallpaperRecommendItem wallpaperRecommendItem3 = this.f17081q.get(this.f17085y);
        int i2 = this.f17085y;
        if (productPos < wallpaperRecommendItem3.startProductPos) {
            do {
                i2--;
                if (i2 < 0) {
                    return null;
                }
                wallpaperRecommendItem2 = this.f17081q.get(i2);
            } while (productPos < wallpaperRecommendItem2.startProductPos);
            return wallpaperRecommendItem2;
        }
        if (productPos <= wallpaperRecommendItem3.endProdutPos) {
            return wallpaperRecommendItem3;
        }
        int size = this.f17081q.size();
        do {
            i2++;
            if (i2 >= size) {
                return null;
            }
            wallpaperRecommendItem = this.f17081q.get(i2);
        } while (productPos > wallpaperRecommendItem.endProdutPos);
        return wallpaperRecommendItem;
    }

    public static void toq(List<UISubject> subjects, List<WallpaperRecommendItem> topRecommendList) {
        WallpaperRecommendItem wallpaperRecommendItem = new WallpaperRecommendItem();
        int i2 = 0;
        if (topRecommendList.size() == 0) {
            wallpaperRecommendItem.startProductPos = 0;
        } else {
            wallpaperRecommendItem.startProductPos = topRecommendList.get(topRecommendList.size() - 1).endProdutPos + 1;
        }
        if (topRecommendList.size() == 0 && subjects.get(0).subjectUuid == null) {
            wallpaperRecommendItem.updateBelowUuid = subjects.get(0).products.get(0).uuid;
            wallpaperRecommendItem.isSubjectUuid = false;
        } else {
            wallpaperRecommendItem.updateBelowUuid = subjects.get(0).subjectUuid;
        }
        wallpaperRecommendItem.subjects = subjects;
        for (UISubject uISubject : subjects) {
            List<UIProduct> list = uISubject.products;
            if (list != null) {
                Iterator<UIProduct> it = list.iterator();
                while (it.hasNext()) {
                    it.next().subjectUuid = uISubject.subjectUuid;
                    i2++;
                }
            }
        }
        wallpaperRecommendItem.endProdutPos = (wallpaperRecommendItem.startProductPos + i2) - 1;
        topRecommendList.add(wallpaperRecommendItem);
    }

    public static List<UISubject> x2(List<UISubject> subjects) {
        ArrayList arrayList = new ArrayList();
        if (subjects != null && subjects.size() > 0) {
            for (UISubject uISubject : subjects) {
                if (cdj(uISubject, false)) {
                    arrayList.add(uISubject);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zy(UICard result) {
        int size = this.f17081q.size();
        if (result == null) {
            if (size == 0) {
                this.f17079n.mo10138q();
                return;
            } else {
                this.f17079n.mo10136k();
                return;
            }
        }
        if (size == 0 && !cdj(result.subject, true)) {
            this.f17079n.zy();
            return;
        }
        if (size == 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(result.subject);
            toq(arrayList, this.f17081q);
            this.f17079n.toq(true, result.pageUuid);
            UIProduct uIProductF7l8 = f7l8();
            if (uIProductF7l8 != null) {
                if (!TextUtils.isEmpty(this.f17086z)) {
                    uIProductF7l8.trackId = this.f17086z;
                    this.f17086z = null;
                }
                x2.zurt(uIProductF7l8.originalImageUrl, this.f17076i);
            }
            WallpaperRecommendItem wallpaperRecommendItem = this.f17081q.get(0);
            this.f17079n.mo10137n(wallpaperRecommendItem.updateBelowUuid, wallpaperRecommendItem.isSubjectUuid);
        } else {
            WallpaperRecommendItem wallpaperRecommendItem2 = this.f17077k;
            if (wallpaperRecommendItem2 != null) {
                this.f17079n.mo10137n(wallpaperRecommendItem2.updateBelowUuid, wallpaperRecommendItem2.isSubjectUuid);
                this.f17077k = null;
            }
        }
        List<UISubject> listX2 = x2(result.rightSubjects);
        if (listX2.size() != 0) {
            toq(listX2, this.f17081q);
            this.f17079n.toq(false, result.pageUuid);
        }
        this.f17083s++;
    }

    public UIProduct f7l8() {
        Pair<Integer, UIProduct> pair = this.f17080p;
        if (pair != null && ((Integer) pair.first).intValue() == this.f17074g) {
            return (UIProduct) this.f17080p.second;
        }
        UIProduct uIProductKja0 = kja0(this.f17074g);
        if (uIProductKja0 == null) {
            return uIProductKja0;
        }
        this.f17080p = new Pair<>(Integer.valueOf(this.f17074g), uIProductKja0);
        return uIProductKja0;
    }

    public void fn3e() {
        int i2;
        int i3 = this.f17074g;
        if (i3 > 0) {
            WallpaperRecommendItem wallpaperRecommendItemM10152q = m10152q(i3);
            int i4 = this.f17074g - 1;
            this.f17074g = i4;
            if (i4 >= wallpaperRecommendItemM10152q.startProductPos || (i2 = this.f17085y) <= 0) {
                return;
            }
            int i5 = i2 - 1;
            this.f17085y = i5;
            WallpaperRecommendItem wallpaperRecommendItem = this.f17081q.get(i5);
            this.f17079n.mo10137n(wallpaperRecommendItem.updateBelowUuid, wallpaperRecommendItem.isSubjectUuid);
        }
    }

    public void fu4(int position) {
        this.f17074g = position;
    }

    /* JADX INFO: renamed from: g */
    public int m10153g() {
        return this.f17074g;
    }

    /* JADX INFO: renamed from: h */
    public boolean m10154h() {
        String str;
        File fileQrj;
        UIProduct uIProductF7l8 = f7l8();
        return (uIProductF7l8 == null || (str = uIProductF7l8.originalImageUrl) == null || (fileQrj = x2.qrj(str)) == null || !fileQrj.exists()) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public void m10155i() {
        int iQrj = qrj();
        int i2 = this.f17074g;
        if (iQrj > i2 + 1) {
            WallpaperRecommendItem wallpaperRecommendItemM10152q = m10152q(i2);
            int i3 = this.f17074g + 1;
            this.f17074g = i3;
            if (i3 > wallpaperRecommendItemM10152q.endProdutPos) {
                int size = this.f17081q.size();
                int i4 = this.f17085y;
                if (size > i4 + 1) {
                    int i5 = i4 + 1;
                    this.f17085y = i5;
                    WallpaperRecommendItem wallpaperRecommendItem = this.f17081q.get(i5);
                    this.f17079n.mo10137n(wallpaperRecommendItem.updateBelowUuid, wallpaperRecommendItem.isSubjectUuid);
                }
            }
        }
    }

    public void ki() {
        this.f17078l.m10178e(this.f17084t, this.f17083s, this.f17082r);
    }

    public UIProduct kja0(int productPos) {
        WallpaperRecommendItem wallpaperRecommendItemM10152q = m10152q(productPos);
        if (wallpaperRecommendItemM10152q == null) {
            return null;
        }
        int i2 = wallpaperRecommendItemM10152q.startProductPos;
        for (UISubject uISubject : wallpaperRecommendItemM10152q.subjects) {
            int size = uISubject.products.size() + i2;
            if (productPos < size) {
                return uISubject.products.get(productPos - i2);
            }
            i2 = size;
        }
        return null;
    }

    public int ld6(int productPos) {
        WallpaperRecommendItem wallpaperRecommendItemM10152q = m10152q(productPos);
        if (wallpaperRecommendItemM10152q == null) {
            return -1;
        }
        int i2 = wallpaperRecommendItemM10152q.startProductPos;
        Iterator<UISubject> it = wallpaperRecommendItemM10152q.subjects.iterator();
        while (it.hasNext()) {
            int size = it.next().products.size() + i2;
            if (productPos < size) {
                return (productPos - i2) + 1;
            }
            i2 = size;
        }
        return -1;
    }

    /* JADX INFO: renamed from: n */
    public UISubject m10156n(int productPos) {
        WallpaperRecommendItem wallpaperRecommendItemM10152q = m10152q(productPos);
        if (wallpaperRecommendItemM10152q == null) {
            return null;
        }
        int size = wallpaperRecommendItemM10152q.startProductPos;
        for (UISubject uISubject : wallpaperRecommendItemM10152q.subjects) {
            size += uISubject.products.size();
            if (productPos < size) {
                return uISubject;
            }
        }
        return null;
    }

    public ArrayList<WallpaperRecommendItem> n7h() {
        return this.f17081q;
    }

    public void ni7(Bundle outState, int posIndex) {
        ArrayList<WallpaperRecommendItem> arrayListN7h = n7h();
        if (arrayListN7h == null || arrayListN7h.size() <= 0) {
            return;
        }
        outState.putSerializable(f17073f, arrayListN7h);
        outState.putInt(f17071c, this.f17083s);
        outState.putSerializable(f17072e, m10152q(posIndex));
    }

    /* JADX INFO: renamed from: p */
    public Bitmap m10157p() {
        String str;
        File fileQrj;
        UIProduct uIProductKja0 = kja0(0);
        if (uIProductKja0 == null || (str = uIProductKja0.originalImageUrl) == null || (fileQrj = x2.qrj(str)) == null) {
            return null;
        }
        return BitmapFactory.decodeFile(fileQrj.getAbsolutePath());
    }

    public int qrj() {
        WallpaperRecommendItem wallpaperRecommendItem;
        if (this.f17081q.size() > 0) {
            wallpaperRecommendItem = this.f17081q.get(r0.size() - 1);
        } else {
            wallpaperRecommendItem = null;
        }
        if (wallpaperRecommendItem == null) {
            return 0;
        }
        return wallpaperRecommendItem.endProdutPos + 1;
    }

    /* JADX INFO: renamed from: s */
    public UISubject m10158s() {
        return m10156n(this.f17074g);
    }

    public void t8r(@lvui Activity activity, @lvui x2.InterfaceC1740s<Bitmap> callback) {
        String str;
        UIProduct uIProductF7l8 = f7l8();
        if (uIProductF7l8 == null || (str = uIProductF7l8.originalImageUrl) == null) {
            callback.toq();
        } else {
            x2.m6776i(activity, str, callback);
        }
    }

    /* JADX INFO: renamed from: y */
    public Resource m10159y() {
        Pair<Integer, Resource> pair = this.f17075h;
        if (pair != null && ((Integer) pair.first).intValue() == this.f17074g) {
            return (Resource) this.f17075h.second;
        }
        Resource resourceM8801q = C2451n.m8801q(f7l8(), true);
        if (resourceM8801q == null) {
            return resourceM8801q;
        }
        this.f17075h = new Pair<>(Integer.valueOf(this.f17074g), resourceM8801q);
        return resourceM8801q;
    }

    /* JADX INFO: renamed from: z */
    public void m10160z(ArrayList<WallpaperRecommendItem> recommendList) {
        this.f17081q = recommendList;
    }

    public void zurt(@lvui Bundle savedState) {
        if (savedState.containsKey(f17073f)) {
            this.f17081q = (ArrayList) savedState.getSerializable(f17073f);
            this.f17083s = savedState.getInt(f17071c, 0);
            this.f17077k = (WallpaperRecommendItem) savedState.getSerializable(f17072e);
        }
    }
}
