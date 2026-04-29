package com.miui.maml.elements;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.zurt;
import com.miui.maml.data.ContextVariables;
import com.miui.maml.util.MamlLog;
import com.miui.maml.util.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public class AttrDataBinders {
    private static final String ATTR_BITMAP = "bitmap";
    private static final String ATTR_NAME = "name";
    private static final String ATTR_PARAMS = "params";
    private static final String ATTR_PARAS = "paras";
    private static final String ATTR_SRC = "src";
    private static final String ATTR_SRCID = "srcid";
    private static final String ATTR_TEXT = "text";
    private static final String LOG_TAG = "AttrDataBinders";
    public static final String TAG = "AttrDataBinders";
    private ArrayList<AttrDataBinder> mBinders = new ArrayList<>();
    protected ContextVariables mVars;

    public static class AttrDataBinder {
        protected String mAttr;
        private Binder mBinder;
        protected String mData;
        protected String mTarget;
        protected ContextVariables mVars;

        private abstract class Binder {
            private Binder() {
            }

            public abstract void bind(ScreenElement screenElement);
        }

        private class BitmapBinder extends Binder {
            private BitmapBinder() {
                super();
            }

            @Override // com.miui.maml.elements.AttrDataBinders.AttrDataBinder.Binder
            public void bind(ScreenElement screenElement) {
                AttrDataBinder attrDataBinder = AttrDataBinder.this;
                ((ImageScreenElement) screenElement).setBitmap(attrDataBinder.mVars.getBmp(attrDataBinder.mData));
            }
        }

        private class NameBinder extends Binder {
            private NameBinder() {
                super();
            }

            @Override // com.miui.maml.elements.AttrDataBinders.AttrDataBinder.Binder
            public void bind(ScreenElement screenElement) {
                AttrDataBinder attrDataBinder = AttrDataBinder.this;
                screenElement.setName(attrDataBinder.mVars.getString(attrDataBinder.mData));
            }
        }

        private class ParamsBinder extends Binder {
            private ParamsBinder() {
                super();
            }

            @Override // com.miui.maml.elements.AttrDataBinders.AttrDataBinder.Binder
            public void bind(ScreenElement screenElement) {
                AttrDataBinder attrDataBinder = AttrDataBinder.this;
                ((TextScreenElement) screenElement).setParams(attrDataBinder.mVars.getVar(attrDataBinder.mData));
            }
        }

        private class SrcBinder extends Binder {
            private SrcBinder() {
                super();
            }

            @Override // com.miui.maml.elements.AttrDataBinders.AttrDataBinder.Binder
            public void bind(ScreenElement screenElement) {
                AttrDataBinder attrDataBinder = AttrDataBinder.this;
                ((ImageScreenElement) screenElement).setSrc(attrDataBinder.mVars.getString(attrDataBinder.mData));
            }
        }

        private class SrcIdBinder extends Binder {
            private SrcIdBinder() {
                super();
            }

            @Override // com.miui.maml.elements.AttrDataBinders.AttrDataBinder.Binder
            public void bind(ScreenElement screenElement) {
                AttrDataBinder attrDataBinder = AttrDataBinder.this;
                Double d2 = attrDataBinder.mVars.getDouble(attrDataBinder.mData);
                ((ImageScreenElement) screenElement).setSrcId(d2 == null ? 0.0d : d2.doubleValue());
            }
        }

        private class TextBinder extends Binder {
            private TextBinder() {
                super();
            }

            @Override // com.miui.maml.elements.AttrDataBinders.AttrDataBinder.Binder
            public void bind(ScreenElement screenElement) {
                AttrDataBinder attrDataBinder = AttrDataBinder.this;
                ((TextScreenElement) screenElement).setText(attrDataBinder.mVars.getString(attrDataBinder.mData));
            }
        }

        public AttrDataBinder(Element element, ContextVariables contextVariables) {
            this.mTarget = element.getAttribute(zurt.InterfaceC0290k.f47416lvui);
            this.mAttr = element.getAttribute("attr");
            this.mData = element.getAttribute("data");
            this.mVars = contextVariables;
            this.mBinder = createBinder(this.mAttr);
            if (TextUtils.isEmpty(this.mTarget) || TextUtils.isEmpty(this.mAttr) || TextUtils.isEmpty(this.mData) || this.mBinder == null) {
                throw new IllegalArgumentException("invalid AttrDataBinder");
            }
        }

        private Binder createBinder(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if ("text".equals(str)) {
                return new TextBinder();
            }
            if (AttrDataBinders.ATTR_PARAS.equals(str) || AttrDataBinders.ATTR_PARAMS.equals(str)) {
                return new ParamsBinder();
            }
            if ("name".equals(str)) {
                return new NameBinder();
            }
            if (AttrDataBinders.ATTR_BITMAP.equals(str)) {
                return new BitmapBinder();
            }
            if (AttrDataBinders.ATTR_SRC.equals(str)) {
                return new SrcBinder();
            }
            if (AttrDataBinders.ATTR_SRCID.equals(str)) {
                return new SrcIdBinder();
            }
            return null;
        }

        public boolean bind(ElementGroup elementGroup) {
            try {
                ScreenElement screenElementFindElement = elementGroup.findElement(this.mTarget);
                if (screenElementFindElement == null) {
                    return false;
                }
                this.mBinder.bind(screenElementFindElement);
                return true;
            } catch (Exception e2) {
                e2.printStackTrace();
                return false;
            }
        }
    }

    public AttrDataBinders(Element element, ContextVariables contextVariables) {
        this.mVars = contextVariables;
        Utils.traverseXmlElementChildren(element, "AttrDataBinder", new Utils.XmlTraverseListener() { // from class: com.miui.maml.elements.AttrDataBinders.1
            @Override // com.miui.maml.util.Utils.XmlTraverseListener
            public void onChild(Element element2) {
                try {
                    AttrDataBinders.this.mBinders.add(new AttrDataBinder(element2, AttrDataBinders.this.mVars));
                } catch (IllegalArgumentException e2) {
                    MamlLog.m17851e("AttrDataBinders", e2.toString());
                }
            }
        });
    }

    public void bind(ElementGroup elementGroup) {
        Iterator<AttrDataBinder> it = this.mBinders.iterator();
        while (it.hasNext()) {
            it.next().bind(elementGroup);
        }
    }
}
