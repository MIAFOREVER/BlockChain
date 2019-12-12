package org.fisco.bcos;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.fisco.bcos.asset.client.AssetClient;
import java.math.BigInteger;
import java.util.Map;

@Controller
public class RegisterController {

  @GetMapping("/login")
  public String register() {
    return "login";
  }

  @GetMapping("/failed")
  public String failed() {
    return "failed";
  }

  @GetMapping("/bank/admin")
  public String bankAdmin(Map<String,String> map) {
    AssetClient client = AssetClient.getAssetClient();
    BigInteger car = client.queryAssetAmount("car");
    map.put("car", "可用信用额度:" + car.toString());
    map.put("car1", Integer.toString(car.intValue() / 2000) + "%");
    BigInteger tyre = client.queryAssetAmount("tyre");
    map.put("tyre", "可用信用额度:" + tyre.toString());
    map.put("tyre1", Integer.toString(tyre.intValue()  / 2000) + "%");
    BigInteger wheelhub = client.queryAssetAmount("wheelhub");
    map.put("wheelhub", "可用信用额度:" + wheelhub.toString());
    map.put("wheelhub1", Integer.toString(wheelhub.intValue()  / 2000) + "%");
    return "/bank/admin";
  }

  @GetMapping("/bank/1")
  public String bank1() {
    return "/bank/1";
  }

  @GetMapping("/bank/2")
  public String bank2() {
    return "/bank/2";
  }

  @GetMapping("/bank/3")
  public String bank3() {
    return "/bank/3";
  }

  @GetMapping("/car/admin")
  public String carAdmin(Map<String,String> map) {
    AssetClient client = AssetClient.getAssetClient();
    BigInteger car = client.queryAssetAmount("car");
    map.put("car", "可用信用额度:" + car.toString());
    map.put("car1", Integer.toString(car.intValue() / 2000) + "%");
    BigInteger tyre = client.queryAssetAmount("tyre");
    map.put("tyre", "可用信用额度:" + tyre.toString());
    map.put("tyre1", Integer.toString(tyre.intValue()  / 2000) + "%");
    BigInteger wheelhub = client.queryAssetAmount("wheelhub");
    map.put("wheelhub", "可用信用额度:" + wheelhub.toString());
    map.put("wheelhub1", Integer.toString(wheelhub.intValue()  / 2000) + "%");
    return "/car/admin";
  }

  @GetMapping("/car/1")
  public String car1() {
    return "/car/1";
  }

  @GetMapping("/car/2")
  public String car2() {
    return "/car/2";
  }

  @GetMapping("/car/3")
  public String car3() {
    return "/car/3";
  }

  @GetMapping("/car/4")
  public String car4() {
    return "/car/4";
  }

  @GetMapping("/tyre/admin")
  public String tyreAdmin(Map<String,String> map) {
    AssetClient client = AssetClient.getAssetClient();
    BigInteger car = client.queryAssetAmount("car");
    map.put("car", "可用信用额度:" + car.toString());
    map.put("car1", Integer.toString(car.intValue() / 2000) + "%");
    BigInteger tyre = client.queryAssetAmount("tyre");
    map.put("tyre", "可用信用额度:" + tyre.toString());
    map.put("tyre1", Integer.toString(tyre.intValue()  / 2000) + "%");
    BigInteger wheelhub = client.queryAssetAmount("wheelhub");
    map.put("wheelhub", "可用信用额度:" + wheelhub.toString());
    map.put("wheelhub1", Integer.toString(wheelhub.intValue()  / 2000) + "%");
    return "/tyre/admin";
  }

  @GetMapping("/tyre/1")
  public String tyre1() {
    return "/tyre/1";
  }

  @GetMapping("/tyre/2")
  public String tyre2() {
    return "/tyre/2";
  }

  @GetMapping("/tyre/3")
  public String tyre3() {
    return "/tyre/3";
  }

  @GetMapping("/tyre/4")
  public String tyre4() {
    return "/tyre/4";
  }

  @GetMapping("/wheelhub/admin")
  public String wheelAdmin(Map<String,String> map) {
    AssetClient client = AssetClient.getAssetClient();
    BigInteger car = client.queryAssetAmount("car");
    map.put("car", "可用信用额度:" + car.toString());
    map.put("car1", Integer.toString(car.intValue() / 2000) + "%");
    BigInteger tyre = client.queryAssetAmount("tyre");
    map.put("tyre", "可用信用额度:" + tyre.toString());
    map.put("tyre1", Integer.toString(tyre.intValue()  / 2000) + "%");
    BigInteger wheelhub = client.queryAssetAmount("wheelhub");
    map.put("wheelhub", "可用信用额度:" + wheelhub.toString());
    map.put("wheelhub1", Integer.toString(wheelhub.intValue()  / 2000) + "%");
    return "/wheelhub/admin";
  }

  @GetMapping("/wheel/1")
  public String wheel1() {
    return "/wheel/1";
  }

  @GetMapping("/wheel/2")
  public String wheel2() {
    return "/wheel/2";
  }

  @GetMapping("/wheel/3")
  public String wheel3() {
    return "/wheel/3";
  }

  @GetMapping("/wheel/4")
  public String wheel4() {
    return "/wheel/4";
  }
}

