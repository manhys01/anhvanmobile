package poly.agile.webapp.controller.custom;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {

	@RequestMapping("/error")
	public String handleError(HttpServletRequest request) {
		Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

		if (status != null) {
			Integer statusCode = Integer.valueOf(status.toString());

			if (statusCode == HttpStatus.NOT_FOUND.value()) {
				System.out.println("page not found!");
				return "errors/404";
			} else if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
				System.out.println("Internal server error");
				return "errors/500";
			}
		}
		return "errors/error";
		
	}

	@Override
	public String getErrorPath() {
		return "/error";
	}

}
