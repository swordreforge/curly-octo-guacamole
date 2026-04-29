package com.miui.maml.widget.edit;

import android.util.Log;
import android.util.Xml;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.market.sdk.reflect.C4991s;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.text.fti;
import l05.qrj;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import zy.y9n;

/* JADX INFO: compiled from: ParseEditMamlConfig.kt */
/* JADX INFO: loaded from: classes3.dex */
@d3(bv = {}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b6\u00107J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0003J\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u000bH\u0002J$\u0010\"\u001a\u00020!2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001fH\u0002J\u0010\u0010#\u001a\u00020!2\u0006\u0010\f\u001a\u00020\u000bH\u0002R\u0014\u0010$\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010'\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010(\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010%R\u0014\u0010)\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010%R\u0014\u0010*\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010%R\u0014\u0010+\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010%R\u0014\u0010,\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010%R\u0014\u0010-\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010%R\u0014\u0010.\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010%R\u0014\u0010/\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010%R\u0014\u00100\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010%R\u0014\u00101\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010%R\u0014\u00102\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010%R\u0014\u00103\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010%R\u0014\u00104\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010%R\u0014\u00105\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u0010%¨\u00068"}, d2 = {"Lcom/miui/maml/widget/edit/ParseEditMamlConfig;", "", "", "v", "", "string2int", "Ljava/io/InputStream;", "inputStream", "", "Lcom/miui/maml/widget/edit/BaseConfig;", "parseVarXml", "Lorg/xmlpull/v1/XmlPullParser;", "parser", "Lcom/miui/maml/widget/edit/EditTextConfig;", "readText", "readColor", "readColorGroup", "Lcom/miui/maml/widget/edit/TextSizeConfig;", "readTextSize", "Lcom/miui/maml/widget/edit/AlignStyleConfig;", "readAlignStyle", "Lcom/miui/maml/widget/edit/CustomEditLinkConfig;", "readCustomEditLink", "Lcom/miui/maml/widget/edit/ImageSelectConfig;", "readImageSelect", "Lcom/miui/maml/widget/edit/DateSetConfig;", "readSetDate", "Lcom/miui/maml/widget/edit/OnOffConfig;", "readOnOff", "Lcom/miui/maml/widget/edit/ImagePickConfig;", "readImagePick", "", "titleMap", "Lkotlin/was;", "readLocalMap", "skip", "VAR_CONFIG", "Ljava/lang/String;", "LOG_TAG", "TAG_TEXT", "TAG_COLOR", "TAG_COLOR_GROUP", "TAG_FONT_SIZE", "TAG_ALIGN_STYLE", "TAG_LANGUAGE", "TAG_CUSTOM_EDIT_LINK", "TAG_IMAGE_SELECT", "TAG_SET_DATE", "TAG_ON_OFF", "TAG_IMAGE_PICK", "ATTR_NAME", "ATTR_DISPLAY_TITLE", "ATTR_LOCALE", "ATTR_UI_TYPE", C4991s.f28129n, "()V", "widget-edit_release"}, m22787k = 1, mv = {1, 4, 2})
public final class ParseEditMamlConfig {
    private static final String ATTR_DISPLAY_TITLE = "displayTitle";
    private static final String ATTR_LOCALE = "locale";
    private static final String ATTR_NAME = "name";
    private static final String ATTR_UI_TYPE = "uiType";

    @InterfaceC7396q
    public static final ParseEditMamlConfig INSTANCE = new ParseEditMamlConfig();
    private static final String LOG_TAG = "ParseEditMamlConfig";
    private static final String TAG_ALIGN_STYLE = "Align";
    private static final String TAG_COLOR = "Color";
    private static final String TAG_COLOR_GROUP = "ColorGroup";
    private static final String TAG_CUSTOM_EDIT_LINK = "CustomEditLink";
    private static final String TAG_FONT_SIZE = "FontSize";
    private static final String TAG_IMAGE_PICK = "ImagePick";
    private static final String TAG_IMAGE_SELECT = "ImageSelect";
    private static final String TAG_LANGUAGE = "Language";
    private static final String TAG_ON_OFF = "OnOff";
    private static final String TAG_SET_DATE = "SetDate";
    private static final String TAG_TEXT = "Text";

    @InterfaceC7396q
    public static final String VAR_CONFIG = "var_config.xml";

    private ParseEditMamlConfig() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @InterfaceC7395n
    @qrj
    @y9n
    public static final List<BaseConfig> parseVarXml(@InterfaceC7396q InputStream inputStream) {
        d2ok.m23075h(inputStream, "inputStream");
        try {
            XmlPullParser parser = Xml.newPullParser();
            parser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            parser.setInput(inputStream, null);
            parser.nextTag();
            parser.require(2, null, "WidgetConfig");
            ArrayList arrayList = new ArrayList();
            while (parser.next() != 1) {
                d2ok.kja0(parser, "parser");
                if (parser.getEventType() == 2) {
                    String name = parser.getName();
                    if (name != null) {
                        switch (name.hashCode()) {
                            case -1034036996:
                                if (name.equals(TAG_COLOR_GROUP)) {
                                    arrayList.add(INSTANCE.readColorGroup(parser));
                                }
                                break;
                            case -645810416:
                                if (name.equals(TAG_SET_DATE)) {
                                    arrayList.add(INSTANCE.readSetDate(parser));
                                }
                                break;
                            case -465780201:
                                if (name.equals(TAG_IMAGE_SELECT)) {
                                    arrayList.add(INSTANCE.readImageSelect(parser));
                                }
                                break;
                            case 2603341:
                                if (name.equals("Text")) {
                                    arrayList.add(INSTANCE.readText(parser));
                                }
                                break;
                            case 63350501:
                                if (name.equals(TAG_ALIGN_STYLE)) {
                                    arrayList.add(INSTANCE.readAlignStyle(parser));
                                }
                                break;
                            case 65290051:
                                if (name.equals(TAG_COLOR)) {
                                    arrayList.add(INSTANCE.readColor(parser));
                                }
                                break;
                            case 76314352:
                                if (name.equals(TAG_ON_OFF)) {
                                    arrayList.add(INSTANCE.readOnOff(parser));
                                }
                                break;
                            case 430245136:
                                if (name.equals(TAG_FONT_SIZE)) {
                                    arrayList.add(INSTANCE.readTextSize(parser));
                                }
                                break;
                            case 1125685244:
                                if (name.equals(TAG_IMAGE_PICK)) {
                                    arrayList.add(INSTANCE.readImagePick(parser));
                                }
                                break;
                            case 2074818517:
                                if (name.equals(TAG_CUSTOM_EDIT_LINK)) {
                                    arrayList.add(INSTANCE.readCustomEditLink(parser));
                                }
                                break;
                        }
                    }
                    INSTANCE.skip(parser);
                }
            }
            return arrayList;
        } catch (IOException e2) {
            Log.e(LOG_TAG, "load error.", e2);
            return null;
        } catch (XmlPullParserException e3) {
            Log.e(LOG_TAG, "load error..", e3);
            return null;
        }
    }

    private final AlignStyleConfig readAlignStyle(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getAttributeValue(null, "name");
        String attributeValue = xmlPullParser.getAttributeValue(null, ATTR_DISPLAY_TITLE);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "default");
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "from");
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "to");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType != 2) {
                if (eventType == 3 && d2ok.f7l8(TAG_ALIGN_STYLE, xmlPullParser.getName())) {
                    break;
                }
            } else if (d2ok.f7l8(TAG_LANGUAGE, xmlPullParser.getName())) {
                readLocalMap(xmlPullParser, linkedHashMap);
            }
            eventType = xmlPullParser.next();
        }
        d2ok.kja0(name, "name");
        return new AlignStyleConfig(name, attributeValue, linkedHashMap.isEmpty() ? null : linkedHashMap, string2int(attributeValue2), string2int(attributeValue3), string2int(attributeValue4));
    }

    private final BaseConfig readColor(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        xmlPullParser.require(2, null, TAG_COLOR);
        String name = xmlPullParser.getAttributeValue(null, "name");
        String attributeValue = xmlPullParser.getAttributeValue(null, ATTR_DISPLAY_TITLE);
        xmlPullParser.nextTag();
        int eventType = xmlPullParser.getEventType();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (eventType != 1) {
            if (eventType == 2) {
                if (d2ok.f7l8(TAG_LANGUAGE, xmlPullParser.getName())) {
                    readLocalMap(xmlPullParser, linkedHashMap);
                } else {
                    try {
                        String strNextText = xmlPullParser.nextText();
                        d2ok.kja0(strNextText, "parser.nextText()");
                        arrayList.add(strNextText);
                        if (arrayList.size() >= 30) {
                            break;
                        }
                    } catch (IllegalArgumentException unused) {
                        continue;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                if (eventType == 3 && d2ok.f7l8(TAG_COLOR, xmlPullParser.getName())) {
                    break;
                }
                eventType = xmlPullParser.next();
            }
        }
        xmlPullParser.require(3, null, TAG_COLOR);
        d2ok.kja0(name, "name");
        return new ColorConfig(name, attributeValue, linkedHashMap.isEmpty() ? null : linkedHashMap, arrayList);
    }

    private final BaseConfig readColorGroup(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        int i2 = 2;
        xmlPullParser.require(2, null, TAG_COLOR_GROUP);
        String name = xmlPullParser.getAttributeValue(null, "name");
        String attributeValue = xmlPullParser.getAttributeValue(null, ATTR_DISPLAY_TITLE);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, ATTR_UI_TYPE);
        xmlPullParser.nextTag();
        int eventType = xmlPullParser.getEventType();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (eventType != 1) {
            if (eventType == i2) {
                if (d2ok.f7l8(TAG_LANGUAGE, xmlPullParser.getName())) {
                    readLocalMap(xmlPullParser, linkedHashMap);
                } else {
                    try {
                        String colors = xmlPullParser.getAttributeValue(null, "values");
                        String varName = xmlPullParser.getAttributeValue(null, "name");
                        d2ok.kja0(colors, "colors");
                        List listCb = fti.cb(colors, new String[]{","}, false, 0, 6, null);
                        d2ok.kja0(varName, "varName");
                        arrayList.add(new ColorConfig(varName, null, null, listCb));
                        if (arrayList.size() >= 30) {
                            break;
                        }
                    } catch (IllegalArgumentException unused) {
                        continue;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                if (eventType == 3 && d2ok.f7l8(TAG_COLOR_GROUP, xmlPullParser.getName())) {
                    break;
                }
                eventType = xmlPullParser.next();
            }
            i2 = 2;
        }
        xmlPullParser.require(3, null, TAG_COLOR_GROUP);
        d2ok.kja0(name, "name");
        return new ColorGroupConfig(name, attributeValue, linkedHashMap.isEmpty() ? null : linkedHashMap, string2int(attributeValue2), arrayList);
    }

    private final CustomEditLinkConfig readCustomEditLink(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, InterfaceC1925p.zvd4);
        d2ok.kja0(attributeValue, "parser.getAttributeValue(null, \"deeplink\")");
        return new CustomEditLinkConfig(attributeValue, null, 2, null);
    }

    private final ImagePickConfig readImagePick(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, TAG_IMAGE_PICK);
        String name = xmlPullParser.getAttributeValue(null, "name");
        xmlPullParser.nextTag();
        xmlPullParser.require(3, null, TAG_IMAGE_PICK);
        d2ok.kja0(name, "name");
        return new ImagePickConfig(name);
    }

    private final ImageSelectConfig readImageSelect(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 2;
        String str2 = null;
        xmlPullParser.require(2, null, TAG_IMAGE_SELECT);
        String name = xmlPullParser.getAttributeValue(null, "name");
        String str3 = ATTR_DISPLAY_TITLE;
        String attributeValue = xmlPullParser.getAttributeValue(null, ATTR_DISPLAY_TITLE);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, ATTR_UI_TYPE);
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "width");
        if (attributeValue3 == null) {
            attributeValue3 = "300";
        }
        String attributeValue4 = xmlPullParser.getAttributeValue(null, InterfaceC1925p.byf);
        if (attributeValue4 == null) {
            attributeValue4 = "200";
        }
        xmlPullParser.nextTag();
        int eventType = xmlPullParser.getEventType();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z2 = false;
        while (eventType != 1) {
            if (eventType == i2) {
                if (d2ok.f7l8(TAG_LANGUAGE, xmlPullParser.getName())) {
                    readLocalMap(xmlPullParser, linkedHashMap);
                    str = str3;
                } else {
                    String attributeValue5 = xmlPullParser.getAttributeValue(str2, str3);
                    try {
                        String strNextText = xmlPullParser.nextText();
                        str = str3;
                        try {
                            d2ok.kja0(strNextText, "parser.nextText()");
                            arrayList.add(strNextText);
                            arrayList2.add(attributeValue5);
                            if (!z2) {
                                z2 = attributeValue5 != null;
                            }
                            if (arrayList.size() >= 50) {
                                break;
                            }
                        } catch (IllegalArgumentException unused) {
                            continue;
                        }
                    } catch (IllegalArgumentException unused2) {
                        str = str3;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                str = str3;
                if (eventType == 3 && d2ok.f7l8(TAG_IMAGE_SELECT, xmlPullParser.getName())) {
                    break;
                }
                eventType = xmlPullParser.next();
            }
            str3 = str;
            i2 = 2;
            str2 = null;
        }
        xmlPullParser.require(3, null, TAG_IMAGE_SELECT);
        d2ok.kja0(name, "name");
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        return new ImageSelectConfig(name, attributeValue, linkedHashMap, arrayList, z2 ? arrayList2 : null, string2int(attributeValue3), string2int(attributeValue4), string2int(attributeValue2));
    }

    private final void readLocalMap(XmlPullParser xmlPullParser, Map<String, String> map) {
        String attributeValue = xmlPullParser.getAttributeValue(null, ATTR_LOCALE);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, ATTR_DISPLAY_TITLE);
        if (attributeValue == null || attributeValue2 == null) {
            return;
        }
        map.put(attributeValue, attributeValue2);
    }

    private final OnOffConfig readOnOff(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, TAG_ON_OFF);
        String name = xmlPullParser.getAttributeValue(null, "name");
        String attributeValue = xmlPullParser.getAttributeValue(null, ATTR_DISPLAY_TITLE);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "default");
        if (attributeValue2 == null) {
            attributeValue2 = "1";
        }
        boolean zF7l8 = d2ok.f7l8("1", attributeValue2);
        xmlPullParser.nextTag();
        int eventType = xmlPullParser.getEventType();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (eventType != 1) {
            if (eventType != 2) {
                if (eventType == 3 && d2ok.f7l8(TAG_ON_OFF, xmlPullParser.getName())) {
                    break;
                }
            } else if (d2ok.f7l8(TAG_LANGUAGE, xmlPullParser.getName())) {
                readLocalMap(xmlPullParser, linkedHashMap);
            }
            eventType = xmlPullParser.next();
        }
        xmlPullParser.require(3, null, TAG_ON_OFF);
        d2ok.kja0(name, "name");
        return new OnOffConfig(name, attributeValue, linkedHashMap.isEmpty() ? null : linkedHashMap, zF7l8);
    }

    private final DateSetConfig readSetDate(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, TAG_SET_DATE);
        String name = xmlPullParser.getAttributeValue(null, "name");
        String attributeValue = xmlPullParser.getAttributeValue(null, ATTR_DISPLAY_TITLE);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "default");
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "repeatVar");
        d2ok.kja0(attributeValue3, "parser.getAttributeValue(null, \"repeatVar\")");
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "repeat");
        if (attributeValue4 == null) {
            attributeValue4 = "0";
        }
        xmlPullParser.nextTag();
        int eventType = xmlPullParser.getEventType();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (eventType != 1) {
            if (eventType != 2) {
                if (eventType == 3 && d2ok.f7l8(TAG_SET_DATE, xmlPullParser.getName())) {
                    break;
                }
            } else if (d2ok.f7l8(TAG_LANGUAGE, xmlPullParser.getName())) {
                readLocalMap(xmlPullParser, linkedHashMap);
            }
            eventType = xmlPullParser.next();
        }
        xmlPullParser.require(3, null, TAG_SET_DATE);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (attributeValue2 != null) {
            try {
                jCurrentTimeMillis = LocalDate.parse(attributeValue2).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
            } catch (Exception e2) {
                Log.w(LOG_TAG, "readSetDate fail, default value invalid." + attributeValue2 + ", " + e2);
            }
        }
        d2ok.kja0(name, "name");
        return new DateSetConfig(name, attributeValue, linkedHashMap.isEmpty() ? null : linkedHashMap, jCurrentTimeMillis, attributeValue3, Integer.parseInt(attributeValue4));
    }

    private final EditTextConfig readText(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        xmlPullParser.require(2, null, "Text");
        String attributeValue = xmlPullParser.getAttributeValue(null, "name");
        d2ok.kja0(attributeValue, "parser.getAttributeValue(null, ATTR_NAME)");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, ATTR_DISPLAY_TITLE);
        boolean zF7l8 = d2ok.f7l8("true", xmlPullParser.getAttributeValue(null, "editable"));
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "minLength");
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "maxLength");
        xmlPullParser.nextTag();
        int eventType = xmlPullParser.getEventType();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (eventType != 1) {
            if (eventType != 2) {
                if (eventType == 3 && d2ok.f7l8("Text", xmlPullParser.getName())) {
                    break;
                }
                eventType = xmlPullParser.next();
            } else {
                if (d2ok.f7l8(TAG_LANGUAGE, xmlPullParser.getName())) {
                    readLocalMap(xmlPullParser, linkedHashMap);
                } else {
                    String strNextText = xmlPullParser.nextText();
                    d2ok.kja0(strNextText, "parser.nextText()");
                    arrayList.add(strNextText);
                    if (arrayList.size() >= 100) {
                        break;
                    }
                }
                eventType = xmlPullParser.next();
            }
        }
        xmlPullParser.require(3, null, "Text");
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        return new EditTextConfig(attributeValue, attributeValue2, linkedHashMap, arrayList, zF7l8, string2int(attributeValue3), string2int(attributeValue4));
    }

    private final TextSizeConfig readTextSize(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getAttributeValue(null, "name");
        String attributeValue = xmlPullParser.getAttributeValue(null, ATTR_DISPLAY_TITLE);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "default");
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "from");
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "to");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType != 2) {
                if (eventType == 3 && d2ok.f7l8(TAG_FONT_SIZE, xmlPullParser.getName())) {
                    break;
                }
            } else if (d2ok.f7l8(TAG_LANGUAGE, xmlPullParser.getName())) {
                readLocalMap(xmlPullParser, linkedHashMap);
            }
            eventType = xmlPullParser.next();
        }
        d2ok.kja0(name, "name");
        return new TextSizeConfig(name, attributeValue, linkedHashMap.isEmpty() ? null : linkedHashMap, string2int(attributeValue2), string2int(attributeValue3), string2int(attributeValue4));
    }

    private final void skip(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i2 = 1;
        if (!(xmlPullParser.getEventType() == 2)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        while (i2 != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    @qrj
    private static final int string2int(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }
}
