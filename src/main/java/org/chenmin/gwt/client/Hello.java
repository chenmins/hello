package org.chenmin.gwt.client;

import com.axellience.vuegwt.core.client.Vue;
import com.axellience.vuegwt.core.client.VueGWT;
import com.axellience.vueroutergwt.client.VueRouter;
import com.google.gwt.core.client.EntryPoint;
import org.chenmin.gwt.client.pages.*;

public class Hello implements EntryPoint {
    @Override
    public void onModuleLoad() {
        //    VueGWT.init();
        VueGWT.initWithoutVueLib();
        VueRouter.init();
//        Vue.attach("#app",TestBtnFactory.get());
        Vue.attach("#app",AppComponentFactory.get());
//        Vue.attach("#app",MainComponentFactory.get());
    }
}
