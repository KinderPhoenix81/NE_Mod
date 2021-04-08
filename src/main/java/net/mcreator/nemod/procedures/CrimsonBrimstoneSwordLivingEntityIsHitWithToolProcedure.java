package net.mcreator.nemod.procedures;

@NeModModElements.ModElement.Tag
public class CrimsonBrimstoneSwordLivingEntityIsHitWithToolProcedure extends NeModModElements.ModElement {

	public CrimsonBrimstoneSwordLivingEntityIsHitWithToolProcedure(NeModModElements instance) {
		super(instance, 44);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure CrimsonBrimstoneSwordLivingEntityIsHitWithTool!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		entity.attackEntityFrom(DamageSource.GENERIC, (float) 6);

	}

}
