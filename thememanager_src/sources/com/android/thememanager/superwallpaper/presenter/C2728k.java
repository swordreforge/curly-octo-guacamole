package com.android.thememanager.superwallpaper.presenter;

import android.content.DialogInterface;
import android.os.AsyncTask;
import android.util.Log;
import androidx.core.util.C0639p;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.fti;
import androidx.lifecycle.jp0y;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.basemodule.utils.vyq;
import com.android.thememanager.router.app.entity.ThemeStatus;
import com.android.thememanager.superwallpaper.base.AbstractC2723p;
import com.android.thememanager.superwallpaper.base.ld6;
import ek5k.C6002g;
import h7am.C6071k;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import miuix.appcompat.app.ki;
import miuix.core.util.f7l8;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import p029m.zy;

/* JADX INFO: renamed from: com.android.thememanager.superwallpaper.presenter.k */
/* JADX INFO: compiled from: MamlSuperWallpaperPresenter.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2728k extends AbstractC2723p {

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f61152n7h = -1;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private boolean f61153ld6;

    /* JADX INFO: renamed from: p */
    private Resource f16139p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private String f61154qrj;

    /* JADX INFO: renamed from: s */
    protected fti<ThemeStatus> f16140s;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private ki f61155x2;

    /* JADX INFO: renamed from: com.android.thememanager.superwallpaper.presenter.k$k */
    /* JADX INFO: compiled from: MamlSuperWallpaperPresenter.java */
    class k implements DialogInterface.OnClickListener {
        k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            C2728k.this.ni7();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.superwallpaper.presenter.k$toq */
    /* JADX INFO: compiled from: MamlSuperWallpaperPresenter.java */
    private static class toq extends AsyncTask<Void, Void, C0639p<String, ArrayList<vep5.toq>>> {

        /* JADX INFO: renamed from: k */
        private WeakReference<C2728k> f16142k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f61156toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private String f61157zy;

        /* JADX INFO: renamed from: com.android.thememanager.superwallpaper.presenter.k$toq$k */
        /* JADX INFO: compiled from: MamlSuperWallpaperPresenter.java */
        class k implements Comparator<vep5.toq> {
            k() {
            }

            @Override // java.util.Comparator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public int compare(vep5.toq lhs, vep5.toq rhs) {
                return lhs.m28105g() - rhs.m28105g();
            }
        }

        public toq(C2728k presenter, String zipPath) {
            this.f16142k = new WeakReference<>(presenter);
            this.f61156toq = zipPath;
            this.f61157zy = C6071k.f35082y + presenter.fu4().getLanguage() + C6071k.f35081s;
        }

        /* JADX INFO: renamed from: q */
        public static C0639p<String, ArrayList<vep5.toq>> m9500q(InputStream inputStream) throws ParserConfigurationException, SAXException, IOException {
            ArrayList arrayList = new ArrayList();
            Element documentElement = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStream).getDocumentElement();
            String attribute = documentElement.getAttribute(C6071k.f35079p);
            NodeList elementsByTagName = documentElement.getElementsByTagName(C6071k.f77057ld6);
            for (int i2 = 0; i2 < elementsByTagName.getLength(); i2++) {
                vep5.toq toqVar = new vep5.toq(0);
                if (elementsByTagName.item(i2).getNodeType() == 1) {
                    NodeList childNodes = ((Element) elementsByTagName.item(i2)).getChildNodes();
                    for (int i3 = 0; i3 < childNodes.getLength(); i3++) {
                        if (childNodes.item(i3).getNodeType() == 1 && childNodes.item(i3).getFirstChild() != null) {
                            if (C6071k.f77062x2.equals(childNodes.item(i3).getNodeName())) {
                                toqVar.fn3e(childNodes.item(i3).getFirstChild().getNodeValue());
                            } else if (C6071k.f77059qrj.equals(childNodes.item(i3).getNodeName())) {
                                toqVar.cdj(childNodes.item(i3).getFirstChild().getNodeValue());
                            } else if (C6071k.f77058n7h.equals(childNodes.item(i3).getNodeName())) {
                                toqVar.zurt(childNodes.item(i3).getFirstChild().getNodeValue());
                            } else if (C6071k.f77056kja0.equals(childNodes.item(i3).getNodeName())) {
                                toqVar.n7h(childNodes.item(i3).getFirstChild().getNodeValue());
                            } else if ("Land".equals(childNodes.item(i3).getNodeName())) {
                                try {
                                    toqVar.ki(Integer.parseInt(childNodes.item(i3).getFirstChild().getNodeValue()));
                                } catch (NumberFormatException e2) {
                                    Log.e(C6071k.f35077k, "setLand:" + e2.getLocalizedMessage());
                                    return null;
                                }
                            } else if (C6071k.f77053cdj.equals(childNodes.item(i3).getNodeName())) {
                                try {
                                    toqVar.qrj(Integer.parseInt(childNodes.item(i3).getFirstChild().getNodeValue()));
                                } catch (NumberFormatException e3) {
                                    Log.e(C6071k.f35077k, "setColorMode:" + e3.getLocalizedMessage());
                                    return null;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    arrayList.add(toqVar);
                }
            }
            Collections.sort(arrayList, new k());
            return new C0639p<>(attribute, arrayList);
        }

        private C0639p<String, ArrayList<vep5.toq>> zy(ZipFile zipFile, String config_path) throws ParserConfigurationException, SAXException, IOException {
            ZipEntry entry = zipFile.getEntry(config_path);
            if (entry != null) {
                return m9500q(zipFile.getInputStream(entry));
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public C0639p<String, ArrayList<vep5.toq>> doInBackground(Void... voids) {
            try {
                String str = C6071k.f35074g;
                if (new File(str).exists()) {
                    C1821p.ki(str);
                }
                ZipFile zipFile = new ZipFile(this.f61156toq);
                C0639p<String, ArrayList<vep5.toq>> c0639pZy = zy(zipFile, this.f61157zy);
                if (c0639pZy == null) {
                    c0639pZy = zy(zipFile, C6071k.f77054f7l8);
                }
                if (c0639pZy != null) {
                    ArrayList<vep5.toq> arrayList = c0639pZy.f50633toq;
                    if (arrayList.size() > 1) {
                        HashSet hashSet = new HashSet();
                        for (vep5.toq toqVar : arrayList) {
                            if (!zy.toq(toqVar.m28112s())) {
                                hashSet.add(toqVar.m28112s());
                            }
                            if (!zy.toq(toqVar.m28109n())) {
                                hashSet.add(toqVar.m28109n());
                            }
                        }
                        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                        while (enumerationEntries.hasMoreElements()) {
                            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                            String name = zipEntryNextElement.getName();
                            if (!name.contains("../") && hashSet.contains(name)) {
                                InputStream inputStream = zipFile.getInputStream(zipEntryNextElement);
                                File file = new File(C6071k.f35074g + name);
                                if (C1821p.qrj(file.getParentFile(), 493, -1, -1)) {
                                    C1821p.f7l8(inputStream, file);
                                    C1821p.zy(file.getAbsolutePath(), 493);
                                }
                                Iterator<vep5.toq> it = arrayList.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    vep5.toq next = it.next();
                                    if (name.equals(next.m28112s())) {
                                        next.fn3e(file.getAbsolutePath());
                                        break;
                                    }
                                    if (name.equals(next.m28109n())) {
                                        next.cdj(file.getAbsolutePath());
                                        break;
                                    }
                                }
                                f7l8.toq(inputStream);
                            }
                        }
                    }
                }
                return c0639pZy;
            } catch (IOException e2) {
                Log.e(C6071k.f35077k, e2.getLocalizedMessage());
                return null;
            } catch (ParserConfigurationException e3) {
                Log.e(C6071k.f35077k, e3.getLocalizedMessage());
                return null;
            } catch (SAXException e4) {
                Log.e(C6071k.f35077k, e4.getLocalizedMessage());
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(C0639p<String, ArrayList<vep5.toq>> pair) {
            super.onPostExecute(pair);
            C2728k c2728k = this.f16142k.get();
            if (c2728k != null) {
                ((AbstractC2723p) c2728k).f61148toq = pair.f3889k;
                ((AbstractC2723p) c2728k).f61149zy = pair.f50633toq;
                ((AbstractC2723p) c2728k).f16111k.wvg();
                String strZurt = vyq.zurt("spwallpaper");
                int iM9517n = (zy.toq(strZurt) || !strZurt.equals(c2728k.f61154qrj)) ? -1 : com.android.thememanager.superwallpaper.util.zy.m9517n(((AbstractC2723p) c2728k).f16111k.getActivity());
                Log.d(C6071k.f35077k, "Maml Data load finished, presenter.mLocalId" + c2728k.f61154qrj + ", position:" + iM9517n);
                if (iM9517n == -1) {
                    if (((AbstractC2723p) c2728k).f61149zy == null || ((AbstractC2723p) c2728k).f61149zy.size() <= 0) {
                        Log.d(C6071k.f35077k, "Maml Data load finished, get first data, default not land data position 0");
                        iM9517n = 0;
                    } else {
                        iM9517n = ((vep5.toq) ((AbstractC2723p) c2728k).f61149zy.get(0)).m28105g();
                        Log.d(C6071k.f35077k, "Maml Data load finished, get first data, position:" + iM9517n);
                    }
                }
                c2728k.zy(iM9517n);
            }
        }
    }

    public C2728k(ld6 view, Resource resource, boolean showTipDialog) {
        super(view, resource.getLocalId());
        this.f16140s = new fti<>();
        this.f16139p = resource;
        this.f61154qrj = resource.getLocalId();
        this.f61153ld6 = showTipDialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Locale fu4() {
        return this.f16111k.getActivity().getResources().getConfiguration().locale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ni7() {
        ThemeStatus themeStatus = this.f16140s.m4388g() == null ? new ThemeStatus("maml_super_wallpaper") : this.f16140s.m4388g();
        themeStatus.status = 96;
        this.f16140s.cdj(themeStatus);
        if (this.f61149zy != null) {
            com.android.thememanager.superwallpaper.util.zy.m9519y(this.f16111k.getActivity(), this.f16112n);
            Log.d(C6071k.f35077k, "maml Data apply, save, position:" + this.f16112n);
            Iterator<vep5.toq> it = this.f61149zy.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                vep5.toq next = it.next();
                if (next.m28105g() == this.f16112n) {
                    this.f16110g.edit().putInt(C6071k.f77055ki, next.m28108k()).apply();
                    break;
                }
            }
        }
        com.android.thememanager.module.detail.util.zy.toq(this.f16111k.getActivity(), "spwallpaper", this.f16139p, 1, 0, false, this.f16140s, false, true, false, true);
    }

    @Override // com.android.thememanager.superwallpaper.base.AbstractC2723p
    /* JADX INFO: renamed from: p */
    public void mo9493p(String path) {
        Log.d(C6071k.f35077k, "loadLandPositionData:" + path);
        new toq(this, path).executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    @Override // com.android.thememanager.superwallpaper.base.AbstractC2723p
    /* JADX INFO: renamed from: s */
    public int mo9495s() {
        return 0;
    }

    @Override // com.android.thememanager.superwallpaper.base.AbstractC2723p
    public void toq() {
        if (!this.f61153ld6) {
            ni7();
            return;
        }
        if (this.f61155x2 == null) {
            this.f61155x2 = com.android.thememanager.superwallpaper.util.zy.m9516k(this.f16111k.getActivity(), new k());
        }
        if (this.f61155x2.isShowing()) {
            return;
        }
        this.f61155x2.show();
    }

    /* JADX INFO: renamed from: z */
    public Resource m9499z() {
        return this.f16139p;
    }

    public void zurt(InterfaceC0954z lifecycleOwner, jp0y<ThemeStatus> observer) {
        this.f16140s.m4391p(lifecycleOwner, observer);
    }
}
