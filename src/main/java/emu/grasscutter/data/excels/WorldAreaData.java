package emu.grasscutter.data.excels;

import emu.grasscutter.data.GameResource;
import emu.grasscutter.data.ResourceType;
import emu.grasscutter.game.props.ElementType;

@ResourceType(name = "WorldAreaConfigData.json")
public class WorldAreaData extends GameResource {
	private int id;
	private int areaID1;
	private int areaID2;
	private int sceneID;
	private ElementType elementType;

	@Override
	public int getId() {
		return (this.areaID2 << 16) + this.areaID1;
	}

	public int getSceneID() {
		return this.sceneID;
	}

	public ElementType getElementType() {
		return this.elementType;
	}

	@Override
	public void onLoad() {

	}
}
