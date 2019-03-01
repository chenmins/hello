package org.chenmin.gwt.client;

import com.axellience.vuegwt.core.client.component.options.CustomizeOptions;
import com.axellience.vuegwt.core.client.component.options.VueComponentOptions;
import com.axellience.vueroutergwt.client.RouterOptions;
import com.axellience.vueroutergwt.client.VueRouter;
import org.chenmin.gwt.client.pages.LoginComponentFactory;
import org.chenmin.gwt.client.pages.MainComponentFactory;

public class RoutesConfig implements CustomizeOptions {
    @Override
    public void customizeOptions(VueComponentOptions vueComponentOptions)
    {
        // We first create an object to hold our Router options
        RouterOptions routerOptions = new RouterOptions();

        // We add the routes to our options by passing
        // their path and the Constructor of the Component we want to display on them
        routerOptions
                .addRoute("/", LoginComponentFactory.get())
                .addRoute("/Login", LoginComponentFactory.get())
                .addRoute("/Main", MainComponentFactory.get())
//                .addRoute("/foo/:id", FooComponentFactory.get())
//                .addRoute("/bar/:id", BarComponentFactory.get())
        ;

        // We the create our router
        VueRouter vueRouter = new VueRouter(routerOptions);

        // And set it on our Component options
        vueComponentOptions.set("router", vueRouter);
    }
}