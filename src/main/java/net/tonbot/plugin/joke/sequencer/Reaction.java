package net.tonbot.plugin.joke.sequencer;

@FunctionalInterface
public interface Reaction<T> {

	/**
	 * Performs an action on some input object.
	 * 
	 * @param input
	 *            The input <T>.
	 */
	abstract void perform(T input);
}
