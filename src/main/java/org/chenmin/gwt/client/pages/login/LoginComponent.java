package org.chenmin.gwt.client.pages.login;

import com.axellience.vuegwt.core.annotations.component.Component;
import com.axellience.vuegwt.core.annotations.component.Data;
import com.axellience.vuegwt.core.client.component.IsVueComponent;
import com.axellience.vuegwt.core.client.component.hooks.HasCreated;
import com.axellience.vueroutergwt.client.Route;
import com.axellience.vueroutergwt.client.VueRouteComponent;
import com.axellience.vueroutergwt.client.VueRouter;
import com.google.gwt.user.client.Cookies;
import elemental2.dom.Event;
import jsinterop.annotations.JsMethod;
import org.chenmin.gwt.client.RoutesConfig;
import org.chenmin.gwt.client.pages.main.MainComponentFactory;

import java.util.Date;
import java.util.logging.Logger;

@Component
public class LoginComponent implements IsVueComponent, VueRouteComponent, HasCreated {
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
    @Data
    boolean active = false;


    @JsMethod
    public void submit(Event event) {
//        if (event != null) {
//            event.preventDefault();
//            logger.info(" -> Event Type: " + event.type);
//        }
        logger.info("submit:" + email + "," + password + "," + remember);
        if (password == null || password.isEmpty()) {
            return;
        }
        if (password.equals("000000")) {
            if(remember){
                Date expires = new Date();
                //设置cookie到期时间,从设置时间算起30天的毫秒之后失效
                expires.setTime(expires.getTime() + 30*24*60*60*1000);
                Cookies.setCookie("email", email, expires, null, "/", false);
                Cookies.setCookie("password", password, expires, null, "/", false);
                Cookies.setCookie("remember", remember?"0":"1", expires, null, "/", false);
            }
            router.push(RoutesConfig.BASE+MainComponentFactory.get().getComponentTagName());
        } else {
            event.preventDefault();
            //error
            active = true;
        }

    }

    @Override
    public void created() {
        logger.info("LoginComponent:created"  );
        route = getRoute();
        router = getRouter();
        String email = Cookies.getCookie("email");
        String password = Cookies.getCookie("password");
        String remember = Cookies.getCookie("remember");
        logger.info("route:" + route);
        logger.info("router:" + router);
        logger.info("email:" + email);
        logger.info("password:" + password);
        logger.info("remember:" + remember);
        this.email = email;
        this.password = password;
        if(remember!=null){
            this.remember = remember.equals("0")?true:false;
        }
    }
}
