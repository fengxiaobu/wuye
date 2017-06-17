package cn.rzhd.wuye.wsserver;

import cn.rzhd.wuye.utils.JsonResult;

import javax.jws.WebService;

/**
 * Created by hasee on 2017/6/6.
 */
@WebService
public interface IUpdateDataService {
    JsonResult updateData(RequesterVO req);
}
