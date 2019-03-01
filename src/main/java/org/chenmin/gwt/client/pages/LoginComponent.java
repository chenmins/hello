package org.chenmin.gwt.client.pages;

import com.axellience.vuegwt.core.annotations.component.Component;
import com.axellience.vuegwt.core.annotations.component.Data;
import com.axellience.vuegwt.core.client.component.IsVueComponent;
import com.axellience.vuegwt.core.client.component.hooks.HasCreated;
import com.axellience.vueroutergwt.client.Route;
import com.axellience.vueroutergwt.client.VueRouteComponent;
import com.axellience.vueroutergwt.client.VueRouter;
import jsinterop.annotations.JsMethod;

import java.util.logging.Logger;

@Component
public class LoginComponent implements IsVueComponent ,VueRouteComponent,HasCreated {
    Logger logger = Logger.getLogger(LoginComponent.class.getName());
    @Data
    Route route;
    @Data
    VueRouter router;
    @Data
    String email;
    @Data
    String password;
    @Data
    boolean remember;

    @JsMethod
    public void submit() {
        logger.info("submit:"+email+","+password+","+remember);
        if(!password.isEmpty()&&password.equals("000000")){
            router.push("/Main");
        }else{
            //error
        }
    }

    @Override
    public void created() {
        route =  getRoute();
        router = getRouter();
        logger.info("route:"+route);
        logger.info("router:"+router);
    }
}
