package src.da.agar;

public interface Consumable
{
	/**
	 * Get the amount of points this Consumable is worth
	 * @return the amount of points this Consumable is worth
	 */
	public int getValue();

	/**
	 * consume the current Consumable.  
	 * @return the amount of points the Consumable is worth
	 */
	public int consume();
}
