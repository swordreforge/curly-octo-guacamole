package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.core.motion.utils.zurt;
import androidx.constraintlayout.widget.C0395k;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.s */
/* JADX INFO: compiled from: KeyFrames.java */
/* JADX INFO: loaded from: classes.dex */
public class C0378s {

    /* JADX INFO: renamed from: g */
    private static final String f2392g = "KeyFrames";

    /* JADX INFO: renamed from: n */
    static HashMap<String, Constructor<? extends AbstractC0368g>> f2393n = null;

    /* JADX INFO: renamed from: q */
    private static final String f2394q = "CustomAttribute";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f48271toq = -1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f48272zy = "CustomMethod";

    /* JADX INFO: renamed from: k */
    private HashMap<Integer, ArrayList<AbstractC0368g>> f2395k = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends AbstractC0368g>> map = new HashMap<>();
        f2393n = map;
        try {
            map.put("KeyAttribute", f7l8.class.getConstructor(new Class[0]));
            f2393n.put(zurt.f7l8.f1703k, C0375p.class.getConstructor(new Class[0]));
            f2393n.put(zurt.zy.f1774k, C0383y.class.getConstructor(new Class[0]));
            f2393n.put("KeyTimeCycle", x2.class.getConstructor(new Class[0]));
            f2393n.put(zurt.InterfaceC0293s.f1748k, qrj.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e2) {
            Log.e(f2392g, "unable to load", e2);
        }
    }

    public C0378s() {
    }

    /* JADX INFO: renamed from: g */
    static String m1513g(int viewId, Context context) {
        return context.getResources().getResourceEntryName(viewId);
    }

    /* JADX INFO: renamed from: k */
    public void m1514k(kja0 motionController) {
        ArrayList<AbstractC0368g> arrayList = this.f2395k.get(-1);
        if (arrayList != null) {
            motionController.toq(arrayList);
        }
    }

    /* JADX INFO: renamed from: n */
    public Set<Integer> m1515n() {
        return this.f2395k.keySet();
    }

    /* JADX INFO: renamed from: q */
    public ArrayList<AbstractC0368g> m1516q(int id) {
        return this.f2395k.get(Integer.valueOf(id));
    }

    public void toq(kja0 motionController) {
        ArrayList<AbstractC0368g> arrayList = this.f2395k.get(Integer.valueOf(motionController.f48165zy));
        if (arrayList != null) {
            motionController.toq(arrayList);
        }
        ArrayList<AbstractC0368g> arrayList2 = this.f2395k.get(-1);
        if (arrayList2 != null) {
            for (AbstractC0368g abstractC0368g : arrayList2) {
                if (abstractC0368g.f7l8(((ConstraintLayout.toq) motionController.f48161toq.getLayoutParams()).f2644j)) {
                    motionController.m1472k(abstractC0368g);
                }
            }
        }
    }

    public void zy(AbstractC0368g key) {
        if (!this.f2395k.containsKey(Integer.valueOf(key.f48082toq))) {
            this.f2395k.put(Integer.valueOf(key.f48082toq), new ArrayList<>());
        }
        ArrayList<AbstractC0368g> arrayList = this.f2395k.get(Integer.valueOf(key.f48082toq));
        if (arrayList != null) {
            arrayList.add(key);
        }
    }

    public C0378s(Context context, XmlPullParser parser) {
        AbstractC0368g abstractC0368gNewInstance;
        Exception e2;
        Constructor<? extends AbstractC0368g> constructor;
        HashMap<String, C0395k> map;
        HashMap<String, C0395k> map2;
        AbstractC0368g abstractC0368g = null;
        try {
            int eventType = parser.getEventType();
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && o1t.f48185o1t.equals(parser.getName())) {
                        return;
                    }
                } else {
                    String name = parser.getName();
                    if (f2393n.containsKey(name)) {
                        try {
                            constructor = f2393n.get(name);
                        } catch (Exception e3) {
                            abstractC0368gNewInstance = abstractC0368g;
                            e2 = e3;
                        }
                        if (constructor != null) {
                            abstractC0368gNewInstance = constructor.newInstance(new Object[0]);
                            try {
                                abstractC0368gNewInstance.mo1431g(context, Xml.asAttributeSet(parser));
                                zy(abstractC0368gNewInstance);
                            } catch (Exception e4) {
                                e2 = e4;
                                Log.e(f2392g, "unable to create ", e2);
                            }
                            abstractC0368g = abstractC0368gNewInstance;
                        } else {
                            throw new NullPointerException("Keymaker for " + name + " not found");
                        }
                        Log.e(f2392g, "unable to create ", e2);
                        abstractC0368g = abstractC0368gNewInstance;
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (abstractC0368g != null && (map2 = abstractC0368g.f2241n) != null) {
                            C0395k.cdj(context, parser, map2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && abstractC0368g != null && (map = abstractC0368g.f2241n) != null) {
                        C0395k.cdj(context, parser, map);
                    }
                }
                eventType = parser.next();
            }
        } catch (IOException e6) {
            e6.printStackTrace();
        } catch (XmlPullParserException e7) {
            e7.printStackTrace();
        }
    }
}
