package q;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/")
public class Q {
   
   
   @RequestMapping
   @ResponseBody
   public String q(@AuthenticationPrincipal Authentication currentUser ) {
      return "Hello " + currentUser.getName();
   }
   
   
   

}
