
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hbm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.hbm.HbmMod;

public class HbmModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, HbmMod.MODID);
	public static final RegistryObject<PaintingVariant> LOGO = REGISTRY.register("logo", () -> new PaintingVariant(16, 16));
}
