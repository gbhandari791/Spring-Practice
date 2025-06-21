package spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class InterceptorExamleImpl implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("Inside pre");
		String parameter = request.getParameter("someText");
		if (parameter.startsWith("G")) {
			return false;
		}

		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("[postHandle] After Controller, Before View Render");

		// Example: add a custom variable to be available in view
		if (modelAndView != null) {
			modelAndView.addObject("interceptorNote", "This message is from postHandle interceptor.");
		}
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("[afterCompletion] After View Rendered");

        // Log exception if any
        if (ex != null) {
            System.out.println("Exception caught in afterCompletion: " + ex.getMessage());
        }
	}

}
