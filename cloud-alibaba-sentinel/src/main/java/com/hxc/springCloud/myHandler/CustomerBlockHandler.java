package com.hxc.springCloud.myHandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.hxc.springCloud.entity.CommonResult;

public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception){
        return new CommonResult(444,"自定义错误页面1");
    }
    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult(444,"自定义错误页面2");
    }
}
