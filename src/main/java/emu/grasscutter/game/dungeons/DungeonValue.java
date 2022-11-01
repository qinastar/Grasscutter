package emu.grasscutter.game.dungeons;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface DungeonValue {
    DungeonPassConditionType value();
}
