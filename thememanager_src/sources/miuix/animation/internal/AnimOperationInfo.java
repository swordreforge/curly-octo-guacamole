package miuix.animation.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import miuix.animation.IAnimTarget;
import miuix.animation.ValueTarget;
import miuix.animation.property.FloatProperty;

/* JADX INFO: loaded from: classes3.dex */
class AnimOperationInfo {
    public final byte op;
    public final List<FloatProperty> propList;
    public volatile long sendTime;
    public final IAnimTarget target;
    public int usedCount = 0;

    AnimOperationInfo(IAnimTarget iAnimTarget, byte b2, String[] strArr, FloatProperty[] floatPropertyArr) {
        this.op = b2;
        this.target = iAnimTarget;
        if (strArr == null || !(iAnimTarget instanceof ValueTarget)) {
            if (floatPropertyArr != null) {
                this.propList = Arrays.asList(floatPropertyArr);
                return;
            } else {
                this.propList = null;
                return;
            }
        }
        ValueTarget valueTarget = (ValueTarget) iAnimTarget;
        this.propList = new ArrayList();
        for (String str : strArr) {
            this.propList.add(valueTarget.getFloatProperty(str));
        }
    }

    boolean isUsed() {
        List<FloatProperty> list = this.propList;
        int size = list == null ? 0 : list.size();
        if (size == 0) {
            if (this.usedCount <= 0) {
                return false;
            }
        } else if (this.usedCount != size) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AnimOperationInfo{target=");
        sb.append(this.target);
        sb.append(", op=");
        sb.append((int) this.op);
        sb.append(", propList=");
        List<FloatProperty> list = this.propList;
        sb.append(list != null ? Arrays.toString(list.toArray()) : null);
        sb.append('}');
        return sb.toString();
    }
}
