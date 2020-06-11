package org.acme.qute;


import java.math.BigDecimal;

public class ItemOrig {

   public final BigDecimal price;
   public final String name;

   public ItemOrig(BigDecimal price, String name) {
      this.price = price;
      this.name = name;
   }

}