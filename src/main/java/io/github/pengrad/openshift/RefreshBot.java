package io.github.pengrad.openshift;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.TelegramBotAdapter;

public class RefreshBot {
	public RefreshBot(){
		//refresh librogamebot
		TelegramBot bot = TelegramBotAdapter.buildDebug(FruitMasterBot.BOT_TOKEN);
		bot.setWebhook(FruitMasterBot.WEB_HOOK);
	}
	
	public static void main (String[]args){
		new RefreshBot();
	}
}
