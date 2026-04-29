package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* JADX INFO: compiled from: AppCompatTextClassifierHelper.java */
/* JADX INFO: loaded from: classes.dex */
final class o1t {

    /* JADX INFO: renamed from: k */
    @zy.lvui
    private TextView f1163k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @zy.dd
    private TextClassifier f46938toq;

    o1t(@zy.lvui TextView textView) {
        this.f1163k = (TextView) androidx.core.util.n7h.x2(textView);
    }

    @zy.hyr(api = 26)
    @zy.lvui
    /* JADX INFO: renamed from: k */
    public TextClassifier m695k() {
        TextClassifier textClassifier = this.f46938toq;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f1163k.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    @zy.hyr(api = 26)
    public void toq(@zy.dd TextClassifier textClassifier) {
        this.f46938toq = textClassifier;
    }
}
