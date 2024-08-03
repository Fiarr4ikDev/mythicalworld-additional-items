package ru.fiarr4ik.mythicalworld.init.items;

import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ru.fiarr4ik.mythicalworld.Mythicalworld;

    public class ItemInit {

        public static final DeferredRegister<Item> ITEMS =
                DeferredRegister.create(ForgeRegistries.ITEMS, Mythicalworld.MOD_ID);

        public static final RegistryObject<Item> CONDENSATER_MK1_CORE = ITEMS.register("condensater_mk1_core",
                () -> new Item(new Item.Properties()
                        .rarity(Rarity.EPIC)));
    }
