package com.airbnb.lottie.manager;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.airbnb.lottie.model.C1473s;
import com.airbnb.lottie.utils.C1510q;
import java.util.HashMap;
import java.util.Map;
import zy.dd;

/* JADX INFO: renamed from: com.airbnb.lottie.manager.k */
/* JADX INFO: compiled from: FontAssetManager.java */
/* JADX INFO: loaded from: classes.dex */
public class C1441k {

    /* JADX INFO: renamed from: n */
    @dd
    private com.airbnb.lottie.zy f7970n;

    /* JADX INFO: renamed from: q */
    private final AssetManager f7971q;

    /* JADX INFO: renamed from: k */
    private final C1473s<String> f7969k = new C1473s<>();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Map<C1473s<String>, Typeface> f55975toq = new HashMap();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Map<String, Typeface> f55976zy = new HashMap();

    /* JADX INFO: renamed from: g */
    private String f7968g = ".ttf";

    public C1441k(Drawable.Callback callback, @dd com.airbnb.lottie.zy zyVar) {
        this.f7970n = zyVar;
        if (callback instanceof View) {
            this.f7971q = ((View) callback).getContext().getAssets();
        } else {
            C1510q.m6255n("LottieDrawable must be inside of a view for images to work.");
            this.f7971q = null;
        }
    }

    /* JADX INFO: renamed from: k */
    private Typeface m5990k(String str) {
        String qVar;
        Typeface typeface = this.f55976zy.get(str);
        if (typeface != null) {
            return typeface;
        }
        com.airbnb.lottie.zy zyVar = this.f7970n;
        Typeface typefaceM6299k = zyVar != null ? zyVar.m6299k(str) : null;
        com.airbnb.lottie.zy zyVar2 = this.f7970n;
        if (zyVar2 != null && typefaceM6299k == null && (qVar = zyVar2.toq(str)) != null) {
            typefaceM6299k = Typeface.createFromAsset(this.f7971q, qVar);
        }
        if (typefaceM6299k == null) {
            typefaceM6299k = Typeface.createFromAsset(this.f7971q, "fonts/" + str + this.f7968g);
        }
        this.f55976zy.put(str, typefaceM6299k);
        return typefaceM6299k;
    }

    /* JADX INFO: renamed from: n */
    private Typeface m5991n(Typeface typeface, String str) {
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        int i2 = (zContains && zContains2) ? 3 : zContains ? 2 : zContains2 ? 1 : 0;
        return typeface.getStyle() == i2 ? typeface : Typeface.create(typeface, i2);
    }

    /* JADX INFO: renamed from: q */
    public void m5992q(@dd com.airbnb.lottie.zy zyVar) {
        this.f7970n = zyVar;
    }

    public Typeface toq(String str, String str2) {
        this.f7969k.toq(str, str2);
        Typeface typeface = this.f55975toq.get(this.f7969k);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceM5991n = m5991n(m5990k(str), str2);
        this.f55975toq.put(this.f7969k, typefaceM5991n);
        return typefaceM5991n;
    }

    public void zy(String str) {
        this.f7968g = str;
    }
}
