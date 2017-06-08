package com.bounter.swagger.controller;

import com.bounter.swagger.entity.ResponseData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by simon on 2017/6/7.
 */
@RestController
@Api(value = "Swagger接口", description = "Swagger接口")
public class SwaggerController {

    @ApiOperation(value = "Swagger测试")
    @PostMapping("/bounter/swagger")
    public ResponseData<String> testSwagger(@ApiParam(required = true, value = "用户名") @RequestParam String name) {
        ResponseData<String> responseData = new ResponseData<>();
        responseData.setData("Hello, " + name);
        responseData.setSuccess(true);
        return responseData;
    }
}
