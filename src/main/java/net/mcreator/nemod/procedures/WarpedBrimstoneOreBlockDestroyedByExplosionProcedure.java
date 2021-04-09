package net.mcreator.nemod.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Block;

import net.mcreator.nemod.NeModModElements;

import java.util.Map;

@NeModModElements.ModElement.Tag
public class WarpedBrimstoneOreBlockDestroyedByExplosionProcedure extends NeModModElements.ModElement {
	public WarpedBrimstoneOreBlockDestroyedByExplosionProcedure(NeModModElements instance) {
		super(instance, 106);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				System.err.println("Failed to load dependency x for procedure WarpedBrimstoneOreBlockDestroyedByExplosion!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				System.err.println("Failed to load dependency y for procedure WarpedBrimstoneOreBlockDestroyedByExplosion!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				System.err.println("Failed to load dependency z for procedure WarpedBrimstoneOreBlockDestroyedByExplosion!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure WarpedBrimstoneOreBlockDestroyedByExplosion!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), world.getWorld(), new BlockPos((int) x, (int) y, (int) z));
		world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
	}
}
