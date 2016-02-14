/**
 * ABattle, a xbattle conversion for java, Copyright by Roland Spatzenegger (2011-)
 */
package test;

import java.util.Collection;

/**
 * The Interface Game.
 *
 * @param
 * 			<P>
 *            the generic type
 * @param <C> the generic type
 * @author cymric
 */
public interface Game<P extends Player> extends IDElement {

	/**
	 * Gets the players.
	 *
	 * @return the players
	 */
	Collection<P> getPlayers();

	// 666
	void addPlayer(P player) throws BaseException;

}
