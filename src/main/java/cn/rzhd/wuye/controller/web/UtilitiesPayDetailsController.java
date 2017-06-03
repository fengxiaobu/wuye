package cn.rzhd.wuye.controller.web;

import cn.rzhd.wuye.service.IWaterPayDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hasee on 2017/6/2.
 */
@RestController
public class UtilitiesPayDetailsController {
    @Autowired
    IWaterPayDetailsService waterService;


}
