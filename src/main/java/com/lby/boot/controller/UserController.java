package com.lby.boot.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lby.boot.model.User;
import com.lby.boot.service.UserService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{

    private Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserById")
    @ResponseBody
    public JSONObject getUserById(HttpServletRequest request)
    {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = userService.getUserById(id);
        JSONObject userJson = new JSONObject();
        if (user != null)
        {
            logger.info(JSONArray.toJSON(user));
            userJson.put("name", user.getName());
            userJson.put("age", user.getAge());
        }
        return userJson;
    }


}