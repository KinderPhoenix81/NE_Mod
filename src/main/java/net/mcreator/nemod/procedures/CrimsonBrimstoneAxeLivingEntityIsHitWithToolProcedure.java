package net.mcreator.nemod.procedures;

@NeModModElements.ModElement.Tag
public class CrimsonBrimstoneAxeLivingEntityIsHitWithToolProcedure extends NeModModElements.ModElement {

	public CrimsonBrimstoneAxeLivingEntityIsHitWithToolProcedure(NeModModElements instance) {
		super(instance, 41);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure CrimsonBrimstoneAxeLivingEntityIsHitWithTool!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		entity.attackEntityFrom(DamageSource.GENERIC, (float) 7);

	}

}
