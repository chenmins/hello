package org.chenmin.gwt.client.pages.main;

import com.axellience.vuegwt.core.annotations.component.Component;
import com.axellience.vuegwt.core.client.component.IsVueComponent;
import com.axellience.vuegwt.core.client.component.hooks.HasMounted;
import org.chenmin.gwt.client.js.Feather;

@Component
public class SideBarComponent implements IsVueComponent ,HasMounted {

    @Override
    public void mounted() {
        Feather.replace();
    }
}
