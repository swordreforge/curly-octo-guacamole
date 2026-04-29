package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: renamed from: androidx.appcompat.widget.y */
/* JADX INFO: compiled from: AppCompatCheckedTextView$InspectionCompanion.java */
/* JADX INFO: loaded from: classes.dex */
@zy.hyr(29)
@zy.uv6({uv6.EnumC7844k.LIBRARY})
public final class InspectionCompanionC0223y implements InspectionCompanion {

    /* JADX INFO: renamed from: k */
    private boolean f1217k = false;

    /* JADX INFO: renamed from: n */
    private int f1218n;

    /* JADX INFO: renamed from: q */
    private int f1219q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f46974toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f46975zy;

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void readProperties(@zy.lvui AppCompatCheckedTextView appCompatCheckedTextView, @zy.lvui PropertyReader propertyReader) {
        if (!this.f1217k) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.f46974toq, appCompatCheckedTextView.getBackgroundTintList());
        propertyReader.readObject(this.f46975zy, appCompatCheckedTextView.getBackgroundTintMode());
        propertyReader.readObject(this.f1219q, appCompatCheckedTextView.getCheckMarkTintList());
        propertyReader.readObject(this.f1218n, appCompatCheckedTextView.getCheckMarkTintMode());
    }

    public void mapProperties(@zy.lvui PropertyMapper propertyMapper) {
        this.f46974toq = propertyMapper.mapObject("backgroundTint", C7397k.toq.f92873hb);
        this.f46975zy = propertyMapper.mapObject("backgroundTintMode", C7397k.toq.f42486j);
        this.f1219q = propertyMapper.mapObject("checkMarkTint", C7397k.toq.f42497u);
        this.f1218n = propertyMapper.mapObject("checkMarkTintMode", C7397k.toq.f92823bo);
        this.f1217k = true;
    }
}
