import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/account")
    public String getAccount(Model model) {
        Account account = accountService.getAccountDetails();
        model.addAttribute("account", account);
        return "account"; // This refers to account.html in src/main/resources/templates
    }
}
