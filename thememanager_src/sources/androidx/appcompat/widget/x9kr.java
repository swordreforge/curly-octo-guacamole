package androidx.appcompat.widget;

import android.R;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import com.google.android.exoplayer2.text.ttml.C3678q;
import java.util.HashSet;
import java.util.Set;
import java.util.function.IntFunction;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: compiled from: LinearLayoutCompat$InspectionCompanion.java */
/* JADX INFO: loaded from: classes.dex */
@zy.hyr(29)
@zy.uv6({uv6.EnumC7844k.LIBRARY})
public final class x9kr implements InspectionCompanion {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f46971f7l8;

    /* JADX INFO: renamed from: g */
    private int f1208g;

    /* JADX INFO: renamed from: k */
    private boolean f1209k = false;

    /* JADX INFO: renamed from: n */
    private int f1210n;

    /* JADX INFO: renamed from: p */
    private int f1211p;

    /* JADX INFO: renamed from: q */
    private int f1212q;

    /* JADX INFO: renamed from: s */
    private int f1213s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f46972toq;

    /* JADX INFO: renamed from: y */
    private int f1214y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f46973zy;

    /* JADX INFO: renamed from: androidx.appcompat.widget.x9kr$k */
    /* JADX INFO: compiled from: LinearLayoutCompat$InspectionCompanion.java */
    class C0222k implements IntFunction<String> {
        C0222k() {
        }

        @Override // java.util.function.IntFunction
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public String apply(int i2) {
            return i2 != 0 ? i2 != 1 ? String.valueOf(i2) : "vertical" : "horizontal";
        }
    }

    /* JADX INFO: compiled from: LinearLayoutCompat$InspectionCompanion.java */
    class toq implements IntFunction<Set<String>> {
        toq() {
        }

        @Override // java.util.function.IntFunction
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Set<String> apply(int i2) {
            HashSet hashSet = new HashSet();
            if (i2 == 0) {
                hashSet.add("none");
            }
            if (i2 == 1) {
                hashSet.add("beginning");
            }
            if (i2 == 2) {
                hashSet.add("middle");
            }
            if (i2 == 4) {
                hashSet.add(C3678q.f65807ch);
            }
            return hashSet;
        }
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void readProperties(@zy.lvui LinearLayoutCompat linearLayoutCompat, @zy.lvui PropertyReader propertyReader) {
        if (!this.f1209k) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readBoolean(this.f46972toq, linearLayoutCompat.m465i());
        propertyReader.readInt(this.f46973zy, linearLayoutCompat.getBaselineAlignedChildIndex());
        propertyReader.readGravity(this.f1212q, linearLayoutCompat.getGravity());
        propertyReader.readIntEnum(this.f1210n, linearLayoutCompat.getOrientation());
        propertyReader.readFloat(this.f1208g, linearLayoutCompat.getWeightSum());
        propertyReader.readObject(this.f46971f7l8, linearLayoutCompat.getDividerDrawable());
        propertyReader.readInt(this.f1214y, linearLayoutCompat.getDividerPadding());
        propertyReader.readBoolean(this.f1213s, linearLayoutCompat.fn3e());
        propertyReader.readIntFlag(this.f1211p, linearLayoutCompat.getShowDividers());
    }

    public void mapProperties(@zy.lvui PropertyMapper propertyMapper) {
        this.f46972toq = propertyMapper.mapBoolean("baselineAligned", R.attr.baselineAligned);
        this.f46973zy = propertyMapper.mapInt("baselineAlignedChildIndex", R.attr.baselineAlignedChildIndex);
        this.f1212q = propertyMapper.mapGravity("gravity", R.attr.gravity);
        this.f1210n = propertyMapper.mapIntEnum("orientation", R.attr.orientation, new C0222k());
        this.f1208g = propertyMapper.mapFloat("weightSum", R.attr.weightSum);
        this.f46971f7l8 = propertyMapper.mapObject("divider", C7397k.toq.f92890kcsr);
        this.f1214y = propertyMapper.mapInt("dividerPadding", C7397k.toq.f92955se);
        this.f1213s = propertyMapper.mapBoolean("measureWithLargestChild", C7397k.toq.f93004z4t);
        this.f1211p = propertyMapper.mapIntFlag("showDividers", C7397k.toq.f92976vwb, new toq());
        this.f1209k = true;
    }
}
