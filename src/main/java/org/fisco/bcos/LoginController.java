package org.fisco.bcos;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/user")
public class LoginController {
   
    /**
     * 返回demo数据:
     * 请求地址：http://127.0.0.1:8080/user/login
     * @return
     */
    @RequestMapping("/login")
    public Request getLogin(@RequestBody UserInfo info){
        Request user = new Request();
        user.setSuccess(true);
        String username = info.username;
        String password = info.password;
        if(username.equals("bank") && password.equals("123456"))
        {
            user.setUrl("bank/admin");
        }
        else if(username.equals("tyre") && password.equals("123456"))
        {
            user.setUrl("tyre/admin");
        }
        else if(username.equals("wheelhub") && password.equals("123456"))
        {
            user.setUrl("wheel/admin");
        }
        else if(username.equals("car") && password.equals("123456"))
        {
            user.setUrl("car/admin");
        }
        else
        {
            user.setUrl("failed");
        }
        // System.out.println(username);
        // System.out.println(password);
        return user;
    }
}