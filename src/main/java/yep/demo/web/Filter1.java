package yep.demo.web;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class Filter1 implements Filter {
    public void destroy() {
        System.out.println("Filter1 destroy 1 ");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("doFilter 1 s ");
        chain.doFilter(req, resp);
        System.out.println("doFilter 1 e");
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("filter 1");
    }

}
