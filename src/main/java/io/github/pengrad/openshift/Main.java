package io.github.pengrad.openshift;

import spark.Request;
import spark.Response;
import spark.Route;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        ipAddress(args[0]);
        port(Integer.parseInt(args[1]));
        new RefreshBot();
        // Bot handler
        post("/myfmb", new FruitMasterBot()); 

        // simple string by GET
        get("/hello", new PrintResponse("Hello World"));
        get("/webconsole", new WebConsole()); 
//        get("/lgb_maintenance_on", new FruitMasterBotMaintenanceOff());
//        get("/lgb_maintenance_off", new FruitMasterBotMaintenanceOff()); 

        // GET/POST handler
        post("/test", new PrintResponse("yes, this is a test"));
        get("/test", new PrintResponse("yes, this is a test"));
    }



    private static class PrintResponse implements Route {
    	private String message;
    	public PrintResponse(String test){
    		this.message = test;
    	}
        @Override
        public Object handle(Request request, Response response) throws Exception {
            return (message==null||message.equals(""))?"ok, test":message;
        }
    }
}
