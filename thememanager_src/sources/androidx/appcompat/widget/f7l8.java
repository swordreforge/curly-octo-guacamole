package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: compiled from: AppCompatCheckBox$InspectionCompanion.java */
/* JADX INFO: loaded from: classes.dex */
@zy.hyr(29)
@zy.uv6({uv6.EnumC7844k.LIBRARY})
public final class f7l8 implements InspectionCompanion {

    /* JADX INFO: renamed from: k */
    private boolean f1011k = false;

    /* JADX INFO: renamed from: n */
    private int f1012n;

    /* JADX INFO: renamed from: q */
    private int f1013q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f46858toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f46859zy;

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void readProperties(@zy.lvui AppCompatCheckBox appCompatCheckBox, @zy.lvui PropertyReader propertyReader) {
        if (!this.f1011k) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.f46858toq, appCompatCheckBox.getBackgroundTintList());
        propertyReader.readObject(this.f46859zy, appCompatCheckBox.getBackgroundTintMode());
        propertyReader.readObject(this.f1013q, appCompatCheckBox.getButtonTintList());
        propertyReader.readObject(this.f1012n, appCompatCheckBox.getButtonTintMode());
    }

    public void mapProperties(@zy.lvui PropertyMapper propertyMapper) {
        this.f46858toq = propertyMapper.mapObject("backgroundTint", C7397k.toq.f92873hb);
        this.f46859zy = propertyMapper.mapObject("backgroundTintMode", C7397k.toq.f42486j);
        this.f1013q = propertyMapper.mapObject("buttonTint", C7397k.toq.f92927nmn5);
        this.f1012n = propertyMapper.mapObject("buttonTintMode", C7397k.toq.f92907lv5);
        this.f1011k = true;
    }
}
