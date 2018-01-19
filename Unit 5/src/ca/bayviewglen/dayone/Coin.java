package ca.bayviewglen.dayone;

public class Coin {
	private String face;
	//the state of the object is defined by its instance vairbales 

	public Coin(){
		flip();
	}
	
	public String getFace() {
		return face;
	}

	public void setFace(String face) {
		//this is accessing the instance variable face 
		this.face = face;
	}
	
	public void flip(){
		if (1 == (int) (Math.random() * 2))
			face = "heads";
		else 
			face = "tails";
	}
	
	public boolean isHeads(){
		return face.equals("heads");
	}
	
	//the toString method is defined by default in the java Object class
	//this means when you do system.println it will call this class
	//
	public String toString(){
		return face;
	}
	
}