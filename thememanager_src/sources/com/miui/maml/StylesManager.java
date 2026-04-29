package com.miui.maml;

import com.google.android.exoplayer2.text.ttml.C3678q;
import com.miui.maml.util.Utils;
import java.util.HashMap;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes3.dex */
public class StylesManager {
    private HashMap<String, Style> mStyles = new HashMap<>();

    public class Style {
        public static final String TAG = "Style";
        private Style base;
        private HashMap<String, String> mAttrs = new HashMap<>();
        public String name;

        public Style(Element element) {
            NamedNodeMap attributes = element.getAttributes();
            for (int i2 = 0; i2 < attributes.getLength(); i2++) {
                Node nodeItem = attributes.item(i2);
                String nodeName = nodeItem.getNodeName();
                String nodeValue = nodeItem.getNodeValue();
                if (nodeName.equals("name")) {
                    this.name = nodeValue;
                } else if (nodeName.equals(C3678q.f65841uv6)) {
                    this.base = (Style) StylesManager.this.mStyles.get(nodeValue);
                } else {
                    this.mAttrs.put(nodeName, nodeValue);
                }
            }
        }

        public String getAttr(String str) {
            String str2 = this.mAttrs.get(str);
            if (str2 != null) {
                return str2;
            }
            Style style = this.base;
            if (style != null) {
                return style.getAttr(str);
            }
            return null;
        }
    }

    public StylesManager(Element element) {
        Utils.traverseXmlElementChildren(element, Style.TAG, new Utils.XmlTraverseListener() { // from class: com.miui.maml.StylesManager.1
            @Override // com.miui.maml.util.Utils.XmlTraverseListener
            public void onChild(Element element2) {
                Style style = StylesManager.this.new Style(element2);
                StylesManager.this.mStyles.put(style.name, style);
            }
        });
    }

    public Style getStyle(String str) {
        return this.mStyles.get(str);
    }
}
