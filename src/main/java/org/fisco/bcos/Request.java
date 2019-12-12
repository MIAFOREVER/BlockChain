package org.fisco.bcos;
public class Request {
   private boolean success;//测试名称.
   private String url;
   
   public boolean getSuccess() {
      return success;
   }
   public void setSuccess(boolean _success) {
      this.success = _success;
   }

   public String getUrl() {
      return url;
   }
   public void setUrl(String _url) {
      this.url = _url;
   }
}