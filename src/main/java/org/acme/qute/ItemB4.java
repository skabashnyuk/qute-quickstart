package org.acme.qute;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ItemB4 implements Item {
    @Override
    public void sayHello() {
        System.out.println("Hello from "+this.getClass().getName());
    }
}
