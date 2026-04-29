package com.xiaomi.accountsdk.account.data;

import android.graphics.Bitmap;
import java.util.ArrayList;

/* JADX INFO: compiled from: XiaomiUserInfo.java */
/* JADX INFO: loaded from: classes3.dex */
public class fu4 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private String f72624f7l8;

    /* JADX INFO: renamed from: g */
    private String f30593g;

    /* JADX INFO: renamed from: k */
    private String f30594k;

    /* JADX INFO: renamed from: n */
    private ArrayList<String> f30595n;

    /* JADX INFO: renamed from: q */
    private String f30596q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private String f72625toq;

    /* JADX INFO: renamed from: y */
    private Bitmap f30597y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private String f72626zy;

    public fu4(String str) {
        this.f30594k = str;
    }

    public String f7l8() {
        return this.f30594k;
    }

    /* JADX INFO: renamed from: g */
    public ArrayList<String> m18665g() {
        return this.f30595n;
    }

    /* JADX INFO: renamed from: k */
    public Bitmap m18666k() {
        return this.f30597y;
    }

    public void kja0(String str) {
        this.f72625toq = str;
    }

    public void ld6(String str) {
        this.f30593g = str;
    }

    /* JADX INFO: renamed from: n */
    public String m18667n() {
        return this.f30596q;
    }

    public void n7h(ArrayList<String> arrayList) {
        this.f30595n = arrayList;
    }

    /* JADX INFO: renamed from: p */
    public void m18668p(String str) {
        this.f72626zy = str;
    }

    /* JADX INFO: renamed from: q */
    public String m18669q() {
        return this.f72624f7l8;
    }

    public void qrj(String str) {
        this.f30596q = str;
    }

    /* JADX INFO: renamed from: s */
    public void m18670s(Bitmap bitmap) {
        this.f30597y = bitmap;
    }

    public String toq() {
        return this.f72626zy;
    }

    public void x2(String str) {
        this.f72624f7l8 = str;
    }

    /* JADX INFO: renamed from: y */
    public String m18671y() {
        return this.f72625toq;
    }

    public String zy() {
        return this.f30593g;
    }

    public fu4(String str, ni7 ni7Var) {
        this.f30594k = str;
        if (ni7Var != null) {
            this.f72625toq = ni7Var.f72672toq;
            this.f72624f7l8 = ni7Var.f72674zy;
            this.f72626zy = ni7Var.f30644q;
            this.f30596q = ni7Var.f30642n;
            this.f30595n = ni7Var.f30639g;
            this.f30593g = ni7Var.f30646y;
        }
    }
}
