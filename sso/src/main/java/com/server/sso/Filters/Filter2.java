package com.server.sso.Filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;

/**
 * Filter2
 */
@WebFilter(filterName = "Filter2", urlPatterns = "/api/*")
@Order(1)
public class Filter2 implements Filter {
    private static final Logger logger = LoggerFactory.getLogger(Filter2.class);
    @Override
    public void init(FilterConfig filterConfig) {
        logger.info("初始化过滤器2：", filterConfig.getFilterName());
    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        // 对请求进行预处理
        logger.info("过滤器开始对请求进行预处理2：");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String requestUri = request.getRequestURI();
        System.out.println("请求的接口为2：" + requestUri);
        long startTime = System.currentTimeMillis();
        // 通过 doFilter 方法实现过滤功能
        filterChain.doFilter(servletRequest, servletResponse);
        // 上面的 doFilter 方法执行结束后用户的请求已经返回
        long endTime = System.currentTimeMillis();
        System.out.println("该用户的请求已经处理完毕，请求花费的时间为2：" + (endTime - startTime));
    }

    @Override
    public void destroy() {
        logger.info("销毁过滤器2");
    }
}