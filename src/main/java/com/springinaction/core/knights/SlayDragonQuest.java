package com.springinaction.core.knights;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest {
    private PrintStream printStream;

    public SlayDragonQuest(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void embark() {
        printStream.println("Embaking on quest to slay the dragon!");
    }
}
