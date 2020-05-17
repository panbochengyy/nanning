package com.zebra.api.bussiness.feign.client.impl;

import com.zebra.api.bussiness.feign.base.BaseService;
import com.zebra.api.bussiness.feign.client.OrderFienClient;
import com.zebra.api.commons.bean.Json;
import org.springframework.stereotype.Service;

@Service
public class OrderFienClientImpl extends BaseService implements OrderFienClient {

	@Override
	public Json refundOrder(String orderId) {
		return super.returnHix();
	}

}
