package com.tacz.guns;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// An example config class. This is not required, but it's a good idea to have one to keep your config organized.
// Demonstrates how to use Forge's config APIs
@Mod.EventBusSubscriber(modid = GunMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config
{
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    private static final ForgeConfigSpec.IntValue MATERIAL_PER_BLOCK = BUILDER
            .comment("Amount of material to build or upgrade a tile per block; total material = number of block x this value (default 2)")
            .defineInRange("materialPerBlock", 2, 1, 7);

//    private static final ForgeConfigSpec.IntValue THATCH_RESISTANCE = BUILDER
//            .comment("The resistance of thatch blocks default(2)")
//            .defineInRange("thatchResistance", 2, 1, Integer.MAX_VALUE);
//
//    private static final ForgeConfigSpec.IntValue WOODEN_RESISTANCE = BUILDER
//            .comment("The resistance of wooden blocks default(5)")
//            .defineInRange("woodenResistance", 5, 1, Integer.MAX_VALUE);
//
//    private static final ForgeConfigSpec.IntValue STONE_RESISTANCE = BUILDER
//            .comment("The resistance of stone blocks default(6)")
//            .defineInRange("stoneResistance", 6, 1, Integer.MAX_VALUE);
//
//    private static final ForgeConfigSpec.IntValue METAL_RESISTANCE = BUILDER
//            .comment("The resistance of metal blocks default(9)")
//            .defineInRange("metalResistance", 9, 1, Integer.MAX_VALUE);
//
//    private static final ForgeConfigSpec.IntValue ARMORED_RESISTANCE = BUILDER
//            .comment("The resistance of armored blocks default(12)")
//            .defineInRange("armoredResistance", 12, 1, Integer.MAX_VALUE);

//    private static final ForgeConfigSpec.BooleanValue LOG_DIRT_BLOCK = BUILDER
//            .comment("Whether to log the dirt block on common setup")
//            .define("logDirtBlock", true);
//
//    private static final ForgeConfigSpec.IntValue MAGIC_NUMBER = BUILDER
//            .comment("A magic number")
//            .defineInRange("magicNumber", 42, 0, Integer.MAX_VALUE);
//
//    public static final ForgeConfigSpec.ConfigValue<String> MAGIC_NUMBER_INTRODUCTION = BUILDER
//            .comment("What you want the introduction message to be for the magic number")
//            .define("magicNumberIntroduction", "The magic number is... ");
//
//    // a list of strings that are treated as resource locations for items
//    private static final ForgeConfigSpec.ConfigValue<List<? extends String>> ITEM_STRINGS = BUILDER
//            .comment("A list of items to log on common setup.")
//            .defineListAllowEmpty("items", List.of("minecraft:iron_ingot"), Config::validateItemName);

    static final ForgeConfigSpec SPEC = BUILDER.build();

    public static int materialPerBlock;

    public static int thatchResistance = 2;
    public static int woodenResistance = 5;
    public static int stoneResistance = 6;
    public static int metalResistance = 9;
    public static int armoredResistance = 12;

    public static int thatchFlammability;
    public static int thatchFireSpread;

    public static int woodenFlammability;
    public static int woodenFireSpread;



//    public static boolean logDirtBlock;
//    public static int magicNumber;
//    public static String magicNumberIntroduction;
//    public static Set<Item> items;
//
//    private static boolean validateItemName(final Object obj)
//    {
//        return obj instanceof final String itemName && ForgeRegistries.ITEMS.containsKey(new ResourceLocation(itemName));
//    }

}
