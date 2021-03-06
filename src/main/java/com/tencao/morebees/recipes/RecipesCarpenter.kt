package com.tencao.morebees.recipes

import com.tencao.morebees.MBItems
import com.tencao.morebees.util.OreDictUtil
import forestry.api.recipes.RecipeManagers
import forestry.apiculture.ModuleApiculture
import forestry.core.ModuleCore
import forestry.core.fluids.Fluids
import net.minecraft.init.Blocks
import net.minecraft.init.Items
import net.minecraft.item.ItemStack
import net.minecraftforge.fluids.FluidRegistry
import net.minecraftforge.fluids.FluidStack

object RecipesCarpenter {

    fun registerRecipes() {
        //frames
        RecipeManagers.carpenterManager.addRecipe(50, Fluids.FOR_HONEY.getFluid(1000), ItemStack.EMPTY, ItemStack(MBItems.frameSweet),
                "SSS", "SFS", "SSS",
                'F', ModuleApiculture.getItems().frameUntreated,
                'S', Items.STICK)

        RecipeManagers.carpenterManager.addRecipe(100, Fluids.ICE.getFluid(1000), ItemStack.EMPTY, ItemStack(MBItems.frameCooled),
                "SCS", "CFC", "SCS",
                'F', ModuleApiculture.getItems().frameImpregnated,
                'S', Items.STICK,
                'C', "ingotCopper")

        RecipeManagers.carpenterManager.addRecipe(100, Fluids.SHORT_MEAD.getFluid(1000), ItemStack.EMPTY, ItemStack(MBItems.frameMutating),
                "RSR", "SFS", "RSR",
                'F', ModuleApiculture.getItems().frameImpregnated,
                'S', Blocks.SOUL_SAND,
                'R', ModuleApiculture.getItems().royalJelly)

        //grains
        //crystal
        RecipeManagers.carpenterManager.addRecipe(20, FluidStack(FluidRegistry.WATER, 500), ItemStack.EMPTY, ItemStack(Items.QUARTZ),
                " G ", "G G", " G ",
                'G', MBItems.GrainsCrystal)
        RecipeManagers.carpenterManager.addRecipe(20, FluidStack(FluidRegistry.WATER, 500), ItemStack.EMPTY, ItemStack(Items.REDSTONE),
                "G G", "   ", "G G",
                'G', MBItems.GrainsCrystal)
        RecipeManagers.carpenterManager.addRecipe(60, FluidStack(FluidRegistry.WATER, 1000), ItemStack.EMPTY, ItemStack(MBItems.EmeraldFrag),
                "G G", "GGG", "G G",
                'G', MBItems.GrainsCrystal)

        RecipeManagers.carpenterManager.addRecipe(40, FluidStack(FluidRegistry.WATER, 1000), ItemStack.EMPTY, ItemStack(ModuleCore.getItems().apatite),
                "G G", " G ", "G G",
                'G', MBItems.GrainsCrystal)



        //metal
        RecipeManagers.carpenterManager.addRecipe(25, FluidStack(FluidRegistry.WATER, 500), ItemStack.EMPTY, OreDictUtil.getOreStack("dustIron"),
                " G ", "G G", "   ",
                'G', MBItems.GrainsMetallic)
        RecipeManagers.carpenterManager.addRecipe(25, FluidStack(FluidRegistry.WATER, 500), ItemStack.EMPTY, OreDictUtil.getOreStack("dustCopper"),
                "   ", "G G", " G ",
                'G', MBItems.GrainsMetallic)
        RecipeManagers.carpenterManager.addRecipe(30, FluidStack(FluidRegistry.WATER, 500), ItemStack.EMPTY, OreDictUtil.getOreStack("dustTin"),
                " G ", "G G", " G ",
                'G', MBItems.GrainsMetallic)
        RecipeManagers.carpenterManager.addRecipe(40, FluidStack(FluidRegistry.WATER, 1000), ItemStack.EMPTY, OreDictUtil.getOreStack("dustGold"),
                "G G", "GGG", "G G",
                'G', MBItems.GrainsMetallic)
        if (MBItems.MBISilver) {
            RecipeManagers.carpenterManager.addRecipe(35, FluidStack(FluidRegistry.WATER, 1000), ItemStack.EMPTY, OreDictUtil.getOreStack("dustSilver"),
                    "G G", " G ", "G G",
                    'G', MBItems.GrainsMetallic)
        }
        if (MBItems.MBILead) {
            RecipeManagers.carpenterManager.addRecipe(30, FluidStack(FluidRegistry.WATER, 750), ItemStack.EMPTY, OreDictUtil.getOreStack("dustLead"),
                    " G ", "GGG", " G ",
                    'G', MBItems.GrainsMetallic)
        }
        if (MBItems.MBIAluminium) {
            RecipeManagers.carpenterManager.addRecipe(30, FluidStack(FluidRegistry.WATER, 750), ItemStack.EMPTY, OreDictUtil.getOreStack("dustAluminum"),
                    "G G", "   ", "G G",
                    'G', MBItems.GrainsMetallic)
        }
        if (!OreDictUtil.getOreStack("dustOsmium").isEmpty) {
            RecipeManagers.carpenterManager.addRecipe(30, FluidStack(FluidRegistry.WATER, 750), ItemStack.EMPTY, OreDictUtil.getOreStack("dustOsmium"),
                    "GGG", "   ", "G G",
                    'G', MBItems.GrainsMetallic)
        }

        if (MBItems.MBINickel) {
            RecipeManagers.carpenterManager.addRecipe(30, FluidStack(FluidRegistry.WATER, 750), ItemStack.EMPTY, OreDictUtil.getOreStack("dustNickel"),
                    "G G", "G G", "G G",
                    'G', MBItems.GrainsMetallic)
        }

        RecipeManagers.carpenterManager.addRecipe(40, FluidStack(FluidRegistry.WATER, 1000), ItemStack.EMPTY, OreDictUtil.getOreStack("dustGold"),
                "G G", "GGG", "G G",
                'G', MBItems.GrainsMetallic)


        //fragments
        RecipeManagers.carpenterManager.addRecipe(600, FluidStack(FluidRegistry.LAVA, 4000), ItemStack.EMPTY, ItemStack(Items.NETHER_STAR),
                "FF", "FF",
                'F', MBItems.NetherFrag)

        if (MBItems.MBISpectrite) {
            RecipeManagers.carpenterManager.addRecipe(1000, FluidStack(FluidRegistry.LAVA, 24000), ItemStack.EMPTY, OreDictUtil.getOreStack("gemSpectrite"),
                    "FFF", "FFF", "FFF",
                    'F', MBItems.SpectriteFrag)

            RecipeManagers.carpenterManager.addRecipe(80, FluidStack(FluidRegistry.LAVA, 4000), ItemStack.EMPTY, ItemStack(MBItems.SpectriteFrag),
                    "G G", " G ", "G G",
                    'G', MBItems.GrainsSpectrite)
        }
    }
}