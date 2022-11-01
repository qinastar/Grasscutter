package emu.grasscutter.data.excels;

import emu.grasscutter.data.GameResource;
import emu.grasscutter.data.ResourceType;

import emu.grasscutter.game.dungeons.DungeonPassConditionType;
import emu.grasscutter.game.quest.enums.LogicType;
import lombok.Getter;

import java.util.List;

@ResourceType(name = "DungeonPassExcelConfigData.json")
public class DungeonPassConfigData extends GameResource {
	@Getter private int id;
    @Getter private LogicType logicType;
    @Getter private List<DungeonPassCondition> conds;

    public static class DungeonPassCondition{
        @Getter private DungeonPassConditionType condType;
        @Getter int[] param;
    }
}
