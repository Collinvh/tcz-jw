package com.tacz.guns.data.client;


import com.tacz.guns.init.ModItems;
import com.tacz.guns.GunMod;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput packOutput, ExistingFileHelper existingFileHelper) {
        super(packOutput, GunMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent("thatch_wall", modLoc("item/thatch_wall_inventory"));
        withExistingParent("wooden_wall", modLoc("item/wooden_wall_inventory"));
        withExistingParent("stone_wall", modLoc("item/stone_wall_inventory"));
        withExistingParent("metal_wall", modLoc("item/metal_wall_inventory"));
        withExistingParent("armored_wall", modLoc("item/armored_wall_inventory"));

        withExistingParent("thatch_wall_floor", modLoc("item/thatch_wall_floor_inventory"));
        withExistingParent("wooden_wall_floor", modLoc("item/wooden_wall_floor_inventory"));
        withExistingParent("stone_wall_floor", modLoc("item/stone_wall_floor_inventory"));
        withExistingParent("metal_wall_floor", modLoc("item/metal_wall_floor_inventory"));
        withExistingParent("armored_wall_floor", modLoc("item/armored_wall_floor_inventory"));

        withExistingParent("loot_crate", modLoc("block/loot_crate"));
        withExistingParent("metal_wall_window", modLoc("block/metal_wall_window"));

        withExistingParent("thatch_wall_window_frame", modLoc("item/thatch_wall_window_frame_inventory"));
        withExistingParent("wooden_wall_window_frame", modLoc("item/wooden_wall_window_frame_inventory"));
        withExistingParent("stone_wall_window_frame", modLoc("item/stone_wall_window_frame_inventory"));
        withExistingParent("metal_wall_window_frame", modLoc("item/metal_wall_window_frame_inventory"));
        withExistingParent("armored_wall_window_frame", modLoc("item/armored_wall_window_frame_inventory"));

        withExistingParent("thatch_wall_door_frame", modLoc("item/thatch_wall_door_frame_inventory"));
        withExistingParent("wooden_wall_door_frame", modLoc("item/wooden_wall_door_frame_inventory"));
        withExistingParent("stone_wall_door_frame", modLoc("item/stone_wall_door_frame_inventory"));
        withExistingParent("metal_wall_door_frame", modLoc("item/metal_wall_door_frame_inventory"));
        withExistingParent("armored_wall_door_frame", modLoc("item/armored_wall_door_frame_inventory"));

        withExistingParent("thatch_wall_hatch", modLoc("item/thatch_wall_hatch_inventory"));
        withExistingParent("wooden_wall_hatch", modLoc("item/wooden_wall_hatch_inventory"));
        withExistingParent("stone_wall_hatch", modLoc("item/stone_wall_hatch_inventory"));
        withExistingParent("metal_wall_hatch", modLoc("item/metal_wall_hatch_inventory"));
        withExistingParent("armored_wall_hatch", modLoc("item/armored_wall_hatch_inventory"));

        withExistingParent("thatch_wall_pillar_2", modLoc("item/thatch_wall_pillar_inventory"));
        withExistingParent("thatch_wall_pillar_3", modLoc("item/thatch_wall_pillar_inventory"));
        withExistingParent("thatch_wall_pillar_4", modLoc("item/thatch_wall_pillar_inventory"));
        withExistingParent("thatch_wall_pillar_5", modLoc("item/thatch_wall_pillar_inventory"));


        simpleItem(ModItems.STRAW_SCRAP);
        simpleItem(ModItems.WOOD_SCRAP);
        simpleItem(ModItems.STONE_SCRAP);
        simpleItem(ModItems.METAL_SCRAP);
        simpleItem(ModItems.ARMORED_SCRAP);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(), new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation(GunMod.MOD_ID, "item/" + item.getId().getPath()));
    }
}