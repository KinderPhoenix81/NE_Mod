package net.mcreator.nemod.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.nemod.NeModModElements;

import java.util.Map;

@NeModModElements.ModElement.Tag
public class WarpedBrimstonePickaxeLivingEntityIsHitWithToolProcedure extends NeModModElements.ModElement {
	public WarpedBrimstonePickaxeLivingEntityIsHitWithToolProcedure(NeModModElements instance) {
		super(instance, 111);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure WarpedBrimstonePickaxeLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 5);
	}
}
