package com.android.thememanager.model;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class Manifest {
    private int allFrameCount;
    private String fontWeight;
    private int frameRate;
    private boolean isBackUpVersion;
    private String miuiAdapterVersion;
    private boolean officialIcons;
    private int platform;
    private String screenRatio;
    private int smallScreenFrameCount;
    private boolean supportHomeSearchBar;
    private int themeType;
    private String version;
    private Map<String, String> authors = new HashMap();
    private Map<String, String> designers = new HashMap();
    private Map<String, String> titles = new HashMap();
    private Map<String, String> descriptions = new HashMap();

    public int getAllFrameCount() {
        return this.allFrameCount;
    }

    public String getAuthor(String key) {
        return this.authors.get(key);
    }

    public Map<String, String> getAuthors() {
        return this.authors;
    }

    public String getDescription(String key) {
        return this.descriptions.get(key);
    }

    public Map<String, String> getDescriptions() {
        return this.descriptions;
    }

    public String getDesigner(String key) {
        return this.designers.get(key);
    }

    public Map<String, String> getDesigners() {
        return this.designers;
    }

    public String getFontWeight() {
        return this.fontWeight;
    }

    public int getFrameRate() {
        return this.frameRate;
    }

    public boolean getIsBackUpVersion() {
        return this.isBackUpVersion;
    }

    public String getMiuiAdapterVersion() {
        return this.miuiAdapterVersion;
    }

    public int getPlatform() {
        return this.platform;
    }

    public String getScreenRatio() {
        return this.screenRatio;
    }

    public int getSmallScreenFrameCount() {
        return this.smallScreenFrameCount;
    }

    public int getThemeType() {
        return this.themeType;
    }

    public String getTitle(String key) {
        return this.titles.get(key);
    }

    public Map<String, String> getTitles() {
        return this.titles;
    }

    public String getVersion() {
        return this.version;
    }

    public boolean isOfficial() {
        return this.officialIcons;
    }

    public boolean isSupportHomeSearchBar() {
        return this.supportHomeSearchBar;
    }

    public void putAuthor(String key, String value) {
        this.authors.put(key, value);
    }

    public void putDescription(String key, String value) {
        this.descriptions.put(key, value);
    }

    public void putDesigner(String key, String value) {
        this.designers.put(key, value);
    }

    public void putTitle(String key, String value) {
        this.titles.put(key, value);
    }

    public void setAllFrameCount(int count) {
        this.allFrameCount = count;
    }

    public void setAuthors(Map<String, String> authors) {
        this.authors = authors;
    }

    public void setDescriptions(Map<String, String> descriptions) {
        this.descriptions = descriptions;
    }

    public void setDesigners(Map<String, String> designers) {
        this.designers = designers;
    }

    public void setFontWeight(String fontWeight) {
        this.fontWeight = fontWeight;
    }

    public void setFrameRate(int count) {
        this.frameRate = count;
    }

    public void setIsBackUpVersion(boolean isBackUpVersion) {
        this.isBackUpVersion = isBackUpVersion;
    }

    public void setIsOfficial(boolean isOfficial) {
        this.officialIcons = isOfficial;
    }

    public void setMiuiAdapterVersion(String miuiAdapterVersion) {
        this.miuiAdapterVersion = miuiAdapterVersion;
    }

    public void setPlatform(int platform) {
        this.platform = platform;
    }

    public void setScreenRatio(String screenRatio) {
        this.screenRatio = screenRatio;
    }

    public void setSmallScreenFrameCount(int count) {
        this.smallScreenFrameCount = count;
    }

    public void setSupportHomeSearchBar(boolean supportHomeSearchBar) {
        this.supportHomeSearchBar = supportHomeSearchBar;
    }

    public void setThemeType(int type) {
        this.themeType = type;
    }

    public void setTitles(Map<String, String> titles) {
        this.titles = titles;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
