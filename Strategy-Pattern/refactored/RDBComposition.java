package refactored;

import java.io.FileNotFoundException;

public class RDBComposition implements ReadDataBehavior {
	
	private ReadDataBehavior rdb;
	
	public void setReadDataBehavior(ReadDataBehavior rdb) {
		this.rdb = rdb;
	}

	public Company readData() throws FileNotFoundException {
		return this.rdb.readData();
	}
}
