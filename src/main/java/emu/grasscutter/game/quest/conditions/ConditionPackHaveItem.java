package emu.grasscutter.game.quest.conditions;

import emu.grasscutter.data.excels.QuestData;
import emu.grasscutter.game.quest.GameQuest;
import emu.grasscutter.game.quest.QuestValue;
import emu.grasscutter.game.quest.enums.QuestTrigger;
import emu.grasscutter.game.quest.handlers.QuestBaseHandler;

@QuestValue(QuestTrigger.QUEST_COND_PACK_HAVE_ITEM)
public class ConditionPackHaveItem extends QuestBaseHandler {

    @Override
    public boolean execute(GameQuest quest, QuestData.QuestCondition condition, String paramStr, int... params) {
        var checkItem = quest.getOwner().getInventory().getItemByGuid(condition.getParam()[0]);
        return checkItem != null && checkItem.getCount() >= condition.getParam()[1];
    }

}
