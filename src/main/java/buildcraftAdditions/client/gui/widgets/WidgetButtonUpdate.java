package buildcraftAdditions.client.gui.widgets;

import net.minecraft.util.ResourceLocation;

import buildcraftAdditions.client.gui.GuiBase;

/**
 * Copyright (c) 2014-2015, AEnterprise
 * http://buildcraftadditions.wordpress.com/
 * Buildcraft Additions is distributed under the terms of GNU GPL v3.0
 * Please check the contents of the license located in
 * http://buildcraftadditions.wordpress.com/wiki/licensing-stuff/
 */
public class WidgetButtonUpdate extends WidgetBase {

	protected boolean active = false;

	public WidgetButtonUpdate(int id, int x, int y, int u, int v, int width, int height, GuiBase gui) {
		super(id, x, y, u, v, width, height, gui, "");
	}

	public WidgetButtonUpdate(int id, int x, int y, int u, int v, int width, int height, GuiBase gui, String... textures) {
		super(id, x, y, u, v, width, height, gui, textures);
	}

	public WidgetButtonUpdate(int id, int x, int y, int u, int v, int width, int height, GuiBase gui, ResourceLocation... textures) {
		super(id, x, y, u, v, width, height, gui, textures);
	}

	public WidgetButtonUpdate(int id, int x, int y, int u, int v, int width, int height, GuiBase gui, int value, ResourceLocation... textures) {
		super(id, x, y, u, v, width, height, gui, value, textures);
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean getIsActive() {
		return active;
	}

	@Override
	public void render(int mouseX, int mouseY) {
		if (textures[textureIndex] != null)
			gui.bindTexture(textures[textureIndex]);
		gui.drawTexturedModalRect(x, y, u, active ? v + height : v, width, height);
	}

	@Override
	public void onWidgetClicked(int x, int y, int button) {
		if (active)
			return;
		active = true;
		super.onWidgetClicked(x, y, button);
	}
}
