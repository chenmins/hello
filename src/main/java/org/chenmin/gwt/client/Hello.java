package org.chenmin.gwt.client;

import com.axellience.vuegwt.core.client.Vue;
import com.axellience.vuegwt.core.client.VueGWT;
import com.google.gwt.core.client.EntryPoint;
import org.chenmin.gwt.client.pages.LoginComponentFactory;
import org.chenmin.gwt.client.pages.MainComponentFactory;
import org.chenmin.gwt.client.pages.TestBtnFactory;

public class Hello implements EntryPoint {
    @Override
    public void onModuleLoad() {
        //    VueGWT.init();
        VueGWT.initWithoutVueLib();
//        Vue.attach("#app",TestBtnFactory.get());
//        Vue.attach("#app",LoginComponentFactory.get());
        Vue.attach("#app",MainComponentFactory.get());
    }
}
