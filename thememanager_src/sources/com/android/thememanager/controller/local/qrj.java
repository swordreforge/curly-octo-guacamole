package com.android.thememanager.controller.local;

import android.text.TextUtils;
import com.android.thememanager.basemodule.utils.hyr;
import com.android.thememanager.model.Manifest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* JADX INFO: compiled from: ManifestManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class qrj {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    protected static final String f57922cdj = "miuiAdapterVersion";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    protected static final String f57923f7l8 = "author";

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final String f57924fn3e = "frameRate";

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    protected static final String f57925fu4 = "locale";

    /* JADX INFO: renamed from: g */
    protected static final String f10907g = "screenRatio";

    /* JADX INFO: renamed from: h */
    protected static final String f10908h = "fontWeight";

    /* JADX INFO: renamed from: i */
    public static final String f10909i = "videoFrameCount";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    protected static final String f57926ki = "isBackUpVersion";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    protected static final String f57927kja0 = "descriptions";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    protected static final String f57928ld6 = "supportHomeSearchBar";

    /* JADX INFO: renamed from: n */
    protected static final String f10910n = "version";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    protected static final String f57929n7h = "titles";

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final String f57930ni7 = "themeType";

    /* JADX INFO: renamed from: p */
    protected static final String f10911p = "description";

    /* JADX INFO: renamed from: q */
    @Deprecated
    protected static final String f10912q = "uiVersion";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    protected static final String f57931qrj = "designers";

    /* JADX INFO: renamed from: s */
    protected static final String f10913s = "title";

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final String f57932t8r = "smallScreenFrameCount";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected static final String f57933toq = "theme";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    protected static final String f57934x2 = "authors";

    /* JADX INFO: renamed from: y */
    protected static final String f10914y = "designer";

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final String f57935zurt = "officialIcons";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    protected static final String f57936zy = "platform";

    /* JADX INFO: renamed from: k */
    private Manifest f10915k;

    public qrj(File manifestFile) {
        this.f10915k = m7521t(manifestFile);
    }

    private static void a9(Element element, Manifest manifest) {
        manifest.setPlatform(Integer.parseInt(element.getTextContent()));
    }

    private static void cdj(Element element, Manifest manifest) {
        manifest.setAllFrameCount(Integer.parseInt(element.getTextContent()));
    }

    private static void d3(Element element, Manifest manifest) {
        String textContent = element.getTextContent();
        String attribute = element.getAttribute(f57925fu4);
        if (TextUtils.isEmpty(attribute)) {
            attribute = "fallback";
        }
        manifest.putTitle(attribute, textContent);
    }

    private static void eqxt(Element element, Manifest manifest) {
        manifest.setVersion(element.getTextContent());
    }

    private static void fn3e(Element element, Manifest manifest) {
        NodeList elementsByTagName = element.getElementsByTagName("description");
        if (elementsByTagName == null || elementsByTagName.getLength() <= 0) {
            return;
        }
        for (int i2 = 0; i2 < elementsByTagName.getLength(); i2++) {
            m7520i((Element) elementsByTagName.item(i2), manifest);
        }
    }

    private static void fti(Element element, Manifest manifest) {
        manifest.setScreenRatio(element.getTextContent());
    }

    private static void fu4(Element element, Manifest manifest) {
        manifest.setSmallScreenFrameCount(Integer.parseInt(element.getTextContent()));
    }

    private static void gvn7(Element element, Manifest manifest) {
        manifest.setThemeType(Integer.parseInt(element.getTextContent()));
    }

    /* JADX INFO: renamed from: i */
    private static void m7520i(Element element, Manifest manifest) {
        String textContent = element.getTextContent();
        String attribute = element.getAttribute(f57925fu4);
        if (TextUtils.isEmpty(attribute)) {
            attribute = "fallback";
        }
        manifest.putDescription(attribute, textContent);
    }

    private static void jk(Element element, Manifest manifest) {
        manifest.setIsOfficial(Boolean.parseBoolean(element.getTextContent()));
    }

    private static void jp0y(Element element, Manifest manifest) {
        manifest.setSupportHomeSearchBar(Boolean.valueOf(element.getTextContent()).booleanValue());
    }

    private static void ki(Element element, Manifest manifest) {
        String textContent = element.getTextContent();
        String attribute = element.getAttribute(f57925fu4);
        if (TextUtils.isEmpty(attribute)) {
            attribute = "fallback";
        }
        manifest.putAuthor(attribute, textContent);
    }

    private static void mcp(Element element, Manifest manifest) {
        manifest.setMiuiAdapterVersion(element.getTextContent());
    }

    private static void ni7(Element element, Manifest manifest) {
        NodeList elementsByTagName = element.getElementsByTagName("designer");
        if (elementsByTagName == null || elementsByTagName.getLength() <= 0) {
            return;
        }
        for (int i2 = 0; i2 < elementsByTagName.getLength(); i2++) {
            zurt((Element) elementsByTagName.item(i2), manifest);
        }
    }

    private static void o1t(Element element, Manifest manifest) {
        manifest.setFrameRate(Integer.parseInt(element.getTextContent()));
    }

    private static void oc(Element element, Manifest manifest) {
        NodeList elementsByTagName = element.getElementsByTagName("title");
        if (elementsByTagName == null || elementsByTagName.getLength() <= 0) {
            return;
        }
        for (int i2 = 0; i2 < elementsByTagName.getLength(); i2++) {
            d3((Element) elementsByTagName.item(i2), manifest);
        }
    }

    /* JADX INFO: renamed from: t */
    public static Manifest m7521t(File file) {
        Manifest manifest = new Manifest();
        try {
            NodeList childNodes = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file).getDocumentElement().getChildNodes();
            if (childNodes != null && childNodes.getLength() > 0) {
                for (int i2 = 0; i2 < childNodes.getLength(); i2++) {
                    Node nodeItem = childNodes.item(i2);
                    if (nodeItem.getNodeType() == 1) {
                        Element element = (Element) nodeItem;
                        String tagName = element.getTagName();
                        if ("platform".equals(tagName) || "uiVersion".equals(tagName)) {
                            a9(element, manifest);
                        } else if ("version".equals(tagName)) {
                            eqxt(element, manifest);
                        } else if ("author".equals(tagName)) {
                            ki(element, manifest);
                        } else if ("designer".equals(tagName)) {
                            zurt(element, manifest);
                        } else if ("title".equals(tagName)) {
                            d3(element, manifest);
                        } else if ("description".equals(tagName)) {
                            m7520i(element, manifest);
                        } else if (f57934x2.equals(tagName)) {
                            t8r(element, manifest);
                        } else if (f57931qrj.equals(tagName)) {
                            ni7(element, manifest);
                        } else if (f57929n7h.equals(tagName)) {
                            oc(element, manifest);
                        } else if (f57927kja0.equals(tagName)) {
                            fn3e(element, manifest);
                        } else if (f10907g.equals(tagName)) {
                            fti(element, manifest);
                        } else if (f57928ld6.equals(tagName)) {
                            jp0y(element, manifest);
                        } else if ("fontWeight".equals(tagName)) {
                            m7522z(element, manifest);
                        } else if (f57922cdj.equals(tagName)) {
                            mcp(element, manifest);
                        } else if (f57926ki.equals(tagName)) {
                            wvg(element, manifest);
                        } else if (f57932t8r.equals(tagName)) {
                            fu4(element, manifest);
                        } else if (f10909i.equals(tagName)) {
                            cdj(element, manifest);
                        } else if (f57924fn3e.equals(tagName)) {
                            o1t(element, manifest);
                        } else if (f57930ni7.equals(tagName)) {
                            gvn7(element, manifest);
                        } else if (f57935zurt.equals(tagName)) {
                            jk(element, manifest);
                        }
                    }
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (NumberFormatException e3) {
            e3.printStackTrace();
        } catch (ParserConfigurationException e4) {
            e4.printStackTrace();
        } catch (SAXException e6) {
            e6.printStackTrace();
        }
        return manifest;
    }

    private static void t8r(Element element, Manifest manifest) {
        NodeList elementsByTagName = element.getElementsByTagName("author");
        if (elementsByTagName == null || elementsByTagName.getLength() <= 0) {
            return;
        }
        for (int i2 = 0; i2 < elementsByTagName.getLength(); i2++) {
            ki((Element) elementsByTagName.item(i2), manifest);
        }
    }

    private static void wvg(Element element, Manifest manifest) {
        manifest.setIsBackUpVersion(Boolean.valueOf(element.getTextContent()).booleanValue());
    }

    /* JADX INFO: renamed from: z */
    private static void m7522z(Element element, Manifest manifest) {
        manifest.setFontWeight(element.getTextContent());
    }

    private static void zurt(Element element, Manifest manifest) {
        String textContent = element.getTextContent();
        String attribute = element.getAttribute(f57925fu4);
        if (TextUtils.isEmpty(attribute)) {
            attribute = "fallback";
        }
        manifest.putDesigner(attribute, textContent);
    }

    public String f7l8() {
        return this.f10915k.getMiuiAdapterVersion();
    }

    /* JADX INFO: renamed from: g */
    public int m7523g() {
        return this.f10915k.getFrameRate();
    }

    /* JADX INFO: renamed from: h */
    public boolean m7524h() {
        return this.f10915k.isSupportHomeSearchBar();
    }

    /* JADX INFO: renamed from: k */
    public int m7525k() {
        return this.f10915k.getAllFrameCount();
    }

    public boolean kja0() {
        return this.f10915k.isOfficial();
    }

    public int ld6() {
        return this.f10915k.getThemeType();
    }

    /* JADX INFO: renamed from: n */
    public ArrayList<Integer> m7526n() {
        return hyr.f7l8(this.f10915k.getFontWeight(), ",");
    }

    public boolean n7h() {
        return this.f10915k.getIsBackUpVersion();
    }

    /* JADX INFO: renamed from: p */
    public int m7527p() {
        return this.f10915k.getSmallScreenFrameCount();
    }

    /* JADX INFO: renamed from: q */
    public Map<String, String> m7528q() {
        return this.f10915k.getDesigners();
    }

    public String qrj() {
        return this.f10915k.getVersion();
    }

    /* JADX INFO: renamed from: s */
    public String m7529s() {
        return this.f10915k.getScreenRatio();
    }

    public Map<String, String> toq() {
        return this.f10915k.getAuthors();
    }

    public Map<String, String> x2() {
        return this.f10915k.getTitles();
    }

    /* JADX INFO: renamed from: y */
    public int m7530y() {
        return this.f10915k.getPlatform();
    }

    public Map<String, String> zy() {
        return this.f10915k.getDescriptions();
    }
}
