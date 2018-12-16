package com.example.web.helloSamplePage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/helloSamplePage")
public class CustomerController {
	@RequestMapping(method = RequestMethod.GET)
    public String helloSamplePage(Model model) {
		// model.addAttribute("msg","サンプルメッセージ！");
        return "helloSamplePage";
    }

}