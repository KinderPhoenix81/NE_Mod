
package net.mcreator.nemod.block;

import net.minecraft.block.material.Material;

@NeModModElements.ModElement.Tag
public class QuantumdirtBlock extends NeModModElements.ModElement {

	@ObjectHolder("ne_mod:quantumdirt")
	public static final Block block = null;

	public QuantumdirtBlock(NeModModElements instance) {
		super(instance, 17);

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

					Block.Properties.create(Material.ROCK).sound(SoundType.GROUND).hardnessAndResistance(1f, 10f).lightValue(0));

			setRegistryName("quantumdirt");
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
