package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: compiled from: AppCompatRadioButton$InspectionCompanion.java */
/* JADX INFO: loaded from: classes.dex */
@zy.hyr(29)
@zy.uv6({uv6.EnumC7844k.LIBRARY})
public final class zurt implements InspectionCompanion {

    /* JADX INFO: renamed from: k */
    private boolean f1240k = false;

    /* JADX INFO: renamed from: n */
    private int f1241n;

    /* JADX INFO: renamed from: q */
    private int f1242q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f46981toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f46982zy;

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void readProperties(@zy.lvui AppCompatRadioButton appCompatRadioButton, @zy.lvui PropertyReader propertyReader) {
        if (!this.f1240k) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.f46981toq, appCompatRadioButton.getBackgroundTintList());
        propertyReader.readObject(this.f46982zy, appCompatRadioButton.getBackgroundTintMode());
        propertyReader.readObject(this.f1242q, appCompatRadioButton.getButtonTintList());
        propertyReader.readObject(this.f1241n, appCompatRadioButton.getButtonTintMode());
    }

    public void mapProperties(@zy.lvui PropertyMapper propertyMapper) {
        this.f46981toq = propertyMapper.mapObject("backgroundTint", C7397k.toq.f92873hb);
        this.f46982zy = propertyMapper.mapObject("backgroundTintMode", C7397k.toq.f42486j);
        this.f1242q = propertyMapper.mapObject("buttonTint", C7397k.toq.f92927nmn5);
        this.f1241n = propertyMapper.mapObject("buttonTintMode", C7397k.toq.f92907lv5);
        this.f1240k = true;
    }
}
