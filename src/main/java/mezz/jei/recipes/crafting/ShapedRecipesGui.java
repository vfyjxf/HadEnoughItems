package mezz.jei.recipes.crafting;

import mezz.jei.api.gui.IGuiItemStacks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ShapedRecipes;

import javax.annotation.Nonnull;

public class ShapedRecipesGui extends CraftingRecipeGui {

	@Override
	public void setItemsFromRecipe(@Nonnull IGuiItemStacks guiItemStacks, @Nonnull Object recipe, ItemStack focusStack) {
		ShapedRecipes shapedRecipe = (ShapedRecipes)recipe;

		setInput(guiItemStacks, shapedRecipe.recipeItems, focusStack, shapedRecipe.recipeWidth, shapedRecipe.recipeHeight);
		setOutput(guiItemStacks, shapedRecipe.getRecipeOutput());
	}
}