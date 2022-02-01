package org.chenmin.gwt.client.pages.main;

import com.axellience.vuegwt.core.annotations.component.Component;
import com.axellience.vuegwt.core.annotations.component.Data;
import com.axellience.vuegwt.core.client.component.IsVueComponent;
import org.chenmin.gwt.client.RoutesConfig;
import org.chenmin.gwt.client.pages.login.LoginComponentFactory;

@Component
public class TopBarComponent implements IsVueComponent {

    @Data
    String logout = RoutesConfig.BASE+ LoginComponentFactory.get().getComponentTagName();

}
