package io.github.pengrad.openshift;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import fruitmasterbot.utils.Constants;
import spark.Request;
import spark.Response;
import spark.Route;

public class WebConsole implements Route {

	@Override
	public Object handle(Request request, Response response) throws Exception {
		StringBuilder sb = new StringBuilder();
		String timestamp = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss").format(new Date());
		sb.append("server time: "+timestamp+"<br><br>");
		//stampo statistiche in ordine inverso
		sb.append("STATISTICHE:<br>");
		File stat = new File(Constants.FILE_STATISTICHE);
		if (stat.exists()){
			Scanner sc = new Scanner(new File(Constants.FILE_STATISTICHE));
			String fileStatistiche="";
			while(sc.hasNext()){
				fileStatistiche = sc.nextLine()+"<br>"+fileStatistiche;
			}
			sc.close();
			sb.append(fileStatistiche);
		}
		return sb.toString();
	}
	
	public static boolean appendMessage(String message){
		try {
			FileWriter fw = new FileWriter(new File(Constants.FILE_STATISTICHE),true);
			String timestamp = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss").format(new Date());
			fw.append(timestamp+": "+message);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
