package com.miui.maml.widget.edit.local;

import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public class ManifestManager {
    protected static final String ATTR_LOCALE = "locale";
    protected static final String ELEMENT_AUTHOR = "author";
    protected static final String ELEMENT_AUTHORS = "authors";
    protected static final String ELEMENT_DESCRIPTION = "description";
    protected static final String ELEMENT_DESCRIPTIONS = "descriptions";
    protected static final String ELEMENT_DESIGNER = "designer";
    protected static final String ELEMENT_DESIGNERS = "designers";
    protected static final String ELEMENT_MAML_EDITABLE = "editable";
    protected static final String ELEMENT_MAML_EDIT_LINK = "customEditLink";
    protected static final String ELEMENT_MAML_FRAME = "frame";
    protected static final String ELEMENT_MAML_TYPE_TAG = "typeTag";
    protected static final String ELEMENT_PLATFORM = "platform";
    protected static final String ELEMENT_TITLE = "title";
    protected static final String ELEMENT_TITLES = "titles";
    protected static final String ELEMENT_UIVERSION = "uiVersion";
    protected static final String ELEMENT_VERSION = "version";
    public static final String LOCALE_FALLBACK = "fallback";
    private final Manifest manifest;

    public ManifestManager(File file) {
        this.manifest = parseManifestFile(file);
    }

    private static void parseAuthorElement(Element element, Manifest manifest) {
        String textContent = element.getTextContent();
        String attribute = element.getAttribute(ATTR_LOCALE);
        if (TextUtils.isEmpty(attribute)) {
            attribute = "fallback";
        }
        manifest.getAuthors().put(attribute, textContent);
    }

    private static void parseAuthorsElement(Element element, Manifest manifest) {
        NodeList elementsByTagName = element.getElementsByTagName("author");
        if (elementsByTagName == null || elementsByTagName.getLength() <= 0) {
            return;
        }
        for (int i2 = 0; i2 < elementsByTagName.getLength(); i2++) {
            parseAuthorElement((Element) elementsByTagName.item(i2), manifest);
        }
    }

    private static void parseDescriptionElement(Element element, Manifest manifest) {
        String textContent = element.getTextContent();
        String attribute = element.getAttribute(ATTR_LOCALE);
        if (TextUtils.isEmpty(attribute)) {
            attribute = "fallback";
        }
        manifest.getDescriptions().put(attribute, textContent);
    }

    private static void parseDescriptionsElement(Element element, Manifest manifest) {
        NodeList elementsByTagName = element.getElementsByTagName("description");
        if (elementsByTagName == null || elementsByTagName.getLength() <= 0) {
            return;
        }
        for (int i2 = 0; i2 < elementsByTagName.getLength(); i2++) {
            parseDescriptionElement((Element) elementsByTagName.item(i2), manifest);
        }
    }

    private static void parseDesignerElement(Element element, Manifest manifest) {
        String textContent = element.getTextContent();
        String attribute = element.getAttribute(ATTR_LOCALE);
        if (TextUtils.isEmpty(attribute)) {
            attribute = "fallback";
        }
        manifest.getDesigners().put(attribute, textContent);
    }

    private static void parseDesignersElement(Element element, Manifest manifest) {
        NodeList elementsByTagName = element.getElementsByTagName("designer");
        if (elementsByTagName == null || elementsByTagName.getLength() <= 0) {
            return;
        }
        for (int i2 = 0; i2 < elementsByTagName.getLength(); i2++) {
            parseDesignerElement((Element) elementsByTagName.item(i2), manifest);
        }
    }

    public static Manifest parseManifestFile(File file) {
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
                            parsePlatformElement(element, manifest);
                        } else if ("version".equals(tagName)) {
                            parseVersionElement(element, manifest);
                        } else if ("author".equals(tagName)) {
                            parseAuthorElement(element, manifest);
                        } else if ("designer".equals(tagName)) {
                            parseDesignerElement(element, manifest);
                        } else if ("title".equals(tagName)) {
                            parseTitleElement(element, manifest);
                        } else if (ELEMENT_MAML_TYPE_TAG.equals(tagName)) {
                            manifest.setTypeTag(element.getTextContent());
                        } else if (ELEMENT_MAML_EDITABLE.equals(tagName)) {
                            manifest.setEditable("true".equals(element.getTextContent()));
                        } else if (ELEMENT_MAML_EDIT_LINK.equals(tagName)) {
                            manifest.setCustomEdit("true".equals(element.getTextContent()));
                        } else if ("description".equals(tagName)) {
                            parseDescriptionElement(element, manifest);
                        } else if (ELEMENT_AUTHORS.equals(tagName)) {
                            parseAuthorsElement(element, manifest);
                        } else if (ELEMENT_DESIGNERS.equals(tagName)) {
                            parseDesignersElement(element, manifest);
                        } else if (ELEMENT_TITLES.equals(tagName)) {
                            parseTitlesElement(element, manifest);
                        } else if (ELEMENT_DESCRIPTIONS.equals(tagName)) {
                            parseDescriptionsElement(element, manifest);
                        }
                    }
                }
            }
        } catch (IOException | NumberFormatException | ParserConfigurationException | SAXException e2) {
            e2.printStackTrace();
        }
        return manifest;
    }

    private static void parsePlatformElement(Element element, Manifest manifest) {
        manifest.setPlatform(Integer.parseInt(element.getTextContent()));
    }

    private static void parseTitleElement(Element element, Manifest manifest) {
        String textContent = element.getTextContent();
        String attribute = element.getAttribute(ATTR_LOCALE);
        if (TextUtils.isEmpty(attribute)) {
            attribute = "fallback";
        }
        manifest.getTitles().put(attribute, textContent);
    }

    private static void parseTitlesElement(Element element, Manifest manifest) {
        NodeList elementsByTagName = element.getElementsByTagName("title");
        if (elementsByTagName == null || elementsByTagName.getLength() <= 0) {
            return;
        }
        for (int i2 = 0; i2 < elementsByTagName.getLength(); i2++) {
            parseTitleElement((Element) elementsByTagName.item(i2), manifest);
        }
    }

    private static void parseVersionElement(Element element, Manifest manifest) {
        manifest.setVersion(element.getTextContent());
    }

    @lvui
    public Map<String, String> getAuthors() {
        return this.manifest.getAuthors();
    }

    @lvui
    public Map<String, String> getDescriptions() {
        return this.manifest.getDescriptions();
    }

    @lvui
    public Map<String, String> getDesigners() {
        return this.manifest.getDesigners();
    }

    @lvui
    public Map<String, String> getTitles() {
        return this.manifest.getTitles();
    }

    @dd
    public String getTypeTag() {
        return this.manifest.getTypeTag();
    }

    @dd
    public String getVersion() {
        return this.manifest.getVersion();
    }

    public boolean isCustomEdit() {
        return this.manifest.getCustomEdit();
    }

    public boolean isEditable() {
        return this.manifest.getEditable();
    }
}
