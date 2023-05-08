package com.ljh.exam.jsp_bootstrap.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.ljh.exam.jsp_bootstrap.vo.Rq;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class NeedLogoutInterceptor implements HandlerInterceptor {
	private Rq rq;

	public NeedLogoutInterceptor(Rq rq) {
		this.rq = rq;
	}
	
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object handler) throws Exception {
		if ( rq.isLogined() ) {
			rq.printHistoryBackJs("로그아웃 후 이용해주세요.");
			return false;
		}

		return HandlerInterceptor.super.preHandle(req, resp, handler);
	}
}