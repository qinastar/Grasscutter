package emu.grasscutter.game.quest.exec;

import emu.grasscutter.data.excels.QuestData;
import emu.grasscutter.game.quest.GameQuest;
import emu.grasscutter.game.quest.QuestValue;
import emu.grasscutter.game.quest.enums.QuestTrigger;
import emu.grasscutter.game.quest.handlers.QuestExecHandler;

@QuestValue(QuestTrigger.QUEST_EXEC_DEL_PACK_ITEM)
public class ExecDelPackItem extends QuestExecHandler {
    @Override
    public boolean execute(GameQuest quest, QuestData.QuestExecParam condition, String... paramStr) {
        int itemId = Integer.parseInt(paramStr[0]);
        int amount = Integer.parseInt(paramStr[1]);
        return quest.getOwner().getInventory().removeItem(itemId, amount);
    }
}
