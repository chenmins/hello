package org.chenmin.gwt.client.pages;

import com.axellience.vuegwt.core.annotations.component.Component;
import com.axellience.vuegwt.core.annotations.component.Data;
import com.axellience.vuegwt.core.client.component.IsVueComponent;
import jsinterop.annotations.JsMethod;

@Component
public class TestBtn implements IsVueComponent {
    @Data
    int counterValue = 0;
    @JsMethod
    public void reset() {
        counterValue = 0;
    }


}
