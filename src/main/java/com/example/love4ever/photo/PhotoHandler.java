package com.example.love4ever.photo;

import com.example.love4ever.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zx
 * @Date 2020/5/25
 * @Version 1.0
 */
@RestController
@RequestMapping("/photo")
public class PhotoHandler {

    @ResponseBody
    @RequestMapping("/child")
    public User getPhotograph() {
        User user = new User();
        user.setName("小周小周 辣鸡辣鸡 菜菜菜");
        user.setPhone("77777777");
        return user;
    }
}
