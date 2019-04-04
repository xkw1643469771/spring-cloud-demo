package com.xumou.scd.zuul.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

// 自定义权限过滤器
@Component
public class AuthFilter extends ZuulFilter {

	// 是否执行这个过滤器
	@Override
	public boolean shouldFilter() {
		return true;
	}

	// 过滤器执行顺序
	@Override
	public int filterOrder() {
		return 0;
	}

	// 过滤类型, 参数如下:
	// pre：可以在请求被路由之前调用 , routing：在路由请求时候被调用
	// post：在routing和error过滤器之后被调用, error：处理请求时发生错误时被调用
	@Override
	public String filterType() {
		return "pre";
	}

	// 具体逻辑
	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		String token = request.getParameter("token");
		if (token == null) {
			ctx.setSendZuulResponse(false);
			ctx.setResponseStatusCode(401);
			try {
				PrintWriter pw = ctx.getResponse().getWriter();
				pw.print("Permission denied");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
