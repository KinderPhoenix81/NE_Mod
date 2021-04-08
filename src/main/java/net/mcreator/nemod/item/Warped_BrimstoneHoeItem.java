
package net.mcreator.nemod.item;

@NeModModElements.ModElement.Tag
public class Warped_BrimstoneHoeItem extends NeModModElements.ModElement {

	@ObjectHolder("ne_mod:warped_brimstone_hoe")
	public static final Item block = null;

	public Warped_BrimstoneHoeItem(NeModModElements instance) {
		super(instance, 65);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Warped_BrimstoneIngotItem.block, (int) (1)));
			}
		}, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("warped_brimstone_hoe"));
	}

}
