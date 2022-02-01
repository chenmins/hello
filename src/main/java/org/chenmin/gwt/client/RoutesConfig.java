package org.chenmin.gwt.client;

import com.axellience.vuegwt.core.client.component.options.CustomizeOptions;
import com.axellience.vuegwt.core.client.component.options.VueComponentOptions;
import com.axellience.vueroutergwt.client.RouterMode;
import com.axellience.vueroutergwt.client.RouterOptions;
import com.axellience.vueroutergwt.client.VueRouter;
import com.google.gwt.core.client.GWT;
import org.chenmin.gwt.client.pages.login.LoginComponentFactory;
import org.chenmin.gwt.client.pages.main.MainComponentFactory;

public class RoutesConfig implements CustomizeOptions {

    public static String BASE = "/"+GWT.getModuleName()+"/";

    @Override
    public void customizeOptions(VueComponentOptions vueComponentOptions)
    {
        // We first create an object to hold our Router options
        RouterOptions routerOptions = new RouterOptions();
        routerOptions.setMode(RouterMode.HISTORY);

//        String base = GWT.getModuleBaseURL();

        GWT.log("base1:"+ BASE);
//        GWT.log("base2:"+GWT.getHostPageBaseURL());
//        GWT.log("base3:"+GWT.getModuleName());
        // We add the routes to our options by passing
        // their path and the Constructor of the Component we want to display on them
        routerOptions
                .addRoute(BASE , LoginComponentFactory.get())
                .addRoute(BASE +LoginComponentFactory.get().getComponentTagName(), LoginComponentFactory.get())
                .addRoute(BASE +MainComponentFactory.get().getComponentTagName(), MainComponentFactory.get())
                .addRoute(BASE +"*", LoginComponentFactory.get())
//                .addRoute("/foo/:id", FooComponentFactory.get())
//                .addRoute("/bar/:id", BarComponentFactory.get())
        ;

        // We the create our router
        VueRouter vueRouter = new VueRouter(routerOptions);

        // And set it on our Component options
        vueComponentOptions.set("router", vueRouter);
    }
}