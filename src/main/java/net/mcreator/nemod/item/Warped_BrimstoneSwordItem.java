
package net.mcreator.nemod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.nemod.NeModModElements;

@NeModModElements.ModElement.Tag
public class Warped_BrimstoneSwordItem extends NeModModElements.ModElement {
	@ObjectHolder("ne_mod:warped_brimstone_sword")
	public static final Item block = null;
	public Warped_BrimstoneSwordItem(NeModModElements instance) {
		super(instance, 92);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
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
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("warped_brimstone_sword"));
	}
}
