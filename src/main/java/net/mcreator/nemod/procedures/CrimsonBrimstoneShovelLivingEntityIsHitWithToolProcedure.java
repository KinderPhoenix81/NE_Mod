package net.mcreator.nemod.procedures;

@NeModModElements.ModElement.Tag
public class CrimsonBrimstoneShovelLivingEntityIsHitWithToolProcedure extends NeModModElements.ModElement {

	public CrimsonBrimstoneShovelLivingEntityIsHitWithToolProcedure(NeModModElements instance) {
		super(instance, 49);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure CrimsonBrimstoneShovelLivingEntityIsHitWithTool!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		entity.attackEntityFrom(DamageSource.GENERIC, (float) 4);

	}

}
