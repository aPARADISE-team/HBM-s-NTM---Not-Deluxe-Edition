
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hbm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.hbm.block.ABC123Block;
import net.mcreator.hbm.HbmMod;

public class HbmModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, HbmMod.MODID);
	public static final RegistryObject<Block> ABC_123 = REGISTRY.register("abc_123", () -> new ABC123Block());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
