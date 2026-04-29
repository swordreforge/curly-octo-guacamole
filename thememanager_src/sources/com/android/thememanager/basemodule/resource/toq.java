package com.android.thememanager.basemodule.resource;

import com.android.thememanager.basemodule.resource.model.Package;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* JADX INFO: compiled from: PackageManager.java */
/* JADX INFO: loaded from: classes.dex */
public class toq {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected static final String f57699toq = "version";

    /* JADX INFO: renamed from: k */
    private Package f10240k;

    public toq(File packageFile) {
        this.f10240k = toq(packageFile);
    }

    private static Package toq(File file) {
        Package r0 = new Package();
        try {
            NodeList childNodes = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file).getDocumentElement().getChildNodes();
            if (childNodes != null && childNodes.getLength() > 0) {
                for (int i2 = 0; i2 < childNodes.getLength(); i2++) {
                    Node nodeItem = childNodes.item(i2);
                    if (nodeItem.getNodeType() == 1) {
                        Element element = (Element) nodeItem;
                        if ("version".equals(element.getTagName())) {
                            zy(element, r0);
                        }
                    }
                }
            }
        } catch (IOException | NumberFormatException | ParserConfigurationException | SAXException e2) {
            e2.printStackTrace();
        }
        return r0;
    }

    private static void zy(Element element, Package aPackage) {
        aPackage.setVersion(element.getTextContent());
    }

    /* JADX INFO: renamed from: k */
    public String m6972k() {
        return this.f10240k.getVersion();
    }
}
