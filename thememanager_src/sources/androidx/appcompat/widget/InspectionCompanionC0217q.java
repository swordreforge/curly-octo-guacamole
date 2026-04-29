package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: renamed from: androidx.appcompat.widget.q */
/* JADX INFO: compiled from: AppCompatAutoCompleteTextView$InspectionCompanion.java */
/* JADX INFO: loaded from: classes.dex */
@zy.hyr(29)
@zy.uv6({uv6.EnumC7844k.LIBRARY})
public final class InspectionCompanionC0217q implements InspectionCompanion {

    /* JADX INFO: renamed from: k */
    private boolean f1173k = false;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f46945toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f46946zy;

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void readProperties(@zy.lvui AppCompatAutoCompleteTextView appCompatAutoCompleteTextView, @zy.lvui PropertyReader propertyReader) {
        if (!this.f1173k) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.f46945toq, appCompatAutoCompleteTextView.getBackgroundTintList());
        propertyReader.readObject(this.f46946zy, appCompatAutoCompleteTextView.getBackgroundTintMode());
    }

    public void mapProperties(@zy.lvui PropertyMapper propertyMapper) {
        this.f46945toq = propertyMapper.mapObject("backgroundTint", C7397k.toq.f92873hb);
        this.f46946zy = propertyMapper.mapObject("backgroundTintMode", C7397k.toq.f42486j);
        this.f1173k = true;
    }
}
