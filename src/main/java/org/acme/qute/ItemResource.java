package org.acme.qute;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateExtension;
import io.quarkus.qute.TemplateInstance;

@Path("items")
public class ItemResource {

    @Inject
    Template items;

    @Inject
    org.acme.qute.ItemC itemC;
    @Inject
    org.acme.qute.ItemA6  ItemA6;
    @Inject
    org.acme.qute.ItemB2 ItemB2;
    @Inject
    org.acme.qute.ItemB3 ItemB3;
    @Inject
    org.acme.qute.ItemC7 ItemC7;
    @Inject
    org.acme.qute.ItemA ItemA;
    @Inject
    org.acme.qute.ItemC2 ItemC2;
    @Inject
    org.acme.qute.ItemC3 ItemC3;
    @Inject
    org.acme.qute.ItemA4 ItemA4;
    @Inject
    org.acme.qute.ItemB1 ItemB1;
    @Inject
    org.acme.qute.ItemA2 ItemA2;
    @Inject
    org.acme.qute.ItemC1 ItemC1;
    @Inject
    org.acme.qute.ItemC5 ItemC5;
    @Inject
    org.acme.qute.ItemA1 ItemA1;
    @Inject
    org.acme.qute.ItemA3 ItemA3;
    @Inject
    org.acme.qute.ItemC4 ItemC4;
    @Inject
    org.acme.qute.ItemC6 ItemC6;
    @Inject
    org.acme.qute.ItemC8 ItemC8;
    @Inject
    org.acme.qute.ItemB ItemB;
    @Inject
    org.acme.qute.ItemB6 ItemB6;
    @Inject
    org.acme.qute.ItemB4 ItemB4;
    @Inject
    org.acme.qute.ItemB5 ItemB5;
    @Inject
    org.acme.qute.ItemA5 ItemA5;


    @Inject
    Instance<Item> allInstances;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get() {
        allInstances.stream().forEach(Item::sayHello);
        List<ItemOrig> data = new ArrayList<>();
        data.add(new ItemOrig(new BigDecimal(10), "Apple"));
        data.add(new ItemOrig(new BigDecimal(16), "Pear"));
        data.add(new ItemOrig(new BigDecimal(30), "Orange"));
        return items.data("items", data);
    }

    /**
     * This template extension method implements the "discountedPrice" computed property.
     */
    @TemplateExtension
    static BigDecimal discountedPrice(ItemOrig item) {
        return item.price.multiply(new BigDecimal("0.9"));
    }

}
