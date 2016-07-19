package StrategyPattern.example;

public class GameCharacter {
	
	//접근
	private Weapon weapon;
	
	//교환 기능
	public void setWeapon(Weapon weapon){
		this.weapon = weapon;
	}
	
	public void attack(){
		if(weapon == null){
			System.out.println("맨손 공격");
		}else{
			weapon.attack();
		}
		
	}

}
