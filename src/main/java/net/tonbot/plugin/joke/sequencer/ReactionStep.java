package net.tonbot.plugin.joke.sequencer;

import lombok.Data;
import lombok.NonNull;

@Data
class ReactionStep<T> {

	@NonNull
	private final EventListener<T> eventListener;

	@NonNull
	private final Reaction<T> reaction;
}
