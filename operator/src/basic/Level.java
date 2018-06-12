package basic;

public enum Level {
	HIGH(1),
	MEDIUM(2),
	LOW(3);
  int LevelCode;
private Level(int LevelCode) {
	this.LevelCode=LevelCode; 
	
}
public int getLevelCode() {
	return this. LevelCode;
}
}
