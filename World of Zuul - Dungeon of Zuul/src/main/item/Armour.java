package main.item;

public class Armour extends Item
{
	private int armor;
	
	public Armour(String name, int armor) // Constructor
	{
		super(name, 0);
		this.armor = armor;
	}

	public int getArmour() // Get the category of an item, the category makes sure you can't pick up more than one of each
	{
		return armor;
	}
}