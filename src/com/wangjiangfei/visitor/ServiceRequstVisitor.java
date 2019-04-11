package com.wangjiangfei.visitor;

/**
 * 具体的访问者，实现客户提出服务请求的功能
 *
 * @author wangjiangfei
 */
public class ServiceRequstVisitor implements Visitor {

    @Override
    public void visitEnterpriseCustomer(EnterpriseCustomer ec) {
        // 企业客户提出的具体服务请求
        System.out.println(ec.getName() + "企业提出服务请求");
    }

    @Override
    public void visitPersonalCustomer(PersonalCustomer pc) {
        // 企业客户提出的具体服务请求
        System.out.println("客户" + pc.getName() + "提出服务请求");
    }
}
