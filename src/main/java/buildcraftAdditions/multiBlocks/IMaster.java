package buildcraftAdditions.multiBlocks;

import net.minecraft.entity.player.EntityPlayer;
/**
 * Copyright (c) 2014, AEnterprise
 * http://buildcraftadditions.wordpress.com/
 * Buildcraft Additions is distributed under the terms of GNU GPL v3.0
 * Please check the contents of the license located in
 * http://buildcraftadditions.wordpress.com/wiki/licensing-stuff/
 */
public interface IMaster {

	public void makeMaster();

	public void sync();

	public void invalidateMultiblock();

	public void onBlockActivated(EntityPlayer player);
}