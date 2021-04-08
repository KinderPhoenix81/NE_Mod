package net.mcreator.nemod.procedures;

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
