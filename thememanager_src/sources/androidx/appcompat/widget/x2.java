package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: compiled from: AppCompatEditText$InspectionCompanion.java */
/* JADX INFO: loaded from: classes.dex */
@zy.hyr(29)
@zy.uv6({uv6.EnumC7844k.LIBRARY})
public final class x2 implements InspectionCompanion {

    /* JADX INFO: renamed from: k */
    private boolean f1207k = false;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f46969toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f46970zy;

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void readProperties(@zy.lvui AppCompatEditText appCompatEditText, @zy.lvui PropertyReader propertyReader) {
        if (!this.f1207k) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.f46969toq, appCompatEditText.getBackgroundTintList());
        propertyReader.readObject(this.f46970zy, appCompatEditText.getBackgroundTintMode());
    }

    public void mapProperties(@zy.lvui PropertyMapper propertyMapper) {
        this.f46969toq = propertyMapper.mapObject("backgroundTint", C7397k.toq.f92873hb);
        this.f46970zy = propertyMapper.mapObject("backgroundTintMode", C7397k.toq.f42486j);
        this.f1207k = true;
    }
}
