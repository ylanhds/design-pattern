package com.single.responsibility.principle;

import com.single.responsibility.principle.service.IUserBO;
import com.single.responsibility.principle.service.IUserBiz;
import com.single.responsibility.principle.service.impl.UserInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrincipleApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrincipleApplication.class, args);
    }

    private void Test(){
        IUserBiz userInfo = new UserInfo();

        IUserBO userBO = (IUserBO)userInfo;
        userBO.setPassword("abc");

        IUserBiz userBiz = userInfo;
        userBiz.changePassword();

    }


}
