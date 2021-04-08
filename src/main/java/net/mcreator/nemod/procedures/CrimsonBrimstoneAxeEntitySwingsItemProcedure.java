package net.mcreator.nemod.procedures;

import net.minecraft.util.Hand;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.nemod.NeModModElements;

import java.util.Map;

@NeModModElements.ModElement.Tag
public class CrimsonBrimstoneAxeEntitySwingsItemProcedure extends NeModModElements.ModElement {
	public CrimsonBrimstoneAxeEntitySwingsItemProcedure(NeModModElements instance) {
		super(instance, 42);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure CrimsonBrimstoneAxeEntitySwingsItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
		}
	}
}
