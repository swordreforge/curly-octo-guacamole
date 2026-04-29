package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: compiled from: AppCompatImageView$InspectionCompanion.java */
/* JADX INFO: loaded from: classes.dex */
@zy.hyr(29)
@zy.uv6({uv6.EnumC7844k.LIBRARY})
public final class ki implements InspectionCompanion {

    /* JADX INFO: renamed from: k */
    private boolean f1083k = false;

    /* JADX INFO: renamed from: n */
    private int f1084n;

    /* JADX INFO: renamed from: q */
    private int f1085q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f46907toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f46908zy;

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void readProperties(@zy.lvui AppCompatImageView appCompatImageView, @zy.lvui PropertyReader propertyReader) {
        if (!this.f1083k) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.f46907toq, appCompatImageView.getBackgroundTintList());
        propertyReader.readObject(this.f46908zy, appCompatImageView.getBackgroundTintMode());
        propertyReader.readObject(this.f1085q, appCompatImageView.getImageTintList());
        propertyReader.readObject(this.f1084n, appCompatImageView.getImageTintMode());
    }

    public void mapProperties(@zy.lvui PropertyMapper propertyMapper) {
        this.f46907toq = propertyMapper.mapObject("backgroundTint", C7397k.toq.f92873hb);
        this.f46908zy = propertyMapper.mapObject("backgroundTintMode", C7397k.toq.f42486j);
        this.f1085q = propertyMapper.mapObject("tint", C7397k.toq.kjd);
        this.f1084n = propertyMapper.mapObject("tintMode", C7397k.toq.m28);
        this.f1083k = true;
    }
}
