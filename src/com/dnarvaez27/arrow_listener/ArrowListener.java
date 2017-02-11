package com.dnarvaez27.arrow_listener;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;

/**
 * Listener class used for arrow events.<br>
 * This class must be instanciated to be used.<br>
 * Cannot be extended or implemented
 *
 * @author d.narvaez11
 */
public final class ArrowListener implements KeyEventDispatcher
{
	/**
	 * Number playing as an arrow event
	 * <ul>
	 * <li>1: Left
	 * <li>2: Up
	 * <li>3: Right
	 * <li>4: Down
	 * </ul>
	 * Use constants provided in this class for better practices
	 */
	private Arrows arrow;

	/**
	 * Provided interface for method call
	 */
	private ArrowEventListener arrowEventListener;

	/**
	 * Constructs an ArrowListener for Arrow key event
	 *
	 * @param arrowEventListener class implementing {@link ArrowEventListener}
	 * @see #getArrow()
	 */
	public ArrowListener( ArrowEventListener arrowEventListener )
	{
		this.arrowEventListener = arrowEventListener;
		arrow = Arrows.DEFAULT;
		setKeyEventDispatcher( );
	}

	@Override
	public boolean dispatchKeyEvent( KeyEvent e )
	{
		boolean perform = false;
		if( e.getID( ) == KeyEvent.KEY_PRESSED )
		{
			int key = e.getKeyCode( );

			if( key == KeyEvent.VK_LEFT )
			{
				arrow = Arrows.LEFT;
				perform = true;
			}
			else if( key == KeyEvent.VK_UP )
			{
				arrow = Arrows.UP;
				perform = true;
			}
			else if( key == KeyEvent.VK_RIGHT )
			{
				arrow = Arrows.RIGHT;
				perform = true;
			}
			else if( key == KeyEvent.VK_DOWN )
			{
				arrow = Arrows.DOWN;
				perform = true;
			}
		}
		if( perform )
		{
			arrowEventListener.onArrowEvent( );
		}

		return false;
	}

	/**
	 * Returns the last arrow pressed.
	 * <ul>
	 * <li>{@link Arrows#DEFAULT}
	 * <lI>{@link Arrows#LEFT}
	 * <li>{@link Arrows#UP}
	 * <li>{@link Arrows#RIGHT}
	 * <li>{@link Arrows#DOWN}
	 *
	 * @return The enum Arrow that caused the event
	 */
	public Arrows getArrow( )
	{
		return arrow;
	}

	/**
	 * Sets the arrow event to the arrow passed by argument
	 *
	 * @param arrow Arrow value to be set. Use contanst
	 */
	public void setArrow( Arrows arrow )
	{
		this.arrow = arrow;
		arrowEventListener.onArrowEvent( );
	}

	/**
	 * Private mehtod for adding the KeyEventDispatcher to the KeyboardFocusManager
	 *
	 * @see {@link KeyboardFocusManager}<br>
	 *      {@link KeyEventDispatcher}
	 */
	private void setKeyEventDispatcher( )
	{
		KeyboardFocusManager.getCurrentKeyboardFocusManager( ).addKeyEventDispatcher( this );
	}
}