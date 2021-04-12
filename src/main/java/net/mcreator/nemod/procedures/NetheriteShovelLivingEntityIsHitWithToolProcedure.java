package net.mcreator.nemod.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.nemod.NeModModElements;

import java.util.Map;

@NeModModElements.ModElement.Tag
public class NetheriteShovelLivingEntityIsHitWithToolProcedure extends NeModModElements.ModElement {
	public NetheriteShovelLivingEntityIsHitWithToolProcedure(NeModModElements instance) {
		super(instance, 188);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure NetheriteShovelLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 5);
	}
}
