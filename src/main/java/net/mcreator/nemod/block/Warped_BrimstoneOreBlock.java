
package net.mcreator.nemod.block;

import net.minecraft.block.material.Material;

@NeModModElements.ModElement.Tag
public class Warped_BrimstoneOreBlock extends NeModModElements.ModElement {

	@ObjectHolder("ne_mod:warped_brimstone_ore")
	public static final Block block = null;

	public Warped_BrimstoneOreBlock(NeModModElements instance) {
		super(instance, 56);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(

					Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(3f, 5f).lightValue(0).harvestLevel(2)
							.harvestTool(ToolType.PICKAXE));

			setRegistryName("warped_brimstone_ore");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(Warped_BrimstoneIngotItem.block, (int) (1)));
		}

	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		for (Biome biome : ForgeRegistries.BIOMES.getValues()) {

			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, new OreFeature(OreFeatureConfig::deserialize) {
				@Override
				public boolean place(IWorld world, ChunkGenerator generator, Random rand, BlockPos pos, OreFeatureConfig config) {
					DimensionType dimensionType = world.getDimension().getType();
					boolean dimensionCriteria = false;

					if (dimensionType == DimensionType.OVERWORLD)
						dimensionCriteria = true;

					if (!dimensionCriteria)
						return false;

					return super.place(world, generator, rand, pos, config);
				}
			}.withConfiguration(
					new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("warped_brimstone_ore", "warped_brimstone_ore", blockAt -> {
						boolean blockCriteria = false;
						if (blockAt.getBlock() == Blocks.STONE.getDefaultState().getBlock())
							blockCriteria = true;
						return blockCriteria;
					}), block.getDefaultState(), 7)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(11, 1, 1, 63))));
		}
	}

}
