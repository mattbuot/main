package seedu.address.logic.commands;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static seedu.address.logic.commands.GameCommand.SHOWING_GAME_MESSAGE;

import org.junit.Rule;
import org.junit.Test;

import seedu.address.commons.events.ui.GameEvent;
import seedu.address.ui.testutil.EventsCollectorRule;

//@@author ncaminh-unused
public class GameCommandTest {
    @Rule
    public final EventsCollectorRule eventsCollectorRule = new EventsCollectorRule();

    @Test
    public void execute_game_success() {
        CommandResult result = new GameCommand().execute();
        assertEquals(SHOWING_GAME_MESSAGE, result.feedbackToUser);
        assertTrue(eventsCollectorRule.eventsCollector.getMostRecent() instanceof GameEvent);
        assertTrue(eventsCollectorRule.eventsCollector.getSize() == 1);
    }
}
