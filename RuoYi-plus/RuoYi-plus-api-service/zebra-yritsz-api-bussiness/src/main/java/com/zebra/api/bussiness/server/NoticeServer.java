package com.zebra.api.bussiness.server;

import com.zebra.api.bussiness.aop.LogAnnotation;
import com.zebra.api.bussiness.aop.LogAnnotation.OPERTYPE;
import com.zebra.api.bussiness.service.NoticeService;
import com.zebra.api.commons.bean.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * Title: 公告<br/>
 * Description:<br/>
 *
 * @author zebra
 * @Date 2020年3月25日
 *
 */
@RestController
@RequestMapping("/noticeServer")
public class NoticeServer {
	@Autowired
	private NoticeService demoService;

	@RequestMapping(value = "/getNotice/{noticeId}")
	@ResponseBody
	@LogAnnotation(oper = OPERTYPE.getNotice)
	public Json getNotice(@PathVariable(value = "noticeId") Long noticeId) {
		return demoService.getNotice(noticeId);
	}

	@RequestMapping(value = "/getNoticeList", method = RequestMethod.POST)
	@ResponseBody
	@LogAnnotation(oper = OPERTYPE.getNotice)
	public Json getNoticeList() {
		return demoService.getNoticeList();
	}

}
