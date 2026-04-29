package androidx.window.embedding;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import androidx.window.core.InterfaceC1310q;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import kotlin.collections.a98o;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.text.fti;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import org.xmlpull.v1.XmlPullParserException;
import p021e.C5996k;
import v5yj.C7704k;

/* JADX INFO: renamed from: androidx.window.embedding.z */
/* JADX INFO: compiled from: SplitRuleParser.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u001a\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002J'\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Landroidx/window/embedding/z;", "", "Landroid/content/Context;", "context", "", "splitResourceId", "", "Landroidx/window/embedding/qrj;", AnimatedProperty.PROPERTY_NAME_Y, "Landroid/content/res/XmlResourceParser;", "parser", "Landroidx/window/embedding/zurt;", "n", "Landroidx/window/embedding/ni7;", C7704k.y.toq.f95579toq, "Landroidx/window/embedding/fn3e;", "q", "Landroidx/window/embedding/toq;", "zy", "Landroidx/window/embedding/k;", "toq", "", "pkg", "", "clsSeq", "Landroid/content/ComponentName;", "k", "staticRuleResourceId", "f7l8", "(Landroid/content/Context;I)Ljava/util/Set;", C4991s.f28129n, "()V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
@InterfaceC1310q
public final class C1326z {
    /* JADX INFO: renamed from: g */
    private final ni7 m5657g(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C5996k.zy.f73800ki, 0, 0);
        String string = typedArrayObtainStyledAttributes.getString(C5996k.zy.f73806t8r);
        float f2 = typedArrayObtainStyledAttributes.getFloat(C5996k.zy.f73804ni7, 0.0f);
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(C5996k.zy.f73809zurt, 0.0f);
        int dimension2 = (int) typedArrayObtainStyledAttributes.getDimension(C5996k.zy.f73799fn3e, 0.0f);
        int i2 = typedArrayObtainStyledAttributes.getInt(C5996k.zy.f34386i, 3);
        String packageName = context.getApplicationContext().getPackageName();
        d2ok.kja0(packageName, "packageName");
        ComponentName componentNameM5658k = m5658k(packageName, string);
        Set setLd6 = a98o.ld6();
        Intent component = new Intent().setComponent(componentNameM5658k);
        d2ok.kja0(component, "Intent().setComponent(pl…eholderActivityClassName)");
        return new ni7(setLd6, component, dimension, dimension2, f2, i2);
    }

    /* JADX INFO: renamed from: k */
    private final ComponentName m5658k(String str, CharSequence charSequence) {
        if (charSequence != null) {
            if (!(charSequence.length() == 0)) {
                String string = charSequence.toString();
                if (string.charAt(0) == '.') {
                    return new ComponentName(str, d2ok.mcp(str, string));
                }
                int iSc = fti.sc(string, '/', 0, false, 6, null);
                if (iSc > 0) {
                    str = string.substring(0, iSc);
                    d2ok.kja0(str, "this as java.lang.String…ing(startIndex, endIndex)");
                    string = string.substring(iSc + 1);
                    d2ok.kja0(string, "this as java.lang.String).substring(startIndex)");
                }
                if (d2ok.f7l8(string, "*") || fti.sc(string, '.', 0, false, 6, null) >= 0) {
                    return new ComponentName(str, string);
                }
                return new ComponentName(str, str + '.' + string);
            }
        }
        throw new IllegalArgumentException("Activity name must not be null");
    }

    /* JADX INFO: renamed from: n */
    private final zurt m5659n(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C5996k.zy.f34389p, 0, 0);
        float f2 = typedArrayObtainStyledAttributes.getFloat(C5996k.zy.f73797cdj, 0.0f);
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(C5996k.zy.f34385h, 0.0f);
        int dimension2 = (int) typedArrayObtainStyledAttributes.getDimension(C5996k.zy.f73801kja0, 0.0f);
        int i2 = typedArrayObtainStyledAttributes.getInt(C5996k.zy.f73803n7h, 3);
        return new zurt(a98o.ld6(), typedArrayObtainStyledAttributes.getBoolean(C5996k.zy.f73808x2, false), typedArrayObtainStyledAttributes.getBoolean(C5996k.zy.f73805qrj, true), typedArrayObtainStyledAttributes.getBoolean(C5996k.zy.f73802ld6, false), dimension, dimension2, f2, i2);
    }

    /* JADX INFO: renamed from: q */
    private final fn3e m5660q(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C5996k.zy.f34384g, 0, 0);
        String string = typedArrayObtainStyledAttributes.getString(C5996k.zy.f73798f7l8);
        String string2 = typedArrayObtainStyledAttributes.getString(C5996k.zy.f34391s);
        String string3 = typedArrayObtainStyledAttributes.getString(C5996k.zy.f34392y);
        String packageName = context.getApplicationContext().getPackageName();
        d2ok.kja0(packageName, "packageName");
        return new fn3e(m5658k(packageName, string), m5658k(packageName, string2), string3);
    }

    private final C1317k toq(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C5996k.zy.f34387k, 0, 0);
        String string = typedArrayObtainStyledAttributes.getString(C5996k.zy.f73810zy);
        String string2 = typedArrayObtainStyledAttributes.getString(C5996k.zy.f73807toq);
        String packageName = context.getApplicationContext().getPackageName();
        d2ok.kja0(packageName, "packageName");
        return new C1317k(m5658k(packageName, string), string2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: y */
    private final Set<qrj> m5661y(Context context, int i2) throws XmlPullParserException, IOException {
        ni7 ni7VarM5638y;
        toq toqVarZy;
        zurt zurtVarM5659n;
        try {
            XmlResourceParser xml = context.getResources().getXml(i2);
            d2ok.kja0(xml, "resources.getXml(splitResourceId)");
            HashSet hashSet = new HashSet();
            int depth = xml.getDepth();
            int next = xml.next();
            toq toqVar = null;
            zurt zurtVar = null;
            ni7 ni7Var = null;
            while (next != 1 && (next != 3 || xml.getDepth() > depth)) {
                if (xml.getEventType() != 2 || d2ok.f7l8("split-config", xml.getName())) {
                    next = xml.next();
                } else {
                    String name = xml.getName();
                    if (name != null) {
                        switch (name.hashCode()) {
                            case 511422343:
                                if (name.equals("ActivityFilter")) {
                                    if (toqVar == null && ni7Var == null) {
                                        throw new IllegalArgumentException("Found orphaned ActivityFilter");
                                    }
                                    C1317k qVar = toq(context, xml);
                                    if (toqVar != null) {
                                        hashSet.remove(toqVar);
                                        toqVarZy = toqVar.zy(qVar);
                                        hashSet.add(toqVarZy);
                                        toqVar = toqVarZy;
                                    } else if (ni7Var != null) {
                                        hashSet.remove(ni7Var);
                                        ni7VarM5638y = ni7Var.m5638y(qVar);
                                        hashSet.add(ni7VarM5638y);
                                        ni7Var = ni7VarM5638y;
                                    }
                                }
                                break;
                            case 520447504:
                                if (name.equals("SplitPairRule")) {
                                    zurtVarM5659n = m5659n(context, xml);
                                    hashSet.add(zurtVarM5659n);
                                    toqVar = null;
                                    ni7Var = null;
                                    zurtVar = zurtVarM5659n;
                                }
                                break;
                            case 1579230604:
                                if (name.equals("SplitPairFilter")) {
                                    if (zurtVar == null) {
                                        throw new IllegalArgumentException("Found orphaned SplitPairFilter outside of SplitPairRule");
                                    }
                                    fn3e fn3eVarM5660q = m5660q(context, xml);
                                    hashSet.remove(zurtVar);
                                    zurtVarM5659n = zurtVar.m5663p(fn3eVarM5660q);
                                    hashSet.add(zurtVarM5659n);
                                    zurtVar = zurtVarM5659n;
                                }
                                break;
                            case 1793077963:
                                if (name.equals("ActivityRule")) {
                                    toqVarZy = zy(context, xml);
                                    hashSet.add(toqVarZy);
                                    zurtVar = null;
                                    ni7Var = null;
                                    toqVar = toqVarZy;
                                }
                                break;
                            case 2050988213:
                                if (name.equals("SplitPlaceholderRule")) {
                                    ni7VarM5638y = m5657g(context, xml);
                                    hashSet.add(ni7VarM5638y);
                                    toqVar = null;
                                    zurtVar = null;
                                    ni7Var = ni7VarM5638y;
                                }
                                break;
                        }
                    }
                    next = xml.next();
                }
            }
            return hashSet;
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private final toq zy(Context context, XmlResourceParser xmlResourceParser) {
        return new toq(a98o.ld6(), context.getTheme().obtainStyledAttributes(xmlResourceParser, C5996k.zy.f34390q, 0, 0).getBoolean(C5996k.zy.f34388n, false));
    }

    @InterfaceC7395n
    public final Set<qrj> f7l8(@InterfaceC7396q Context context, int i2) {
        d2ok.m23075h(context, "context");
        return m5661y(context, i2);
    }
}
