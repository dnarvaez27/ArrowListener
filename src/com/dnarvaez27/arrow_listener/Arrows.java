package com.dnarvaez27.arrow_listener;

public enum Arrows
{
	/**
	 * Represents the Default value for Arrow Events
	 */
	DEFAULT( 0, "Default" ),

	/**
	 * Represents the Down arrow event
	 */
	DOWN( 4, "Down" ),

	/**
	 * Represents the Left arrow event
	 */
	LEFT( 1, "Left" ),

	/**
	 * Reoresents the Right arrow event
	 */
	RIGHT( 3, "Right" ),

	/**
	 * Represents the Up arrow event
	 */
	UP( 2, "Up" );

	/**
	 * String value of the arrow enum. <br>
	 * The direction of the arrow
	 */
	private String stringValue;

	/**
	 * Int value especified for the Arrow enum
	 */
	private int val;

	/**
	 * Constucts an Arrow Constant with an especific value
	 *
	 * @param val Value associated with the constant
	 */
	private Arrows( int val, String stringValue )
	{
		this.val = val;
		this.stringValue = stringValue;
	}

	/**
	 * Compares to Arrows Enums by value
	 *
	 * @param arrow Arrows Enum to compare
	 * @return True if the value is the same, False if it is not
	 */
	public boolean equals( Arrows arrow )
	{
		return val == arrow.val;
	}

	/**
	 * Returns the value especified for the constant
	 *
	 * @return
	 */
	public int getValue( )
	{
		return val;
	}

	@Override
	public String toString( )
	{
		return stringValue;
	}
}