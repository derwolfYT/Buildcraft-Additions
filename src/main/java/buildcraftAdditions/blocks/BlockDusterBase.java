package buildcraftAdditions.blocks;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import buildcraftAdditions.tileEntities.Bases.TileBaseDuster;
import buildcraftAdditions.utils.Utils;

/**
 * Copyright (c) 2014-2015, AEnterprise
 * http://buildcraftadditions.wordpress.com/
 * Buildcraft Additions is distributed under the terms of GNU GPL v3.0
 * Please check the contents of the license located in
 * http://buildcraftadditions.wordpress.com/wiki/licensing-stuff/
 */
public abstract class BlockDusterBase extends BlockBase {

	protected final String type;

	public BlockDusterBase(String type) {
		super("blockDuster" + type);
		this.type = type;
	}

	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack) {
		world.setBlockMetadataWithNotify(x, y, z, Utils.get2dOrientation(entity).getOpposite().ordinal(), 3);
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
		if (player.isSneaking())
			return false;
		TileEntity tile = world.getTileEntity(x, y, z);
		if (tile != null && tile instanceof TileBaseDuster) {
			TileBaseDuster duster = (TileBaseDuster) tile;
			if (duster.getStackInSlot(0) == null && player.getCurrentEquippedItem() != null) {
				ItemStack stack = player.getCurrentEquippedItem().copy();
				stack.stackSize = 1;
				duster.setInventorySlotContents(0, stack);
				player.getCurrentEquippedItem().stackSize--;
				if (player.getCurrentEquippedItem().stackSize <= 0)
					player.setCurrentItemOrArmor(0, null);
			} else if (duster.getStackInSlot(0) != null) {
				if (!world.isRemote)
					Utils.dropItemstack(world, x, y, z, duster.getStackInSlot(0));
				duster.setInventorySlotContents(0, null);
			}
		}
		return true;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}
}
