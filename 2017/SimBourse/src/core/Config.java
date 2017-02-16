package core;

public class Config {
	private static Config instance = new Config();

	public final int SOLDE_EUROS_INIT = 1000;
	public final int SOLDE_ACTIONS_INIT = 100;
	public final int PORT = 23456; //23456 ou 80
	public final int TEMPS_PARTIE = 10;//en minutes
	public final int PACKET_SIZE = 8;
	public final boolean BANQUE = true;
	
	private Config (){
		
	}
	
	public static Config getInstance() {
		return instance;
	}
}