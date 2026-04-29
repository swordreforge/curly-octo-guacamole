package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: compiled from: AppCompatMultiAutoCompleteTextView$InspectionCompanion.java */
/* JADX INFO: loaded from: classes.dex */
@zy.hyr(29)
@zy.uv6({uv6.EnumC7844k.LIBRARY})
public final class t8r implements InspectionCompanion {

    /* JADX INFO: renamed from: k */
    private boolean f1193k = false;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f46961toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f46962zy;

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void readProperties(@zy.lvui AppCompatMultiAutoCompleteTextView appCompatMultiAutoCompleteTextView, @zy.lvui PropertyReader propertyReader) {
        if (!this.f1193k) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.f46961toq, appCompatMultiAutoCompleteTextView.getBackgroundTintList());
        propertyReader.readObject(this.f46962zy, appCompatMultiAutoCompleteTextView.getBackgroundTintMode());
    }

    public void mapProperties(@zy.lvui PropertyMapper propertyMapper) {
        this.f46961toq = propertyMapper.mapObject("backgroundTint", C7397k.toq.f92873hb);
        this.f46962zy = propertyMapper.mapObject("backgroundTintMode", C7397k.toq.f42486j);
        this.f1193k = true;
    }
}
