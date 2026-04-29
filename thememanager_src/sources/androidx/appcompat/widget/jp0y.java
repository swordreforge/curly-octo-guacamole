package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: compiled from: AppCompatToggleButton$InspectionCompanion.java */
/* JADX INFO: loaded from: classes.dex */
@zy.hyr(29)
@zy.uv6({uv6.EnumC7844k.LIBRARY})
public final class jp0y implements InspectionCompanion {

    /* JADX INFO: renamed from: k */
    private boolean f1071k = false;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f46903toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f46904zy;

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void readProperties(@zy.lvui AppCompatToggleButton appCompatToggleButton, @zy.lvui PropertyReader propertyReader) {
        if (!this.f1071k) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.f46903toq, appCompatToggleButton.getBackgroundTintList());
        propertyReader.readObject(this.f46904zy, appCompatToggleButton.getBackgroundTintMode());
    }

    public void mapProperties(@zy.lvui PropertyMapper propertyMapper) {
        this.f46903toq = propertyMapper.mapObject("backgroundTint", C7397k.toq.f92873hb);
        this.f46904zy = propertyMapper.mapObject("backgroundTintMode", C7397k.toq.f42486j);
        this.f1071k = true;
    }
}
