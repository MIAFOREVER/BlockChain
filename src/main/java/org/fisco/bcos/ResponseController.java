package org.fisco.bcos;

import java.math.BigInteger;
import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.fisco.bcos.asset.client.AssetClient;
import org.fisco.bcos.web3j.tuples.generated.Tuple2;
import org.fisco.bcos.encryption.Paillier;

@RestController
@RequestMapping("/table")
public class ResponseController {
    @RequestMapping("/bank")
    public TableData tableBank(){
        // Paillier paillier = Paillier.getInstance();
        AssetClient client = AssetClient.getAssetClient();
        TableData t = new TableData();
        t.setMsg("");
        t.setCount(1000);
        Tuple2<List<byte[]>, List<BigInteger>> temp = client.selectTransaction("bank");
        for(int i = 0; i < temp.getValue1().size(); i++)
        {
            Data d = new Data();
            d.setId(i);
            d.setFromaccount("bank");
            String t1 = new String(temp.getValue1().get(i));
            // t1 = paillier.Decryption1(t1);
            d.setToaccount(t1);
            d.setAmount(temp.getValue2().get(i).intValue());
            t.data.add(d);
        }
        
        return t;
    }

    @RequestMapping("/bank2")
    public Request tableBank2(@RequestBody Transfer info){
        Request t = new Request();
        AssetClient client = AssetClient.getAssetClient();
        BigInteger temp = new BigInteger(info.money);
        if(client.transferAsset(info.company, "bank", temp) == 0)
            t.setSuccess(true);
        else
            t.setSuccess(false);
        return t;
    }

    @RequestMapping("/bank3")
    public Request tableBank3(@RequestBody Transfer info){
        Request t = new Request();
        AssetClient client = AssetClient.getAssetClient();
        BigInteger temp = new BigInteger(info.money);
        if(client.transferAsset("bank", info.company, temp) == 0)
            t.setSuccess(true);
        else 
            t.setSuccess(false);
        return t;
    }

    @RequestMapping("/car/2")
    public TableData tableCar2(){
        // Paillier paillier = Paillier.getInstance();
        AssetClient client = AssetClient.getAssetClient();
        TableData t = new TableData();
        t.setMsg("");
        t.setCount(1000);
        Tuple2<List<byte[]>, List<BigInteger>> temp = client.selectTransaction("car");
        for(int i = 0; i < temp.getValue1().size(); i++)
        {
            Data d = new Data();
            d.setId(i);
            String t1 = new String(temp.getValue1().get(i));
            // t1 = paillier.Decryption1(t1);
            d.setFromaccount("car");
            d.setToaccount(t1);
            d.setAmount(temp.getValue2().get(i).intValue());
            t.data.add(d);
        }
        
        return t;
    }

    @RequestMapping("/car/4")
    public TableData tableCar4(){
        // Paillier paillier = Paillier.getInstance();
        AssetClient client = AssetClient.getAssetClient();
        TableData t = new TableData();
        t.setMsg("");
        t.setCount(1000);
        Tuple2<List<byte[]>, List<BigInteger>> temp = client.selectTransaction1("car");
        for(int i = 0; i < temp.getValue1().size(); i++)
        {
            Data d = new Data();
            String t1 = new String(temp.getValue1().get(i));
            // t1 = paillier.Decryption1(t1);
            d.setId(i);
            d.setFromaccount(t1);
            d.setToaccount("car");
            d.setAmount(temp.getValue2().get(i).intValue());
            t.data.add(d);
        }
        
        return t;
    }

    @RequestMapping("/car2")
    public Request tableCar2(@RequestBody Transfer info){
        Request t = new Request();
        AssetClient client = AssetClient.getAssetClient();
        BigInteger temp = new BigInteger(info.money);
        if(client.transferAsset("car", info.company, temp) == 0)
            t.setSuccess(true);
        else
            t.setSuccess(false);
        return t;
    }

    @RequestMapping("/car3")
    public Request tableCar3(@RequestBody Transfer info){
        Request t = new Request();
        AssetClient client = AssetClient.getAssetClient();
        BigInteger temp = new BigInteger(info.money);
        if(client.transferAsset(info.company, "car", temp) == 0)
            t.setSuccess(true);
        else
            t.setSuccess(false);
        return t;
    }

    @RequestMapping("/tyre/2")
    public TableData tableTyre2(){
        // Paillier paillier = Paillier.getInstance();
        AssetClient client = AssetClient.getAssetClient();
        TableData t = new TableData();
        t.setMsg("");
        t.setCount(1000);
        Tuple2<List<byte[]>, List<BigInteger>> temp = client.selectTransaction("tyre");
        for(int i = 0; i < temp.getValue1().size(); i++)
        {
            Data d = new Data();
            d.setId(i);
            String t1 = new String(temp.getValue1().get(i));
            // t1 = paillier.Decryption1(t1);
            d.setFromaccount("tyre");
            d.setToaccount(t1);
            d.setAmount(temp.getValue2().get(i).intValue());
            t.data.add(d);
        }
        
        return t;
    }

    @RequestMapping("/tyre/4")
    public TableData tableTyre4(){
        // Paillier paillier = Paillier.getInstance();
        AssetClient client = AssetClient.getAssetClient();
        TableData t = new TableData();
        t.setMsg("");
        t.setCount(1000);
        Tuple2<List<byte[]>, List<BigInteger>> temp = client.selectTransaction1("tyre");
        for(int i = 0; i < temp.getValue1().size(); i++)
        {
            Data d = new Data();
            String t1 = new String(temp.getValue1().get(i));
            // t1 = paillier.Decryption1(t1);
            d.setId(i);
            d.setFromaccount(t1);
            d.setToaccount("tyre");
            d.setAmount(temp.getValue2().get(i).intValue());
            t.data.add(d);
        }
        
        return t;
    }

    @RequestMapping("/tyre2")
    public Request tableTyre2(@RequestBody Transfer info){
        Request t = new Request();
        AssetClient client = AssetClient.getAssetClient();
        BigInteger temp = new BigInteger(info.money);
        if(client.transferAsset("tyre", info.company, temp) == 0)
            t.setSuccess(true);
        else
            t.setSuccess(false);
        return t;
    }

    @RequestMapping("/tyre3")
    public Request tableTyre3(@RequestBody Transfer info){
        Request t = new Request();
        AssetClient client = AssetClient.getAssetClient();
        BigInteger temp = new BigInteger(info.money);
        if(client.transferAsset("tyre", info.company, temp) == 0)
            t.setSuccess(true);
        else
            t.setSuccess(false);
        return t;
    }

    @RequestMapping("/wheelhub/2")
    public TableData tableWheelhub2(){
        // Paillier paillier = Paillier.getInstance();
        AssetClient client = AssetClient.getAssetClient();
        TableData t = new TableData();
        t.setMsg("");
        t.setCount(1000);
        Tuple2<List<byte[]>, List<BigInteger>> temp = client.selectTransaction("wheelhub");
        for(int i = 0; i < temp.getValue1().size(); i++)
        {
            Data d = new Data();
            d.setId(i);
            String t1 = new String(temp.getValue1().get(i));
            // t1 = paillier.Decryption1(t1);
            d.setFromaccount("wheelhub");
            d.setToaccount(t1);
            d.setAmount(temp.getValue2().get(i).intValue());
            t.data.add(d);
        }
        
        return t;
    }

    @RequestMapping("/wheelhub/4")
    public TableData tableWheelhub4(){
        // Paillier paillier = Paillier.getInstance();
        AssetClient client = AssetClient.getAssetClient();
        TableData t = new TableData();
        t.setMsg("");
        t.setCount(1000);
        Tuple2<List<byte[]>, List<BigInteger>> temp = client.selectTransaction1("wheelhub");
        for(int i = 0; i < temp.getValue1().size(); i++)
        {
            Data d = new Data();
            String t1 = new String(temp.getValue1().get(i));
            // t1 = paillier.Decryption1(t1);
            d.setId(i);
            d.setFromaccount(t1);
            d.setToaccount("wheelhub");
            d.setAmount(temp.getValue2().get(i).intValue());
            t.data.add(d);
        }
        
        return t;
    }

    @RequestMapping("/wheelhub2")
    public Request tableWheel2(@RequestBody Transfer info){
        Request t = new Request();
        AssetClient client = AssetClient.getAssetClient();
        BigInteger temp = new BigInteger(info.money);
        if(client.transferAsset("wheelhub", info.company, temp) == 0)
            t.setSuccess(true);
        else
            t.setSuccess(false);
        return t;
    }

    @RequestMapping("/wheelhub3")
    public Request tableWheelhub3(@RequestBody Transfer info){
        Request t = new Request();
        AssetClient client = AssetClient.getAssetClient();
        BigInteger temp = new BigInteger(info.money);
        if(client.transferAsset("wheelhub", info.company, temp) == 0)
            t.setSuccess(true);
        else
            t.setSuccess(false);
        return t;
    }
}

