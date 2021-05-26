package com.kuang.filter;
import javax.servlet.*;
import java.io.IOException;

public class CharacterEncodingFilter implements Filter{
    // 初始化:在web服务器启动时，就开始初始化了，随时等待过滤对象出现
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("CharacterEncodingFilter初始化");
    }
    //Chain 链

    /**
     * 1.过滤器中的所有代码，在过滤特定请求的时候都会执行
     * 2.必须要让过滤器继续
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("utf-16");
        servletResponse.setCharacterEncoding("utf-16");
        servletResponse.setContentType("teaxt/html;charset=UTF-16");

        System.out.println("CharacterEncodingFilter执行前...");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("CharacterEncodingFilter执行后...");

    }

    // 销毁
    @Override
    public void destroy() {
        System.gc();
        System.out.println("CharacterEncodingFilter销毁");
    }
}
