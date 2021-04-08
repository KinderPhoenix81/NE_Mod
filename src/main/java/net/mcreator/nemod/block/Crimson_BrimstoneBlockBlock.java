
package net.mcreator.nemod.block;

import net.minecraft.block.material.Material;

@NeModModElements.ModElement.Tag
public class Crimson_BrimstoneBlockBlock extends NeModModElements.ModElement {

	@ObjectHolder("ne_mod:crimson_brimstone_block")
	public static final Block block = null;

	public Crimson_BrimstoneBlockBlock(NeModModElements instance) {
		super(instance, 19);

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

					Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(5f, 10f).lightValue(0).harvestLevel(2)
							.harvestTool(ToolType.PICKAXE));

			setRegistryName("crimson_brimstone_block");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
