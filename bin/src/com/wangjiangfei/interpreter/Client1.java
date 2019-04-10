package com.wangjiangfei.interpreter;

public class Client1 {

    public static void main(String[] args) throws Exception {
        // 准备上下文
        Context context = new Context("src/com/wangjiangfei/interpreter/InterpreterTest.xml");

        // 想要获取c元素的值，也就是如下表达式 “/root/a/b/c”
        ElementExpression root = new ElementExpression("root");
        ElementExpression aEle = new ElementExpression("a");
        ElementExpression bEle = new ElementExpression("b");
        ElementTerminalExpression cEle = new ElementTerminalExpression("c");

        // 组合起来
        root.addEle(aEle);
        aEle.addEle(bEle);
        bEle.addEle(cEle);
        // 调用
        String[] ss = root.interpreter(context);
        System.out.println("c的值是=" + ss[0]);
    }
}
