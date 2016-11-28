/**
 * ---------------------------------------------------------------------------
 * 类名称   ：TestServiceImpl
 * 类描述   ：
 * 创建人   ： xue.yi
 * 创建时间： 2016/8/17 15:10
 * 版权拥有：银信网银科技
 * ---------------------------------------------------------------------------
 */
package com.iih5.springboot.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestServiceImpl implements TestService {
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = {RuntimeException.class})
    public void test() {
        System.out.println("是我测试");

    }
}
