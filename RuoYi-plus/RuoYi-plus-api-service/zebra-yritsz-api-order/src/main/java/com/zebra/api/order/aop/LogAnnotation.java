package com.zebra.api.order.aop;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogAnnotation {
	public enum OPERTYPE {
		refundOrder("订单退款");
		// 构造方法
		private String opertype;

		private OPERTYPE(String oper) {
			this.opertype = oper;
		}

		@Override
		public String toString() {
			return String.valueOf(this.opertype);
		}
	};

	OPERTYPE oper();
}
