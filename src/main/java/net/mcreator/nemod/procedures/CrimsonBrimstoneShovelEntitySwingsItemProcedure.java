package net.mcreator.nemod.procedures;

@NeModModElements.ModElement.Tag
public class CrimsonBrimstoneShovelEntitySwingsItemProcedure extends NeModModElements.ModElement {

	public CrimsonBrimstoneShovelEntitySwingsItemProcedure(NeModModElements instance) {
		super(instance, 50);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure CrimsonBrimstoneShovelEntitySwingsItem!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
		}

	}

}
