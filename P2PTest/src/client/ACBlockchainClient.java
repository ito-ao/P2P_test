package client;

import java.util.Date;
import java.util.HashMap;

import server.ServerInfo;

public class ACBlockchainClient {
	public static void main(String[] args) {
		System.out.println("iii");
//        if (args.length != 3) {
//        	System.out.println(
//        			"第一引数:送信元ポート番号"
//        			+ "\n"
//        			+ "第二引数:送信先ポート番号"
//        			+ "\n"
//        			+ "第三引数:送信先IPアドレス"
//        			+ "\n"
//        			+ "が想定されています。");
//        	return;
//        }

        int localPort = 8883;
        int remotePort = 8883;
        String remoteHost = "192.168.50.163";

        try {
//            localPort = Integer.parseInt(args[0]);
//            remoteHost = args[1];
//            remotePort = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
        	System.out.println("フォーマットエラー");
            return;
        }

        HashMap<ServerInfo, Date> serverStatus = new HashMap<ServerInfo, Date>();
        serverStatus.put(new ServerInfo(remoteHost, remotePort), new Date());

	}
}
