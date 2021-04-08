package net.mcreator.nemod.procedures;

@NeModModElements.ModElement.Tag
public class CrimsonBrimstonePickaxeLivingEntityIsHitWithToolProcedure extends NeModModElements.ModElement {

	public CrimsonBrimstonePickaxeLivingEntityIsHitWithToolProcedure(NeModModElements instance) {
		super(instance, 39);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure CrimsonBrimstonePickaxeLivingEntityIsHitWithTool!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		entity.attackEntityFrom(DamageSource.GENERIC, (float) 5);

	}

}
