package net.mcreator.nemod.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.nemod.NeModModElements;

import java.util.Map;

@NeModModElements.ModElement.Tag
public class WarpedBrimstoneHoeLivingEntityIsHitWithToolProcedure extends NeModModElements.ModElement {
	public WarpedBrimstoneHoeLivingEntityIsHitWithToolProcedure(NeModModElements instance) {
		super(instance, 119);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure WarpedBrimstoneHoeLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 4);
	}
}
