package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: renamed from: androidx.appcompat.widget.z */
/* JADX INFO: compiled from: AppCompatSpinner$InspectionCompanion.java */
/* JADX INFO: loaded from: classes.dex */
@zy.hyr(29)
@zy.uv6({uv6.EnumC7844k.LIBRARY})
public final class InspectionCompanionC0224z implements InspectionCompanion {

    /* JADX INFO: renamed from: k */
    private boolean f1222k = false;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f46979toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f46980zy;

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void readProperties(@zy.lvui AppCompatSpinner appCompatSpinner, @zy.lvui PropertyReader propertyReader) {
        if (!this.f1222k) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.f46979toq, appCompatSpinner.getBackgroundTintList());
        propertyReader.readObject(this.f46980zy, appCompatSpinner.getBackgroundTintMode());
    }

    public void mapProperties(@zy.lvui PropertyMapper propertyMapper) {
        this.f46979toq = propertyMapper.mapObject("backgroundTint", C7397k.toq.f92873hb);
        this.f46980zy = propertyMapper.mapObject("backgroundTintMode", C7397k.toq.f42486j);
        this.f1222k = true;
    }
}
