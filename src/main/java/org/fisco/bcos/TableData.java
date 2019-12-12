package org.fisco.bcos;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.ArrayList;
public class TableData {
   public int code;
   public String msg;
   public int count;
   public ArrayList<Data> data;
   TableData()
   {
      data = new ArrayList<Data>();
   }
   int getCode()
   {
      return code;
   }
   void setCode(int _code)
   {
      code = _code;
   }
   String getMsg()
   {
      return msg;
   }
   void setMsg(String _msg)
   {
      msg = _msg;
   }
   int getCount()
   {
      return count;
   }
   void setCount(int _count)
   {
      count = _count;
   }
   ArrayList<Data> getData()
   {
      return data;
   }
   void setData(ArrayList<Data> _data)
   {
      data = _data;
   }
}