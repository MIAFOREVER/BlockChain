package org.fisco.bcos;

import java.math.BigInteger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.fisco.bcos.asset.client.AssetClient;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        AssetClient client = AssetClient.getAssetClient();
        client.initialize();
        client.deployAssetAndRecordAddr();
        client.registerAssetAccount("bank", new BigInteger("0"));
        client.registerAssetAccount("car", new BigInteger("200000"));
        client.registerAssetAccount("wheelhub", new BigInteger("0"));
        client.registerAssetAccount("tyre", new BigInteger("0"));
        SpringApplication.run(Application.class, args);
    }
}