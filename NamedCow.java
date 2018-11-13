class NamedCow extends Cow
{
	NamedCow(String type, String name, String sound){
		myName = name;
		myType = type;
		mySound = sound;
	}
	public String getName(){return myName;}
}
