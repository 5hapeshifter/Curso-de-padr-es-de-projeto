package br.com.cod3r.singleton.connectionPool.after.conn;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
	/*
	O fato de o atributo "singleton" estar marcado como static, permite que ele seja instanciado somente
	uma vez, tendo em vista que ele está associado a classe
	 */
	private static final ConnectionPool singleton = new ConnectionPool();
	public final static int POOL_SIZE = 2;
	private List<Connection> connectionsPool;
	
	public static ConnectionPool getInstance() {
		return singleton;
	}

	/*
	QUANDO DEFINIMOS O CONSTRUTOR COMO PRIVADO, ELE SÓ PODERÁ SER ACESSADO DENTRO DA PRÓPRIA CLASSE
	 */
	private ConnectionPool() {
		System.out.println("Creating Connection Pool");
		connectionsPool = new ArrayList<Connection>();
		for(int i = 0; i < POOL_SIZE; i++) {
			connectionsPool.add(new Connection());
		}
	}
	
	public Connection getConnection() {
		Connection avaiable = null;
		for(Connection conn: connectionsPool) {
			if(!conn.isInUse()) {
				avaiable = conn;
				break;
			}
		}
		if(avaiable == null) {
			System.out.println("No Connections avaiable");
			return null;
		}
		avaiable.setInUse(true);
		return avaiable;
	}
	
	public void leaveConnection(Connection conn) {
		conn.setInUse(false);
	}
}
