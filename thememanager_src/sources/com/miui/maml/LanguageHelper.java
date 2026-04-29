package com.miui.maml;

import com.miui.maml.data.Variables;
import com.miui.maml.util.MamlLog;
import com.miui.maml.util.Utils;
import java.io.InputStream;
import java.util.Locale;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes3.dex */
public class LanguageHelper {
    private static final String COMPATIBLE_STRING_ROOT_TAG = "strings";
    private static final String DEFAULT_STRING_FILE_PATH = "strings/strings.xml";
    private static final String LOG_TAG = "LanguageHelper";
    private static final String STRING_FILE_PATH = "strings/strings.xml";
    private static final String STRING_ROOT_TAG = "resources";
    private static final String STRING_TAG = "string";

    public static boolean load(Locale locale, ResourceManager resourceManager, Variables variables) {
        String strAddFileNameSuffix;
        InputStream inputStream = null;
        String str = "strings/strings.xml";
        if (locale != null) {
            strAddFileNameSuffix = Utils.addFileNameSuffix("strings/strings.xml", locale.toString());
            if (!resourceManager.resourceExists(strAddFileNameSuffix)) {
                strAddFileNameSuffix = Utils.addFileNameSuffix("strings/strings.xml", locale.getLanguage());
            }
        } else {
            strAddFileNameSuffix = null;
        }
        if (resourceManager.resourceExists(strAddFileNameSuffix)) {
            str = strAddFileNameSuffix;
        } else if (!resourceManager.resourceExists("strings/strings.xml")) {
            MamlLog.m17853i(LOG_TAG, "no available string resources to load.");
            return false;
        }
        try {
            try {
                DocumentBuilder documentBuilderNewDocumentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
                inputStream = resourceManager.getInputStream(str);
                Document document = documentBuilderNewDocumentBuilder.parse(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                return setVariables(document, variables);
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e4) {
            MamlLog.m17851e(LOG_TAG, e4.getMessage());
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            }
            return false;
        }
    }

    private static boolean setVariables(Document document, Variables variables) {
        boolean z2;
        NodeList elementsByTagName = document.getElementsByTagName(STRING_ROOT_TAG);
        if (elementsByTagName.getLength() <= 0) {
            elementsByTagName = document.getElementsByTagName(COMPATIBLE_STRING_ROOT_TAG);
            if (elementsByTagName.getLength() <= 0) {
                return false;
            }
            z2 = false;
        } else {
            z2 = true;
        }
        NodeList elementsByTagName2 = ((Element) elementsByTagName.item(0)).getElementsByTagName("string");
        for (int i2 = 0; i2 < elementsByTagName2.getLength(); i2++) {
            Element element = (Element) elementsByTagName2.item(i2);
            variables.put(element.getAttribute("name"), (z2 ? element.getTextContent() : element.getAttribute("value")).replaceAll("\\\\", ""));
        }
        return true;
    }
}
