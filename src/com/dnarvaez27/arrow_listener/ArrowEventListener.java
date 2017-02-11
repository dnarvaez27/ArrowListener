package com.dnarvaez27.arrow_listener;

/**
 * Interface that cooperates with {@link ArrowListener}
 * 
 * @author d.narvaez11
 */
public interface ArrowEventListener
{
	/**
	 * Invoked when an arrow event from {@link ArrowListener} occurs<br>
	 * 
	 * @see {@link ArrowListener#getArrow() }<br>
	 *      {@link ArrowListener#getArrowValue()}
	 */
	public void onArrowEvent( );
}