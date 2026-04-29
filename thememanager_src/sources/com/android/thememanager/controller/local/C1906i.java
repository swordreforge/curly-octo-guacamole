package com.android.thememanager.controller.local;

import androidx.constraintlayout.core.motion.utils.zurt;
import com.android.thememanager.model.Update;
import com.android.thememanager.model.UpdateBundle;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import miui.util.HashUtils;
import miui.util.Patcher;
import miuix.core.util.C7083n;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* JADX INFO: renamed from: com.android.thememanager.controller.local.i */
/* JADX INFO: compiled from: UpdateManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1906i {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    protected static final String f57908cdj = "digest";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    protected static final String f57909f7l8 = "updates";

    /* JADX INFO: renamed from: g */
    public static final String f10883g = "updates.xml";

    /* JADX INFO: renamed from: h */
    protected static final String f10884h = "action";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    protected static final String f57910kja0 = "target_size";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    protected static final String f57911ld6 = "target";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    protected static final String f57912n7h = "source_size";

    /* JADX INFO: renamed from: p */
    protected static final String f10885p = "patch";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    protected static final String f57913qrj = "target";

    /* JADX INFO: renamed from: s */
    protected static final String f10886s = "source";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    protected static final String f57914x2 = "source";

    /* JADX INFO: renamed from: y */
    protected static final String f10887y = "update";

    /* JADX INFO: renamed from: k */
    private File f10888k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private UpdateBundle f57915toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Patcher f57916zy = new Patcher();

    /* JADX INFO: renamed from: q */
    private toq f10890q = toq.TRANSITIONAL;

    /* JADX INFO: renamed from: n */
    private Set<String> f10889n = new HashSet();

    /* JADX INFO: renamed from: com.android.thememanager.controller.local.i$k */
    /* JADX INFO: compiled from: UpdateManager.java */
    static /* synthetic */ class k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f10891k;

        static {
            int[] iArr = new int[Update.Action.values().length];
            f10891k = iArr;
            try {
                iArr[Update.Action.UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10891k[Update.Action.CREATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10891k[Update.Action.DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10891k[Update.Action.REPLACE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10891k[Update.Action.KEEP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.controller.local.i$toq */
    /* JADX INFO: compiled from: UpdateManager.java */
    public enum toq {
        LOOSE,
        TRANSITIONAL,
        STRICT
    }

    public C1906i(File patchFolder) {
        this.f10888k = patchFolder;
        if (new File(patchFolder, f10883g).exists()) {
            this.f57915toq = qrj(new File(patchFolder, f10883g));
        }
    }

    private void cdj(Update update, File sourceFolder, File patchFolder, File targetFolder) throws t8r {
        ki(update.getSource());
        ki(update.getPatch());
        ki(update.getTarget());
        File file = new File(sourceFolder, update.getSource().getName());
        File file2 = new File(patchFolder, update.getPatch().getName());
        File file3 = new File(targetFolder, update.getTarget().getName());
        String strM7498g = m7498g(file, update.getSource(), true);
        String strM7498g2 = m7498g(file2, update.getPatch(), false);
        if (strM7498g == null && strM7498g2 == null) {
            toq(file, file2, file3);
            String strM7498g3 = m7498g(file3, update.getTarget(), false);
            if (strM7498g3 != null) {
                throw new t8r(strM7498g3);
            }
            return;
        }
        if (this.f10890q == toq.LOOSE) {
            zy(file, file3);
        } else {
            if (strM7498g == null) {
                strM7498g = strM7498g2;
            }
            throw new t8r(strM7498g);
        }
    }

    /* JADX INFO: renamed from: g */
    private String m7498g(File file, Update.File uf2, boolean enableIgnore) {
        if (!file.exists()) {
            return file.getAbsolutePath() + " not exists";
        }
        if (file.isDirectory()) {
            return file.getAbsolutePath() + " is a folder";
        }
        if (enableIgnore && this.f10889n.contains(uf2.getName())) {
            return null;
        }
        String digest = uf2.getDigest();
        String sha1 = HashUtils.getSHA1(file);
        if (digest.equals(sha1)) {
            return null;
        }
        return file.getAbsolutePath() + " has digest " + digest + " but expected digest is " + sha1;
    }

    private void ki(Update.File file) throws t8r {
        if (file == null || file.getName() == null || file.getDigest() == null) {
            throw new t8r("missing required file declaration");
        }
    }

    private void kja0(Update update, File sourceFolder, File patchFolder, File targetFolder) throws t8r {
        toq toqVar;
        ki(update.getSource());
        ki(update.getPatch());
        ki(update.getTarget());
        File file = new File(sourceFolder, update.getSource().getName());
        File file2 = new File(patchFolder, update.getPatch().getName());
        File file3 = new File(targetFolder, update.getTarget().getName());
        String strM7498g = m7498g(file, update.getSource(), true);
        String strM7498g2 = m7498g(file2, update.getPatch(), false);
        if (strM7498g != null && (toqVar = this.f10890q) != toq.LOOSE && toqVar != toq.TRANSITIONAL) {
            throw new t8r(strM7498g);
        }
        if (strM7498g2 != null) {
            if (this.f10890q != toq.LOOSE) {
                throw new t8r(strM7498g2);
            }
            zy(file, file3);
        }
        zy(file2, file3);
    }

    /* JADX INFO: renamed from: n */
    private void m7499n(Update update, File sourceFolder, File patchFolder, File targetFolder) throws t8r {
        toq toqVar;
        ki(update.getSource());
        String strM7498g = m7498g(new File(sourceFolder, update.getSource().getName()), update.getSource(), true);
        if (strM7498g != null && (toqVar = this.f10890q) != toq.LOOSE && toqVar != toq.TRANSITIONAL) {
            throw new t8r(strM7498g);
        }
    }

    /* JADX INFO: renamed from: q */
    private void m7500q(Update update, File sourceFolder, File patchFolder, File targetFolder) throws t8r {
        ki(update.getPatch());
        ki(update.getTarget());
        File file = new File(patchFolder, update.getPatch().getName());
        File file2 = new File(targetFolder, update.getTarget().getName());
        String strM7498g = m7498g(file, update.getPatch(), false);
        if (strM7498g == null) {
            zy(file, file2);
        } else if (this.f10890q != toq.LOOSE) {
            throw new t8r(strM7498g);
        }
    }

    public static UpdateBundle qrj(File file) {
        UpdateBundle updateBundle = new UpdateBundle();
        try {
            Element documentElement = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(file).getDocumentElement();
            updateBundle.setSourceDigest(documentElement.getAttribute("source"));
            updateBundle.setTargetDigest(documentElement.getAttribute(zurt.InterfaceC0290k.f47416lvui));
            updateBundle.setSourceSize(Long.parseLong(documentElement.getAttribute(f57912n7h)));
            updateBundle.setTargetSize(Long.parseLong(documentElement.getAttribute(f57910kja0)));
            NodeList elementsByTagName = documentElement.getElementsByTagName("update");
            if (elementsByTagName != null && elementsByTagName.getLength() > 0) {
                for (int i2 = 0; i2 < elementsByTagName.getLength(); i2++) {
                    Element element = (Element) elementsByTagName.item(i2);
                    Update update = new Update();
                    update.setAction(Update.Action.valueOf(element.getAttribute("action").toUpperCase(Locale.ENGLISH)));
                    NodeList childNodes = element.getChildNodes();
                    boolean z2 = true;
                    if (childNodes != null && childNodes.getLength() > 0) {
                        for (int i3 = 0; i3 < childNodes.getLength(); i3++) {
                            Node nodeItem = childNodes.item(i3);
                            if (nodeItem.getNodeType() == 1) {
                                Element element2 = (Element) nodeItem;
                                String textContent = element2.getTextContent();
                                if (!com.android.thememanager.basemodule.resource.constants.toq.kx.equals(textContent) && !com.android.thememanager.basemodule.resource.constants.toq.xdbo.equals(textContent)) {
                                    Update.File file2 = new Update.File();
                                    file2.setName(element2.getTextContent());
                                    file2.setDigest(element2.getAttribute(f57908cdj));
                                    String tagName = element2.getTagName();
                                    if ("source".equals(tagName)) {
                                        update.setSource(file2);
                                    } else if (f10885p.equals(tagName)) {
                                        update.setPatch(file2);
                                    } else if (zurt.InterfaceC0290k.f47416lvui.equals(tagName)) {
                                        update.setTarget(file2);
                                    }
                                }
                                z2 = false;
                                break;
                            }
                        }
                    }
                    if (z2) {
                        updateBundle.addUpdate(update);
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
        return updateBundle;
    }

    private void toq(File sourceFile, File patchFile, File targetFile) {
        targetFile.getParentFile().mkdirs();
        this.f57916zy.applyPatch(sourceFile.getAbsolutePath(), targetFile.getAbsolutePath(), patchFile.getAbsolutePath());
    }

    private void x2(Update update, File sourceFolder, File patchFolder, File targetFolder) throws t8r {
        ki(update.getSource());
        ki(update.getTarget());
        String name = p001b.toq.m5742n().get(update.getSource().getName());
        String str = p001b.toq.m5746y().get(update.getSource().getName());
        if (name == null || str != null) {
            name = update.getSource().getName();
        }
        File file = new File(sourceFolder, name);
        File file2 = new File(targetFolder, name);
        String strM7498g = m7498g(file, update.getSource(), true);
        if (strM7498g != null && this.f10890q != toq.LOOSE) {
            throw new t8r(strM7498g);
        }
        zy(file, file2);
    }

    private void zy(File sourceFile, File targetFile) {
        if (sourceFile.exists()) {
            targetFile.getParentFile().mkdirs();
            C7083n.zy(sourceFile, targetFile);
        }
    }

    public String f7l8() {
        return this.f57915toq.getSourceDigest();
    }

    /* JADX INFO: renamed from: h */
    public void m7501h(toq mode) {
        this.f10890q = mode;
    }

    /* JADX INFO: renamed from: k */
    public void m7502k(String sourceName) {
        this.f10889n.add(sourceName);
    }

    public boolean ld6() {
        return this.f57915toq != null;
    }

    public void n7h(File sourceFolder, File targetFolder) throws t8r {
        targetFolder.mkdirs();
        for (Update update : this.f57915toq.getUpdates()) {
            int i2 = k.f10891k[update.getAction().ordinal()];
            if (i2 == 1) {
                cdj(update, sourceFolder, this.f10888k, targetFolder);
            } else if (i2 == 2) {
                m7500q(update, sourceFolder, this.f10888k, targetFolder);
            } else if (i2 == 3) {
                m7499n(update, sourceFolder, this.f10888k, targetFolder);
            } else if (i2 == 4) {
                kja0(update, sourceFolder, this.f10888k, targetFolder);
            } else if (i2 == 5) {
                x2(update, sourceFolder, this.f10888k, targetFolder);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public long m7503p() {
        return this.f57915toq.getTargetSize();
    }

    /* JADX INFO: renamed from: s */
    public String m7504s() {
        return this.f57915toq.getTargetDigest();
    }

    /* JADX INFO: renamed from: y */
    public long m7505y() {
        return this.f57915toq.getSourceSize();
    }
}
