package fruitmasterbot.utils;

import com.pengrad.telegrambot.model.Message;

/**
 * classe che contiene le stringhe di comunicazione con l'utente. 
 * Deve essere inizializzata ogni volta che si richiama un metodo che presente comunicazioni con il chiamante
 * @author Firebone
 */
public class Lang {

	public String PLAY_SINGLE_1_MESSAGE = "gioca";
	public String START_MESSAGE = "Benvenuto, sono FruitMaster bot. Sono la versione fruttolosa del classico gioco \"MasterMind\"\nSegui le istruzioni sottostanti per muoverti.";
	public String MAINTENANCE_MESSAGE = "scusa, sono in manutenzione. Saro' di nuovo attivo tra poco. A piu' tardi!";
	public String SORRY_MESSAGE = "Scusa ma preferirei dei frutti (es. aaaa)";
	public String WIP_MESSAGE = "Scusa ma al momento questa funzione non e' disponibile, riprova piu' tardi.\nGrazie";
	public String HELP_MESSAGE = "aiuto";
	public String CONTACT_US = "contatta il mio creatore";
	public String TEXT_MENU_1 = "Scegli un'opzione dal menu";
	public String GENERATE_FRUIT_MIX_MESSAGE = "Sto generando il mix di frutti segreto da indovinare..";
	public String END_FRUIT_MIX_P1_MESSAGE = "Fatto! Adesso a te il compito di indovinarlo. Hai ";
	public String END_FRUIT_MIX_P2_MESSAGE = " tentativi a disposizione.\nBuona fortuna!";
	public String TRY_NR = "Tentativo n.";
	public String WIN_MESSAGE = "gioco terminato! Hai Vinto!";
	public String RETRY_MESSAGE = "gioco terminato! Hai terminato il numero di tentativi.\nRitenta!";
	public String E001_GAME_NOT_EXISTS = "la partita non esiste. Contattare @firebone";
	public String E002_NO_INPUT_VALID = "Input non valido ";
	public String E003_COMBO_NULL = "combo null";
	public String E000_GENERIC_ERROR = "si e' verificato un errore. Contattare @firebone";
	public Lang(Message message){
		
	}
}
