package com.wangjiangfei.interpreter;

public class Client2 {

    public static void main(String[] args) throws Exception {
        // 准备上下文
        Context context = new Context("src/com/wangjiangfei/interpreter/InterpreterTest.xml");

        // 想要获取c元素的name属性，也就是如下表达式 “root/a/b/c.name”
        // 这个时候c不是终结了，需要把c修改成ElementExpression
        ElementExpression root = new ElementExpression("root");
        ElementExpression aEle = new ElementExpression("a");
        ElementExpression bEle = new ElementExpression("b");
        ElementExpression cEle = new ElementExpression("c");
        PropertyTerminalExpression prop =
                new PropertyTerminalExpression("name");

        // 组合
        root.addEle(aEle);
        aEle.addEle(bEle);
        bEle.addEle(cEle);
        cEle.addEle(prop);
        // 调用
        String[] ss = root.interpreter(context);
        System.out.println("c的属性name的值是=" + ss[0]);

        // 如果需要使用同一个上下文，连续进行解析，需要重新初始化上下文对象
        // 比如，要连续的重新再获取一次属性name的值，当然你可以重新组合对象
        // 重新解析，只要是在使用同一个上下文，就需要重新初始化上下文对象
        context.reInit();
        String[] ss2 = root.interpreter(context);
        System.out.println("重新获取c的属性name的值是=" + ss2[0]);
    }
}
