package com.wangjiangfei.builder;

/**
 * 保险合同的对象
 *
 * @author wangjiangfei
 */
public class InsuranceContract {

    private String contractId;// 保险合同编号
    private String personName;// 被保险人员的名称
    private String companyName;// 被保险公司的名称
    private long beginDate;// 保险开始生效的日期
    private long endDate;// 保险失效的日期
    private String otherData;// 其他数据

    /**
     * 构造方法，访问级别是私有的
     * @param builder
     */
    private InsuranceContract(ConcreteBuilder builder) {
        this.contractId = builder.contractId;
        this.personName = builder.personName;
        this.companyName = builder.companyName;
        this.beginDate = builder.beginDate;
        this.otherData = builder.otherData;
    }

    public void someOperation() {
        System.out.println("Now in incurance contract some operation = " + this.contractId);
    }

    /**
     * 构造保险合同对象的构建器，作为保险合同的类级内部类
     */
    public static class ConcreteBuilder {

        private String contractId;
        private String personName;
        private String companyName;
        private long beginDate;
        private long endDate;
        private String otherData;

        /**
         * 构造方法，传入必须要有的参数
         * @param contractId
         * @param beginDate
         * @param endDate
         */
        public ConcreteBuilder(String contractId, long beginDate, long endDate) {
            this.contractId = contractId;
            this.beginDate = beginDate;
            this.endDate = endDate;
        }

        public ConcreteBuilder setPersonName(String personName) {
            this.personName = personName;
            return this;
        }

        public ConcreteBuilder setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public ConcreteBuilder setOtherData(String otherData) {
            this.otherData = otherData;
            return this;
        }

        /**
         * 构建真正地对象并返回
         * @return 构建的保险合同的对象
         */
        public InsuranceContract build() {
            if (contractId == null || contractId.trim().length() == 0) {
                throw new IllegalStateException("合同编号不能为空");
            }
            boolean signPerson = personName != null && personName.trim().length() > 0;
            boolean signCompany = companyName != null && companyName.trim().length() > 0;
            if (signPerson && signCompany) {
                throw new IllegalStateException("一份保险合同不能同时与人和公司签订");
            }
            if (beginDate <= 0) {
                throw new IllegalStateException("合同必须有保险开始生效的日期");
            }
            if (endDate <= 0) {
                throw new IllegalStateException("合同必须有保险失效的日期");
            }
            if (endDate <= beginDate) {
                throw new IllegalStateException("保险失效的日期必须大于保险生效日期");
            }
            return new InsuranceContract(this);
        }
    }
}
