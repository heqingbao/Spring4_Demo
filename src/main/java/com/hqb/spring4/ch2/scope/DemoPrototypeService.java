package com.hqb.spring4.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by heqingbao on 2017/6/3.
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
