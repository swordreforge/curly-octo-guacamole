package com.tencent.wxop.stat;

/* JADX INFO: loaded from: classes3.dex */
public class StatGameUser implements Cloneable {

    /* JADX INFO: renamed from: a */
    private String f29962a;

    /* JADX INFO: renamed from: b */
    private String f29963b;

    /* JADX INFO: renamed from: c */
    private String f29964c;

    public StatGameUser() {
        this.f29962a = "";
        this.f29963b = "";
        this.f29964c = "";
    }

    public StatGameUser(String str, String str2, String str3) {
        this.f29963b = str;
        this.f29962a = str2;
        this.f29964c = str3;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public StatGameUser m28271clone() {
        try {
            return (StatGameUser) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public String getAccount() {
        return this.f29963b;
    }

    public String getLevel() {
        return this.f29964c;
    }

    public String getWorldName() {
        return this.f29962a;
    }

    public void setAccount(String str) {
        this.f29963b = str;
    }

    public void setLevel(String str) {
        this.f29964c = str;
    }

    public void setWorldName(String str) {
        this.f29962a = str;
    }

    public String toString() {
        return "StatGameUser [worldName=" + this.f29962a + ", account=" + this.f29963b + ", level=" + this.f29964c + "]";
    }
}
