package net.mcreator.nemod.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.nemod.item.Crimson_BrimstoneArmorItem;
import net.mcreator.nemod.NeModModElements;

import java.util.Map;

@NeModModElements.ModElement.Tag
public class CrimsonBrimstoneArmorHelmetTickEventProcedure extends NeModModElements.ModElement {
	public CrimsonBrimstoneArmorHelmetTickEventProcedure(NeModModElements instance) {
		super(instance, 81);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure CrimsonBrimstoneArmorHelmetTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			((PlayerEntity) entity).inventory.armorInventory.set((int) 0, new ItemStack(Crimson_BrimstoneArmorItem.helmet, (int) (1)));
			if (entity instanceof ServerPlayerEntity)
				((ServerPlayerEntity) entity).inventory.markDirty();
		}
		/* @ItemStack */
	}
}
