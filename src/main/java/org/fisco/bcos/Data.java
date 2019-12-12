package org.fisco.bcos;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.ArrayList;
public class Data {
   public int id;
   public String fromaccount;
   public String toaccount;
   public int amount;
   int getId()
   {
      return id;
   }
   void setId(int _id)
   {
      id = _id;
   }
   String getFromaccount()
   {
      return fromaccount;
   }
   void setFromaccount(String _fromaccount)
   {
      fromaccount = _fromaccount;
   }
   String getToaccount()
   {
      return toaccount;
   }
   void setToaccount(String _toaccount)
   {
      toaccount = _toaccount;
   }
   int getAmount()
   {
      return amount;
   }
   void setAmount(int _amount)
   {
      amount = _amount;
   }
}