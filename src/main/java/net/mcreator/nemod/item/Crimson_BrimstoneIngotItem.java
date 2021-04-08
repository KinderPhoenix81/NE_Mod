
package net.mcreator.nemod.item;

@NeModModElements.ModElement.Tag
public class Crimson_BrimstoneIngotItem extends NeModModElements.ModElement {

	@ObjectHolder("ne_mod:crimson_brimstone_ingot")
	public static final Item block = null;

	public Crimson_BrimstoneIngotItem(NeModModElements instance) {
		super(instance, 17);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.BUILDING_BLOCKS).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("crimson_brimstone_ingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

	}

}
