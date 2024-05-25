package daelim.book.rental.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/admin")
public class AdminHomeController {

    @RequestMapping("/")
    public String home() {
        System.out.println("[AdminHomeController] home() ");
        return "admin/home";
    }

    @RequestMapping("/createAccountForm")
    public String createAccountForm(){
        System.out.println("[AdminHomeController] createAccountForm()");
        return "/admin/member/create_account_form";
    }
}