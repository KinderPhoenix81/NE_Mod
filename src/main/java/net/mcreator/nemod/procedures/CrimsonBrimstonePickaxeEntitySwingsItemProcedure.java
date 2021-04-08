package net.mcreator.nemod.procedures;

@NeModModElements.ModElement.Tag
public class CrimsonBrimstonePickaxeEntitySwingsItemProcedure extends NeModModElements.ModElement {

	public CrimsonBrimstonePickaxeEntitySwingsItemProcedure(NeModModElements instance) {
		super(instance, 40);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure CrimsonBrimstonePickaxeEntitySwingsItem!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure CrimsonBrimstonePickaxeEntitySwingsItem!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure CrimsonBrimstonePickaxeEntitySwingsItem!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure CrimsonBrimstonePickaxeEntitySwingsItem!");
			return;
		}

		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");

		world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);

	}

}
