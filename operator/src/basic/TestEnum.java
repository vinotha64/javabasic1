package basic;

public class TestEnum {
	public static void main(String[] args) {
		Level level=Level.HIGH;
		System.out.println(level.getClass().getName());
		
			
			System.out.println(level.name());
			System.out.println(level.ordinal());
			System.out.println(level.LevelCode);
			System.out.println(level.getLevelCode());
		Level Levelone[]=level.values();
		for(int i=0;i<Levelone.length;i++) {
		System.out.println(Levelone);
	}

}
}
