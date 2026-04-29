package com.miui.maml.data;

import android.text.TextUtils;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.data.VariableBinder;
import com.miui.maml.util.FilenameExtFilter;
import com.miui.maml.util.MamlLog;
import com.miui.maml.util.TextFormatter;
import java.io.File;
import java.util.ArrayList;
import org.w3c.dom.Element;
import p001b.InterfaceC1357q;

/* JADX INFO: loaded from: classes3.dex */
public class FileBinder extends VariableBinder {
    private static final String LOG_TAG = "FileBinder";
    public static final String TAG_NAME = "FileBinder";
    private IndexedVariable mCountVar;
    protected TextFormatter mDirFormatter;
    private String[] mFiles;
    private String[] mFilters;
    private ArrayList<Variable> mVariables;

    private static class Variable extends VariableBinder.Variable {
        public Expression mIndex;

        public Variable(Element element, Variables variables) {
            super(element, variables);
            Expression expressionBuild = Expression.build(variables, element.getAttribute("index"));
            this.mIndex = expressionBuild;
            if (expressionBuild == null) {
                MamlLog.m17851e(VariableBinder.Variable.TAG_NAME, "fail to load file index expression");
            }
        }

        @Override // com.miui.maml.data.VariableBinder.TypedValue
        protected int parseType(String str) {
            return 2;
        }
    }

    public FileBinder(Element element, ScreenElementRoot screenElementRoot) {
        super(element, screenElementRoot);
        this.mVariables = new ArrayList<>();
        load(element);
    }

    private void load(Element element) {
        if (element == null) {
            MamlLog.m17851e("FileBinder", "FileBinder node is null");
            return;
        }
        String strTrim = element.getAttribute(InterfaceC1357q.f53904ltg8).trim();
        this.mFilters = TextUtils.isEmpty(strTrim) ? null : strTrim.split(",");
        this.mDirFormatter = new TextFormatter(getVariables(), element.getAttribute("dir"), Expression.build(getVariables(), element.getAttribute("dirExp")));
        if (!TextUtils.isEmpty(this.mName)) {
            this.mCountVar = new IndexedVariable(this.mName + ".count", getContext().mVariables, true);
        }
        loadVariables(element);
    }

    private void updateVariables() {
        String[] strArr = this.mFiles;
        int length = strArr == null ? 0 : strArr.length;
        for (Variable variable : this.mVariables) {
            Expression expression = variable.mIndex;
            if (expression != null) {
                variable.set(length == 0 ? null : this.mFiles[((int) expression.evaluate()) % length]);
            }
        }
    }

    protected void addVariable(Variable variable) {
        this.mVariables.add(variable);
    }

    @Override // com.miui.maml.data.VariableBinder
    public void init() {
        super.init();
        refresh();
    }

    @Override // com.miui.maml.data.VariableBinder
    public void refresh() {
        super.refresh();
        File file = new File(this.mDirFormatter.getText());
        String[] strArr = this.mFilters;
        String[] list = strArr == null ? file.list() : file.list(new FilenameExtFilter(strArr));
        this.mFiles = list;
        int length = list == null ? 0 : list.length;
        IndexedVariable indexedVariable = this.mCountVar;
        if (indexedVariable != null) {
            indexedVariable.set(length);
        }
        MamlLog.m17853i("FileBinder", "file count: " + length);
        updateVariables();
    }

    @Override // com.miui.maml.data.VariableBinder
    public void tick() {
        super.tick();
        updateVariables();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.miui.maml.data.VariableBinder
    public Variable onLoadVariable(Element element) {
        return new Variable(element, getVariables());
    }
}
