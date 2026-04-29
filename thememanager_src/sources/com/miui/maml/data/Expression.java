package com.miui.maml.data;

import android.text.TextUtils;
import com.miui.maml.util.MamlLog;
import com.miui.maml.util.Utils;
import com.xiaomi.mipush.sdk.C5658n;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import miuix.miuixbasewidget.widget.AlphabetIndexer;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Expression {
    private static final boolean DEBUG = false;
    private static final String LOG_TAG = "Expression";

    /* JADX INFO: renamed from: com.miui.maml.data.Expression$1 */
    static /* synthetic */ class C51591 {
        static final /* synthetic */ int[] $SwitchMap$com$miui$maml$data$Expression$Ope;
        static final /* synthetic */ int[] $SwitchMap$com$miui$maml$data$Expression$Tokenizer$TokenType;

        static {
            int[] iArr = new int[Tokenizer.TokenType.values().length];
            $SwitchMap$com$miui$maml$data$Expression$Tokenizer$TokenType = iArr;
            try {
                iArr[Tokenizer.TokenType.VAR_NUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$miui$maml$data$Expression$Tokenizer$TokenType[Tokenizer.TokenType.VAR_STR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$miui$maml$data$Expression$Tokenizer$TokenType[Tokenizer.TokenType.VAR_JSON_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$miui$maml$data$Expression$Tokenizer$TokenType[Tokenizer.TokenType.VAR_JSON_ARR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$miui$maml$data$Expression$Tokenizer$TokenType[Tokenizer.TokenType.NUM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$miui$maml$data$Expression$Tokenizer$TokenType[Tokenizer.TokenType.STR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$miui$maml$data$Expression$Tokenizer$TokenType[Tokenizer.TokenType.BRACKET_ROUND.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$miui$maml$data$Expression$Tokenizer$TokenType[Tokenizer.TokenType.BRACKET_SQUARE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$miui$maml$data$Expression$Tokenizer$TokenType[Tokenizer.TokenType.OPE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$miui$maml$data$Expression$Tokenizer$TokenType[Tokenizer.TokenType.FUN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr2 = new int[Ope.values().length];
            $SwitchMap$com$miui$maml$data$Expression$Ope = iArr2;
            try {
                iArr2[Ope.MIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$miui$maml$data$Expression$Ope[Ope.NOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$miui$maml$data$Expression$Ope[Ope.BIT_NOT.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$miui$maml$data$Expression$Ope[Ope.ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$miui$maml$data$Expression$Ope[Ope.MUL.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$miui$maml$data$Expression$Ope[Ope.DIV.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$miui$maml$data$Expression$Ope[Ope.MOD.ordinal()] = 7;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$miui$maml$data$Expression$Ope[Ope.BIT_AND.ordinal()] = 8;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$miui$maml$data$Expression$Ope[Ope.BIT_OR.ordinal()] = 9;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$miui$maml$data$Expression$Ope[Ope.BIT_XOR.ordinal()] = 10;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$miui$maml$data$Expression$Ope[Ope.BIT_LSHIFT.ordinal()] = 11;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$miui$maml$data$Expression$Ope[Ope.BIT_RSHIFT.ordinal()] = 12;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$miui$maml$data$Expression$Ope[Ope.EQ.ordinal()] = 13;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$miui$maml$data$Expression$Ope[Ope.NEQ.ordinal()] = 14;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$miui$maml$data$Expression$Ope[Ope.AND.ordinal()] = 15;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$miui$maml$data$Expression$Ope[Ope.OR.ordinal()] = 16;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$miui$maml$data$Expression$Ope[Ope.GT.ordinal()] = 17;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$com$miui$maml$data$Expression$Ope[Ope.GE.ordinal()] = 18;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$com$miui$maml$data$Expression$Ope[Ope.LT.ordinal()] = 19;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$com$miui$maml$data$Expression$Ope[Ope.LE.ordinal()] = 20;
            } catch (NoSuchFieldError unused30) {
            }
        }
    }

    static abstract class ArrayVariableExpression extends VariableExpression {
        protected Expression mIndexExp;

        public ArrayVariableExpression(Variables variables, String str, Expression expression) {
            super(variables, str, false);
            this.mIndexExp = expression;
        }

        @Override // com.miui.maml.data.Expression
        public void accept(ExpressionVisitor expressionVisitor) {
            expressionVisitor.visit(this);
            this.mIndexExp.accept(expressionVisitor);
        }
    }

    static class BinaryExpression extends Expression {
        private Expression mExp1;
        private Expression mExp2;
        private Ope mOpe;

        public BinaryExpression(Expression expression, Expression expression2, Ope ope) {
            Ope ope2 = Ope.INVALID;
            this.mExp1 = expression;
            this.mExp2 = expression2;
            this.mOpe = ope;
            if (ope == ope2) {
                MamlLog.m17851e(Expression.LOG_TAG, "BinaryExpression: invalid operator:" + ope);
            }
        }

        @Override // com.miui.maml.data.Expression
        public void accept(ExpressionVisitor expressionVisitor) {
            expressionVisitor.visit(this);
            this.mExp1.accept(expressionVisitor);
            this.mExp2.accept(expressionVisitor);
        }

        @Override // com.miui.maml.data.Expression
        public double evaluate() {
            int i2 = C51591.$SwitchMap$com$miui$maml$data$Expression$Ope[this.mOpe.ordinal()];
            if (i2 == 1) {
                return this.mExp1.evaluate() - this.mExp2.evaluate();
            }
            switch (i2) {
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    if (this.mExp1.evaluate() != this.mExp2.evaluate()) {
                        break;
                    }
                    break;
                case 14:
                    if (this.mExp1.evaluate() == this.mExp2.evaluate()) {
                        break;
                    }
                    break;
                case 15:
                    if (this.mExp1.evaluate() <= 0.0d || this.mExp2.evaluate() <= 0.0d) {
                    }
                    break;
                case 16:
                    if (this.mExp1.evaluate() <= 0.0d && this.mExp2.evaluate() <= 0.0d) {
                        break;
                    }
                    break;
                case 17:
                    if (this.mExp1.evaluate() <= this.mExp2.evaluate()) {
                        break;
                    }
                    break;
                case 18:
                    if (this.mExp1.evaluate() < this.mExp2.evaluate()) {
                        break;
                    }
                    break;
                case 19:
                    if (this.mExp1.evaluate() >= this.mExp2.evaluate()) {
                        break;
                    }
                    break;
                case 20:
                    if (this.mExp1.evaluate() > this.mExp2.evaluate()) {
                        break;
                    }
                    break;
                default:
                    MamlLog.m17851e(Expression.LOG_TAG, "fail to evalute BinaryExpression, invalid operator");
                    break;
            }
            return 0.0d;
        }

        @Override // com.miui.maml.data.Expression
        public String evaluateStr() {
            String strEvaluateStr = this.mExp1.evaluateStr();
            String strEvaluateStr2 = this.mExp2.evaluateStr();
            if (C51591.$SwitchMap$com$miui$maml$data$Expression$Ope[this.mOpe.ordinal()] != 4) {
                MamlLog.m17851e(Expression.LOG_TAG, "fail to evalute string BinaryExpression, invalid operator");
                return null;
            }
            if (strEvaluateStr == null && strEvaluateStr2 == null) {
                return null;
            }
            if (strEvaluateStr == null) {
                return strEvaluateStr2;
            }
            if (strEvaluateStr2 == null) {
                return strEvaluateStr;
            }
            return strEvaluateStr + strEvaluateStr2;
        }

        @Override // com.miui.maml.data.Expression
        public boolean isNull() {
            int i2 = C51591.$SwitchMap$com$miui$maml$data$Expression$Ope[this.mOpe.ordinal()];
            if (i2 == 1 || i2 == 4) {
                return this.mExp1.isNull() && this.mExp2.isNull();
            }
            if (i2 != 5 && i2 != 6 && i2 != 7) {
                switch (i2) {
                }
                return true;
            }
            return this.mExp1.isNull() || this.mExp2.isNull();
        }

        @Override // com.miui.maml.data.Expression
        public BigDecimal preciseEvaluate() {
            if (this.mOpe != Ope.INVALID) {
                BigDecimal bigDecimalPreciseEvaluate = this.mExp1.preciseEvaluate();
                BigDecimal bigDecimalPreciseEvaluate2 = this.mExp2.preciseEvaluate();
                if (bigDecimalPreciseEvaluate != null && bigDecimalPreciseEvaluate2 != null) {
                    int i2 = C51591.$SwitchMap$com$miui$maml$data$Expression$Ope[this.mOpe.ordinal()];
                    if (i2 == 1) {
                        return bigDecimalPreciseEvaluate.subtract(bigDecimalPreciseEvaluate2);
                    }
                    if (i2 == 4) {
                        return bigDecimalPreciseEvaluate.add(bigDecimalPreciseEvaluate2);
                    }
                    if (i2 == 5) {
                        return bigDecimalPreciseEvaluate.multiply(bigDecimalPreciseEvaluate2);
                    }
                    if (i2 == 6) {
                        try {
                            return bigDecimalPreciseEvaluate.divide(bigDecimalPreciseEvaluate2, MathContext.DECIMAL128);
                        } catch (Exception unused) {
                            return null;
                        }
                    }
                    if (i2 == 7) {
                        try {
                            return bigDecimalPreciseEvaluate.remainder(bigDecimalPreciseEvaluate2);
                        } catch (Exception unused2) {
                            return null;
                        }
                    }
                }
            }
            MamlLog.m17851e(Expression.LOG_TAG, "fail to PRECISE evalute BinaryExpression, invalid operator");
            return null;
        }
    }

    public static class FunctionExpression extends Expression {
        protected static HashMap<String, FunctionImpl> sFunMap = new HashMap<>();
        private FunctionImpl mFun;
        private String mFunName;
        private Expression[] mParaExps;
        private Variables mVariables;

        static {
            FunctionsLoader.load();
        }

        public FunctionExpression(Variables variables, Expression[] expressionArr, String str) throws Exception {
            this.mVariables = variables;
            this.mParaExps = expressionArr;
            this.mFunName = str;
            parseFunction(str);
        }

        private void parseFunction(String str) throws Exception {
            FunctionImpl functionImpl = sFunMap.get(str);
            Utils.asserts(functionImpl != null, "invalid function:" + str);
            this.mFun = functionImpl;
            Utils.asserts(this.mParaExps.length >= functionImpl.params, "parameters count not matching for function: " + str);
        }

        public static void registerFunction(String str, FunctionImpl functionImpl) {
            if (sFunMap.put(str, functionImpl) != null) {
                MamlLog.m17854w(Expression.LOG_TAG, "duplicated function name registation: " + str);
            }
        }

        public static void removeFunction(String str, FunctionImpl functionImpl) {
            sFunMap.remove(str);
        }

        public static void resetFunctions() {
            Iterator<Map.Entry<String, FunctionImpl>> it = sFunMap.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().reset();
            }
        }

        @Override // com.miui.maml.data.Expression
        public void accept(ExpressionVisitor expressionVisitor) {
            expressionVisitor.visit(this);
            int i2 = 0;
            while (true) {
                Expression[] expressionArr = this.mParaExps;
                if (i2 >= expressionArr.length) {
                    return;
                }
                expressionArr[i2].accept(expressionVisitor);
                i2++;
            }
        }

        @Override // com.miui.maml.data.Expression
        public double evaluate() {
            return this.mFun.evaluate(this.mParaExps, this.mVariables);
        }

        @Override // com.miui.maml.data.Expression
        public JSONArray evaluateJsonArray() {
            return this.mFun.evaluateJsonArray(this.mParaExps, this.mVariables);
        }

        @Override // com.miui.maml.data.Expression
        public JSONObject evaluateJsonObject() {
            return this.mFun.evaluateJsonObject(this.mParaExps, this.mVariables);
        }

        @Override // com.miui.maml.data.Expression
        public String evaluateStr() {
            return this.mFun.evaluateStr(this.mParaExps, this.mVariables);
        }

        public String getFunName() {
            return this.mFunName;
        }
    }

    public static abstract class FunctionImpl {
        public int params;

        public FunctionImpl(int i2) {
            this.params = i2;
        }

        public abstract double evaluate(Expression[] expressionArr, Variables variables);

        public JSONArray evaluateJsonArray(Expression[] expressionArr, Variables variables) {
            return null;
        }

        public JSONObject evaluateJsonObject(Expression[] expressionArr, Variables variables) {
            return null;
        }

        public abstract String evaluateStr(Expression[] expressionArr, Variables variables);

        public void reset() {
        }
    }

    static class JsonArrayVariableExpression extends VariableExpression {
        public JsonArrayVariableExpression(Variables variables, String str) {
            super(variables, str, false);
        }

        @Override // com.miui.maml.data.Expression
        public double evaluate() {
            return 0.0d;
        }

        @Override // com.miui.maml.data.Expression
        public JSONArray evaluateJsonArray() {
            Object obj = this.mIndexedVar.get();
            return obj instanceof JSONArray ? (JSONArray) obj : super.evaluateJsonArray();
        }

        @Override // com.miui.maml.data.Expression
        public String evaluateStr() {
            JSONArray jSONArrayEvaluateJsonArray = evaluateJsonArray();
            if (jSONArrayEvaluateJsonArray != null) {
                return jSONArrayEvaluateJsonArray.toString();
            }
            return null;
        }

        @Override // com.miui.maml.data.Expression
        public boolean isNull() {
            return this.mIndexedVar.isNull();
        }
    }

    static class JsonObjectVariableExpression extends VariableExpression {
        public JsonObjectVariableExpression(Variables variables, String str) {
            super(variables, str, false);
        }

        @Override // com.miui.maml.data.Expression
        public double evaluate() {
            return 0.0d;
        }

        @Override // com.miui.maml.data.Expression
        public JSONObject evaluateJsonObject() {
            Object obj = this.mIndexedVar.get();
            return obj instanceof JSONObject ? (JSONObject) obj : super.evaluateJsonObject();
        }

        @Override // com.miui.maml.data.Expression
        public String evaluateStr() {
            JSONObject jSONObjectEvaluateJsonObject = evaluateJsonObject();
            if (jSONObjectEvaluateJsonObject != null) {
                return jSONObjectEvaluateJsonObject.toString();
            }
            return null;
        }

        @Override // com.miui.maml.data.Expression
        public boolean isNull() {
            return this.mIndexedVar.isNull();
        }
    }

    static class NumberArrayVariableExpression extends ArrayVariableExpression {
        public NumberArrayVariableExpression(Variables variables, String str, Expression expression) {
            super(variables, str, expression);
        }

        @Override // com.miui.maml.data.Expression
        public double evaluate() {
            return this.mIndexedVar.getArrDouble((int) this.mIndexExp.evaluate());
        }

        @Override // com.miui.maml.data.Expression
        public String evaluateStr() {
            return Utils.doubleToString(evaluate());
        }

        @Override // com.miui.maml.data.Expression
        public boolean isNull() {
            return this.mIndexedVar.isNull((int) this.mIndexExp.evaluate());
        }
    }

    static class NumberVariableExpression extends VariableExpression {
        public NumberVariableExpression(Variables variables, String str) {
            super(variables, str, true);
        }

        @Override // com.miui.maml.data.Expression
        public double evaluate() {
            return this.mIndexedVar.getDouble();
        }

        @Override // com.miui.maml.data.Expression
        public String evaluateStr() {
            return Utils.doubleToString(evaluate());
        }

        @Override // com.miui.maml.data.Expression
        public boolean isNull() {
            return this.mIndexedVar.isNull();
        }
    }

    private enum Ope {
        ADD,
        MIN,
        MUL,
        DIV,
        MOD,
        BIT_AND,
        BIT_OR,
        BIT_XOR,
        BIT_NOT,
        BIT_LSHIFT,
        BIT_RSHIFT,
        NOT,
        EQ,
        NEQ,
        AND,
        OR,
        GT,
        GE,
        LT,
        LE,
        INVALID
    }

    private static class OpeInfo {
        private static final int OPE_SIZE;
        private static final String[] mOpes;
        public int participants;
        public int priority;
        public String str;
        public boolean unary;
        private static final int[] mOpePriority = {4, 4, 3, 3, 3, 8, 9, 10, 2, 5, 5, 2, 7, 7, 11, 12, 6, 6, 6, 6};
        private static final int[] mOpePar = {2, 1, 2, 2, 2, 2, 2, 2, 1, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2};

        public static class Parser {
            private int[] mFlags = new int[OpeInfo.OPE_SIZE];
            private int mMatch;
            private int mStep;

            public boolean accept(char c2, boolean z2) {
                if (z2) {
                    for (int i2 = 0; i2 < OpeInfo.OPE_SIZE; i2++) {
                        this.mFlags[i2] = 0;
                    }
                    this.mStep = 0;
                    this.mMatch = -1;
                }
                boolean z3 = false;
                for (int i3 = 0; i3 < OpeInfo.OPE_SIZE; i3++) {
                    if (this.mFlags[i3] != -1) {
                        String str = OpeInfo.mOpes[i3];
                        int length = str.length();
                        int i4 = this.mStep;
                        if (length <= i4 || str.charAt(i4) != c2) {
                            this.mFlags[i3] = -1;
                        } else {
                            boolean z5 = this.mStep == str.length() - 1;
                            this.mFlags[i3] = 0;
                            if (z5) {
                                this.mMatch = i3;
                            }
                            z3 = true;
                        }
                    }
                }
                if (z3) {
                    this.mStep++;
                }
                return z3;
            }

            public Ope getMatch() {
                return this.mMatch == -1 ? Ope.INVALID : Ope.values()[this.mMatch];
            }
        }

        static {
            String[] strArr = {"+", C5658n.f73185t8r, "*", "/", "%", "&", "|", "^", C5658n.f73167eqxt, "{{", "}}", AlphabetIndexer.ad, "==", "!=", "**", "||", "}", "}=", "{", "{="};
            mOpes = strArr;
            OPE_SIZE = strArr.length;
        }

        private OpeInfo() {
        }

        public static OpeInfo getOpeInfo(int i2) {
            OpeInfo opeInfo = new OpeInfo();
            opeInfo.priority = mOpePriority[i2];
            opeInfo.participants = mOpePar[i2];
            opeInfo.str = mOpes[i2];
            return opeInfo;
        }
    }

    static class StringArrayVariableExpression extends ArrayVariableExpression {
        public StringArrayVariableExpression(Variables variables, String str, Expression expression) {
            super(variables, str, expression);
        }

        @Override // com.miui.maml.data.Expression
        public double evaluate() {
            String strEvaluateStr = evaluateStr();
            if (TextUtils.isEmpty(strEvaluateStr)) {
                return 0.0d;
            }
            try {
                return Double.parseDouble(strEvaluateStr);
            } catch (NumberFormatException unused) {
                return 0.0d;
            }
        }

        @Override // com.miui.maml.data.Expression
        public String evaluateStr() {
            return this.mIndexedVar.getArrString((int) this.mIndexExp.evaluate());
        }

        @Override // com.miui.maml.data.Expression
        public boolean isNull() {
            return this.mIndexedVar.isNull((int) this.mIndexExp.evaluate());
        }
    }

    static class StringExpression extends Expression {
        private String mValue;

        public StringExpression(String str) {
            this.mValue = str;
        }

        @Override // com.miui.maml.data.Expression
        public double evaluate() {
            if (TextUtils.isEmpty(this.mValue)) {
                return 0.0d;
            }
            try {
                return Double.parseDouble(this.mValue);
            } catch (NumberFormatException unused) {
                return 0.0d;
            }
        }

        @Override // com.miui.maml.data.Expression
        public String evaluateStr() {
            return this.mValue;
        }
    }

    static class StringVariableExpression extends VariableExpression {
        public StringVariableExpression(Variables variables, String str) {
            super(variables, str, false);
        }

        @Override // com.miui.maml.data.Expression
        public double evaluate() {
            String strEvaluateStr = evaluateStr();
            if (TextUtils.isEmpty(strEvaluateStr)) {
                return 0.0d;
            }
            try {
                return Double.parseDouble(strEvaluateStr);
            } catch (NumberFormatException unused) {
                return 0.0d;
            }
        }

        @Override // com.miui.maml.data.Expression
        public String evaluateStr() {
            return this.mIndexedVar.getString();
        }

        @Override // com.miui.maml.data.Expression
        public boolean isNull() {
            return this.mIndexedVar.isNull();
        }
    }

    static class UnaryExpression extends Expression {
        private Expression mExp;
        private Ope mOpe;

        public UnaryExpression(Expression expression, Ope ope) {
            Ope ope2 = Ope.INVALID;
            this.mExp = expression;
            this.mOpe = ope;
            if (ope == ope2) {
                MamlLog.m17851e(Expression.LOG_TAG, "UnaryExpression: invalid operator:" + ope);
            }
        }

        @Override // com.miui.maml.data.Expression
        public void accept(ExpressionVisitor expressionVisitor) {
            expressionVisitor.visit(this);
            this.mExp.accept(expressionVisitor);
        }

        @Override // com.miui.maml.data.Expression
        public double evaluate() {
            int i2 = C51591.$SwitchMap$com$miui$maml$data$Expression$Ope[this.mOpe.ordinal()];
            if (i2 == 1) {
                return 0.0d - this.mExp.evaluate();
            }
            if (i2 == 2) {
                return this.mExp.evaluate() <= 0.0d ? 1.0d : 0.0d;
            }
            if (i2 == 3) {
                return ~((int) this.mExp.evaluate());
            }
            MamlLog.m17851e(Expression.LOG_TAG, "fail to evalute UnaryExpression, invalid operator");
            return this.mExp.evaluate();
        }

        @Override // com.miui.maml.data.Expression
        public String evaluateStr() {
            return Utils.doubleToString(evaluate());
        }

        @Override // com.miui.maml.data.Expression
        public boolean isNull() {
            return this.mExp.isNull();
        }
    }

    static abstract class VariableExpression extends Expression {
        protected IndexedVariable mIndexedVar;
        protected String mName;

        public VariableExpression(Variables variables, String str, boolean z2) {
            this.mName = str;
            this.mIndexedVar = new IndexedVariable(str, variables, z2);
        }

        public int getIndex() {
            return this.mIndexedVar.getIndex();
        }

        public String getName() {
            return this.mName;
        }

        public int getVersion() {
            return this.mIndexedVar.getVersion();
        }
    }

    public static Expression build(Variables variables, String str) {
        Expression expressionBuildInner = buildInner(variables, str);
        if (expressionBuildInner == null) {
            return null;
        }
        return new RootExpression(variables, expressionBuildInner);
    }

    private static Expression buildBracket(Variables variables, Tokenizer.Token token, Stack<Tokenizer.Token> stack) {
        Expression[] expressionArrBuildMultipleInner = buildMultipleInner(variables, token.token);
        if (!checkParams(expressionArrBuildMultipleInner)) {
            MamlLog.m17851e(LOG_TAG, "invalid expressions: " + token.token);
            return null;
        }
        try {
        } catch (Exception e2) {
            MamlLog.m17852e(LOG_TAG, "build FunctionExpression fail.", e2);
        }
        if (!stack.isEmpty() && stack.peek().type == Tokenizer.TokenType.FUN) {
            return new FunctionExpression(variables, expressionArrBuildMultipleInner, stack.pop().token);
        }
        if (expressionArrBuildMultipleInner.length == 1) {
            return expressionArrBuildMultipleInner[0];
        }
        MamlLog.m17851e(LOG_TAG, "fail to buid: multiple expressions in brackets, but seems no function presents:" + token.token);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:98:0x0131 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.miui.maml.data.Expression buildInner(com.miui.maml.data.Variables r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.maml.data.Expression.buildInner(com.miui.maml.data.Variables, java.lang.String):com.miui.maml.data.Expression");
    }

    public static Expression[] buildMultiple(Variables variables, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Expression[] expressionArrBuildMultipleInner = buildMultipleInner(variables, str);
        Expression[] expressionArr = new Expression[expressionArrBuildMultipleInner.length];
        for (int i2 = 0; i2 < expressionArrBuildMultipleInner.length; i2++) {
            Expression expression = expressionArrBuildMultipleInner[i2];
            if (expression == null || (expression instanceof NumberExpression) || (expression instanceof StringExpression)) {
                expressionArr[i2] = expression;
            } else {
                expressionArr[i2] = new RootExpression(variables, expression);
            }
        }
        return expressionArr;
    }

    private static Expression[] buildMultipleInner(Variables variables, String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (!z2) {
                if (cCharAt == ',' && i3 == 0) {
                    arrayList.add(buildInner(variables, str.substring(i2, i4)));
                    i2 = i4 + 1;
                } else if (cCharAt == '(') {
                    i3++;
                } else if (cCharAt == ')') {
                    i3--;
                }
            }
            if (cCharAt == '\'') {
                z2 = !z2;
            }
        }
        if (i2 < str.length()) {
            arrayList.add(buildInner(variables, str.substring(i2)));
        }
        return (Expression[]) arrayList.toArray(new Expression[arrayList.size()]);
    }

    private static boolean checkParams(Expression[] expressionArr) {
        for (Expression expression : expressionArr) {
            if (expression == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isDigitCharRest(char c2) {
        return (c2 >= '0' && c2 <= '9') || (c2 >= 'a' && c2 <= 'f') || ((c2 >= 'A' && c2 <= 'F') || c2 == '.');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isDigitCharStart(char c2) {
        return (c2 >= '0' && c2 <= '9') || c2 == '.';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isFunctionCharRest(char c2) {
        return isFunctionCharStart(c2) || c2 == '_' || (c2 >= '0' && c2 <= '9');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isFunctionCharStart(char c2) {
        return (c2 >= 'a' && c2 <= 'z') || (c2 >= 'A' && c2 <= 'Z');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isVariableChar(char c2) {
        return (c2 >= 'a' && c2 <= 'z') || (c2 >= 'A' && c2 <= 'Z') || c2 == '_' || c2 == '.' || (c2 >= '0' && c2 <= '9');
    }

    public void accept(ExpressionVisitor expressionVisitor) {
        expressionVisitor.visit(this);
    }

    public abstract double evaluate();

    public JSONArray evaluateJsonArray() {
        return null;
    }

    public JSONObject evaluateJsonObject() {
        return null;
    }

    public String evaluateStr() {
        return null;
    }

    public boolean isNull() {
        return false;
    }

    public BigDecimal preciseEvaluate() {
        try {
            return BigDecimal.valueOf(evaluate());
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static class NumberExpression extends Expression {
        private String mString;
        private double mValue;

        public NumberExpression(double d2) {
            this.mValue = d2;
        }

        @Override // com.miui.maml.data.Expression
        public double evaluate() {
            return this.mValue;
        }

        @Override // com.miui.maml.data.Expression
        public String evaluateStr() {
            if (this.mString == null) {
                this.mString = Utils.doubleToString(this.mValue);
            }
            return this.mString;
        }

        public void setValue(double d2) {
            this.mValue = d2;
        }

        public NumberExpression(String str) {
            if (TextUtils.isEmpty(str)) {
                MamlLog.m17851e(Expression.LOG_TAG, "invalid NumberExpression: null");
                return;
            }
            try {
                if (str.length() > 2 && str.indexOf("0x") == 0) {
                    this.mValue = Long.parseLong(str.substring(2), 16);
                } else {
                    this.mValue = Double.parseDouble(str);
                }
            } catch (NumberFormatException unused) {
                MamlLog.m17851e(Expression.LOG_TAG, "invalid NumberExpression:" + str);
            }
        }
    }

    private static class Tokenizer {
        private static final int BRACKET_MODE_NONE = 0;
        private static final int BRACKET_MODE_ROUND = 1;
        private static final int BRACKET_MODE_SQUARE = 2;
        private OpeInfo.Parser mOpeParser = new OpeInfo.Parser();
        private int mPos;
        private String mString;

        public enum TokenType {
            INVALID,
            VAR_NUM,
            VAR_STR,
            VAR_JSON_OBJ,
            VAR_JSON_ARR,
            NUM,
            STR,
            OPE,
            FUN,
            BRACKET_ROUND,
            BRACKET_SQUARE
        }

        public Tokenizer(String str) {
            this.mString = str;
            reset();
        }

        public Token getToken() {
            TokenType tokenType = TokenType.INVALID;
            int length = this.mString.length();
            int i2 = -1;
            int i3 = 0;
            char c2 = 0;
            char c3 = 0;
            char c4 = 0;
            for (int i4 = this.mPos; i4 < length; i4++) {
                char cCharAt = this.mString.charAt(i4);
                if (c2 == 0) {
                    if (cCharAt == '#' || cCharAt == '@' || cCharAt == '$') {
                        int i5 = i4 + 1;
                        int i6 = (i5 >= length || this.mString.charAt(i5) != '$') ? 1 : 2;
                        int i7 = i4 + i6;
                        int i8 = i7;
                        while (i8 < length && Expression.isVariableChar(this.mString.charAt(i8))) {
                            i8++;
                        }
                        if (i8 == i7) {
                            MamlLog.m17851e(Expression.LOG_TAG, "invalid variable name:" + this.mString);
                            return null;
                        }
                        this.mPos = i8;
                        TokenType tokenType2 = TokenType.VAR_NUM;
                        if (cCharAt == '@') {
                            tokenType2 = TokenType.VAR_STR;
                        } else if (cCharAt == '$') {
                            tokenType2 = i6 == 1 ? TokenType.VAR_JSON_OBJ : TokenType.VAR_JSON_ARR;
                        }
                        return new Token(tokenType2, this.mString.substring(i7, i8));
                    }
                    if (cCharAt == '\'') {
                        int i9 = i4 + 1;
                        int i10 = i9;
                        boolean z2 = false;
                        while (i10 < length) {
                            char cCharAt2 = this.mString.charAt(i10);
                            if (!z2 && cCharAt2 == '\'') {
                                break;
                            }
                            z2 = cCharAt2 == '\\';
                            i10++;
                        }
                        this.mPos = i10 + 1;
                        return new Token(TokenType.STR, this.mString.substring(i9, i10).replace("\\'", "'"));
                    }
                    if (cCharAt == '(') {
                        c2 = 1;
                    } else if (cCharAt == '[') {
                        c2 = 2;
                    } else {
                        if (Expression.isDigitCharStart(cCharAt)) {
                            int i11 = i4 + 1;
                            if (this.mString.charAt(i4) == '0' && i11 < length) {
                                if (this.mString.charAt(i11) != 'x') {
                                    i11++;
                                }
                                i11++;
                            }
                            while (i11 < length && Expression.isDigitCharRest(this.mString.charAt(i11))) {
                                i11++;
                            }
                            this.mPos = i11;
                            return new Token(TokenType.NUM, this.mString.substring(i4, i11));
                        }
                        if (Expression.isFunctionCharStart(cCharAt)) {
                            int i12 = i4 + 1;
                            while (i12 < length && Expression.isFunctionCharRest(this.mString.charAt(i12))) {
                                i12++;
                            }
                            this.mPos = i12;
                            return new Token(TokenType.FUN, this.mString.substring(i4, i12));
                        }
                        if (this.mOpeParser.accept(cCharAt, true)) {
                            int i13 = i4 + 1;
                            while (i13 < length && this.mOpeParser.accept(this.mString.charAt(i13), false)) {
                                i13++;
                            }
                            Ope match = this.mOpeParser.getMatch();
                            if (match != Ope.INVALID) {
                                this.mPos = i13;
                                return new Token(TokenType.OPE, this.mString.substring(i4, i13), match);
                            }
                        }
                    }
                }
                if (c2 != 0) {
                    if (i3 == 0) {
                        if (c2 == 1) {
                            c4 = ')';
                            tokenType = TokenType.BRACKET_ROUND;
                            c3 = '(';
                        } else if (c2 == 2) {
                            c4 = ']';
                            tokenType = TokenType.BRACKET_SQUARE;
                            c3 = '[';
                        }
                        i2 = i4 + 1;
                    }
                    if (cCharAt == c3) {
                        i3++;
                    } else if (cCharAt == c4 && i3 - 1 == 0) {
                        this.mPos = i4 + 1;
                        return new Token(tokenType, this.mString.substring(i2, i4));
                    }
                }
            }
            if (i3 == 0) {
                return null;
            }
            MamlLog.m17851e(Expression.LOG_TAG, "mismatched bracket:" + this.mString);
            return null;
        }

        public void reset() {
            this.mPos = 0;
        }

        public static class Token {
            public OpeInfo info;
            public Ope op;
            public String token;
            public TokenType type;

            public Token(TokenType tokenType, String str) {
                this.type = TokenType.INVALID;
                this.op = Ope.INVALID;
                this.type = tokenType;
                this.token = str;
            }

            public Token(TokenType tokenType, String str, Ope ope) {
                this.type = TokenType.INVALID;
                Ope ope2 = Ope.INVALID;
                this.type = tokenType;
                this.token = str;
                this.op = ope;
                this.info = OpeInfo.getOpeInfo(ope.ordinal());
            }
        }
    }
}
